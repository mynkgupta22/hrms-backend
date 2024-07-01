# Use the official Maven image to create a build artifact
FROM Maven:3.9.8-eclipse-temurin-21 AS build

# Set the working directory
WORKDIR /app

# Copy the Maven project descriptor and POM file
COPY pom.xml .

# Fetch all required dependencies for the build
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Build the application
RUN mvn package -DskipTests

# Use adoptopenjdk for the JRE
FROM eclipse-temurin:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage to the container
COPY --from=build /app/target/*.jar app.jar

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]

# Tag and push the image to Docker Hub
RUN docker tag my-spring-boot-app mynkgupta22/utoora:latest && docker push mynkgupta22/utoora:latest
