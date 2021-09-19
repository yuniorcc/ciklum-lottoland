FROM openjdk:11
COPY . /usr/app/rock-paper-scissors
WORKDIR /usr/app/rock-paper-scissors
EXPOSE 8080
RUN ./mvnw clean package
CMD [ "java", "-jar", "target/lottoland-0.0.1-SNAPSHOT.jar" ]
