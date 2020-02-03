CREATE TABLE `Status` (
    `ID` INT NOT NULL AUTO_INCREMENT,
    `Type` VARCHAR(30) NOT NULL,
    PRIMARY KEY (`ID`)
);
INSERT INTO status (id, type) VALUES (1,'Admin');
INSERT INTO status (id, type) VALUES (2,'Client'); 

CREATE TABLE `Person` (
    `ID` INT NOT NULL AUTO_INCREMENT,
    `Email` VARCHAR(30) NOT NULL,
    `Password` VARCHAR(30) NOT NULL,
    `status` INT NOT NULL,
    PRIMARY KEY (`ID`)
);
INSERT INTO person (id, email, password, status) VALUES (1,'Admin.com’, ‘pass’,1');
INSERT INTO person (id, email, password, status) VALUES (2,'Client',
‘123’,2); 


CREATE TABLE `Cinema` (
    `ID` INT NOT NULL AUTO_INCREMENT,
    `Name` VARCHAR(30) NOT NULL,
    PRIMARY KEY (`ID`)
);

INSERT INTO cinema (id, name) VALUES (1,'cinema’);


CREATE TABLE `Movie` (
    `ID` INT NOT NULL AUTO_INCREMENT,
    `Name` VARCHAR(30) NOT NULL,
    `Description` TEXT NOT NULL,
    PRIMARY KEY (`ID`)
);

INSERT INTO Movie (id, name, description) VALUES (1 ‘movie’,’blabla’');


CREATE TABLE `Session` (
    `ID` INT NOT NULL AUTO_INCREMENT,
    `Price` VARCHAR(5) NOT NULL,
    `date_time` varchar(11),
    `movie` INT NOT NULL,
    `cinema` INT NOT NULL,
    PRIMARY KEY (`ID`)
);

INSERT INTO session (id, price, date_time, movie,cinema) VALUES (1,300, ’29.01 18.00’,1,1);


ALTER TABLE `Person` ADD CONSTRAINT `Person_fk0` FOREIGN KEY (`status`) REFERENCES `Status`(`ID`);

ALTER TABLE `Session` ADD CONSTRAINT `Session_fk0` FOREIGN KEY (`movie`) REFERENCES `Movie`(`ID`);

ALTER TABLE `Session` ADD CONSTRAINT `Session_fk1` FOREIGN KEY (`cinema`) REFERENCES `Cinema`(`ID`);

