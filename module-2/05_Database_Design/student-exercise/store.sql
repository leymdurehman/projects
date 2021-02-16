--CREATE DATABASE store;
DROP TABLE IF EXISTS Employee;
START TRANSACTION;
CREATE TABLE Employee (
        employee_number serial primary key,
        job_title varchar(50) not null,
        last_name varchar(32) not null,
        first_name varchar(32) not null,
        gender char(1),
        date_of_hire date DEFAULT current_date,
        date_of_birth date not null

);

CREATE TABLE Department (
        department_number serial primary key,
        name varchar(64) not null,
        employee_number int not null,
        
        constraint fk_employee_number_procedure foreign key (employee_number) references Employee(employee_number)
);











