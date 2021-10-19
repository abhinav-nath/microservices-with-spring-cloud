> Server restart is not needed if config changes are pushed to the `config-repository`

After setting up the Spring Cloud Config Server, properties should be available on these URLs:

**Default properties coming from `limits-service.properties`:**

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


**Dev env properties coming from `limits-service-dev.properties`:**

```
http://localhost:8888/limits-service/dev
```

```json
{
  "name": "limits-service",
  "profiles": [
    "dev"
  ],
  "label": null,
  "version": "7acc06068d607cb061233facf3f6e93944ab11d2",
  "state": null,
  "propertySources": [
    {
      "name": "https://github.com/abhinav-nath/config-repository/limits-service-dev.properties",
      "source": {
        "limits-service.minimum": "3",
        "limits-service.maximum": "3000"
      }
    },
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

**QA env properties coming from `limits-service-qa.properties`:**

```
http://localhost:8888/limits-service/qa
```

```json
{
  "name": "limits-service",
  "profiles": [
    "qa"
  ],
  "label": null,
  "version": "7acc06068d607cb061233facf3f6e93944ab11d2",
  "state": null,
  "propertySources": [
    {
      "name": "https://github.com/abhinav-nath/config-repository/limits-service-qa.properties",
      "source": {
        "limits-service.minimum": "4",
        "limits-service.maximum": "4000"
      }
    },
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