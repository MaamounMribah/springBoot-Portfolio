FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar Protfolio-0.0.1-SNAPSHOT
ENTRYPOINT ["java","-jar","/Protfolio-0.0.1-SNAPSHOT"]
EXPOSE 8080