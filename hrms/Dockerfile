# Use adoptopenjdk for the JRE
FROM eclipse-temurin:21-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage to the container
COPY /target/*.jar app.jar

# Specify the command to run on container start
CMD ["java", "-jar", "app.jar"]

# Tag and push the image to Docker Hub
#RUN docker tag my-spring-boot-app mynkgupta22/utoora:latest && docker push mynkgupta22/utoora:latest