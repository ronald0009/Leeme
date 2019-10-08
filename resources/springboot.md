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
  - Artifact Id: demo100
- Edit pom.xml
```
<parent>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-parent</artifactId>
	<version>2.1.9.RELEASE</version>
</parent>
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>
</dependencies>
<properties>
	<java.version>1.8</java.version>
</properties>
```
[Next](https://javabrains.io/courses/spring_bootquickstart/lessons/Starting-a-Spring-Boot-application/)
