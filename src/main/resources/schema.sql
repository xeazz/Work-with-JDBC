DROP DATABASE netology_db;
CREATE DATABASE netology_db;
USE netology_db;
CREATE TABLE IF NOT EXISTS CUSTOMERS
(
    id           INT AUTO_INCREMENT,
    name         VARCHAR(256) NOT NULL,
    surname      VARCHAR(256) NOT NULL,
    age          INT          NOT NULL CHECK (age > 0),
    phone_number VARCHAR(256) UNIQUE,
    PRIMARY KEY (id)
    );

INSERT INTO CUSTOMERS (name, surname, age, phone_number)
VALUES ('alexey', 'Ivanov', 22, '+79990000101'),
       ('Alexey', 'Stepanov', 23, '+79990000102'),
       ('OLEG', 'Inker', 56, '+79990000113'),
       ('AlExEY', 'Orlov', 84, '+79990000155'),
       ('aLEXey', 'Orlov', 13, '+79990000124');

CREATE TABLE IF NOT EXISTS ORDERS
(
    id           INT AUTO_INCREMENT,
    date         VARCHAR(256) NOT NULL,
    customer_id  INT,
    product_name VARCHAR(256) NOT NULL,
    amount       INT,
    PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);

INSERT INTO ORDERS (date, customer_id, product_name, amount)
VALUES ('03-03-2023', '1', 'BMW', 22),
       ('11-01-2021', '3', 'Mercedes-Benz', 2),
       ('02-09-2022', '5', 'JAC', 214),
       ('14-01-1998', '2', 'Opel', 105),
       ('28-06-2020', '4', 'Honda', 4);