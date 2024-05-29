# Use an official Tomcat image as a parent image
FROM tomcat:9.0

# Set the working directory inside the container
WORKDIR /usr/local/tomcat

# Copy the Maven build output WAR file to the Tomcat webapps directory
COPY Names.war /usr/local/tomcat/webapps/

# Expose port 8080 for the Tomcat server
EXPOSE 8080

# Set the default command to run Tomcat
CMD ["catalina.sh", "run"]
