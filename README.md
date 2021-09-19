# Instructions to run the application

* Run the application with maven
    * Open a terminal
    * Execute: ./mvnw spring-boot:run
    * Note: Be sure to have JAVA_HOME configured (Java 11)

* Run the application in a docker container
    * Create the image: docker build -t rock-paper-scissors .
    * Run the container: docker run -dp 8080:8080 rock-paper-scissors
   
# Application views
* Game view: http://localhost:8080
* Stats view: http://localhost:8080/stats.html
