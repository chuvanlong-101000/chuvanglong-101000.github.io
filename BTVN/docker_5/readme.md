```sql 
CREATE TABLE PET_SHOP
```

```sql
CREATE TABLE customer
(
customer_id INT PRIMARY KEY,
name varchar(30) NOT NULL,
email varchar(90) NOT NULL,
password varchar(30) NOT NULL,
address varchar(50) NOT NULL,
avatar text
)
```

```sql
CREATE TABLE address
(
address_id INT PRIMARY KEY,
address varchar(90) NOT NULL
)
```

```sql
CREATE TABLE cod_address
(
address_id INT NOT NULL,
customer_id INT NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
FOREIGN KEY (address_id) REFERENCES address(address_id)
)
```

```sql
CREATE TABLE brand (
brand_id INT PRIMARY KEY,
name varchar(30) NOT NULL,
started_year YEAR,
avatar text
)
```

```sql
CREATE TABLE category
(
category_id INT PRIMARY KEY,
name varchar(30) NOT NULL
)
```

```sql
CREATE TABLE type
(
type_id INT PRIMARY KEY,
category_id INT NOT NULL,
name varchar(30) NOT NULL,
description TEXT NOT NULL,
FOREIGN KEY (category_id) REFERENCES category(category_id)
)
```

```sql
CREATE TABLE product
(
product_id INT PRIMARY KEY,
name varchar(90) NOT NULL,
brand_id INT,
type_id INT NOT NULL,
avatar text NOT NULL,
FOREIGN KEY (brand_id) REFERENCES brand(brand_id),
FOREIGN KEY (type_id) REFERENCES type(type_id)
)
```

```sql
CREATE TABLE cart
(
cart_id INT PRIMARY KEY,
customer_id INT NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
)
```

```sql
CREATE TABLE item
(
item_id INT PRIMARY KEY,
amount BIGINT NOT NULL,
product_id INT NOT NULL,
FOREIGN KEY (product_id) REFERENCES product(product_id)
)
```

```sql
CREATE TABLE cart_item
(
item_id INT NOT NULL,
cart_id INT NOT NULL,
FOREIGN KEY (item_id) REFERENCES item(item_id),
FOREIGN KEY (cart_id) REFERENCES cart(cart_id)
)
```

```sql
CREATE TABLE order_table
(
order_id INT PRIMARY KEY,
customer_id INT NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
status ENUM ('verifing','transporting','completed') NOT NULL,
payment_method ENUM ('online shoping','CoD') NOT NULL,
created_date DATE NOT NULL,
verified_date DATE,
completed_date DATE,
note VARCHAR(150)
)
```

```sql
CREATE TABLE voucher
(
voucher_id INT PRIMARY KEY,
discount INT NOT NULL,
description VARCHAR(90)
)
```

```sql
CREATE TABLE order_voucher
(
order_id INT NOT NULL,
voucher_id INT NOT NULL,
FOREIGN KEY (order_id) REFERENCES order_table(order_id),
FOREIGN KEY (voucher_id) REFERENCES voucher(voucher_id)
)
```

```sql
CREATE TABLE order_item
(
item_id INT NOT NULL,
order_id INT NOT NULL,
FOREIGN KEY (item_id) REFERENCES item(item_id),
FOREIGN KEY (order_id) REFERENCES order_table(order_id)
)
```
