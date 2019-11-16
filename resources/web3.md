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
###### Combos
- Cambiar valor
```js
c.$('cboName', 0).changeValue('6');
```
- Activar, desactivar
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
