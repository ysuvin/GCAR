FROM tomcat:9-jdk8

MAINTAINER Yian Vera Soto "yian.vera@alumnos.uv.cl"

# Copiamos la aplicación WAR al directorio webapps
COPY GCAR/dist/GCAR.war /usr/local/tomcat/webapps/

# Modificamos el archivo server.xml para cambiar el puerto
RUN sed -i 's/port="8080"/port="8081"/g' /usr/local/tomcat/conf/server.xml

# Exponemos el puerto 8081
EXPOSE 8081

# Comando por defecto de Tomcat
CMD ["catalina.sh", "run"]