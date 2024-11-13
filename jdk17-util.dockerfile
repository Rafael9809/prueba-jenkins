FROM eclipse-temurin:17-jdk
ENV TZ=America/Mexico_City
RUN mkdir /app
VOLUME /app
COPY target/lbdemo-0.0.1-SNAPSHOT.jar app.jar
COPY ./application.yml /app/application.yml
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]