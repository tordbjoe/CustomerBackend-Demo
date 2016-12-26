from java:8
VOLUME /tmp
ADD target/customerbackend-0.0.1-SNAPSHOT.jar customerbackend.jar
RUN sh -c 'touch customerbackend.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /customerbackend.jar" ]
EXPOSE 8080
