CREATE DATABASE kia_dealership;

USE kia_dealership;

CREATE TABLE IF NOT EXISTS employee (
  id_employee INT NOT NULL AUTO_INCREMENT,
  full_name VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_employee`))
  ENGINE = InnoDB;
  
  CREATE TABLE IF NOT EXISTS car (
  id_car INT NOT NULL AUTO_INCREMENT,
  name_car VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id_car`))
  ENGINE = InnoDB;
  
  CREATE TABLE IF NOT EXISTS sell (
  id_sell INT NOT NULL AUTO_INCREMENT,
  id_car INT NOT NULL,
  id_employee INT NOT NULL,
  price INT NOT NULL,
  date_sell DATE NOT NULL,
  FOREIGN KEY (id_car) REFERENCES car(id_car),
  FOREIGN KEY (id_employee) REFERENCES employee(id_employee),
  PRIMARY KEY (`id_sell`))
  ENGINE = InnoDB;
  
INSERT INTO employee (full_name)
VALUE ('Cristian Gallego');

INSERT INTO car (name_car)
VALUE ('Sportage');

INSERT INTO sell (id_car, id_employee, price, date_sell)
VALUE (1, 1, 80000000, '2024-03-01');

CALL sp_show_sells_employee1();
CALL sp_showSells();
CALL sp_insert_new_
