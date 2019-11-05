- Para usar DUMP
  - Poner DUMP en el codigo fuente
```
C                   DUMP
```
  - Identificar cual es el usuario que ejecuta el programa
  - Ejecutar la sentencia para mostrar el spool del usuario
```
WA
WRKSPLF SELECT(USR999)
```
- Para validar que existe un registro tenemos las siguientes opciones:
  - Al usar SQL
```
C/EXEC SQL
C* aqui va la consulta
C/END-EXEC
C                   IF        SQLCOD=*ZEROS
C                   ENDIF
```
  - Estilo RPG
```
C     CLA999        CHAIN     F9999R                             31
C     *IN31         IFEQ      *OFF                                 
C                   MOVE      COLUM1        VARIA1                 
C                   ENDIF                                          
```
  - Estilo ILE RPG
```
C     CLA999        CHAIN     F9999
C                   IF        %FOUND(F9999)
C                   MOVE      COLUM1        VARIA1                 
C                   ENDIF                                          
```
  - ILE RPG not found
```
C     CLA999        CHAIN     F9999
C                   IF        NOT %FOUND(F9999)
C                   MOVE      COLUM1        VARIA1                 
C                   ENDIF
```
