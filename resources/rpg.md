# Buscar 
- Sin clave primaria
```cobol
SETLL
```
# Fin de programa
- SQLRPGLE
```cobol
C                   MOVE      *ON           *INLR
```
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
# Bloqueos
- Liberar bloqueos
```cobol
WRKOBJLCK OBJ(MYLIB/F9999) OBJTYPE(*FILE)
```
- Realizar la secuencia de comandos:
  - 5, 41, \*IMMED, 1 (segundo), ENTER\*2, F5
# Indicadores
- Cuando no hay match, el indicador recibe el valor 1 (\*ON)
```cobol
C     CLA010        CHAIN     F999R                             30
C     *IN30         IFEQ      *ON                                 
```
- Usar IF-ELSE con indicadores
```cobol
C                   SETOFF                                       40
 *
C     *IN40         IFEQ      *OFF
 *
C                   ELSE
 *
C                   ENDIF
```
- Poner el valor 1 si el indicador tiene valor 0
```cobol
C  N40              SETON                                        40
```
- Apagar indicador
```cobol
C                   SETOFF                                       40
 * Equivale a *IN40 = 0
```
- Usar con IF
```cobol
C     *IN31         IFEQ      *OFF
```
- Indicadores en \*.SQLRPGLE
```cobol
C     COLUM1        CHAIN     F9999R                             31
 * FOUND -> *IN31 = 0
 * NOT FOUND -> *IN31 = 1
C                   IF        *IN31
 * Entra cuando el indicador vale 1
C                   ENDIF
```
# LLama programa
- Llamar programa con 1 parametro
```cobol
CALL PGM(MYLIB/RPG0000002) PARM('123')
```
- Llamar programa con varios parametros
  - Escribe call + f10 (+ f11 opcional)
```cobol
CALL PGM(MYLIB/RPG0000002) PARM('123' '456')
```
# Dump
- Poner DUMP en el codigo fuente
```cobol
C                   DUMP
```
  - Identificar cual es el usuario que ejecuta el programa
  - Ejecutar la sentencia para mostrar el spool del usuario
```
WA
WRKSPLF SELECT(USR999)
```
# Existe registro
- Para validar que existe un registro tenemos las siguientes opciones:
- SQLRGPLE
```
C/EXEC SQL
C* aqui va la consulta
C/END-EXEC
C                   IF        SQLCOD=*ZEROS
C                   ENDIF
```
- RPG
```
C     CLA999        CHAIN     F9999R                             31
C     *IN31         IFEQ      *OFF                                 
C                   MOVE      COLUM1        VARIA1                 
C                   ENDIF                                          
```
- ILE RPG indicadores
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
