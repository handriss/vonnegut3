DROP TABLE IF EXISTS book;

CREATE TABLE book
  (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  status VARCHAR(40),
  book_id VARCHAR(30),
  product_id VARCHAR(40),
  author VARCHAR(100),
  title VARCHAR(200),
  year_of_publication INTEGER,
  publisher VARCHAR(200),
  barcode INTEGER,
  storage_place VARCHAR(50),
  price INTEGER,
  date_of_shop_sale TIMESTAMP,
  shop_id INTEGER,
  weight FLOAT,
  number_of_pages INTEGER,
  cover VARCHAR(100),
  book_condition VARCHAR(100),
  more_info VARCHAR(100),
  uploader VARCHAR(100),
  category VARCHAR(250),
  isbn VARCHAR(14)
);