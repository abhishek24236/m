FROM openjdk:8
COPY target/course-0.0.1-SNAPSHOT.jar course-0.0.1-SNAPSHOT.jar
CMD java -jar course-0.0.1-SNAPSHOT.jar
EXPOSE 8081

