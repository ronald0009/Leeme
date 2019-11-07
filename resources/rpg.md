# Comment
```cobol
 *---------------------------------------------------*
 *- COMMENT                                          *
 *---------------------------------------------------*
```
# Spool
- Eliminar spool
```cobol
dltsplf file(*select)
```
- Ver spool file del usuario
  - Ubicarse en la opción de menú del usuario
  - Ejecutar el programa que genera el archivo de spool
  - Terminado el proceso presionar ESC + 2 ó SHIFT + F6
  - F11 para ver la fecha del archivo generado
# Debug
###### \*.RPG
1. Compile with 14 + F4
2. F10 show options
3. \*SRCDBG
```
Opciones de listado fuente . . . 
```
4. Enter
5. STRDBG + F4
6. Fill values
```
Programa . . . . . . . . . . . .
  Biblioteca . . . . . . . . . .
Actualizar archivos producción  
Depuración a nivel fuente OPM  .
```
7. Enter
8. F6 set breakpoint
9. F10 exit from set breakpoint option
10. Resume
```cobol
STRDBG PGM(MYLIB/RPG0000002) UPDPROD(*YES) OPMSRC(*YES)
```
11. Call program
```cobol
CALL MYLIB/RPG0000002
```
###### \*.CL
1. \*SRCDBG
###### \*.RPGLE
```cobol
STRDBG PGM(MYLIB/R9999999) UPDPROD(*YES) OPMSRC(*YES)
```
###### \*.SQLRPGLE
1. 14 + F4
2. F10
3. \*SOURCE
4. ENTER
5. STRDBG + F4
6. ENTER
7. F6
8. F10
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
- Llamar programa con varios parametros
  - Escribe call + f10
```cobol
CALL PGM(MYLIB/RPG0000002) PARM('123' '456')
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
