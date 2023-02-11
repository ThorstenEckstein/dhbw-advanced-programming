CREATE TABLE IF NOT EXISTS USERS
(
    id int NOT NULL,
    first_name varchar(100) NOT NULL,
    last_name  varchar(100) NOT NULL,
    Nickname   varchar(200),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ACCOUNTS
(
    id         int          NOT NULL,
    number     varchar(10)  NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO USERS VALUES (1, 'Max', 'Mutzke', null)
INSERT INTO USERS VALUES (2, 'Mark', 'Forster', null)
INSERT INTO USERS VALUES (3, 'Herbert', 'Grönemeyer', null)

INSERT INTO ACCOUNTS VALUES (1, '1234567890')
INSERT INTO ACCOUNTS VALUES (2, '0987654321')
INSERT INTO ACCOUNTS VALUES (3, '8822773366')

SELECT
   u.ID,
   u.LAST_NAME,
   a.NUMBER
  FROM USERS u
  JOIN ACCOUNTS a
    ON u.id = a.id
