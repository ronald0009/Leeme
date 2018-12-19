### Desplegar una aplicacion web en una instancia del servidor desde la terminal de Linux

1. Copiar el archivo war en el directorio:

```
# /home/jboss-eap-7.0/WEB_APP_NAME/deployments
```

2. En la terminal ejecutar los comandos en el orden indicado:

```
# cd /home/jboss-eap-7.0/bin
# nohup ./standalone.sh -Djboss.bind.address=JBOSS_IP_ADDRESS -Djboss.bind.address.management=JBOSS_IP_ADDRESS -Djboss.server.base.dir=../WEB_APP_NAME -Djboss.boot.log.file=../log/boot.log -Dlogging.configuration=../WEB_APP_NAME/configuration/logging.properties &
```
