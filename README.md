# Spring-Boot Thymeleaf ToDo

## Technical requirements (applied)
* Thymeleaf as frontend framework
* For backend used Java EE (Spring boot)
* Used PostgreSQL 12.5 database
* A Maven project

# Features!
- A Spring Boot and Thymeleaf (Template Engine) project 
- User can entry task item(s)
- User can update task item(s)
- User can track his/her task list
- Task item(s) pagination
- Pages interact between each other logically

## Getting Started
### Prerequisites
* Git
* JDK 8 or later
* Maven 3.0 or later
* PostgreSQL

### Clone
To get started you can simply clone this repository using git:
```
git clone https://github.com/ShakhawatMollah/spring-boot-todo.git
cd spring-boot-todo
```

### Configuration
You have to update the following settings:
```
#PostgreSQL Database Configuration
spring.datasource.url=jdbc:postgresql://localhost:5432/<database_name>?currentSchema=<schema_name>
spring.datasource.username=<DB_USERNAME>
spring.datasource.password=<DB_PASSWORD>
```

The configuration is located in `src/main/resources/application.properties`.

### Run the Project
You can run the maven application from the command line using:
```
mvn clean spring-boot:run
```

### Test Status-Posting Web Application
1. Browse the following path `http://localhost:8080`

### Snapshot of output
- https://i.ibb.co/R46rpZ6/Page-for-listing-all-the-todo-items.png
- https://i.ibb.co/JC2mKTh/Todo-item-add-form.png
- https://i.ibb.co/Z8C7jWY/Todo-item-edit-form.png
- https://i.ibb.co/MhngJMW/Back-end-Form-Validation.png
- https://i.ibb.co/mDDzFfb/Back-end-Maximum-Length-Form-Validation.png
- https://i.ibb.co/nPtSm3Y/Data-updated-with-successful-message.png 
