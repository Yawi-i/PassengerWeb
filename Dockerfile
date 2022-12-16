FROM openjdk:19
COPY target/ /tmp
WORKDIR /tmp
CMD java -jar Passenger-0.0.1-SNAPSHOT.jar