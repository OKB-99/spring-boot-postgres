# spring-boot-postgres

Spring Boot Start Kit with PostgreSQL.<br>
This project demonstrates the basic functions of Spring Boot, e.g. RestApi, JPA, connecting to a public PostgreSQL database([RNACentral](https://rnacentral.org/)).<br>
So you do NOT need to create a new database to launch the application.

## How to start
- Clone this project<br>
`$git clone https://github.com/OKB-99/spring-boot-postgres`
- Go to the project root<br>
`$cd spring-boot-postgres`
- Launch Spring Boot<br>
`$./gradlew bootRun`

Now you can throw a http request from the command line or the browser.<br>
`$curl localhost:8080`

## Technical information
- Java 11
- Spring Boot 2.4.4
- gradle 6.8.3
- This project includes also lombok (v 5.1.0) but it's optional.

## Project structure
- Root
  - `README.md` [This file]
  - `LICENSE` [Info about Apache License v 2.0]
  - `src` [Java sources for Spring Boot application]
  - `gradle` [Container of a specific version's gradle used in build]
  - `gradlew` [Executable file]
  - `build.grade` [Build configuration file]
  - `src/main/java/resouces/application.properties`<br>
  [Properties file (The data source definition of Postgres must be here!)]
