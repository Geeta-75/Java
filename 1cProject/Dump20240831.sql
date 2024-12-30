CREATE DATABASE  IF NOT EXISTS `1cproject` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `1cproject`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: 1cproject
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `courseID` int NOT NULL AUTO_INCREMENT,
  `courseName` varchar(45) NOT NULL,
  `courseCreadits` int NOT NULL,
  `duration` int NOT NULL,
  `capacity` int DEFAULT NULL,
  `cFees` int DEFAULT '0',
  PRIMARY KEY (`courseID`)
) ENGINE=InnoDB AUTO_INCREMENT=405 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (201,'Digital Marketing',4,6,400,25000),(202,'UI/UX',2,8,250,30000),(203,'Information Technology',8,12,200,40000),(204,'Python',6,8,500,35000),(404,'Not enrolled',0,0,0,0);
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cprovider`
--

DROP TABLE IF EXISTS `cprovider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cprovider` (
  `cProviderID` int NOT NULL AUTO_INCREMENT,
  `cProviderName` varchar(50) NOT NULL,
  `cProviderCon` bigint unsigned NOT NULL,
  `cProviderPass` varchar(125) NOT NULL,
  PRIMARY KEY (`cProviderID`),
  UNIQUE KEY `cProviderCon_UNIQUE` (`cProviderCon`)
) ENGINE=InnoDB AUTO_INCREMENT=202434 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cprovider`
--

LOCK TABLES `cprovider` WRITE;
/*!40000 ALTER TABLE `cprovider` DISABLE KEYS */;
INSERT INTO `cprovider` VALUES (202416,'Rohit Tomar',6269586250,'$2a$10$teoLcQFNBuYEOiJe9poJWunv94212OTPPPkB9r7b.DQGzwBB5hbdq'),(202417,'Chhotu ',9009528448,'$2a$10$I9VhrIWwl9kBiribs.xqC.eyVGqZHS4Y4NrxY4hfaXF170BzO.AkK'),(202418,'kasdjbckajbdv',9346654321,'$2a$10$rQuNjEEdao0BY3ot/OEJtu7CNvuYJCmrBLZnq2LWrWsGi5EUD/ECu'),(202419,'nevjnfvd',6754534543,'$2a$10$YnOAtuUuRFMhpOdI4miQlOFQ3TBvd1J2wiAsoEjGCSVj.y6aU.Vn6'),(202420,'Shivraj Singh',7722974467,'$2a$10$6yvq3oMW92ImF6YlysoaJuA4gDDRh6/rNSTLGVj0aplJMNZEJRy9K'),(202421,'KP Singh',9876543206,'$2a$10$AWONGX1UNNp4LA4qBYhILuqqExOEzPnD3ipVPgHhU6qBoIdz3mJ6C'),(202422,'Shivraj',9926985537,'$2a$10$0xFN6YI/J4ebARTZeSP39OXpvMgHm1zPjYFEolhW41a63A2uDvE.m'),(202423,'Rahul',6268697270,'$2a$10$HGGbt910kNKNEWw8e87OnOADQWFx3.kiGM8rQaAel87/9ac6g3HiC'),(202424,'Harshvardhan',7879020230,'$2a$10$WCea.lxWPkNXcLGUTgN1DO5Eh9L96xYPBTt/ZFTSlXk8DQPHnppei'),(202425,'Shivraj',9165369578,'$2a$10$iXA5bNnUpbuPSz4I6pZPxecPoqo8NbbWBt/6VfmnylxMDJluR5mHi'),(202426,'Azhar',7089129203,'$2a$10$T0vxQ5pe9naU9WSkLCPKseBoOj9jCB9DZwMfMWFQy7z6yDihsjLJ.'),(202427,'Yuvraj Singh',9981239422,'$2a$10$cFm6XETefF3w0su.YNkFTeXL/L/GzW7S4UTGP00BFfMXvyKz9ducK'),(202428,'Nupur',9685970128,'$2a$10$9Zdu3Nhxx6fOmF6Gyp8vcOoMc7bfwNjgjBFLURW/Zpg.SuCg.hMci'),(202429,'niya',9826535145,'$2a$10$zCjkBMQqYsCSXChs7z5cCugrObJR3RDKzwgqcEd5GXRMDHPLOEj7G'),(202431,'Rajeev Gandhi',7722974444,'$2a$10$WJ0AH2nDGiQ1a41Xr91Ex.4XceSxfWs3hnm7kLseBR5YRF185Mu3i'),(202432,'Nikita',8888888888,'$2a$10$p1F20vKRse/QZTLRI./v7OrbcrS35cqRG9FVYXFBY5n9ePFXXrGBW'),(202433,'Deepak Chouhan',8839560000,'$2a$10$Gxxxfo9XaDUiiF12jt791ueVVp6QnPt3hHedo10anqI7MpOGgoney');
/*!40000 ALTER TABLE `cprovider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `studentID` int NOT NULL AUTO_INCREMENT,
  `studentName` varchar(45) NOT NULL,
  `stRoll` int NOT NULL,
  `stCon` bigint DEFAULT NULL,
  `cProviderID` int DEFAULT NULL,
  `courseID` int DEFAULT '404',
  `stCreadits` int DEFAULT '0',
  PRIMARY KEY (`studentID`),
  UNIQUE KEY `stRoll_UNIQUE` (`stRoll`),
  UNIQUE KEY `stCon_UNIQUE` (`stCon`),
  KEY `cProviderId` (`cProviderID`),
  KEY `student_ibfk_2` (`courseID`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`cProviderID`) REFERENCES `cprovider` (`cProviderID`),
  CONSTRAINT `student_ibfk_2` FOREIGN KEY (`courseID`) REFERENCES `courses` (`courseID`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (103,'Vijay',2342,9765434567,202423,201,0),(104,'Rajveer',5544,9876543425,202425,201,0),(106,'Raghav Singh',2536,7722974467,202425,203,0),(107,'Viraj Chouhan',2435,9926985537,202425,404,0),(109,'dsxrdxf',5432,8765787654,202427,404,0),(110,'fctfcxtf',9878,7654567276,202427,404,0),(111,'Ravi',5580,9926985535,202425,201,0),(112,'Nikita Yadav',7658,9993313343,202428,203,0),(115,'Nupur jefnsid',4055,9685970128,202425,404,0),(116,'Bhanu',7722,7722974466,202425,202,0),(118,'niya',4321,9826535145,202429,203,0),(121,'Divya',2222,8888888888,202425,203,0),(122,'Vijay Malya',1111,9999999999,202425,203,0),(123,'sapna',6666,6666666666,202432,202,0),(124,'jhfhd',8245,8767876765,202425,404,0),(125,'yuvraj shjb',8192,7654567876,202425,404,0),(126,'Deepak Jadhav aieufhauh',6655,7224920377,202425,404,0),(127,'Kunwar Vivek Singh Tomar',9302,9302602895,202425,404,0);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-31  9:12:38
