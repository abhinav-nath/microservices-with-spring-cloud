Following dependency is used to connect to the Spring Cloud Config Server:

```java
implementation 'org.springframework.cloud:spring-cloud-starter-config'
```

*The properties defined in Microservice's application.properties have less priority than those defined in the Spring Cloud Config Server.*

### Profiles

To choose a profile, define this property in application.properties:

```
spring.profiles.active=dev
```

Logs would look like this:

```shell
2021-10-20 01:04:45.453  INFO 8638 --- [  restartedMain] c.c.m.l.LimitsServiceApplication         : The following profiles are active: dev
2021-10-20 01:04:45.485  INFO 8638 --- [  restartedMain] o.s.b.context.config.ConfigDataLoader    : Fetching config from server at : http://localhost:8888
2021-10-20 01:04:45.485  INFO 8638 --- [  restartedMain] o.s.b.context.config.ConfigDataLoader    : Located environment: name=limits-service, profiles=[dev], label=null, version=7acc06068d607cb061233facf3f6e93944ab11d2, state=null
```