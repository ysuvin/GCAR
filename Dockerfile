FROM tomcat:9-jdk8

MAINTAINER Yian Vera Soto "yian.vera@alumnos.uv.cl"

COPY GCAR/dist/GCAR.war /usr/local/tomcat/webapps/
# Repositorio git de la aplicacion
# https://github.com/ysuvin/GCAR.git
EXPOSE 8080