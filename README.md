## Dropwizard Java Example

[![Build](https://github.com/jecklgamis/dropwizard-java-example/actions/workflows/build.yml/badge.svg)](https://github.com/jecklgamis/dropwizard-java-example/actions/workflows/build.yml)

Docker: `docker run -p 8080:8080 -it jecklgamis/dropwizard-java-example:main`

This is an example Dropwizard app using Java. 

## Running The App 
Ensure you have Java 11 or later.
```
mvn clean package
java -jar target/dropwizard-java-example.jar
```

## Running The App Using Docker
Ensure you have a working Docker environment.
```
make dist image run
```

## Testing The Endpoints
Point your browser to `http://localhost:8080` or use `curl` in command line.

```
curl -v  http://localhost:8080/
curl -v -k https://localhost:8443/
```
Operational menu endpoint:
* `http://localhost:8081`


