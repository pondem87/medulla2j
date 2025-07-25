# Tech Stack Evaluation

## Architectural overview

### 1. Services

#### Java/Spring Boot vs Typescript/Nest.js

* Spring pros: Mature, secure, static types, robust ORM
* Spring cons: Verbosity, Lack of good AI libraries (no Langgraph)
* Nest pros: Fast development, small memory footprint, fast IO, great community include AI libraries
* Nest cons: Less robust esp the ORM options

If Spring chosen then we have to have a separate microservice for AI. In this case why not go for the de facto
language for AI - Python

Fast-API vs Flask

* Fast-API pros: Fast (for Python), lightweight, good async support, Pydantic, modern
* Fast-API cons: steeper learning curve
* Flask pros: Less steep learning curve
* Flask cons: Needs a lot of plugins for features built in to Fast-API, slower

Chose FAST-API for performance, validation and modern features

[ Final verdict on services ]
Chose Spring for maintainability especially because one of the main reason for the rewrite was technical debt
Resolved the lack of good AI library by using a separate microservice for AI workflows. For AI services will implement
a FastAPI

### 2. Database

#### Postgres vs MySql

* postgres pros: handles complex queries, full acid compliance, feature rich
* postgres cons: slower than MySQL 
* mysql pros: faster especially for simpler queries
* mysql cons: fewer features e.g. vector support, GIS, JSON handling

Chose to go with mysql since data integrity isn't mission-critical for this app, and we won't be using GIS and vectors in the database

### 3. Communication

Cross service comms will be achieved through gRPC
* faster than REST
* more robust and type safe compared to REST

Cross component or module comms will use a message broker - rabbitmq chosen over kafka
* simple to implement
* adequate for scale of application

Messages chosen to decouple process and allow asynchronous processing of requests
* avoids blocking threads
* improve performance

### 4. Deployment

#### Container orchestration
Helm and Kubernetes - familiar technologies
Nginx ingress

#### CICD
GitHub Actions - simple to implement compared with Jenkins. Jenkins may be more powerful and feature rich but for this
deployment I believe ease of implementation will be more beneficial

### 5. Monitoring

#### Logging
Logging Loggly from solarwinds - has good json parsing and processing allowing filtering of logs by field

#### Observability
For instrumentation and monitoring of services we will use Prometheus and Grafana

### 6. Hosting

TBD - AWS EKS vs DOKS