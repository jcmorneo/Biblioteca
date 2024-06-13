# 📚 LiterAlura

## 🌟 Descripción
LiterAlura es un proyecto desarrollado en Java con Spring Boot que permite interactuar con la API de Gutendex para obtener información sobre libros. Proporciona diversas funcionalidades como búsqueda por título, autor, listado de últimos libros y más.

## 🔍 Funcionalidades principales
- 🔎 Búsqueda por título de libro.
- 📝 Búsqueda por autor de libro.
- 📅 Listado de últimos libros.
- 🌐 Interacción con la API de Gutendex mediante WebClient de Spring WebFlux.
- 📦 Conversión de respuestas JSON en objetos Java utilizando Spring WebFlux y Jackson.

## 🗂️ Estructura del proyecto
El proyecto está organizado de la siguiente manera:
- `src/main/java`: Contiene el código fuente del proyecto.
  - `client`: Clases para realizar peticiones a la API de Gutendex.
  - `controller`: Controladores de Spring MVC para manejar las solicitudes HTTP.
  - `dto`: Objetos de transferencia de datos para mapear las respuestas de la API.
  - `model`: Modelos de datos que representan entidades del dominio.
  - `repository`: Interfaces para el acceso a datos.
  - `service`: Lógica de negocio y servicios de la aplicación.
- `src/main/resources`: Recursos estáticos y de configuración.
- `src/test`: Pruebas unitarias y de integración.

## 💻 Tecnologías utilizadas
- ☕ Java 11
- 🚀 Spring Boot 2.x
- 🌐 Spring WebFlux
- 🔄 WebClient
- 📚 Jackson
- 📦 Maven

## ⚙️ Configuración
Para ejecutar el proyecto localmente, sigue estos pasos:
1. 📂 Clona el repositorio desde GitHub.
2. 🖥️ Abre el proyecto en tu entorno de desarrollo preferido.
3. 🛠️ Configura el archivo `application.properties` con las propiedades necesarias.
4. ▶️ Ejecuta la aplicación desde tu IDE o utilizando Maven: `mvn spring-boot:run`.

## 🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si quieres contribuir al proyecto, sigue estos pasos:
1. 🍴 Haz un fork del repositorio.
2. 🌿 Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. 💡 Realiza tus cambios y haz commit (`git commit -am 'Agrega nueva funcionalidad'`).
4. 🚀 Sube tus cambios a tu fork (`git push origin feature/nueva-funcionalidad`).
5. 🔃 Crea un Pull Request en GitHub.

## 👤 Autor
Juan Carlos Moreno Ivito.

## 📄 Licencia
Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo `LICENSE.md`.
