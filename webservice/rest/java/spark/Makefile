#
# Makefile adhering to the 3 Musketeers build pattern
# https://3musketeers.io/
#
.DEFAULT_GOAL := help

SHELL  := /bin/bash

RED    := $(shell tput -Txterm setaf 1)
GREEN  := $(shell tput -Txterm setaf 2)
YELLOW := $(shell tput -Txterm setaf 3)
CYAN   := $(shell tput -Txterm setaf 6)
WHITE  := $(shell tput -Txterm setaf 7)
RESET  := $(shell tput -Txterm sgr0)

COMPOSE_RUN_MAVEN := docker-compose run --rm maven
COMPOSE_UP_MAVEN  := docker-compose up --rm maven

.PHONY: shell build test package deploy clean help

## Interactive shell in the work image
shell:
	$(COMPOSE_RUN_MAVEN) bash

## Build the source
build:
	$(COMPOSE_RUN_MAVEN) mvn compile

## Execute the unit tests
test:
	$(COMPOSE_RUN_MAVEN) mvn test

## Package the application into a JAR file
package:
	$(COMPOSE_RUN_MAVEN) mvn package

# Serve up the microservice locally
# serve:
# 	$(COMPOSE_UP_MAVEN) # where is the jar
# 	# execute jar
# 	# curl endpoint

## Build the docker container, execute integration tests, and verify
verify:
	$(COMPOSE_RUN_MAVEN) mvn verify

## Deploy the Docker image to a container repository
deploy:
	$(COMPOSE_RUN_MAVEN) mvn deploy

## Remove build artefacts
clean:
	$(COMPOSE_RUN_MAVEN) mvn clean

TARGET_MAX_CHAR_NUM := 10
.PHONY: help
## Show help
help:
	@echo '${CYAN}Usage:${RESET}'
	@echo ' ${YELLOW}make${RESET} ${GREEN}[target]${RESET}'
	@echo '${CYAN}Targets:${RESET}'
	@awk '/(^###)|^[a-zA-Z]+:/ { \
		targetGroup = match($$1, /^###/); \
		if (targetGroup) { \
			targetGroupText = substr($$0, 5, length($$0)); \
			printf "${WHITE}%s${RESET}\n", targetGroupText; \
		} \
		targetHelp = match(previousLine, /^## (.*)/); \
		if (targetHelp) { \
			target = substr($$1, 0, index($$1, ":")-1); \
			targetHelpText = substr(previousLine, RSTART + 3, RLENGTH); \
			printf " ${YELLOW}%-$(TARGET_MAX_CHAR_NUM)s${RESET} \
${GREEN}%s${RESET}\n", target, targetHelpText; \
		} \
	} { previousLine = $$0 }' $(MAKEFILE_LIST)
