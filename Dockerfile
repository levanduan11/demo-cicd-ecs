# Stage 1: Build the application
FROM gradle:8.4-jdk21 AS build

# Set the working directory
WORKDIR /home/gradle/project

# Copy the Gradle wrapper and the build files
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Copy the source code
COPY src src

# Make the Gradle wrapper executable and build the application
RUN chmod +x gradlew
RUN ./gradlew build -x test --no-daemon

# Stage 2: Run the application
FROM openjdk:21-slim

# Expose the application port
EXPOSE 8080

# Create app directory
RUN mkdir /app

# Copy the jar file from the build stage
COPY --from=build /home/gradle/project/build/libs/*.jar /app/app.jar

# Set entrypoint to run the jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
