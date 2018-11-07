### Rutina Principal

```cobol
 *
C                   SETON                                        LR
C                   RETURN
 *
```

### Rutina Inicial

```cobol
 *
C     *INZSR        BEGSR
C     *ENTRY        PLIST
C                   PARM                    PARM1          5000
C                   ENDSR
 *
```

### DUMP

1. Agregar la sentencia DUMP
2. Compilar y ejecutar el programa
3. En la línea de comandos escribir WA
4. Navegar por filas hasta ubicar el usuario que ejecuto la tarea
5. Para ver el contenido del SPOOL escribir 8 y ENTER

```cobol
* 
C                   DUMP
 *
```
