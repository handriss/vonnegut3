DROP TABLE IF EXISTS book;

CREATE TABLE book
  (
  id INT(11) PRIMARY KEY AUTO_INCREMENT,
  status VARCHAR(40),
  book_id VARCHAR(30),
  product_id DECIMAL,
  author VARCHAR(200),
  title VARCHAR(200),
  year_of_publication INT,
  publisher VARCHAR(200),
  barcode VARCHAR(14),
  storage_place VARCHAR(50),
  price INT,
  date_of_upload DATETIME,
  date_of_shop_sale DATETIME DEFAULT NULL,
  shop_id VARCHAR(100),
  weight FLOAT(4),
  number_of_pages INT,
  cover VARCHAR(100),
  book_condition VARCHAR(20),
  more_info VARCHAR(160),
  uploader VARCHAR(100),
  category VARCHAR(250),
  isbn VARCHAR(13)
);