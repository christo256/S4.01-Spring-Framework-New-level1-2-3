# S4.01 – User API (Spring Boot)

## 📄 Project Overview
This project is a RESTful API developed with Spring Boot as part of the S4.01 exercise.
Its main purpose is to manage users in memory while applying clean architecture principles, separation of concerns, and automated testing from the beginning.

The API supports creating users, retrieving them, filtering by name, and validating business rules such as unique email addresses.  
The project evolves progressively through different levels, introducing controllers, services, repositories, and multiple testing strategies.

---

## 💻 Technologies Used
- Java 21
- Spring Boot 3
- Spring Web
- Maven
- JUnit 5
- Mockito
- MockMvc
- IntelliJ IDEA

---

## 📋 Requirements
- Java 21 or higher
- Maven 3.9+
- Git

---

## 🛠️ Installation
1. Clone the repository:

```bash
https://github.com/christo256/S4.01-Spring-Framework-New-level1-2-3
```

2. Navigate to the project directory:
```bash
`cd` user-api
```

3. Build the project
```bash
mvn clean install
```

---

## ▶️ Running the Application
Run the application using Maven: 
```bash
mvn spring-boot:run
```
Or run the generated JAR file:
```bash
java -jar target/userapi-0.0.1-SNAPSHOT.jar
```
The API will be available at:
```bash
http://localhost:9000
```

🧭 Available Endpoints
| Method | Endpoint        | Description                             |
| ------ | --------------- | --------------------------------------- |
| GET    | /health         | Health check endpoint                   |
| GET    | /users          | Retrieve all users                      |
| GET    | /users?name=ada | Filter users by name (case-insensitive) |
| GET    | /users/{id}     | Retrieve a user by UUID                 |
| POST   | /users          | Create a new user                       |

Example request (POST/users)
```json
{
  "name": "Ada Lovelace",
  "email": "ada@example.com"
}
```

---
##📦 Project Structure
```css
src
 ├─ main
 │   └─ java
 │       ├─ controllers
 │       ├─ services
 │       ├─ repositories
 │       ├─ model
 │       └─ exceptions
 └─ test
     ├─ controllers
     ├─ services
     └─ repositories
```

---
##🤝 Contributions

This project is part of a learning exercise.
To extend it:

1. Create a new branch

2. Implement the feature

3. Add tests

4. Commit using Conventional Commits

5. Open a Pull Request


