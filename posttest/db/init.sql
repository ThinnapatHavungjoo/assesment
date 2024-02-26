-- Drop Table if they are existed
DROP TABLE IF EXISTS user_ticket ;
DROP TABLE IF EXISTS lottery ;

CREATE TABLE user_ticket (
    user_Id SERIAL PRIMARY KEY,
    user_Name VARCHAR(100) NOT NULL,
    user_Email VARCHAR(50) NOT NULL,
    user_Password VARCHAR (12) NOT NULL,
);

CREATE TABLE lottery (
    lotto_Id SERIAL PRIMARY KEY,
    lotto_Number VARCHAR(6) NOT NULL,
    lotto_Status VARCHAR ("Available","On_Hold", "Completed" ) NOT NULL,
);

CREATE TABLE Administrator (
    admin_Id SERIAL PRIMARY KEY,
    admin_Name VARCHAR NOT NULL,
    admin_Email VARCHAR NOT NULL,
    admin_Password VARCHAR NOT NULL,
);

-- Initial Data
INSERT INTO userProfile(user_Name, user_Email, user_Password) VALUES ('Thinnapat Havungjoo', 'film.thongjum1997@gmail.com', "s3xyboi69");
INSERT INTO Lotto(lotto_Number,lotto_Status) VALUES ('123456', "Available");
INSERT INTO Administrator(admin_Name,admin_Email,admin_Password) VALUES ('admin','hottestadmin@gmail.com','misterhotadmin');