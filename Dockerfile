FROM openjdk:8u111-jdk-alpine
VOLUME /tmp
ADD /target/eBizDemo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Xmx128M","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]