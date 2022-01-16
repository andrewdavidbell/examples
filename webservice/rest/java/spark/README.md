# Example Java microservice using the Spark framework

An example usage of the [Spark](http://sparkjava.com/) framework to expose a
REST HTTP webservice.

## Build environment
The [3 Musketeers](https://3musketeers.io/) build pattern has been chosen to
provide a tool agnostic and constent user interface (locally or via CI/CD).
The underlying tool chosen to build the Java example was Maven, which also
packages the microservice into a Docker container using the Fabric8 Docker
Maven plugin.

-> Make (host) -> Compose (host) -> Maven (container)

### Maven default lifecycle
Just the phases of interest are listed:
* compile
* test
  * junit tests
* package
  * create jar
* pre-integration-test
  * build image
  * launch docker container
    * wait until healthy 
* integration-test
* post-integration-test
  * stop
* install
* deploy
  * deploy jar to .m2 repository
  * deploy docker container to repository

## IDE
A Visual Studio Code development container has been provided to enable a host
independent development environment. Thus, no development dependencies are
requried to be installed if this container is used, except for a Docker server.
