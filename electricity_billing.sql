CREATE DATABASE electricity_billing;

USE electricity_billing;

CREATE TABLE consumers (
    consumer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    address VARCHAR(255),
    phone VARCHAR(15),
    meter_number VARCHAR(20)
);

CREATE TABLE bills (
    bill_id INT PRIMARY KEY AUTO_INCREMENT,
    consumer_id INT,
    units_consumed INT,
    amount DOUBLE,
    payment_status VARCHAR(20),
    FOREIGN KEY (consumer_id)
    REFERENCES consumers(consumer_id)
);

CREATE TABLE admin (
    admin_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    password VARCHAR(50)
);

INSERT INTO admin(username, password)
VALUES ('admin', 'admin123');
