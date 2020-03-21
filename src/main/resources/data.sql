DROP TABLE IF EXISTS BOOK;
 
CREATE TABLE BOOK (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  author VARCHAR(250) NOT NULL,
  name VARCHAR(250) NOT NULL,
  category VARCHAR(250) DEFAULT NULL,
  publishdate DATE NOT NULL
);
 
INSERT INTO BOOK (author, name, category, publishdate) VALUES
  
	  ('Victor Hugo', 'Miserables', 'FICTION', '1987-9-11'),
	  ('Tolstoy', 'War and Peace', 'FICTION', '1983-9-11');
