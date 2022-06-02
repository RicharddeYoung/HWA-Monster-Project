DROP TABLE IF EXISTS `monster_maker` CASCADE;

CREATE TABLE `monster_maker` (
`monster_id` INT AUTO_INCREMENT,
`monster_name` VARCHAR (255) NOT NULL,
`monster_family` VARCHAR (255) NOT NULL,
`monster_diet` VARCHAR (255) NOT NULL,
`monster_flight` BOOLEAN,
`monster_swim` BOOLEAN,
`monster_origin` VARCHAR (255) NOT NULL,
PRIMARY KEY (`monster_id`)
);