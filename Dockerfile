FROM openjdk:11
EXPOSE 8080
ADD target/Names.jar Names.jar
ENTRYPOINT ["java","-jar","/Names.jar"]