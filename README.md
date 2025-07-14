# FixYa

Aplicación de escritorio para la gestión integral de talleres mecánicos.

## Características principales
- **Autenticación de usuarios**.
- **Gestión de clientes**.
- **Gestión de vehículos**.
- **Gestión de órdenes de trabajo**.

## Requisitos
- Java Development Kit (JDK) 24.
- Maven 3.9 o superior.
- Servidor PostgreSQL en funcionamiento. (Ver archivo ConexionDB en `src/main/java/DB/`

## Configuración de la base de datos
La conexión a la base de datos se define en `src/main/java/DB/ConexionDB.java`.  Ajuste la URL, el usuario y la contraseña para que coincidan con su instalación de PostgreSQL.

## Compilación
Ejecute desde la raíz del proyecto:

```bash
mvn package
```

Esto descargará las dependencias y generará el archivo JAR.

## Ejecución
Para iniciar la aplicación desde Maven:

```bash
mvn exec:java -Dexec.mainClass="com.mycompany.fixya.InicioSesionFrame"
```

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulte el archivo `LICENSE` para más detalles.

## Autores
Gervasio Abente, Esteban Pardo y Luana Sanchez.

## Contribuciones
Las sugerencias y mejoras son bienvenidas. Puede crear un _fork_ del repositorio y proponer un _pull request_ con los cambios.
