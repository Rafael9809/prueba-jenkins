FROM amazoncorretto:17-alpine3.17-jdk
RUN sudo apk add --no-cache tzdata
ENV TZ=America/Mexico_City
RUN mkdir /app
VOLUME /app
COPY target/lbdemo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]