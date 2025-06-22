# 📚 Course Registration System

A full-stack web application built using **Spring Boot (Java)** and **HTML/CSS/JavaScript**, allowing students to register for courses and view available courses in real-time.

## 🔧 Features

- 📝 Student registration for available courses
- 📜 View all course details in a dynamic table
- 🎯 RESTful APIs using Spring Boot
- 💾 Data stored using Spring Data JPA with in-memory H2/relational database
- 🌐 CORS configured for frontend-backend communication
- 💡 Frontend built using plain HTML, CSS, and JavaScript (Vanilla JS)

## 🗂 Technologies Used

- Java 17+
- Spring Boot
- Spring MVC + JPA
- MySQL or H2 (configurable)
- HTML, CSS, JavaScript (Vanilla JS)
- REST API
- IntelliJ IDEA

## 🚀 How to Run

1. Clone the repository
2. Run the Spring Boot application (`CourseRegistrationSystemApplication`)
3. Open `availablecourses.html` in Live Server or via `http://localhost:5500`
4. Use the registration form and view course list dynamically

## 📁 Project Structure

- `Course.java` – Entity for course details
- `CourseRegistry.java` – Entity for student-course registration
- `CourseController.java` – REST API controller
- `CourseService.java` – Business logic
- `CourseRepo.java` – JPA repository for courses
- `CourseRegistryRepo.java` – JPA repository for course registrations

## 📸 Screenshots

![image](https://github.com/user-attachments/assets/c7ef429c-83ec-4fac-ab28-67136ed740c1)


