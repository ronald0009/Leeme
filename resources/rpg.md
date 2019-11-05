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
