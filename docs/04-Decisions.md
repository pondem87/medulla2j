# Design Decision Log

| Date       | Decision                           | Reason                                                                          |
|------------|------------------------------------|---------------------------------------------------------------------------------|
| 2025-07-01 | Backend: Spring Boot and FastAPI   | Stability and maintainability of Spring and Java, Good AI libraries with Python |
| 2025-07-01 | Persistence: MySQL database        | Speed and simplicity                                                            |
| 2025-07-01 | Messaging: RabbitMQ                | Simpler to implement that kafka, suitable for application needs                 |
| 2025-07-01 | Cross service comm: gRPC           | Typing system, fast                                                             |
| 2025-07-04 | Deployment: Helm, Kubernetes       | Familiarity with tech                                                           |
| 2025-07-04 | CICD: Github actions               | Simpler than Jenkins, easy to setup                                             |
| 2025-07-04 | Observability: Prometheus, Grafana | Popular, great community support                                                |
| 2025-07-05 | Logs: Solarwinds Loggly            | Great json parsing enabling filtering logs by field                             |