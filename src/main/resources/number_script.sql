-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    
-- ------------------------------------------------------
-- Server version	8.0.18



-- database : test

-- 
-- Table structure for table `number_value`
--

DROP TABLE IF EXISTS `number_value`;

CREATE TABLE `number_value` (
  `id` int(11) NOT NULL,
  `value` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `number`
--

LOCK TABLES `number_value` WRITE;
INSERT INTO `number_value` VALUES (0,0);
UNLOCK TABLES;
