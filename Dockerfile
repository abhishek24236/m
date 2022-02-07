FROM openjdk:8
COPY . .
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8081

