FROM openjdk:8
ADD build/libs/auth-0.0.1-SNAPSHOT.jar auth-0.0.1-SNAPSHOT.jar
EXPOSE 8484
ENTRYPOINT ["java","-jar","auth-0.0.1-SNAPSHOT.jar"]