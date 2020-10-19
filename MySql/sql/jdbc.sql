create database jdbc

use jdbc

create table employees(
id int primary key auto_increment,
fname varchar(20),
sname varchar(20),
email varchar(20))

insert into employees (fname, sname, email)
values
('Avram','Lincoln','alincoln@gmail.com')

insert into employees (fname, sname, email)
values
('Jjonh','Doe','jdoe@gmail.com')

insert into employees (fname, sname, email)
values
('Anton','Chehov','achehov@gmail.com')

insert into employees (fname, sname, email)
values
('Lev','Tolstoy','ltolstoy@gmail.com')

insert into employees (fname, sname, email)
values
('Anna','Karenina','jdoe@gmail.com')


