DROP TABLE students IF EXISTS;
CREATE TABLE IF NOT EXISTS students (id bigserial, name VARCHAR(255), mark VARCHAR(255), PRIMARY KEY (id));
INSERT INTO students (name,mark) VALUES ('BOB', 'Physics'), ('BILL', 'Architecture'), ('MARY', 'Designer');
