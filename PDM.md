### Borrar los archivos del SPOOL

```
DLTSPLF FILE(*SELECT)
```

### Mandar tramas como parámetro

1. call qcmd
2. F11

### Hacer debug a un programa RPGLE

1. Compilar en modo debug
2. Ejecutar el comando para inicar el modo debug

```cobol
STRDBG PGM(MYLIB/MYRPGLEPRG) UPDPROD(*YES) OPMSRC(*YES)
```

3. Marcar los puntos de parada
4. Ejecutar el programa

```cobol
CALL MYLIB/MYRPGLEPRG PARM('PARAM1', 'PARAM2', 'PARAM3', 'PARAM4')
```

5. Finalizar el modo debug

```cobol
ENDDBG
```
