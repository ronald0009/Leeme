### Borrar los archivos del SPOOL

```
DLTSPLF FILE(*SELECT)
```

### Mandar tramas como parámetro

1. Ejecutar los comandos

```cobol
call qcmd
F11
```

2. Copiar y pegar la sentencia CALL a partir de la segunda linea

### Compilar en modo debug
1. RGPLE

```cobol
*SOURCE
```

2. CL

```cobol
*SRCDEBUG
```

### Hacer debug a un programa

1. Compilar en modo debug
2. Iniciar el modo debug

```cobol
STRDBG PGM(MYLIB/MYRPGLEPRG) UPDPROD(*YES) OPMSRC(*YES)
```

3. Marcar los puntos de parada con F6
4. Salir con F10
5. Ejecutar el programa

```cobol
CALL MYLIB/MYRPGLEPRG PARM('PARAM1' 'PARAM2' 'PARAM3' 'PARAM4')
```

6. Ejecutar linea por linea con F10
7. Ejecutar hasta el siguiente punto de parada con F12
8. Ver el contenido de la variable con F11 ubicando el cursor sobre la variable o escribiendo:

```cobol
eval MYVAR
```

9. Finalizar el modo debug

```cobol
ENDDBG
```
