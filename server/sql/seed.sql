DROP TABLE IF EXISTS legs;
DROP TABLE IF EXISTS runners;

CREATE TABLE runners (
  id SERIAL PRIMARY KEY,
  runner VARCHAR(100) NOT NULL DEFAULT NULL,
  pace REAL NOT NULL DEFAULT NULL
);

CREATE TABLE legs (
  id SERIAL PRIMARY KEY,
  runner INTEGER NOT NULL DEFAULT NULL REFERENCES runners1 (id),
  distance REAL NOT NULL DEFAULT NULL,
  complete BOOLEAN NOT NULL DEFAULT false,
  start_time VARCHAR(50) NOT NULL DEFAULT 'TBD',
  end_time VARCHAR(50) NOT NULL DEFAULT 'TBD',
  mountain_start VARCHAR(50) NOT NULL DEFAULT 'TBD',
  mountain_end VARCHAR(50) NOT NULL DEFAULT 'TBD',
  pacific_start VARCHAR(50) NOT NULL DEFAULT 'TBD',
  pacific_end VARCHAR(50) NOT NULL DEFAULT 'TBD',
  dif VARCHAR(50) NOT NULL DEFAULT 'TBD'
);

insert into runners (runner, pace) values ('And e', 10);


insert into legs (runner, distance) values (1, 3.1);