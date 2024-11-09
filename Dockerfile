FROM openjdk:17-jdk-slim
MAINTAINER AlainM
COPY target/mutants-0.0.1-SNAPSHOT.jar mutants-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} mutants.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/mutants.jar"]
