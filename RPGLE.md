### Secciones del programa

```cobol
 * Field definitions
d Len             s             05  0
 *
```

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

### Buscar un registro usando una columna

```cobol
 *
C     KEYVAR1       CHAIN     TABL1 
C                   IF        %FOUND
 *
C     KEYVAR1       CHAIN     TABL1
C                   IF        NOT %FOUND
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
 * Iniciar una variable numerica en 0
C                   Z-ADD     *ZEROS        VARNUM
C                   MOVE      *ZEROS        VARNUM
 * Copiar el valor de una variable numerica a otra
C                   Z-ADD     VARNU1        VARNU2
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
