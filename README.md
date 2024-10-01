Proyecto ECOM - Entrega Inicial del Curso de Programación con Java de CODERHOUSE

Este repositorio contiene la primera entrega del curso de programación con Java, donde se ha desarrollado una aplicación básica utilizando Spring Boot y varias dependencias clave, como Spring Web, H2 Database, Lombok, Spring JPA, y Spring Boot DevTools.

Estructura y Funcionalidad:

La aplicación está organizada en paquetes que incluyen las capas de modelo, repositorio, servicio y controlador. En esta fase, se han implementado entidades básicas como Cliente y Domicilio, junto con una demostración de persistencia en la base de datos en memoria H2.

En la clase principal EcomApplication, se ha implementado CommandLineRunner para ejecutar un método run() al inicio de la aplicación. Como demostración inicial de persistencia, se realiza lo siguiente:
Se crea un objeto de tipo Domicilio.
Se crea un objeto Cliente y se asocia al domicilio creado.
El cliente se persiste en la base de datos.
Finalmente, se imprime la información del cliente en la consola.

Configuración:

La conexión a la base de datos y otros ajustes se realizan en el archivo application.properties.

Próximos Pasos:

Este primer paso muestra los conocimientos adquiridos hasta ahora. En futuras iteraciones se añadirán funcionalidades completas de servicio y controladores, transformando la aplicación en un sistema de compras.
