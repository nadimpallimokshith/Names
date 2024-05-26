FROM tomcat:9.0
COPY target/names.war /usr/local/tomcat/webapps/names.war
EXPOSE 8080
