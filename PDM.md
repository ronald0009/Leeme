### Tipos de "File"

- QDDSSRC
- QRPGLESRC
- QRPGSRC

### 5250 terminal emulator

#### Download link

[Download tn5250j](http://tn5250j.sourceforge.net/)

#### TCP/IP configuracion

- IP/DNS Host: pub400.com
- Puerto: 400
- Dejar seleccionado la opcion "Use PC name as device"

### DTAQ
Data queues are a type of system object (*DTAQ) that you can create and maintain usign system commands and APIs.

They provide a means of fast asynchronous communication between two jobs, or within the same job.

High level languages can send data to a data queue using the QSNDDTAQ API and receive data using the QRCVDTAQ API.

Data queues can be read in FIFO sequence, LIFO sequence, or in keyed sequence.

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

2. RPG, CL

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
8. Buscar con F + ENTER
9. Ver el contenido de la variable con F11 ubicando el cursor sobre la variable o escribiendo:

```cobol
eval MYVAR
```

10. Finalizar el modo debug

```cobol
ENDDBG
```

### Hacer debug recursivo

1. Compilar todos los programas en modo debug
2. Ejecutar el programa principal en modo debug
3. Ubicar el programa invocado y SHIFT + F2
4. Escribe 1 para añadir, el nombre del programa, la biblioteca y ENTER
5. Escribe 5 y ENTER, poner el punto de parada con F6 y F10 para salir

