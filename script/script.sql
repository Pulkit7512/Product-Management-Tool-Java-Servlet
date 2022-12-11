create database assg3;
use assg3;
create table userInfo(
fullName varchar(255),
username varchar(255) primary key,
userPassword varchar(255)
);
insert into userInfo
values ('Pulkit Prakash', 'pulkit', 'pulkit1');
insert into userInfo
values ('Akash Malik', 'akash', 'akash2');
insert into userInfo
values ('Karan Walia', 'karan', 'karan3');
insert into userInfo
values ('Jaanvi Mehra', 'jaanvi', 'jaanvi4');


create table product(
title varchar(255) primary key,
quantity int,
size int,
image varchar(255)
);