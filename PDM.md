### Borrar los archivos del SPOOL

```
DLTSPLF FILE(*SELECT)
```

### Mandar tramas como parámetro

1. call qcmd
2. F11
3. Copiar y pegar a partir de la segunda linea

### Hacer debug a un programa

1. Compilar en modo debug
1.1. RPGLE

```cobol
*SOURCE
```

1.2. CL

```cobol
*SRCDEBUG
```

2. Ejecutar el comando para inicar el modo debug

```cobol
STRDBG PGM(MYLIB/MYRPGLEPRG) UPDPROD(*YES) OPMSRC(*YES)
```

3. Marcar los puntos de parada
4. Ejecutar el programa

```cobol
CALL MYLIB/MYRPGLEPRG PARM('PARAM1' 'PARAM2' 'PARAM3' 'PARAM4')
```

5. Finalizar el modo debug

```cobol
ENDDBG
```
