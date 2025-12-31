🚀 Spring Boot Kafka Learning Project

This project demonstrates Apache Kafka integration with Spring Boot using a simple REST-based producer–consumer workflow.
It is designed as a learning project to understand Kafka concepts such as topics, producers, consumers, serialization, and message flow.

🛠️ Tech Stack

Java: 25

Spring Boot: 4.x

Apache Kafka

Maven

REST API

📌 Project Overview

The application exposes REST APIs to publish messages to Kafka topics.
Consumers listen to these topics and process messages asynchronously.

| Topic Name     | Key Type | Value Type                    |
| -------------- | -------- | ----------------------------- |
| `topicChamith` | `String` | `String`                      |
| `topicChamith_json` | `String` | Java Object (JSON serialized) |

src/main/java
├── controller        # REST controllers (Producer APIs)
├── kafka/producer          # Kafka producers
├── kafka/consumer          # Kafka consumers
├── config             # Kafka configuration
└── SpringbootKafkaApplication   # Main Spring Boot application

📡 REST API Endpoints
1️⃣ Publish String Message

GET http://localhost:8080/api/v1/kafka/publish?message=hello

2️⃣ Publish Object Message

POST http://localhost:8080/api/v1/kafka/publishJson

Request Body

{
"id": 1,
"firstMName": "First Name",
"lastName": "Last Name"
}
