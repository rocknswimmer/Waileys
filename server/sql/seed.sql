drop database if exists waileys;
create database waileys;
use waileys;

CREATE TABLE runners (
  runner_id int primary key auto_increment,
  runner VARCHAR(100) NOT NULL DEFAULT NULL,
  pace REAL NOT NULL DEFAULT NULL
);

CREATE TABLE legs (
  leg_id int primary key auto_increment,
  runner_id int not null,
  distance REAL NOT NULL DEFAULT NULL,
  complete BOOLEAN NOT NULL DEFAULT false,
  start_time VARCHAR(50) NOT NULL DEFAULT 'TBD',
  end_time VARCHAR(50) NOT NULL DEFAULT 'TBD',
  mountain_start VARCHAR(50) NOT NULL DEFAULT 'TBD',
  mountain_end VARCHAR(50) NOT NULL DEFAULT 'TBD',
  pacific_start VARCHAR(50) NOT NULL DEFAULT 'TBD',
  pacific_end VARCHAR(50) NOT NULL DEFAULT 'TBD',
  dif VARCHAR(50) NOT NULL DEFAULT 'TBD',
  constraint fk_leg_runner foreign key(runner_id)
  references runners(runner_id)
);

insert into runners (runner, pace) values ('And e', 10);


insert into legs (runner_id, distance) values (1, 3.1);