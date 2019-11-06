- Liberar bloqueos
```cobol
WRKOBJLCK OBJ(MYLIB/F9999) OBJTYPE(*FILE)
```
- Realizar la secuencia de comandos:
  - 5, 41, \*IMMED, 1 (segundo), ENTER\*2, F5
- Indicadores en \*.SQLRPGLE
```cobol
C     COLUM1        CHAIN     F9999R                             31
 * FOUND -> *IN31 = 0
 * NOT FOUND -> *IN31 = 1
C                   IF        *IN31
 * Entra cuando el indicador vale 1
C                   ENDIF
```
- Llamar programa con 1 parametro
```
CALL PGM(MYLIB/RPG0000002) PARM('123')
```
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
