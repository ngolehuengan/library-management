CREATE DATABASE LIBRARY_MANAGEMENT

CREATE TABLE ACCOUNT (
	user_name varchar(50) not null,
	password varchar(50) not null,
	account_id varchar(10) PRIMARY KEY,
	role int not null,
)
--THONG TIN CAN BAN--
CREATE TABLE USER_INFO(
	citizenID varchar(12) PRIMARY KEY, 
    fullName nvarchar(50) not null,
    birthday Date,
    isMale bit,
    phoneNumber varchar(10),
    address nvarchar(100),
)
--KHOA--
CREATE TABLE DEPARTMENT (
	department_id varchar(10) PRIMARY KEY,
	departmentName nvarchar(50)
)

--THU THU--
CREATE TABLE LIBRARIAN(
	librarian_id varchar(10) PRIMARY KEY,
	citizenID varchar(12),
	account_id varchar(10),
	CONSTRAINT FK_LIB_CITIZEN_ID FOREIGN KEY (citizenID) REFERENCES USER_INFO(citizenID),
	CONSTRAINT FK_LIB_ACCOUNT_ID FOREIGN KEY (account_id) REFERENCES ACCOUNT(account_id),
)


CREATE TABLE READER(
	reader_id varchar(10) PRIMARY KEY,
	classify_logic bit,
	egistrationDate Date,
	duration  int,
	ExpirationDate Date,
)
CREATE TABLE LECTURER(
	lecturerID varchar(10) PRIMARY KEY,
	account_id varchar(10),
	department_id varchar(10),
	citizenID varchar(12),
	reader_id varchar(10),
	CONSTRAINT FK_READER_ID FOREIGN KEY (reader_id) REFERENCES READER(reader_id),
	CONSTRAINT FK_LEC_DEPARTMENT_ID FOREIGN KEY (department_id) REFERENCES DEPARTMENT(department_id),
	CONSTRAINT FK_LEC_CITIZEN_ID FOREIGN KEY (citizenID) REFERENCES USER_INFO(citizenID),
	CONSTRAINT FK_LEC_ID_ACCOUNT FOREIGN KEY (account_id) REFERENCES ACCOUNT(account_id)
 )
 CREATE TABLE STUDENT(
	studentID varchar(10) PRIMARY KEY,
	classID varchar(10),
	department_id varchar(10),
	account_id varchar(10),
	citizenID varchar(12),
	reader_id varchar(10),
	CONSTRAINT FK_STD_READER_ID FOREIGN KEY (reader_id) REFERENCES READER(reader_id),
	CONSTRAINT FK_STD_DEPARTMENT_ID FOREIGN KEY (department_id) REFERENCES DEPARTMENT(department_id),
	CONSTRAINT FK_STD_ACCOUNT_ID FOREIGN KEY (account_id) REFERENCES ACCOUNT(account_id),
	CONSTRAINT FK_STD_CITIZEN_ID FOREIGN KEY (citizenID) REFERENCES USER_INFO(citizenID)
)

CREATE TABLE PUBLISHER(
	publisher_id varchar(10) PRIMARY KEY,
	publisher_name nvarchar(50),
)

CREATE TABLE AUTHOR(
	author_id varchar(10) PRIMARY KEY,
	author_fullname nvarchar(50),
)

CREATE TABLE CATEGORY(
	category_id varchar(10) PRIMARY KEY,
	category_name nvarchar(50),
)
--------
--Is the following trigger syntax correct for automatically inserting data into the publisher, author, and category tables if data is inserted into the 
--book_info table and the data does not exist (by foreign key)
--------

--------
CREATE TABLE BOOK_INFO(
	ISBN varchar(13) PRIMARY KEY,
	title nvarchar(50),
	publisher_id varchar(10),
	author_id varchar(10),
	category_id varchar(10),
	publishingYear int, 
	description nvarchar(1000),--tom tat
	price money,
	quantity int,
	rentable_logic bit, -- default is true(1)--
	exists_logic bit, -- default is true(1)--
	CONSTRAINT FK_AUTHOR_ID FOREIGN KEY (author_id) REFERENCES AUTHOR(author_id),
	CONSTRAINT FK_CATEGORY_ID FOREIGN KEY (category_id) REFERENCES CATEGORY(category_id),
	CONSTRAINT FK_PUBLISH_ID FOREIGN KEY (publisher_id) REFERENCES PUBLISHER(publisher_id),

)

