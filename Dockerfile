FROM java:8
VOLUME /tmp
ADD target/mdh-driftavbrott-rest-0.0.1-SNAPSHOT.jar driftavbrott-rest.jar
EXPOSE 8080
RUN bash -c 'touch /driftavbrott-rest.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/test", "-Djava.security.egd=file:/dev/./urandom","-jar","/driftavbrott-rest.jar"]

