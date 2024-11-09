FROM amazoncorretto:17-alpine-jdk

MAINTAINER AlainM

COPY target/mutants-0.0.1-SNAPSHOT.jar mutants-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/mutants-0.0.1-SNAPSHOT.jar"]
