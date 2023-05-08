# Use the official OpenJDK 11 image as the base image
FROM openjdk:11-jdk-slim
 # Set the working directory inside the container
WORKDIR /app
 # Copy the Spring Boot application JAR file from the host machine to the container
COPY target/aidemo-1.0-SNAPSHOT.jar aidemo-1.0-SNAPSHOT.jar
 # Expose the port used by the Spring Boot application
EXPOSE 8080
 # Set the command to run when the container starts
CMD ["java", "-jar", "aidemo-1.0-SNAPSHOT.jar"]