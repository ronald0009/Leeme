- Pasar un parametro fecha de tipo cadena y compararlo con una columna de tipo fecha
```xml
<parameter name="FECHAINI" class="java.lang.String">
	<defaultValueExpression><![CDATA["2015-05-06"]]></defaultValueExpression>
</parameter>
```
```sql
SELECT ?
FROM ?
WHERE CAST(COLUMNA_FECHA AS DATE) >= CAST('$P!{FECHAINI}' AS DATE)
```
- Jasper format Java Date
```java
(new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss")).format(new Date())
```
- Call between transactions with session
```java
RequestData.setSession(inDetail);
RequestProcessorBySocket embedded = new RequestProcessorBySocket(inDetail);
Detail ouDetail = embedded.process();
```
- [iReport](./resources/20191206103334.md)
- [DB2](./resources/20200224113132.md)
- [DbVisualizer](./resources/20191209092829.md)
- [Maven 3](./resources/201911290928.md)
- [Rational Team Concert](./resources/201911281514.md)
- [Sonarqube](./resources/20191121151011.md)
- [Microservices](./resources/microservices.md)
- [EMV](./resources/emv.md)
- [Java](./resources/20191120112223.md)
- [WEB3](./resources/20200123164041.md)
- [Patterns](./resources/patterns.md)
- [JSPs and Servlets](./resources/jspservlets.md)
- [Best](./resources/best.md)
- [Android](https://github.com/ronald0009/Leeme/blob/master/resources/android.md)
- [do092](https://github.com/ronald0009/Leeme/blob/master/resources/do092.md)
- [Spring Boot wtf!???]()
- [Fondos indexados](https://github.com/ronald0009/Leeme/blob/master/resources/fi.md)
- [do080](https://github.com/ronald0009/Leeme/blob/master/resources/do080.md)
- [Nateo de puertos]()
- [Public and private keys]()
- [Implement memory cache with java]()
- Los comandos deben tener un patron en el nombre que facil de consultar y sirva para relacionarlos
- El mensaje para el usuario debe estar parametrizado en BD y ser configurable por canal para dar una respuesta coherente
