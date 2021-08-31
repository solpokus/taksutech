--Setup database environment--

1. CREATE DATABASE taksutech;

2. CREATE USER 'local'@'localhost' IDENTIFIED BY 'password';

3. GRANT ALL PRIVILEGES ON * . * TO 'local'@'localhost';

4. FLUSH PRIVILEGES;

5. Create Table for master status
 CREATE TABLE taksutech.tb_master_status (
	tbms_id int4 NOT NULL,
	tbms_create_date timestamp NULL,
	tbms_update_date timestamp NULL,
	tbms_en varchar(45) NULL,
	tbms_in varchar(45) NULL,
	CONSTRAINT tb_master_status_pkey PRIMARY KEY (tbms_id)
);

6. Sample data for master status
INSERT INTO taksutech.tb_master_status
(tbms_id, tbms_create_date, tbms_update_date, tbms_en, tbms_in)
VALUES(1, now(), NULL, "Active", "Aktif");

INSERT INTO taksutech.tb_master_status
(tbms_id, tbms_create_date, tbms_update_date, tbms_en, tbms_in)
VALUES(2, now(), NULL, "InActive", "Tidak Aktif");

7. Create Table for master member
CREATE TABLE taksutech.tb_master_member (
	tbmm_id int4 NOT NULL,
	tbmm_create_date timestamp NULL,
	tbmm_update_date timestamp NULL,
	tbmm_status int4 NOT NULL, -- tbms_id_parent = 1
	tbmm_email varchar(200) NOT NULL,
	tbmm_firstname varchar(64) NULL,
	tbmm_lastname varchar(64) NULL,
	tbmm_gender varchar(1) NULL, -- M = Male F = Female
	tbmm_phone varchar(128) NULL, -- phone number
	tbmm_dob date NULL, -- date of birth
	tbmm_last_login timestamp NULL, -- date of last login
	CONSTRAINT tb_master_member_pkey PRIMARY KEY (tbmm_id)
);

8. Sample data for master member
INSERT INTO taksutech.tb_master_member
(tbmm_id, tbmm_create_date, tbmm_update_date, tbmm_status, tbmm_email, tbmm_firstname, tbmm_lastname, tbmm_gender, tbmm_phone, tbmm_dob, tbmm_last_login)
VALUES(1, now(), NULL, 1, 'member1@gmail.com', 'member', 'one', 'M', '081234567890', '1990-04-02', NULL);