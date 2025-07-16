# 🧾 Online Result Checker

A simple Spring Boot web application to check student exam results by entering their roll number.  
The results are loaded from a CSV file into an in-memory H2 database on application startup.

---

## ✨ Features

- 🔍 Search result by Roll Number
- 📥 Loads data from CSV file
- 💾 Uses Spring Boot + Spring Data JPA + Thymeleaf + H2 Database
- ⚙️ Simple HTML form-based UI

---

## 📁 Project Structure
```
src/
├── main/
│ ├── java/
│ │ └── com.example.resultchecker/
│ │ ├── controller/ # Handles web requests
│ │ ├── model/ # StudentResult entity
│ │ ├── repository/ # JPA Repository
│ │ └── config/ # CSV loader on startup
│ └── resources/
│ ├── templates/ # HTML pages (Thymeleaf)
│ ├── StudentDatasetMain.csv # Sample result data
│ └── application.properties
```
