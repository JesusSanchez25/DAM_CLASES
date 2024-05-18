-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema programacioncompras
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema programacioncompras
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `programacioncompras` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `programacioncompras` ;

-- -----------------------------------------------------
-- Table `programacioncompras`.`clients`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `programacioncompras`.`clients` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(200) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `programacioncompras`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `programacioncompras`.`products` (
  `id` INT NOT NULL,
  `tittle` VARCHAR(45) NOT NULL,
  `description` VARCHAR(300) NULL DEFAULT NULL,
  `price` INT NULL DEFAULT NULL,
  `rating` DOUBLE NULL DEFAULT NULL,
  `stock` INT NULL DEFAULT NULL,
  `brand` VARCHAR(45) NOT NULL,
  `category` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `programacioncompras`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `programacioncompras`.`orders` (
  `id_c` INT NOT NULL,
  `id_p` INT NOT NULL,
  `amount` INT NOT NULL,
  PRIMARY KEY (`id_c`, `id_p`),
  INDEX `id_p_fk_idx` (`id_p` ASC) VISIBLE,
  INDEX `id_c_fk_idx` (`id_c` ASC) VISIBLE,
  CONSTRAINT `id_c_fk`
    FOREIGN KEY (`id_c`)
    REFERENCES `programacioncompras`.`clients` (`id`),
  CONSTRAINT `id_p_fk`
    FOREIGN KEY (`id_p`)
    REFERENCES `programacioncompras`.`products` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
