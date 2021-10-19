After setting up the Spring Cloud Config Server, properties should be available on this URL:

```
http://localhost:8888/limits-service/default
```

```json
{
  "name": "limits-service",
  "profiles": [
    "default"
  ],
  "label": null,
  "version": "81c8209843e57e917ef1b0208ad60c98f154123c",
  "state": null,
  "propertySources": [
    {
      "name": "https://github.com/abhinav-nath/config-repository/limits-service.properties",
      "source": {
        "limits-service.minimum": "2",
        "limits-service.maximum": "2000"
      }
    }
  ]
}
```

> The name of the properties file must match the name of the microservice.