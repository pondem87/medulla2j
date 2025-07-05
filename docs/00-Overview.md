# Medulla2J

Our multivendor-LLM WhatsApp chatbot is meant to serve the underserved low income population of Africa offering more than just the basic LLMs. We will offer limited free
access to the cheaper models and a subscription for the more powerful models. We aim to host all/most of the currently available models across vendors.

This is a rewrite of the same project moving from Nest and Typescript to a combination of Java/Spring-Boot and Python/Fast-API. The motivation
for this shift was initially to change the general architecture into a smaller footprint with fewer microservices. The previous version was
mainly built as microservice architecture for learning purposes. Given the expected audience, we will not scale enough to need such a complex architecture.
The data stored is basic and not mission-critical therefore I will not be using a managed database service to cut on cost. I will only have two microservices necessitated
by the need to use Langchain for AI service.

There will basically be two microservices i.e. Java Spring Boot to handle whatsapp webhooks and to interact with the whatsapp messages api and handle most of the
business logic such as the user database, and Python Fast-API to manage AI agent workflows or graphs. The Langchain library offers a lot of useful abstractions. I will be using a
self-hosted instance of postgres for persistence. This will shave off costs but ofcourse with the complexity of trying to manage backups. Our data in this service is not mission-critical,
in fact data loss will merely be an inconvenience.

📚 Docs:
- [Overview](00-Overview.md)
- [Requirements](01-Requirements.md)
- [Architecture](02-Architecture.md)
- [Tech Stack](03-Tech-Stack.md)
- [Design Decisions](04-Decisions.md)
- [Roadmap](05-Roadmap.md)
