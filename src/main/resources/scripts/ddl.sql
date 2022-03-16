DROP TABLE IF EXISTS users;
CREATE TABLE users(
                      id uuid DEFAULT random_uuid() PRIMARY KEY,
                      name VARCHAR(200) not null,
                      email VARCHAR(60) NOT NULL,
                      password VARCHAR(60) NOT NULL,
                      enabled BOOLEAN,
                      created TIMESTAMP,
                      modified TIMESTAMP
);

DROP TABLE IF EXISTS phone;

CREATE TABLE phone(
                       id INT AUTO_INCREMENT  PRIMARY KEY,
                       user_id VARCHAR(200) NOT NULL,
                       phone_number VARCHAR(20) NOT NULL,
                       city_code VARCHAR(5) NOT NULL,
                       country_code VARCHAR(5) NOT NULL
);

DROP TABLE IF EXISTS user_session;

CREATE TABLE user_session(
                      id INT AUTO_INCREMENT  PRIMARY KEY,
                      user_id VARCHAR(200) NOT NULL,
                      last_Login TIMESTAMP NOT NULL,
                      token VARCHAR(500) NOT NULL
);

DROP TABLE IF EXISTS token_authorization;

CREATE TABLE token_authorization(
                             id INT AUTO_INCREMENT  PRIMARY KEY,
                             token VARCHAR(200) NOT NULL
);

insert into token_authorization(token) values('ueyuy-ueyweyu-iueii-ieuiu');
