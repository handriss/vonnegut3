DROP TABLE IF EXISTS book;

CREATE TABLE book
  (
  id int(11) PRIMARY KEY AUTO_INCREMENT,
  status VARCHAR(40),
  book_id VARCHAR(30),
  product_id VARCHAR(30),
  author VARCHAR(100),
  title VARCHAR(200),
  year_of_publication VARCHAR(100),
  publisher VARCHAR(200),
  barcode VARCHAR(100),
  storage_place VARCHAR(50),
  price VARCHAR(100),
  date_of_shop_sale VARCHAR(100),
  shop_id VARCHAR(100),
  weight VARCHAR(100),
  number_of_pages VARCHAR(100),
  cover VARCHAR(100),
  book_condition VARCHAR(100),
  more_info VARCHAR(100),
  uploader VARCHAR(100),
  category VARCHAR(250),
  isbn VARCHAR(50)
);