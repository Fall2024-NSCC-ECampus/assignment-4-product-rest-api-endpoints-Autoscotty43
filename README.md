# RESTful Book API

A simple Spring Boot RESTful API for managing a collection of books. This project demonstrates the use of a RESTful architecture with basic CRUD operations using Spring Boot, H2 database, and JPA.

## **Features**
- Create a book record
- Retrieve all book records
- Retrieve a book by ID
- Update a book record
- Delete a book record
- In-memory H2 database for persistence

---

## **Project Structure**
src/main/java
├── ca.nscc.jaredscott_resfulapi_assignment4
│   ├── controller
│   │   └── BookController.java
│   ├── model
│   │   └── Book.java
│   ├── repository
│   │   └── BookRepository.java
│   └── JaredScottRestfulApiAssignment4Application.java

---

## **Technologies Used**
- **Spring Boot**: For creating the REST API.
- **H2 Database**: An in-memory database for testing and development.
- **Spring Data JPA**: To simplify database interactions.
- **Lombok**: To reduce boilerplate code for getters, setters, constructors, etc.
- **Postman**: For API testing and debugging.

---

## **Setup Instructions**

### **Prerequisites**
1. Java 17 or later.
2. Maven.
3. An IDE like IntelliJ IDEA or Eclipse.

### **Steps to Run**
1. Clone this repository:
   ```bash
   git clone https://github.com/Autoscotty43/your-repository-name.git
   cd your-repository-name
