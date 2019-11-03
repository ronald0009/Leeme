# Spring Boot
- Opinionated
- Convention over configuration
- Stand alone
- Production ready
- Configuration
  - Install JDK 1.8
  - Install STS 
# Creating a project 
- New Maven project
  - Create a simple project (skip archetype selection)
  - Group Id: com.rab.demo
  - Artifact Id: demo300
  - Packaging: pom
- Edit pom.xml
```xml
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.1.9.RELEASE</version>
</parent>
<properties>
	<java.version>1.8</java.version>
</properties>
```
- New Maven project
  - Create a simple project (skip archetype selection)
  - Group Id: com.rab.demo.demo300
  - Artifact Id: demo301
- Edit pom.xml
```xml
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
</dependencies>
```
# Starting Spring Boot application
- Run the application
- Open the URL [localhost](http://localhost:8080/)
# Spring Boot startup steps
- Sets up default configuration
- Starts Spring application context
- Performs class path scan 
- Starts Tomcat server 
# Adding a REST Controller
- Open the URL [localhost](http://localhost:8080/hello)
# Returning Objects From Controller
- Open the URL [localhost](http://localhost:8080/topics)
# Embedded Servlet Container
- Convenience
- Servlet container config is now application config
- Standalone application
- Useful for microservices architecture
# Creating a business service
- Open the URL [localhost](http://localhost:8080/topics)
# Getting a single resource
- Open the URL [localhost](http://localhost:8080/topics/springboot)
# Creating a new resource using POST
- Open Postman
  - Clic on +
  - Select POST 
  - Clic on tab Body 
  - Select raw 
  - Select JSON
  - Add JSON bean to request body
```
{
    "id": "mongodb",
    "name": "Mongo DB",
    "description": "Mongo for Java Developers"
}
```
- Open the URL POST [localhost](http://localhost:8080/topics)
- Open the URL GET [localhost](http://localhost:8080/topics)
# Implementing Update and Delete
- Open the URL GET [localhost](http://localhost:8080/topics)
- Open Postman
  - Clic on +
  - Select PUT 
  - Clic on tab Body 
  - Select raw 
  - Select JSON
  - Add JSON bean to request body
```
{
    "id": "springboot",
    "name": "Spring Framework",
    "description": "Spring Framework first steps V2"
}
```
- Open the URL PUT [localhost](http://localhost:8080/topics/springboot)
- Open the URL GET [localhost](http://localhost:8080/topics/springboot)
- Open the URL DELETE [localhost](http://localhost:8080/topics/springboot)
- Open the URL GET [localhost](http://localhost:8080/topics)
# Starting Spring Boot 
- Starting a Spring Boot App
  - [Spring Initializr](https://start.spring.io/)
  - Spring Boot CLI 
  - STS IDE 
- Configuration
# Using Spring Boot CLI
- Download spring cli
- cd C:\spring-2.2.0.RELEASE\bin
- See available commands
  - spring.bat + ENTER
- Create groovy file
```
@RestController
class AppCtrl {

    @RequestMapping("/")
    String app() {
        "Hello world"
    }
}
```
- Save it as C:\spring-2.2.0.RELEASE\bin\app.groovy
- Run command:
```
spring.bat run app.groovy
```
# Using application properties
```
application.properties
```
- Open the URL GET [localhost](http://localhost:8081/topics)
# Adding Spring Data JPA
- Create couse-api-data project in Spring intlz
- Add dependencies: jpa, web and apache derby
- Open the URL GET [localhost](http://localhost:8081/topics)
# Making Crud Operations with Repository
- Open the URL GET [localhost](http://localhost:8081/topics)
- Add JSON bean to request body
```
{
    "id": "mongodb",
    "name": "Mongo DB",
    "description": "Mongo for Java Developers"
}
```
- Open the URL POST [localhost](http://localhost:8080/topics)
- Open the URL GET [localhost](http://localhost:8080/topics)
- Edit JSON bean in request body
```
{
    "id": "mongodb",
    "name": "Mongo DB",
    "description": "Mongo for Java Developers v2"
}
```
- Open the URL PUT [localhost](http://localhost:8080/topics/mongodb)
- Open the URL GET [localhost](http://localhost:8080/topics)
- Open the URL GET [localhost](http://localhost:8080/topics/springboot)
- Open the URL DELETE [localhost](http://localhost:8080/topics/springboot)
- Open the URL GET [localhost](http://localhost:8080/topics/springboot)
# Adding Course APIs
## [Next](https://www.youtube.com/watch?v=bEKt7LLEvb0&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=30)
