FROM maven:3.9.6-eclipse-temurin-21 AS build




WORKDIR /app
COPY . /app/

RUN mvn clean install


FROM openjdk:21-jdk

COPY --from=build /app/target/app.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]