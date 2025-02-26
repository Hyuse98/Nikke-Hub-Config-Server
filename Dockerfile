FROM eclipse-temurin:17.0.14_7-jre-jammy

WORKDIR /app

COPY build/libs/Nikke-Hub-Config-Server-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "/app/app.jar"]