# Microservicios de guardado de usuarios  mediante la validacion del token

En este  micorservicio tiene la funcion principal de guardar nuevos usuarios para en un futuo poder enviar por correo ciertos reportes, ademas tambien maneja el token de seguridad

* El paquete es 'com.junior.pecho' la version del snapshot es 0.0.1-SNAPSHOT.

# Iniciando el proyecto

## Herramientas Usadas

* Spring boot 2.5.2
* Java 11
* Validation
* Spring WebFlux
* r2dbc-h2
* Swagger
* Actuator

### Primero construccion del proyecto
Para construir el proyecto ejecutar el siguiente comando:

```
gradle clean build
```

### Iniciar Proyecto

```
gradle bootRun
```

# Diagrama de la solución

![Diagrama de componentes](https://github.com/jppm1850/challenge-user-v1/blob/main/challenge-junior-pecho.jpg)



### Guias 

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.2/gradle-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.5.2/reference/htmlsingle/#boot-features-security)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)




