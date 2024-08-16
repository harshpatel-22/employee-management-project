Dependencies in this project are:
    1.Spring Data JPA
    2.Spring Boot Web
    3.H2 Database
    4.MySql-JDBC Driver
    5.Lombok
    6.MySql J Connector

Methods Used:
  GET:  http://localhost:8080/employees
  POST: http://localhost:8080/employees
  PUT:  http://localhost:8080/employees/id
  DELETE: http://localhost:8080/employees/id

Application Properties:
  spring.application.name=emp-project
  spring.datasource.url=jdbc:mysql://localhost:3306/harshdb
  spring.datasource.username=****
  spring.datasource.password=****
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true