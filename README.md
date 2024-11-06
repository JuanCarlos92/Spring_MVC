# Proyecto Web con Spring Boot

Este proyecto es una aplicación web desarrollada con **Spring Boot**, donde se cubren los principales aspectos del framework como controladores, vistas, y configuración de la aplicación.

## Temas Abordados

- **Creación de Proyecto Web**: Inicialización y configuración de un proyecto Spring Boot.
- **Estructura de la Aplicación**: Explicación sobre la estructura estándar de un proyecto Spring Boot.
- **Controladores y Vistas**: Creación de controladores para manejar peticiones y pasar datos a la vista utilizando Thymeleaf.
- **Anotaciones y Manejo de Rutas**:
  - `@RequestMapping`, `@RequestParam`, `@PathVariable`, etc.
  - Implementación de API REST y métodos para manejar peticiones JSON.
- **DTOs y Modelos**: Uso de clases DTO para transferir datos entre controladores y vistas.
- **Thymeleaf**: Uso de directivas `if`, `each`, `href`, y manejo de enlaces en Thymeleaf.
- **Configuración de la Aplicación**: Personalización de propiedades con archivos `.properties` y el uso de `@Value` y Spring Expression Language (SpEL).
- **Despliegue**: Despliegue de la aplicación desde la terminal y Visual Studio Code.

## Requisitos

- JDK 23 o superior
- Maven 3.3.5+
- IDE como IntelliJ IDEA o Visual Studio Code
- Acceso a la terminal para ejecutar Maven

## Instalación

1. Clona el repositorio:
   ```bash
   https://github.com/JuanCarlos92/Spring_MVC.git
   
2. Entra en el directorio del proyecto:

Copiar código
cd tu_repositorio

3. Compila y ejecuta el proyecto con Maven:

Copiar código
mvn clean install
mvn spring-boot:run

4. Accede a la aplicación en http://localhost:8080

## Características
Configuración Flexible: Utiliza propiedades personalizadas en application.properties para ajustar la configuración de la aplicación.
Controladores REST: Manejo de solicitudes GET, POST, PUT y DELETE.
Thymeleaf: Motor de plantillas para la generación dinámica de vistas.
API REST: Creación y consumo de APIs RESTful.

