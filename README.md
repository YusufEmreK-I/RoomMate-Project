# RoomMate-Project

An early snapshot of the RoomMate backend: a Quarkus REST service whose code so far covers user management (user model, DAO/JPA layer, REST resource and service).

## Tech stack

- Java 21
- Quarkus 3.28.4 (REST, Jackson, ArC, SmallRye OpenAPI)
- Hibernate ORM with PostgreSQL
- Maven (with Maven wrapper)

## How to run

From Projects/roommate-server:

- Dev mode: ./mvnw quarkus:dev
- Build: ./mvnw package
- Run: java -jar target/quarkus-app/quarkus-run.jar

Dev mode expects a local PostgreSQL database named roommate (see src/main/resources/application.properties).
