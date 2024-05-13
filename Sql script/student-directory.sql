CREATE DATABASE  IF NOT EXISTS `student_directory`;
USE `student_directory`;


DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile_no` bigint DEFAULT NULL,
  `course_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 ;

INSERT INTO `student` VALUES 
	(1,'Gowthami','Govindaraj','gow123@gmail.com', 9715152324,'Computer Science'),
	(2,'Yashmika','TG','yashmi123@gmail.com',9688724501,'Mechanical'),
    (3,'Priya','Dharshini','priya123@gmail.com',9856347810,'Mechanical'),
	(4,'Tamil','Selvan','ts123@gmail.com',9856453848,'Civil'),
    (5,'Moulika','Chandana','moulika23@gmail.com',8674937356,'Electrical');

