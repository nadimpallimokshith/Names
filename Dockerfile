FROM openjdk:11
EXPOSE 8080
ADD target\names.war names.war
ENTRYPOINT ["java","-war","/names.war"]