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

-- Dumping structure for function cafeteria2.insertarAlimento
DELIMITER //
CREATE FUNCTION `insertarAlimento`() RETURNS varchar(40) CHARSET utf8
BEGIN
	DECLARE Exis Varchar(40) DEFAULT ' ';
	IF EXISTS (select * from inventario inv where (inv.Nombre = NombreAli and inv.Existencias = Exis and inv.Precio_venta = precio)) 
	THEN
	set Exis = 'Si';
	else
	set Exis='NO';
	END IF;
	return Exis;
END//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
