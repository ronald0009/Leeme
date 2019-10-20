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
[Next](https://javabrains.io/courses/spring_bootquickstart/lessons/Adding-a-REST-Controller/)
