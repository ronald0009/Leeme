###### Prefijos
- txt, texto (oculto)
- cbo, combo
- chk, checkbox
- lov, lista de valores
###### Leer valor
- Texto (oculto)
```js
var txtField = c.$('txtField', 0).value;
```
###### Cambia valor
- Texto (oculto), Combo, Checkbox
```js
c.$('cboField', 0).changeValue('6');
```
###### Activar o desactivar
- Combo, Checkbox
```js
c.$('cboName', 0).setDisabled(false);
```
###### Operadores logicos
```js
|| // or
&& // and
```
###### If-else
```js
if(c.$('myvar', 0).value != '') {
} else {
}
```
###### Funciones
```js
myFunction = function() {
}
```
###### Llamar, invocar, etc. a una lista de valores
```js
c.$('lovName', 0).lv.consultar(0, {soloConsulta: true}, 'change');
```
