    DROP TABLE IF EXISTS USERS;

    CREATE TABLE USERS (
      id INT AUTO_INCREMENT  PRIMARY KEY,
      user_Name VARCHAR(250) NOT NULL,
      dept VARCHAR(250) NOT NULL,
      address VARCHAR(250) DEFAULT NULL
    );

    INSERT INTO USERS (user_Name, dept,address) VALUES
      ('Aliko', 'HR', 'VJA'),
      ('Bill', 'GM', 'BLR'),
      ('Folrunsho', 'DEV', 'KAKI'),
      ('Pavan', 'DEV', 'VSKP'),
      ('Kumar', 'QA', 'BPA'),
      ('Siri', 'AUTO', 'MAS');