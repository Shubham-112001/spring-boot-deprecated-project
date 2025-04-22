# Spring Boot Deprecated Project

This project is a demonstration of a Spring Boot application that utilizes deprecated dependencies, specifically older versions of Apache Commons and Spring Security. 

## Project Structure

```
spring-boot-deprecated-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── springbootdeprecatedproject
│   │   │               ├── SpringBootDeprecatedProjectApplication.java
│   │   │               └── controller
│   │   │                   └── DemoController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           └── index.html
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── springbootdeprecatedproject
│                       └── SpringBootDeprecatedProjectApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd spring-boot-deprecated-project
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using the following command:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**:
   Open your web browser and navigate to `http://localhost:8080` to see the landing page.

## Usage

This application demonstrates the use of deprecated features in Spring Security and Apache Commons. The `DemoController` class contains methods that illustrate these deprecated functionalities.

## Note

This project is intended for educational purposes to showcase deprecated dependencies and should not be used in production environments.