### Errores conocidos

- [Using platform encoding (Cp1252 actually) UTF-8](https://github.com/ronald0009/Leeme/blob/master/maven0001.xml)
- [Using platform encoding (Cp1252 actually) ISO-8859-1](https://github.com/ronald0009/Leeme/blob/master/maven0002.xml)

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
