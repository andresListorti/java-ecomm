Proyecto ECOM - Entrega Final del Curso de Programación con Java de CODERHOUSE

Este repositorio contiene la entrega final del curso de programación con Java, donde se ha desarrollado una aplicación básica utilizando Spring Boot y varias dependencias clave, como Spring Web, H2 Database, Lombok, entre otras.

Estructura y Funcionalidad:

La aplicación está organizada en paquetes que incluyen las capas de modelo, repositorio, servicio y controlador. Se han implementado entidades como Cliente, Usuario, Producto y Domicilio, junto con una demostración de persistencia en la base de datos en memoria H2.

Se agregan controladores REST para todo el CRUD, se ponen a prueba primero por consola en la clase principal EcomApplication, en http://localhost:8080/h2-console y luego con Postman.

Configuración:

La conexión a la base de datos y otros ajustes se realizan en el archivo application.properties.
