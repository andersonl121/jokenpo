-- MySQL Script generated by MySQL Workbench
-- Thu Dec 31 13:18:43 2020
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema jkp1
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `jkp1` ;

-- -----------------------------------------------------
-- Schema jkp1
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jkp1` DEFAULT CHARACTER SET utf8 ;
USE `jkp1` ;

-- -----------------------------------------------------
-- Table `jkp1`.`Partidas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jkp1`.`Partidas` (
  `idPartidas` INT NOT NULL AUTO_INCREMENT,
  `nomeJogador1` VARCHAR(60) NOT NULL,
  `nomeJogador2` VARCHAR(60) NOT NULL,
  `ptsJogador1` TINYINT(1) NOT NULL,
  `ptsJogador2` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idPartidas`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;