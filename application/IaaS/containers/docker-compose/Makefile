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

HOST_PORT               ?= 3000

COMPOSE_RUN_COLOR_APP   := docker-compose run --rm color-app
COMPOSE_UP_COLOR_APP    := HOST_PORT=${HOST_PORT} docker-compose up --detach --wait color-app
COMPOSE_DOWN_COLOR_APP  := docker-compose down color-app
OPEN_APP_URL            := open http://localhost:${HOST_PORT}

.PHONY: shell start stop help

## Interactive shell in the work image
shell:
	$(COMPOSE_RUN_COLOR_APP) sh

## Start serving the app
start:
	$(COMPOSE_UP_COLOR_APP)
	$(OPEN_APP_URL)

## Stop serving the app
stop:
	$(COMPOSE_DOWN_COLOR_APP)


TARGET_MAX_CHAR_NUM := 6
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
