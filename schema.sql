drop database acme_bank;

create database acme_bank;

use acme_bank;

create table accounts(
	account_id varchar(10) not null,
    name varchar(30) not null,
    balance float(7,2) not null
);

LOAD DATA INFILE 'data.csv' 
INTO TABLE accounts 
FIELDS TERMINATED BY ',' 
LINES TERMINATED BY '\n' 
IGNORE 1 ROWS;
