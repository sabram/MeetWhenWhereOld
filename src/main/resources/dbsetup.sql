-- script to setup database
-- needs to be manually run;
FLUSH PRIVILEGES;
DROP SCHEMA IF EXISTS meetwhenwhere;
CREATE SCHEMA `meetwhenwhere` DEFAULT CHARACTER SET utf8 ;
GRANT SELECT,INSERT,UPDATE,DELETE on `meetwhenwhere`.* to 'meet'@'localhost' IDENTIFIED BY 'me';

use meetwhenwhere;
DROP TABLE IF EXISTS meetings;
CREATE TABLE meetings (
meeting_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(20)
);

