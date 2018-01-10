drop database if exists testdb2;
create database testdb2;
use testdb2;
create table test_table2(
user_id int,
user_name varchar(255),
password varchar(255)
);
insert into test_table2 values(1,"tako","321");
insert into test_table2 values(2,"jiko","654");
insert into test_table2 values(3,"hanao","987");