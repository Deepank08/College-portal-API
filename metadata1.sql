-- MySQL Script generated by MySQL Workbench
-- Monday 15 May 2017 10:52:05 AM IST
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema users
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema users
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `users` DEFAULT CHARACTER SET utf8 ;
USE `users` ;

-- -----------------------------------------------------
-- Table `users`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users`.`user` (
  `name` VARCHAR(50) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `users`.`branchinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users`.`branchinfo` (
  `branchid` VARCHAR(4) NOT NULL,
  `branchname` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`branchid`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `users`.`courseinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users`.`courseinfo` (
  `courseid` VARCHAR(5) NOT NULL,
  `coursename` VARCHAR(45) NULL,
  PRIMARY KEY (`courseid`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `users`.`studentinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users`.`studentinfo` (
  `rollno` VARCHAR(10) NOT NULL,
  `year` VARCHAR(45) NOT NULL,
  `picture` VARCHAR(45) NULL,
  `user_username` VARCHAR(45) NOT NULL,
  `branchinfo_branchid` VARCHAR(4) NOT NULL,
  `courseinfo_courseid` VARCHAR(5) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`rollno`),
  INDEX `fk_studentinfo_user_idx` (`user_username` ASC),
  INDEX `fk_studentinfo_branchinfo1_idx` (`branchinfo_branchid` ASC),
  INDEX `fk_studentinfo_courseinfo1_idx` (`courseinfo_courseid` ASC),
  CONSTRAINT `fk_studentinfo_user`
    FOREIGN KEY (`user_username`)
    REFERENCES `users`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_studentinfo_branchinfo1`
    FOREIGN KEY (`branchinfo_branchid`)
    REFERENCES `users`.`branchinfo` (`branchid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_studentinfo_courseinfo1`
    FOREIGN KEY (`courseinfo_courseid`)
    REFERENCES `users`.`courseinfo` (`courseid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `users`.`Profinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users`.`Profinfo` (
  `profid` VARCHAR(10) NOT NULL,
  `designation` VARCHAR(45) NOT NULL,
  `picture` VARCHAR(45) NULL,
  `user_username` VARCHAR(45) NOT NULL,
  `branchinfo_branchid` VARCHAR(4) NOT NULL,
  `courseinfo_courseid` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`profid`),
  INDEX `fk_Profinfo_user1_idx` (`user_username` ASC),
  INDEX `fk_Profinfo_branchinfo1_idx` (`branchinfo_branchid` ASC),
  INDEX `fk_Profinfo_courseinfo1_idx` (`courseinfo_courseid` ASC),
  CONSTRAINT `fk_Profinfo_user1`
    FOREIGN KEY (`user_username`)
    REFERENCES `users`.`user` (`username`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profinfo_branchinfo1`
    FOREIGN KEY (`branchinfo_branchid`)
    REFERENCES `users`.`branchinfo` (`branchid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Profinfo_courseinfo1`
    FOREIGN KEY (`courseinfo_courseid`)
    REFERENCES `users`.`courseinfo` (`courseid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
