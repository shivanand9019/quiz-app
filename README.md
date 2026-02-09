
# 🧠 Quiz App – Microservices Architecture

A scalable Quiz Application built using Microservices Architecture. This project is designed to manage quizzes in a modular way, with the Question Service currently completed and additional services planned for future releases.

---

## 📋 Table of Contents

1. [Project Overview](#project-overview)
2. [Current Status](#current-status)
3. [Microservices Breakdown](#microservices-breakdown)
4. [Tech Stack](#tech-stack)
5. [Project Structure](#project-structure)
6. [Getting Started](#getting-started)
7. [API Endpoints](#api-endpoints)
8. [Future Enhancements](#future-enhancements)

---

## 📌 Project Overview

The Quiz App is designed to manage quizzes in a scalable and modular way using microservices. Each service handles a specific responsibility such as managing questions, quizzes, scoring, and user interactions.

---

## 👉 Current Status

| Service | Status |
|---------|--------|
| Question Service | ✅ Completed |
| Quiz Service | ⏳ Planned |
| Result / Score Service | ⏳ Planned |
| User Service | ⏳ Planned |

---

## 🧩 Microservices Breakdown

### 1️⃣ Question Service (Implemented ✅)

The Question Service is responsible for managing quiz questions.

#### Key Responsibilities

- Create quiz questions
- Retrieve questions by category or difficulty
- Update existing questions
- Delete questions
- Serve questions to other microservices

#### Features Implemented

- RESTful APIs for question management
- CRUD operations on questions
- Category-based question handling
- Difficulty-level support

---

## 🛠️ Tech Stack

| Component | Technology |
|-----------|-----------|
| Backend | Java / Spring Boot |
| Architecture | Microservices |
| API Style | REST |
| Database | MySQL / PostgreSQL / H2 |
| Build Tool | Maven / Gradle |

---

## 📂 Project Structure

```
quiz-app/
│
├── question-service/
│   ├── controller/
│   │   ├── HomeController.java
│   │   └── QuestionController.java
│   ├── service/
│   │   └── QuestionService.java
│   ├── repository/
│   │   └── QuestionRepo.java
│   ├── models/
│   │   ├── Question.java
│   │   ├── QuestionWrapper.java
│   │   └── Response.java
│   ├── resources/
│   │   └── application.properties
│   ├── pom.xml
│   └── QuestionServiceApplication.java
│
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java 8+ / 11+
- Maven / Gradle
- Database setup (if applicable)

### Installation & Running

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/quiz-app.git
   ```

2. **Navigate to Question Service:**
   ```bash
   cd quiz-app/question-service
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the service:**
   ```
   http://localhost:8080
   ```

---

## 🔗 API Endpoints

### Question Service Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/questions` | Get all questions |
| GET | `/questions/category/{category}` | Get questions by category |
| POST | `/questions` | Add a new question |
| PUT | `/questions/{id}` | Update a question |
| DELETE | `/questions/{id}` | Delete a question |

---

## 📈 Future Enhancements

- [ ] Implement Quiz Service to create and manage quizzes
- [ ] Add Result/Score Service for scoring functionality
- [ ] Add User Authentication & Authorization
- [ ] Introduce API Gateway for centralized routing
- [ ] Add Service Discovery (Eureka / Consul)
- [ ] Dockerize all services
- [ ] Add comprehensive unit and integration tests
- [ ] Implement logging and monitoring
- [ ] Add CI/CD pipeline

