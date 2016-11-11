--<ScriptOptions statementTerminator=";"/>

CREATE TABLE register (
	firstname VARCHAR(20),
	lastname VARCHAR(20),
	username VARCHAR(20),
	password VARCHAR(20),
	age INT,
	address VARCHAR(20),
	city VARCHAR(20),
	mobile VARCHAR(20),
	image VARCHAR(20)
);

CREATE TABLE timetable (
	uname VARCHAR(10),
	date DATE,
	workinghours VARCHAR(20),
	attendance FLOAT
);

CREATE TABLE vendor (
	vendid INT NOT NULL,
	vendname VARCHAR(10),
	PRIMARY KEY (vendid)
);

CREATE TABLE busticket (
	operator VARCHAR(20),
	source VARCHAR(20),
	destination VARCHAR(20),
	busid INT,
	bookedseats VARCHAR(10) DEFAULT 1,
	date VARCHAR(20) DEFAULT 00/00/0000,
	payment INT,
	arrival_time VARCHAR(20),
	Departure_time VARCHAR(20),
	username VARCHAR(20),
	ticketid VARCHAR(20)
);

CREATE TABLE businfo (
	busid INT,
	operator VARCHAR(20),
	source VARCHAR(20),
	destination VARCHAR(20),
	Seats INT,
	running_status VARCHAR(10),
	fare INT,
	arrival_time VARCHAR(20),
	departure_time VARCHAR(20),
	bus_number VARCHAR(20)
);

CREATE TABLE users (
	id INT NOT NULL,
	FIRST_NAME VARCHAR(255),
	LAST_NAME VARCHAR(255),
	SALARY VARCHAR(255),
	address VARCHAR(255),
	email VARCHAR(255),
	PRIMARY KEY (id)
);

CREATE TABLE a2 (
	a1_id INT NOT NULL,
	id INT NOT NULL,
	port VARCHAR(20),
	PRIMARY KEY (a1_id,id)
);

CREATE TABLE cancel_ticket (
	operator VARCHAR(20),
	source VARCHAR(20),
	destination VARCHAR(20),
	busid INT,
	bookedseats VARCHAR(10) DEFAULT 1,
	date VARCHAR(20) DEFAULT 00/00/0000,
	payment INT,
	arrival_time VARCHAR(20),
	Departure_time VARCHAR(20),
	username VARCHAR(20),
	ticketid VARCHAR(20)
);

CREATE TABLE a1 (
	id INT NOT NULL,
	country VARCHAR(20),
	PRIMARY KEY (id)
);

CREATE TABLE countries (
	country VARCHAR(20)
);

CREATE TABLE registerrecord (
	username VARCHAR(30),
	name VARCHAR(30),
	email VARCHAR(90),
	mobile VARCHAR(60),
	password VARCHAR(30)
);

CREATE TABLE customer (
	custid INT NOT NULL,
	custname VARCHAR(10),
	forevenid INT,
	PRIMARY KEY (custid)
);

CREATE INDEX FK24217FDEE861E0B3 ON customer (forevenid ASC);

