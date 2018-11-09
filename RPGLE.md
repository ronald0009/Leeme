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

### Operadores especiales

```cobol
 * Año en formato YYYY
C                   MOVE      *YEAR         VARAÑO
 * Mes en formato MM
C                   MOVE      *MONTH        VARMES
 * Dia en formato DD
C                   MOVE      *DAY          VARDIA
 * Hora en formato HHMMSS
C                   TIME                    VARHOR
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
