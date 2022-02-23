# Base Alpine Linux based image with OpenJDK JRE only
FROM maven:3.6.0-jdk-11-slim

COPY conf/ /conf/
COPY src/ /src/
COPY pom.xml /pom.xml

RUN mvn -f /pom.xml clean package
EXPOSE ${PORT}

ENTRYPOINT ["java", "-jar", "/target/calc-api-1.0.0.jar"]
