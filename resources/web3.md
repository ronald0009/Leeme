###### try catch
```js
try {
    
} catch (err) {
    Estatus.mensaje(err.message, err.stack, "error");
}
```
###### Lov
- Funcion general para pre-consulta
```js
preConsultaLov = function(lovName) {
  switch(lovName) {
    case 'LOV_NAME':
      break;
  }
}
```
- Funcion general para callback
```js
callbackLov = function(lovName) {
  switch(lovName) {
    case 'LOV_NAME':
      break;
  }
}
```
- Funcion general para consultar
```js
consultarLov = function(lovName) {
  switch(lovName) {
    case 'LOV_NAME':
      break;
  }
}
```
- Prefijo: lov
###### Checkbox
- Enable and check
```js
c.$('chkField', 0).setDisabled(false);
c.$('chkField', 0).setChecked(true);
```
- Uncheck and disable
```js
c.$('chkField', 0).setChecked(false);
c.$('chkField', 0).setDisabled(true);
```
- Check, uncheck
```js
c.$('chkField', 0).setDisabled(false);
c.$('chkField', 0).setChecked(true);
```
- Is checked?
```js
if(c.$('chkField', 0).checked){
}
```
- Enable, disable
```js
c.$('chkField', 0).setDisabled(false);
```
- Prefijo: chk
- Rango de valores: true, false
###### Combo
- Enable, disable
```js
c.$('cboName', 0).setDisabled(false);
```
- Cambia valor
```js
c.$('cboField', 0).changeValue('6');
```
- Evaluar el valor
```js
if(c.$('cboField', 0).value == '0'){
}
```
- Prefijo: cbo
- Rango de valores: cadena vacia, 0, 1, ..., etc.
###### Texto
- Enable, disable
```js
c.$('txtName', 0).setDisabled(false);
```
- Leer valor (tambien para texto oculto)
```js
var txtField = c.$('txtField', 0).value;
```
- Cambiar valor (tambien para texto oculto)
```js
c.$('txtField', 0).changeValue('6');
```
- Prefijo: txt, tambien para texto oculto
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
