### Dirección de la documentación oficial

- [Official Documentation](https://jazz.net/help-dev/clm/index.jsp?re=1&topic=/com.ibm.rational.clm.doc/helpindex_clm.html&scope=null)

### Crear un nuevo espacio de trabajo

1. Perspectiva 'Work Items' / Vista 'Team Artifacts' / Clic 'Create a Repository Connection' / Llenar los datos de conexión y clic en 'Finish'
2. Expandir 'Repository Connections' / Seleccionar la conexión / Clic derecho / Clic 'Manage Connected Project Areas' / Seleccionar la conexión y clic 'Finish'
3. Expandir la conexión / Expandir 'Source Control' / Seleccionar 'Source Control'/ Clic derecho / Search / Streams / Escribir el texto y clic en 'Search' / Seleccionar el flujo / Clic derecho / New / Repository Workspace / Next / Next / Seleccionar la opción 'Public' y 'Next' / Finish / Next / Finish
4. Expandir el nodo 'My Repository Workspaces' / Buscar el nuevo workspace recien creado
5. Vista 'Team Artifacts' / expandir la conexión / expandir 'Source Control' / clic derecho / 'Search' / poner el nombre del stream / en la vista 'Search', seleccionar el stream / clic derecho / Show / Pending Changes / Ver como se refresca la vista 'Pending Changes' creando dos flujos, el flujo de trabajo y el flujo superior
6. Aceptar los cambios en el flujo superior y validar si hay conflictos con los cambios del flujo de trabajo

### Bloquear un recurso

1. Perspectiva Recurso
2. Vista Project Explorer
3. Seleccionar el recurso -> Clic derecho -> Team -> Lock

### Suspender un changeset

Para mantene los cambios en el workspace pero retirarlo del flujo de salida proceder de la siguiente manera:

1. Perspectiva Elementos de trabajo
2. Vista Pending Changes
3. Seleccionar el change set -> Clic derecho en el change set -> Suspend
4. Si hay cambios sin agregar en algun change set aparece un cuadro de dialogo con dos opciones
4.1. Check-in and Suspend para agregar los cambios a un change set y suspender
4.2. Suspend para descartar los cambios sin resolver y suspender
