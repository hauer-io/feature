# Feature

This project was generated with [Spring CLI](https://start.spring.io)

## Wrapper
Instead of an installed version of gradle, you can use `./gradlew` or `./gradlew.bat`.

## Build
Run `gradle build` to build the project.

## Start app
Run `gradle bootRun` to start the app in local environment. 

## Running unit tests
Run `gradle test` to execute the unit tests.

## Running all checks
Run `gradle check` to execute all checks

## Docker Build
Run `gradle bootBuildImage` to create a docker image

## Enable specific feature
With the environment variable `FEATURE_NAME=true` we can enable an experimental endpoint. See
[externalized configuration](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config) for details.

Notice the two specs for experimental and productive behaviour.