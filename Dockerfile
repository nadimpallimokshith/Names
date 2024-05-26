FROM tomcat:9.0
COPY target/Names.war /usr/local/tomcat/webapps/Names.war
EXPOSE 8080
