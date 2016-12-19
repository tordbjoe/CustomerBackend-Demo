#CustomerBackEnd

This repository is to be used in conjunction with the CustomerFrontEnd ( https://github.com/tordbjoe/CustomerFrontEnd ) repository, which is an angular 2 demo application.
The demo application uses this repository as its backend.

This uses:

* Spring boot
* Spring Data REST

##Installation

`mvn clean install`

##How to run

Use the Spring Boot maven pluign : `mvn spring-boot:run`

OR

Use the accompanied Dockerfile:

`docker build -f Dockerfile -t customerbackend .`

`docker run -p 8080:8080 customerbackend`
