FROM openjdk:8
COPY . .
CMD ["java", "-jar", "course-0.0.1-SNAPSHOT.jar"]
EXPOSE 8081

