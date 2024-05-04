-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: payroll
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empattendance`
--

DROP TABLE IF EXISTS `empattendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empattendance` (
  `aid` int NOT NULL AUTO_INCREMENT,
  `empid` int NOT NULL,
  `othours` int DEFAULT NULL,
  `npdays` int DEFAULT NULL,
  PRIMARY KEY (`aid`),
  KEY `empid` (`empid`),
  CONSTRAINT `empattendance_ibfk_1` FOREIGN KEY (`empid`) REFERENCES `employee` (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empattendance`
--

LOCK TABLES `empattendance` WRITE;
/*!40000 ALTER TABLE `empattendance` DISABLE KEYS */;
INSERT INTO `empattendance` VALUES (1,1,33,17),(2,2,12,3),(3,3,0,0),(4,6,5,1);
/*!40000 ALTER TABLE `empattendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `empid` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `dob` varchar(20) DEFAULT NULL,
  `contactno` int NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `datehired` varchar(20) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(25) NOT NULL,
  `department` varchar(25) NOT NULL,
  `designation` varchar(50) NOT NULL,
  `basicsal` decimal(10,2) NOT NULL,
  PRIMARY KEY (`empid`),
  UNIQUE KEY `contactno` (`contactno`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'kumal','illankoon','2002-04-18',123123123,'moratuwa','Male','2023-10-10','example@gmail.com','admin','Item 3','CEO',205.02),(2,'jane','perera','2002-04-19',132132132,'Kurunagala','Female','2023-10-06','jane@gmail.com','jojo12','Sales','Secretary',750.00),(3,'bob','perterson','1995-10-15',14321432,'Colombo','Male','2022-10-07','bob@gmail.com','bob123','Item 2','Sales Manager',400.00),(6,'nipul','kanishka','2023-10-11',1234567890,'Kelaniya','Male','2023-10-13','nipul@gmail.com','nippa12','Marketing','Salesman',1050.00),(8,'ashnika','silva','2023-10-05',1236567890,'kelaniya','Male','2023-10-05','asdas@gmail.com','123456','Marketing','sales',10000.00);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pay_roll`
--

DROP TABLE IF EXISTS `pay_roll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pay_roll` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `empid` int NOT NULL,
  `datecalculated` varchar(25) NOT NULL,
  `tot_allow` float DEFAULT NULL,
  `tot_deduction` float DEFAULT NULL,
  `gross_sal` float NOT NULL,
  `netsal` float NOT NULL,
  PRIMARY KEY (`pid`),
  KEY `empid` (`empid`),
  CONSTRAINT `pay_roll_ibfk_1` FOREIGN KEY (`empid`) REFERENCES `employee` (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pay_roll`
--

LOCK TABLES `pay_roll` WRITE;
/*!40000 ALTER TABLE `pay_roll` DISABLE KEYS */;
INSERT INTO `pay_roll` VALUES (1,1,'2023-10-05',80,13.4667,181,167.533),(2,2,'2023-10-05',194,75,944,869),(3,2,'2023-10-05',230,175,980,805),(4,1,'2023-10-05',0,0,0,0),(5,1,'2023-10-05',120,27.336,325.02,297.684),(6,6,'2023-10-05',150,85,1200,1115);
/*!40000 ALTER TABLE `pay_roll` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payroll_admin`
--

DROP TABLE IF EXISTS `payroll_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payroll_admin` (
  `PRA_id` int NOT NULL AUTO_INCREMENT,
  `PRA_name` varchar(20) DEFAULT NULL,
  `PRA_username` varchar(50) DEFAULT NULL,
  `PRA_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`PRA_id`),
  UNIQUE KEY `PRA_username` (`PRA_username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payroll_admin`
--

LOCK TABLES `payroll_admin` WRITE;
/*!40000 ALTER TABLE `payroll_admin` DISABLE KEYS */;
INSERT INTO `payroll_admin` VALUES (1,'kumal','kumal12','admin');
/*!40000 ALTER TABLE `payroll_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary` (
  `salid` int NOT NULL AUTO_INCREMENT,
  `empid` int DEFAULT NULL,
  `basicsal` float NOT NULL,
  `overtime_rate` float NOT NULL,
  `bonus` float DEFAULT NULL,
  `other` float DEFAULT NULL,
  `managedby` varchar(25) NOT NULL,
  `deduction` float DEFAULT NULL,
  `deduction_reason` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`salid`),
  KEY `empid` (`empid`),
  CONSTRAINT `salary_ibfk_1` FOREIGN KEY (`empid`) REFERENCES `employee` (`empid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,3,400,10,0,0,'admin',10,'0'),(2,1,101,15,0,0,'admin',0,''),(3,2,750,15,50,0,'kumal12',100,'Unpaid Tax');
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-05 19:54:22
