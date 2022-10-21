CREATE TABLE products
(
    product_id   BINARY(16) PRIMARY KEY,
    product_name VARCHAR(20) NOT NULL,
    category     VARCHAR(50) NOT NULL,
    price        bigint      NOT NULL,
    description  VARCHAR(500) DEFAULT NULL,
    created_at   datetime(6) NOT NULL,
    updated_at   datetime(6)  DEFAULT NULL
);


CREATE TABLE customers
(
    customer_id   BINARY(16) PRIMARY KEY,
    name          varchar(20) NOT NULL,
    email         varchar(50) NOT NULL,
    last_login_at datetime             DEFAULT NULL,
    created_at    datetime    NOT NULL DEFAULT CURRENT_TIMESTAMP(),
    CONSTRAINT unq_user_email UNIQUE (email)
);
INSERT INTO customers(customer_id, name, email) VALUES (UUID_TO_BIN(UUID()), 'tester00', 'test00@gmail.com');
INSERT INTO customers(customer_id, name, email) VALUES (UUID_TO_BIN(UUID()), 'tester01', 'test01@gmail.com');
INSERT INTO customers(customer_id, name, email) VALUES (UUID_TO_BIN(UUID()), 'tester02', 'test02@gmail.com');