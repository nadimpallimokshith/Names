FROM openjdk:11
EXPOSE 8080
ADD target/Names.war Names.war
ENTRYPOINT ["java","-jar","/Names.war"]