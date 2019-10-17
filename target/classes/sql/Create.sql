---create user ------
USE mysql;

INSERT INTO user (Host, User, Password, Select_priv, Insert_priv, Update_priv, Delete_priv, Create_priv, Drop_priv, Reload_priv, Shutdown_priv, Process_priv, File_priv, Grant_priv, References_priv, Index_priv, Alter_priv, Show_db_priv, Super_priv, Create_tmp_table_priv, Lock_tables_priv, Execute_priv, Repl_slave_priv, Repl_client_priv, Create_view_priv, Show_view_priv, Create_routine_priv, Alter_routine_priv, Create_user_priv, Event_priv, Trigger_priv, Create_tablespace_priv, ssl_type, ssl_cipher, x509_issuer, x509_subject, max_questions, max_updates, max_connections, max_user_connections, plugin, authentication_string, password_expired) VALUES ('localhost', 'ssm', PASSWORD('123456'), 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', 'Y', '', '', '', '', 0, 0, 0, 0, 'mysql_native_password', '', 'N');


FLUSH PRIVILEGES;

---create database-----
CREATE DATABASE IF NOT EXISTS dev DEFAULT CHARSET utf8 COLLATE utf8_generalL_ci;

USE DEV;
---create table ----
CREATE TABLE IF NOT EXISTS `COM_DEPARTMENT`(
	`DEP_NO` VARCHAR(10) NOT NULL,
	`CUR_DEP_NO` VARCHAR(10) NOT NULL,
	`DEP_NAME` VARCHAR(50),
	`DEP_TYPE` VARCHAR(2),
	`UP_DEP_NO` VARCHAR(10),
	`USE_YN` VARCHAR(1),
	PRIMARY KEY (`DEP_NO`)
)ENGINE=InnoDB DEFAULT CHARSET=UTF8;
