# takuru

Project takuru

Geo Located Issues

## Requirements

- JDK >= 8
- Maven >= 3
- Postgresql (tested with 10.5, could work with other versions)

## Installation

An existent Postgres schema with credentials is required, default values used by this application could be found in:

```properties
src/main/resources/application/properties
```

## Migrations

For DB migration [flyway](https://flywaydb.org/) is used. Assuming the default credentials are used for database, the migrations should be done with.

```bash
mvn flyway:migrate -Dflyway.url=jdbc:postgresql://localhost:5432/takuru -Dflyway.user=takuru -Dflyway.password=takuru
```

For more advanced uses please refer to [flyway documentation page](https://flywaydb.org/documentation/).

## Development

This project depends on [maven](https://maven.apache.org/) for the project's life-cycle (compilation, tests, packaging) in order to run this application run

1. For a clean compilation:

```bash
mvn clean package
```

2. Running the app: This application is based on spring-boot

```bash
mvn spring-boot:run
```

The embbeded tomcat should start listening connections on tcp/8080.
