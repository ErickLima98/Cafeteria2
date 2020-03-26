-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.3.13-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.3.0.5771
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for cafeteria2
CREATE DATABASE IF NOT EXISTS `cafeteria2` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `cafeteria2`;

-- Dumping structure for function cafeteria2.crearUsuario
DELIMITER //
CREATE FUNCTION `crearUsuario`(
	`id` INT,
	`nombre` VARCHAR(200),
	`contra` BLOB,
	`Accesos_id` INT
) RETURNS int(11)
BEGIN
    DECLARE cuenta INT DEFAULT -1;
    SELECT COUNT(*) FROM usuario WHERE Nombre=nombre INTO cuenta;
    IF cuenta=0 THEN
		INSERT INTO usuario (Nombre, Contrasenia, Acceso_idAcceso) VALUES (nombre,MD5(contra),Accesos_id);
      	RETURN 1;
	ELSE
		RETURN 0;
	END IF;
	RETURN -1;
END//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
