# GCAR
GCAR es una aplicacion web para la gestion de consultas en ÁLGEBRA RELACIONAL y SQL destinada a los estudiantes de Bases de Datos de la carrera de Ing. Civil en Informática de la Universidad de Valparaíso

# Instalación
De momento para instalar la aplicacion de manera local solo ejecuto:
- En consola desde la carpeta que contiene el Dockerfile, dockercompose.yml y la carptea gcar que contiene la aplicion:
  
  `docker-compose build` y `docker-compose up`
- Despues se carga la Base de datos desde
- Tambien ejecute lo siguiente para crear una imagen y cargarla en el docker hub:  
  `docker push suvin1/gcar_app`
  
### Cargar datos desde Adminer
- Conectarse al software Adminer, interface gráfica: http://localhost:9080.
- Ingresar con las credenciales:
    - Motor de BD: PostgreSQL
    - Servidor: postgres
    - Usuario: gcar
    - Password: admin
    - Base de Datos: gcar
- importar y ejecutar contenidos de `AR.sql` que se encuentra en la carpeta GCAR.  

### Ingresar a aplicación GCAR
- Ingresar a http://localhost:8080/GCAR
- Ingresar usuario `18851998` y contraseña `12345678`.
  
  
# Repositorios
- Este es el link del dockerHub de la imagen: 
  'https://hub.docker.com/r/suvin1/gcar_app/tags'
- Link del repositorio de todos los archivos en github:
  'https://github.com/ysuvin/GCAR.git'

# Para ejecutar una Query
### Cargar Base de Datos:
  - En el Menú Gestionar BD seleccionar Cargar BD
  - Seleccionar botón de selección de la BD `control2` (Botón con icono de CHECK)
  - En ventana Cargar Base de Datos seleccionar Cargar
  
### Realizar Consulta SQL
  - En el Menú Consultas seleccionar Hacer Consulta SQL
  - Ingresar query `SELECT * FROM trabajador;` en barra de consultas
  - Seleccionar botón Ejecutar 


