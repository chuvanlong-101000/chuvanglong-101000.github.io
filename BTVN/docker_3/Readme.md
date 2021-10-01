Xây dựng database quản lí thư viện :
Table 1 : Sách(id, tên, số trang, thể loại, tác giả, năm xuất bản, nhà xuất bản, tính trạng, vị trí)

CREATE DATABASE library
```sql
CREATE TABLE book (
    book_id INT PRIMARY KEY,
    title CHAR(90) NOT NULL,
    category CHAR(90) NOT NULL,
    author CHAR(90),
    published_date DATE,
    publisher CHAR(90),
    book_status CHAR(30) NOT NULL,
    locate CHAR(30) NOT NULL
)

Table 2 : Thể loại(id, tên thể loại)

CREATE TABLE category(
    category_id INT PRIMARY KEY,
    category CHAR(30)
)


Table 3 : Tác giả(id, tên , ngày sinh, quê quán, mô tả)

CREATE TABLE author(
    author_id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    birth_date DATE,
    origin VARCHAR(30),
    description TEXT
)

Table 4 : sách_tác giả (id sách, id tác giả)

CREATE TABLE book_author(
    author_id INT,
    book_id INT,
    FOREIGN KEY(author_id) REFERENCES author(author_id),
    FOREIGN KEY(book_id) REFERENCES book(book_id)
)

Table 5 : Tái bản(id, id_sách, năm)

CREATE TABLE reprint (
    reprint_id INT PRIMARY KEY,
    year YEAR,
	book_id INT,
    FOREIGN KEY (book_id) REFERENCES book(book_id)
)

Table 6 : Phiếu mượn(id, id_độc giả, id_nhan viên, ngày mượn, ngày hẹn trả)

CREATE TABLE call_card(
    card_id INT PRIMARY KEY,
    customer_id INT,
    employee_id INT,
    rental_date DATE NOT NULL,
    due_date DATE NOT NULL,
    FOREIGN KEY(customer_id) REFERENCES customer(customer_id),
    FOREIGN KEY(employee_id) REFERENCES employee(employee_id)
)

Table 7 : Chi tiết mượn(id_phiếu mượn, id sách, số lượng)

CREATE TABLE rental_detail(
    book_id INT,
    card_id INT,
    amount SMALLINT NOT NULL,
    FOREIGN KEY( card_id) REFERENCES call_card( card_id),
    FOREIGN KEY(book_id) REFERENCES book(book_id)
)

Table 8 : Độc giả(id, tên , ngày sinh, giới tính, địa chỉ, sđt, email)

CREATE TABLE customer(
    customer_id INT PRIMARY KEY,
    NAME VARCHAR(30) NOT NULL,
    birth_date DATE NOT NULL,
    gender CHAR(10),
    adress VARCHAR(90) NOT NULL,
    phone_number TINYINT NOT NULL,
    email VARCHAR(90)
)

Table 9 : Nhân viên(id, tên , ngày sinh, giới tính, địa chỉ, sđt, email,avatar)

CREATE TABLE employee(
    employee_id INT PRIMARY KEY,
    name VARCHAR(30) NOT NULL,
    birth_date DATE NOT NULL,
    gender CHAR(10) NOT NULL,
    adress VARCHAR(90) NOT NULL,
    phone_number TINYINT NOT NULL,
    email VARCHAR(90) NOT NULL,
    avatar text NOT NULL
)

Table 10 : Phiếu trả(id, id phiếu mượn, ngày trả)

CREATE TABLE due_card(
    due_card_id INT PRIMARY KEY,
    card_id INT,
    due_date DATE NOT NULL,
    FOREIGN KEY(card_id) REFERENCES call_card(card_id)
)

![anh3](anh3.png)