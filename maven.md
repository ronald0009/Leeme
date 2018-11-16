### Errores conocidos

- [Using platform encoding (Cp1252 actually)](https://github.com/ronald0009/Leeme/edit/master/Maven.md)

### Tipos de empaquetamiento

- jar
- war
- ejb
- ear
- pom
- maven-plugin

### Comandos de compilacion

```
mvn clean install -o -Dmaven.test.skip=true
mvn eclipse:clean -o
mvn eclipse:eclipse -o
mvn install -Dmaven.test.skip=true
```

### Instalar un JAR en el repositorio local

```
mvn install:install-file -Dfile=<path-to-file> -DgroupId=<group-id> -DartifactId=<artifact-id> -Dversion=<version> -Dpackaging=jar
```
