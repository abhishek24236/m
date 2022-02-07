FROM openjdk:8
COPY . .
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]
EXPOSE 8081

