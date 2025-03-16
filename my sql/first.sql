create database bankmanagementsystem;

show databases;

use bankmanagementsystem;  
CREATE TABLE signup(formno VARCHAR(10), name VARCHAR(50),fname VARCHAR(50),mname VARCHAR(50),dob VARCHAR(20),gender VARCHAR(8),email VARCHAR(50),Marital VARCHAR(10),address VARCHAR(100),City VARCHAR(25),District VARCHAR(25),state VARCHAR(20),pin VARCHAR(8));
CREATE TABLE signuptwo(formno VARCHAR(10), relegion VARCHAR(15),category VARCHAR(10),income VARCHAR(25),education VARCHAR(20),occupation VARCHAR(18),pan VARCHAR(20),aadhar VARCHAR(20),existing VARCHAR(15));
CREATE TABLE signupthree(formno VARCHAR(10),type VARCHAR(30),card VARCHAR(20),pin VARCHAR(10),facility VARCHAR(100));
show tables;
SELECT * from signup;

SELECT * from signuptwo;
CREATE table login(formno VARCHAR(10),card VARCHAR(20),pin VARCHAR(10));

SELECT * from signupthree;

SELECT * FROM login;
create table bank( pin varchar(10),date varchar(50), type varchar(30),amount varchar(50));
drop table login;
SELECT * FROM bank;
SHOW COLUMNS FROM login;