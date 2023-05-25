# Utiliza la imagen oficial de Tomcat de Docker Hub
FROM tomcat:9-jdk11-openjdk-slim

# Autor
MAINTAINER Yian Vera Soto "yian.vera@alumnos.uv.cl"

# Cambia el puerto por defecto de Tomcat de 8080 a 80
ENV TOMCAT_HTTP_PORT 80

# Elimina las aplicaciones de ejemplo y el directorio ROOT existente
RUN rm -rf /usr/local/tomcat/webapps/examples && \
    rm -rf /usr/local/tomcat/webapps/ROOT

# Añade tu aplicación (archivo WAR) al directorio webapps de Tomcat
# Reemplaza "tu-app.war" con el nombre de tu archivo WAR
COPY GCAR/dist/GCAR.war /usr/local/tomcat/webapps/

# Modificamos el archivo server.xml para cambiar el puerto
RUN sed -i 's/port="8080"/port="80"/g' /usr/local/tomcat/conf/server.xml

# Expone el puerto 80
EXPOSE 80

# Ejecuta Tomcat en el puerto 80
CMD ["catalina.sh", "run"]
