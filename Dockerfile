FROM tomcat:9-jdk8

MAINTAINER Yian Vera Soto "yian.vera@alumnos.uv.cl"

COPY GCAR/dist/GCAR.war /usr/local/tomcat/webapps/
# Repositorio git de la aplicacion
# https://github.com/ysuvin/GCAR.git

# Este es el link del dockerHub de la imagen
# https://hub.docker.com/r/suvin1/gcar_app

EXPOSE 8080