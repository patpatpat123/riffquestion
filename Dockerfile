FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/riffquestion-1.1.1-SNAPSHOT.jar app.jar

ENTRYPOINT exec java -jar app.jar
