From java:8


WORKDIR /son

ADD target/son-0.0.1-SNAPSHOT.jar /son

EXPOSE 10100
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "son-0.0.1-SNAPSHOT.jar"]