CREATE TABLE INDIVIDUAL(
	code varchar(10) PRIMARY KEY,
	ISBN varchar(13) ,
	location varchar(40),
	available bit ,
	CONSTRAINT FK_ISBN_INDIVIDUAL FOREIGN KEY (ISBN) REFERENCES BOOK_INFO(ISBN),
)


CREATE TABLE IMPORT_RECORD(
	ip_record_id varchar(10) PRIMARY KEY,
	recordDate Date,
	totalPrice Money,
	librarian_id varchar(10),
	CONSTRAINT FK_LIB_ID_IP FOREIGN KEY (librarian_id) REFERENCES LIBRARIAN(librarian_id)
)

CREATE TABLE IMPORT_RECORD_DETAILS(
	ip_record_id varchar(10) PRIMARY KEY,
	ISBN varchar(13),
	quantity int,
	price money,
	CONSTRAINT FK_IMPORT_RECORD_ID FOREIGN KEY (ip_record_id) REFERENCES IMPORT_RECORD(ip_record_id),
	CONSTRAINT FK_ISBN_BOOK FOREIGN KEY (ISBN) REFERENCES BOOK_INFO(ISBN)
)
--THANH LYS
CREATE TABLE LIQUIDATION_RECORD(
	liquidation_id varchar(10) PRIMARY KEY,
	record_date Date,
	total_Quantity int,
	librarian_id varchar(10),
	CONSTRAINT FK_LIB_ID_LQDT FOREIGN KEY (librarian_id) REFERENCES LIBRARIAN(librarian_id),

)
CREATE TABLE LIQUIDATION(
	liquidation_id varchar(10),
	code varchar(10),
	CONSTRAINT FK_CODE_INDIVIDUAL_LQDT FOREIGN KEY (code) REFERENCES INDIVIDUAL(code),
	CONSTRAINT FK_LIQUIDATION_ID FOREIGN KEY (liquidation_id) REFERENCES LIQUIDATION_RECORD(liquidation_id),

)


CREATE TABLE LOANSLIP (
	loan_id varchar(10) PRIMARY KEY,
	loan_date Date,
	librarian_id varchar(10),
	reader_id varchar(10),
	CONSTRAINT FK_LIB_ID_LOAN FOREIGN KEY (librarian_id) REFERENCES LIBRARIAN(librarian_id),
	CONSTRAINT FK_READER_ID_LOAN FOREIGN KEY (reader_id) REFERENCES READER(reader_id),
)

CREATE TABLE STATUS_OF_BOOK(
	status_id varchar(10) PRIMARY KEY,
	description_status varchar(50),
)
CREATE TABLE LOAN_DETAILS (
	loan_id varchar(10) PRIMARY KEY,
	CONSTRAINT FK_LOAN_ID FOREIGN KEY (loan_id) REFERENCES LOANSLIP(loan_id),
	status_id varchar(10),
	CONSTRAINT FK_STATUS_ID_LOAN_DETAILS FOREIGN KEY (status_id) REFERENCES STATUS_OF_BOOK(status_id),
	code varchar(10), 
	CONSTRAINT FK_CODE_INDIVIDUAL FOREIGN KEY(code) REFERENCES INDIVIDUAL(code),
	
)

CREATE TABLE PENALTY_LIST (
	p_id varchar(10) PRIMARY KEY,
	solution varchar(100),
)

CREATE TABLE PENALTY_RECORD(
	p_record_id varchar(10) PRIMARY KEY,
	record_date Date,
	p_id varchar(10),
	note varchar(100),
	CONSTRAINT FK_PENALTY_RECORD FOREIGN KEY (p_id) REFERENCES PENALTY_LIST(p_id),
	librarian_id varchar(10),
	reader_id varchar(10),
	CONSTRAINT FK_LIB_ID_PENALTY FOREIGN KEY (librarian_id) REFERENCES LIBRARIAN(librarian_id),
	CONSTRAINT FK_READER_ID_LOAN_PENALTY FOREIGN KEY (reader_id) REFERENCES READER(reader_id),
)