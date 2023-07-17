FROM openjdk:17
EXPOSE 8080
ADD target/spring-mysql-docker.jar spring-mysql-docker.jar
ENTRYPOINT ["java","-jar","/spring-mysql-docker.jar"]