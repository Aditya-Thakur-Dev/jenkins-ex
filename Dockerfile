FROM openjdk:8
ADD target/movie-info-docker.jar movie-info-docker.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "movie-info-docker.jar"]