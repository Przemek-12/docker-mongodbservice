FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -DskipTests

FROM openjdk:11
COPY --from=build /home/app/target/docker-mongodbservice-0.0.1-SNAPSHOT.jar service-1.0.0.jar
EXPOSE 1081
ENTRYPOINT ["java","-jar","/service-1.0.0.jar"]