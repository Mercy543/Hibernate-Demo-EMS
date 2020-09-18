use employeedb;
create table Employee(
id INT NOT Null AUTO_INCREMENT,
empName VARCHAR(30) NOT NULL,
saary DECIMAL(10,2) NOT NULL,
department VARCHAR(30) NOT NULL,
PRIMARY KEY (id)
);