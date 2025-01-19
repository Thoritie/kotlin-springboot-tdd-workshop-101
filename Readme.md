# **Practical Kotlin for Spring Boot: Writing Reliable Code with TDD**

Welcome to the **Practical Kotlin for Spring Boot** workshop repository! This guide will help you set up the environment, run the application, and get started with Test-Driven Development (TDD) using Kotlin and Spring Boot.

---

## **Getting Started**

### **Prerequisites**
Before starting, ensure you have the following installed on your machine:
- **Docker**
- **JDK 21** (or higher)
- **Gradle** (or use the Gradle wrapper provided)
- **Git**

---

### **Step 1: Initialize the Database**
Start a MySQL database instance using Docker:
```bash
docker run --rm --name workshop101 \
  -e MYSQL_ROOT_PASSWORD="password" \
  -e MYSQL_DATABASE="workshop101" \
  -p 3306:3306 \
  mysql:latest
```

### **Step 2: Running application**
```bash
./gradlew bootRun
```


### **Step 3: Happy Hacking !**

----
# **Workshop Challenge: File Management API**

Implement a **FileController**, **FileService**, and **FileRepository** to complete the following tasks:

## **Tasks**

1. **Upload File**
    - Create an API to upload files and store them in `storage`.
    - Return file details (name, size, timestamp).

2. **Read and Process File**
    - Read a file from `storage`.
    - Transform its content into a specific format (e.g., JSON or XML).

3. **Get File Status**
    - **GET (all)**: List all uploaded files with details.
    - **GET (by ID)**: Retrieve details of a specific file.

---

## **Bonus Challenges**
- Add file deletion.
- Support pagination for the file list.
- Write unit and integration tests.
