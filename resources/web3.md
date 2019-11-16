###### Funciones genericas para componentes lov
```js
preConsultaLov = function(lovName) {
  switch(lovName) {
    case 'LOV_NAME':
      break;
  }
}
callbackLov = function(lovName) {
  switch(lovName) {
    case 'LOV_NAME':
      break;
  }
}
```
###### Rango de valores
- Combo: cadena vacia, 0, 1, ..., etc.
- Checkbox: true, false
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
- Texto (oculto), Combo
```js
c.$('cboField', 0).changeValue('6');
```
###### Checkbox
- Check, uncheck
```js
c.$('chkField', 0).setChecked(true);
c.$('chkField', 0).setChecked(false);
```
- Is checked?
```js
if(c.$('chkField', 0).checked){
}
```
###### Activar o desactivar
- Texto, Combo, Checkbox
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
