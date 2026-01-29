FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY ../../Users/Henrique/Downloads/barcode-reader/pom.xml .
COPY ../../Users/Henrique/Downloads/barcode-reader/src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=build /app/target/barcode-reader-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
