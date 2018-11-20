## Errores conocidos

- [Using platform encoding (Cp1252 actually) UTF-8](https://github.com/ronald0009/Leeme/blob/master/maven0001.xml)
- [Using platform encoding (Cp1252 actually) ISO-8859-1](https://github.com/ronald0009/Leeme/blob/master/maven0002.xml)
- [Instalar un Jar en el repositorio local](https://github.com/ronald0009/Leeme/blob/master/maven0001.bat)
- [Instalar un Jar en el repositorio local alternando el repositorio destino](https://github.com/ronald0009/Leeme/blob/master/maven0002.bat)

### The method ~ of type ~ must override a superclass method

```
Window > Preferences > Java > Compiler > 1.6
```

### Fatal error compiling: tools.jar not found

[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:2.5.1:compile (default-compile) on project general: Fatal error compiling: tools.jar not found: C:\Program Files\Java\jre1.8.0_144\..\lib\tools.jar -> [Help 1]

```
Window > Preferences > Java > Installed JREs > Add > C:\Program Files\Java\jdk1.8.0_131
```

### Actualizar la configuracion de Maven

```
Window > Preferences > Maven > User Settings > ... > Apply > OK
```

### Tipos de empaquetamiento

- jar
- war
- ejb
- ear
- pom
- maven-plugin

### Orden de compilacion

```
cd %WORKSPACE%\herramientas
cd %WORKSPACE%\persistencia
cd %WORKSPACE%\bus
cd %WORKSPACE%\core
cd %WORKSPACE%\bpm
cd %WORKSPACE%\negocio
```

### Comandos de compilacion

Otros

```
mvn install -Dmaven.test.skip=true
```

Online

```
mvn clean install -Dmaven.test.skip=true
mvn eclipse:clean
mvn eclipse:eclipse
```

Offline

```
mvn clean install -o -Dmaven.test.skip=true
mvn eclipse:clean -o
mvn eclipse:eclipse -o
```
