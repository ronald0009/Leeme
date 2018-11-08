### Escribir en una tabla el valor de NEWVAL

```cobol
 *
FTABL0   O   E           K        DISK
 *
C                     MOVE *BLANKS   COL1
C                     MOVELNEWVAL    COL1
C                     WRITETABL0R
 *
```

### Rutina Principal

```cobol
 *
C                     MOVE '1'       *INLR
C                     RETRN
 *
```

### Rutina Inicial

```cobol
 *
C           *ENTRY    PLIST
C                     PARM           PARM1 256
 *
C                     ENDSR
 *
```

### Inicializar una variable tipo cadena

```cobol
 *
C                     MOVE *BLANKS   CHARVAR
 *
```

### Inicializar una variable tipo numerico

```cobol
 *
C                     MOVE *ZEROS    NUMVAR
 *
```
