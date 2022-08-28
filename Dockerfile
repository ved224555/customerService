FROM openjdk:17
LABEL maintainer="Ved Prakash"
ADD target/Customer-0.0.1-SNAPSHOT.jar customer-service.jar
ENTRYPOINT ["java", "-jar", "customer-service.jar"]