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
