-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: 192.168.48.129    Database: revhitsslportal
-- ------------------------------------------------------
-- Server version	5.1.40-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account_`
--

DROP TABLE IF EXISTS `account_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account_` (
  `accountId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentAccountId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `legalName` varchar(75) DEFAULT NULL,
  `legalId` varchar(75) DEFAULT NULL,
  `legalType` varchar(75) DEFAULT NULL,
  `sicCode` varchar(75) DEFAULT NULL,
  `tickerSymbol` varchar(75) DEFAULT NULL,
  `industry` varchar(75) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `size_` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`accountId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account_`
--

LOCK TABLES `account_` WRITE;
/*!40000 ALTER TABLE `account_` DISABLE KEYS */;
INSERT INTO `account_` VALUES (20157,20155,0,'','2016-05-04 07:40:09','2016-05-04 07:40:09',0,'Portal Reclutamiento','','','','','','','','');
/*!40000 ALTER TABLE `account_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `actividadcronograma`
--

DROP TABLE IF EXISTS `actividadcronograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actividadcronograma` (
  `actividadCronogramaId` bigint(20) DEFAULT NULL,
  `cronogramaId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `fechaInicio` datetime DEFAULT NULL,
  `fechaFin` datetime DEFAULT NULL,
  `cumplido` tinyint(4) DEFAULT NULL,
  `finalizado` tinyint(4) DEFAULT NULL,
  `tipoActividad` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`cronogramaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actividadcronograma`
--

LOCK TABLES `actividadcronograma` WRITE;
/*!40000 ALTER TABLE `actividadcronograma` DISABLE KEYS */;
/*!40000 ALTER TABLE `actividadcronograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `actividadplan`
--

DROP TABLE IF EXISTS `actividadplan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `actividadplan` (
  `actividadPlanId` bigint(20) NOT NULL,
  `planAccionId` bigint(20) DEFAULT NULL,
  `responsable` bigint(20) DEFAULT NULL,
  `actividad` varchar(75) DEFAULT NULL,
  `evidencia` varchar(75) DEFAULT NULL,
  `objetivo` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`actividadPlanId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actividadplan`
--

LOCK TABLES `actividadplan` WRITE;
/*!40000 ALTER TABLE `actividadplan` DISABLE KEYS */;
/*!40000 ALTER TABLE `actividadplan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `uuid_` varchar(75) DEFAULT NULL,
  `addressId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `street1` varchar(75) DEFAULT NULL,
  `street2` varchar(75) DEFAULT NULL,
  `street3` varchar(75) DEFAULT NULL,
  `city` varchar(75) DEFAULT NULL,
  `zip` varchar(75) DEFAULT NULL,
  `regionId` bigint(20) DEFAULT NULL,
  `countryId` bigint(20) DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  `mailing` tinyint(4) DEFAULT NULL,
  `primary_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`addressId`),
  KEY `IX_93D5AD4E` (`companyId`),
  KEY `IX_ABD7DAC0` (`companyId`,`classNameId`),
  KEY `IX_71CB1123` (`companyId`,`classNameId`,`classPK`),
  KEY `IX_923BD178` (`companyId`,`classNameId`,`classPK`,`mailing`),
  KEY `IX_9226DBB4` (`companyId`,`classNameId`,`classPK`,`primary_`),
  KEY `IX_5BC8B0D4` (`userId`),
  KEY `IX_381E55DA` (`uuid_`),
  KEY `IX_8FCB620E` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `announcementsdelivery`
--

DROP TABLE IF EXISTS `announcementsdelivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `announcementsdelivery` (
  `deliveryId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `email` tinyint(4) DEFAULT NULL,
  `sms` tinyint(4) DEFAULT NULL,
  `website` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`deliveryId`),
  UNIQUE KEY `IX_BA4413D5` (`userId`,`type_`),
  KEY `IX_6EDB9600` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `announcementsdelivery`
--

LOCK TABLES `announcementsdelivery` WRITE;
/*!40000 ALTER TABLE `announcementsdelivery` DISABLE KEYS */;
INSERT INTO `announcementsdelivery` VALUES (20435,20155,20199,'general',0,0,1),(20436,20155,20199,'news',0,0,1),(20437,20155,20199,'test',0,0,1),(20908,20155,20902,'general',0,0,0),(20909,20155,20902,'news',0,0,0),(20910,20155,20902,'test',0,0,0),(21817,20155,21811,'general',0,0,0),(21818,20155,21811,'news',0,0,0),(21819,20155,21811,'test',0,0,0),(22208,20155,22202,'general',0,0,0),(22209,20155,22202,'news',0,0,0),(22210,20155,22202,'test',0,0,0),(22218,20155,22212,'general',0,0,0),(22219,20155,22212,'news',0,0,0),(22220,20155,22212,'test',0,0,0),(22227,20155,22221,'general',0,0,0),(22228,20155,22221,'news',0,0,0),(22229,20155,22221,'test',0,0,0),(22236,20155,22230,'general',0,0,0),(22237,20155,22230,'news',0,0,0),(22238,20155,22230,'test',0,0,0),(22245,20155,22239,'general',0,0,0),(22246,20155,22239,'news',0,0,0),(22247,20155,22239,'test',0,0,0),(22254,20155,22248,'general',0,0,0),(22255,20155,22248,'news',0,0,0),(22256,20155,22248,'test',0,0,0),(22263,20155,22257,'general',0,0,0),(22264,20155,22257,'news',0,0,0),(22265,20155,22257,'test',0,0,0);
/*!40000 ALTER TABLE `announcementsdelivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `announcementsentry`
--

DROP TABLE IF EXISTS `announcementsentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `announcementsentry` (
  `uuid_` varchar(75) DEFAULT NULL,
  `entryId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `title` varchar(75) DEFAULT NULL,
  `content` longtext,
  `url` longtext,
  `type_` varchar(75) DEFAULT NULL,
  `displayDate` datetime DEFAULT NULL,
  `expirationDate` datetime DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `alert` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`entryId`),
  KEY `IX_A6EF0B81` (`classNameId`,`classPK`),
  KEY `IX_14F06A6B` (`classNameId`,`classPK`,`alert`),
  KEY `IX_D49C2E66` (`userId`),
  KEY `IX_1AFBDE08` (`uuid_`),
  KEY `IX_F2949120` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `announcementsentry`
--

LOCK TABLES `announcementsentry` WRITE;
/*!40000 ALTER TABLE `announcementsentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcementsentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `announcementsflag`
--

DROP TABLE IF EXISTS `announcementsflag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `announcementsflag` (
  `flagId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `entryId` bigint(20) DEFAULT NULL,
  `value` int(11) DEFAULT NULL,
  PRIMARY KEY (`flagId`),
  UNIQUE KEY `IX_4539A99C` (`userId`,`entryId`,`value`),
  KEY `IX_9C7EB9F` (`entryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `announcementsflag`
--

LOCK TABLES `announcementsflag` WRITE;
/*!40000 ALTER TABLE `announcementsflag` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcementsflag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetcategory`
--

DROP TABLE IF EXISTS `assetcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetcategory` (
  `uuid_` varchar(75) DEFAULT NULL,
  `categoryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentCategoryId` bigint(20) DEFAULT NULL,
  `leftCategoryId` bigint(20) DEFAULT NULL,
  `rightCategoryId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `vocabularyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`categoryId`),
  UNIQUE KEY `IX_BE4DF2BF` (`parentCategoryId`,`name`,`vocabularyId`),
  UNIQUE KEY `IX_E8D019AA` (`uuid_`,`groupId`),
  KEY `IX_E639E2F6` (`groupId`),
  KEY `IX_C7F39FCA` (`groupId`,`name`,`vocabularyId`),
  KEY `IX_852EA801` (`groupId`,`parentCategoryId`,`name`,`vocabularyId`),
  KEY `IX_87603842` (`groupId`,`parentCategoryId`,`vocabularyId`),
  KEY `IX_2008FACB` (`groupId`,`vocabularyId`),
  KEY `IX_D61ABE08` (`name`,`vocabularyId`),
  KEY `IX_7BB1826B` (`parentCategoryId`),
  KEY `IX_9DDD15EA` (`parentCategoryId`,`name`),
  KEY `IX_B185E980` (`parentCategoryId`,`vocabularyId`),
  KEY `IX_4D37BB00` (`uuid_`),
  KEY `IX_BBAF6928` (`uuid_`,`companyId`),
  KEY `IX_287B1F89` (`vocabularyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetcategory`
--

LOCK TABLES `assetcategory` WRITE;
/*!40000 ALTER TABLE `assetcategory` DISABLE KEYS */;
INSERT INTO `assetcategory` VALUES ('aeebf972-5fd7-4c8f-ae90-5fdac97dd224',21323,20623,20155,20199,'Test Test','2016-05-04 18:57:43','2016-05-04 18:57:43',0,2,3,'Analista Programador Java Web','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Analista Programador Java Web</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Analista Programador Java Web</Description></root>',21322),('56df2e1b-3a53-404f-a353-abf14803073f',22902,20623,20155,20199,'Test Test','2016-05-10 18:51:54','2016-05-10 18:51:54',0,4,5,'Analista Programador .Net','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Analista Programador .Net</Title></root>','',21322),('2bb932db-c446-4520-aa7a-40d98cae901f',22903,20623,20155,20199,'Test Test','2016-05-10 18:52:09','2016-05-10 18:52:09',0,6,7,'Programador Java Junior','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Programador Java Junior</Title></root>','',21322),('d2db9410-51c2-495f-8ccb-2aa492774024',22904,20623,20155,20199,'Test Test','2016-05-10 18:52:16','2016-05-10 18:52:16',0,8,9,'Programador Java SemiSenior','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Programador Java SemiSenior</Title></root>','',21322),('0963bb0e-cbca-4bff-a853-0af91d179a5a',22905,20623,20155,20199,'Test Test','2016-05-10 18:52:21','2016-05-10 18:52:21',0,10,11,'Programador Java Senior','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Programador Java Senior</Title></root>','',21322),('1f8c7b18-f05b-4d71-b379-1af31a5aad27',22906,20623,20155,20199,'Test Test','2016-05-10 18:52:35','2016-05-10 18:52:35',0,12,13,'Analista Programador Java Junior','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Analista Programador Java Junior</Title></root>','',21322),('7f2972bd-2d74-4381-b2b0-5da422d6db54',22907,20623,20155,20199,'Test Test','2016-05-10 18:52:43','2016-05-10 18:52:43',0,14,15,'Analista Programador Java SemiSenior','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Analista Programador Java SemiSenior</Title></root>','',21322),('042eeeb6-36ef-40bb-afd7-4cab10b0d674',22908,20623,20155,20199,'Test Test','2016-05-10 18:52:49','2016-05-10 18:52:49',0,16,17,'Analista Programador Java Senior','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Analista Programador Java Senior</Title></root>','',21322);
/*!40000 ALTER TABLE `assetcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetcategoryproperty`
--

DROP TABLE IF EXISTS `assetcategoryproperty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetcategoryproperty` (
  `categoryPropertyId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `categoryId` bigint(20) DEFAULT NULL,
  `key_` varchar(75) DEFAULT NULL,
  `value` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`categoryPropertyId`),
  UNIQUE KEY `IX_DBD111AA` (`categoryId`,`key_`),
  KEY `IX_99DA856` (`categoryId`),
  KEY `IX_8654719F` (`companyId`),
  KEY `IX_52340033` (`companyId`,`key_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetcategoryproperty`
--

LOCK TABLES `assetcategoryproperty` WRITE;
/*!40000 ALTER TABLE `assetcategoryproperty` DISABLE KEYS */;
/*!40000 ALTER TABLE `assetcategoryproperty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetentries_assetcategories`
--

DROP TABLE IF EXISTS `assetentries_assetcategories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetentries_assetcategories` (
  `categoryId` bigint(20) NOT NULL,
  `entryId` bigint(20) NOT NULL,
  PRIMARY KEY (`categoryId`,`entryId`),
  KEY `IX_A188F560` (`categoryId`),
  KEY `IX_E119938A` (`entryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetentries_assetcategories`
--

LOCK TABLES `assetentries_assetcategories` WRITE;
/*!40000 ALTER TABLE `assetentries_assetcategories` DISABLE KEYS */;
/*!40000 ALTER TABLE `assetentries_assetcategories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetentries_assettags`
--

DROP TABLE IF EXISTS `assetentries_assettags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetentries_assettags` (
  `entryId` bigint(20) NOT NULL,
  `tagId` bigint(20) NOT NULL,
  PRIMARY KEY (`entryId`,`tagId`),
  KEY `IX_2ED82CAD` (`entryId`),
  KEY `IX_B2A61B55` (`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetentries_assettags`
--

LOCK TABLES `assetentries_assettags` WRITE;
/*!40000 ALTER TABLE `assetentries_assettags` DISABLE KEYS */;
/*!40000 ALTER TABLE `assetentries_assettags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetentry`
--

DROP TABLE IF EXISTS `assetentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetentry` (
  `entryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `classUuid` varchar(75) DEFAULT NULL,
  `classTypeId` bigint(20) DEFAULT NULL,
  `visible` tinyint(4) DEFAULT NULL,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `publishDate` datetime DEFAULT NULL,
  `expirationDate` datetime DEFAULT NULL,
  `mimeType` varchar(75) DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `summary` longtext,
  `url` longtext,
  `layoutUuid` varchar(75) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  `priority` double DEFAULT NULL,
  `viewCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`entryId`),
  UNIQUE KEY `IX_1E9D371D` (`classNameId`,`classPK`),
  KEY `IX_FC1F9C7B` (`classUuid`),
  KEY `IX_7306C60` (`companyId`),
  KEY `IX_75D42FF9` (`expirationDate`),
  KEY `IX_1EBA6821` (`groupId`,`classUuid`),
  KEY `IX_FEC4A201` (`layoutUuid`),
  KEY `IX_2E4E3885` (`publishDate`),
  KEY `IX_9029E15A` (`visible`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetentry`
--

LOCK TABLES `assetentry` WRITE;
/*!40000 ALTER TABLE `assetentry` DISABLE KEYS */;
INSERT INTO `assetentry` VALUES (20180,20173,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20116,20178,'ff1bbe5e-5387-4dc9-a01f-e768d3aff8cb',0,0,NULL,NULL,NULL,NULL,'text/html','20176','','','','',0,0,0,0),(20189,20182,20155,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',20116,20187,'9a8ebe2d-29bd-46f9-8cec-42a44ce1ca37',0,0,NULL,NULL,NULL,NULL,'text/html','20185','','','','',0,0,0,0),(20204,20195,20155,20199,'Test Test','2016-05-04 07:40:11','2016-05-04 07:41:48',20005,20199,'2d854109-b84a-40a9-bb80-9be6d3d8f183',0,0,NULL,NULL,NULL,NULL,'','Test Test','','','','',0,0,0,0),(20325,20317,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',20116,20322,'fd146ec8-9aa9-4d85-85d7-2fc6db8a2c0b',0,0,NULL,NULL,NULL,NULL,'text/html','20320','','','','',0,0,0,0),(20336,20329,20155,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:15',20116,20334,'3fd15f6f-42e4-437f-b5bd-10bf1cbaf5df',0,0,NULL,NULL,NULL,NULL,'text/html','20332','','','','',0,0,0,0),(20346,20339,20155,20159,'','2016-05-04 07:40:17','2016-05-04 07:40:17',20116,20344,'40ee0181-7c2d-455c-a20d-4019292fa485',0,0,NULL,NULL,NULL,NULL,'text/html','20342','','','','',0,0,0,0),(20365,20350,20155,20159,'','2016-05-04 07:40:19','2016-05-04 07:40:19',20116,20363,'208d6189-d808-41a7-b637-0ec0efcfa838',0,0,NULL,NULL,NULL,NULL,'text/html','20361','','','','',0,0,0,0),(20373,20350,20155,20159,'','2016-05-04 07:40:20','2016-05-04 07:40:20',20116,20371,'529518ec-6fe3-4d7c-9ad8-e489a2703d50',0,0,NULL,NULL,NULL,NULL,'text/html','20369','','','','',0,0,0,0),(20391,20376,20155,20159,'','2016-05-04 07:40:22','2016-05-04 07:40:22',20116,20389,'f8c21351-da8d-4866-abd1-ef6d4f07cefd',0,0,NULL,NULL,NULL,NULL,'text/html','20387','','','','',0,0,0,0),(20400,20376,20155,20159,'','2016-05-04 07:40:23','2016-05-04 07:40:23',20116,20398,'45963235-87f0-4905-ab1f-1a595e7b8b90',0,0,NULL,NULL,NULL,NULL,'text/html','20396','','','','',0,0,0,0),(20408,20376,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20116,20406,'e0a321a2-60a0-421b-b368-f65517cc3efa',0,0,NULL,NULL,NULL,NULL,'text/html','20404','','','','',0,0,0,0),(20626,20195,20155,20199,'Test Test','2016-05-04 07:50:27','2016-05-04 07:50:27',20001,20623,'',0,0,NULL,NULL,NULL,NULL,'','Intranet Hitss','Intranet Hitss','','','',0,0,0,0),(20632,20623,20155,20199,'Test Test','2016-05-04 07:51:12','2016-05-04 07:51:12',20116,20630,'f2c7f0fb-8fa0-49a2-b471-92e98b701ec8',0,0,NULL,NULL,NULL,NULL,'text/html','20628','','','','',0,0,0,0),(20638,20623,20155,20199,'Test Test','2016-05-04 07:51:25','2016-05-04 07:51:25',20116,20636,'ae12df55-1391-4c37-bcff-688041db57c8',0,0,NULL,NULL,NULL,NULL,'text/html','20634','','','','',0,0,0,0),(20907,20195,20155,20199,'Test Test','2016-05-04 08:14:46','2016-05-04 19:06:00',20005,20902,'b4148289-0dca-4552-920a-26c77ac96e0e',0,0,NULL,NULL,NULL,NULL,'','IVAN Usuario01 QUIROZ','','','','',0,0,0,0),(21816,20195,20155,20199,'Test Test','2016-05-07 04:11:11','2016-05-07 04:15:26',20005,21811,'05729ad5-f616-486b-9fa3-a19910289e25',0,0,NULL,NULL,NULL,NULL,'','Danielle Delgado','','','','',0,0,0,0),(22207,20195,20155,20199,'Test Test','2016-05-07 06:40:23','2016-05-07 06:40:23',20005,22202,'bb324fe0-f605-467e-aac5-fa2f1f06f173',0,0,NULL,NULL,NULL,NULL,'','user2 user2','','','','',0,0,0,0),(22217,20195,20155,20199,'Test Test','2016-05-07 06:42:04','2016-05-07 06:42:04',20005,22212,'1499dabe-e527-462b-9cc7-49f5ba8c5c2b',0,0,NULL,NULL,NULL,NULL,'','randielmelgarejo randielmelgarejo randielmelgarejo','','','','',0,0,0,0),(22226,20195,20155,20199,'Test Test','2016-05-07 06:43:06','2016-05-07 06:43:06',20005,22221,'7cf61d6d-856f-4766-a9a6-51bde51fa076',0,0,NULL,NULL,NULL,NULL,'','monicalopera monicalopera monicalopera','','','','',0,0,0,0),(22235,20195,20155,20199,'Test Test','2016-05-07 06:48:14','2016-05-07 06:48:14',20005,22230,'4908d343-e43c-4284-b63e-7463dfdb48aa',0,0,NULL,NULL,NULL,NULL,'','jersonvasquez jersonvasquez jersonvasquez','','','','',0,0,0,0),(22244,20195,20155,20199,'Test Test','2016-05-07 06:56:39','2016-05-07 06:56:39',20005,22239,'9f29fe17-12a0-44b7-b0e5-a2e1f9414dda',0,0,NULL,NULL,NULL,NULL,'','ejemplo1 ejemplo1 ejemplo1','','','','',0,0,0,0),(22253,20195,20155,20199,'Test Test','2016-05-07 06:58:08','2016-05-07 06:58:08',20005,22248,'ef25433a-cb2a-434e-b9f9-1761a2e8b0d5',0,0,NULL,NULL,NULL,NULL,'','ejemplo2 ejemplo2 ejemplo2','','','','',0,0,0,0),(22262,20195,20155,20199,'Test Test','2016-05-07 07:05:10','2016-05-07 07:05:10',20005,22257,'3cacb53f-099d-49d9-97da-0086ce66147f',0,0,NULL,NULL,NULL,NULL,'','ejemplo3 ejemplo3 ejemplo3','','','','',0,0,0,0),(25805,20623,20155,20199,'Test Test','2016-06-06 03:27:18','2016-06-06 03:27:18',20116,25803,'2d6126cf-3072-42d7-97e9-86b1ddf24ce8',0,0,NULL,NULL,NULL,NULL,'text/html','25801','','','','',0,0,0,0),(25907,20623,20155,20199,'Test Test','2016-06-06 03:32:19','2016-06-06 03:32:19',20116,25905,'317ec084-a45b-417d-b3f3-535593210bd1',0,0,NULL,NULL,NULL,NULL,'text/html','25903','','','','',0,0,0,0),(25913,20623,20155,20199,'Test Test','2016-06-06 03:33:36','2016-06-06 03:33:36',20116,25911,'b83b81dd-fced-4203-a310-d7061bfb48b5',0,0,NULL,NULL,NULL,NULL,'text/html','25909','','','','',0,0,0,0),(25919,20623,20155,20199,'Test Test','2016-06-06 03:34:06','2016-06-06 03:34:06',20116,25917,'46485c44-e810-4e38-aa08-320aaa83130c',0,0,NULL,NULL,NULL,NULL,'text/html','25915','','','','',0,0,0,0),(25925,20623,20155,20199,'Test Test','2016-06-06 03:35:09','2016-06-06 03:35:09',20116,25923,'5a8f9b8c-573c-4636-a7b6-60eaa48eed2e',0,0,NULL,NULL,NULL,NULL,'text/html','25921','','','','',0,0,0,0),(27120,27103,20155,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19',20116,27118,'17770cef-e580-461d-9ebc-c8eb4ebc8e42',0,0,NULL,NULL,NULL,NULL,'text/html','27116','','','','',0,0,0,0),(27134,20182,20155,20199,'Test Test','2016-06-18 05:51:02','2016-06-18 05:51:02',20109,27132,'dffda1d9-1269-422f-ab92-02f37490ef68',27126,1,NULL,NULL,'2016-06-18 05:49:00',NULL,'text/html','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Estructura de pruba</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">dqd wqdqdqw</Description></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">dqd wqdqdqw</Description></root>','','',0,0,0,37),(27138,20182,20155,20199,'Test Test','2016-06-18 05:51:03','2016-06-18 05:51:03',20116,27136,'709e7077-c43e-4af7-b3bc-e48900dd3dd9',0,0,NULL,NULL,NULL,NULL,'text/html','27132','','','','',0,0,0,0),(30409,20534,20155,20159,'','2016-08-17 07:02:22','2016-08-17 07:02:22',20116,30407,'a9f570c0-6c16-4f4c-b271-12c26991e1fb',0,0,NULL,NULL,NULL,NULL,'text/html','30405','','','','',0,0,0,0);
/*!40000 ALTER TABLE `assetentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetlink`
--

DROP TABLE IF EXISTS `assetlink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetlink` (
  `linkId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `entryId1` bigint(20) DEFAULT NULL,
  `entryId2` bigint(20) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  PRIMARY KEY (`linkId`),
  UNIQUE KEY `IX_8F542794` (`entryId1`,`entryId2`,`type_`),
  KEY `IX_128516C8` (`entryId1`),
  KEY `IX_56E0AB21` (`entryId1`,`entryId2`),
  KEY `IX_14D5A20D` (`entryId1`,`type_`),
  KEY `IX_12851A89` (`entryId2`),
  KEY `IX_91F132C` (`entryId2`,`type_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetlink`
--

LOCK TABLES `assetlink` WRITE;
/*!40000 ALTER TABLE `assetlink` DISABLE KEYS */;
/*!40000 ALTER TABLE `assetlink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assettag`
--

DROP TABLE IF EXISTS `assettag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assettag` (
  `tagId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `assetCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`tagId`),
  KEY `IX_7C9E46BA` (`groupId`),
  KEY `IX_D63322F9` (`groupId`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assettag`
--

LOCK TABLES `assettag` WRITE;
/*!40000 ALTER TABLE `assettag` DISABLE KEYS */;
INSERT INTO `assettag` VALUES (101,20201,20155,20199,'','2016-06-01 17:05:46','2016-06-01 17:05:46','Power Builder',0),(102,20201,20155,20199,'','2016-06-01 17:05:51','2016-06-01 17:05:51','.Net',0),(201,20201,20155,20199,'Test Test','2016-06-01 17:36:56','2016-06-01 17:36:56','Scrum',0),(301,20201,20155,20199,'Test Test','2016-06-01 17:51:44','2016-06-01 17:51:44','plsq',0),(401,20201,20155,20199,'Test Test','2016-06-01 18:02:29','2016-06-01 18:02:29','Power Builder2',0),(402,20201,20155,20199,'Test Test','2016-06-01 18:04:49','2016-06-01 18:04:49','Power Builder23',0),(501,20201,20155,20199,'Test Test','2016-06-03 02:27:44','2016-06-03 02:27:44','jav',0),(21305,20623,20155,20199,'Test Test','2016-05-04 18:56:36','2016-05-04 18:56:36','sql',0),(21316,20623,20155,20199,'Test Test','2016-05-04 18:56:53','2016-05-04 18:56:53','java',0),(21318,20623,20155,20199,'Test Test','2016-05-04 18:57:04','2016-05-04 18:57:04','plsql',0);
/*!40000 ALTER TABLE `assettag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assettagproperty`
--

DROP TABLE IF EXISTS `assettagproperty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assettagproperty` (
  `tagPropertyId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `tagId` bigint(20) DEFAULT NULL,
  `key_` varchar(75) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`tagPropertyId`),
  UNIQUE KEY `IX_2C944354` (`tagId`,`key_`),
  KEY `IX_DFF1F063` (`companyId`),
  KEY `IX_13805BF7` (`companyId`,`key_`),
  KEY `IX_3269E180` (`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assettagproperty`
--

LOCK TABLES `assettagproperty` WRITE;
/*!40000 ALTER TABLE `assettagproperty` DISABLE KEYS */;
/*!40000 ALTER TABLE `assettagproperty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assettagstats`
--

DROP TABLE IF EXISTS `assettagstats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assettagstats` (
  `tagStatsId` bigint(20) NOT NULL,
  `tagId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `assetCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`tagStatsId`),
  UNIQUE KEY `IX_56682CC4` (`tagId`,`classNameId`),
  KEY `IX_50702693` (`classNameId`),
  KEY `IX_9464CA` (`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assettagstats`
--

LOCK TABLES `assettagstats` WRITE;
/*!40000 ALTER TABLE `assettagstats` DISABLE KEYS */;
/*!40000 ALTER TABLE `assettagstats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assetvocabulary`
--

DROP TABLE IF EXISTS `assetvocabulary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assetvocabulary` (
  `uuid_` varchar(75) DEFAULT NULL,
  `vocabularyId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `settings_` longtext,
  PRIMARY KEY (`vocabularyId`),
  UNIQUE KEY `IX_1B2B8792` (`uuid_`,`groupId`),
  KEY `IX_B22D908C` (`companyId`),
  KEY `IX_B6B8CA0E` (`groupId`),
  KEY `IX_C0AAD74D` (`groupId`,`name`),
  KEY `IX_55F58818` (`uuid_`),
  KEY `IX_C4E6FD10` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assetvocabulary`
--

LOCK TABLES `assetvocabulary` WRITE;
/*!40000 ALTER TABLE `assetvocabulary` DISABLE KEYS */;
INSERT INTO `assetvocabulary` VALUES ('2fef90bf-8338-487d-b36f-c6883aef41e3',20324,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14','Topic','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Title language-id=\"en_US\">Topic</Title></root>','',''),('562711b6-1eb1-4d2e-b410-11ed33eb4d2a',21320,20623,20155,20159,'','2016-05-04 18:57:12','2016-05-04 18:57:12','Topic','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Topic</Title></root>','',''),('e45a9069-d2e9-4c76-bae0-e715df84ebb7',21322,20623,20155,20199,'Test Test','2016-05-04 18:57:26','2016-05-04 18:57:26','Puestos','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Puestos</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Puestos</Description></root>','multiValued=true\nselectedClassNameIds=0\n'),('093f4683-14fd-4927-ae00-58ec5d5e0469',27140,20182,20155,20159,'','2016-06-18 05:51:05','2016-06-18 05:51:05','Topic','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Topic</Title></root>','','');
/*!40000 ALTER TABLE `assetvocabulary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `backgroundtask`
--

DROP TABLE IF EXISTS `backgroundtask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `backgroundtask` (
  `backgroundTaskId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `servletContextNames` varchar(255) DEFAULT NULL,
  `taskExecutorClassName` varchar(200) DEFAULT NULL,
  `taskContext` longtext,
  `completed` tinyint(4) DEFAULT NULL,
  `completionDate` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusMessage` longtext,
  PRIMARY KEY (`backgroundTaskId`),
  KEY `IX_C5A6C78F` (`companyId`),
  KEY `IX_5A09E5D1` (`groupId`),
  KEY `IX_98CC0AAB` (`groupId`,`name`,`taskExecutorClassName`),
  KEY `IX_579C63B0` (`groupId`,`name`,`taskExecutorClassName`,`completed`),
  KEY `IX_C71C3B7` (`groupId`,`status`),
  KEY `IX_A73B688A` (`groupId`,`taskExecutorClassName`),
  KEY `IX_7A9FF471` (`groupId`,`taskExecutorClassName`,`completed`),
  KEY `IX_7E757D70` (`groupId`,`taskExecutorClassName`,`status`),
  KEY `IX_C07CC7F8` (`name`),
  KEY `IX_75638CDF` (`status`),
  KEY `IX_2FCFE748` (`taskExecutorClassName`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `backgroundtask`
--

LOCK TABLES `backgroundtask` WRITE;
/*!40000 ALTER TABLE `backgroundtask` DISABLE KEYS */;
/*!40000 ALTER TABLE `backgroundtask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blogsentry`
--

DROP TABLE IF EXISTS `blogsentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blogsentry` (
  `uuid_` varchar(75) DEFAULT NULL,
  `entryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `title` varchar(150) DEFAULT NULL,
  `urlTitle` varchar(150) DEFAULT NULL,
  `description` longtext,
  `content` longtext,
  `displayDate` datetime DEFAULT NULL,
  `allowPingbacks` tinyint(4) DEFAULT NULL,
  `allowTrackbacks` tinyint(4) DEFAULT NULL,
  `trackbacks` longtext,
  `smallImage` tinyint(4) DEFAULT NULL,
  `smallImageId` bigint(20) DEFAULT NULL,
  `smallImageURL` longtext,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`entryId`),
  UNIQUE KEY `IX_DB780A20` (`groupId`,`urlTitle`),
  UNIQUE KEY `IX_1B1040FD` (`uuid_`,`groupId`),
  KEY `IX_72EF6041` (`companyId`),
  KEY `IX_430D791F` (`companyId`,`displayDate`),
  KEY `IX_BB0C2905` (`companyId`,`displayDate`,`status`),
  KEY `IX_EB2DCE27` (`companyId`,`status`),
  KEY `IX_8CACE77B` (`companyId`,`userId`),
  KEY `IX_A5F57B61` (`companyId`,`userId`,`status`),
  KEY `IX_2672F77F` (`displayDate`,`status`),
  KEY `IX_81A50303` (`groupId`),
  KEY `IX_621E19D` (`groupId`,`displayDate`),
  KEY `IX_F0E73383` (`groupId`,`displayDate`,`status`),
  KEY `IX_1EFD8EE9` (`groupId`,`status`),
  KEY `IX_FBDE0AA3` (`groupId`,`userId`,`displayDate`),
  KEY `IX_DA04F689` (`groupId`,`userId`,`displayDate`,`status`),
  KEY `IX_49E15A23` (`groupId`,`userId`,`status`),
  KEY `IX_69157A4D` (`uuid_`),
  KEY `IX_5E8307BB` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blogsentry`
--

LOCK TABLES `blogsentry` WRITE;
/*!40000 ALTER TABLE `blogsentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `blogsentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `blogsstatsuser`
--

DROP TABLE IF EXISTS `blogsstatsuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blogsstatsuser` (
  `statsUserId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `entryCount` int(11) DEFAULT NULL,
  `lastPostDate` datetime DEFAULT NULL,
  `ratingsTotalEntries` int(11) DEFAULT NULL,
  `ratingsTotalScore` double DEFAULT NULL,
  `ratingsAverageScore` double DEFAULT NULL,
  PRIMARY KEY (`statsUserId`),
  UNIQUE KEY `IX_82254C25` (`groupId`,`userId`),
  KEY `IX_90CDA39A` (`companyId`,`entryCount`),
  KEY `IX_43840EEB` (`groupId`),
  KEY `IX_28C78D5C` (`groupId`,`entryCount`),
  KEY `IX_BB51F1D9` (`userId`),
  KEY `IX_507BA031` (`userId`,`lastPostDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blogsstatsuser`
--

LOCK TABLES `blogsstatsuser` WRITE;
/*!40000 ALTER TABLE `blogsstatsuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `blogsstatsuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookmarksentry`
--

DROP TABLE IF EXISTS `bookmarksentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookmarksentry` (
  `uuid_` varchar(75) DEFAULT NULL,
  `entryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `resourceBlockId` bigint(20) DEFAULT NULL,
  `folderId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(255) DEFAULT NULL,
  `url` longtext,
  `description` longtext,
  `visits` int(11) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`entryId`),
  UNIQUE KEY `IX_EAA02A91` (`uuid_`,`groupId`),
  KEY `IX_1F90CA2D` (`companyId`),
  KEY `IX_276C8C13` (`companyId`,`status`),
  KEY `IX_5200100C` (`groupId`,`folderId`),
  KEY `IX_146382F2` (`groupId`,`folderId`,`status`),
  KEY `IX_416AD7D5` (`groupId`,`status`),
  KEY `IX_C78B61AC` (`groupId`,`userId`,`folderId`,`status`),
  KEY `IX_9D9CF70F` (`groupId`,`userId`,`status`),
  KEY `IX_E848278F` (`resourceBlockId`),
  KEY `IX_B670BA39` (`uuid_`),
  KEY `IX_89BEDC4F` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookmarksentry`
--

LOCK TABLES `bookmarksentry` WRITE;
/*!40000 ALTER TABLE `bookmarksentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookmarksentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookmarksfolder`
--

DROP TABLE IF EXISTS `bookmarksfolder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookmarksfolder` (
  `uuid_` varchar(75) DEFAULT NULL,
  `folderId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `resourceBlockId` bigint(20) DEFAULT NULL,
  `parentFolderId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`folderId`),
  UNIQUE KEY `IX_DC2F8927` (`uuid_`,`groupId`),
  KEY `IX_2ABA25D7` (`companyId`),
  KEY `IX_C27C9DBD` (`companyId`,`status`),
  KEY `IX_7F703619` (`groupId`),
  KEY `IX_967799C0` (`groupId`,`parentFolderId`),
  KEY `IX_D16018A6` (`groupId`,`parentFolderId`,`status`),
  KEY `IX_28A49BB9` (`resourceBlockId`),
  KEY `IX_451E7AE3` (`uuid_`),
  KEY `IX_54F0ED65` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookmarksfolder`
--

LOCK TABLES `bookmarksfolder` WRITE;
/*!40000 ALTER TABLE `bookmarksfolder` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookmarksfolder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `browsertracker`
--

DROP TABLE IF EXISTS `browsertracker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `browsertracker` (
  `browserTrackerId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `browserKey` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`browserTrackerId`),
  UNIQUE KEY `IX_E7B95510` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `browsertracker`
--

LOCK TABLES `browsertracker` WRITE;
/*!40000 ALTER TABLE `browsertracker` DISABLE KEYS */;
INSERT INTO `browsertracker` VALUES (20532,20199,1344361896407);
/*!40000 ALTER TABLE `browsertracker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calendar`
--

DROP TABLE IF EXISTS `calendar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendar` (
  `uuid_` varchar(75) DEFAULT NULL,
  `calendarId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `resourceBlockId` bigint(20) DEFAULT NULL,
  `calendarResourceId` bigint(20) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `timeZoneId` varchar(75) DEFAULT NULL,
  `color` int(11) DEFAULT NULL,
  `defaultCalendar` tinyint(4) DEFAULT NULL,
  `enableComments` tinyint(4) DEFAULT NULL,
  `enableRatings` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`calendarId`),
  UNIQUE KEY `IX_3AE311A` (`uuid_`,`groupId`),
  KEY `IX_B53EB0E1` (`groupId`,`calendarResourceId`),
  KEY `IX_97FC174E` (`groupId`,`calendarResourceId`,`defaultCalendar`),
  KEY `IX_F0FAF226` (`resourceBlockId`),
  KEY `IX_96C8590` (`uuid_`),
  KEY `IX_97656498` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendar`
--

LOCK TABLES `calendar` WRITE;
/*!40000 ALTER TABLE `calendar` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calendarbooking`
--

DROP TABLE IF EXISTS `calendarbooking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendarbooking` (
  `uuid_` varchar(75) DEFAULT NULL,
  `calendarBookingId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `resourceBlockId` bigint(20) DEFAULT NULL,
  `calendarId` bigint(20) DEFAULT NULL,
  `calendarResourceId` bigint(20) DEFAULT NULL,
  `parentCalendarBookingId` bigint(20) DEFAULT NULL,
  `vEventUid` varchar(255) DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `location` longtext,
  `startTime` bigint(20) DEFAULT NULL,
  `endTime` bigint(20) DEFAULT NULL,
  `allDay` tinyint(4) DEFAULT NULL,
  `recurrence` longtext,
  `firstReminder` bigint(20) DEFAULT NULL,
  `firstReminderType` varchar(75) DEFAULT NULL,
  `secondReminder` bigint(20) DEFAULT NULL,
  `secondReminderType` varchar(75) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`calendarBookingId`),
  UNIQUE KEY `IX_113A264E` (`calendarId`,`parentCalendarBookingId`),
  UNIQUE KEY `IX_8B23DA0E` (`calendarId`,`vEventUid`),
  UNIQUE KEY `IX_F4C61797` (`uuid_`,`groupId`),
  KEY `IX_D300DFCE` (`calendarId`),
  KEY `IX_470170B4` (`calendarId`,`status`),
  KEY `IX_B198FFC` (`calendarResourceId`),
  KEY `IX_57EBF55B` (`parentCalendarBookingId`),
  KEY `IX_F7B8A941` (`parentCalendarBookingId`,`status`),
  KEY `IX_22DFDB49` (`resourceBlockId`),
  KEY `IX_F6E8EE73` (`uuid_`),
  KEY `IX_A21D9FD5` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendarbooking`
--

LOCK TABLES `calendarbooking` WRITE;
/*!40000 ALTER TABLE `calendarbooking` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendarbooking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calendarnotificationtemplate`
--

DROP TABLE IF EXISTS `calendarnotificationtemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendarnotificationtemplate` (
  `uuid_` varchar(75) DEFAULT NULL,
  `calendarNotificationTemplateId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `calendarId` bigint(20) DEFAULT NULL,
  `notificationType` varchar(75) DEFAULT NULL,
  `notificationTypeSettings` varchar(75) DEFAULT NULL,
  `notificationTemplateType` varchar(75) DEFAULT NULL,
  `subject` varchar(75) DEFAULT NULL,
  `body` longtext,
  PRIMARY KEY (`calendarNotificationTemplateId`),
  UNIQUE KEY `IX_4012E97F` (`uuid_`,`groupId`),
  KEY `IX_A412E5B6` (`calendarId`),
  KEY `IX_7727A482` (`calendarId`,`notificationType`,`notificationTemplateType`),
  KEY `IX_A2D4D78B` (`uuid_`),
  KEY `IX_4D7D97BD` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendarnotificationtemplate`
--

LOCK TABLES `calendarnotificationtemplate` WRITE;
/*!40000 ALTER TABLE `calendarnotificationtemplate` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendarnotificationtemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calendarresource`
--

DROP TABLE IF EXISTS `calendarresource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calendarresource` (
  `uuid_` varchar(75) DEFAULT NULL,
  `calendarResourceId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `resourceBlockId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `classUuid` varchar(75) DEFAULT NULL,
  `code_` varchar(75) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`calendarResourceId`),
  UNIQUE KEY `IX_16A12327` (`classNameId`,`classPK`),
  UNIQUE KEY `IX_4ABD2BC8` (`uuid_`,`groupId`),
  KEY `IX_76DDD0F7` (`active_`),
  KEY `IX_4470A59D` (`companyId`,`code_`,`active_`),
  KEY `IX_1243D698` (`groupId`),
  KEY `IX_40678371` (`groupId`,`active_`),
  KEY `IX_55C2F8AA` (`groupId`,`code_`),
  KEY `IX_8BCB4D38` (`resourceBlockId`),
  KEY `IX_150E2F22` (`uuid_`),
  KEY `IX_56A06BC6` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calendarresource`
--

LOCK TABLES `calendarresource` WRITE;
/*!40000 ALTER TABLE `calendarresource` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendarresource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `calevent`
--

DROP TABLE IF EXISTS `calevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calevent` (
  `uuid_` varchar(75) DEFAULT NULL,
  `eventId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `title` varchar(75) DEFAULT NULL,
  `description` longtext,
  `location` longtext,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `durationHour` int(11) DEFAULT NULL,
  `durationMinute` int(11) DEFAULT NULL,
  `allDay` tinyint(4) DEFAULT NULL,
  `timeZoneSensitive` tinyint(4) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `repeating` tinyint(4) DEFAULT NULL,
  `recurrence` longtext,
  `remindBy` int(11) DEFAULT NULL,
  `firstReminder` int(11) DEFAULT NULL,
  `secondReminder` int(11) DEFAULT NULL,
  PRIMARY KEY (`eventId`),
  UNIQUE KEY `IX_5CCE79C8` (`uuid_`,`groupId`),
  KEY `IX_D6FD9496` (`companyId`),
  KEY `IX_12EE4898` (`groupId`),
  KEY `IX_4FDDD2BF` (`groupId`,`repeating`),
  KEY `IX_FCD7C63D` (`groupId`,`type_`),
  KEY `IX_FD93CBFA` (`groupId`,`type_`,`repeating`),
  KEY `IX_F6006202` (`remindBy`),
  KEY `IX_C1AD2122` (`uuid_`),
  KEY `IX_299639C6` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calevent`
--

LOCK TABLES `calevent` WRITE;
/*!40000 ALTER TABLE `calevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `calevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classname_`
--

DROP TABLE IF EXISTS `classname_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classname_` (
  `classNameId` bigint(20) NOT NULL,
  `value` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`classNameId`),
  UNIQUE KEY `IX_B27A301F` (`value`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classname_`
--

LOCK TABLES `classname_` WRITE;
/*!40000 ALTER TABLE `classname_` DISABLE KEYS */;
INSERT INTO `classname_` VALUES (20560,'com.hitss.layer.model.ActividadCronograma'),(20561,'com.hitss.layer.model.ActividadPlan'),(20562,'com.hitss.layer.model.Contrato'),(20563,'com.hitss.layer.model.Cronograma'),(20564,'com.hitss.layer.model.DetalleRepuestaEvaluacion'),(20565,'com.hitss.layer.model.DetalleRepuestaReclutamiento'),(20566,'com.hitss.layer.model.Estudio'),(20567,'com.hitss.layer.model.EtiquetaRelacionada'),(20568,'com.hitss.layer.model.Evaluacion'),(20569,'com.hitss.layer.model.EvaluacionPregunta'),(20570,'com.hitss.layer.model.Experiencia'),(20571,'com.hitss.layer.model.FasePostulacion'),(20572,'com.hitss.layer.model.Funcion'),(20573,'com.hitss.layer.model.InformeRetroalimentacion'),(20574,'com.hitss.layer.model.LogOperaciones'),(20575,'com.hitss.layer.model.Observaciones'),(20576,'com.hitss.layer.model.Parametro'),(20577,'com.hitss.layer.model.PlanAccion'),(20578,'com.hitss.layer.model.Postulacion'),(20579,'com.hitss.layer.model.Pregunta'),(20580,'com.hitss.layer.model.PrioridadGrupoUsuarios'),(20581,'com.hitss.layer.model.Puesto'),(20582,'com.hitss.layer.model.Referencia'),(20583,'com.hitss.layer.model.Requisito'),(20584,'com.hitss.layer.model.Respuesta'),(20585,'com.hitss.layer.model.SolicitudEvaluacionDesempenno'),(20586,'com.hitss.layer.model.SolicitudRequerimiento'),(20587,'com.hitss.layer.model.SolicitudRequerimientoRequisito'),(20588,'com.hitss.layer.model.Usuario'),(20589,'com.hitss.layer.model.UsuarioEvaluacion'),(20590,'com.hitss.layer.model.UsuarioRequisito'),(20444,'com.liferay.calendar.model.Calendar'),(20445,'com.liferay.calendar.model.CalendarBooking'),(20446,'com.liferay.calendar.model.CalendarNotificationTemplate'),(20447,'com.liferay.calendar.model.CalendarResource'),(20017,'com.liferay.counter.model.Counter'),(20438,'com.liferay.marketplace.model.App'),(20439,'com.liferay.marketplace.model.Module'),(20482,'com.liferay.notifications.model.UserNotificationEvent'),(20502,'com.liferay.opensocial.model.Gadget'),(20503,'com.liferay.opensocial.model.OAuthConsumer'),(20504,'com.liferay.opensocial.model.OAuthToken'),(20422,'com.liferay.portal.kernel.repository.model.FileEntry'),(20018,'com.liferay.portal.kernel.workflow.WorkflowTask'),(20019,'com.liferay.portal.model.Account'),(20020,'com.liferay.portal.model.Address'),(20021,'com.liferay.portal.model.BackgroundTask'),(20022,'com.liferay.portal.model.BrowserTracker'),(20023,'com.liferay.portal.model.ClassName'),(20024,'com.liferay.portal.model.ClusterGroup'),(20025,'com.liferay.portal.model.Company'),(20026,'com.liferay.portal.model.Contact'),(20027,'com.liferay.portal.model.Country'),(20028,'com.liferay.portal.model.EmailAddress'),(20001,'com.liferay.portal.model.Group'),(20029,'com.liferay.portal.model.Image'),(20002,'com.liferay.portal.model.Layout'),(20030,'com.liferay.portal.model.LayoutBranch'),(20031,'com.liferay.portal.model.LayoutFriendlyURL'),(20032,'com.liferay.portal.model.LayoutPrototype'),(20033,'com.liferay.portal.model.LayoutRevision'),(20034,'com.liferay.portal.model.LayoutSet'),(20035,'com.liferay.portal.model.LayoutSetBranch'),(20036,'com.liferay.portal.model.LayoutSetPrototype'),(20037,'com.liferay.portal.model.ListType'),(20038,'com.liferay.portal.model.Lock'),(20039,'com.liferay.portal.model.MembershipRequest'),(20003,'com.liferay.portal.model.Organization'),(20040,'com.liferay.portal.model.OrgGroupRole'),(20041,'com.liferay.portal.model.OrgLabor'),(20042,'com.liferay.portal.model.PasswordPolicy'),(20043,'com.liferay.portal.model.PasswordPolicyRel'),(20044,'com.liferay.portal.model.PasswordTracker'),(20045,'com.liferay.portal.model.Phone'),(20046,'com.liferay.portal.model.PluginSetting'),(20047,'com.liferay.portal.model.PortalPreferences'),(20048,'com.liferay.portal.model.Portlet'),(20049,'com.liferay.portal.model.PortletItem'),(20050,'com.liferay.portal.model.PortletPreferences'),(20051,'com.liferay.portal.model.Region'),(20052,'com.liferay.portal.model.Release'),(20053,'com.liferay.portal.model.Repository'),(20054,'com.liferay.portal.model.RepositoryEntry'),(20055,'com.liferay.portal.model.ResourceAction'),(20056,'com.liferay.portal.model.ResourceBlock'),(20057,'com.liferay.portal.model.ResourceBlockPermission'),(20058,'com.liferay.portal.model.ResourcePermission'),(20059,'com.liferay.portal.model.ResourceTypePermission'),(20004,'com.liferay.portal.model.Role'),(20060,'com.liferay.portal.model.ServiceComponent'),(20061,'com.liferay.portal.model.Shard'),(20062,'com.liferay.portal.model.Subscription'),(20063,'com.liferay.portal.model.SystemEvent'),(20064,'com.liferay.portal.model.Team'),(20065,'com.liferay.portal.model.Ticket'),(20005,'com.liferay.portal.model.User'),(20006,'com.liferay.portal.model.UserGroup'),(20066,'com.liferay.portal.model.UserGroupGroupRole'),(20067,'com.liferay.portal.model.UserGroupRole'),(20068,'com.liferay.portal.model.UserIdMapper'),(20069,'com.liferay.portal.model.UserNotificationDelivery'),(20070,'com.liferay.portal.model.UserNotificationEvent'),(20191,'com.liferay.portal.model.UserPersonalSite'),(20071,'com.liferay.portal.model.UserTracker'),(20072,'com.liferay.portal.model.UserTrackerPath'),(20073,'com.liferay.portal.model.VirtualHost'),(20074,'com.liferay.portal.model.WebDAVProps'),(20075,'com.liferay.portal.model.Website'),(20076,'com.liferay.portal.model.WorkflowDefinitionLink'),(20077,'com.liferay.portal.model.WorkflowInstanceLink'),(20451,'com.liferay.portal.workflow.kaleo.model.KaleoAction'),(20452,'com.liferay.portal.workflow.kaleo.model.KaleoCondition'),(20453,'com.liferay.portal.workflow.kaleo.model.KaleoDefinition'),(20454,'com.liferay.portal.workflow.kaleo.model.KaleoInstance'),(20455,'com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken'),(20456,'com.liferay.portal.workflow.kaleo.model.KaleoLog'),(20457,'com.liferay.portal.workflow.kaleo.model.KaleoNode'),(20458,'com.liferay.portal.workflow.kaleo.model.KaleoNotification'),(20459,'com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient'),(20460,'com.liferay.portal.workflow.kaleo.model.KaleoTask'),(20461,'com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment'),(20462,'com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance'),(20463,'com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken'),(20464,'com.liferay.portal.workflow.kaleo.model.KaleoTimer'),(20465,'com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken'),(20466,'com.liferay.portal.workflow.kaleo.model.KaleoTransition'),(20078,'com.liferay.portlet.announcements.model.AnnouncementsDelivery'),(20079,'com.liferay.portlet.announcements.model.AnnouncementsEntry'),(20080,'com.liferay.portlet.announcements.model.AnnouncementsFlag'),(20081,'com.liferay.portlet.asset.model.AssetCategory'),(20082,'com.liferay.portlet.asset.model.AssetCategoryProperty'),(20083,'com.liferay.portlet.asset.model.AssetEntry'),(20084,'com.liferay.portlet.asset.model.AssetLink'),(20085,'com.liferay.portlet.asset.model.AssetTag'),(20086,'com.liferay.portlet.asset.model.AssetTagProperty'),(20087,'com.liferay.portlet.asset.model.AssetTagStats'),(20088,'com.liferay.portlet.asset.model.AssetVocabulary'),(20007,'com.liferay.portlet.blogs.model.BlogsEntry'),(20089,'com.liferay.portlet.blogs.model.BlogsStatsUser'),(20008,'com.liferay.portlet.bookmarks.model.BookmarksEntry'),(20009,'com.liferay.portlet.bookmarks.model.BookmarksFolder'),(20010,'com.liferay.portlet.calendar.model.CalEvent'),(20090,'com.liferay.portlet.documentlibrary.model.DLContent'),(20011,'com.liferay.portlet.documentlibrary.model.DLFileEntry'),(20091,'com.liferay.portlet.documentlibrary.model.DLFileEntryMetadata'),(20092,'com.liferay.portlet.documentlibrary.model.DLFileEntryType'),(20093,'com.liferay.portlet.documentlibrary.model.DLFileRank'),(20094,'com.liferay.portlet.documentlibrary.model.DLFileShortcut'),(20095,'com.liferay.portlet.documentlibrary.model.DLFileVersion'),(20012,'com.liferay.portlet.documentlibrary.model.DLFolder'),(20096,'com.liferay.portlet.documentlibrary.model.DLSyncEvent'),(20314,'com.liferay.portlet.documentlibrary.util.RawMetadataProcessor'),(20097,'com.liferay.portlet.dynamicdatalists.model.DDLRecord'),(20098,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet'),(20099,'com.liferay.portlet.dynamicdatalists.model.DDLRecordVersion'),(20100,'com.liferay.portlet.dynamicdatamapping.model.DDMContent'),(20101,'com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink'),(20102,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure'),(20103,'com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink'),(20104,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate'),(20105,'com.liferay.portlet.expando.model.ExpandoColumn'),(20106,'com.liferay.portlet.expando.model.ExpandoRow'),(20107,'com.liferay.portlet.expando.model.ExpandoTable'),(20108,'com.liferay.portlet.expando.model.ExpandoValue'),(20109,'com.liferay.portlet.journal.model.JournalArticle'),(20110,'com.liferay.portlet.journal.model.JournalArticleImage'),(20111,'com.liferay.portlet.journal.model.JournalArticleResource'),(20112,'com.liferay.portlet.journal.model.JournalContentSearch'),(20113,'com.liferay.portlet.journal.model.JournalFeed'),(20013,'com.liferay.portlet.journal.model.JournalFolder'),(20114,'com.liferay.portlet.messageboards.model.MBBan'),(20115,'com.liferay.portlet.messageboards.model.MBCategory'),(20116,'com.liferay.portlet.messageboards.model.MBDiscussion'),(20117,'com.liferay.portlet.messageboards.model.MBMailingList'),(20014,'com.liferay.portlet.messageboards.model.MBMessage'),(20118,'com.liferay.portlet.messageboards.model.MBStatsUser'),(20015,'com.liferay.portlet.messageboards.model.MBThread'),(20119,'com.liferay.portlet.messageboards.model.MBThreadFlag'),(20120,'com.liferay.portlet.mobiledevicerules.model.MDRAction'),(20121,'com.liferay.portlet.mobiledevicerules.model.MDRRule'),(20122,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup'),(20123,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance'),(20124,'com.liferay.portlet.polls.model.PollsChoice'),(20125,'com.liferay.portlet.polls.model.PollsQuestion'),(20126,'com.liferay.portlet.polls.model.PollsVote'),(20127,'com.liferay.portlet.ratings.model.RatingsEntry'),(20128,'com.liferay.portlet.ratings.model.RatingsStats'),(20129,'com.liferay.portlet.shopping.model.ShoppingCart'),(20130,'com.liferay.portlet.shopping.model.ShoppingCategory'),(20131,'com.liferay.portlet.shopping.model.ShoppingCoupon'),(20132,'com.liferay.portlet.shopping.model.ShoppingItem'),(20133,'com.liferay.portlet.shopping.model.ShoppingItemField'),(20134,'com.liferay.portlet.shopping.model.ShoppingItemPrice'),(20135,'com.liferay.portlet.shopping.model.ShoppingOrder'),(20136,'com.liferay.portlet.shopping.model.ShoppingOrderItem'),(20137,'com.liferay.portlet.social.model.SocialActivity'),(20138,'com.liferay.portlet.social.model.SocialActivityAchievement'),(20139,'com.liferay.portlet.social.model.SocialActivityCounter'),(20140,'com.liferay.portlet.social.model.SocialActivityLimit'),(20141,'com.liferay.portlet.social.model.SocialActivitySet'),(20142,'com.liferay.portlet.social.model.SocialActivitySetting'),(20143,'com.liferay.portlet.social.model.SocialRelation'),(20144,'com.liferay.portlet.social.model.SocialRequest'),(20145,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion'),(20146,'com.liferay.portlet.softwarecatalog.model.SCLicense'),(20147,'com.liferay.portlet.softwarecatalog.model.SCProductEntry'),(20148,'com.liferay.portlet.softwarecatalog.model.SCProductScreenshot'),(20149,'com.liferay.portlet.softwarecatalog.model.SCProductVersion'),(20150,'com.liferay.portlet.trash.model.TrashEntry'),(20151,'com.liferay.portlet.trash.model.TrashVersion'),(20152,'com.liferay.portlet.wiki.model.WikiNode'),(20016,'com.liferay.portlet.wiki.model.WikiPage'),(20153,'com.liferay.portlet.wiki.model.WikiPageResource'),(20512,'com.liferay.sync.model.SyncDLFileVersionDiff'),(20513,'com.liferay.sync.model.SyncDLObject');
/*!40000 ALTER TABLE `classname_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clustergroup`
--

DROP TABLE IF EXISTS `clustergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clustergroup` (
  `clusterGroupId` bigint(20) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `clusterNodeIds` varchar(75) DEFAULT NULL,
  `wholeCluster` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`clusterGroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clustergroup`
--

LOCK TABLES `clustergroup` WRITE;
/*!40000 ALTER TABLE `clustergroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `clustergroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `companyId` bigint(20) NOT NULL,
  `accountId` bigint(20) DEFAULT NULL,
  `webId` varchar(75) DEFAULT NULL,
  `key_` longtext,
  `mx` varchar(75) DEFAULT NULL,
  `homeURL` longtext,
  `logoId` bigint(20) DEFAULT NULL,
  `system` tinyint(4) DEFAULT NULL,
  `maxUsers` int(11) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`companyId`),
  UNIQUE KEY `IX_EC00543C` (`webId`),
  KEY `IX_38EFE3FD` (`logoId`),
  KEY `IX_12566EC2` (`mx`),
  KEY `IX_35E3E7C6` (`system`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES (20155,20157,'liferay.com','rO0ABXNyAB9qYXZheC5jcnlwdG8uc3BlYy5TZWNyZXRLZXlTcGVjW0cLZuIwYU0CAAJMAAlhbGdvcml0aG10ABJMamF2YS9sYW5nL1N0cmluZztbAANrZXl0AAJbQnhwdAADQUVTdXIAAltCrPMX+AYIVOACAAB4cAAAABC4UZxj6W8pS+TRp4eP0l2I','liferay.com','',0,0,0,1);
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact_`
--

DROP TABLE IF EXISTS `contact_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contact_` (
  `contactId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `accountId` bigint(20) DEFAULT NULL,
  `parentContactId` bigint(20) DEFAULT NULL,
  `emailAddress` varchar(75) DEFAULT NULL,
  `firstName` varchar(75) DEFAULT NULL,
  `middleName` varchar(75) DEFAULT NULL,
  `lastName` varchar(75) DEFAULT NULL,
  `prefixId` int(11) DEFAULT NULL,
  `suffixId` int(11) DEFAULT NULL,
  `male` tinyint(4) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `smsSn` varchar(75) DEFAULT NULL,
  `aimSn` varchar(75) DEFAULT NULL,
  `facebookSn` varchar(75) DEFAULT NULL,
  `icqSn` varchar(75) DEFAULT NULL,
  `jabberSn` varchar(75) DEFAULT NULL,
  `msnSn` varchar(75) DEFAULT NULL,
  `mySpaceSn` varchar(75) DEFAULT NULL,
  `skypeSn` varchar(75) DEFAULT NULL,
  `twitterSn` varchar(75) DEFAULT NULL,
  `ymSn` varchar(75) DEFAULT NULL,
  `employeeStatusId` varchar(75) DEFAULT NULL,
  `employeeNumber` varchar(75) DEFAULT NULL,
  `jobTitle` varchar(100) DEFAULT NULL,
  `jobClass` varchar(75) DEFAULT NULL,
  `hoursOfOperation` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`contactId`),
  KEY `IX_B8C28C53` (`accountId`),
  KEY `IX_791914FA` (`classNameId`,`classPK`),
  KEY `IX_66D496A3` (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact_`
--

LOCK TABLES `contact_` WRITE;
/*!40000 ALTER TABLE `contact_` DISABLE KEYS */;
INSERT INTO `contact_` VALUES (20160,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20005,20159,20157,0,'default@liferay.com','','','',0,0,1,'2016-05-04 07:40:09','','','','','','','','','','','','','','',''),(20200,20155,20199,'','2016-05-04 07:40:11','2016-05-04 07:41:48',20005,20199,20157,0,'test@liferay.com','Test','','Test',0,0,1,'1970-01-01 00:00:00','','','','','','','','','','','','','','',''),(20903,20155,20199,'Test Test','2016-05-04 08:14:46','2016-05-04 19:06:00',20005,20902,20157,0,'ivan.quiroz@gmail.com','IVAN','Usuario01','QUIROZ',11015,11022,1,'1970-01-01 00:00:00','','','','','','','','','','','','','coordinar de rrhh','',''),(21812,20155,20199,'Test Test','2016-05-07 04:11:11','2016-05-07 04:15:26',20005,21811,20157,0,'danieldelgado@globalhitss.com','Danielle','','Delgado',11014,11025,1,'1970-01-01 00:00:00','','','','','','','','','','','','','Desarrollador Java','',''),(22203,20155,20199,'Test Test','2016-05-07 06:40:23','2016-05-07 06:40:23',20005,22202,20157,0,'user2@globalhitss.com','user2','','user2',0,11023,1,'1970-01-01 00:00:00','','','','','','','','','','','','','user2','',''),(22213,20155,20199,'Test Test','2016-05-07 06:42:04','2016-05-07 06:42:04',20005,22212,20157,0,'randielmelgarejo@globalhitss.com','randielmelgarejo','randielmelgarejo','randielmelgarejo',11015,11022,1,'1970-01-01 00:00:00','','','','','','','','','','','','','user2','',''),(22222,20155,20199,'Test Test','2016-05-07 06:43:06','2016-05-07 06:43:06',20005,22221,20157,0,'monicalopera@globalhitss.com','monicalopera','monicalopera','monicalopera',11015,11023,1,'1970-01-01 00:00:00','','','','','','','','','','','','','monicalopera','',''),(22231,20155,20199,'Test Test','2016-05-07 06:48:14','2016-05-07 06:48:14',20005,22230,20157,0,'jersonvasquez@globalhitss.com','jersonvasquez','jersonvasquez','jersonvasquez',11015,11022,1,'1970-01-01 00:00:00','','','','','','','','','','','','','jersonvasquez','',''),(22240,20155,20199,'Test Test','2016-05-07 06:56:39','2016-05-07 06:56:39',20005,22239,20157,0,'ejemplo1@globalhitss.com','ejemplo1','ejemplo1','ejemplo1',11015,11021,1,'1970-01-01 00:00:00','','','','','','','','','','','','','ejemplo1','',''),(22249,20155,20199,'Test Test','2016-05-07 06:58:08','2016-05-07 06:58:08',20005,22248,20157,0,'ejemplo2@globalhitss.com','ejemplo2','ejemplo2','ejemplo2',11014,11022,1,'1970-01-01 00:00:00','','','','','','','','','','','','','ejemplo2','',''),(22258,20155,20199,'Test Test','2016-05-07 07:05:10','2016-05-07 07:05:10',20005,22257,20157,0,'ejemplo3@globalhitss.com','ejemplo3','ejemplo3','ejemplo3',11015,11022,1,'1970-01-01 00:00:00','','','','','','','','','','','','','ejemplo3','','');
/*!40000 ALTER TABLE `contact_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contrato`
--

DROP TABLE IF EXISTS `contrato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contrato` (
  `contratoId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) DEFAULT NULL,
  `motivo` varchar(75) DEFAULT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `titulo` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`contratoId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contrato`
--

LOCK TABLES `contrato` WRITE;
/*!40000 ALTER TABLE `contrato` DISABLE KEYS */;
/*!40000 ALTER TABLE `contrato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `counter`
--

DROP TABLE IF EXISTS `counter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `counter` (
  `name` varchar(75) NOT NULL,
  `currentId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `counter`
--

LOCK TABLES `counter` WRITE;
/*!40000 ALTER TABLE `counter` DISABLE KEYS */;
INSERT INTO `counter` VALUES ('com.hitss.layer.model.SolicitudRequerimiento',200),('com.liferay.counter.model.Counter',30700),('com.liferay.portal.model.Layout#20173#true',1),('com.liferay.portal.model.Layout#20182#false',1),('com.liferay.portal.model.Layout#20182#true',2),('com.liferay.portal.model.Layout#20317#true',1),('com.liferay.portal.model.Layout#20329#true',1),('com.liferay.portal.model.Layout#20339#true',1),('com.liferay.portal.model.Layout#20350#true',2),('com.liferay.portal.model.Layout#20376#true',3),('com.liferay.portal.model.Layout#20534#true',1),('com.liferay.portal.model.Layout#20623#true',7),('com.liferay.portal.model.Layout#27103#true',1),('com.liferay.portal.model.ResourceAction',1500),('com.liferay.portal.model.ResourcePermission',9400),('com.liferay.portlet.asset.model.AssetTag',600),('com.liferay.portlet.social.model.SocialActivity',100);
/*!40000 ALTER TABLE `counter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `country` (
  `countryId` bigint(20) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `a2` varchar(75) DEFAULT NULL,
  `a3` varchar(75) DEFAULT NULL,
  `number_` varchar(75) DEFAULT NULL,
  `idd_` varchar(75) DEFAULT NULL,
  `zipRequired` tinyint(4) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`countryId`),
  UNIQUE KEY `IX_717B97E1` (`a2`),
  UNIQUE KEY `IX_717B9BA2` (`a3`),
  UNIQUE KEY `IX_19DA007B` (`name`),
  KEY `IX_25D734CD` (`active_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'canada','CA','CAN','124','001',1,1),(2,'china','CN','CHN','156','086',1,1),(3,'france','FR','FRA','250','033',1,1),(4,'germany','DE','DEU','276','049',1,1),(5,'hong-kong','HK','HKG','344','852',1,1),(6,'hungary','HU','HUN','348','036',1,1),(7,'israel','IL','ISR','376','972',1,1),(8,'italy','IT','ITA','380','039',1,1),(9,'japan','JP','JPN','392','081',0,1),(10,'south-korea','KR','KOR','410','082',1,1),(11,'netherlands','NL','NLD','528','031',1,1),(12,'portugal','PT','PRT','620','351',1,1),(13,'russia','RU','RUS','643','007',1,1),(14,'singapore','SG','SGP','702','065',1,1),(15,'spain','ES','ESP','724','034',1,1),(16,'turkey','TR','TUR','792','090',1,1),(17,'vietnam','VN','VNM','704','084',1,1),(18,'united-kingdom','GB','GBR','826','044',1,1),(19,'united-states','US','USA','840','001',1,1),(20,'afghanistan','AF','AFG','4','093',1,1),(21,'albania','AL','ALB','8','355',1,1),(22,'algeria','DZ','DZA','12','213',1,1),(23,'american-samoa','AS','ASM','16','684',1,1),(24,'andorra','AD','AND','20','376',1,1),(25,'angola','AO','AGO','24','244',0,1),(26,'anguilla','AI','AIA','660','264',1,1),(27,'antarctica','AQ','ATA','10','672',1,1),(28,'antigua-barbuda','AG','ATG','28','268',0,1),(29,'argentina','AR','ARG','32','054',1,1),(30,'armenia','AM','ARM','51','374',1,1),(31,'aruba','AW','ABW','533','297',0,1),(32,'australia','AU','AUS','36','061',1,1),(33,'austria','AT','AUT','40','043',1,1),(34,'azerbaijan','AZ','AZE','31','994',1,1),(35,'bahamas','BS','BHS','44','242',0,1),(36,'bahrain','BH','BHR','48','973',1,1),(37,'bangladesh','BD','BGD','50','880',1,1),(38,'barbados','BB','BRB','52','246',1,1),(39,'belarus','BY','BLR','112','375',1,1),(40,'belgium','BE','BEL','56','032',1,1),(41,'belize','BZ','BLZ','84','501',0,1),(42,'benin','BJ','BEN','204','229',0,1),(43,'bermuda','BM','BMU','60','441',1,1),(44,'bhutan','BT','BTN','64','975',1,1),(45,'bolivia','BO','BOL','68','591',1,1),(46,'bosnia-herzegovina','BA','BIH','70','387',1,1),(47,'botswana','BW','BWA','72','267',0,1),(48,'brazil','BR','BRA','76','055',1,1),(49,'british-virgin-islands','VG','VGB','92','284',1,1),(50,'brunei','BN','BRN','96','673',1,1),(51,'bulgaria','BG','BGR','100','359',1,1),(52,'burkina-faso','BF','BFA','854','226',0,1),(53,'burma-myanmar','MM','MMR','104','095',1,1),(54,'burundi','BI','BDI','108','257',0,1),(55,'cambodia','KH','KHM','116','855',1,1),(56,'cameroon','CM','CMR','120','237',1,1),(57,'cape-verde-island','CV','CPV','132','238',1,1),(58,'cayman-islands','KY','CYM','136','345',1,1),(59,'central-african-republic','CF','CAF','140','236',0,1),(60,'chad','TD','TCD','148','235',1,1),(61,'chile','CL','CHL','152','056',1,1),(62,'christmas-island','CX','CXR','162','061',1,1),(63,'cocos-islands','CC','CCK','166','061',1,1),(64,'colombia','CO','COL','170','057',1,1),(65,'comoros','KM','COM','174','269',0,1),(66,'republic-of-congo','CD','COD','180','242',0,1),(67,'democratic-republic-of-congo','CG','COG','178','243',0,1),(68,'cook-islands','CK','COK','184','682',0,1),(69,'costa-rica','CR','CRI','188','506',1,1),(70,'croatia','HR','HRV','191','385',1,1),(71,'cuba','CU','CUB','192','053',1,1),(72,'cyprus','CY','CYP','196','357',1,1),(73,'czech-republic','CZ','CZE','203','420',1,1),(74,'denmark','DK','DNK','208','045',1,1),(75,'djibouti','DJ','DJI','262','253',0,1),(76,'dominica','DM','DMA','212','767',0,1),(77,'dominican-republic','DO','DOM','214','809',1,1),(78,'ecuador','EC','ECU','218','593',1,1),(79,'egypt','EG','EGY','818','020',1,1),(80,'el-salvador','SV','SLV','222','503',1,1),(81,'equatorial-guinea','GQ','GNQ','226','240',0,1),(82,'eritrea','ER','ERI','232','291',0,1),(83,'estonia','EE','EST','233','372',1,1),(84,'ethiopia','ET','ETH','231','251',1,1),(85,'faeroe-islands','FO','FRO','234','298',1,1),(86,'falkland-islands','FK','FLK','238','500',1,1),(87,'fiji-islands','FJ','FJI','242','679',0,1),(88,'finland','FI','FIN','246','358',1,1),(89,'french-guiana','GF','GUF','254','594',1,1),(90,'french-polynesia','PF','PYF','258','689',1,1),(91,'gabon','GA','GAB','266','241',1,1),(92,'gambia','GM','GMB','270','220',0,1),(93,'georgia','GE','GEO','268','995',1,1),(94,'ghana','GH','GHA','288','233',0,1),(95,'gibraltar','GI','GIB','292','350',1,1),(96,'greece','GR','GRC','300','030',1,1),(97,'greenland','GL','GRL','304','299',1,1),(98,'grenada','GD','GRD','308','473',0,1),(99,'guadeloupe','GP','GLP','312','590',1,1),(100,'guam','GU','GUM','316','671',1,1),(101,'guatemala','GT','GTM','320','502',1,1),(102,'guinea','GN','GIN','324','224',0,1),(103,'guinea-bissau','GW','GNB','624','245',1,1),(104,'guyana','GY','GUY','328','592',0,1),(105,'haiti','HT','HTI','332','509',1,1),(106,'honduras','HN','HND','340','504',1,1),(107,'iceland','IS','ISL','352','354',1,1),(108,'india','IN','IND','356','091',1,1),(109,'indonesia','ID','IDN','360','062',1,1),(110,'iran','IR','IRN','364','098',1,1),(111,'iraq','IQ','IRQ','368','964',1,1),(112,'ireland','IE','IRL','372','353',0,1),(113,'ivory-coast','CI','CIV','384','225',1,1),(114,'jamaica','JM','JAM','388','876',1,1),(115,'jordan','JO','JOR','400','962',1,1),(116,'kazakhstan','KZ','KAZ','398','007',1,1),(117,'kenya','KE','KEN','404','254',1,1),(118,'kiribati','KI','KIR','408','686',0,1),(119,'kuwait','KW','KWT','414','965',1,1),(120,'north-korea','KP','PRK','408','850',0,1),(121,'kyrgyzstan','KG','KGZ','471','996',1,1),(122,'laos','LA','LAO','418','856',1,1),(123,'latvia','LV','LVA','428','371',1,1),(124,'lebanon','LB','LBN','422','961',1,1),(125,'lesotho','LS','LSO','426','266',1,1),(126,'liberia','LR','LBR','430','231',1,1),(127,'libya','LY','LBY','434','218',1,1),(128,'liechtenstein','LI','LIE','438','423',1,1),(129,'lithuania','LT','LTU','440','370',1,1),(130,'luxembourg','LU','LUX','442','352',1,1),(131,'macau','MO','MAC','446','853',0,1),(132,'macedonia','MK','MKD','807','389',1,1),(133,'madagascar','MG','MDG','450','261',1,1),(134,'malawi','MW','MWI','454','265',0,1),(135,'malaysia','MY','MYS','458','060',1,1),(136,'maldives','MV','MDV','462','960',1,1),(137,'mali','ML','MLI','466','223',0,1),(138,'malta','MT','MLT','470','356',1,1),(139,'marshall-islands','MH','MHL','584','692',1,1),(140,'martinique','MQ','MTQ','474','596',1,1),(141,'mauritania','MR','MRT','478','222',0,1),(142,'mauritius','MU','MUS','480','230',0,1),(143,'mayotte-island','YT','MYT','175','269',1,1),(144,'mexico','MX','MEX','484','052',1,1),(145,'micronesia','FM','FSM','583','691',1,1),(146,'moldova','MD','MDA','498','373',1,1),(147,'monaco','MC','MCO','492','377',1,1),(148,'mongolia','MN','MNG','496','976',1,1),(149,'montenegro','ME','MNE','499','382',1,1),(150,'montserrat','MS','MSR','500','664',0,1),(151,'morocco','MA','MAR','504','212',1,1),(152,'mozambique','MZ','MOZ','508','258',1,1),(153,'namibia','NA','NAM','516','264',1,1),(154,'nauru','NR','NRU','520','674',0,1),(155,'nepal','NP','NPL','524','977',1,1),(156,'netherlands-antilles','AN','ANT','530','599',1,1),(157,'new-caledonia','NC','NCL','540','687',1,1),(158,'new-zealand','NZ','NZL','554','064',1,1),(159,'nicaragua','NI','NIC','558','505',1,1),(160,'niger','NE','NER','562','227',1,1),(161,'nigeria','NG','NGA','566','234',1,1),(162,'niue','NU','NIU','570','683',0,1),(163,'norfolk-island','NF','NFK','574','672',1,1),(164,'norway','NO','NOR','578','047',1,1),(165,'oman','OM','OMN','512','968',1,1),(166,'pakistan','PK','PAK','586','092',1,1),(167,'palau','PW','PLW','585','680',1,1),(168,'palestine','PS','PSE','275','970',1,1),(169,'panama','PA','PAN','591','507',1,1),(170,'papua-new-guinea','PG','PNG','598','675',1,1),(171,'paraguay','PY','PRY','600','595',1,1),(172,'peru','PE','PER','604','051',1,1),(173,'philippines','PH','PHL','608','063',1,1),(174,'poland','PL','POL','616','048',1,1),(175,'puerto-rico','PR','PRI','630','787',1,1),(176,'qatar','QA','QAT','634','974',0,1),(177,'reunion-island','RE','REU','638','262',1,1),(178,'romania','RO','ROU','642','040',1,1),(179,'rwanda','RW','RWA','646','250',0,1),(180,'st-helena','SH','SHN','654','290',1,1),(181,'st-kitts','KN','KNA','659','869',0,1),(182,'st-lucia','LC','LCA','662','758',0,1),(183,'st-pierre-miquelon','PM','SPM','666','508',1,1),(184,'st-vincent','VC','VCT','670','784',1,1),(185,'san-marino','SM','SMR','674','378',1,1),(186,'sao-tome-principe','ST','STP','678','239',0,1),(187,'saudi-arabia','SA','SAU','682','966',1,1),(188,'senegal','SN','SEN','686','221',1,1),(189,'serbia','RS','SRB','688','381',1,1),(190,'seychelles','SC','SYC','690','248',0,1),(191,'sierra-leone','SL','SLE','694','249',0,1),(192,'slovakia','SK','SVK','703','421',1,1),(193,'slovenia','SI','SVN','705','386',1,1),(194,'solomon-islands','SB','SLB','90','677',0,1),(195,'somalia','SO','SOM','706','252',0,1),(196,'south-africa','ZA','ZAF','710','027',1,1),(197,'sri-lanka','LK','LKA','144','094',1,1),(198,'sudan','SD','SDN','736','095',1,1),(199,'suriname','SR','SUR','740','597',0,1),(200,'swaziland','SZ','SWZ','748','268',1,1),(201,'sweden','SE','SWE','752','046',1,1),(202,'switzerland','CH','CHE','756','041',1,1),(203,'syria','SY','SYR','760','963',0,1),(204,'taiwan','TW','TWN','158','886',1,1),(205,'tajikistan','TJ','TJK','762','992',1,1),(206,'tanzania','TZ','TZA','834','255',0,1),(207,'thailand','TH','THA','764','066',1,1),(208,'togo','TG','TGO','768','228',1,1),(209,'tonga','TO','TON','776','676',0,1),(210,'trinidad-tobago','TT','TTO','780','868',0,1),(211,'tunisia','TN','TUN','788','216',1,1),(212,'turkmenistan','TM','TKM','795','993',1,1),(213,'turks-caicos','TC','TCA','796','649',1,1),(214,'tuvalu','TV','TUV','798','688',0,1),(215,'uganda','UG','UGA','800','256',0,1),(216,'ukraine','UA','UKR','804','380',1,1),(217,'united-arab-emirates','AE','ARE','784','971',0,1),(218,'uruguay','UY','URY','858','598',1,1),(219,'uzbekistan','UZ','UZB','860','998',1,1),(220,'vanuatu','VU','VUT','548','678',0,1),(221,'vatican-city','VA','VAT','336','039',1,1),(222,'venezuela','VE','VEN','862','058',1,1),(223,'wallis-futuna','WF','WLF','876','681',1,1),(224,'western-samoa','WS','WSM','882','685',1,1),(225,'yemen','YE','YEM','887','967',0,1),(226,'zambia','ZM','ZMB','894','260',1,1),(227,'zimbabwe','ZW','ZWE','716','263',0,1),(228,'aland-islands','AX','ALA','248','359',1,1),(229,'bonaire-st-eustatius-saba','BQ','BES','535','599',1,1),(230,'bouvet-island','BV','BVT','74','047',1,1),(231,'british-indian-ocean-territory','IO','IOT','86','246',1,1),(232,'curacao','CW','CUW','531','599',1,1),(233,'french-southern-territories','TF','ATF','260','033',0,1),(234,'guernsey','GG','GGY','831','044',1,1),(235,'heard-island-mcdonald-islands','HM','HMD','334','061',1,1),(236,'isle-of-man','IM','IMN','833','044',1,1),(237,'jersey','JE','JEY','832','044',1,1),(238,'northern-mariana-islands','MP','MNP','580','670',1,1),(239,'pitcairn','PN','PCN','612','649',1,1),(240,'south-georgia-south-sandwich-islands','GS','SGS','239','044',1,1),(241,'south-sudan','SS','SSD','728','211',1,1),(242,'sint-maarten','SX','SXM','534','721',1,1),(243,'st-barthelemy','BL','BLM','652','590',1,1),(244,'st-martin','MF','MAF','663','590',1,1),(245,'tokelau','TK','TKL','772','690',0,1),(246,'timor-leste','TL','TLS','626','670',1,1),(247,'united-states-minor-outlying-islands','UM','UMI','581','699',1,1),(248,'united-states-virgin-islands','VI','VIR','850','340',1,1),(249,'western-sahara','EH','ESH','732','212',1,1);
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cronograma`
--

DROP TABLE IF EXISTS `cronograma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cronograma` (
  `cronogramaId` bigint(20) NOT NULL,
  `solicitudEvaluacionDesempennoId` bigint(20) DEFAULT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `estado` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`cronogramaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cronograma`
--

LOCK TABLES `cronograma` WRITE;
/*!40000 ALTER TABLE `cronograma` DISABLE KEYS */;
/*!40000 ALTER TABLE `cronograma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cyrususer`
--

DROP TABLE IF EXISTS `cyrususer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cyrususer` (
  `userId` varchar(75) NOT NULL,
  `password_` varchar(75) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cyrususer`
--

LOCK TABLES `cyrususer` WRITE;
/*!40000 ALTER TABLE `cyrususer` DISABLE KEYS */;
/*!40000 ALTER TABLE `cyrususer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cyrusvirtual`
--

DROP TABLE IF EXISTS `cyrusvirtual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cyrusvirtual` (
  `emailAddress` varchar(75) NOT NULL,
  `userId` varchar(75) NOT NULL,
  PRIMARY KEY (`emailAddress`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cyrusvirtual`
--

LOCK TABLES `cyrusvirtual` WRITE;
/*!40000 ALTER TABLE `cyrusvirtual` DISABLE KEYS */;
/*!40000 ALTER TABLE `cyrusvirtual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddlrecord`
--

DROP TABLE IF EXISTS `ddlrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddlrecord` (
  `uuid_` varchar(75) DEFAULT NULL,
  `recordId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `versionUserId` bigint(20) DEFAULT NULL,
  `versionUserName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `DDMStorageId` bigint(20) DEFAULT NULL,
  `recordSetId` bigint(20) DEFAULT NULL,
  `version` varchar(75) DEFAULT NULL,
  `displayIndex` int(11) DEFAULT NULL,
  PRIMARY KEY (`recordId`),
  UNIQUE KEY `IX_B4328F39` (`uuid_`,`groupId`),
  KEY `IX_6A6C1C85` (`companyId`),
  KEY `IX_87A6B599` (`recordSetId`),
  KEY `IX_AAC564D3` (`recordSetId`,`userId`),
  KEY `IX_8BC2F891` (`uuid_`),
  KEY `IX_384AB6F7` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddlrecord`
--

LOCK TABLES `ddlrecord` WRITE;
/*!40000 ALTER TABLE `ddlrecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddlrecord` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddlrecordset`
--

DROP TABLE IF EXISTS `ddlrecordset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddlrecordset` (
  `uuid_` varchar(75) DEFAULT NULL,
  `recordSetId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `DDMStructureId` bigint(20) DEFAULT NULL,
  `recordSetKey` varchar(75) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `minDisplayRows` int(11) DEFAULT NULL,
  `scope` int(11) DEFAULT NULL,
  PRIMARY KEY (`recordSetId`),
  UNIQUE KEY `IX_56DAB121` (`groupId`,`recordSetKey`),
  UNIQUE KEY `IX_270BA5E1` (`uuid_`,`groupId`),
  KEY `IX_4FA5969F` (`groupId`),
  KEY `IX_561E44E9` (`uuid_`),
  KEY `IX_5938C39F` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddlrecordset`
--

LOCK TABLES `ddlrecordset` WRITE;
/*!40000 ALTER TABLE `ddlrecordset` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddlrecordset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddlrecordversion`
--

DROP TABLE IF EXISTS `ddlrecordversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddlrecordversion` (
  `recordVersionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `DDMStorageId` bigint(20) DEFAULT NULL,
  `recordSetId` bigint(20) DEFAULT NULL,
  `recordId` bigint(20) DEFAULT NULL,
  `version` varchar(75) DEFAULT NULL,
  `displayIndex` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`recordVersionId`),
  UNIQUE KEY `IX_C79E347` (`recordId`,`version`),
  KEY `IX_2F4DDFE1` (`recordId`),
  KEY `IX_762ADC7` (`recordId`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddlrecordversion`
--

LOCK TABLES `ddlrecordversion` WRITE;
/*!40000 ALTER TABLE `ddlrecordversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddlrecordversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddmcontent`
--

DROP TABLE IF EXISTS `ddmcontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddmcontent` (
  `uuid_` varchar(75) DEFAULT NULL,
  `contentId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `xml` longtext,
  PRIMARY KEY (`contentId`),
  UNIQUE KEY `IX_EB9BDE28` (`uuid_`,`groupId`),
  KEY `IX_E3BAF436` (`companyId`),
  KEY `IX_50BF1038` (`groupId`),
  KEY `IX_AE4B50C2` (`uuid_`),
  KEY `IX_3A9C0626` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddmcontent`
--

LOCK TABLES `ddmcontent` WRITE;
/*!40000 ALTER TABLE `ddmcontent` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddmcontent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddmstoragelink`
--

DROP TABLE IF EXISTS `ddmstoragelink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddmstoragelink` (
  `uuid_` varchar(75) DEFAULT NULL,
  `storageLinkId` bigint(20) NOT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `structureId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`storageLinkId`),
  UNIQUE KEY `IX_702D1AD5` (`classPK`),
  KEY `IX_81776090` (`structureId`),
  KEY `IX_32A18526` (`uuid_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddmstoragelink`
--

LOCK TABLES `ddmstoragelink` WRITE;
/*!40000 ALTER TABLE `ddmstoragelink` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddmstoragelink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddmstructure`
--

DROP TABLE IF EXISTS `ddmstructure`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddmstructure` (
  `uuid_` varchar(75) DEFAULT NULL,
  `structureId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentStructureId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `structureKey` varchar(75) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `xsd` longtext,
  `storageType` varchar(75) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  PRIMARY KEY (`structureId`),
  UNIQUE KEY `IX_C8785130` (`groupId`,`classNameId`,`structureKey`),
  UNIQUE KEY `IX_85C7EBE2` (`uuid_`,`groupId`),
  KEY `IX_31817A62` (`classNameId`),
  KEY `IX_4FBAC092` (`companyId`,`classNameId`),
  KEY `IX_C8419FBE` (`groupId`),
  KEY `IX_B6ED5E50` (`groupId`,`classNameId`),
  KEY `IX_43395316` (`groupId`,`parentStructureId`),
  KEY `IX_657899A8` (`parentStructureId`),
  KEY `IX_20FDE04C` (`structureKey`),
  KEY `IX_E61809C8` (`uuid_`),
  KEY `IX_F9FB8D60` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddmstructure`
--

LOCK TABLES `ddmstructure` WRITE;
/*!40000 ALTER TABLE `ddmstructure` DISABLE KEYS */;
INSERT INTO `ddmstructure` VALUES ('8e91a377-b864-408c-8d4e-83fcbd076c75',20303,20195,20155,20159,'','2016-05-04 07:40:13','2016-05-04 07:40:13',0,20091,'LEARNING MODULE METADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Learning Module Metadata</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Learning Module Metadata</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select2235\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"home_edition\" type=\"option\" value=\"HE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Home Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"business_edition\" type=\"option\" value=\"BE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Business Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"enterprise_edition\" type=\"option\" value=\"EE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Enterprise Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Product]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select3212\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"1_0\" type=\"option\" value=\"1\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[1.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"2_0\" type=\"option\" value=\"2\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[2.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"3_0\" type=\"option\" value=\"3\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[3.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Version]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select4115\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"administration\" type=\"option\" value=\"admin\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Administration]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"installation\" type=\"option\" value=\"install\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Installation]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"configuration\" type=\"option\" value=\"config\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Configuration]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Topics]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select5069\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"beginner\" type=\"option\" value=\"beginner\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Beginner]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"intermediate\" type=\"option\" value=\"intermediate\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Intermediate]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"advanced\" type=\"option\" value=\"advanced\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Advanced]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Level]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('c0628438-dc47-4c71-8435-03686643f87d',20304,20195,20155,20159,'','2016-05-04 07:40:13','2016-05-04 07:40:13',0,20091,'MARKETING CAMPAIGN THEME METADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Marketing Campaign Theme Metadata</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Marketing Campaign Theme Metadata</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select2305\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"strong_company\" type=\"option\" value=\"strong\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Strong Company]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"new_product_launch\" type=\"option\" value=\"product\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[New Product Launch]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"company_philosophy\" type=\"option\" value=\"philosophy\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Company Philosophy]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Select]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select3229\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"your_trusted_advisor\" type=\"option\" value=\"advisor\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Your Trusted Advisor]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"10_years_of_customer_solutions\" type=\"option\" value=\"solutions\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[10 Years of Customer Solutions]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"making_a_difference\" type=\"option\" value=\"difference\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Making a Difference]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Campaign Theme]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select4282\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"awareness\" type=\"option\" value=\"awareness\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Awareness]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"lead_generation\" type=\"option\" value=\"leads\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Lead Generation]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"customer_service\" type=\"option\" value=\"service\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Customer Service]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Business Goal]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('2a4a8656-007b-47f6-a4b1-f7d6dcf661a4',20305,20195,20155,20159,'','2016-05-04 07:40:13','2016-05-04 07:40:13',0,20091,'MEETING METADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Meeting Metadata</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Metadata for meeting</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" indexType=\"keyword\" name=\"ddm-date3054\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2217\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Meeting Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text4569\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Time]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text5638\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Location]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"text\" name=\"textarea6584\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"text\" name=\"textarea7502\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Participants]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('cadaeee5-0b3b-4c70-bd80-a08c9329788c',20307,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',0,20091,'AUTO_BB7AFCEB-7B5E-44C3-B46B-70C6B5E06BA0','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Contract</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Contract</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" indexType=\"keyword\" name=\"ddm-date18949\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Effective Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" indexType=\"keyword\" name=\"ddm-date20127\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Expiration Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select10264\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"nda\" type=\"option\" value=\"NDA\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[NDA]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"msa\" type=\"option\" value=\"MSA\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[MSA]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"license_agreement\" type=\"option\" value=\"License\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[License Agreement]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Contract Type]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select4893\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"draft\" type=\"option\" value=\"Draft\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Draft]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"in_review\" type=\"option\" value=\"Review\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[In Review]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"suspended\" type=\"option\" value=\"Suspended\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Suspended]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"signed\" type=\"option\" value=\"Signed\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Signed]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Status]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text14822\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Legal Reviewer]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text17700\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Signing Authority]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2087\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Deal Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),('c579b8f0-82ad-4cf3-80b4-131b3e96909a',20309,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',0,20091,'AUTO_AE919F60-AD8D-4763-AA0D-E36CD4F1784F','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Marketing Banner</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Marketing Banner</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"radio5547\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"radio\">\n		<dynamic-element name=\"yes\" type=\"option\" value=\"yes\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Yes]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"no\" type=\"option\" value=\"no\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[No]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Needs Legal Review]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2033\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Banner Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"text\" name=\"textarea2873\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),('1b73c9e8-3829-415e-b4ad-d3a2ea5d6199',20311,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',0,20091,'AUTO_FEDB56E9-D3B3-4F0E-A657-CD183B9EDECF','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Online Training</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Online Training</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2082\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Lesson Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2979\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Author]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),('577de8ca-f2ee-42b8-a90a-149c045e2d37',20313,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',0,20091,'AUTO_A57B686A-89F5-42AB-A725-DA1E65375D49','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Sales Presentation</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Sales Presentation</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select2890\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"home_edition\" type=\"option\" value=\"HE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Home Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"business_edition\" type=\"option\" value=\"BE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Business Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"enterprise_edition\" type=\"option\" value=\"EE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Enterprise Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Product]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select3864\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"1_0\" type=\"option\" value=\"1\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[1.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"2_0\" type=\"option\" value=\"2\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[2.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"3_0\" type=\"option\" value=\"3\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[3.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Version]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select4831\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"website\" type=\"option\" value=\"website\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Website]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"collaboration\" type=\"option\" value=\"collaboration\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Collaboration]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"intranet\" type=\"option\" value=\"intranet\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Intranet]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Areas of Interest]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select5929\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"acme\" type=\"option\" value=\"acme\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[ACME]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"sevencogs\" type=\"option\" value=\"sevencogs\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[SevenCogs]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"freeplus\" type=\"option\" value=\"freeplus\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[FreePlus]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Competitors]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text1993\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Prospect Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),('9f0ca580-023d-49c6-8f39-30c2259ad01b',20315,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',0,20314,'TIKARAWMETADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">TIKARAWMETADATA</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">TIKARAWMETADATA</Description></root>','<root available-locales=\"es_ES\" default-locale=\"es_ES\"><dynamic-element dataType=\"string\" name=\"ClimateForcast_PROGRAM_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.PROGRAM_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_COMMAND_LINE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.COMMAND_LINE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_HISTORY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.HISTORY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_TABLE_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.TABLE_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_INSTITUTION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.INSTITUTION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_SOURCE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.SOURCE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_CONTACT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.CONTACT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_PROJECT_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.PROJECT_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_CONVENTIONS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.CONVENTIONS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_REFERENCES\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.REFERENCES]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_ACKNOWLEDGEMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.ACKNOWLEDGEMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_REALIZATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.REALIZATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_EXPERIMENT_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.EXPERIMENT_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_COMMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.COMMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_MODEL_NAME_ENGLISH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.MODEL_NAME_ENGLISH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"CreativeCommons_LICENSE_URL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.CreativeCommons.LICENSE_URL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"CreativeCommons_LICENSE_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.CreativeCommons.LICENSE_LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"CreativeCommons_WORK_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.CreativeCommons.WORK_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_NAMESPACE_URI_DC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.NAMESPACE_URI_DC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_NAMESPACE_URI_DC_TERMS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.NAMESPACE_URI_DC_TERMS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_PREFIX_DC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.PREFIX_DC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_PREFIX_DC_TERMS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.PREFIX_DC_TERMS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_FORMAT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.FORMAT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_IDENTIFIER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.IDENTIFIER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_MODIFIED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.MODIFIED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_CONTRIBUTOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.CONTRIBUTOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_COVERAGE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.COVERAGE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_CREATOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.CREATOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_CREATED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.CREATED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_DESCRIPTION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.DESCRIPTION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_LANGUAGE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.LANGUAGE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_PUBLISHER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.PUBLISHER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_RELATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.RELATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_RIGHTS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.RIGHTS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_SOURCE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.SOURCE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_SUBJECT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.SUBJECT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_TITLE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.TITLE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Geographic_LATITUDE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Geographic.LATITUDE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Geographic_LONGITUDE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Geographic.LONGITUDE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Geographic_ALTITUDE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Geographic.ALTITUDE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_ENCODING\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_ENCODING]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_LANGUAGE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_LANGUAGE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_LENGTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_LENGTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_DISPOSITION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_DISPOSITION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_MD5\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_MD5]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_LAST_MODIFIED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.LAST_MODIFIED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_RECIPIENT_ADDRESS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_RECIPIENT_ADDRESS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_FROM\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_FROM]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_TO\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_TO]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_CC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_CC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_BCC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_BCC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_KEYWORDS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.KEYWORDS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_COMMENTS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.COMMENTS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LAST_AUTHOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LAST_AUTHOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_AUTHOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.AUTHOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_APPLICATION_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.APPLICATION_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_REVISION_NUMBER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.REVISION_NUMBER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_TEMPLATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.TEMPLATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_TOTAL_TIME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.TOTAL_TIME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_PRESENTATION_FORMAT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.PRESENTATION_FORMAT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_NOTES\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.NOTES]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_MANAGER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.MANAGER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_APPLICATION_VERSION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.APPLICATION_VERSION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_VERSION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.VERSION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CONTENT_STATUS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CONTENT_STATUS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CATEGORY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CATEGORY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_COMPANY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.COMPANY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_SECURITY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.SECURITY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_SLIDE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.SLIDE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_PAGE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.PAGE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_PARAGRAPH_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.PARAGRAPH_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LINE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LINE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_WORD_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.WORD_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CHARACTER_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CHARACTER_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CHARACTER_COUNT_WITH_SPACES\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CHARACTER_COUNT_WITH_SPACES]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_TABLE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.TABLE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_IMAGE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.IMAGE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_OBJECT_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.OBJECT_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_EDIT_TIME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.EDIT_TIME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CREATION_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CREATION_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LAST_SAVED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LAST_SAVED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LAST_PRINTED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LAST_PRINTED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_USER_DEFINED_METADATA_NAME_PREFIX\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.USER_DEFINED_METADATA_NAME_PREFIX]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_BITS_PER_SAMPLE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.BITS_PER_SAMPLE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_IMAGE_LENGTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.IMAGE_LENGTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_IMAGE_WIDTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.IMAGE_WIDTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_SAMPLES_PER_PIXEL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.SAMPLES_PER_PIXEL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_FLASH_FIRED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.FLASH_FIRED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_EXPOSURE_TIME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.EXPOSURE_TIME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_F_NUMBER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.F_NUMBER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_FOCAL_LENGTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.FOCAL_LENGTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_ISO_SPEED_RATINGS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.ISO_SPEED_RATINGS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_EQUIPMENT_MAKE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.EQUIPMENT_MAKE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_EQUIPMENT_MODEL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.EQUIPMENT_MODEL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_SOFTWARE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.SOFTWARE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_ORIENTATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.ORIENTATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_RESOLUTION_HORIZONTAL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.RESOLUTION_HORIZONTAL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_RESOLUTION_VERTICAL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.RESOLUTION_VERTICAL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_RESOLUTION_UNIT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.RESOLUTION_UNIT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_ORIGINAL_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.ORIGINAL_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMetadataKeys_RESOURCE_NAME_KEY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMetadataKeys.RESOURCE_NAME_KEY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMetadataKeys_PROTECTED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMetadataKeys.PROTECTED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMetadataKeys_EMBEDDED_RELATIONSHIP_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMetadataKeys.EMBEDDED_RELATIONSHIP_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMimeKeys_TIKA_MIME_FILE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMimeKeys.TIKA_MIME_FILE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMimeKeys_MIME_TYPE_MAGIC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMimeKeys.MIME_TYPE_MAGIC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_DURATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.DURATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ABS_PEAK_AUDIO_FILE_PATH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ABS_PEAK_AUDIO_FILE_PATH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ALBUM\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ALBUM]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ALT_TAPE_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ALT_TAPE_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ARTIST\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ARTIST]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_MOD_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_MOD_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_SAMPLE_RATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_SAMPLE_RATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_SAMPLE_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_SAMPLE_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_CHANNEL_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_CHANNEL_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_COMPRESSOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_COMPRESSOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_COMPOSER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.COMPOSER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_COPYRIGHT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.COPYRIGHT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ENGINEER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ENGINEER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_FILE_DATA_RATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.FILE_DATA_RATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_GENRE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.GENRE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_INSTRUMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.INSTRUMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_KEY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.KEY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_LOG_COMMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.LOG_COMMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_LOOP\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.LOOP]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_NUMBER_OF_BEATS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.NUMBER_OF_BEATS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_METADATA_MOD_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.METADATA_MOD_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_PULL_DOWN\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.PULL_DOWN]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_RELATIVE_PEAK_AUDIO_FILE_PATH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.RELATIVE_PEAK_AUDIO_FILE_PATH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_RELEASE_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.RELEASE_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SCALE_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SCALE_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SCENE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SCENE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SHOT_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SHOT_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SHOT_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SHOT_LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SHOT_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SHOT_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SPEAKER_PLACEMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SPEAKER_PLACEMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_STRETCH_MODE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.STRETCH_MODE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TAPE_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TAPE_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TEMPO\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TEMPO]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TIME_SIGNATURE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TIME_SIGNATURE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TRACK_NUMBER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TRACK_NUMBER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_ALPHA_MODE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_ALPHA_MODE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_ALPHA_UNITY_IS_TRANSPARENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_ALPHA_UNITY_IS_TRANSPARENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_COLOR_SPACE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_COLOR_SPACE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_COMPRESSOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_COMPRESSOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_FIELD_ORDER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_FIELD_ORDER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_FRAME_RATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_FRAME_RATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_MOD_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_MOD_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_PIXEL_DEPTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_PIXEL_DEPTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_PIXEL_ASPECT_RATIO\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_PIXEL_ASPECT_RATIO]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element></root>','xml',0),('d0d737a6-1e0d-4153-ac51-722da9c9a2f4',20412,20182,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',0,20098,'CONTACTS','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Contacts</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Contacts</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" name=\"company\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Company]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"email\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Email]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"firstName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[First Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"imService\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"aol\" type=\"option\" value=\"aol\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[AOL]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"yahoo\" type=\"option\" value=\"yahoo\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Yahoo]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"gtalk\" type=\"option\" value=\"gtalk\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[GTalk]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Instant Messenger Service]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"gtalk\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"imUserName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Instant Messenger]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"jobTitle\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Job Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"lastName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Last Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"notes\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Notes]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"phoneMobile\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Phone (Mobile)]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"phoneOffice\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Phone (Office)]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('cba08113-f377-4882-be58-ee167d94a8bd',20413,20182,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',0,20098,'EVENTS','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Events</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Events</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"double\" fieldNamespace=\"ddm\" name=\"cost\" required=\"false\" showLabel=\"true\" type=\"ddm-number\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Cost]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"eventDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"eventName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Event Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"eventTime\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Time]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"location\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Location]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('70138a3d-330d-479c-8f49-771abb56f48b',20414,20182,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',0,20098,'INVENTORY','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Inventory</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Inventory</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"item\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Item]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"location\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Location]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"purchaseDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Purchase Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"double\" fieldNamespace=\"ddm\" name=\"purchasePrice\" required=\"false\" showLabel=\"true\" type=\"ddm-number\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Purchase Price]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"double\" fieldNamespace=\"ddm\" name=\"quantity\" required=\"false\" showLabel=\"true\" type=\"ddm-number\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Quantity]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('6cdbb21a-6dd8-4f98-a2be-95e9bd727110',20415,20182,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',0,20098,'ISSUES TRACKING','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Issues Tracking</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Issue Tracking</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" name=\"assignedTo\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Assigned To]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"comments\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Comments]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"dueDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Due Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"issueId\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Issue ID]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"severity\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"critical\" type=\"option\" value=\"critical\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Critical]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"major\" type=\"option\" value=\"major\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Major]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"minor\" type=\"option\" value=\"minor\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Minor]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"trivial\" type=\"option\" value=\"trivial\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Trivial]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Severity]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"minor\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"status\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"open\" type=\"option\" value=\"open\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Open]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"pending\" type=\"option\" value=\"pending\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Pending]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"completed\" type=\"option\" value=\"completed\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Completed]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Status]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"open\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"title\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('ce811099-1cff-44d2-9610-da8741ff9755',20416,20182,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',0,20098,'MEETING MINUTES','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Meeting Minutes</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Meeting Minutes</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"author\" required=\"false\" showLabel=\"true\" type=\"text\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Author]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"duration\" required=\"false\" showLabel=\"true\" type=\"text\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Meeting Duration]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"meetingDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Meeting Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"minutes\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Minutes]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"title\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('b175315a-981e-4808-a889-db80312cd655',20417,20182,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',0,20098,'TO DO','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">To Do</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">To Do</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" name=\"assignedTo\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Assigned To]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"comments\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Comments]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"endDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[End Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"integer\" fieldNamespace=\"ddm\" name=\"percentComplete\" required=\"false\" showLabel=\"true\" type=\"ddm-integer\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[% Complete]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[0]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"severity\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"critical\" type=\"option\" value=\"critical\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Critical]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"major\" type=\"option\" value=\"major\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Major]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"minor\" type=\"option\" value=\"minor\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Minor]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"trivial\" type=\"option\" value=\"trivial\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Trivial]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Severity]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"minor\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"startDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Start Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"status\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"open\" type=\"option\" value=\"open\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Open]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"pending\" type=\"option\" value=\"pending\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Pending]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"completed\" type=\"option\" value=\"completed\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Completed]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Status]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"open\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"title\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),('fbcf2673-a0d9-4ec3-a2a6-c89112991af4',27126,20182,20155,20199,'Test Test','2016-06-18 05:46:12','2016-06-18 05:48:50',0,20109,'27125','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Estructura test</Name></root>','','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" localizable=\"true\" name=\"campo01\" readOnly=\"false\" repeatable=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"small\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Campo021]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" localizable=\"true\" name=\"texto02\" readOnly=\"false\" repeatable=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"small\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Texto]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0);
/*!40000 ALTER TABLE `ddmstructure` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddmstructurelink`
--

DROP TABLE IF EXISTS `ddmstructurelink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddmstructurelink` (
  `structureLinkId` bigint(20) NOT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `structureId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`structureLinkId`),
  UNIQUE KEY `IX_C803899D` (`classPK`),
  KEY `IX_D43E4208` (`classNameId`),
  KEY `IX_17692B58` (`structureId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddmstructurelink`
--

LOCK TABLES `ddmstructurelink` WRITE;
/*!40000 ALTER TABLE `ddmstructurelink` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddmstructurelink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ddmtemplate`
--

DROP TABLE IF EXISTS `ddmtemplate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ddmtemplate` (
  `uuid_` varchar(75) DEFAULT NULL,
  `templateId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `templateKey` varchar(75) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `type_` varchar(75) DEFAULT NULL,
  `mode_` varchar(75) DEFAULT NULL,
  `language` varchar(75) DEFAULT NULL,
  `script` longtext,
  `cacheable` tinyint(4) DEFAULT NULL,
  `smallImage` tinyint(4) DEFAULT NULL,
  `smallImageId` bigint(20) DEFAULT NULL,
  `smallImageURL` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`templateId`),
  UNIQUE KEY `IX_E6DFAB84` (`groupId`,`classNameId`,`templateKey`),
  UNIQUE KEY `IX_1AA75CE3` (`uuid_`,`groupId`),
  KEY `IX_B6356F93` (`classNameId`,`classPK`,`type_`),
  KEY `IX_32F83D16` (`classPK`),
  KEY `IX_DB24DDDD` (`groupId`),
  KEY `IX_BD9A4A91` (`groupId`,`classNameId`),
  KEY `IX_824ADC72` (`groupId`,`classNameId`,`classPK`),
  KEY `IX_90800923` (`groupId`,`classNameId`,`classPK`,`type_`),
  KEY `IX_F0C3449` (`groupId`,`classNameId`,`classPK`,`type_`,`mode_`),
  KEY `IX_B1C33EA6` (`groupId`,`classPK`),
  KEY `IX_33BEF579` (`language`),
  KEY `IX_127A35B0` (`smallImageId`),
  KEY `IX_CAE41A28` (`templateKey`),
  KEY `IX_C4F283C8` (`type_`),
  KEY `IX_F2A243A7` (`uuid_`),
  KEY `IX_D4C2C221` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ddmtemplate`
--

LOCK TABLES `ddmtemplate` WRITE;
/*!40000 ALTER TABLE `ddmtemplate` DISABLE KEYS */;
INSERT INTO `ddmtemplate` VALUES ('3758bf65-8af6-4323-81f4-1ccaa8d723f3',20418,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20016,0,'WIKI-SOCIAL-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Social</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays social bookmarks and ratings for wiki pages and their child pages.</Description></root>','display','','ftl','<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n\n<#assign wikiPageClassName = \"com.liferay.portlet.wiki.model.WikiPage\" />\n\n<#assign assetRenderer = assetEntry.getAssetRenderer() />\n\n<div class=\"taglib-header\">\n	<h1 class=\"header-title\">${entry.getTitle()}</h1>\n</div>\n\n<div style=\"float: right;\">\n	<@getEditIcon />\n\n	<@getPageDetailsIcon />\n\n	<@getPrintIcon />\n</div>\n\n<div class=\"wiki-body\">\n	<div class=\"wiki-info\">\n		<span class=\"stats\">${assetEntry.getViewCount()} <@liferay.language key=\"views\" /></span> |\n\n		<span class=\"date\"><@liferay.language key=\"last-modified\" /> ${dateUtil.getDate(entry.getModifiedDate(), \"dd MMM yyyy - HH:mm:ss\", locale)}</span>\n\n		<span class=\"author\"><@liferay.language key=\"by\" /> ${htmlUtil.escape(portalUtil.getUserName(entry.getUserId(), entry.getUserName()))}</span>\n	</div>\n\n	<div class=\"wiki-content\">\n		<@liferay_ui[\"social-bookmarks\"]\n			displayStyle=\"normal\"\n			target=\"_blank\"\n			title=entry.getTitle()\n			url=viewURL\n		/>\n\n		${formattedContent}\n	</div>\n\n	<div class=\"page-actions\">\n		<div class=\"article-actions\">\n			<@getAddChildPageIcon />\n\n			<@getAttatchmentsIcon />\n		</div>\n	</div>\n\n	 <br />\n\n	<@getRatings cssClass=\"page-ratings\" entry=entry />\n\n	<@getRelatedAssets />\n</div>\n\n<div class=\"page-categorization\">\n	<div class=\"page-categories\">\n		<#assign viewCategorizedPagesURL = renderResponse.createRenderURL() />\n\n		${viewCategorizedPagesURL.setParameter(\"struts_action\", \"/wiki/view_categorized_pages\")}\n		${viewCategorizedPagesURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n\n		<@liferay_ui[\"asset-categories-summary\"]\n			className=wikiPageClassName\n			classPK=entry.getResourcePrimKey()\n			portletURL=viewCategorizedPagesURL\n		/>\n	</div>\n\n	<div class=\"page-tags\">\n		<#assign viewTaggedPagesURL = renderResponse.createRenderURL() />\n\n		${viewTaggedPagesURL.setParameter(\"struts_action\", \"/wiki/view_tagged_pages\")}\n		${viewTaggedPagesURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n\n		<@liferay_ui[\"asset-tags-summary\"]\n			className=wikiPageClassName\n			classPK=entry.getResourcePrimKey()\n			portletURL=viewTaggedPagesURL\n		/>\n	</div>\n</div>\n\n<#assign childPages = entry.getChildPages() />\n\n<#if (childPages?has_content)>\n	<div class=\"child-pages\">\n		<h2><@liferay.language key=\"children-pages\" /></h2>\n\n		<table class=\"taglib-search-iterator\">\n			<tr class=\"portlet-section-header results-header\">\n				<th>\n					<@liferay.language key=\"page\" />\n				</th>\n				<th>\n					<@liferay.language key=\"last-modified\" />\n				</th>\n				<th>\n					<@liferay.language key=\"ratings\" />\n				</th>\n			</tr>\n\n			<#list childPages as childPage>\n				<tr class=\"results-row\">\n					<#assign viewPageURL = renderResponse.createRenderURL() />\n\n					${viewPageURL.setParameter(\"struts_action\", \"/wiki/view\")}\n\n					<#assign childNode = childPage.getNode() />\n\n					${viewPageURL.setParameter(\"nodeName\", childNode.getName())}\n					${viewPageURL.setParameter(\"title\", childPage.getTitle())}\n\n					<td>\n						<a href=\"${viewPageURL}\">${childPage.getTitle()}</a>\n					</td>\n					<td>\n						<a href=\"${viewPageURL}\">${dateUtil.getDate(childPage.getModifiedDate(),\"dd MMM yyyy - HH:mm:ss\", locale)} <@liferay.language key=\"by\" /> ${htmlUtil.escape(portalUtil.getUserName(childPage.getUserId(), childPage.getUserName()))}</a>\n					</td>\n					<td>\n						<@getRatings cssClass=\"child-ratings\" entry=childPage />\n					</td>\n				</tr>\n			</#list>\n		</table>\n	</div>\n</#if>\n\n<@getDiscussion />\n\n<#macro getAddChildPageIcon>\n	<#if assetRenderer.hasEditPermission(themeDisplay.getPermissionChecker())>\n		<#assign addPageURL = renderResponse.createRenderURL() />\n\n		${addPageURL.setParameter(\"struts_action\", \"/wiki/edit_page\")}\n		${addPageURL.setParameter(\"redirect\", currentURL)}\n		${addPageURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n		${addPageURL.setParameter(\"title\", \"\")}\n		${addPageURL.setParameter(\"editTitle\", \"1\")}\n		${addPageURL.setParameter(\"parentTitle\", entry.getTitle())}\n\n		<@liferay_ui[\"icon\"]\n			image=\"add_article\"\n			label=true\n			message=\"add-child-page\"\n			url=addPageURL?string\n		/>\n	</#if>\n</#macro>\n\n<#macro getAttatchmentsIcon>\n	<#assign viewPageAttachmentsURL = renderResponse.createRenderURL() />\n\n	${viewPageAttachmentsURL.setParameter(\"struts_action\", \"/wiki/view_page_attachments\") }\n\n	<@liferay_ui[\"icon\"]\n		image=\"clip\"\n		label=true\n		message=\'${entry.getAttachmentsFileEntriesCount() + languageUtil.get(locale, \"attachments\")}\'\n		url=viewPageAttachmentsURL?string\n	/>\n</#macro>\n\n<#macro getDiscussion>\n	<#if validator.isNotNull(assetRenderer.getDiscussionPath()) && (enableComments == \"true\")>\n		<br />\n\n		<#assign discussionURL = renderResponse.createActionURL() />\n\n		${discussionURL.setParameter(\"struts_action\", \"/wiki/\" + assetRenderer.getDiscussionPath())}\n\n		<@liferay_ui[\"discussion\"]\n			className=wikiPageClassName\n			classPK=entry.getResourcePrimKey()\n			formAction=discussionURL?string\n			formName=\"fm2\"\n			ratingsEnabled=enableCommentRatings == \"true\"\n			redirect=currentURL\n			subject=assetRenderer.getTitle(locale)\n			userId=assetRenderer.getUserId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getEditIcon>\n	<#if assetRenderer.hasEditPermission(themeDisplay.getPermissionChecker())>\n		<#assign editPageURL = renderResponse.createRenderURL() />\n\n		${editPageURL.setParameter(\"struts_action\", \"/wiki/edit_page\")}\n		${editPageURL.setParameter(\"redirect\", currentURL)}\n		${editPageURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n		${editPageURL.setParameter(\"title\", entry.getTitle())}\n\n		<@liferay_ui[\"icon\"]\n			image=\"edit\"\n			message=entry.getTitle()\n			url=editPageURL?string\n		/>\n	</#if>\n</#macro>\n\n<#macro getPageDetailsIcon>\n	<#assign viewPageDetailsURL = renderResponse.createRenderURL() />\n\n	${viewPageDetailsURL.setParameter(\"struts_action\", \"/wiki/view_page_details\")}\n	${viewPageDetailsURL.setParameter(\"redirect\", currentURL)}\n\n	<@liferay_ui[\"icon\"]\n		image=\"history\"\n		message=\"details\"\n		url=viewPageDetailsURL?string\n	/>\n</#macro>\n\n<#macro getPrintIcon>\n	<#assign printURL = renderResponse.createRenderURL() />\n\n	${printURL.setParameter(\"viewMode\", \"print\")}\n	${printURL.setWindowState(\"pop_up\")}\n\n	<#assign title = languageUtil.format(locale, \"print-x-x\", [\"hide-accessible\", htmlUtil.escape(assetRenderer.getTitle(locale))]) />\n	<#assign taglibPrintURL = \"javascript:Liferay.Util.openWindow({dialog: {width: 960}, id:\'\" + renderResponse.getNamespace() + \"printAsset\', title: \'\" + title + \"\', uri: \'\" + htmlUtil.escapeURL(printURL.toString()) + \"\'});\" />\n\n	<@liferay_ui[\"icon\"]\n		image=\"print\"\n		message=\"print\"\n		url=taglibPrintURL\n	/>\n</#macro>\n\n<#macro getRatings\n	cssClass\n	entry\n>\n	<#if enablePageRatings == \"true\">\n		<div class=\"${cssClass}\">\n			<@liferay_ui[\"ratings\"]\n				className=wikiPageClassName\n				classPK=entry.getResourcePrimKey()\n			/>\n		</div>\n	</#if>\n</#macro>\n\n<#macro getRelatedAssets>\n	<#if assetEntry?? && (enableRelatedAssets == \"true\")>\n		<@liferay_ui[\"asset-links\"]\n			assetEntryId=assetEntry.getEntryId()\n		/>\n	</#if>\n</#macro>',0,0,20419,''),('6c42b526-8e4f-440e-9086-5587ac653902',20420,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20081,0,'ASSET-CATEGORIES-NAVIGATION-MULTI-COLUMN-LAYOUT-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Multi Column Layout</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays a column for each vocabulary. Each column includes the name of a vocabulary with the vocabulary\'s top level categories listed underneath.</Description></root>','display','','ftl','<#assign aui = taglibLiferayHash[\"/WEB-INF/tld/aui.tld\"] />\n\n<#if entries?has_content>\n	<@aui.layout>\n		<#list entries as entry>\n			<@aui.column columnWidth=25>\n				<div class=\"results-header\">\n					<h3>\n						${entry.getName()}\n					</h3>\n				</div>\n\n				<#assign categories = entry.getCategories()>\n\n				<@displayCategories categories=categories />\n			</@aui.column>\n		</#list>\n	</@aui.layout>\n</#if>\n\n<#macro displayCategories\n	categories\n>\n	<#if categories?has_content>\n		<ul class=\"categories\">\n			<#list categories as category>\n				<li>\n					<#assign categoryURL = renderResponse.createRenderURL()>\n\n					${categoryURL.setParameter(\"resetCur\", \"true\")}\n					${categoryURL.setParameter(\"categoryId\", category.getCategoryId()?string)}\n\n					<a href=\"${categoryURL}\">${category.getName()}</a>\n\n					<#if serviceLocator??>\n						<#assign assetCategoryService = serviceLocator.findService(\"com.liferay.portlet.asset.service.AssetCategoryService\")>\n\n						<#assign childCategories = assetCategoryService.getChildCategories(category.getCategoryId())>\n\n						<@displayCategories categories=childCategories />\n					</#if>\n				</li>\n			</#list>\n		</ul>\n	</#if>\n</#macro>',0,0,20421,''),('ade4de59-a43c-4d45-b6ce-0b918a7bfd2f',20423,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20422,0,'DOCUMENTLIBRARY-CAROUSEL-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Carousel</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays images in a carousel.</Description></root>','display','','ftl','<#assign aui = taglibLiferayHash[\"/WEB-INF/tld/aui.tld\"] />\n<#assign liferay_portlet = taglibLiferayHash[\"/WEB-INF/tld/liferay-portlet.tld\"] />\n\n<#if entries?has_content>\n	<style>\n		#<@liferay_portlet.namespace />carousel .carousel-item {\n			background-color: #000;\n			height: 250px;\n			overflow: hidden;\n			text-align: center;\n			width: 700px;\n		}\n\n		#<@liferay_portlet.namespace />carousel .carousel-item img {\n			max-height: 250px;\n			max-width: 700px;\n		}\n	</style>\n\n	<div id=\"<@liferay_portlet.namespace />carousel\">\n		<#assign imageMimeTypes = propsUtil.getArray(\"dl.file.entry.preview.image.mime.types\") />\n\n		<#list entries as entry>\n			<#if imageMimeTypes?seq_contains(entry.getMimeType()) >\n				<div class=\"carousel-item\">\n					<img src=\"${dlUtil.getPreviewURL(entry, entry.getFileVersion(), themeDisplay, \"\")}\" />\n				</div>\n			</#if>\n		</#list>\n	</div>\n\n	<@aui.script use=\"aui-carousel\">\n		new A.Carousel(\n			{\n				contentBox: \'#<@liferay_portlet.namespace />carousel\',\n				height: 250,\n				intervalTime: 2,\n				width: 700\n			}\n		).render();\n	</@aui.script>\n</#if>',0,0,20424,''),('b99b7773-643d-4a03-be65-33838ff124cd',20425,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20083,0,'ASSET-PUBLISHER-RICH-SUMMARY-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Rich Summary</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays abstracts, icons, related assets, and print/edit actions for assets. Optionally include asset bookmarks and ratings.</Description></root>','display','','ftl','<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n\n<#list entries as entry>\n	<#assign entry = entry />\n\n	<#assign assetRenderer = entry.getAssetRenderer() />\n\n	<#assign entryTitle = htmlUtil.escape(assetRenderer.getTitle(locale)) />\n\n	<#assign viewURL = assetPublisherHelper.getAssetViewURL(renderRequest, renderResponse, entry) />\n\n	<#if assetLinkBehavior != \"showFullContent\">\n		<#assign viewURL = assetPublisherHelperImpl.getAssetViewURL(renderRequest, renderResponse, entry, true) />\n	</#if>\n\n	<div class=\"asset-abstract\">\n		<div class=\"lfr-meta-actions asset-actions\">\n			<@getPrintIcon />\n\n			<@getFlagsIcon />\n\n			<@getEditIcon />\n		</div>\n\n		<h3 class=\"asset-title\">\n			<a href=\"${viewURL}\"><img alt=\"\" src=\"${assetRenderer.getIconPath(renderRequest)}\" />${entryTitle}</a>\n		</h3>\n\n		<@getMetadataField fieldName=\"tags\" />\n\n		<@getMetadataField fieldName=\"create-date\" />\n\n		<@getMetadataField fieldName=\"view-count\" />\n\n		<div class=\"asset-content\">\n			<@getSocialBookmarks />\n\n			<div class=\"asset-summary\">\n				<@getMetadataField fieldName=\"author\" />\n\n				${htmlUtil.escape(assetRenderer.getSummary(locale))}\n\n				<a href=\"${viewURL}\"><@liferay.language key=\"read-more\" /><span class=\"hide-accessible\"><@liferay.language key=\"about\" />${entryTitle}</span> &raquo;</a>\n			</div>\n\n			<@getRatings />\n\n			<@getRelatedAssets />\n\n			<@getDiscussion />\n		</div>\n	</div>\n\n</#list>\n\n<#macro getDiscussion>\n	<#if validator.isNotNull(assetRenderer.getDiscussionPath()) && (enableComments == \"true\")>\n		<br />\n\n		<#assign discussionURL = renderResponse.createActionURL() />\n\n		${discussionURL.setParameter(\"struts_action\", \"/asset_publisher/\" + assetRenderer.getDiscussionPath())}\n\n		<@liferay_ui[\"discussion\"]\n			className=entry.getClassName()\n			classPK=entry.getClassPK()\n			formAction=discussionURL?string\n			formName=\"fm\" + entry.getClassPK()\n			ratingsEnabled=enableCommentRatings == \"true\"\n			redirect=portalUtil.getCurrentURL(request)\n			userId=assetRenderer.getUserId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getEditIcon>\n	<#if assetRenderer.hasEditPermission(themeDisplay.getPermissionChecker())>\n		<#assign redirectURL = renderResponse.createRenderURL() />\n\n		${redirectURL.setParameter(\"struts_action\", \"/asset_publisher/add_asset_redirect\")}\n		${redirectURL.setWindowState(\"pop_up\")}\n\n		<#assign editPortletURL = assetRenderer.getURLEdit(renderRequest, renderResponse, windowStateFactory.getWindowState(\"pop_up\"), redirectURL)!\"\" />\n\n		<#if validator.isNotNull(editPortletURL)>\n			<#assign title = languageUtil.format(locale, \"edit-x\", entryTitle) />\n\n			<@liferay_ui[\"icon\"]\n				image=\"edit\"\n				message=title\n				url=\"javascript:Liferay.Util.openWindow({dialog: {width: 960}, id:\'\" + renderResponse.getNamespace() + \"editAsset\', title: \'\" + title + \"\', uri:\'\" + htmlUtil.escapeURL(editPortletURL.toString()) + \"\'});\"\n			/>\n		</#if>\n	</#if>\n</#macro>\n\n<#macro getFlagsIcon>\n	<#if enableFlags == \"true\">\n		<@liferay_ui[\"flags\"]\n			className=entry.getClassName()\n			classPK=entry.getClassPK()\n			contentTitle=entry.getTitle(locale)\n			label=false\n			reportedUserId=entry.getUserId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getMetadataField\n	fieldName\n>\n	<#if stringUtil.split(metadataFields)?seq_contains(fieldName)>\n		<span class=\"metadata-entry metadata-\"${fieldName}\">\n			<#assign dateFormat = \"dd MMM yyyy - HH:mm:ss\" />\n\n			<#if fieldName == \"author\">\n				<@liferay.language key=\"by\" /> ${portalUtil.getUserName(assetRenderer.getUserId(), assetRenderer.getUserName())}\n			<#elseif fieldName == \"categories\">\n				<@liferay_ui[\"asset-categories-summary\"]\n					className=entry.getClassName()\n					classPK=entry.getClassPK()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			<#elseif fieldName == \"create-date\">\n				${dateUtil.getDate(entry.getCreateDate(), dateFormat, locale)}\n			<#elseif fieldName == \"expiration-date\">\n				${dateUtil.getDate(entry.getExpirationDate(), dateFormat, locale)}\n			<#elseif fieldName == \"modified-date\">\n				${dateUtil.getDate(entry.getModifiedDate(), dateFormat, locale)}\n			<#elseif fieldName == \"priority\">\n				${entry.getPriority()}\n			<#elseif fieldName == \"publish-date\">\n				${dateUtil.getDate(entry.getPublishDate(), dateFormat, locale)}\n			<#elseif fieldName == \"tags\">\n				<@liferay_ui[\"asset-tags-summary\"]\n					className=entry.getClassName()\n					classPK=entry.getClassPK()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			<#elseif fieldName == \"view-count\">\n				<@liferay_ui[\"icon\"]\n					image=\"history\"\n				/>\n\n				${entry.getViewCount()} <@liferay.language key=\"views\" />\n			</#if>\n		</span>\n	</#if>\n</#macro>\n\n<#macro getPrintIcon>\n	<#if enablePrint == \"true\" >\n		<#assign printURL = renderResponse.createRenderURL() />\n\n		${printURL.setParameter(\"struts_action\", \"/asset_publisher/view_content\")}\n		${printURL.setParameter(\"assetEntryId\", entry.getEntryId()?string)}\n		${printURL.setParameter(\"viewMode\", \"print\")}\n		${printURL.setParameter(\"type\", entry.getAssetRendererFactory().getType())}\n\n		<#if (validator.isNotNull(assetRenderer.getUrlTitle()))>\n			<#if (assetRenderer.getGroupId() != themeDisplay.getScopeGroupId())>\n				${printURL.setParameter(\"groupId\", assetRenderer.getGroupId()?string)}\n			</#if>\n\n			${printURL.setParameter(\"urlTitle\", assetRenderer.getUrlTitle())}\n		</#if>\n\n		${printURL.setWindowState(\"pop_up\")}\n\n		<@liferay_ui[\"icon\"]\n			image=\"print\"\n			message=\"print\"\n			url=\"javascript:Liferay.Util.openWindow({id:\'\" + renderResponse.getNamespace() + \"printAsset\', title: \'\" + languageUtil.format(locale, \"print-x-x\", [\"hide-accessible\", entryTitle]) + \"\', uri: \'\" + htmlUtil.escapeURL(printURL.toString()) + \"\'});\"\n		/>\n	</#if>\n</#macro>\n\n<#macro getRatings>\n	<#if (enableRatings == \"true\")>\n		<div class=\"asset-ratings\">\n			<@liferay_ui[\"ratings\"]\n				className=entry.getClassName()\n				classPK=entry.getClassPK()\n			/>\n		</div>\n	</#if>\n</#macro>\n\n<#macro getRelatedAssets>\n	<#if enableRelatedAssets == \"true\">\n		<@liferay_ui[\"asset-links\"]\n			assetEntryId=entry.getEntryId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getSocialBookmarks>\n	<#if enableSocialBookmarks == \"true\">\n		<@liferay_ui[\"social-bookmarks\"]\n			displayStyle=\"${socialBookmarksDisplayStyle}\"\n			target=\"_blank\"\n			title=entry.getTitle(locale)\n			url=viewURL\n		/>\n	</#if>\n</#macro>',0,0,20426,''),('f3c64114-1850-42d6-b13e-4f151d0e545c',20427,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20034,0,'SITE-MAP-MULTI-COLUMN-LAYOUT-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Multi Column Layout</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays a column for each top level page. Each column includes the name of a top level page with the page\'s immediate children listed underneath.</Description></root>','display','','ftl','<#assign aui = taglibLiferayHash[\"/WEB-INF/tld/aui.tld\"] />\n\n<#if entries?has_content>\n	<@aui.layout>\n		<#list entries as entry>\n		    <@aui.column columnWidth=25>\n				<div class=\"results-header\">\n					<h3>\n						<#assign layoutURL = portalUtil.getLayoutURL(entry, themeDisplay)>\n\n						<a href=\"${layoutURL}\">${entry.getName(locale)}</a>\n					</h3>\n				</div>\n\n				<#assign pages = entry.getChildren()>\n\n				<@displayPages pages = pages />\n		    </@aui.column>\n		</#list>\n	</@aui.layout>\n</#if>\n\n<#macro displayPages\n	pages\n>\n	<#if pages?has_content>\n		<ul class=\"child-pages\">\n			<#list pages as page>\n				<li>\n					<#assign pageLayoutURL = portalUtil.getLayoutURL(page, themeDisplay)>\n\n					<a href=\"${pageLayoutURL}\">${page.getName(locale)}</a>\n\n					<#assign childPages = page.getChildren()>\n\n					<@displayPages pages = childPages />\n				</li>\n			</#list>\n		</ul>\n	</#if>\n</#macro>',0,0,20428,''),('512da30a-814c-434f-b666-b2aa7ccf33ea',20429,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20085,0,'ASSET-TAGS-NAVIGATION-COLOR-BY-POPULARITY-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Color by Popularity</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays asset tags colored by popularity: red (high), yellow (medium), and green (low).</Description></root>','display','','ftl','<#if entries?has_content>\n	<ul class=\"tag-items tag-list\">\n		<#assign scopeGroupId = getterUtil.getLong(scopeGroupId, themeDisplay.getScopeGroupId()) />\n		<#assign classNameId = getterUtil.getLong(classNameId, 0) />\n\n		<#assign maxCount = 1 />\n		<#assign minCount = 1 />\n\n		<#list entries as entry>\n			<#assign maxCount = liferay.max(maxCount, entry.getAssetCount()) />\n			<#assign minCount = liferay.min(minCount, entry.getAssetCount()) />\n		</#list>\n\n		<#assign multiplier = 1 />\n\n		<#if maxCount != minCount>\n			<#assign multiplier = 3 / (maxCount - minCount) />\n		</#if>\n\n		<#list entries as entry>\n			<li class=\"taglib-asset-tags-summary\">\n				<#assign popularity = (maxCount - (maxCount - (entry.getAssetCount() - minCount))) * multiplier />\n\n				<#if popularity < 1>\n					<#assign color = \"green\" />\n				<#elseif (popularity >= 1) && (popularity < 2)>\n					<#assign color = \"orange\" />\n				<#else>\n					<#assign color = \"red\" />\n				</#if>\n\n				<#assign tagURL = renderResponse.createRenderURL() />\n\n				${tagURL.setParameter(\"resetCur\", \"true\")}\n				${tagURL.setParameter(\"tag\", entry.getName())}\n\n				<a class =\"tag\" style=\"color: ${color};\" href=\"${tagURL}\">\n					${entry.getName()}\n\n					<#if (showAssetCount == \"true\")>\n						<span class=\"tag-asset-count\">(${count})</span>\n					</#if>\n				</a>\n			</li>\n		</#list>\n	</ul>\n\n	<br style=\"clear: both;\" />\n</#if>',0,0,20430,''),('11790b71-a788-449d-be95-8d526f85545a',20431,20195,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20007,0,'BLOGS-BASIC-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Basic</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays titles, authors, and abstracts compactly for blog entries.</Description></root>','display','','ftl','<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n\n<#list entries as entry>\n	<div class=\"entry\">\n		<#assign viewURL = renderResponse.createRenderURL() />\n\n		${viewURL.setParameter(\"struts_action\", \"/blogs/view_entry\")}\n		${viewURL.setParameter(\"redirect\", currentURL)}\n		${viewURL.setParameter(\"urlTitle\", entry.getUrlTitle())}\n\n		<div class=\"entry-content\">\n			<div class=\"entry-title\">\n				<h2><a href=\"${viewURL}\">${htmlUtil.escape(entry.getTitle())}</a></h2>\n			</div>\n		</div>\n\n		<div class=\"entry-body\">\n			<div class=\"entry-author\">\n				<@liferay.language key=\"written-by\" /> ${htmlUtil.escape(portalUtil.getUserName(entry.getUserId(), entry.getUserName()))}\n			</div>\n\n			<#assign summary = entry.getDescription() />\n\n			<#if (validator.isNull(summary))>\n				<#assign summary = entry.getContent() />\n			</#if>\n\n			${stringUtil.shorten(htmlUtil.stripHtml(summary), 100)}\n\n			<a href=\"${viewURL}\"><@liferay.language key=\"read-more\" /> <span class=\"hide-accessible\"><@liferay.language key=\"about\"/>${htmlUtil.escape(entry.getTitle())}</span> &raquo;</a>\n		</div>\n\n		<div class=\"entry-footer\">\n			<span class=\"entry-date\">\n				${dateUtil.getDate(entry.getCreateDate(), \"dd MMM yyyy - HH:mm:ss\", locale)}\n			</span>\n\n			<#assign blogsEntryClassName = \"com.liferay.portlet.blogs.model.BlogsEntry\" />\n\n			<#if (enableFlags == \"true\")>\n				<@liferay_ui[\"flags\"]\n					className=blogsEntryClassName\n					classPK=entry.getEntryId()\n					contentTitle=entry.getTitle()\n					reportedUserId=entry.getUserId()\n				/>\n			</#if>\n\n			<span class=\"entry-categories\">\n				<@liferay_ui[\"asset-categories-summary\"]\n					className=blogsEntryClassName\n					classPK=entry.getEntryId()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			</span>\n\n			<span class=\"entry-tags\">\n				<@liferay_ui[\"asset-tags-summary\"]\n					className=blogsEntryClassName\n					classPK=entry.getEntryId()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			</span>\n		</div>\n	</div>\n\n	<div class=\"separator\"><!-- --></div>\n</#list>',0,0,20432,''),('7f577c76-85ed-4b70-8c15-7914d57f84c7',27128,20182,20155,20199,'Test Test','2016-06-18 05:48:23','2016-06-18 05:49:13',20102,27126,'27127','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Plantilla</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">wgfwgw</Description></root>','display','','vm','##\n## Web content templates are used to lay out the fields defined in a\n## web content structure.\n##\n## Please use the left panel to quickly add commonly used variables.\n## Autocomplete is also available and can be invoked by typing \"$\".\n##\n\n<div>\n    $texto02.getData()\n</div>\n<div>\n    $campo01.getData()\n</div>',0,0,27129,'');
/*!40000 ALTER TABLE `ddmtemplate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallerepuestaevaluacion`
--

DROP TABLE IF EXISTS `detallerepuestaevaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detallerepuestaevaluacion` (
  `detalleRepuestaEvaluacionId` bigint(20) NOT NULL,
  `evaluacionId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `respuestaSeleccionada` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`detalleRepuestaEvaluacionId`,`evaluacionId`,`usuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallerepuestaevaluacion`
--

LOCK TABLES `detallerepuestaevaluacion` WRITE;
/*!40000 ALTER TABLE `detallerepuestaevaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallerepuestaevaluacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallerepuestareclutamiento`
--

DROP TABLE IF EXISTS `detallerepuestareclutamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detallerepuestareclutamiento` (
  `detalleRepsuestaId` bigint(20) NOT NULL,
  `evaluacionId` bigint(20) NOT NULL,
  `fasePostulacionId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `respuestaSeleccionada` int(11) DEFAULT NULL,
  PRIMARY KEY (`detalleRepsuestaId`,`evaluacionId`,`fasePostulacionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallerepuestareclutamiento`
--

LOCK TABLES `detallerepuestareclutamiento` WRITE;
/*!40000 ALTER TABLE `detallerepuestareclutamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallerepuestareclutamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlcontent`
--

DROP TABLE IF EXISTS `dlcontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlcontent` (
  `contentId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `path_` varchar(255) DEFAULT NULL,
  `version` varchar(75) DEFAULT NULL,
  `data_` longblob,
  `size_` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`contentId`),
  UNIQUE KEY `IX_FDD1AAA8` (`companyId`,`repositoryId`,`path_`,`version`),
  KEY `IX_6A83A66A` (`companyId`,`repositoryId`),
  KEY `IX_EB531760` (`companyId`,`repositoryId`,`path_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlcontent`
--

LOCK TABLES `dlcontent` WRITE;
/*!40000 ALTER TABLE `dlcontent` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlcontent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileentry`
--

DROP TABLE IF EXISTS `dlfileentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileentry` (
  `uuid_` varchar(75) DEFAULT NULL,
  `fileEntryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `folderId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(255) DEFAULT NULL,
  `extension` varchar(75) DEFAULT NULL,
  `mimeType` varchar(75) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` longtext,
  `extraSettings` longtext,
  `fileEntryTypeId` bigint(20) DEFAULT NULL,
  `version` varchar(75) DEFAULT NULL,
  `size_` bigint(20) DEFAULT NULL,
  `readCount` int(11) DEFAULT NULL,
  `smallImageId` bigint(20) DEFAULT NULL,
  `largeImageId` bigint(20) DEFAULT NULL,
  `custom1ImageId` bigint(20) DEFAULT NULL,
  `custom2ImageId` bigint(20) DEFAULT NULL,
  `manualCheckInRequired` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`fileEntryId`),
  UNIQUE KEY `IX_5391712` (`groupId`,`folderId`,`name`),
  UNIQUE KEY `IX_ED5CA615` (`groupId`,`folderId`,`title`),
  UNIQUE KEY `IX_BC2E7E6A` (`uuid_`,`groupId`),
  KEY `IX_4CB1B2B4` (`companyId`),
  KEY `IX_772ECDE7` (`fileEntryTypeId`),
  KEY `IX_8F6C75D0` (`folderId`,`name`),
  KEY `IX_F4AF5636` (`groupId`),
  KEY `IX_93CF8193` (`groupId`,`folderId`),
  KEY `IX_29D0AF28` (`groupId`,`folderId`,`fileEntryTypeId`),
  KEY `IX_43261870` (`groupId`,`userId`),
  KEY `IX_D20C434D` (`groupId`,`userId`,`folderId`),
  KEY `IX_D9492CF6` (`mimeType`),
  KEY `IX_1B352F4A` (`repositoryId`,`folderId`),
  KEY `IX_64F0FE40` (`uuid_`),
  KEY `IX_31079DE8` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileentry`
--

LOCK TABLES `dlfileentry` WRITE;
/*!40000 ALTER TABLE `dlfileentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileentrymetadata`
--

DROP TABLE IF EXISTS `dlfileentrymetadata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileentrymetadata` (
  `uuid_` varchar(75) DEFAULT NULL,
  `fileEntryMetadataId` bigint(20) NOT NULL,
  `DDMStorageId` bigint(20) DEFAULT NULL,
  `DDMStructureId` bigint(20) DEFAULT NULL,
  `fileEntryTypeId` bigint(20) DEFAULT NULL,
  `fileEntryId` bigint(20) DEFAULT NULL,
  `fileVersionId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`fileEntryMetadataId`),
  UNIQUE KEY `IX_7332B44F` (`DDMStructureId`,`fileVersionId`),
  KEY `IX_4F40FE5E` (`fileEntryId`),
  KEY `IX_A44636C9` (`fileEntryId`,`fileVersionId`),
  KEY `IX_F8E90438` (`fileEntryTypeId`),
  KEY `IX_1FE9C04` (`fileVersionId`),
  KEY `IX_D49AB5D1` (`uuid_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileentrymetadata`
--

LOCK TABLES `dlfileentrymetadata` WRITE;
/*!40000 ALTER TABLE `dlfileentrymetadata` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileentrymetadata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileentrytype`
--

DROP TABLE IF EXISTS `dlfileentrytype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileentrytype` (
  `uuid_` varchar(75) DEFAULT NULL,
  `fileEntryTypeId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `fileEntryTypeKey` varchar(75) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  PRIMARY KEY (`fileEntryTypeId`),
  UNIQUE KEY `IX_5B6BEF5F` (`groupId`,`fileEntryTypeKey`),
  UNIQUE KEY `IX_1399D844` (`uuid_`,`groupId`),
  KEY `IX_4501FD9C` (`groupId`),
  KEY `IX_90724726` (`uuid_`),
  KEY `IX_5B03E942` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileentrytype`
--

LOCK TABLES `dlfileentrytype` WRITE;
/*!40000 ALTER TABLE `dlfileentrytype` DISABLE KEYS */;
INSERT INTO `dlfileentrytype` VALUES ('dee6855d-6a03-46df-8bde-027af9400cd6',0,0,0,0,'','2016-05-04 07:39:57','2016-05-04 07:39:57','BASIC-DOCUMENT','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">basic-document</Name></root>',''),('bb7afceb-7b5e-44c3-b46b-70c6b5e06ba0',20306,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14','CONTRACT','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Contract</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Contract</Description></root>'),('ae919f60-ad8d-4763-aa0d-e36cd4f1784f',20308,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14','MARKETING BANNER','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Marketing Banner</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Marketing Banner</Description></root>'),('fedb56e9-d3b3-4f0e-a657-cd183b9edecf',20310,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14','ONLINE TRAINING','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Online Training</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Online Training</Description></root>'),('a57b686a-89f5-42ab-a725-da1e65375d49',20312,20195,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14','SALES PRESENTATION','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Sales Presentation</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Sales Presentation</Description></root>');
/*!40000 ALTER TABLE `dlfileentrytype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileentrytypes_ddmstructures`
--

DROP TABLE IF EXISTS `dlfileentrytypes_ddmstructures`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileentrytypes_ddmstructures` (
  `structureId` bigint(20) NOT NULL,
  `fileEntryTypeId` bigint(20) NOT NULL,
  PRIMARY KEY (`structureId`,`fileEntryTypeId`),
  KEY `IX_8373EC7C` (`fileEntryTypeId`),
  KEY `IX_F147CF3F` (`structureId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileentrytypes_ddmstructures`
--

LOCK TABLES `dlfileentrytypes_ddmstructures` WRITE;
/*!40000 ALTER TABLE `dlfileentrytypes_ddmstructures` DISABLE KEYS */;
INSERT INTO `dlfileentrytypes_ddmstructures` VALUES (20307,20306),(20304,20308),(20309,20308),(20303,20310),(20311,20310),(20305,20312),(20313,20312);
/*!40000 ALTER TABLE `dlfileentrytypes_ddmstructures` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileentrytypes_dlfolders`
--

DROP TABLE IF EXISTS `dlfileentrytypes_dlfolders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileentrytypes_dlfolders` (
  `fileEntryTypeId` bigint(20) NOT NULL,
  `folderId` bigint(20) NOT NULL,
  PRIMARY KEY (`fileEntryTypeId`,`folderId`),
  KEY `IX_5BB6AD6C` (`fileEntryTypeId`),
  KEY `IX_6E00A2EC` (`folderId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileentrytypes_dlfolders`
--

LOCK TABLES `dlfileentrytypes_dlfolders` WRITE;
/*!40000 ALTER TABLE `dlfileentrytypes_dlfolders` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileentrytypes_dlfolders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfilerank`
--

DROP TABLE IF EXISTS `dlfilerank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfilerank` (
  `fileRankId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `fileEntryId` bigint(20) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`fileRankId`),
  UNIQUE KEY `IX_38F0315` (`companyId`,`userId`,`fileEntryId`),
  KEY `IX_A65A1F8B` (`fileEntryId`),
  KEY `IX_BAFB116E` (`groupId`,`userId`),
  KEY `IX_4E96195B` (`groupId`,`userId`,`active_`),
  KEY `IX_EED06670` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfilerank`
--

LOCK TABLES `dlfilerank` WRITE;
/*!40000 ALTER TABLE `dlfilerank` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfilerank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileshortcut`
--

DROP TABLE IF EXISTS `dlfileshortcut`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileshortcut` (
  `uuid_` varchar(75) DEFAULT NULL,
  `fileShortcutId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `folderId` bigint(20) DEFAULT NULL,
  `toFileEntryId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`fileShortcutId`),
  UNIQUE KEY `IX_FDB4A946` (`uuid_`,`groupId`),
  KEY `IX_A4BB2E58` (`companyId`),
  KEY `IX_8571953E` (`companyId`,`status`),
  KEY `IX_B0051937` (`groupId`,`folderId`),
  KEY `IX_348DC3B2` (`groupId`,`folderId`,`active_`),
  KEY `IX_17EE3098` (`groupId`,`folderId`,`active_`,`status`),
  KEY `IX_4B7247F6` (`toFileEntryId`),
  KEY `IX_4831EBE4` (`uuid_`),
  KEY `IX_29AE81C4` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileshortcut`
--

LOCK TABLES `dlfileshortcut` WRITE;
/*!40000 ALTER TABLE `dlfileshortcut` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileshortcut` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfileversion`
--

DROP TABLE IF EXISTS `dlfileversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfileversion` (
  `uuid_` varchar(75) DEFAULT NULL,
  `fileVersionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `folderId` bigint(20) DEFAULT NULL,
  `fileEntryId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `extension` varchar(75) DEFAULT NULL,
  `mimeType` varchar(75) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `description` longtext,
  `changeLog` varchar(75) DEFAULT NULL,
  `extraSettings` longtext,
  `fileEntryTypeId` bigint(20) DEFAULT NULL,
  `version` varchar(75) DEFAULT NULL,
  `size_` bigint(20) DEFAULT NULL,
  `checksum` varchar(75) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`fileVersionId`),
  UNIQUE KEY `IX_E2815081` (`fileEntryId`,`version`),
  UNIQUE KEY `IX_C99B2650` (`uuid_`,`groupId`),
  KEY `IX_F389330E` (`companyId`),
  KEY `IX_A0A283F4` (`companyId`,`status`),
  KEY `IX_C68DC967` (`fileEntryId`),
  KEY `IX_D47BB14D` (`fileEntryId`,`status`),
  KEY `IX_DFD809D3` (`groupId`,`folderId`,`status`),
  KEY `IX_9BE769ED` (`groupId`,`folderId`,`title`,`version`),
  KEY `IX_FFB3395C` (`mimeType`),
  KEY `IX_4BFABB9A` (`uuid_`),
  KEY `IX_95E9E44E` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfileversion`
--

LOCK TABLES `dlfileversion` WRITE;
/*!40000 ALTER TABLE `dlfileversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlfolder`
--

DROP TABLE IF EXISTS `dlfolder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlfolder` (
  `uuid_` varchar(75) DEFAULT NULL,
  `folderId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `mountPoint` tinyint(4) DEFAULT NULL,
  `parentFolderId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(100) DEFAULT NULL,
  `description` longtext,
  `lastPostDate` datetime DEFAULT NULL,
  `defaultFileEntryTypeId` bigint(20) DEFAULT NULL,
  `hidden_` tinyint(4) DEFAULT NULL,
  `overrideFileEntryTypes` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`folderId`),
  UNIQUE KEY `IX_902FD874` (`groupId`,`parentFolderId`,`name`),
  UNIQUE KEY `IX_3CC1DED2` (`uuid_`,`groupId`),
  KEY `IX_A74DB14C` (`companyId`),
  KEY `IX_E79BE432` (`companyId`,`status`),
  KEY `IX_F2EA1ACE` (`groupId`),
  KEY `IX_F78286C5` (`groupId`,`mountPoint`,`parentFolderId`,`hidden_`),
  KEY `IX_C88430AB` (`groupId`,`mountPoint`,`parentFolderId`,`hidden_`,`status`),
  KEY `IX_49C37475` (`groupId`,`parentFolderId`),
  KEY `IX_CE360BF6` (`groupId`,`parentFolderId`,`hidden_`,`status`),
  KEY `IX_51556082` (`parentFolderId`,`name`),
  KEY `IX_EE29C715` (`repositoryId`),
  KEY `IX_CBC408D8` (`uuid_`),
  KEY `IX_DA448450` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlfolder`
--

LOCK TABLES `dlfolder` WRITE;
/*!40000 ALTER TABLE `dlfolder` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfolder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dlsyncevent`
--

DROP TABLE IF EXISTS `dlsyncevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dlsyncevent` (
  `syncEventId` bigint(20) NOT NULL,
  `modifiedTime` bigint(20) DEFAULT NULL,
  `event` varchar(75) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `typePK` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`syncEventId`),
  UNIQUE KEY `IX_57D82B06` (`typePK`),
  KEY `IX_3D8E1607` (`modifiedTime`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dlsyncevent`
--

LOCK TABLES `dlsyncevent` WRITE;
/*!40000 ALTER TABLE `dlsyncevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlsyncevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emailaddress`
--

DROP TABLE IF EXISTS `emailaddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emailaddress` (
  `uuid_` varchar(75) DEFAULT NULL,
  `emailAddressId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `address` varchar(75) DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  `primary_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`emailAddressId`),
  KEY `IX_1BB072CA` (`companyId`),
  KEY `IX_49D2DEC4` (`companyId`,`classNameId`),
  KEY `IX_551A519F` (`companyId`,`classNameId`,`classPK`),
  KEY `IX_2A2CB130` (`companyId`,`classNameId`,`classPK`,`primary_`),
  KEY `IX_7B43CD8` (`userId`),
  KEY `IX_D24F3956` (`uuid_`),
  KEY `IX_F74AB912` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emailaddress`
--

LOCK TABLES `emailaddress` WRITE;
/*!40000 ALTER TABLE `emailaddress` DISABLE KEYS */;
/*!40000 ALTER TABLE `emailaddress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudio`
--

DROP TABLE IF EXISTS `estudio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estudio` (
  `estudioId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) DEFAULT NULL,
  `nombre` varchar(75) DEFAULT NULL,
  `nivel` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`estudioId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudio`
--

LOCK TABLES `estudio` WRITE;
/*!40000 ALTER TABLE `estudio` DISABLE KEYS */;
/*!40000 ALTER TABLE `estudio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `etiquetarelacionada`
--

DROP TABLE IF EXISTS `etiquetarelacionada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `etiquetarelacionada` (
  `etiquetaRelacionadaId` bigint(20) NOT NULL,
  `tabla` varchar(75) DEFAULT NULL,
  `registroId` bigint(20) DEFAULT NULL,
  `etiqueta` bigint(20) DEFAULT NULL,
  `tagId` bigint(20) DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`etiquetaRelacionadaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `etiquetarelacionada`
--

LOCK TABLES `etiquetarelacionada` WRITE;
/*!40000 ALTER TABLE `etiquetarelacionada` DISABLE KEYS */;
/*!40000 ALTER TABLE `etiquetarelacionada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacion`
--

DROP TABLE IF EXISTS `evaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacion` (
  `evaluacionId` bigint(20) NOT NULL,
  `enfoque` bigint(20) DEFAULT NULL,
  `puestoCategoriaEvaluacion` bigint(20) DEFAULT NULL,
  `tipoEvaluacion` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`evaluacionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacion`
--

LOCK TABLES `evaluacion` WRITE;
/*!40000 ALTER TABLE `evaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluacionpregunta`
--

DROP TABLE IF EXISTS `evaluacionpregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluacionpregunta` (
  `evaluacionId` bigint(20) NOT NULL,
  `preguntaId` bigint(20) NOT NULL,
  `nivel` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`evaluacionId`,`preguntaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluacionpregunta`
--

LOCK TABLES `evaluacionpregunta` WRITE;
/*!40000 ALTER TABLE `evaluacionpregunta` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluacionpregunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expandocolumn`
--

DROP TABLE IF EXISTS `expandocolumn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expandocolumn` (
  `columnId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `tableId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `defaultData` longtext,
  `typeSettings` longtext,
  PRIMARY KEY (`columnId`),
  UNIQUE KEY `IX_FEFC8DA7` (`tableId`,`name`),
  KEY `IX_A8C0CBE8` (`tableId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expandocolumn`
--

LOCK TABLES `expandocolumn` WRITE;
/*!40000 ALTER TABLE `expandocolumn` DISABLE KEYS */;
INSERT INTO `expandocolumn` VALUES (20443,20155,20442,'clientId',15,'',''),(21328,20155,21326,'DNI',11,'',''),(21331,20155,21326,'lider',1,'','');
/*!40000 ALTER TABLE `expandocolumn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expandorow`
--

DROP TABLE IF EXISTS `expandorow`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expandorow` (
  `rowId_` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `tableId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`rowId_`),
  UNIQUE KEY `IX_81EFBFF5` (`tableId`,`classPK`),
  KEY `IX_49EB3118` (`classPK`),
  KEY `IX_D3F5D7AE` (`tableId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expandorow`
--

LOCK TABLES `expandorow` WRITE;
/*!40000 ALTER TABLE `expandorow` DISABLE KEYS */;
INSERT INTO `expandorow` VALUES (21329,20155,'2016-05-04 19:06:00',21326,20902),(21820,20155,'2016-05-07 04:15:27',21326,21811);
/*!40000 ALTER TABLE `expandorow` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expandotable`
--

DROP TABLE IF EXISTS `expandotable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expandotable` (
  `tableId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`tableId`),
  UNIQUE KEY `IX_37562284` (`companyId`,`classNameId`,`name`),
  KEY `IX_B5AE8A85` (`companyId`,`classNameId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expandotable`
--

LOCK TABLES `expandotable` WRITE;
/*!40000 ALTER TABLE `expandotable` DISABLE KEYS */;
INSERT INTO `expandotable` VALUES (20510,20155,20002,'OPEN_SOCIAL_DATA_'),(21326,20155,20005,'CUSTOM_FIELDS'),(20442,20155,20005,'MP'),(20511,20155,20005,'OPEN_SOCIAL_DATA_'),(21321,20155,20088,'CUSTOM_FIELDS');
/*!40000 ALTER TABLE `expandotable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expandovalue`
--

DROP TABLE IF EXISTS `expandovalue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expandovalue` (
  `valueId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `tableId` bigint(20) DEFAULT NULL,
  `columnId` bigint(20) DEFAULT NULL,
  `rowId_` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `data_` longtext,
  PRIMARY KEY (`valueId`),
  UNIQUE KEY `IX_9DDD21E5` (`columnId`,`rowId_`),
  UNIQUE KEY `IX_D27B03E7` (`tableId`,`columnId`,`classPK`),
  KEY `IX_B29FEF17` (`classNameId`,`classPK`),
  KEY `IX_F7DD0987` (`columnId`),
  KEY `IX_9112A7A0` (`rowId_`),
  KEY `IX_F0566A77` (`tableId`),
  KEY `IX_1BD3F4C` (`tableId`,`classPK`),
  KEY `IX_CA9AFB7C` (`tableId`,`columnId`),
  KEY `IX_B71E92D5` (`tableId`,`rowId_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expandovalue`
--

LOCK TABLES `expandovalue` WRITE;
/*!40000 ALTER TABLE `expandovalue` DISABLE KEYS */;
INSERT INTO `expandovalue` VALUES (21330,20155,21326,21328,21329,20005,20902,'12345678'),(21332,20155,21326,21331,21329,20005,20902,'true'),(21821,20155,21326,21328,21820,20005,21811,'0'),(21822,20155,21326,21331,21820,20005,21811,'false');
/*!40000 ALTER TABLE `expandovalue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experiencia`
--

DROP TABLE IF EXISTS `experiencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `experiencia` (
  `experienciaId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) DEFAULT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `empresa` varchar(75) DEFAULT NULL,
  `proyecto` varchar(75) DEFAULT NULL,
  `fechaInicio` datetime DEFAULT NULL,
  `fechaFin` datetime DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`experienciaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experiencia`
--

LOCK TABLES `experiencia` WRITE;
/*!40000 ALTER TABLE `experiencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `experiencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fasepostulacion`
--

DROP TABLE IF EXISTS `fasepostulacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `fasepostulacion` (
  `fasePostulacionId` bigint(20) NOT NULL,
  `solicitudRequerimientoId` bigint(20) DEFAULT NULL,
  `usuarioId` bigint(20) DEFAULT NULL,
  `tipoFase` bigint(20) DEFAULT NULL,
  `fechaFase` datetime DEFAULT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `estado` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`fasePostulacionId`),
  KEY `IX_31601335` (`solicitudRequerimientoId`,`fasePostulacionId`),
  KEY `IX_26884404` (`solicitudRequerimientoId`,`fasePostulacionId`,`usuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fasepostulacion`
--

LOCK TABLES `fasepostulacion` WRITE;
/*!40000 ALTER TABLE `fasepostulacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `fasepostulacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcion`
--

DROP TABLE IF EXISTS `funcion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcion` (
  `funcionId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `etiqueta` bigint(20) DEFAULT NULL,
  `exigible` tinyint(4) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`funcionId`),
  KEY `IX_AC085D73` (`descripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcion`
--

LOCK TABLES `funcion` WRITE;
/*!40000 ALTER TABLE `funcion` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_`
--

DROP TABLE IF EXISTS `group_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `group_` (
  `uuid_` varchar(75) DEFAULT NULL,
  `groupId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `creatorUserId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `parentGroupId` bigint(20) DEFAULT NULL,
  `liveGroupId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(150) DEFAULT NULL,
  `description` longtext,
  `type_` int(11) DEFAULT NULL,
  `typeSettings` longtext,
  `manualMembership` tinyint(4) DEFAULT NULL,
  `membershipRestriction` int(11) DEFAULT NULL,
  `friendlyURL` varchar(255) DEFAULT NULL,
  `site` tinyint(4) DEFAULT NULL,
  `remoteStagingGroupCount` int(11) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`groupId`),
  UNIQUE KEY `IX_D0D5E397` (`companyId`,`classNameId`,`classPK`),
  UNIQUE KEY `IX_5DE0BE11` (`companyId`,`classNameId`,`liveGroupId`,`name`),
  UNIQUE KEY `IX_5BDDB872` (`companyId`,`friendlyURL`),
  UNIQUE KEY `IX_BBCA55B` (`companyId`,`liveGroupId`,`name`),
  UNIQUE KEY `IX_5AA68501` (`companyId`,`name`),
  UNIQUE KEY `IX_754FBB1C` (`uuid_`,`groupId`),
  KEY `IX_ABA5CEC2` (`companyId`),
  KEY `IX_B584B5CC` (`companyId`,`classNameId`),
  KEY `IX_ABE2D54` (`companyId`,`classNameId`,`parentGroupId`),
  KEY `IX_5D75499E` (`companyId`,`parentGroupId`),
  KEY `IX_6C499099` (`companyId`,`parentGroupId`,`site`),
  KEY `IX_63A2AABD` (`companyId`,`site`),
  KEY `IX_16218A38` (`liveGroupId`),
  KEY `IX_7B590A7A` (`type_`,`active_`),
  KEY `IX_F981514E` (`uuid_`),
  KEY `IX_26CC761A` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_`
--

LOCK TABLES `group_` WRITE;
/*!40000 ALTER TABLE `group_` DISABLE KEYS */;
INSERT INTO `group_` VALUES ('e9085e39-9799-4fb1-a2f6-486cfef27239',20173,20155,20159,20001,20173,0,0,'/20173/','Control Panel','',3,'',1,0,'/control_panel',0,0,1),('55ef5835-74b2-4e87-8775-b22eac5150b5',20182,20155,20159,20001,20182,0,0,'/20182/','Guest','',1,'mergeGuestPublicPages=false\n',1,0,'/guest',1,0,1),('5f43aaa5-c8fb-48ea-86aa-33f27ec4d582',20192,20155,20159,20191,20159,0,0,'/20192/','User Personal Site','',3,'',1,0,'/personal_site',0,0,1),('619df9ca-b51d-430b-bbfb-a7b2453976f8',20195,20155,20159,20025,20155,0,0,'/20195/','20155','',0,'',1,0,'/global',1,0,1),('ab3be721-9372-4ad4-a1fe-645912267204',20201,20155,20199,20005,20199,0,0,'/20201/','20199','',0,'',1,0,'/test',0,0,1),('544397d3-e86e-4f94-8664-9564b7ce7935',20317,20155,20159,20032,20316,0,0,'/20317/','20316','',0,'',1,0,'/template-20316',0,0,1),('b0a5f3c8-9e13-4703-8403-80107416ef9c',20329,20155,20159,20032,20328,0,0,'/20329/','20328','',0,'',1,0,'/template-20328',0,0,1),('639e52f2-317f-441d-8468-e22631cb97c8',20339,20155,20159,20032,20338,0,0,'/20339/','20338','',0,'',1,0,'/template-20338',0,0,1),('09f032ae-6e2e-43f0-ac9d-b331ca3d1c29',20350,20155,20159,20036,20349,0,0,'/20350/','20349','',0,'',1,0,'/template-20349',0,0,1),('eaeffec0-42f7-42b9-a5e9-4ee52d6086b3',20376,20155,20159,20036,20375,0,0,'/20376/','20375','',0,'',1,0,'/template-20375',0,0,1),('60e5d977-78da-4785-8e59-0825dbf67f90',20534,20155,20159,20036,20533,0,0,'/20534/','20533','',0,'',1,0,'/template-20533',0,0,1),('0a8d49e4-89e9-4d24-8830-23f49c93bc83',20623,20155,20199,20001,20623,0,0,'/20623/','Intranet Hitss','Intranet Hitss',2,'breadcrumbShowParentGroups=true\ncontentSharingWithChildrenEnabled=-1\nmergeGuestPublicPages=false\ntrashEnabled=true\n',1,0,'/intranet-hitss',1,0,1),('55439021-df80-44a2-91fb-74a95c88c9d0',20904,20155,20902,20005,20902,0,0,'/20904/','20902','',0,'',1,0,'/ivan.quiroz',0,0,1),('f33552c9-4410-454d-8a54-5a278fdde1cb',21813,20155,21811,20005,21811,0,0,'/21813/','21811','',0,'',1,0,'/danieldelgado',0,0,1),('569bd157-4178-49e8-b48f-feeffad96ef4',22204,20155,22202,20005,22202,0,0,'/22204/','22202','',0,'',1,0,'/user2user2',0,0,1),('42e2530d-b087-4d8d-9079-07cda1af0ae9',22214,20155,22212,20005,22212,0,0,'/22214/','22212','',0,'',1,0,'/randielmelgarejo',0,0,1),('984c34bf-641b-484b-98d8-19bec5b04f80',22223,20155,22221,20005,22221,0,0,'/22223/','22221','',0,'',1,0,'/monicalopera',0,0,1),('8f02d924-dd18-427c-aefb-224076d352c0',22232,20155,22230,20005,22230,0,0,'/22232/','22230','',0,'',1,0,'/jersonvasquez',0,0,1),('d98fc3b3-0488-4018-bc6c-91a6585cdcae',22241,20155,22239,20005,22239,0,0,'/22241/','22239','',0,'',1,0,'/ejemplo1',0,0,1),('09f605be-d006-47bb-91c2-ef6df2320d24',22250,20155,22248,20005,22248,0,0,'/22250/','22248','',0,'',1,0,'/ejemplo2',0,0,1),('3c7b9b64-39cf-411f-8421-71480f19aeaa',22259,20155,22257,20005,22257,0,0,'/22259/','22257','',0,'',1,0,'/ejemplo3',0,0,1),('f5200b53-9811-40d0-833a-824598dd5d91',27103,20155,20159,20036,27102,0,0,'/27103/','27102','',0,'',1,0,'/template-27102',0,0,1);
/*!40000 ALTER TABLE `group_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups_orgs`
--

DROP TABLE IF EXISTS `groups_orgs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups_orgs` (
  `groupId` bigint(20) NOT NULL,
  `organizationId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`organizationId`),
  KEY `IX_75267DCA` (`groupId`),
  KEY `IX_6BBB7682` (`organizationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_orgs`
--

LOCK TABLES `groups_orgs` WRITE;
/*!40000 ALTER TABLE `groups_orgs` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_orgs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups_roles`
--

DROP TABLE IF EXISTS `groups_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups_roles` (
  `groupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`roleId`),
  KEY `IX_84471FD2` (`groupId`),
  KEY `IX_3103EF3D` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_roles`
--

LOCK TABLES `groups_roles` WRITE;
/*!40000 ALTER TABLE `groups_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groups_usergroups`
--

DROP TABLE IF EXISTS `groups_usergroups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groups_usergroups` (
  `groupId` bigint(20) NOT NULL,
  `userGroupId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`userGroupId`),
  KEY `IX_31FB749A` (`groupId`),
  KEY `IX_3B69160F` (`userGroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groups_usergroups`
--

LOCK TABLES `groups_usergroups` WRITE;
/*!40000 ALTER TABLE `groups_usergroups` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_usergroups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `imageId` bigint(20) NOT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `height` int(11) DEFAULT NULL,
  `width` int(11) DEFAULT NULL,
  `size_` int(11) DEFAULT NULL,
  PRIMARY KEY (`imageId`),
  KEY `IX_6A925A4D` (`size_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `informeretroalimentacion`
--

DROP TABLE IF EXISTS `informeretroalimentacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `informeretroalimentacion` (
  `informeRetroalimentacionId` bigint(20) NOT NULL,
  `planAccionId` bigint(20) DEFAULT NULL,
  `usuario` bigint(20) DEFAULT NULL,
  `titulo` varchar(75) DEFAULT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`informeRetroalimentacionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `informeretroalimentacion`
--

LOCK TABLES `informeretroalimentacion` WRITE;
/*!40000 ALTER TABLE `informeretroalimentacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `informeretroalimentacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journalarticle`
--

DROP TABLE IF EXISTS `journalarticle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journalarticle` (
  `uuid_` varchar(75) DEFAULT NULL,
  `id_` bigint(20) NOT NULL,
  `resourcePrimKey` bigint(20) DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `folderId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `articleId` varchar(75) DEFAULT NULL,
  `version` double DEFAULT NULL,
  `title` longtext,
  `urlTitle` varchar(150) DEFAULT NULL,
  `description` longtext,
  `content` longtext,
  `type_` varchar(75) DEFAULT NULL,
  `structureId` varchar(75) DEFAULT NULL,
  `templateId` varchar(75) DEFAULT NULL,
  `layoutUuid` varchar(75) DEFAULT NULL,
  `displayDate` datetime DEFAULT NULL,
  `expirationDate` datetime DEFAULT NULL,
  `reviewDate` datetime DEFAULT NULL,
  `indexable` tinyint(4) DEFAULT NULL,
  `smallImage` tinyint(4) DEFAULT NULL,
  `smallImageId` bigint(20) DEFAULT NULL,
  `smallImageURL` longtext,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id_`),
  UNIQUE KEY `IX_85C52EEC` (`groupId`,`articleId`,`version`),
  UNIQUE KEY `IX_3463D95B` (`uuid_`,`groupId`),
  KEY `IX_FF0E7A72` (`classNameId`,`templateId`),
  KEY `IX_DFF98523` (`companyId`),
  KEY `IX_323DF109` (`companyId`,`status`),
  KEY `IX_3D070845` (`companyId`,`version`),
  KEY `IX_E82F322B` (`companyId`,`version`,`status`),
  KEY `IX_EA05E9E1` (`displayDate`,`status`),
  KEY `IX_9356F865` (`groupId`),
  KEY `IX_68C0F69C` (`groupId`,`articleId`),
  KEY `IX_4D5CD982` (`groupId`,`articleId`,`status`),
  KEY `IX_9CE6E0FA` (`groupId`,`classNameId`,`classPK`),
  KEY `IX_A2534AC2` (`groupId`,`classNameId`,`layoutUuid`),
  KEY `IX_91E78C35` (`groupId`,`classNameId`,`structureId`),
  KEY `IX_F43B9FF2` (`groupId`,`classNameId`,`templateId`),
  KEY `IX_5CD17502` (`groupId`,`folderId`),
  KEY `IX_F35391E8` (`groupId`,`folderId`,`status`),
  KEY `IX_3C028C1E` (`groupId`,`layoutUuid`),
  KEY `IX_301D024B` (`groupId`,`status`),
  KEY `IX_2E207659` (`groupId`,`structureId`),
  KEY `IX_8DEAE14E` (`groupId`,`templateId`),
  KEY `IX_22882D02` (`groupId`,`urlTitle`),
  KEY `IX_D2D249E8` (`groupId`,`urlTitle`,`status`),
  KEY `IX_D19C1B9F` (`groupId`,`userId`),
  KEY `IX_43A0F80F` (`groupId`,`userId`,`classNameId`),
  KEY `IX_3F1EA19E` (`layoutUuid`),
  KEY `IX_33F49D16` (`resourcePrimKey`),
  KEY `IX_89FF8B06` (`resourcePrimKey`,`indexable`),
  KEY `IX_451D63EC` (`resourcePrimKey`,`indexable`,`status`),
  KEY `IX_3E2765FC` (`resourcePrimKey`,`status`),
  KEY `IX_EF9B7028` (`smallImageId`),
  KEY `IX_8E8710D9` (`structureId`),
  KEY `IX_9106F6CE` (`templateId`),
  KEY `IX_F029602F` (`uuid_`),
  KEY `IX_71520099` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journalarticle`
--

LOCK TABLES `journalarticle` WRITE;
/*!40000 ALTER TABLE `journalarticle` DISABLE KEYS */;
INSERT INTO `journalarticle` VALUES ('bbfe70e7-ca84-49a1-8e78-97d731e9119e',27131,27132,20182,20155,20199,'Test Test','2016-06-18 05:51:02','2016-06-18 05:51:02',0,0,0,'/0/','27130',1,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Estructura de pruba</Title></root>','estructura-de-pruba','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">dqd wqdqdqw</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element name=\"campo01\" type=\"text_box\" index-type=\"keyword\" index=\"0\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[asdsadsadasdqw qwd wqdwq]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element name=\"texto02\" type=\"text\" index-type=\"keyword\" index=\"0\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[qwdqwdwdwwqdw qwd qwdwq]]></dynamic-content>\n	</dynamic-element>\n</root>','general','27125','27127','','2016-06-18 05:49:00',NULL,NULL,1,0,27133,'',0,20199,'Test Test','2016-06-18 05:51:03');
/*!40000 ALTER TABLE `journalarticle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journalarticleimage`
--

DROP TABLE IF EXISTS `journalarticleimage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journalarticleimage` (
  `articleImageId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `articleId` varchar(75) DEFAULT NULL,
  `version` double DEFAULT NULL,
  `elInstanceId` varchar(75) DEFAULT NULL,
  `elName` varchar(75) DEFAULT NULL,
  `languageId` varchar(75) DEFAULT NULL,
  `tempImage` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`articleImageId`),
  UNIQUE KEY `IX_103D6207` (`groupId`,`articleId`,`version`,`elInstanceId`,`elName`,`languageId`),
  KEY `IX_3B51BB68` (`groupId`),
  KEY `IX_158B526F` (`groupId`,`articleId`,`version`),
  KEY `IX_D4121315` (`tempImage`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journalarticleimage`
--

LOCK TABLES `journalarticleimage` WRITE;
/*!40000 ALTER TABLE `journalarticleimage` DISABLE KEYS */;
/*!40000 ALTER TABLE `journalarticleimage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journalarticleresource`
--

DROP TABLE IF EXISTS `journalarticleresource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journalarticleresource` (
  `uuid_` varchar(75) DEFAULT NULL,
  `resourcePrimKey` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `articleId` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`resourcePrimKey`),
  UNIQUE KEY `IX_88DF994A` (`groupId`,`articleId`),
  UNIQUE KEY `IX_84AB0309` (`uuid_`,`groupId`),
  KEY `IX_F8433677` (`groupId`),
  KEY `IX_DCD1FAC1` (`uuid_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journalarticleresource`
--

LOCK TABLES `journalarticleresource` WRITE;
/*!40000 ALTER TABLE `journalarticleresource` DISABLE KEYS */;
INSERT INTO `journalarticleresource` VALUES ('dffda1d9-1269-422f-ab92-02f37490ef68',27132,20182,'27130');
/*!40000 ALTER TABLE `journalarticleresource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journalcontentsearch`
--

DROP TABLE IF EXISTS `journalcontentsearch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journalcontentsearch` (
  `contentSearchId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `privateLayout` tinyint(4) DEFAULT NULL,
  `layoutId` bigint(20) DEFAULT NULL,
  `portletId` varchar(200) DEFAULT NULL,
  `articleId` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`contentSearchId`),
  UNIQUE KEY `IX_C3AA93B8` (`groupId`,`privateLayout`,`layoutId`,`portletId`,`articleId`),
  KEY `IX_9207CB31` (`articleId`),
  KEY `IX_6838E427` (`groupId`,`articleId`),
  KEY `IX_20962903` (`groupId`,`privateLayout`),
  KEY `IX_7CC7D73E` (`groupId`,`privateLayout`,`articleId`),
  KEY `IX_B3B318DC` (`groupId`,`privateLayout`,`layoutId`),
  KEY `IX_7ACC74C9` (`groupId`,`privateLayout`,`layoutId`,`portletId`),
  KEY `IX_8DAF8A35` (`portletId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journalcontentsearch`
--

LOCK TABLES `journalcontentsearch` WRITE;
/*!40000 ALTER TABLE `journalcontentsearch` DISABLE KEYS */;
INSERT INTO `journalcontentsearch` VALUES (27142,20182,20155,0,1,'56_INSTANCE_ic7ak16aYMsW','27130');
/*!40000 ALTER TABLE `journalcontentsearch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journalfeed`
--

DROP TABLE IF EXISTS `journalfeed`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journalfeed` (
  `uuid_` varchar(75) DEFAULT NULL,
  `id_` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `feedId` varchar(75) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `type_` varchar(75) DEFAULT NULL,
  `structureId` varchar(75) DEFAULT NULL,
  `templateId` varchar(75) DEFAULT NULL,
  `rendererTemplateId` varchar(75) DEFAULT NULL,
  `delta` int(11) DEFAULT NULL,
  `orderByCol` varchar(75) DEFAULT NULL,
  `orderByType` varchar(75) DEFAULT NULL,
  `targetLayoutFriendlyUrl` varchar(255) DEFAULT NULL,
  `targetPortletId` varchar(75) DEFAULT NULL,
  `contentField` varchar(75) DEFAULT NULL,
  `feedFormat` varchar(75) DEFAULT NULL,
  `feedVersion` double DEFAULT NULL,
  PRIMARY KEY (`id_`),
  UNIQUE KEY `IX_65576CBC` (`groupId`,`feedId`),
  UNIQUE KEY `IX_39031F51` (`uuid_`,`groupId`),
  KEY `IX_35A2DB2F` (`groupId`),
  KEY `IX_50C36D79` (`uuid_`),
  KEY `IX_CB37A10F` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journalfeed`
--

LOCK TABLES `journalfeed` WRITE;
/*!40000 ALTER TABLE `journalfeed` DISABLE KEYS */;
/*!40000 ALTER TABLE `journalfeed` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `journalfolder`
--

DROP TABLE IF EXISTS `journalfolder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `journalfolder` (
  `uuid_` varchar(75) DEFAULT NULL,
  `folderId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentFolderId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(100) DEFAULT NULL,
  `description` longtext,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`folderId`),
  UNIQUE KEY `IX_65026705` (`groupId`,`parentFolderId`,`name`),
  UNIQUE KEY `IX_E002061` (`uuid_`,`groupId`),
  KEY `IX_E6E2725D` (`companyId`),
  KEY `IX_C36B0443` (`companyId`,`status`),
  KEY `IX_742DEC1F` (`groupId`),
  KEY `IX_E988689E` (`groupId`,`name`),
  KEY `IX_190483C6` (`groupId`,`parentFolderId`),
  KEY `IX_EFD9CAC` (`groupId`,`parentFolderId`,`status`),
  KEY `IX_63BDFA69` (`uuid_`),
  KEY `IX_54F89E1F` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `journalfolder`
--

LOCK TABLES `journalfolder` WRITE;
/*!40000 ALTER TABLE `journalfolder` DISABLE KEYS */;
/*!40000 ALTER TABLE `journalfolder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleoaction`
--

DROP TABLE IF EXISTS `kaleoaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleoaction` (
  `kaleoActionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoClassName` varchar(200) DEFAULT NULL,
  `kaleoClassPK` bigint(20) DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNodeName` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` longtext,
  `executionType` varchar(20) DEFAULT NULL,
  `script` longtext,
  `scriptLanguage` varchar(75) DEFAULT NULL,
  `scriptRequiredContexts` longtext,
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`kaleoActionId`),
  KEY `IX_50E9112C` (`companyId`),
  KEY `IX_170EFD7A` (`kaleoClassName`,`kaleoClassPK`),
  KEY `IX_4B2545E8` (`kaleoClassName`,`kaleoClassPK`,`executionType`),
  KEY `IX_F95A622` (`kaleoDefinitionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleoaction`
--

LOCK TABLES `kaleoaction` WRITE;
/*!40000 ALTER TABLE `kaleoaction` DISABLE KEYS */;
INSERT INTO `kaleoaction` VALUES (20471,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoNode',20470,20469,'update','reject','','onAssignment','\n					\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"denied\"), workflowContext);\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"pending\"), workflowContext);\n					\n				','javascript','',0),(20476,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoNode',20475,20469,'approved','approve','','onEntry','\n					\n						import com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil;\n						import com.liferay.portal.kernel.workflow.WorkflowConstants;\n\n						WorkflowStatusManagerUtil.updateStatus(WorkflowConstants.toStatus(\"approved\"), workflowContext);\n					\n				','groovy','',0);
/*!40000 ALTER TABLE `kaleoaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleocondition`
--

DROP TABLE IF EXISTS `kaleocondition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleocondition` (
  `kaleoConditionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNodeId` bigint(20) DEFAULT NULL,
  `script` longtext,
  `scriptLanguage` varchar(75) DEFAULT NULL,
  `scriptRequiredContexts` longtext,
  PRIMARY KEY (`kaleoConditionId`),
  KEY `IX_FEE46067` (`companyId`),
  KEY `IX_DC978A5D` (`kaleoDefinitionId`),
  KEY `IX_86CBD4C` (`kaleoNodeId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleocondition`
--

LOCK TABLES `kaleocondition` WRITE;
/*!40000 ALTER TABLE `kaleocondition` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleocondition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleodefinition`
--

DROP TABLE IF EXISTS `kaleodefinition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleodefinition` (
  `kaleoDefinitionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `content` longtext,
  `version` int(11) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  `startKaleoNodeId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`kaleoDefinitionId`),
  KEY `IX_40B9112F` (`companyId`),
  KEY `IX_408542BA` (`companyId`,`active_`),
  KEY `IX_76C781AE` (`companyId`,`name`),
  KEY `IX_4C23F11B` (`companyId`,`name`,`active_`),
  KEY `IX_EC14F81A` (`companyId`,`name`,`version`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleodefinition`
--

LOCK TABLES `kaleodefinition` WRITE;
/*!40000 ALTER TABLE `kaleodefinition` DISABLE KEYS */;
INSERT INTO `kaleodefinition` VALUES (20469,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:14','Single Approver','Single Approver','A single approver can approve a workflow content.','<?xml version=\"1.0\"?>\n\n<workflow-definition xmlns=\"urn:liferay.com:liferay-workflow_6.2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:liferay.com:liferay-workflow_6.2.0 http://www.liferay.com/dtd/liferay-workflow-definition_6_2_0.xsd\">\n	<name>Single Approver</name>\n	<description>A single approver can approve a workflow content.</description>\n	<version>1</version>\n	<state>\n		<name>created</name>\n		<metadata> <![CDATA[{\"xy\":[36,51]}]]> </metadata>\n		<initial>true</initial>\n		<transitions>\n			<transition>\n				<name>review</name>\n				<target>review</target>\n			</transition>\n		</transitions>\n	</state>\n	<task>\n		<name>update</name>\n		<metadata> <![CDATA[{\"transitions\":{\"resubmit\":{\"bendpoints\":[[303,140]]}},\"xy\":[328,199]}]]> </metadata>\n		<actions>\n			<action>\n				<name>reject</name>\n				<script> <![CDATA[\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"denied\"), workflowContext);\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"pending\"), workflowContext);\n					]]> </script>\n				<script-language>javascript</script-language>\n				<execution-type>onAssignment</execution-type>\n			</action>\n			<notification>\n				<name>Creator Modification Notification</name>\n				<template>Your submission was rejected by ${userName}, please modify and resubmit.</template>\n				<template-language>freemarker</template-language>\n				<notification-type>email</notification-type>\n				<notification-type>user-notification</notification-type>\n				<execution-type>onAssignment</execution-type>\n			</notification>\n		</actions>\n		<assignments>\n			<user/>\n		</assignments>\n		<transitions>\n			<transition>\n				<name>resubmit</name>\n				<target>review</target>\n			</transition>\n		</transitions>\n	</task>\n	<task>\n		<name>review</name>\n		<metadata> <![CDATA[{\"xy\":[168,36]}]]> </metadata>\n		<actions>\n			<notification>\n				<name>Review Notification</name>\n				<template>${userName} sent you a ${entryType} for review in the workflow.</template>\n				<template-language>freemarker</template-language>\n				<notification-type>email</notification-type>\n				<notification-type>user-notification</notification-type>\n				<execution-type>onAssignment</execution-type>\n			</notification>\n			<notification>\n				<name>Review Completion Notification</name>\n				<template>Your submission has been reviewed and the reviewer has applied the following ${taskComments}.</template>\n				<template-language>freemarker</template-language>\n				<notification-type>email</notification-type>\n				<recipients>\n					<user/>\n				</recipients>\n				<execution-type>onExit</execution-type>\n			</notification>\n		</actions>\n		<assignments>\n			<roles>\n				<role>\n					<role-type>organization</role-type>\n					<name>Organization Administrator</name>\n				</role>\n				<role>\n					<role-type>organization</role-type>\n					<name>Organization Content Reviewer</name>\n				</role>\n				<role>\n					<role-type>organization</role-type>\n					<name>Organization Owner</name>\n				</role>\n				<role>\n					<role-type>regular</role-type>\n					<name>Administrator</name>\n				</role>\n				<role>\n					<role-type>regular</role-type>\n					<name>Portal Content Reviewer</name>\n				</role>\n				<role>\n					<role-type>site</role-type>\n					<name>Site Administrator</name>\n				</role>\n				<role>\n					<role-type>site</role-type>\n					<name>Site Content Reviewer</name>\n				</role>\n				<role>\n					<role-type>site</role-type>\n					<name>Site Owner</name>\n				</role>\n			</roles>\n		</assignments>\n		<transitions>\n			<transition>\n				<name>approve</name>\n				<target>approved</target>\n			</transition>\n			<transition>\n				<name>reject</name>\n				<target>update</target>\n				<default>false</default>\n			</transition>\n		</transitions>\n	</task>\n	<state>\n		<name>approved</name>\n		<metadata> <![CDATA[\n				{\"xy\":[380,51]}\n			]]> </metadata>\n		<actions>\n			<action>\n				<name>approve</name>\n				<script> <![CDATA[\n						import com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil;\n						import com.liferay.portal.kernel.workflow.WorkflowConstants;\n\n						WorkflowStatusManagerUtil.updateStatus(WorkflowConstants.toStatus(\"approved\"), workflowContext);\n					]]> </script>\n				<script-language>groovy</script-language>\n				<execution-type>onEntry</execution-type>\n			</action>\n		</actions>\n	</state>\n</workflow-definition>',1,1,20477);
/*!40000 ALTER TABLE `kaleodefinition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleoinstance`
--

DROP TABLE IF EXISTS `kaleoinstance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleoinstance` (
  `kaleoInstanceId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoDefinitionName` varchar(200) DEFAULT NULL,
  `kaleoDefinitionVersion` int(11) DEFAULT NULL,
  `rootKaleoInstanceTokenId` bigint(20) DEFAULT NULL,
  `className` varchar(200) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `completed` tinyint(4) DEFAULT NULL,
  `completionDate` datetime DEFAULT NULL,
  `workflowContext` longtext,
  PRIMARY KEY (`kaleoInstanceId`),
  KEY `IX_58D85ECB` (`className`,`classPK`),
  KEY `IX_5F2FCD2D` (`companyId`),
  KEY `IX_BF5839F8` (`companyId`,`kaleoDefinitionName`,`kaleoDefinitionVersion`,`completionDate`),
  KEY `IX_C6D7A867` (`companyId`,`userId`),
  KEY `IX_4DA4D123` (`kaleoDefinitionId`),
  KEY `IX_ACF16238` (`kaleoDefinitionId`,`completed`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleoinstance`
--

LOCK TABLES `kaleoinstance` WRITE;
/*!40000 ALTER TABLE `kaleoinstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleoinstance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleoinstancetoken`
--

DROP TABLE IF EXISTS `kaleoinstancetoken`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleoinstancetoken` (
  `kaleoInstanceTokenId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoInstanceId` bigint(20) DEFAULT NULL,
  `parentKaleoInstanceTokenId` bigint(20) DEFAULT NULL,
  `currentKaleoNodeId` bigint(20) DEFAULT NULL,
  `currentKaleoNodeName` varchar(200) DEFAULT NULL,
  `className` varchar(200) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `completed` tinyint(4) DEFAULT NULL,
  `completionDate` datetime DEFAULT NULL,
  PRIMARY KEY (`kaleoInstanceTokenId`),
  KEY `IX_153721BE` (`companyId`),
  KEY `IX_4A86923B` (`companyId`,`parentKaleoInstanceTokenId`),
  KEY `IX_360D34D9` (`companyId`,`parentKaleoInstanceTokenId`,`completionDate`),
  KEY `IX_7BDB04B4` (`kaleoDefinitionId`),
  KEY `IX_F42AAFF6` (`kaleoInstanceId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleoinstancetoken`
--

LOCK TABLES `kaleoinstancetoken` WRITE;
/*!40000 ALTER TABLE `kaleoinstancetoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleoinstancetoken` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleolog`
--

DROP TABLE IF EXISTS `kaleolog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleolog` (
  `kaleoLogId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoClassName` varchar(200) DEFAULT NULL,
  `kaleoClassPK` bigint(20) DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoInstanceId` bigint(20) DEFAULT NULL,
  `kaleoInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoTaskInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoNodeName` varchar(200) DEFAULT NULL,
  `terminalKaleoNode` tinyint(4) DEFAULT NULL,
  `kaleoActionId` bigint(20) DEFAULT NULL,
  `kaleoActionName` varchar(200) DEFAULT NULL,
  `kaleoActionDescription` longtext,
  `previousKaleoNodeId` bigint(20) DEFAULT NULL,
  `previousKaleoNodeName` varchar(200) DEFAULT NULL,
  `previousAssigneeClassName` varchar(200) DEFAULT NULL,
  `previousAssigneeClassPK` bigint(20) DEFAULT NULL,
  `currentAssigneeClassName` varchar(200) DEFAULT NULL,
  `currentAssigneeClassPK` bigint(20) DEFAULT NULL,
  `type_` varchar(50) DEFAULT NULL,
  `comment_` longtext,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `duration` bigint(20) DEFAULT NULL,
  `workflowContext` longtext,
  PRIMARY KEY (`kaleoLogId`),
  KEY `IX_73B5F4DE` (`companyId`),
  KEY `IX_E66A153A` (`kaleoClassName`,`kaleoClassPK`,`kaleoInstanceTokenId`,`type_`),
  KEY `IX_6C64B7D4` (`kaleoDefinitionId`),
  KEY `IX_5BC6AB16` (`kaleoInstanceId`),
  KEY `IX_470B9FF8` (`kaleoInstanceTokenId`,`type_`),
  KEY `IX_B0CDCA38` (`kaleoTaskInstanceTokenId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleolog`
--

LOCK TABLES `kaleolog` WRITE;
/*!40000 ALTER TABLE `kaleolog` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleolog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleonode`
--

DROP TABLE IF EXISTS `kaleonode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleonode` (
  `kaleoNodeId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `metadata` longtext,
  `description` longtext,
  `type_` varchar(20) DEFAULT NULL,
  `initial_` tinyint(4) DEFAULT NULL,
  `terminal` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`kaleoNodeId`),
  KEY `IX_C4E9ACE0` (`companyId`),
  KEY `IX_F28C443E` (`companyId`,`kaleoDefinitionId`),
  KEY `IX_32E94DD6` (`kaleoDefinitionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleonode`
--

LOCK TABLES `kaleonode` WRITE;
/*!40000 ALTER TABLE `kaleonode` DISABLE KEYS */;
INSERT INTO `kaleonode` VALUES (20470,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,'update','\n			{\"transitions\":{\"resubmit\":{\"bendpoints\":[[303,140]]}},\"xy\":[328,199]}\n		','','TASK',0,0),(20475,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,'approved','\n			\n				{\"xy\":[380,51]}\n			\n		','','STATE',0,1),(20477,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,'created','\n			{\"xy\":[36,51]}\n		','','STATE',1,0),(20478,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,'review','\n			{\"xy\":[168,36]}\n		','','TASK',0,0);
/*!40000 ALTER TABLE `kaleonode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleonotification`
--

DROP TABLE IF EXISTS `kaleonotification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleonotification` (
  `kaleoNotificationId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoClassName` varchar(200) DEFAULT NULL,
  `kaleoClassPK` bigint(20) DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNodeName` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` longtext,
  `executionType` varchar(20) DEFAULT NULL,
  `template` longtext,
  `templateLanguage` varchar(75) DEFAULT NULL,
  `notificationTypes` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`kaleoNotificationId`),
  KEY `IX_38829497` (`companyId`),
  KEY `IX_902D342F` (`kaleoClassName`,`kaleoClassPK`),
  KEY `IX_F3362E93` (`kaleoClassName`,`kaleoClassPK`,`executionType`),
  KEY `IX_4B968E8D` (`kaleoDefinitionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleonotification`
--

LOCK TABLES `kaleonotification` WRITE;
/*!40000 ALTER TABLE `kaleonotification` DISABLE KEYS */;
INSERT INTO `kaleonotification` VALUES (20472,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoNode',20470,20469,'update','Creator Modification Notification','','onAssignment','Your submission was rejected by ${userName}, please modify and resubmit.','freemarker','user-notification,email'),(20479,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoNode',20478,20469,'review','Review Notification','','onAssignment','${userName} sent you a ${entryType} for review in the workflow.','freemarker','user-notification,email'),(20480,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoNode',20478,20469,'review','Review Completion Notification','','onExit','\n					Your submission has been reviewed and the reviewer has applied the following ${taskComments}.','freemarker','email');
/*!40000 ALTER TABLE `kaleonotification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleonotificationrecipient`
--

DROP TABLE IF EXISTS `kaleonotificationrecipient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleonotificationrecipient` (
  `kaleoNotificationRecipientId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNotificationId` bigint(20) DEFAULT NULL,
  `recipientClassName` varchar(200) DEFAULT NULL,
  `recipientClassPK` bigint(20) DEFAULT NULL,
  `recipientRoleType` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`kaleoNotificationRecipientId`),
  KEY `IX_2C8C4AF4` (`companyId`),
  KEY `IX_AA6697EA` (`kaleoDefinitionId`),
  KEY `IX_7F4FED02` (`kaleoNotificationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleonotificationrecipient`
--

LOCK TABLES `kaleonotificationrecipient` WRITE;
/*!40000 ALTER TABLE `kaleonotificationrecipient` DISABLE KEYS */;
INSERT INTO `kaleonotificationrecipient` VALUES (20481,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,20480,'com.liferay.portal.model.User',0,0,'');
/*!40000 ALTER TABLE `kaleonotificationrecipient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotask`
--

DROP TABLE IF EXISTS `kaleotask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotask` (
  `kaleoTaskId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNodeId` bigint(20) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`kaleoTaskId`),
  KEY `IX_E1F8B23D` (`companyId`),
  KEY `IX_3FFA633` (`kaleoDefinitionId`),
  KEY `IX_77B3F1A2` (`kaleoNodeId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotask`
--

LOCK TABLES `kaleotask` WRITE;
/*!40000 ALTER TABLE `kaleotask` DISABLE KEYS */;
INSERT INTO `kaleotask` VALUES (20473,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,20470,'update',''),(20484,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13',20469,20478,'review','');
/*!40000 ALTER TABLE `kaleotask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotaskassignment`
--

DROP TABLE IF EXISTS `kaleotaskassignment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotaskassignment` (
  `kaleoTaskAssignmentId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoClassName` varchar(200) DEFAULT NULL,
  `kaleoClassPK` bigint(20) DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNodeId` bigint(20) DEFAULT NULL,
  `assigneeClassName` varchar(200) DEFAULT NULL,
  `assigneeClassPK` bigint(20) DEFAULT NULL,
  `assigneeActionId` varchar(75) DEFAULT NULL,
  `assigneeScript` longtext,
  `assigneeScriptLanguage` varchar(75) DEFAULT NULL,
  `assigneeScriptRequiredContexts` longtext,
  PRIMARY KEY (`kaleoTaskAssignmentId`),
  KEY `IX_611732B0` (`companyId`),
  KEY `IX_D835C576` (`kaleoClassName`,`kaleoClassPK`),
  KEY `IX_1087068E` (`kaleoClassName`,`kaleoClassPK`,`assigneeClassName`),
  KEY `IX_575C03A6` (`kaleoDefinitionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotaskassignment`
--

LOCK TABLES `kaleotaskassignment` WRITE;
/*!40000 ALTER TABLE `kaleotaskassignment` DISABLE KEYS */;
INSERT INTO `kaleotaskassignment` VALUES (20474,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoTask',20473,20469,0,'com.liferay.portal.model.User',0,'','','',''),(20485,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20162,'','','',''),(20486,0,20155,20159,'','2016-05-04 07:42:13','2016-05-04 07:42:13','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20487,'','','',''),(20488,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20489,'','','',''),(20490,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20491,'','','',''),(20492,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20172,'','','',''),(20493,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20170,'','','',''),(20494,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20167,'','','',''),(20495,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14','com.liferay.portal.workflow.kaleo.model.KaleoTask',20484,20469,0,'com.liferay.portal.model.Role',20168,'','','','');
/*!40000 ALTER TABLE `kaleotaskassignment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotaskassignmentinstance`
--

DROP TABLE IF EXISTS `kaleotaskassignmentinstance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotaskassignmentinstance` (
  `kaleoTaskAssignmentInstanceId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoInstanceId` bigint(20) DEFAULT NULL,
  `kaleoInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoTaskInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoTaskId` bigint(20) DEFAULT NULL,
  `kaleoTaskName` varchar(200) DEFAULT NULL,
  `assigneeClassName` varchar(200) DEFAULT NULL,
  `assigneeClassPK` bigint(20) DEFAULT NULL,
  `completed` tinyint(4) DEFAULT NULL,
  `completionDate` datetime DEFAULT NULL,
  PRIMARY KEY (`kaleoTaskAssignmentInstanceId`),
  KEY `IX_945F4EB7` (`assigneeClassName`),
  KEY `IX_3BD436FD` (`assigneeClassName`,`assigneeClassPK`),
  KEY `IX_6E3CDA1B` (`companyId`),
  KEY `IX_38A47B17` (`groupId`,`assigneeClassPK`),
  KEY `IX_C851011` (`kaleoDefinitionId`),
  KEY `IX_67A9EE93` (`kaleoInstanceId`),
  KEY `IX_D4C2235B` (`kaleoTaskInstanceTokenId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotaskassignmentinstance`
--

LOCK TABLES `kaleotaskassignmentinstance` WRITE;
/*!40000 ALTER TABLE `kaleotaskassignmentinstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotaskassignmentinstance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotaskinstancetoken`
--

DROP TABLE IF EXISTS `kaleotaskinstancetoken`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotaskinstancetoken` (
  `kaleoTaskInstanceTokenId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoInstanceId` bigint(20) DEFAULT NULL,
  `kaleoInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoTaskId` bigint(20) DEFAULT NULL,
  `kaleoTaskName` varchar(200) DEFAULT NULL,
  `className` varchar(200) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `completionUserId` bigint(20) DEFAULT NULL,
  `completed` tinyint(4) DEFAULT NULL,
  `completionDate` datetime DEFAULT NULL,
  `dueDate` datetime DEFAULT NULL,
  `workflowContext` longtext,
  PRIMARY KEY (`kaleoTaskInstanceTokenId`),
  KEY `IX_A3271995` (`className`,`classPK`),
  KEY `IX_997FE723` (`companyId`),
  KEY `IX_608E9519` (`kaleoDefinitionId`),
  KEY `IX_2CE1159B` (`kaleoInstanceId`),
  KEY `IX_B857A115` (`kaleoInstanceId`,`kaleoTaskId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotaskinstancetoken`
--

LOCK TABLES `kaleotaskinstancetoken` WRITE;
/*!40000 ALTER TABLE `kaleotaskinstancetoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotaskinstancetoken` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotimer`
--

DROP TABLE IF EXISTS `kaleotimer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotimer` (
  `kaleoTimerId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoClassName` varchar(200) DEFAULT NULL,
  `kaleoClassPK` bigint(20) DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `blocking` tinyint(4) DEFAULT NULL,
  `description` longtext,
  `duration` double DEFAULT NULL,
  `scale` varchar(75) DEFAULT NULL,
  `recurrenceDuration` double DEFAULT NULL,
  `recurrenceScale` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`kaleoTimerId`),
  KEY `IX_4DE6A889` (`kaleoClassName`,`kaleoClassPK`),
  KEY `IX_1A479F32` (`kaleoClassName`,`kaleoClassPK`,`blocking`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotimer`
--

LOCK TABLES `kaleotimer` WRITE;
/*!40000 ALTER TABLE `kaleotimer` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotimer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotimerinstancetoken`
--

DROP TABLE IF EXISTS `kaleotimerinstancetoken`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotimerinstancetoken` (
  `kaleoTimerInstanceTokenId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoClassName` varchar(200) DEFAULT NULL,
  `kaleoClassPK` bigint(20) DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoInstanceId` bigint(20) DEFAULT NULL,
  `kaleoInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoTaskInstanceTokenId` bigint(20) DEFAULT NULL,
  `kaleoTimerId` bigint(20) DEFAULT NULL,
  `kaleoTimerName` varchar(200) DEFAULT NULL,
  `blocking` tinyint(4) DEFAULT NULL,
  `completionUserId` bigint(20) DEFAULT NULL,
  `completed` tinyint(4) DEFAULT NULL,
  `completionDate` datetime DEFAULT NULL,
  `workflowContext` longtext,
  PRIMARY KEY (`kaleoTimerInstanceTokenId`),
  KEY `IX_DB96C55B` (`kaleoInstanceId`),
  KEY `IX_DB279423` (`kaleoInstanceTokenId`,`completed`),
  KEY `IX_9932524C` (`kaleoInstanceTokenId`,`completed`,`blocking`),
  KEY `IX_13A5BA2C` (`kaleoInstanceTokenId`,`kaleoTimerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotimerinstancetoken`
--

LOCK TABLES `kaleotimerinstancetoken` WRITE;
/*!40000 ALTER TABLE `kaleotimerinstancetoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotimerinstancetoken` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaleotransition`
--

DROP TABLE IF EXISTS `kaleotransition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaleotransition` (
  `kaleoTransitionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(200) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `kaleoDefinitionId` bigint(20) DEFAULT NULL,
  `kaleoNodeId` bigint(20) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` longtext,
  `sourceKaleoNodeId` bigint(20) DEFAULT NULL,
  `sourceKaleoNodeName` varchar(200) DEFAULT NULL,
  `targetKaleoNodeId` bigint(20) DEFAULT NULL,
  `targetKaleoNodeName` varchar(200) DEFAULT NULL,
  `defaultTransition` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`kaleoTransitionId`),
  KEY `IX_41D6C6D` (`companyId`),
  KEY `IX_479F3063` (`kaleoDefinitionId`),
  KEY `IX_A392DFD2` (`kaleoNodeId`),
  KEY `IX_A38E2194` (`kaleoNodeId`,`defaultTransition`),
  KEY `IX_85268A11` (`kaleoNodeId`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaleotransition`
--

LOCK TABLES `kaleotransition` WRITE;
/*!40000 ALTER TABLE `kaleotransition` DISABLE KEYS */;
INSERT INTO `kaleotransition` VALUES (20496,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20469,20470,'resubmit','',20470,'update',20478,'review',1),(20497,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20469,20477,'review','',20477,'created',20478,'review',1),(20498,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20469,20478,'approve','',20478,'review',20475,'approved',1),(20499,0,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20469,20478,'reject','',20478,'review',20470,'update',0);
/*!40000 ALTER TABLE `kaleotransition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layout`
--

DROP TABLE IF EXISTS `layout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layout` (
  `uuid_` varchar(75) DEFAULT NULL,
  `plid` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `privateLayout` tinyint(4) DEFAULT NULL,
  `layoutId` bigint(20) DEFAULT NULL,
  `parentLayoutId` bigint(20) DEFAULT NULL,
  `name` longtext,
  `title` longtext,
  `description` longtext,
  `keywords` longtext,
  `robots` longtext,
  `type_` varchar(75) DEFAULT NULL,
  `typeSettings` longtext,
  `hidden_` tinyint(4) DEFAULT NULL,
  `friendlyURL` varchar(255) DEFAULT NULL,
  `iconImage` tinyint(4) DEFAULT NULL,
  `iconImageId` bigint(20) DEFAULT NULL,
  `themeId` varchar(75) DEFAULT NULL,
  `colorSchemeId` varchar(75) DEFAULT NULL,
  `wapThemeId` varchar(75) DEFAULT NULL,
  `wapColorSchemeId` varchar(75) DEFAULT NULL,
  `css` longtext,
  `priority` int(11) DEFAULT NULL,
  `layoutPrototypeUuid` varchar(75) DEFAULT NULL,
  `layoutPrototypeLinkEnabled` tinyint(4) DEFAULT NULL,
  `sourcePrototypeLayoutUuid` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`plid`),
  UNIQUE KEY `IX_BC2C4231` (`groupId`,`privateLayout`,`friendlyURL`),
  UNIQUE KEY `IX_7162C27C` (`groupId`,`privateLayout`,`layoutId`),
  UNIQUE KEY `IX_E118C537` (`uuid_`,`groupId`,`privateLayout`),
  KEY `IX_C7FBC998` (`companyId`),
  KEY `IX_C099D61A` (`groupId`),
  KEY `IX_705F5AA3` (`groupId`,`privateLayout`),
  KEY `IX_6DE88B06` (`groupId`,`privateLayout`,`parentLayoutId`),
  KEY `IX_8CE8C0D9` (`groupId`,`privateLayout`,`sourcePrototypeLayoutUuid`),
  KEY `IX_1A1B61D2` (`groupId`,`privateLayout`,`type_`),
  KEY `IX_23922F7D` (`iconImageId`),
  KEY `IX_B529BFD3` (`layoutPrototypeUuid`),
  KEY `IX_39A18ECC` (`sourcePrototypeLayoutUuid`),
  KEY `IX_D0822724` (`uuid_`),
  KEY `IX_2CE4BE84` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layout`
--

LOCK TABLES `layout` WRITE;
/*!40000 ALTER TABLE `layout` DISABLE KEYS */;
INSERT INTO `layout` VALUES ('fc4d36b0-862e-4816-8d4f-0cbb6d15afe8',20176,20173,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Control Panel</Name></root>','','','','','control_panel','privateLayout=true\n',0,'/manage',0,0,'','','','','',0,'',0,''),('c0b5d5fc-94db-4b4a-9779-edd4c6f7c6af',20185,20182,20155,20159,'','2016-05-04 07:40:11','2016-06-18 05:52:48',0,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US,es_ES,\" default-locale=\"es_ES\"><Name language-id=\"en_US\">Welcome</Name><Name language-id=\"es_ES\">Inicio</Name></root>','','','','','portlet','column-1=demotest_WAR_demotestportlet\ncolumn-1-customizable=false\ncolumn-2-customizable=false\ncolumn-4=47,\ncolumn-5=58,\ncolumn-7=56_INSTANCE_ic7ak16aYMsW,\nlayout-template-id=testdemo\nlayoutUpdateable=true\nsitemap-changefreq=daily\nsitemap-include=1\n',0,'/inicio',0,0,'classic','','','','',0,'',0,''),('129f64d1-e0b1-4f03-b001-d7c721c3a1ab',20320,20317,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:15',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Blog</Name></root>','','','','','portlet','column-1=33,\ncolumn-2=148_INSTANCE_saHROptkJ4PX,114,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/layout',0,0,'','','','','',0,'',0,''),('9832b4fe-3065-4139-baa2-9dfce9f81ac5',20332,20329,20155,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:16',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Content Display Page</Name></root>','','','','','portlet','column-1=141_INSTANCE_U9pmCmn2zB4d,122_INSTANCE_Ubt5gGha0IwX,\ncolumn-2=3,101_INSTANCE_ohXpmA9bRYxZ,\ndefault-asset-publisher-portlet-id=101_INSTANCE_ohXpmA9bRYxZ\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/layout',0,0,'','','','','',0,'',0,''),('f7e4e82f-398e-4789-911d-9d1fc46dfd6f',20342,20339,20155,20159,'','2016-05-04 07:40:17','2016-05-04 07:40:18',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Wiki</Name></root>','','','','','portlet','column-1=36,\ncolumn-2=122_INSTANCE_Fx5Bm5swBFX5,141_INSTANCE_BlhIR1PCUUy2,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/layout',0,0,'','','','','',0,'',0,''),('96fbdd63-b8c1-47f3-91ff-6217e2ac8bdc',20361,20350,20155,20159,'','2016-05-04 07:40:19','2016-05-04 07:40:20',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Home</Name></root>','','','','','portlet','column-1=19,\ncolumn-2=3,59_INSTANCE_uOb6BqSYw6NQ,180,101_INSTANCE_Q8nqPwYAC0Ar,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),('6098463f-3a50-4ace-8042-549f723217c4',20369,20350,20155,20159,'','2016-05-04 07:40:20','2016-05-04 07:40:21',1,2,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Wiki</Name></root>','','','','','portlet','column-1=36,\ncolumn-2=122_INSTANCE_xp0vgwrkQEUJ,148_INSTANCE_xVlD2kVzM6kU,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/wiki',0,0,'','','','','',1,'',0,''),('ae590b2b-dcc7-41dc-9adb-959d47dcd146',20387,20376,20155,20159,'','2016-05-04 07:40:21','2016-05-04 07:40:23',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Home</Name></root>','','','','','portlet','column-1=116,\ncolumn-2=3,82,101_INSTANCE_AqPCCFxiPQzm,\nlayout-template-id=2_columns_i\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),('f5a8c8b0-664e-40da-821c-3fcc75c27eb5',20396,20376,20155,20159,'','2016-05-04 07:40:23','2016-05-04 07:40:24',1,2,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Documents and Media</Name></root>','','','','','portlet','column-1=20,\ncolumn-2=101_INSTANCE_xKzmsZzdVdqI,\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/documents',0,0,'','','','','',1,'',0,''),('034512bc-b55c-454c-95a7-ee653726763a',20404,20376,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',1,3,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">News</Name></root>','','','','','portlet','column-1=39_INSTANCE_NiGqRblDnM8V,\ncolumn-2=39_INSTANCE_Qyr1XVXNJIKr,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/news',0,0,'','','','','',2,'',0,''),('d82069e8-d79c-4a08-9e70-914846b91d35',20628,20623,20155,20199,'Test Test','2016-05-04 07:51:12','2016-06-06 03:34:39',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Registrar Solicitud De Reclutamiento</Name></root>','','','','','portlet','column-1=ActualizarSolicitudReclutamiento_WAR_revportlet_INSTANCE_PVbvt9tHVL1v,\ncolumn-1-customizable=false\nlayout-template-id=1_column\nlayoutUpdateable=true\nprivateLayout=true\n',0,'/solicitud-de-reclutamiento',0,0,'classic','','','','',0,'',0,''),('bd79e606-99ba-42d3-bd4c-b826fcf24919',20634,20623,20155,20199,'Test Test','2016-05-04 07:51:25','2016-06-06 03:34:48',1,2,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Evaluar requerimiento de recursos</Name></root>','','','','','portlet','column-1=EvaluarSolicitudRequerimiento_WAR_revportlet_INSTANCE_Ghm29e75sRuF,\ncolumn-1-customizable=false\nlayout-template-id=1_column\nlayoutUpdateable=true\nprivateLayout=true\n',0,'/evaluar-requerimiento-recurso',0,0,'classic','','','','',1,'',0,''),('5ecaffaa-d182-4e62-b792-1f0b8acc0502',25801,20623,20155,20199,'Test Test','2016-06-06 03:27:18','2016-06-07 23:58:36',1,3,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Evaluar Ficha de Ingreso</Name></root>','','','','','portlet','column-1=EvaluarFechaIngreso_WAR_revportlet_INSTANCE_albqsp7rAam4\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/evaluar-ficha-de-ingreso',0,0,'','','','','',6,'',0,''),('27312f84-2b4e-4fe3-9288-998aad48c053',25903,20623,20155,20199,'Test Test','2016-06-06 03:32:19','2016-06-07 23:57:27',1,4,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Programar Entrevista</Name></root>','','','','','portlet','column-1=ProgramaEntrevista_WAR_revportlet_INSTANCE_hpN3fKQ24Uo5\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/programar-entrevista',0,0,'','','','','',3,'',0,''),('ece4b776-be73-4330-a60d-f4a64d70cd94',25909,20623,20155,20199,'Test Test','2016-06-06 03:33:36','2016-06-07 23:57:05',1,5,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Publicar Oferta</Name></root>','','','','','portlet','column-1=PublicarOferta_WAR_revportlet_INSTANCE_pYbcNlTAznXM\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/publicar-oferta',0,0,'','','','','',2,'',0,''),('3f5ccb49-21cf-4bd7-af56-835867e8b099',25915,20623,20155,20199,'Test Test','2016-06-06 03:34:06','2016-06-07 23:58:05',1,6,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Registrar Resultados De Entrevista</Name></root>','','','','','portlet','column-1=RegistrarResultadoEntrevista_WAR_revportlet_INSTANCE_GPsiPA0asYdc\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/registrar-resultados-de-entrevista',0,0,'','','','','',4,'',0,''),('24529071-7d21-425e-b047-9a792b087fa5',25921,20623,20155,20199,'Test Test','2016-06-06 03:35:09','2016-06-07 23:58:18',1,7,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Seleccionar Personal</Name></root>','','','','','portlet','column-1=SeleccionarPersonal_WAR_revportlet_INSTANCE_eLyDHlApH4eb\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/seleccionar-personal',0,0,'','','','','',5,'',0,''),('efae2458-6890-46c1-bdb0-81b123c061ae',27116,27103,20155,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Welcome</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Welcome</Title></root>','','','','portlet','column-1=58,\ncolumn-2=47,\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),('d6438693-b922-4e93-a158-fc641a90e946',30405,20534,20155,20159,'','2016-08-17 07:02:22','2016-08-17 07:02:22',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Welcome</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Welcome</Title></root>','','','','portlet','column-1=58,\ncolumn-2=47,\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,'');
/*!40000 ALTER TABLE `layout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutbranch`
--

DROP TABLE IF EXISTS `layoutbranch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutbranch` (
  `LayoutBranchId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `layoutSetBranchId` bigint(20) DEFAULT NULL,
  `plid` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `master` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`LayoutBranchId`),
  UNIQUE KEY `IX_FD57097D` (`layoutSetBranchId`,`plid`,`name`),
  KEY `IX_6C226433` (`layoutSetBranchId`),
  KEY `IX_2C42603E` (`layoutSetBranchId`,`plid`),
  KEY `IX_A705FF94` (`layoutSetBranchId`,`plid`,`master`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutbranch`
--

LOCK TABLES `layoutbranch` WRITE;
/*!40000 ALTER TABLE `layoutbranch` DISABLE KEYS */;
/*!40000 ALTER TABLE `layoutbranch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutfriendlyurl`
--

DROP TABLE IF EXISTS `layoutfriendlyurl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutfriendlyurl` (
  `uuid_` varchar(75) DEFAULT NULL,
  `layoutFriendlyURLId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `plid` bigint(20) DEFAULT NULL,
  `privateLayout` tinyint(4) DEFAULT NULL,
  `friendlyURL` varchar(255) DEFAULT NULL,
  `languageId` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`layoutFriendlyURLId`),
  UNIQUE KEY `IX_A6FC2B28` (`groupId`,`privateLayout`,`friendlyURL`,`languageId`),
  UNIQUE KEY `IX_C5762E72` (`plid`,`languageId`),
  UNIQUE KEY `IX_326525D6` (`uuid_`,`groupId`),
  KEY `IX_EAB317C8` (`companyId`),
  KEY `IX_742EF04A` (`groupId`),
  KEY `IX_CA713461` (`groupId`,`privateLayout`,`friendlyURL`),
  KEY `IX_83AE56AB` (`plid`),
  KEY `IX_59051329` (`plid`,`friendlyURL`),
  KEY `IX_9F80D54` (`uuid_`),
  KEY `IX_F4321A54` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutfriendlyurl`
--

LOCK TABLES `layoutfriendlyurl` WRITE;
/*!40000 ALTER TABLE `layoutfriendlyurl` DISABLE KEYS */;
INSERT INTO `layoutfriendlyurl` VALUES ('db0f1a97-7661-4944-ad41-88473d5506e7',20177,20173,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20176,1,'/manage','en_US'),('f5202c19-2f68-4e74-a85e-b76fa70a331f',20186,20182,20155,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',20185,0,'/home','en_US'),('60cd845c-6306-4512-99fa-72bb592cc85a',20321,20317,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',20320,1,'/layout','en_US'),('8c3bacfd-fb96-4ed1-b7e1-7fe9926a2e8b',20333,20329,20155,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:15',20332,1,'/layout','en_US'),('3d358702-9112-41c9-9c0a-eaaf8b50f700',20343,20339,20155,20159,'','2016-05-04 07:40:17','2016-05-04 07:40:17',20342,1,'/layout','en_US'),('a6fedf2a-d6cf-4fb8-ac20-810dffa5a303',20362,20350,20155,20159,'','2016-05-04 07:40:19','2016-05-04 07:40:19',20361,1,'/home','en_US'),('b6620922-5925-438f-9db6-15b5c815078c',20370,20350,20155,20159,'','2016-05-04 07:40:20','2016-05-04 07:40:20',20369,1,'/wiki','en_US'),('b0750703-76ef-480a-9059-1ad32abe6e90',20388,20376,20155,20159,'','2016-05-04 07:40:22','2016-05-04 07:40:22',20387,1,'/home','en_US'),('48d97964-4cd2-4994-badb-d92a756ad293',20397,20376,20155,20159,'','2016-05-04 07:40:23','2016-05-04 07:40:23',20396,1,'/documents','en_US'),('8a384370-a2c2-442a-be60-cbfaf5091039',20405,20376,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20404,1,'/news','en_US'),('65094b6c-50be-4f07-be55-3eb7631705c0',20604,20182,20155,20159,'','2016-05-04 07:47:29','2016-05-04 07:47:29',20185,0,'/inicio','es_ES'),('0d92137d-980b-4cfc-b171-679fb1a2cddf',20629,20623,20155,20199,'Test Test','2016-05-04 07:51:12','2016-05-04 07:51:12',20628,1,'/solicitud-de-reclutamiento','es_ES'),('d11b684a-6ef8-417c-8591-ceb966ae8159',20635,20623,20155,20199,'Test Test','2016-05-04 07:51:25','2016-05-04 07:51:25',20634,1,'/evaluar-requerimiento-recurso','es_ES'),('2c311019-cb1c-45b0-a0d8-5a694ac7c6b4',25802,20623,20155,20199,'Test Test','2016-06-06 03:27:18','2016-06-06 03:27:18',25801,1,'/evaluar-ficha-de-ingreso','es_ES'),('112a8549-fdb3-4c94-85b8-fa6d72b2d794',25904,20623,20155,20199,'Test Test','2016-06-06 03:32:19','2016-06-06 03:32:19',25903,1,'/programar-entrevista','es_ES'),('4a123965-512d-4477-ab25-616f10965b7a',25910,20623,20155,20199,'Test Test','2016-06-06 03:33:36','2016-06-06 03:33:36',25909,1,'/publicar-oferta','es_ES'),('acd58a22-6414-47b2-93ba-a2290216fbf1',25916,20623,20155,20199,'Test Test','2016-06-06 03:34:06','2016-06-06 03:34:06',25915,1,'/registrar-resultados-de-entrevista','es_ES'),('d6542989-48f4-434b-8981-03c9b86bb977',25922,20623,20155,20199,'Test Test','2016-06-06 03:35:09','2016-06-06 03:35:09',25921,1,'/seleccionar-personal','es_ES'),('c81be5db-7f02-4da3-a0c9-78fb923fe60f',27117,27103,20155,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19',27116,1,'/home','es_ES'),('f103c1b9-726b-41e1-90c9-2f5f0d8a1b06',30406,20534,20155,20159,'','2016-08-17 07:02:22','2016-08-17 07:02:22',30405,1,'/home','es_ES');
/*!40000 ALTER TABLE `layoutfriendlyurl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutprototype`
--

DROP TABLE IF EXISTS `layoutprototype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutprototype` (
  `uuid_` varchar(75) DEFAULT NULL,
  `layoutPrototypeId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `settings_` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`layoutPrototypeId`),
  KEY `IX_30616AAA` (`companyId`),
  KEY `IX_557A639F` (`companyId`,`active_`),
  KEY `IX_CEF72136` (`uuid_`),
  KEY `IX_63ED2532` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutprototype`
--

LOCK TABLES `layoutprototype` WRITE;
/*!40000 ALTER TABLE `layoutprototype` DISABLE KEYS */;
INSERT INTO `layoutprototype` VALUES ('66c28989-961f-4950-966e-93157ee1a42f',20316,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Blog</Name></root>','Create, edit, and view blogs from this page. Explore topics using tags, and connect with other members that blog.','',1),('495c273e-e821-4060-ac2b-064ba2703a92',20328,20155,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:15','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Content Display Page</Name></root>','Create, edit, and explore web content with this page. Search available content, explore related content with tags, and browse content categories.','',1),('c5515afd-f3a8-49a5-8f4f-3a6253863f54',20338,20155,20159,'','2016-05-04 07:40:16','2016-05-04 07:40:16','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Wiki</Name></root>','Collaborate with members through the wiki on this page. Discover related content through tags, and navigate quickly and easily with categories.','',1);
/*!40000 ALTER TABLE `layoutprototype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutrevision`
--

DROP TABLE IF EXISTS `layoutrevision`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutrevision` (
  `layoutRevisionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `layoutSetBranchId` bigint(20) DEFAULT NULL,
  `layoutBranchId` bigint(20) DEFAULT NULL,
  `parentLayoutRevisionId` bigint(20) DEFAULT NULL,
  `head` tinyint(4) DEFAULT NULL,
  `major` tinyint(4) DEFAULT NULL,
  `plid` bigint(20) DEFAULT NULL,
  `privateLayout` tinyint(4) DEFAULT NULL,
  `name` longtext,
  `title` longtext,
  `description` longtext,
  `keywords` longtext,
  `robots` longtext,
  `typeSettings` longtext,
  `iconImage` tinyint(4) DEFAULT NULL,
  `iconImageId` bigint(20) DEFAULT NULL,
  `themeId` varchar(75) DEFAULT NULL,
  `colorSchemeId` varchar(75) DEFAULT NULL,
  `wapThemeId` varchar(75) DEFAULT NULL,
  `wapColorSchemeId` varchar(75) DEFAULT NULL,
  `css` longtext,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`layoutRevisionId`),
  KEY `IX_43E8286A` (`head`,`plid`),
  KEY `IX_314B621A` (`layoutSetBranchId`),
  KEY `IX_A9AC086E` (`layoutSetBranchId`,`head`),
  KEY `IX_E10AC39` (`layoutSetBranchId`,`head`,`plid`),
  KEY `IX_13984800` (`layoutSetBranchId`,`layoutBranchId`,`plid`),
  KEY `IX_4A84AF43` (`layoutSetBranchId`,`parentLayoutRevisionId`,`plid`),
  KEY `IX_B7B914E5` (`layoutSetBranchId`,`plid`),
  KEY `IX_70DA9ECB` (`layoutSetBranchId`,`plid`,`status`),
  KEY `IX_7FFAE700` (`layoutSetBranchId`,`status`),
  KEY `IX_9329C9D6` (`plid`),
  KEY `IX_8EC3D2BC` (`plid`,`status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutrevision`
--

LOCK TABLES `layoutrevision` WRITE;
/*!40000 ALTER TABLE `layoutrevision` DISABLE KEYS */;
/*!40000 ALTER TABLE `layoutrevision` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutset`
--

DROP TABLE IF EXISTS `layoutset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutset` (
  `layoutSetId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `privateLayout` tinyint(4) DEFAULT NULL,
  `logo` tinyint(4) DEFAULT NULL,
  `logoId` bigint(20) DEFAULT NULL,
  `themeId` varchar(75) DEFAULT NULL,
  `colorSchemeId` varchar(75) DEFAULT NULL,
  `wapThemeId` varchar(75) DEFAULT NULL,
  `wapColorSchemeId` varchar(75) DEFAULT NULL,
  `css` longtext,
  `pageCount` int(11) DEFAULT NULL,
  `settings_` longtext,
  `layoutSetPrototypeUuid` varchar(75) DEFAULT NULL,
  `layoutSetPrototypeLinkEnabled` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`layoutSetId`),
  UNIQUE KEY `IX_48550691` (`groupId`,`privateLayout`),
  KEY `IX_A40B8BEC` (`groupId`),
  KEY `IX_72BBA8B7` (`layoutSetPrototypeUuid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutset`
--

LOCK TABLES `layoutset` WRITE;
/*!40000 ALTER TABLE `layoutset` DISABLE KEYS */;
INSERT INTO `layoutset` VALUES (20174,20173,20155,'2016-05-04 07:40:10','2016-05-04 07:40:10',1,0,0,'classic','01','mobile','01','',1,'','',0),(20175,20173,20155,'2016-05-04 07:40:10','2016-05-04 07:40:10',0,0,0,'classic','01','mobile','01','',0,'','',0),(20183,20182,20155,'2016-05-04 07:40:11','2016-05-04 07:48:50',1,0,0,'classic','01','mobile','01','',0,'','',0),(20184,20182,20155,'2016-05-04 07:40:11','2016-06-18 05:25:48',0,0,0,'nuevoTema_WAR_nuevoTematheme','01','mobile','01','',1,'showSiteName=true\n','',0),(20193,20192,20155,'2016-05-04 07:40:11','2016-05-04 07:40:11',1,0,0,'classic','01','mobile','01','',0,'','',0),(20194,20192,20155,'2016-05-04 07:40:11','2016-05-04 07:40:11',0,0,0,'classic','01','mobile','01','',0,'','',0),(20196,20195,20155,'2016-05-04 07:40:11','2016-05-04 07:40:11',1,0,0,'classic','01','mobile','01','',0,'','',0),(20197,20195,20155,'2016-05-04 07:40:11','2016-05-04 07:40:11',0,0,0,'classic','01','mobile','01','',0,'','',0),(20202,20201,20155,'2016-05-04 07:40:11','2016-05-04 07:44:45',1,0,0,'classic','01','mobile','01','',0,'','',0),(20203,20201,20155,'2016-05-04 07:40:11','2016-05-04 07:44:45',0,0,0,'classic','01','mobile','01','',0,'','',0),(20318,20317,20155,'2016-05-04 07:40:14','2016-05-04 07:40:14',1,0,0,'classic','01','mobile','01','',1,'','',0),(20319,20317,20155,'2016-05-04 07:40:14','2016-05-04 07:40:14',0,0,0,'classic','01','mobile','01','',0,'','',0),(20330,20329,20155,'2016-05-04 07:40:15','2016-05-04 07:40:15',1,0,0,'classic','01','mobile','01','',1,'','',0),(20331,20329,20155,'2016-05-04 07:40:15','2016-05-04 07:40:15',0,0,0,'classic','01','mobile','01','',0,'','',0),(20340,20339,20155,'2016-05-04 07:40:16','2016-05-04 07:40:17',1,0,0,'classic','01','mobile','01','',1,'','',0),(20341,20339,20155,'2016-05-04 07:40:16','2016-05-04 07:40:16',0,0,0,'classic','01','mobile','01','',0,'','',0),(20351,20350,20155,'2016-05-04 07:40:18','2016-05-04 07:40:21',1,0,0,'classic','01','mobile','01','',2,'','',0),(20352,20350,20155,'2016-05-04 07:40:18','2016-05-04 07:40:18',0,0,0,'classic','01','mobile','01','',0,'','',0),(20377,20376,20155,'2016-05-04 07:40:21','2016-05-04 07:40:24',1,0,0,'classic','01','mobile','01','',3,'','',0),(20378,20376,20155,'2016-05-04 07:40:21','2016-05-04 07:40:21',0,0,0,'classic','01','mobile','01','',0,'','',0),(20535,20534,20155,'2016-05-04 07:43:35','2016-08-17 07:02:22',1,0,0,'classic','01','mobile','01','',1,'','',0),(20536,20534,20155,'2016-05-04 07:43:35','2016-08-17 07:02:21',0,0,0,'classic','01','mobile','01','',0,'','',0),(20624,20623,20155,'2016-05-04 07:50:27','2016-06-06 03:35:09',1,0,0,'revTheme_WAR_revtheme','01','mobile','01','',7,'lfr-theme:regular:logo-menu-direction=right-left\nlfr-theme:regular:navigation=left\nlfr-theme:regular:portlet-setup-show-borders-default=true\nshowSiteName=true\n','',0),(20625,20623,20155,'2016-05-04 07:50:27','2016-05-04 07:50:27',0,0,0,'classic','01','mobile','01','',0,'','',0),(20905,20904,20155,'2016-05-04 08:14:46','2016-05-04 08:14:46',1,0,0,'classic','01','mobile','01','',0,'','',0),(20906,20904,20155,'2016-05-04 08:14:46','2016-05-04 08:14:46',0,0,0,'classic','01','mobile','01','',0,'','',0),(21814,21813,20155,'2016-05-07 04:11:11','2016-05-07 04:11:11',1,0,0,'classic','01','mobile','01','',0,'','',0),(21815,21813,20155,'2016-05-07 04:11:11','2016-05-07 04:11:11',0,0,0,'classic','01','mobile','01','',0,'','',0),(22205,22204,20155,'2016-05-07 06:40:23','2016-05-07 06:40:23',1,0,0,'classic','01','mobile','01','',0,'','',0),(22206,22204,20155,'2016-05-07 06:40:23','2016-05-07 06:40:23',0,0,0,'classic','01','mobile','01','',0,'','',0),(22215,22214,20155,'2016-05-07 06:42:04','2016-05-07 06:42:04',1,0,0,'classic','01','mobile','01','',0,'','',0),(22216,22214,20155,'2016-05-07 06:42:04','2016-05-07 06:42:04',0,0,0,'classic','01','mobile','01','',0,'','',0),(22224,22223,20155,'2016-05-07 06:43:06','2016-05-07 06:43:06',1,0,0,'classic','01','mobile','01','',0,'','',0),(22225,22223,20155,'2016-05-07 06:43:06','2016-05-07 06:43:06',0,0,0,'classic','01','mobile','01','',0,'','',0),(22233,22232,20155,'2016-05-07 06:48:14','2016-05-07 06:48:14',1,0,0,'classic','01','mobile','01','',0,'','',0),(22234,22232,20155,'2016-05-07 06:48:14','2016-05-07 06:48:14',0,0,0,'classic','01','mobile','01','',0,'','',0),(22242,22241,20155,'2016-05-07 06:56:39','2016-05-07 06:56:39',1,0,0,'classic','01','mobile','01','',0,'','',0),(22243,22241,20155,'2016-05-07 06:56:39','2016-05-07 06:56:39',0,0,0,'classic','01','mobile','01','',0,'','',0),(22251,22250,20155,'2016-05-07 06:58:08','2016-05-07 06:58:08',1,0,0,'classic','01','mobile','01','',0,'','',0),(22252,22250,20155,'2016-05-07 06:58:08','2016-05-07 06:58:08',0,0,0,'classic','01','mobile','01','',0,'','',0),(22260,22259,20155,'2016-05-07 07:05:11','2016-05-07 07:05:11',1,0,0,'classic','01','mobile','01','',0,'','',0),(22261,22259,20155,'2016-05-07 07:05:11','2016-05-07 07:05:11',0,0,0,'classic','01','mobile','01','',0,'','',0),(27104,27103,20155,'2016-06-18 05:23:19','2016-06-18 05:23:19',1,0,0,'nuevoTema_WAR_nuevoTematheme','01','mobile','01','',1,'','',0),(27105,27103,20155,'2016-06-18 05:23:19','2016-06-18 05:23:19',0,0,0,'nuevoTema_WAR_nuevoTematheme','01','mobile','01','',0,'','',0);
/*!40000 ALTER TABLE `layoutset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutsetbranch`
--

DROP TABLE IF EXISTS `layoutsetbranch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutsetbranch` (
  `layoutSetBranchId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `privateLayout` tinyint(4) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `master` tinyint(4) DEFAULT NULL,
  `logo` tinyint(4) DEFAULT NULL,
  `logoId` bigint(20) DEFAULT NULL,
  `themeId` varchar(75) DEFAULT NULL,
  `colorSchemeId` varchar(75) DEFAULT NULL,
  `wapThemeId` varchar(75) DEFAULT NULL,
  `wapColorSchemeId` varchar(75) DEFAULT NULL,
  `css` longtext,
  `settings_` longtext,
  `layoutSetPrototypeUuid` varchar(75) DEFAULT NULL,
  `layoutSetPrototypeLinkEnabled` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`layoutSetBranchId`),
  UNIQUE KEY `IX_5FF18552` (`groupId`,`privateLayout`,`name`),
  KEY `IX_8FF5D6EA` (`groupId`),
  KEY `IX_C4079FD3` (`groupId`,`privateLayout`),
  KEY `IX_CCF0DA29` (`groupId`,`privateLayout`,`master`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutsetbranch`
--

LOCK TABLES `layoutsetbranch` WRITE;
/*!40000 ALTER TABLE `layoutsetbranch` DISABLE KEYS */;
/*!40000 ALTER TABLE `layoutsetbranch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `layoutsetprototype`
--

DROP TABLE IF EXISTS `layoutsetprototype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `layoutsetprototype` (
  `uuid_` varchar(75) DEFAULT NULL,
  `layoutSetPrototypeId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `settings_` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`layoutSetPrototypeId`),
  KEY `IX_55F63D98` (`companyId`),
  KEY `IX_9178FC71` (`companyId`,`active_`),
  KEY `IX_C5D69B24` (`uuid_`),
  KEY `IX_D9FFCA84` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `layoutsetprototype`
--

LOCK TABLES `layoutsetprototype` WRITE;
/*!40000 ALTER TABLE `layoutsetprototype` DISABLE KEYS */;
INSERT INTO `layoutsetprototype` VALUES ('c35021ab-4caf-44c7-bfe9-f327d15684fc',20349,20155,20159,'','2016-05-04 07:40:18','2016-05-04 07:40:21','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Community Site</Name></root>','Site with Forums and Wiki','layoutsUpdateable=true\n',1),('395b5783-2ca3-4256-995b-f4ade7824f9d',20375,20155,20159,'','2016-05-04 07:40:21','2016-05-04 07:40:24','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Intranet Site</Name></root>','Site with Documents and News','layoutsUpdateable=true\n',1),('745bf2b8-70d1-414d-939b-40a9c6a99c0b',20533,20155,20159,'','2016-05-04 07:43:35','2016-08-17 07:02:22','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Rev Theme</Name></root>','','layoutsUpdateable=true\n',1),('d93bfcdf-9787-460a-af6f-7e55881f92e0',27102,20155,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Nuevotema Theme</Name></root>','','layoutsUpdateable=true\n',1);
/*!40000 ALTER TABLE `layoutsetprototype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `listtype`
--

DROP TABLE IF EXISTS `listtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `listtype` (
  `listTypeId` int(11) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`listTypeId`),
  KEY `IX_2932DD37` (`type_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `listtype`
--

LOCK TABLES `listtype` WRITE;
/*!40000 ALTER TABLE `listtype` DISABLE KEYS */;
INSERT INTO `listtype` VALUES (10000,'billing','com.liferay.portal.model.Account.address'),(10001,'other','com.liferay.portal.model.Account.address'),(10002,'p-o-box','com.liferay.portal.model.Account.address'),(10003,'shipping','com.liferay.portal.model.Account.address'),(10004,'email-address','com.liferay.portal.model.Account.emailAddress'),(10005,'email-address-2','com.liferay.portal.model.Account.emailAddress'),(10006,'email-address-3','com.liferay.portal.model.Account.emailAddress'),(10007,'fax','com.liferay.portal.model.Account.phone'),(10008,'local','com.liferay.portal.model.Account.phone'),(10009,'other','com.liferay.portal.model.Account.phone'),(10010,'toll-free','com.liferay.portal.model.Account.phone'),(10011,'tty','com.liferay.portal.model.Account.phone'),(10012,'intranet','com.liferay.portal.model.Account.website'),(10013,'public','com.liferay.portal.model.Account.website'),(11000,'business','com.liferay.portal.model.Contact.address'),(11001,'other','com.liferay.portal.model.Contact.address'),(11002,'personal','com.liferay.portal.model.Contact.address'),(11003,'email-address','com.liferay.portal.model.Contact.emailAddress'),(11004,'email-address-2','com.liferay.portal.model.Contact.emailAddress'),(11005,'email-address-3','com.liferay.portal.model.Contact.emailAddress'),(11006,'business','com.liferay.portal.model.Contact.phone'),(11007,'business-fax','com.liferay.portal.model.Contact.phone'),(11008,'mobile-phone','com.liferay.portal.model.Contact.phone'),(11009,'other','com.liferay.portal.model.Contact.phone'),(11010,'pager','com.liferay.portal.model.Contact.phone'),(11011,'personal','com.liferay.portal.model.Contact.phone'),(11012,'personal-fax','com.liferay.portal.model.Contact.phone'),(11013,'tty','com.liferay.portal.model.Contact.phone'),(11014,'dr','com.liferay.portal.model.Contact.prefix'),(11015,'mr','com.liferay.portal.model.Contact.prefix'),(11016,'mrs','com.liferay.portal.model.Contact.prefix'),(11017,'ms','com.liferay.portal.model.Contact.prefix'),(11020,'ii','com.liferay.portal.model.Contact.suffix'),(11021,'iii','com.liferay.portal.model.Contact.suffix'),(11022,'iv','com.liferay.portal.model.Contact.suffix'),(11023,'jr','com.liferay.portal.model.Contact.suffix'),(11024,'phd','com.liferay.portal.model.Contact.suffix'),(11025,'sr','com.liferay.portal.model.Contact.suffix'),(11026,'blog','com.liferay.portal.model.Contact.website'),(11027,'business','com.liferay.portal.model.Contact.website'),(11028,'other','com.liferay.portal.model.Contact.website'),(11029,'personal','com.liferay.portal.model.Contact.website'),(12000,'billing','com.liferay.portal.model.Organization.address'),(12001,'other','com.liferay.portal.model.Organization.address'),(12002,'p-o-box','com.liferay.portal.model.Organization.address'),(12003,'shipping','com.liferay.portal.model.Organization.address'),(12004,'email-address','com.liferay.portal.model.Organization.emailAddress'),(12005,'email-address-2','com.liferay.portal.model.Organization.emailAddress'),(12006,'email-address-3','com.liferay.portal.model.Organization.emailAddress'),(12007,'fax','com.liferay.portal.model.Organization.phone'),(12008,'local','com.liferay.portal.model.Organization.phone'),(12009,'other','com.liferay.portal.model.Organization.phone'),(12010,'toll-free','com.liferay.portal.model.Organization.phone'),(12011,'tty','com.liferay.portal.model.Organization.phone'),(12012,'administrative','com.liferay.portal.model.Organization.service'),(12013,'contracts','com.liferay.portal.model.Organization.service'),(12014,'donation','com.liferay.portal.model.Organization.service'),(12015,'retail','com.liferay.portal.model.Organization.service'),(12016,'training','com.liferay.portal.model.Organization.service'),(12017,'full-member','com.liferay.portal.model.Organization.status'),(12018,'provisional-member','com.liferay.portal.model.Organization.status'),(12019,'intranet','com.liferay.portal.model.Organization.website'),(12020,'public','com.liferay.portal.model.Organization.website');
/*!40000 ALTER TABLE `listtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lock_`
--

DROP TABLE IF EXISTS `lock_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lock_` (
  `uuid_` varchar(75) DEFAULT NULL,
  `lockId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `className` varchar(75) DEFAULT NULL,
  `key_` varchar(200) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `inheritable` tinyint(4) DEFAULT NULL,
  `expirationDate` datetime DEFAULT NULL,
  PRIMARY KEY (`lockId`),
  UNIQUE KEY `IX_228562AD` (`className`,`key_`),
  KEY `IX_E3F1286B` (`expirationDate`),
  KEY `IX_13C5CD3A` (`uuid_`),
  KEY `IX_2C418EAE` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lock_`
--

LOCK TABLES `lock_` WRITE;
/*!40000 ALTER TABLE `lock_` DISABLE KEYS */;
/*!40000 ALTER TABLE `lock_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logoperaciones`
--

DROP TABLE IF EXISTS `logoperaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logoperaciones` (
  `logOperacionesId` bigint(20) NOT NULL,
  `tipoActividad` bigint(20) DEFAULT NULL,
  `actividad` varchar(75) DEFAULT NULL,
  `usuario` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`logOperacionesId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logoperaciones`
--

LOCK TABLES `logoperaciones` WRITE;
/*!40000 ALTER TABLE `logoperaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `logoperaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marketplace_app`
--

DROP TABLE IF EXISTS `marketplace_app`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marketplace_app` (
  `uuid_` varchar(75) DEFAULT NULL,
  `appId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `remoteAppId` bigint(20) DEFAULT NULL,
  `title` varchar(75) DEFAULT NULL,
  `description` longtext,
  `category` varchar(75) DEFAULT NULL,
  `iconURL` longtext,
  `version` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`appId`),
  KEY `IX_94A7EF25` (`category`),
  KEY `IX_865B7BD5` (`companyId`),
  KEY `IX_20F14D93` (`remoteAppId`),
  KEY `IX_3E667FE1` (`uuid_`),
  KEY `IX_A7807DA7` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marketplace_app`
--

LOCK TABLES `marketplace_app` WRITE;
/*!40000 ALTER TABLE `marketplace_app` DISABLE KEYS */;
/*!40000 ALTER TABLE `marketplace_app` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marketplace_module`
--

DROP TABLE IF EXISTS `marketplace_module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `marketplace_module` (
  `uuid_` varchar(75) DEFAULT NULL,
  `moduleId` bigint(20) NOT NULL,
  `appId` bigint(20) DEFAULT NULL,
  `bundleSymbolicName` varchar(500) DEFAULT NULL,
  `bundleVersion` varchar(75) DEFAULT NULL,
  `contextName` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`moduleId`),
  KEY `IX_7DC16D26` (`appId`),
  KEY `IX_5848F52D` (`appId`,`bundleSymbolicName`,`bundleVersion`),
  KEY `IX_C6938724` (`appId`,`contextName`),
  KEY `IX_DD03D499` (`bundleSymbolicName`),
  KEY `IX_F2F1E964` (`contextName`),
  KEY `IX_A7EFD80E` (`uuid_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marketplace_module`
--

LOCK TABLES `marketplace_module` WRITE;
/*!40000 ALTER TABLE `marketplace_module` DISABLE KEYS */;
/*!40000 ALTER TABLE `marketplace_module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbban`
--

DROP TABLE IF EXISTS `mbban`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbban` (
  `uuid_` varchar(75) DEFAULT NULL,
  `banId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `banUserId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`banId`),
  UNIQUE KEY `IX_8ABC4E3B` (`groupId`,`banUserId`),
  UNIQUE KEY `IX_2A3B68F6` (`uuid_`,`groupId`),
  KEY `IX_69951A25` (`banUserId`),
  KEY `IX_5C3FF12A` (`groupId`),
  KEY `IX_48814BBA` (`userId`),
  KEY `IX_8A13C634` (`uuid_`),
  KEY `IX_4F841574` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbban`
--

LOCK TABLES `mbban` WRITE;
/*!40000 ALTER TABLE `mbban` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbban` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbcategory`
--

DROP TABLE IF EXISTS `mbcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbcategory` (
  `uuid_` varchar(75) DEFAULT NULL,
  `categoryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentCategoryId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `displayStyle` varchar(75) DEFAULT NULL,
  `threadCount` int(11) DEFAULT NULL,
  `messageCount` int(11) DEFAULT NULL,
  `lastPostDate` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`categoryId`),
  UNIQUE KEY `IX_F7D28C2F` (`uuid_`,`groupId`),
  KEY `IX_BC735DCF` (`companyId`),
  KEY `IX_E15A5DB5` (`companyId`,`status`),
  KEY `IX_BB870C11` (`groupId`),
  KEY `IX_ED292508` (`groupId`,`parentCategoryId`),
  KEY `IX_C295DBEE` (`groupId`,`parentCategoryId`,`status`),
  KEY `IX_DA84A9F7` (`groupId`,`status`),
  KEY `IX_C2626EDB` (`uuid_`),
  KEY `IX_13DF4E6D` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbcategory`
--

LOCK TABLES `mbcategory` WRITE;
/*!40000 ALTER TABLE `mbcategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbdiscussion`
--

DROP TABLE IF EXISTS `mbdiscussion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbdiscussion` (
  `uuid_` varchar(75) DEFAULT NULL,
  `discussionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `threadId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`discussionId`),
  UNIQUE KEY `IX_33A4DE38` (`classNameId`,`classPK`),
  UNIQUE KEY `IX_B5CA2DC` (`threadId`),
  UNIQUE KEY `IX_F7AAC799` (`uuid_`,`groupId`),
  KEY `IX_79D0120B` (`classNameId`),
  KEY `IX_5477D431` (`uuid_`),
  KEY `IX_7E965757` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbdiscussion`
--

LOCK TABLES `mbdiscussion` WRITE;
/*!40000 ALTER TABLE `mbdiscussion` DISABLE KEYS */;
INSERT INTO `mbdiscussion` VALUES ('9dd75eee-9fa4-4e15-a510-dabb1d14c69e',20181,0,0,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',20002,20176,20179),('a337cd62-75fb-44f1-ae97-a80d7d2cbf7f',20190,0,0,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',20002,20185,20188),('ee1b29c4-9418-4928-a4cd-b1185dd18d35',20326,0,0,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',20002,20320,20323),('24478220-e8e7-4716-aa89-489e2f34e9e9',20337,0,0,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:15',20002,20332,20335),('5a86c083-7bdd-4ea1-af02-a5b958bde988',20347,0,0,20159,'','2016-05-04 07:40:17','2016-05-04 07:40:17',20002,20342,20345),('874559bf-13aa-4bc0-a450-78c4aa5235e8',20366,0,0,20159,'','2016-05-04 07:40:19','2016-05-04 07:40:19',20002,20361,20364),('99070eae-baed-44a3-8f78-5d00d749a484',20374,0,0,20159,'','2016-05-04 07:40:20','2016-05-04 07:40:20',20002,20369,20372),('13933ea8-f2d3-4e91-8d3a-e2016a8c1410',20392,0,0,20159,'','2016-05-04 07:40:22','2016-05-04 07:40:22',20002,20387,20390),('af52479c-9d92-4db5-ad3d-96db8f6f8ab4',20401,0,0,20159,'','2016-05-04 07:40:23','2016-05-04 07:40:23',20002,20396,20399),('fcfa55ea-9eb1-4984-bec6-3557244b46c6',20409,0,0,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20002,20404,20407),('84346b5e-5960-482a-8929-e316fb561702',20633,0,0,20199,'Test Test','2016-05-04 07:51:12','2016-05-04 07:51:12',20002,20628,20631),('80cbead8-6a4a-41f5-bf13-315d2866a6d0',20639,0,0,20199,'Test Test','2016-05-04 07:51:25','2016-05-04 07:51:25',20002,20634,20637),('665cc163-a639-414c-b04f-fd331973debe',25806,0,0,20199,'Test Test','2016-06-06 03:27:18','2016-06-06 03:27:18',20002,25801,25804),('88e4303b-ddb6-4c58-bb06-f6260797fa88',25908,0,0,20199,'Test Test','2016-06-06 03:32:19','2016-06-06 03:32:19',20002,25903,25906),('cfc25b87-3440-4cfe-926f-e46fef67d945',25914,0,0,20199,'Test Test','2016-06-06 03:33:36','2016-06-06 03:33:36',20002,25909,25912),('1682f8ae-9cb8-4acb-acb7-56c05b4c9990',25920,0,0,20199,'Test Test','2016-06-06 03:34:06','2016-06-06 03:34:06',20002,25915,25918),('4214a021-db18-4882-9d02-9e57948ba453',25926,0,0,20199,'Test Test','2016-06-06 03:35:09','2016-06-06 03:35:09',20002,25921,25924),('a9c95ba0-a7b0-431e-a1d5-bb41f751bf61',27121,0,0,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19',20002,27116,27119),('5c8fd8f7-2c03-4014-adf2-f29ef2831414',27139,0,0,20199,'Test Test','2016-06-18 05:51:03','2016-06-18 05:51:03',20109,27132,27137),('4d6bf790-22ab-4044-89c4-5aa661f89672',30410,0,0,20159,'','2016-08-17 07:02:22','2016-08-17 07:02:22',20002,30405,30408);
/*!40000 ALTER TABLE `mbdiscussion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbmailinglist`
--

DROP TABLE IF EXISTS `mbmailinglist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbmailinglist` (
  `uuid_` varchar(75) DEFAULT NULL,
  `mailingListId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `categoryId` bigint(20) DEFAULT NULL,
  `emailAddress` varchar(75) DEFAULT NULL,
  `inProtocol` varchar(75) DEFAULT NULL,
  `inServerName` varchar(75) DEFAULT NULL,
  `inServerPort` int(11) DEFAULT NULL,
  `inUseSSL` tinyint(4) DEFAULT NULL,
  `inUserName` varchar(75) DEFAULT NULL,
  `inPassword` varchar(75) DEFAULT NULL,
  `inReadInterval` int(11) DEFAULT NULL,
  `outEmailAddress` varchar(75) DEFAULT NULL,
  `outCustom` tinyint(4) DEFAULT NULL,
  `outServerName` varchar(75) DEFAULT NULL,
  `outServerPort` int(11) DEFAULT NULL,
  `outUseSSL` tinyint(4) DEFAULT NULL,
  `outUserName` varchar(75) DEFAULT NULL,
  `outPassword` varchar(75) DEFAULT NULL,
  `allowAnonymous` tinyint(4) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`mailingListId`),
  UNIQUE KEY `IX_76CE9CDD` (`groupId`,`categoryId`),
  UNIQUE KEY `IX_E858F170` (`uuid_`,`groupId`),
  KEY `IX_BFEB984F` (`active_`),
  KEY `IX_4115EC7A` (`uuid_`),
  KEY `IX_FC61676E` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbmailinglist`
--

LOCK TABLES `mbmailinglist` WRITE;
/*!40000 ALTER TABLE `mbmailinglist` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbmailinglist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbmessage`
--

DROP TABLE IF EXISTS `mbmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbmessage` (
  `uuid_` varchar(75) DEFAULT NULL,
  `messageId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `categoryId` bigint(20) DEFAULT NULL,
  `threadId` bigint(20) DEFAULT NULL,
  `rootMessageId` bigint(20) DEFAULT NULL,
  `parentMessageId` bigint(20) DEFAULT NULL,
  `subject` varchar(75) DEFAULT NULL,
  `body` longtext,
  `format` varchar(75) DEFAULT NULL,
  `anonymous` tinyint(4) DEFAULT NULL,
  `priority` double DEFAULT NULL,
  `allowPingbacks` tinyint(4) DEFAULT NULL,
  `answer` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`messageId`),
  UNIQUE KEY `IX_8D12316E` (`uuid_`,`groupId`),
  KEY `IX_51A8D44D` (`classNameId`,`classPK`),
  KEY `IX_F6687633` (`classNameId`,`classPK`,`status`),
  KEY `IX_B1432D30` (`companyId`),
  KEY `IX_1AD93C16` (`companyId`,`status`),
  KEY `IX_5B153FB2` (`groupId`),
  KEY `IX_1073AB9F` (`groupId`,`categoryId`),
  KEY `IX_4257DB85` (`groupId`,`categoryId`,`status`),
  KEY `IX_B674AB58` (`groupId`,`categoryId`,`threadId`),
  KEY `IX_CBFDBF0A` (`groupId`,`categoryId`,`threadId`,`answer`),
  KEY `IX_385E123E` (`groupId`,`categoryId`,`threadId`,`status`),
  KEY `IX_ED39AC98` (`groupId`,`status`),
  KEY `IX_8EB8C5EC` (`groupId`,`userId`),
  KEY `IX_377858D2` (`groupId`,`userId`,`status`),
  KEY `IX_75B95071` (`threadId`),
  KEY `IX_9D7C3B23` (`threadId`,`answer`),
  KEY `IX_A7038CD7` (`threadId`,`parentMessageId`),
  KEY `IX_9DC8E57` (`threadId`,`status`),
  KEY `IX_7A040C32` (`userId`),
  KEY `IX_59F9CE5C` (`userId`,`classNameId`),
  KEY `IX_ABEB6D07` (`userId`,`classNameId`,`classPK`),
  KEY `IX_4A4BB4ED` (`userId`,`classNameId`,`classPK`,`status`),
  KEY `IX_3321F142` (`userId`,`classNameId`,`status`),
  KEY `IX_C57B16BC` (`uuid_`),
  KEY `IX_57CA9FEC` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbmessage`
--

LOCK TABLES `mbmessage` WRITE;
/*!40000 ALTER TABLE `mbmessage` DISABLE KEYS */;
INSERT INTO `mbmessage` VALUES ('ff1bbe5e-5387-4dc9-a01f-e768d3aff8cb',20178,20173,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20002,20176,-1,20179,20178,0,'20176','20176','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:10'),('9a8ebe2d-29bd-46f9-8cec-42a44ce1ca37',20187,20182,20155,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',20002,20185,-1,20188,20187,0,'20185','20185','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:11'),('fd146ec8-9aa9-4d85-85d7-2fc6db8a2c0b',20322,20317,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',20002,20320,-1,20323,20322,0,'20320','20320','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:14'),('3fd15f6f-42e4-437f-b5bd-10bf1cbaf5df',20334,20329,20155,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:15',20002,20332,-1,20335,20334,0,'20332','20332','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:15'),('40ee0181-7c2d-455c-a20d-4019292fa485',20344,20339,20155,20159,'','2016-05-04 07:40:17','2016-05-04 07:40:17',20002,20342,-1,20345,20344,0,'20342','20342','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:17'),('208d6189-d808-41a7-b637-0ec0efcfa838',20363,20350,20155,20159,'','2016-05-04 07:40:19','2016-05-04 07:40:19',20002,20361,-1,20364,20363,0,'20361','20361','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:19'),('529518ec-6fe3-4d7c-9ad8-e489a2703d50',20371,20350,20155,20159,'','2016-05-04 07:40:20','2016-05-04 07:40:20',20002,20369,-1,20372,20371,0,'20369','20369','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:20'),('f8c21351-da8d-4866-abd1-ef6d4f07cefd',20389,20376,20155,20159,'','2016-05-04 07:40:22','2016-05-04 07:40:22',20002,20387,-1,20390,20389,0,'20387','20387','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:22'),('45963235-87f0-4905-ab1f-1a595e7b8b90',20398,20376,20155,20159,'','2016-05-04 07:40:23','2016-05-04 07:40:23',20002,20396,-1,20399,20398,0,'20396','20396','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:23'),('e0a321a2-60a0-421b-b368-f65517cc3efa',20406,20376,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',20002,20404,-1,20407,20406,0,'20404','20404','bbcode',1,0,0,0,0,20159,'','2016-05-04 07:40:24'),('f2c7f0fb-8fa0-49a2-b471-92e98b701ec8',20630,20623,20155,20199,'Test Test','2016-05-04 07:51:12','2016-05-04 07:51:12',20002,20628,-1,20631,20630,0,'20628','20628','bbcode',0,0,0,0,0,20199,'Test Test','2016-05-04 07:51:12'),('ae12df55-1391-4c37-bcff-688041db57c8',20636,20623,20155,20199,'Test Test','2016-05-04 07:51:25','2016-05-04 07:51:25',20002,20634,-1,20637,20636,0,'20634','20634','bbcode',0,0,0,0,0,20199,'Test Test','2016-05-04 07:51:25'),('2d6126cf-3072-42d7-97e9-86b1ddf24ce8',25803,20623,20155,20199,'Test Test','2016-06-06 03:27:18','2016-06-06 03:27:18',20002,25801,-1,25804,25803,0,'25801','25801','bbcode',0,0,0,0,0,20199,'Test Test','2016-06-06 03:27:18'),('317ec084-a45b-417d-b3f3-535593210bd1',25905,20623,20155,20199,'Test Test','2016-06-06 03:32:19','2016-06-06 03:32:19',20002,25903,-1,25906,25905,0,'25903','25903','bbcode',0,0,0,0,0,20199,'Test Test','2016-06-06 03:32:19'),('b83b81dd-fced-4203-a310-d7061bfb48b5',25911,20623,20155,20199,'Test Test','2016-06-06 03:33:36','2016-06-06 03:33:36',20002,25909,-1,25912,25911,0,'25909','25909','bbcode',0,0,0,0,0,20199,'Test Test','2016-06-06 03:33:36'),('46485c44-e810-4e38-aa08-320aaa83130c',25917,20623,20155,20199,'Test Test','2016-06-06 03:34:06','2016-06-06 03:34:06',20002,25915,-1,25918,25917,0,'25915','25915','bbcode',0,0,0,0,0,20199,'Test Test','2016-06-06 03:34:06'),('5a8f9b8c-573c-4636-a7b6-60eaa48eed2e',25923,20623,20155,20199,'Test Test','2016-06-06 03:35:09','2016-06-06 03:35:09',20002,25921,-1,25924,25923,0,'25921','25921','bbcode',0,0,0,0,0,20199,'Test Test','2016-06-06 03:35:09'),('17770cef-e580-461d-9ebc-c8eb4ebc8e42',27118,27103,20155,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19',20002,27116,-1,27119,27118,0,'27116','27116','bbcode',1,0,0,0,0,20159,'','2016-06-18 05:23:19'),('709e7077-c43e-4af7-b3bc-e48900dd3dd9',27136,20182,20155,20199,'Test Test','2016-06-18 05:51:03','2016-06-18 05:51:03',20109,27132,-1,27137,27136,0,'27132','27132','bbcode',0,0,0,0,0,20199,'Test Test','2016-06-18 05:51:03'),('a9f570c0-6c16-4f4c-b271-12c26991e1fb',30407,20534,20155,20159,'','2016-08-17 07:02:22','2016-08-17 07:02:22',20002,30405,-1,30408,30407,0,'30405','30405','bbcode',1,0,0,0,0,20159,'','2016-08-17 07:02:22');
/*!40000 ALTER TABLE `mbmessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbstatsuser`
--

DROP TABLE IF EXISTS `mbstatsuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbstatsuser` (
  `statsUserId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `messageCount` int(11) DEFAULT NULL,
  `lastPostDate` datetime DEFAULT NULL,
  PRIMARY KEY (`statsUserId`),
  UNIQUE KEY `IX_9168E2C9` (`groupId`,`userId`),
  KEY `IX_A00A898F` (`groupId`),
  KEY `IX_D33A5445` (`groupId`,`userId`,`messageCount`),
  KEY `IX_847F92B5` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbstatsuser`
--

LOCK TABLES `mbstatsuser` WRITE;
/*!40000 ALTER TABLE `mbstatsuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbstatsuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbthread`
--

DROP TABLE IF EXISTS `mbthread`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbthread` (
  `uuid_` varchar(75) DEFAULT NULL,
  `threadId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `categoryId` bigint(20) DEFAULT NULL,
  `rootMessageId` bigint(20) DEFAULT NULL,
  `rootMessageUserId` bigint(20) DEFAULT NULL,
  `messageCount` int(11) DEFAULT NULL,
  `viewCount` int(11) DEFAULT NULL,
  `lastPostByUserId` bigint(20) DEFAULT NULL,
  `lastPostDate` datetime DEFAULT NULL,
  `priority` double DEFAULT NULL,
  `question` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`threadId`),
  UNIQUE KEY `IX_3A200B7B` (`uuid_`,`groupId`),
  KEY `IX_41F6DC8A` (`categoryId`,`priority`),
  KEY `IX_95C0EA45` (`groupId`),
  KEY `IX_9A2D11B2` (`groupId`,`categoryId`),
  KEY `IX_50F1904A` (`groupId`,`categoryId`,`lastPostDate`),
  KEY `IX_485F7E98` (`groupId`,`categoryId`,`status`),
  KEY `IX_E1E7142B` (`groupId`,`status`),
  KEY `IX_AEDD9CB5` (`lastPostDate`,`priority`),
  KEY `IX_CC993ECB` (`rootMessageId`),
  KEY `IX_7E264A0F` (`uuid_`),
  KEY `IX_F8CA2AB9` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbthread`
--

LOCK TABLES `mbthread` WRITE;
/*!40000 ALTER TABLE `mbthread` DISABLE KEYS */;
INSERT INTO `mbthread` VALUES ('9db58a93-f47b-4ec1-8993-05a8e2f82a31',20179,20173,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',-1,20178,20159,1,0,0,'2016-05-04 07:40:10',0,0,0,20159,'','2016-05-04 07:40:10'),('4bfb2ac3-832f-49ba-b335-4ed99084d478',20188,20182,20155,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',-1,20187,20159,1,0,0,'2016-05-04 07:40:11',0,0,0,20159,'','2016-05-04 07:40:11'),('c4ffbd20-f0df-45b3-9e5c-ff36a95e06ca',20323,20317,20155,20159,'','2016-05-04 07:40:14','2016-05-04 07:40:14',-1,20322,20159,1,0,0,'2016-05-04 07:40:14',0,0,0,20159,'','2016-05-04 07:40:14'),('ae6c374f-6ae1-46cc-9956-eb52f1cb945c',20335,20329,20155,20159,'','2016-05-04 07:40:15','2016-05-04 07:40:15',-1,20334,20159,1,0,0,'2016-05-04 07:40:15',0,0,0,20159,'','2016-05-04 07:40:15'),('09671c4c-a4a1-4d57-9173-dea2fce1c1e0',20345,20339,20155,20159,'','2016-05-04 07:40:17','2016-05-04 07:40:17',-1,20344,20159,1,0,0,'2016-05-04 07:40:17',0,0,0,20159,'','2016-05-04 07:40:17'),('0ccda045-45af-4105-aed6-40c86f9643e1',20364,20350,20155,20159,'','2016-05-04 07:40:19','2016-05-04 07:40:19',-1,20363,20159,1,0,0,'2016-05-04 07:40:19',0,0,0,20159,'','2016-05-04 07:40:19'),('c9f118e2-1966-4555-8ac4-32413ce0ea92',20372,20350,20155,20159,'','2016-05-04 07:40:20','2016-05-04 07:40:20',-1,20371,20159,1,0,0,'2016-05-04 07:40:20',0,0,0,20159,'','2016-05-04 07:40:20'),('e0b21793-c75f-4b32-b94e-8c8b8d473ce8',20390,20376,20155,20159,'','2016-05-04 07:40:22','2016-05-04 07:40:22',-1,20389,20159,1,0,0,'2016-05-04 07:40:22',0,0,0,20159,'','2016-05-04 07:40:22'),('822e1640-af1a-40a2-ba37-536460f914a5',20399,20376,20155,20159,'','2016-05-04 07:40:23','2016-05-04 07:40:23',-1,20398,20159,1,0,0,'2016-05-04 07:40:23',0,0,0,20159,'','2016-05-04 07:40:23'),('826d3c9a-8300-46ce-b217-8be89fad7d80',20407,20376,20155,20159,'','2016-05-04 07:40:24','2016-05-04 07:40:24',-1,20406,20159,1,0,0,'2016-05-04 07:40:24',0,0,0,20159,'','2016-05-04 07:40:24'),('defc6b9f-2c08-423c-8c4f-e525d308a986',20631,20623,20155,20199,'Test Test','2016-05-04 07:51:12','2016-05-04 07:51:12',-1,20630,20199,1,0,20199,'2016-05-04 07:51:12',0,0,0,20199,'Test Test','2016-05-04 07:51:12'),('fbf76151-6122-434e-b4ae-19caf0a50a9f',20637,20623,20155,20199,'Test Test','2016-05-04 07:51:25','2016-05-04 07:51:25',-1,20636,20199,1,0,20199,'2016-05-04 07:51:25',0,0,0,20199,'Test Test','2016-05-04 07:51:25'),('74c98679-646e-4ba7-aeb4-7dccb1a3da43',25804,20623,20155,20199,'Test Test','2016-06-06 03:27:18','2016-06-06 03:27:18',-1,25803,20199,1,0,20199,'2016-06-06 03:27:18',0,0,0,20199,'Test Test','2016-06-06 03:27:18'),('dcc9ceb7-e859-46ee-b2cb-b3dfcf6e54ab',25906,20623,20155,20199,'Test Test','2016-06-06 03:32:19','2016-06-06 03:32:19',-1,25905,20199,1,0,20199,'2016-06-06 03:32:19',0,0,0,20199,'Test Test','2016-06-06 03:32:19'),('792c42e1-48e9-4369-93f7-d7ce37ced88f',25912,20623,20155,20199,'Test Test','2016-06-06 03:33:36','2016-06-06 03:33:36',-1,25911,20199,1,0,20199,'2016-06-06 03:33:36',0,0,0,20199,'Test Test','2016-06-06 03:33:36'),('f1096094-cd33-49ed-996e-20bc51eb2c58',25918,20623,20155,20199,'Test Test','2016-06-06 03:34:06','2016-06-06 03:34:06',-1,25917,20199,1,0,20199,'2016-06-06 03:34:06',0,0,0,20199,'Test Test','2016-06-06 03:34:06'),('ab07ca19-166a-4dc2-939a-0387d0359208',25924,20623,20155,20199,'Test Test','2016-06-06 03:35:09','2016-06-06 03:35:09',-1,25923,20199,1,0,20199,'2016-06-06 03:35:09',0,0,0,20199,'Test Test','2016-06-06 03:35:09'),('12513d32-441e-4157-9083-cb441c3abebf',27119,27103,20155,20159,'','2016-06-18 05:23:19','2016-06-18 05:23:19',-1,27118,20159,1,0,0,'2016-06-18 05:23:19',0,0,0,20159,'','2016-06-18 05:23:19'),('c9155055-a447-4dc2-b302-929ddb04969b',27137,20182,20155,20199,'Test Test','2016-06-18 05:51:03','2016-06-18 05:51:03',-1,27136,20199,1,0,20199,'2016-06-18 05:51:03',0,0,0,20199,'Test Test','2016-06-18 05:51:03'),('ad8c4542-7c4b-4471-a994-0cd15d6312e6',30408,20534,20155,20159,'','2016-08-17 07:02:22','2016-08-17 07:02:22',-1,30407,20159,1,0,0,'2016-08-17 07:02:22',0,0,0,20159,'','2016-08-17 07:02:22');
/*!40000 ALTER TABLE `mbthread` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mbthreadflag`
--

DROP TABLE IF EXISTS `mbthreadflag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mbthreadflag` (
  `uuid_` varchar(75) DEFAULT NULL,
  `threadFlagId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `threadId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`threadFlagId`),
  UNIQUE KEY `IX_33781904` (`userId`,`threadId`),
  UNIQUE KEY `IX_FEB0FC87` (`uuid_`,`groupId`),
  KEY `IX_8CB0A24A` (`threadId`),
  KEY `IX_A28004B` (`userId`),
  KEY `IX_F36BBB83` (`uuid_`),
  KEY `IX_DCE308C5` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mbthreadflag`
--

LOCK TABLES `mbthreadflag` WRITE;
/*!40000 ALTER TABLE `mbthreadflag` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbthreadflag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mdraction`
--

DROP TABLE IF EXISTS `mdraction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mdraction` (
  `uuid_` varchar(75) DEFAULT NULL,
  `actionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `ruleGroupInstanceId` bigint(20) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `type_` varchar(255) DEFAULT NULL,
  `typeSettings` longtext,
  PRIMARY KEY (`actionId`),
  UNIQUE KEY `IX_75BE36AD` (`uuid_`,`groupId`),
  KEY `IX_FD90786C` (`ruleGroupInstanceId`),
  KEY `IX_77BB5E9D` (`uuid_`),
  KEY `IX_C58A516B` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdraction`
--

LOCK TABLES `mdraction` WRITE;
/*!40000 ALTER TABLE `mdraction` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdraction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mdrrule`
--

DROP TABLE IF EXISTS `mdrrule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mdrrule` (
  `uuid_` varchar(75) DEFAULT NULL,
  `ruleId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `ruleGroupId` bigint(20) DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  `type_` varchar(255) DEFAULT NULL,
  `typeSettings` longtext,
  PRIMARY KEY (`ruleId`),
  UNIQUE KEY `IX_F3EFDCB3` (`uuid_`,`groupId`),
  KEY `IX_4F4293F1` (`ruleGroupId`),
  KEY `IX_EA63B9D7` (`uuid_`),
  KEY `IX_7DEA8DF1` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdrrule`
--

LOCK TABLES `mdrrule` WRITE;
/*!40000 ALTER TABLE `mdrrule` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdrrule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mdrrulegroup`
--

DROP TABLE IF EXISTS `mdrrulegroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mdrrulegroup` (
  `uuid_` varchar(75) DEFAULT NULL,
  `ruleGroupId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` longtext,
  `description` longtext,
  PRIMARY KEY (`ruleGroupId`),
  UNIQUE KEY `IX_46665CC4` (`uuid_`,`groupId`),
  KEY `IX_5849891C` (`groupId`),
  KEY `IX_7F26B2A6` (`uuid_`),
  KEY `IX_CC14DC2` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdrrulegroup`
--

LOCK TABLES `mdrrulegroup` WRITE;
/*!40000 ALTER TABLE `mdrrulegroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdrrulegroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mdrrulegroupinstance`
--

DROP TABLE IF EXISTS `mdrrulegroupinstance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mdrrulegroupinstance` (
  `uuid_` varchar(75) DEFAULT NULL,
  `ruleGroupInstanceId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `ruleGroupId` bigint(20) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`ruleGroupInstanceId`),
  UNIQUE KEY `IX_808A0036` (`classNameId`,`classPK`,`ruleGroupId`),
  UNIQUE KEY `IX_9CBC6A39` (`uuid_`,`groupId`),
  KEY `IX_C95A08D8` (`classNameId`,`classPK`),
  KEY `IX_AFF28547` (`groupId`),
  KEY `IX_22DAB85C` (`groupId`,`classNameId`,`classPK`),
  KEY `IX_BF3E642B` (`ruleGroupId`),
  KEY `IX_B6A6BD91` (`uuid_`),
  KEY `IX_25C9D1F7` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdrrulegroupinstance`
--

LOCK TABLES `mdrrulegroupinstance` WRITE;
/*!40000 ALTER TABLE `mdrrulegroupinstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdrrulegroupinstance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membershiprequest`
--

DROP TABLE IF EXISTS `membershiprequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `membershiprequest` (
  `membershipRequestId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `comments` longtext,
  `replyComments` longtext,
  `replyDate` datetime DEFAULT NULL,
  `replierUserId` bigint(20) DEFAULT NULL,
  `statusId` int(11) DEFAULT NULL,
  PRIMARY KEY (`membershipRequestId`),
  KEY `IX_8A1CC4B` (`groupId`),
  KEY `IX_C28C72EC` (`groupId`,`statusId`),
  KEY `IX_35AA8FA6` (`groupId`,`userId`,`statusId`),
  KEY `IX_66D70879` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membershiprequest`
--

LOCK TABLES `membershiprequest` WRITE;
/*!40000 ALTER TABLE `membershiprequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `membershiprequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notifications_usernotificationevent`
--

DROP TABLE IF EXISTS `notifications_usernotificationevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notifications_usernotificationevent` (
  `notificationEventId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userNotificationEventId` bigint(20) DEFAULT NULL,
  `timestamp` bigint(20) DEFAULT NULL,
  `delivered` tinyint(4) DEFAULT NULL,
  `actionRequired` tinyint(4) DEFAULT NULL,
  `archived` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`notificationEventId`),
  UNIQUE KEY `IX_DC9FCEDC` (`userNotificationEventId`),
  KEY `IX_93C52776` (`userId`,`actionRequired`),
  KEY `IX_36E5AE4C` (`userId`,`actionRequired`,`archived`),
  KEY `IX_73C065F0` (`userId`,`delivered`,`actionRequired`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notifications_usernotificationevent`
--

LOCK TABLES `notifications_usernotificationevent` WRITE;
/*!40000 ALTER TABLE `notifications_usernotificationevent` DISABLE KEYS */;
INSERT INTO `notifications_usernotificationevent` VALUES (22514,20155,20159,22513,1462665909014,0,0,0),(22516,20155,20199,22515,1462665909093,1,0,1),(22518,20155,20902,22517,1462665909099,0,0,0),(22520,20155,21811,22519,1462665909104,0,0,0),(22522,20155,22202,22521,1462665909109,0,0,0),(22524,20155,22212,22523,1462665909113,0,0,0),(22526,20155,22221,22525,1462665909118,0,0,0),(22528,20155,22230,22527,1462665909123,0,0,0),(22530,20155,22239,22529,1462665909132,0,0,0),(22532,20155,22248,22531,1462665909138,0,0,0),(22534,20155,22257,22533,1462665909143,0,0,0),(22536,20155,20159,22535,1462665926892,0,0,0),(22538,20155,20199,22537,1462665926899,1,0,1),(22540,20155,20902,22539,1462665926905,0,0,0),(22542,20155,21811,22541,1462665926911,0,0,0),(22544,20155,22202,22543,1462665926916,0,0,0),(22546,20155,22212,22545,1462665926925,0,0,0),(22548,20155,22221,22547,1462665926932,0,0,0),(22550,20155,22230,22549,1462665926938,0,0,0),(22552,20155,22239,22551,1462665926943,0,0,0),(22554,20155,22248,22553,1462665926948,0,0,0),(22556,20155,22257,22555,1462665926952,0,0,0),(22558,20155,20159,22557,1462665931949,0,0,0),(22560,20155,20199,22559,1462665931958,1,0,1),(22562,20155,20902,22561,1462665931964,0,0,0),(22564,20155,21811,22563,1462665931968,0,0,0),(22566,20155,22202,22565,1462665931974,0,0,0),(22568,20155,22212,22567,1462665931980,0,0,0),(22570,20155,22221,22569,1462665931985,0,0,0),(22572,20155,22230,22571,1462665931990,0,0,0),(22574,20155,22239,22573,1462665931996,0,0,0),(22576,20155,22248,22575,1462665932001,0,0,0),(22578,20155,22257,22577,1462665932007,0,0,0),(22702,20155,20159,22701,1462671686936,0,0,0),(22704,20155,20199,22703,1462671687041,1,0,1),(22706,20155,20902,22705,1462671687047,0,0,0),(22708,20155,21811,22707,1462671687054,0,0,0),(22710,20155,22202,22709,1462671687059,0,0,0),(22712,20155,22212,22711,1462671687066,0,0,0),(22714,20155,22221,22713,1462671687073,0,0,0),(22716,20155,22230,22715,1462671687078,0,0,0),(22718,20155,22239,22717,1462671687088,0,0,0),(22720,20155,22248,22719,1462671687113,0,0,0),(22722,20155,22257,22721,1462671687119,0,0,0),(22724,20155,20159,22723,1462671706707,0,0,0),(22726,20155,20199,22725,1462671706717,1,0,1),(22728,20155,20902,22727,1462671706722,0,0,0),(22730,20155,21811,22729,1462671706729,0,0,0),(22732,20155,22202,22731,1462671706736,0,0,0),(22734,20155,22212,22733,1462671706760,0,0,0),(22736,20155,22221,22735,1462671706767,0,0,0),(22738,20155,22230,22737,1462671706773,0,0,0),(22740,20155,22239,22739,1462671706780,0,0,0),(22742,20155,22248,22741,1462671706785,0,0,0),(22744,20155,22257,22743,1462671706793,0,0,0),(22746,20155,20159,22745,1462671947175,0,0,0),(22748,20155,20199,22747,1462671947181,1,0,1),(22750,20155,20902,22749,1462671947186,0,0,0),(22752,20155,21811,22751,1462671947191,0,0,0),(22754,20155,22202,22753,1462671947197,0,0,0),(22756,20155,22212,22755,1462671947202,0,0,0),(22758,20155,22221,22757,1462671947207,0,0,0),(22760,20155,22230,22759,1462671947212,0,0,0),(22762,20155,22239,22761,1462671947217,0,0,0),(22764,20155,22248,22763,1462671947226,0,0,0),(22766,20155,22257,22765,1462671947234,0,0,0),(22812,20155,20159,22811,1462906166181,0,0,0),(22814,20155,20199,22813,1462906166264,1,0,1),(22816,20155,20902,22815,1462906166286,0,0,0),(22818,20155,21811,22817,1462906166332,0,0,0),(22820,20155,22202,22819,1462906166353,0,0,0),(22822,20155,22212,22821,1462906166361,0,0,0),(22824,20155,22221,22823,1462906166368,0,0,0),(22826,20155,22230,22825,1462906166373,0,0,0),(22828,20155,22239,22827,1462906166401,0,0,0),(22830,20155,22248,22829,1462906166421,0,0,0),(22832,20155,22257,22831,1462906166455,0,0,0);
/*!40000 ALTER TABLE `notifications_usernotificationevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `observaciones`
--

DROP TABLE IF EXISTS `observaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `observaciones` (
  `observacionId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `tabla` varchar(75) DEFAULT NULL,
  `registroId` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`observacionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `observaciones`
--

LOCK TABLES `observaciones` WRITE;
/*!40000 ALTER TABLE `observaciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `observaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opensocial_gadget`
--

DROP TABLE IF EXISTS `opensocial_gadget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opensocial_gadget` (
  `uuid_` varchar(75) DEFAULT NULL,
  `gadgetId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `url` longtext,
  `portletCategoryNames` longtext,
  PRIMARY KEY (`gadgetId`),
  KEY `IX_729869EE` (`companyId`),
  KEY `IX_E1F8627A` (`uuid_`),
  KEY `IX_3C79316E` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opensocial_gadget`
--

LOCK TABLES `opensocial_gadget` WRITE;
/*!40000 ALTER TABLE `opensocial_gadget` DISABLE KEYS */;
/*!40000 ALTER TABLE `opensocial_gadget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opensocial_oauthconsumer`
--

DROP TABLE IF EXISTS `opensocial_oauthconsumer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opensocial_oauthconsumer` (
  `oAuthConsumerId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `gadgetKey` varchar(75) DEFAULT NULL,
  `serviceName` varchar(75) DEFAULT NULL,
  `consumerKey` varchar(75) DEFAULT NULL,
  `consumerSecret` longtext,
  `keyType` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`oAuthConsumerId`),
  KEY `IX_47206618` (`gadgetKey`),
  KEY `IX_8E715BF8` (`gadgetKey`,`serviceName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opensocial_oauthconsumer`
--

LOCK TABLES `opensocial_oauthconsumer` WRITE;
/*!40000 ALTER TABLE `opensocial_oauthconsumer` DISABLE KEYS */;
/*!40000 ALTER TABLE `opensocial_oauthconsumer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `opensocial_oauthtoken`
--

DROP TABLE IF EXISTS `opensocial_oauthtoken`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `opensocial_oauthtoken` (
  `oAuthTokenId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `gadgetKey` varchar(75) DEFAULT NULL,
  `serviceName` varchar(75) DEFAULT NULL,
  `moduleId` bigint(20) DEFAULT NULL,
  `accessToken` varchar(75) DEFAULT NULL,
  `tokenName` varchar(75) DEFAULT NULL,
  `tokenSecret` varchar(75) DEFAULT NULL,
  `sessionHandle` varchar(75) DEFAULT NULL,
  `expiration` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`oAuthTokenId`),
  KEY `IX_6C8CCC3D` (`gadgetKey`,`serviceName`),
  KEY `IX_CDD35402` (`userId`,`gadgetKey`,`serviceName`,`moduleId`,`tokenName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `opensocial_oauthtoken`
--

LOCK TABLES `opensocial_oauthtoken` WRITE;
/*!40000 ALTER TABLE `opensocial_oauthtoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `opensocial_oauthtoken` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization_`
--

DROP TABLE IF EXISTS `organization_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `organization_` (
  `uuid_` varchar(75) DEFAULT NULL,
  `organizationId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentOrganizationId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(100) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `recursable` tinyint(4) DEFAULT NULL,
  `regionId` bigint(20) DEFAULT NULL,
  `countryId` bigint(20) DEFAULT NULL,
  `statusId` int(11) DEFAULT NULL,
  `comments` longtext,
  PRIMARY KEY (`organizationId`),
  UNIQUE KEY `IX_E301BDF5` (`companyId`,`name`),
  KEY `IX_834BCEB6` (`companyId`),
  KEY `IX_418E4522` (`companyId`,`parentOrganizationId`),
  KEY `IX_396D6B42` (`uuid_`),
  KEY `IX_A9D85BA6` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization_`
--

LOCK TABLES `organization_` WRITE;
/*!40000 ALTER TABLE `organization_` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orggrouprole`
--

DROP TABLE IF EXISTS `orggrouprole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orggrouprole` (
  `organizationId` bigint(20) NOT NULL,
  `groupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`organizationId`,`groupId`,`roleId`),
  KEY `IX_4A527DD3` (`groupId`),
  KEY `IX_AB044D1C` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orggrouprole`
--

LOCK TABLES `orggrouprole` WRITE;
/*!40000 ALTER TABLE `orggrouprole` DISABLE KEYS */;
/*!40000 ALTER TABLE `orggrouprole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orglabor`
--

DROP TABLE IF EXISTS `orglabor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orglabor` (
  `orgLaborId` bigint(20) NOT NULL,
  `organizationId` bigint(20) DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  `sunOpen` int(11) DEFAULT NULL,
  `sunClose` int(11) DEFAULT NULL,
  `monOpen` int(11) DEFAULT NULL,
  `monClose` int(11) DEFAULT NULL,
  `tueOpen` int(11) DEFAULT NULL,
  `tueClose` int(11) DEFAULT NULL,
  `wedOpen` int(11) DEFAULT NULL,
  `wedClose` int(11) DEFAULT NULL,
  `thuOpen` int(11) DEFAULT NULL,
  `thuClose` int(11) DEFAULT NULL,
  `friOpen` int(11) DEFAULT NULL,
  `friClose` int(11) DEFAULT NULL,
  `satOpen` int(11) DEFAULT NULL,
  `satClose` int(11) DEFAULT NULL,
  PRIMARY KEY (`orgLaborId`),
  KEY `IX_6AF0D434` (`organizationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orglabor`
--

LOCK TABLES `orglabor` WRITE;
/*!40000 ALTER TABLE `orglabor` DISABLE KEYS */;
/*!40000 ALTER TABLE `orglabor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parametro`
--

DROP TABLE IF EXISTS `parametro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `parametro` (
  `parametroId` bigint(20) NOT NULL,
  `parametroIdpadre` bigint(20) DEFAULT NULL,
  `codigo` varchar(75) DEFAULT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `valor` varchar(75) DEFAULT NULL,
  `tipodato` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`parametroId`),
  KEY `IX_E0052BA5` (`parametroIdpadre`),
  KEY `IX_9CDF672F` (`parametroIdpadre`,`valor`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parametro`
--

LOCK TABLES `parametro` WRITE;
/*!40000 ALTER TABLE `parametro` DISABLE KEYS */;
INSERT INTO `parametro` VALUES (1,0,'','TipoReclutamiento','','',1,20199,'2016-04-08 00:00:00',123,NULL),(2,1,'','','interno','',1,20199,'2016-04-08 00:00:00',123,NULL),(3,1,'','','externo','',1,20199,'2016-04-08 00:00:00',123,NULL),(4,0,'','ModalidadJornada','','',1,20199,'2016-04-08 00:00:00',123,NULL),(5,4,'','','Tiempo Completo','',1,20199,'2016-04-08 00:00:00',123,NULL),(6,4,'','','Por horas','',1,20199,'2016-04-08 00:00:00',123,NULL),(7,4,'','','Part-Time','',1,20199,'2016-04-08 00:00:00',123,NULL),(8,0,'','ModalidadContrato','','',1,20199,'2016-04-08 00:00:00',123,NULL),(9,8,'','','Locación de servicio','',1,20199,'2016-04-08 00:00:00',123,NULL),(10,8,'','','Planilla','',1,20199,'2016-04-08 00:00:00',123,NULL),(11,8,'','','Convenio de practicas','',1,20199,'2016-04-08 00:00:00',123,NULL),(12,0,'','MotivoContrato','','',1,20199,'2016-04-08 00:00:00',123,NULL),(13,12,'','','Rotación','',1,20199,'2016-04-08 00:00:00',123,NULL),(14,12,'','','Contrato Pre Post','',1,20199,'2016-04-08 00:00:00',123,NULL),(15,12,'','','Reemplazo por Proyecto','',1,20199,'2016-04-08 00:00:00',123,NULL),(16,0,'','Prioridades','','',1,20199,'2016-04-08 00:00:00',123,NULL),(17,16,'','','Baja','',1,20199,'2016-04-08 00:00:00',123,NULL),(18,16,'','','Media','',1,20199,'2016-04-08 00:00:00',123,NULL),(19,16,'','','Alta','',1,20199,'2016-04-08 00:00:00',123,NULL),(20,16,'','','Intercambio de Actividades','',1,20199,'2016-04-08 00:00:00',123,NULL),(21,0,'','Clientes','','',1,20199,'2016-04-08 00:00:00',123,NULL),(22,21,'','','BBVA','',1,20199,'2016-04-08 00:00:00',123,NULL),(23,21,'','','DIVEMOTOR','',1,20199,'2016-04-08 00:00:00',123,NULL),(24,21,'','','MAFFRE','',1,123,'2016-04-08 00:00:00',123,NULL),(25,21,'','','BOLSA DE VALORES DE LIMA','',1,123,'2016-04-08 00:00:00',123,NULL),(26,21,'','','CLARO','',1,123,'2016-04-08 00:00:00',123,NULL),(27,21,'','','CLARO  ECUADOR','',1,123,'2016-04-08 00:00:00',123,NULL),(28,21,'','','TELMET USA','',1,20199,'2016-04-08 00:00:00',123,NULL),(29,0,'','Tipo de negocio','','',1,20199,'2016-04-08 00:00:00',123,NULL),(30,29,'','','BANCA','',1,20199,'2016-04-08 00:00:00',123,NULL),(31,29,'','','VENTA DE AUTOS','',1,20199,'2016-04-08 00:00:00',123,NULL),(32,29,'','','ASEGURADORA','',1,20199,'2016-04-08 00:00:00',123,NULL),(33,29,'','','BOLSA','',1,20199,'2016-04-08 00:00:00',123,NULL),(34,29,'','','TELECOMUNICACIONES','',1,20199,'2016-04-08 00:00:00',123,NULL),(35,0,'','Nivel','','',1,20199,'2016-04-08 00:00:00',123,NULL),(36,35,'','','1','',1,20199,'2016-04-08 00:00:00',123,NULL),(37,35,'','','2','',1,20199,'2016-04-08 00:00:00',123,NULL),(38,35,'','','3','',1,20199,'2016-04-08 00:00:00',123,NULL),(39,35,'','','4','',1,20199,'2016-04-08 00:00:00',123,NULL),(40,35,'','','5','',1,20199,'2016-04-08 00:00:00',123,NULL),(41,0,'','Tipo de documento','','',1,20199,'2016-04-08 00:00:00',123,NULL),(42,41,'','','DNI','',1,20199,'2016-04-08 00:00:00',123,NULL),(43,41,'','','CARNET DE EXTRANGERIA','',1,20199,'2016-04-08 00:00:00',123,NULL),(44,0,'','Tiempo de contrato','','',1,123,'2016-04-08 00:00:00',123,NULL),(45,44,'','','1 mes','',1,20199,'2016-04-08 00:00:00',123,NULL),(46,44,'','','6 meses','',1,123,'2016-04-08 00:00:00',123,NULL),(47,0,'','Estados','','',1,123,'2016-04-08 00:00:00',123,NULL),(48,47,'','','Registrado','',1,123,'2016-04-08 00:00:00',123,NULL),(49,47,'','','Revisado','',1,123,'2016-04-08 00:00:00',123,NULL),(50,47,'','','Observado','',1,123,'2016-04-08 00:00:00',123,NULL),(51,47,'','','Evaluación','',1,123,'2016-04-08 00:00:00',123,NULL),(52,47,'','','Entrevista','',1,123,'2016-04-08 00:00:00',123,NULL),(53,0,'','Cargo','','',1,123,'2016-04-08 00:00:00',123,NULL),(54,53,'','','Analista Programador Junior','',1,123,'2016-04-08 00:00:00',123,NULL),(55,53,'','','Analista Programador Semisenior','',1,123,'2016-04-08 00:00:00',123,NULL),(56,53,'','','Analista Programador Senior','',1,123,'2016-04-08 00:00:00',123,NULL),(57,53,'','','DBA','',1,123,'2016-04-08 00:00:00',123,NULL),(58,53,'','','Lider Tecnico servidores','',1,123,'2016-04-08 00:00:00',123,NULL),(59,0,'','Area','','',1,123,'2016-04-08 00:00:00',123,NULL),(60,59,'','','Claro Telmex','',1,123,'2016-04-08 00:00:00',123,NULL),(61,59,'','','Claro Ecuador','',1,123,'2016-04-08 00:00:00',123,NULL),(62,47,'','','Cancelado','',1,123,'2016-04-08 00:00:00',123,NULL),(63,47,'','','Terminado','',1,123,'2016-04-08 00:00:00',123,NULL),(64,47,'','','Anulado','',1,123,'2016-04-08 00:00:00',123,NULL),(65,0,'','TipoRequisito','','',1,123,'2016-04-08 00:00:00',123,NULL),(66,65,'','','Conocimiento','',1,123,'2016-04-08 00:00:00',123,NULL),(67,65,'','','Certificado','',1,123,'2016-04-08 00:00:00',123,NULL),(68,47,'','','Fin Publicación','',1,123,'2016-04-08 00:00:00',123,NULL),(69,0,'','Estado Postulacion','','',1,123,'2016-04-08 00:00:00',123,NULL),(70,69,'','','Postulado','',1,123,'2016-04-08 00:00:00',123,NULL),(71,69,'','','En proceso','',1,123,'2016-04-08 00:00:00',123,NULL),(72,69,'','','Terminado','',1,123,'2016-04-08 00:00:00',123,NULL),(73,69,'','','Cancelado','',1,123,'2016-04-08 00:00:00',123,NULL),(74,69,'','','Terminado','',1,123,'2016-04-08 00:00:00',123,NULL),(75,47,'','','Publicado','',1,123,'2016-04-08 00:00:00',123,NULL),(76,47,'','','Aprobado','',1,123,'2016-04-08 00:00:00',123,NULL);
/*!40000 ALTER TABLE `parametro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passwordpolicy`
--

DROP TABLE IF EXISTS `passwordpolicy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passwordpolicy` (
  `uuid_` varchar(75) DEFAULT NULL,
  `passwordPolicyId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `defaultPolicy` tinyint(4) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `changeable` tinyint(4) DEFAULT NULL,
  `changeRequired` tinyint(4) DEFAULT NULL,
  `minAge` bigint(20) DEFAULT NULL,
  `checkSyntax` tinyint(4) DEFAULT NULL,
  `allowDictionaryWords` tinyint(4) DEFAULT NULL,
  `minAlphanumeric` int(11) DEFAULT NULL,
  `minLength` int(11) DEFAULT NULL,
  `minLowerCase` int(11) DEFAULT NULL,
  `minNumbers` int(11) DEFAULT NULL,
  `minSymbols` int(11) DEFAULT NULL,
  `minUpperCase` int(11) DEFAULT NULL,
  `regex` varchar(75) DEFAULT NULL,
  `history` tinyint(4) DEFAULT NULL,
  `historyCount` int(11) DEFAULT NULL,
  `expireable` tinyint(4) DEFAULT NULL,
  `maxAge` bigint(20) DEFAULT NULL,
  `warningTime` bigint(20) DEFAULT NULL,
  `graceLimit` int(11) DEFAULT NULL,
  `lockout` tinyint(4) DEFAULT NULL,
  `maxFailure` int(11) DEFAULT NULL,
  `lockoutDuration` bigint(20) DEFAULT NULL,
  `requireUnlock` tinyint(4) DEFAULT NULL,
  `resetFailureCount` bigint(20) DEFAULT NULL,
  `resetTicketMaxAge` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`passwordPolicyId`),
  UNIQUE KEY `IX_3FBFA9F4` (`companyId`,`name`),
  KEY `IX_8FEE65F5` (`companyId`),
  KEY `IX_2C1142E` (`companyId`,`defaultPolicy`),
  KEY `IX_51437A01` (`uuid_`),
  KEY `IX_E4D7EF87` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passwordpolicy`
--

LOCK TABLES `passwordpolicy` WRITE;
/*!40000 ALTER TABLE `passwordpolicy` DISABLE KEYS */;
INSERT INTO `passwordpolicy` VALUES ('2b09c9cf-8260-4207-aca9-e2e544afb737',20198,20155,20159,'','2016-05-04 07:40:11','2016-05-04 07:40:11',1,'Default Password Policy','Default Password Policy',1,1,0,0,1,0,6,0,1,0,1,'(?=.{4})(?:[a-zA-Z0-9]*)',0,6,0,8640000,86400,0,0,3,0,1,600,86400);
/*!40000 ALTER TABLE `passwordpolicy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passwordpolicyrel`
--

DROP TABLE IF EXISTS `passwordpolicyrel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passwordpolicyrel` (
  `passwordPolicyRelId` bigint(20) NOT NULL,
  `passwordPolicyId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`passwordPolicyRelId`),
  UNIQUE KEY `IX_C3A17327` (`classNameId`,`classPK`),
  KEY `IX_CD25266E` (`passwordPolicyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passwordpolicyrel`
--

LOCK TABLES `passwordpolicyrel` WRITE;
/*!40000 ALTER TABLE `passwordpolicyrel` DISABLE KEYS */;
/*!40000 ALTER TABLE `passwordpolicyrel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `passwordtracker`
--

DROP TABLE IF EXISTS `passwordtracker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passwordtracker` (
  `passwordTrackerId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `password_` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`passwordTrackerId`),
  KEY `IX_326F75BD` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passwordtracker`
--

LOCK TABLES `passwordtracker` WRITE;
/*!40000 ALTER TABLE `passwordtracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `passwordtracker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phone`
--

DROP TABLE IF EXISTS `phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `phone` (
  `uuid_` varchar(75) DEFAULT NULL,
  `phoneId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `number_` varchar(75) DEFAULT NULL,
  `extension` varchar(75) DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  `primary_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`phoneId`),
  KEY `IX_9F704A14` (`companyId`),
  KEY `IX_A2E4AFBA` (`companyId`,`classNameId`),
  KEY `IX_9A53569` (`companyId`,`classNameId`,`classPK`),
  KEY `IX_812CE07A` (`companyId`,`classNameId`,`classPK`,`primary_`),
  KEY `IX_F202B9CE` (`userId`),
  KEY `IX_EA6245A0` (`uuid_`),
  KEY `IX_B271FA88` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phone`
--

LOCK TABLES `phone` WRITE;
/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
/*!40000 ALTER TABLE `phone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planaccion`
--

DROP TABLE IF EXISTS `planaccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `planaccion` (
  `planAccionId` bigint(20) NOT NULL,
  `cronogramaId` bigint(20) DEFAULT NULL,
  `responsable` bigint(20) DEFAULT NULL,
  `fechaProgramada` datetime DEFAULT NULL,
  `aprobadorColaborador` tinyint(4) DEFAULT NULL,
  `aprobadorLider` tinyint(4) DEFAULT NULL,
  `jerarquiaEvaluar` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`planAccionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planaccion`
--

LOCK TABLES `planaccion` WRITE;
/*!40000 ALTER TABLE `planaccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `planaccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pluginsetting`
--

DROP TABLE IF EXISTS `pluginsetting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pluginsetting` (
  `pluginSettingId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `pluginId` varchar(75) DEFAULT NULL,
  `pluginType` varchar(75) DEFAULT NULL,
  `roles` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`pluginSettingId`),
  UNIQUE KEY `IX_7171B2E8` (`companyId`,`pluginId`,`pluginType`),
  KEY `IX_B9746445` (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pluginsetting`
--

LOCK TABLES `pluginsetting` WRITE;
/*!40000 ALTER TABLE `pluginsetting` DISABLE KEYS */;
/*!40000 ALTER TABLE `pluginsetting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pollschoice`
--

DROP TABLE IF EXISTS `pollschoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pollschoice` (
  `uuid_` varchar(75) DEFAULT NULL,
  `choiceId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `questionId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`choiceId`),
  UNIQUE KEY `IX_D76DD2CF` (`questionId`,`name`),
  UNIQUE KEY `IX_C222BD31` (`uuid_`,`groupId`),
  KEY `IX_EC370F10` (`questionId`),
  KEY `IX_6660B399` (`uuid_`),
  KEY `IX_8AE746EF` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pollschoice`
--

LOCK TABLES `pollschoice` WRITE;
/*!40000 ALTER TABLE `pollschoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `pollschoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pollsquestion`
--

DROP TABLE IF EXISTS `pollsquestion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pollsquestion` (
  `uuid_` varchar(75) DEFAULT NULL,
  `questionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `expirationDate` datetime DEFAULT NULL,
  `lastVoteDate` datetime DEFAULT NULL,
  PRIMARY KEY (`questionId`),
  UNIQUE KEY `IX_F3C9F36` (`uuid_`,`groupId`),
  KEY `IX_9FF342EA` (`groupId`),
  KEY `IX_51F087F4` (`uuid_`),
  KEY `IX_F910BBB4` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pollsquestion`
--

LOCK TABLES `pollsquestion` WRITE;
/*!40000 ALTER TABLE `pollsquestion` DISABLE KEYS */;
/*!40000 ALTER TABLE `pollsquestion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pollsvote`
--

DROP TABLE IF EXISTS `pollsvote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pollsvote` (
  `uuid_` varchar(75) DEFAULT NULL,
  `voteId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `questionId` bigint(20) DEFAULT NULL,
  `choiceId` bigint(20) DEFAULT NULL,
  `voteDate` datetime DEFAULT NULL,
  PRIMARY KEY (`voteId`),
  UNIQUE KEY `IX_1BBFD4D3` (`questionId`,`userId`),
  UNIQUE KEY `IX_A88C673A` (`uuid_`,`groupId`),
  KEY `IX_D5DF7B54` (`choiceId`),
  KEY `IX_12112599` (`questionId`),
  KEY `IX_FD32EB70` (`uuid_`),
  KEY `IX_7D8E92B8` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pollsvote`
--

LOCK TABLES `pollsvote` WRITE;
/*!40000 ALTER TABLE `pollsvote` DISABLE KEYS */;
/*!40000 ALTER TABLE `pollsvote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portalpreferences`
--

DROP TABLE IF EXISTS `portalpreferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `portalpreferences` (
  `portalPreferencesId` bigint(20) NOT NULL,
  `ownerId` bigint(20) DEFAULT NULL,
  `ownerType` int(11) DEFAULT NULL,
  `preferences` longtext,
  PRIMARY KEY (`portalPreferencesId`),
  KEY `IX_D1F795F1` (`ownerId`,`ownerType`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portalpreferences`
--

LOCK TABLES `portalpreferences` WRITE;
/*!40000 ALTER TABLE `portalpreferences` DISABLE KEYS */;
INSERT INTO `portalpreferences` VALUES (20154,0,1,'<portlet-preferences><preference><name>mail.session.mail</name><value>true</value></preference><preference><name>mail.session.mail.smtp.user</name><value>user1</value></preference><preference><name>mail.session.mail.pop3.host</name><value>mail.globalhitss.com</value></preference><preference><name>mail.session.mail.pop3.user</name><value>user1</value></preference><preference><name>mail.session.mail.advanced.properties</name><value></value></preference><preference><name>mail.session.mail.pop3.password</name><value>1234</value></preference><preference><name>mail.session.mail.store.protocol</name><value>pop3</value></preference><preference><name>mail.session.mail.pop3.port</name><value>110</value></preference><preference><name>mail.session.mail.transport.protocol</name><value>smtp</value></preference><preference><name>mail.session.mail.smtp.host</name><value>mail.globalhitss.com</value></preference><preference><name>mail.session.mail.smtp.password</name><value>1234</value></preference><preference><name>mail.session.mail.smtp.port</name><value>25</value></preference></portlet-preferences>'),(20161,20155,1,'<portlet-preferences />'),(20433,20159,4,'<portlet-preferences />'),(20434,20159,4,'<portlet-preferences />'),(20529,20199,4,'<portlet-preferences><preference><name>15#articles-order-by-col</name><value>id</value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.pages</name><value>closed</value></preference><preference><name>125#users-order-by-col</name><value>last-name</value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.configuration</name><value>closed</value></preference><preference><name>com.liferay.portal.util.SessionClicks#_145_portletCategory4</name><value>open</value></preference><preference><name>15#articles-order-by-type</name><value>asc</value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.content</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#liferay_toggle_controls</name><value>visible</value></preference><preference><name>com.liferay.portal.util.SessionClicks#templateDetailsSectionPanel</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#_145_portletCategory0</name><value>closed</value></preference><preference><name>com.liferay.portal.util.SessionClicks#liferay_addpanel_tab</name><value>applications</value></preference><preference><name>125#users-order-by-type</name><value>asc</value></preference><preference><name>com.liferay.portal.util.SessionClicks#p_auth</name><value>sIrXjVHe</value></preference><preference><name>com.liferay.portal.util.SessionClicks#_145_portletCategory10</name><value>open</value></preference></portlet-preferences>');
/*!40000 ALTER TABLE `portalpreferences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portlet`
--

DROP TABLE IF EXISTS `portlet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `portlet` (
  `id_` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `portletId` varchar(200) DEFAULT NULL,
  `roles` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id_`),
  UNIQUE KEY `IX_12B5E51D` (`companyId`,`portletId`),
  KEY `IX_80CC9508` (`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portlet`
--

LOCK TABLES `portlet` WRITE;
/*!40000 ALTER TABLE `portlet` DISABLE KEYS */;
INSERT INTO `portlet` VALUES (20205,20155,'98','',0),(20206,20155,'183','',1),(20207,20155,'66','',1),(20208,20155,'180','',1),(20209,20155,'27','',1),(20210,20155,'152','',1),(20211,20155,'134','',1),(20212,20155,'130','',1),(20213,20155,'122','',1),(20214,20155,'36','',1),(20215,20155,'26','',1),(20216,20155,'175','',1),(20217,20155,'153','',1),(20218,20155,'64','',1),(20219,20155,'129','',1),(20220,20155,'182','',1),(20221,20155,'179','',1),(20222,20155,'173','',0),(20223,20155,'100','',1),(20224,20155,'19','',1),(20225,20155,'157','',1),(20226,20155,'181','',1),(20227,20155,'128','',1),(20228,20155,'154','',1),(20229,20155,'148','',1),(20230,20155,'11','',1),(20231,20155,'29','',1),(20232,20155,'158','',1),(20233,20155,'178','',1),(20234,20155,'58','',1),(20235,20155,'71','',1),(20236,20155,'97','',1),(20237,20155,'39','',1),(20238,20155,'85','',1),(20239,20155,'118','',1),(20240,20155,'107','',1),(20241,20155,'30','',1),(20242,20155,'184','',1),(20243,20155,'147','',1),(20244,20155,'48','',1),(20245,20155,'125','',1),(20246,20155,'161','',1),(20247,20155,'146','',1),(20248,20155,'62','',0),(20249,20155,'162','',1),(20250,20155,'176','',1),(20251,20155,'108','',1),(20252,20155,'187','',1),(20253,20155,'84','',1),(20254,20155,'101','',1),(20255,20155,'121','',1),(20256,20155,'143','',1),(20257,20155,'77','',1),(20258,20155,'167','',1),(20259,20155,'115','',1),(20260,20155,'56','',1),(20261,20155,'16','',1),(20262,20155,'3','',1),(20263,20155,'20','',1),(20264,20155,'23','',1),(20265,20155,'83','',1),(20266,20155,'99','',1),(20267,20155,'186','',1),(20268,20155,'194','',1),(20269,20155,'70','',1),(20270,20155,'164','',1),(20271,20155,'141','',1),(20272,20155,'9','',1),(20273,20155,'28','',1),(20274,20155,'137','',1),(20275,20155,'15','',1),(20276,20155,'47','',1),(20277,20155,'116','',1),(20278,20155,'82','',1),(20279,20155,'151','',1),(20280,20155,'54','',1),(20281,20155,'34','',1),(20282,20155,'132','',1),(20283,20155,'169','',1),(20284,20155,'61','',1),(20285,20155,'73','',1),(20286,20155,'50','',1),(20287,20155,'127','',1),(20288,20155,'193','',1),(20289,20155,'31','',1),(20290,20155,'25','',1),(20291,20155,'166','',1),(20292,20155,'33','',1),(20293,20155,'150','',1),(20294,20155,'114','',1),(20295,20155,'149','',1),(20296,20155,'67','',1),(20297,20155,'110','',1),(20298,20155,'59','',1),(20299,20155,'135','',1),(20300,20155,'188','',1),(20301,20155,'131','',1),(20302,20155,'102','',1),(20450,20155,'1_WAR_calendarportlet','',1),(20501,20155,'1_WAR_notificationsportlet','',1),(20506,20155,'4_WAR_opensocialportlet','',1),(20507,20155,'2_WAR_opensocialportlet','',1),(20508,20155,'1_WAR_opensocialportlet','',1),(20509,20155,'3_WAR_opensocialportlet','',1),(20516,20155,'1_WAR_webformportlet','',1),(20592,20155,'SeleccionarPersonal_WAR_revportlet','',1),(20593,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet','',1),(20594,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet','',1),(20595,20155,'ProgramaEntrevista_WAR_revportlet','',1),(20596,20155,'ActualizarSolicitudRequerimiento_WAR_revportlet','',1),(20597,20155,'PublicarOferta_WAR_revportlet','',1),(20598,20155,'RegistrarResultadoEntrevista_WAR_revportlet','',1),(20599,20155,'EvaluarFechaIngreso_WAR_revportlet','',1),(22511,20155,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','',1),(27101,20155,'demotest_WAR_demotestportlet','',1);
/*!40000 ALTER TABLE `portlet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portletitem`
--

DROP TABLE IF EXISTS `portletitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `portletitem` (
  `portletItemId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `portletId` varchar(200) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`portletItemId`),
  KEY `IX_96BDD537` (`groupId`,`classNameId`),
  KEY `IX_D699243F` (`groupId`,`name`,`portletId`,`classNameId`),
  KEY `IX_2C61314E` (`groupId`,`portletId`),
  KEY `IX_E922D6C0` (`groupId`,`portletId`,`classNameId`),
  KEY `IX_8E71167F` (`groupId`,`portletId`,`classNameId`,`name`),
  KEY `IX_33B8CE8D` (`groupId`,`portletId`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portletitem`
--

LOCK TABLES `portletitem` WRITE;
/*!40000 ALTER TABLE `portletitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `portletitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `portletpreferences`
--

DROP TABLE IF EXISTS `portletpreferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `portletpreferences` (
  `portletPreferencesId` bigint(20) NOT NULL,
  `ownerId` bigint(20) DEFAULT NULL,
  `ownerType` int(11) DEFAULT NULL,
  `plid` bigint(20) DEFAULT NULL,
  `portletId` varchar(200) DEFAULT NULL,
  `preferences` longtext,
  PRIMARY KEY (`portletPreferencesId`),
  UNIQUE KEY `IX_C7057FF7` (`ownerId`,`ownerType`,`plid`,`portletId`),
  KEY `IX_E4F13E6E` (`ownerId`,`ownerType`,`plid`),
  KEY `IX_C9A3FCE2` (`ownerId`,`ownerType`,`portletId`),
  KEY `IX_D5EDA3A1` (`ownerType`,`plid`,`portletId`),
  KEY `IX_A3B2A80C` (`ownerType`,`portletId`),
  KEY `IX_F15C1C4F` (`plid`),
  KEY `IX_D340DB76` (`plid`,`portletId`),
  KEY `IX_8E6DA3A1` (`portletId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `portletpreferences`
--

LOCK TABLES `portletpreferences` WRITE;
/*!40000 ALTER TABLE `portletpreferences` DISABLE KEYS */;
INSERT INTO `portletpreferences` VALUES (20327,0,3,20320,'148_INSTANCE_saHROptkJ4PX','<portlet-preferences><preference><name>showAssetCount</name><value>true</value></preference><preference><name>showZeroAssetCount</name><value>false</value></preference><preference><name>classNameId</name><value>20007</value></preference><preference><name>displayStyle</name><value>cloud</value></preference><preference><name>maxAssetTags</name><value>10</value></preference></portlet-preferences>'),(20348,0,3,20342,'141_INSTANCE_BlhIR1PCUUy2','<portlet-preferences><preference><name>showAssetCount</name><value>true</value></preference><preference><name>classNameId</name><value>20016</value></preference></portlet-preferences>'),(20367,0,3,20361,'3','<portlet-preferences><preference><name>portletSetupShowBorders</name><value>false</value></preference></portlet-preferences>'),(20368,0,3,20361,'101_INSTANCE_Q8nqPwYAC0Ar','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>anyAssetType</name><value>false</value></preference><preference><name>portletSetupTitle_en_US</name><value>Upcoming Events</value></preference></portlet-preferences>'),(20393,0,3,20387,'3','<portlet-preferences><preference><name>portletSetupShowBorders</name><value>false</value></preference></portlet-preferences>'),(20394,0,3,20387,'82','<portlet-preferences><preference><name>displayStyle</name><value>3</value></preference></portlet-preferences>'),(20395,0,3,20387,'101_INSTANCE_AqPCCFxiPQzm','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>portletSetupTitle_en_US</name><value>Recent Content</value></preference></portlet-preferences>'),(20402,0,3,20396,'20','<portlet-preferences><preference><name>portletSetupShowBorders</name><value>false</value></preference></portlet-preferences>'),(20403,0,3,20396,'101_INSTANCE_xKzmsZzdVdqI','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>anyAssetType</name><value>false</value></preference><preference><name>portletSetupTitle_en_US</name><value>Upcoming Events</value></preference></portlet-preferences>'),(20410,0,3,20404,'39_INSTANCE_NiGqRblDnM8V','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>expandedEntriesPerFeed</name><value>3</value></preference><preference><name>urls</name><value>http://partners.userland.com/nytRss/technology.xml</value></preference><preference><name>entriesPerFeed</name><value>4</value></preference><preference><name>portletSetupTitle_en_US</name><value>Technology news</value></preference></portlet-preferences>'),(20411,0,3,20404,'39_INSTANCE_Qyr1XVXNJIKr','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>expandedEntriesPerFeed</name><value>0</value></preference><preference><name>urls</name><value>http://www.liferay.com/en/about-us/news/-/blogs/rss</value></preference><preference><name>titles</name><value>Liferay Press Releases</value></preference><preference><name>entriesPerFeed</name><value>4</value></preference><preference><name>portletSetupTitle_en_US</name><value>Liferay news</value></preference></portlet-preferences>'),(20530,0,3,20185,'145','<portlet-preferences />'),(20531,0,3,20185,'2_WAR_notificationsportlet','<portlet-preferences />'),(20557,0,3,20176,'190','<portlet-preferences />'),(20558,0,3,20176,'145','<portlet-preferences />'),(20559,0,3,20176,'2_WAR_notificationsportlet','<portlet-preferences />'),(20600,0,3,20176,'134','<portlet-preferences />'),(20601,0,3,20176,'137','<portlet-preferences />'),(20602,0,3,20176,'160','<portlet-preferences />'),(20603,0,3,20176,'156','<portlet-preferences />'),(20627,0,3,20176,'165','<portlet-preferences />'),(20640,0,3,20628,'145','<portlet-preferences />'),(20641,0,3,20628,'2_WAR_notificationsportlet','<portlet-preferences />'),(20642,0,3,20628,'ActualizarSolicitudReclutamiento_WAR_revportlet_INSTANCE_PVbvt9tHVL1v','<portlet-preferences />'),(20643,0,3,20634,'145','<portlet-preferences />'),(20644,0,3,20634,'2_WAR_notificationsportlet','<portlet-preferences />'),(20646,0,3,20176,'3_WAR_marketplaceportlet','<portlet-preferences />'),(20647,20199,4,20176,'3_WAR_marketplaceportlet','<portlet-preferences />'),(20648,0,3,20176,'130','<portlet-preferences />'),(20649,0,3,20176,'128','<portlet-preferences />'),(20901,0,3,20176,'125','<portlet-preferences />'),(21301,0,3,20176,'15','<portlet-preferences />'),(21302,20623,2,0,'15','<portlet-preferences />'),(21303,0,3,20176,'99','<portlet-preferences />'),(21304,0,3,20176,'139','<portlet-preferences />'),(21319,0,3,20176,'147','<portlet-preferences />'),(21324,0,3,20176,'25','<portlet-preferences />'),(21325,20623,2,0,'25','<portlet-preferences />'),(21401,0,3,20176,'167','<portlet-preferences />'),(22401,0,3,20176,'174','<portlet-preferences />'),(25501,0,3,20634,'EvaluarSolicitudRequerimiento_WAR_revportlet_INSTANCE_Ghm29e75sRuF','<portlet-preferences />'),(25901,0,3,25801,'145','<portlet-preferences />'),(25902,0,3,25801,'2_WAR_notificationsportlet','<portlet-preferences />'),(26011,0,3,25909,'145','<portlet-preferences />'),(26012,0,3,25909,'2_WAR_notificationsportlet','<portlet-preferences />'),(26013,0,3,25909,'PublicarOferta_WAR_revportlet_INSTANCE_pYbcNlTAznXM','<portlet-preferences />'),(26014,0,3,25903,'145','<portlet-preferences />'),(26015,0,3,25903,'2_WAR_notificationsportlet','<portlet-preferences />'),(26016,0,3,25903,'ProgramaEntrevista_WAR_revportlet_INSTANCE_hpN3fKQ24Uo5','<portlet-preferences />'),(26017,0,3,25915,'145','<portlet-preferences />'),(26018,0,3,25915,'2_WAR_notificationsportlet','<portlet-preferences />'),(26019,0,3,25915,'RegistrarResultadoEntrevista_WAR_revportlet_INSTANCE_GPsiPA0asYdc','<portlet-preferences />'),(26020,0,3,25921,'145','<portlet-preferences />'),(26021,0,3,25921,'2_WAR_notificationsportlet','<portlet-preferences />'),(26022,0,3,25921,'SeleccionarPersonal_WAR_revportlet_INSTANCE_eLyDHlApH4eb','<portlet-preferences />'),(26023,0,3,25801,'EvaluarFechaIngreso_WAR_revportlet_INSTANCE_albqsp7rAam4','<portlet-preferences />'),(27122,0,3,20185,'demotest_WAR_demotestportlet','<portlet-preferences />'),(27123,20182,2,0,'15','<portlet-preferences />'),(27124,0,3,20176,'166','<portlet-preferences />'),(27141,0,3,20185,'56_INSTANCE_ic7ak16aYMsW','<portlet-preferences><preference><name>showAvailableLocales</name><value>false</value></preference><preference><name>enableViewCountIncrement</name><value>true</value></preference><preference><name>enableRatings</name><value>true</value></preference><preference><name>articleId</name><value>27130</value></preference><preference><name>extensions</name><value>NULL_VALUE</value></preference><preference><name>enableRelatedAssets</name><value>true</value></preference><preference><name>enablePrint</name><value>false</value></preference><preference><name>enableCommentRatings</name><value>true</value></preference><preference><name>ddmTemplateKey</name><value></value></preference><preference><name>groupId</name><value>20182</value></preference><preference><name>enableComments</name><value>true</value></preference></portlet-preferences>');
/*!40000 ALTER TABLE `portletpreferences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `postulacion`
--

DROP TABLE IF EXISTS `postulacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `postulacion` (
  `solicitudRequerimientoId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) NOT NULL,
  `fechaPostulacion` datetime DEFAULT NULL,
  `estado` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`solicitudRequerimientoId`,`usuarioId`),
  KEY `IX_CFC74745` (`solicitudRequerimientoId`),
  KEY `IX_E272E5F4` (`solicitudRequerimientoId`,`usuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postulacion`
--

LOCK TABLES `postulacion` WRITE;
/*!40000 ALTER TABLE `postulacion` DISABLE KEYS */;
INSERT INTO `postulacion` VALUES (1,22230,'2016-05-07 06:56:39',70,1,22239,'2016-05-07 06:56:39',22239,NULL),(1,22248,'2016-05-07 06:56:39',70,1,22239,'2016-05-07 06:56:39',22239,NULL),(1,22257,'2016-05-07 06:56:39',71,1,22239,'2016-05-07 06:56:39',22239,NULL),(2,22212,'2016-05-07 06:56:39',73,1,22239,'2016-05-07 06:56:39',22239,NULL),(2,22248,'2016-05-07 06:56:39',71,1,22239,'2016-05-07 06:56:39',22239,NULL),(2,22257,'2016-05-07 06:56:39',73,1,22239,'2016-05-07 06:56:39',22239,NULL),(3,22230,'2016-05-07 06:56:39',72,1,22239,'2016-05-07 06:56:39',22239,NULL),(3,22248,'2016-05-07 06:56:39',71,1,22239,'2016-05-07 06:56:39',22239,NULL),(3,22257,'2016-05-07 06:56:39',71,1,22239,'2016-05-07 06:56:39',22239,NULL),(4,22212,'2016-05-07 06:56:39',72,1,22239,'2016-05-07 06:56:39',22239,NULL),(4,22230,'2016-05-07 06:56:39',74,1,22239,'2016-05-07 06:56:39',22239,NULL),(4,22248,'2016-05-07 06:56:39',71,1,22239,'2016-05-07 06:56:39',22239,NULL),(4,22257,'2016-05-07 06:56:39',72,1,22239,'2016-05-07 06:56:39',22239,NULL);
/*!40000 ALTER TABLE `postulacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pregunta`
--

DROP TABLE IF EXISTS `pregunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pregunta` (
  `preguntaId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`preguntaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pregunta`
--

LOCK TABLES `pregunta` WRITE;
/*!40000 ALTER TABLE `pregunta` DISABLE KEYS */;
/*!40000 ALTER TABLE `pregunta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prioridadgrupousuarios`
--

DROP TABLE IF EXISTS `prioridadgrupousuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prioridadgrupousuarios` (
  `prioridadGrupoUsuariosId` bigint(20) NOT NULL,
  `solicitudEvaluacionDesempennoId` bigint(20) DEFAULT NULL,
  `responsableGrupo` varchar(75) DEFAULT NULL,
  `grupoUsuario` varchar(75) DEFAULT NULL,
  `orden` int(11) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`prioridadGrupoUsuariosId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prioridadgrupousuarios`
--

LOCK TABLES `prioridadgrupousuarios` WRITE;
/*!40000 ALTER TABLE `prioridadgrupousuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `prioridadgrupousuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `puesto`
--

DROP TABLE IF EXISTS `puesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `puesto` (
  `puestoId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `categoria` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechacreamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`puestoId`),
  KEY `IX_24B38389` (`descripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `puesto`
--

LOCK TABLES `puesto` WRITE;
/*!40000 ALTER TABLE `puesto` DISABLE KEYS */;
/*!40000 ALTER TABLE `puesto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_blob_triggers`
--

DROP TABLE IF EXISTS `quartz_blob_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_blob_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `BLOB_DATA` longblob,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_blob_triggers`
--

LOCK TABLES `quartz_blob_triggers` WRITE;
/*!40000 ALTER TABLE `quartz_blob_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_blob_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_calendars`
--

DROP TABLE IF EXISTS `quartz_calendars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_calendars` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `CALENDAR_NAME` varchar(200) NOT NULL,
  `CALENDAR` longblob NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`CALENDAR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_calendars`
--

LOCK TABLES `quartz_calendars` WRITE;
/*!40000 ALTER TABLE `quartz_calendars` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_calendars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_cron_triggers`
--

DROP TABLE IF EXISTS `quartz_cron_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_cron_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `CRON_EXPRESSION` varchar(200) NOT NULL,
  `TIME_ZONE_ID` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_cron_triggers`
--

LOCK TABLES `quartz_cron_triggers` WRITE;
/*!40000 ALTER TABLE `quartz_cron_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_cron_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_fired_triggers`
--

DROP TABLE IF EXISTS `quartz_fired_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_fired_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `ENTRY_ID` varchar(95) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `INSTANCE_NAME` varchar(200) NOT NULL,
  `FIRED_TIME` bigint(20) NOT NULL,
  `PRIORITY` int(11) NOT NULL,
  `STATE` varchar(16) NOT NULL,
  `JOB_NAME` varchar(200) DEFAULT NULL,
  `JOB_GROUP` varchar(200) DEFAULT NULL,
  `IS_NONCONCURRENT` tinyint(4) DEFAULT NULL,
  `REQUESTS_RECOVERY` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`ENTRY_ID`),
  KEY `IX_BE3835E5` (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  KEY `IX_4BD722BM` (`SCHED_NAME`,`TRIGGER_GROUP`),
  KEY `IX_204D31E8` (`SCHED_NAME`,`INSTANCE_NAME`),
  KEY `IX_339E078M` (`SCHED_NAME`,`INSTANCE_NAME`,`REQUESTS_RECOVERY`),
  KEY `IX_5005E3AF` (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`),
  KEY `IX_BC2F03B0` (`SCHED_NAME`,`JOB_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_fired_triggers`
--

LOCK TABLES `quartz_fired_triggers` WRITE;
/*!40000 ALTER TABLE `quartz_fired_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_fired_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_job_details`
--

DROP TABLE IF EXISTS `quartz_job_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_job_details` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `JOB_NAME` varchar(200) NOT NULL,
  `JOB_GROUP` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(250) DEFAULT NULL,
  `JOB_CLASS_NAME` varchar(250) NOT NULL,
  `IS_DURABLE` tinyint(4) NOT NULL,
  `IS_NONCONCURRENT` tinyint(4) NOT NULL,
  `IS_UPDATE_DATA` tinyint(4) NOT NULL,
  `REQUESTS_RECOVERY` tinyint(4) NOT NULL,
  `JOB_DATA` longblob,
  PRIMARY KEY (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`),
  KEY `IX_88328984` (`SCHED_NAME`,`JOB_GROUP`),
  KEY `IX_779BCA37` (`SCHED_NAME`,`REQUESTS_RECOVERY`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_job_details`
--

LOCK TABLES `quartz_job_details` WRITE;
/*!40000 ALTER TABLE `quartz_job_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_job_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_locks`
--

DROP TABLE IF EXISTS `quartz_locks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_locks` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `LOCK_NAME` varchar(40) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`LOCK_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_locks`
--

LOCK TABLES `quartz_locks` WRITE;
/*!40000 ALTER TABLE `quartz_locks` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_locks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_paused_trigger_grps`
--

DROP TABLE IF EXISTS `quartz_paused_trigger_grps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_paused_trigger_grps` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_paused_trigger_grps`
--

LOCK TABLES `quartz_paused_trigger_grps` WRITE;
/*!40000 ALTER TABLE `quartz_paused_trigger_grps` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_paused_trigger_grps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_scheduler_state`
--

DROP TABLE IF EXISTS `quartz_scheduler_state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_scheduler_state` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `INSTANCE_NAME` varchar(200) NOT NULL,
  `LAST_CHECKIN_TIME` bigint(20) NOT NULL,
  `CHECKIN_INTERVAL` bigint(20) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`INSTANCE_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_scheduler_state`
--

LOCK TABLES `quartz_scheduler_state` WRITE;
/*!40000 ALTER TABLE `quartz_scheduler_state` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_scheduler_state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_simple_triggers`
--

DROP TABLE IF EXISTS `quartz_simple_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_simple_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `REPEAT_COUNT` bigint(20) NOT NULL,
  `REPEAT_INTERVAL` bigint(20) NOT NULL,
  `TIMES_TRIGGERED` bigint(20) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_simple_triggers`
--

LOCK TABLES `quartz_simple_triggers` WRITE;
/*!40000 ALTER TABLE `quartz_simple_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_simple_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_simprop_triggers`
--

DROP TABLE IF EXISTS `quartz_simprop_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_simprop_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `STR_PROP_1` varchar(512) DEFAULT NULL,
  `STR_PROP_2` varchar(512) DEFAULT NULL,
  `STR_PROP_3` varchar(512) DEFAULT NULL,
  `INT_PROP_1` int(11) DEFAULT NULL,
  `INT_PROP_2` int(11) DEFAULT NULL,
  `LONG_PROP_1` bigint(20) DEFAULT NULL,
  `LONG_PROP_2` bigint(20) DEFAULT NULL,
  `DEC_PROP_1` decimal(13,4) DEFAULT NULL,
  `DEC_PROP_2` decimal(13,4) DEFAULT NULL,
  `BOOL_PROP_1` tinyint(4) DEFAULT NULL,
  `BOOL_PROP_2` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_simprop_triggers`
--

LOCK TABLES `quartz_simprop_triggers` WRITE;
/*!40000 ALTER TABLE `quartz_simprop_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_simprop_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quartz_triggers`
--

DROP TABLE IF EXISTS `quartz_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quartz_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `JOB_NAME` varchar(200) NOT NULL,
  `JOB_GROUP` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(250) DEFAULT NULL,
  `NEXT_FIRE_TIME` bigint(20) DEFAULT NULL,
  `PREV_FIRE_TIME` bigint(20) DEFAULT NULL,
  `PRIORITY` int(11) DEFAULT NULL,
  `TRIGGER_STATE` varchar(16) NOT NULL,
  `TRIGGER_TYPE` varchar(8) NOT NULL,
  `START_TIME` bigint(20) NOT NULL,
  `END_TIME` bigint(20) DEFAULT NULL,
  `CALENDAR_NAME` varchar(200) DEFAULT NULL,
  `MISFIRE_INSTR` int(11) DEFAULT NULL,
  `JOB_DATA` longblob,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  KEY `IX_186442A4` (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`,`TRIGGER_STATE`),
  KEY `IX_1BA1F9DC` (`SCHED_NAME`,`TRIGGER_GROUP`),
  KEY `IX_91CA7CCE` (`SCHED_NAME`,`TRIGGER_GROUP`,`NEXT_FIRE_TIME`,`TRIGGER_STATE`,`MISFIRE_INSTR`),
  KEY `IX_D219AFDE` (`SCHED_NAME`,`TRIGGER_GROUP`,`TRIGGER_STATE`),
  KEY `IX_A85822A0` (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`),
  KEY `IX_8AA50BE1` (`SCHED_NAME`,`JOB_GROUP`),
  KEY `IX_EEFE382A` (`SCHED_NAME`,`NEXT_FIRE_TIME`),
  KEY `IX_F026CF4C` (`SCHED_NAME`,`NEXT_FIRE_TIME`,`TRIGGER_STATE`),
  KEY `IX_F2DD7C7E` (`SCHED_NAME`,`NEXT_FIRE_TIME`,`TRIGGER_STATE`,`MISFIRE_INSTR`),
  KEY `IX_1F92813C` (`SCHED_NAME`,`NEXT_FIRE_TIME`,`MISFIRE_INSTR`),
  KEY `IX_99108B6E` (`SCHED_NAME`,`TRIGGER_STATE`),
  KEY `IX_CD7132D0` (`SCHED_NAME`,`CALENDAR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quartz_triggers`
--

LOCK TABLES `quartz_triggers` WRITE;
/*!40000 ALTER TABLE `quartz_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratingsentry`
--

DROP TABLE IF EXISTS `ratingsentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ratingsentry` (
  `entryId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `score` double DEFAULT NULL,
  PRIMARY KEY (`entryId`),
  UNIQUE KEY `IX_B47E3C11` (`userId`,`classNameId`,`classPK`),
  KEY `IX_16184D57` (`classNameId`,`classPK`),
  KEY `IX_A1A8CB8B` (`classNameId`,`classPK`,`score`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratingsentry`
--

LOCK TABLES `ratingsentry` WRITE;
/*!40000 ALTER TABLE `ratingsentry` DISABLE KEYS */;
INSERT INTO `ratingsentry` VALUES (27143,20155,20199,'Test Test','2016-06-18 05:52:22','2016-06-18 05:52:22',20109,27132,2);
/*!40000 ALTER TABLE `ratingsentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratingsstats`
--

DROP TABLE IF EXISTS `ratingsstats`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ratingsstats` (
  `statsId` bigint(20) NOT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `totalEntries` int(11) DEFAULT NULL,
  `totalScore` double DEFAULT NULL,
  `averageScore` double DEFAULT NULL,
  PRIMARY KEY (`statsId`),
  UNIQUE KEY `IX_A6E99284` (`classNameId`,`classPK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratingsstats`
--

LOCK TABLES `ratingsstats` WRITE;
/*!40000 ALTER TABLE `ratingsstats` DISABLE KEYS */;
INSERT INTO `ratingsstats` VALUES (27135,20109,27132,1,2,2);
/*!40000 ALTER TABLE `ratingsstats` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rec_actividadplanusuario`
--

DROP TABLE IF EXISTS `rec_actividadplanusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rec_actividadplanusuario` (
  `actividadPlanId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`actividadPlanId`,`userId`),
  KEY `IX_71D8AD94` (`actividadPlanId`),
  KEY `IX_9E887CF7` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rec_actividadplanusuario`
--

LOCK TABLES `rec_actividadplanusuario` WRITE;
/*!40000 ALTER TABLE `rec_actividadplanusuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `rec_actividadplanusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rec_fasepostulacionevaluacion`
--

DROP TABLE IF EXISTS `rec_fasepostulacionevaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rec_fasepostulacionevaluacion` (
  `evaluacionId` bigint(20) NOT NULL,
  `fasePostulacionId` bigint(20) NOT NULL,
  PRIMARY KEY (`evaluacionId`,`fasePostulacionId`),
  KEY `IX_ABA1E4E2` (`evaluacionId`),
  KEY `IX_78468627` (`fasePostulacionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rec_fasepostulacionevaluacion`
--

LOCK TABLES `rec_fasepostulacionevaluacion` WRITE;
/*!40000 ALTER TABLE `rec_fasepostulacionevaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `rec_fasepostulacionevaluacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rec_preguntarespuesta`
--

DROP TABLE IF EXISTS `rec_preguntarespuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rec_preguntarespuesta` (
  `preguntaId` bigint(20) NOT NULL,
  `respuestaId` bigint(20) NOT NULL,
  PRIMARY KEY (`preguntaId`,`respuestaId`),
  KEY `IX_9A360F46` (`preguntaId`),
  KEY `IX_26854F9E` (`respuestaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rec_preguntarespuesta`
--

LOCK TABLES `rec_preguntarespuesta` WRITE;
/*!40000 ALTER TABLE `rec_preguntarespuesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `rec_preguntarespuesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rec_solicitudrequerimientofuncion`
--

DROP TABLE IF EXISTS `rec_solicitudrequerimientofuncion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rec_solicitudrequerimientofuncion` (
  `funcionId` bigint(20) NOT NULL,
  `solicitudRequerimientoId` bigint(20) NOT NULL,
  PRIMARY KEY (`funcionId`,`solicitudRequerimientoId`),
  KEY `IX_13820ED5` (`funcionId`),
  KEY `IX_B967CB2A` (`solicitudRequerimientoId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rec_solicitudrequerimientofuncion`
--

LOCK TABLES `rec_solicitudrequerimientofuncion` WRITE;
/*!40000 ALTER TABLE `rec_solicitudrequerimientofuncion` DISABLE KEYS */;
/*!40000 ALTER TABLE `rec_solicitudrequerimientofuncion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `referencia`
--

DROP TABLE IF EXISTS `referencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `referencia` (
  `referenciaId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) NOT NULL,
  `empresa` varchar(75) DEFAULT NULL,
  `telefono` varchar(75) DEFAULT NULL,
  `responsable` varchar(75) DEFAULT NULL,
  `motivo` varchar(75) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`referenciaId`,`usuarioId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `referencia`
--

LOCK TABLES `referencia` WRITE;
/*!40000 ALTER TABLE `referencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `referencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `region`
--

DROP TABLE IF EXISTS `region`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `region` (
  `regionId` bigint(20) NOT NULL,
  `countryId` bigint(20) DEFAULT NULL,
  `regionCode` varchar(75) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`regionId`),
  UNIQUE KEY `IX_A2635F5C` (`countryId`,`regionCode`),
  KEY `IX_2D9A426F` (`active_`),
  KEY `IX_16D87CA7` (`countryId`),
  KEY `IX_11FB3E42` (`countryId`,`active_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `region`
--

LOCK TABLES `region` WRITE;
/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` VALUES (1001,1,'AB','Alberta',1),(1002,1,'BC','British Columbia',1),(1003,1,'MB','Manitoba',1),(1004,1,'NB','New Brunswick',1),(1005,1,'NL','Newfoundland and Labrador',1),(1006,1,'NT','Northwest Territories',1),(1007,1,'NS','Nova Scotia',1),(1008,1,'NU','Nunavut',1),(1009,1,'ON','Ontario',1),(1010,1,'PE','Prince Edward Island',1),(1011,1,'QC','Quebec',1),(1012,1,'SK','Saskatchewan',1),(1013,1,'YT','Yukon',1),(2001,2,'CN-34','Anhui',1),(2002,2,'CN-92','Aomen',1),(2003,2,'CN-11','Beijing',1),(2004,2,'CN-50','Chongqing',1),(2005,2,'CN-35','Fujian',1),(2006,2,'CN-62','Gansu',1),(2007,2,'CN-44','Guangdong',1),(2008,2,'CN-45','Guangxi',1),(2009,2,'CN-52','Guizhou',1),(2010,2,'CN-46','Hainan',1),(2011,2,'CN-13','Hebei',1),(2012,2,'CN-23','Heilongjiang',1),(2013,2,'CN-41','Henan',1),(2014,2,'CN-42','Hubei',1),(2015,2,'CN-43','Hunan',1),(2016,2,'CN-32','Jiangsu',1),(2017,2,'CN-36','Jiangxi',1),(2018,2,'CN-22','Jilin',1),(2019,2,'CN-21','Liaoning',1),(2020,2,'CN-15','Nei Mongol',1),(2021,2,'CN-64','Ningxia',1),(2022,2,'CN-63','Qinghai',1),(2023,2,'CN-61','Shaanxi',1),(2024,2,'CN-37','Shandong',1),(2025,2,'CN-31','Shanghai',1),(2026,2,'CN-14','Shanxi',1),(2027,2,'CN-51','Sichuan',1),(2028,2,'CN-71','Taiwan',1),(2029,2,'CN-12','Tianjin',1),(2030,2,'CN-91','Xianggang',1),(2031,2,'CN-65','Xinjiang',1),(2032,2,'CN-54','Xizang',1),(2033,2,'CN-53','Yunnan',1),(2034,2,'CN-33','Zhejiang',1),(3001,3,'A','Alsace',1),(3002,3,'B','Aquitaine',1),(3003,3,'C','Auvergne',1),(3004,3,'P','Basse-Normandie',1),(3005,3,'D','Bourgogne',1),(3006,3,'E','Bretagne',1),(3007,3,'F','Centre',1),(3008,3,'G','Champagne-Ardenne',1),(3009,3,'H','Corse',1),(3010,3,'GF','Guyane',1),(3011,3,'I','Franche Comté',1),(3012,3,'GP','Guadeloupe',1),(3013,3,'Q','Haute-Normandie',1),(3014,3,'J','Île-de-France',1),(3015,3,'K','Languedoc-Roussillon',1),(3016,3,'L','Limousin',1),(3017,3,'M','Lorraine',1),(3018,3,'MQ','Martinique',1),(3019,3,'N','Midi-Pyrénées',1),(3020,3,'O','Nord Pas de Calais',1),(3021,3,'R','Pays de la Loire',1),(3022,3,'S','Picardie',1),(3023,3,'T','Poitou-Charentes',1),(3024,3,'U','Provence-Alpes-Côte-d\'Azur',1),(3025,3,'RE','Réunion',1),(3026,3,'V','Rhône-Alpes',1),(4001,4,'BW','Baden-Württemberg',1),(4002,4,'BY','Bayern',1),(4003,4,'BE','Berlin',1),(4004,4,'BB','Brandenburg',1),(4005,4,'HB','Bremen',1),(4006,4,'HH','Hamburg',1),(4007,4,'HE','Hessen',1),(4008,4,'MV','Mecklenburg-Vorpommern',1),(4009,4,'NI','Niedersachsen',1),(4010,4,'NW','Nordrhein-Westfalen',1),(4011,4,'RP','Rheinland-Pfalz',1),(4012,4,'SL','Saarland',1),(4013,4,'SN','Sachsen',1),(4014,4,'ST','Sachsen-Anhalt',1),(4015,4,'SH','Schleswig-Holstein',1),(4016,4,'TH','Thüringen',1),(8001,8,'AG','Agrigento',1),(8002,8,'AL','Alessandria',1),(8003,8,'AN','Ancona',1),(8004,8,'AO','Aosta',1),(8005,8,'AR','Arezzo',1),(8006,8,'AP','Ascoli Piceno',1),(8007,8,'AT','Asti',1),(8008,8,'AV','Avellino',1),(8009,8,'BA','Bari',1),(8010,8,'BT','Barletta-Andria-Trani',1),(8011,8,'BL','Belluno',1),(8012,8,'BN','Benevento',1),(8013,8,'BG','Bergamo',1),(8014,8,'BI','Biella',1),(8015,8,'BO','Bologna',1),(8016,8,'BZ','Bolzano',1),(8017,8,'BS','Brescia',1),(8018,8,'BR','Brindisi',1),(8019,8,'CA','Cagliari',1),(8020,8,'CL','Caltanissetta',1),(8021,8,'CB','Campobasso',1),(8022,8,'CI','Carbonia-Iglesias',1),(8023,8,'CE','Caserta',1),(8024,8,'CT','Catania',1),(8025,8,'CZ','Catanzaro',1),(8026,8,'CH','Chieti',1),(8027,8,'CO','Como',1),(8028,8,'CS','Cosenza',1),(8029,8,'CR','Cremona',1),(8030,8,'KR','Crotone',1),(8031,8,'CN','Cuneo',1),(8032,8,'EN','Enna',1),(8033,8,'FM','Fermo',1),(8034,8,'FE','Ferrara',1),(8035,8,'FI','Firenze',1),(8036,8,'FG','Foggia',1),(8037,8,'FC','Forli-Cesena',1),(8038,8,'FR','Frosinone',1),(8039,8,'GE','Genova',1),(8040,8,'GO','Gorizia',1),(8041,8,'GR','Grosseto',1),(8042,8,'IM','Imperia',1),(8043,8,'IS','Isernia',1),(8044,8,'AQ','L\'Aquila',1),(8045,8,'SP','La Spezia',1),(8046,8,'LT','Latina',1),(8047,8,'LE','Lecce',1),(8048,8,'LC','Lecco',1),(8049,8,'LI','Livorno',1),(8050,8,'LO','Lodi',1),(8051,8,'LU','Lucca',1),(8052,8,'MC','Macerata',1),(8053,8,'MN','Mantova',1),(8054,8,'MS','Massa-Carrara',1),(8055,8,'MT','Matera',1),(8056,8,'MA','Medio Campidano',1),(8057,8,'ME','Messina',1),(8058,8,'MI','Milano',1),(8059,8,'MO','Modena',1),(8060,8,'MB','Monza e Brianza',1),(8061,8,'NA','Napoli',1),(8062,8,'NO','Novara',1),(8063,8,'NU','Nuoro',1),(8064,8,'OG','Ogliastra',1),(8065,8,'OT','Olbia-Tempio',1),(8066,8,'OR','Oristano',1),(8067,8,'PD','Padova',1),(8068,8,'PA','Palermo',1),(8069,8,'PR','Parma',1),(8070,8,'PV','Pavia',1),(8071,8,'PG','Perugia',1),(8072,8,'PU','Pesaro e Urbino',1),(8073,8,'PE','Pescara',1),(8074,8,'PC','Piacenza',1),(8075,8,'PI','Pisa',1),(8076,8,'PT','Pistoia',1),(8077,8,'PN','Pordenone',1),(8078,8,'PZ','Potenza',1),(8079,8,'PO','Prato',1),(8080,8,'RG','Ragusa',1),(8081,8,'RA','Ravenna',1),(8082,8,'RC','Reggio Calabria',1),(8083,8,'RE','Reggio Emilia',1),(8084,8,'RI','Rieti',1),(8085,8,'RN','Rimini',1),(8086,8,'RM','Roma',1),(8087,8,'RO','Rovigo',1),(8088,8,'SA','Salerno',1),(8089,8,'SS','Sassari',1),(8090,8,'SV','Savona',1),(8091,8,'SI','Siena',1),(8092,8,'SR','Siracusa',1),(8093,8,'SO','Sondrio',1),(8094,8,'TA','Taranto',1),(8095,8,'TE','Teramo',1),(8096,8,'TR','Terni',1),(8097,8,'TO','Torino',1),(8098,8,'TP','Trapani',1),(8099,8,'TN','Trento',1),(8100,8,'TV','Treviso',1),(8101,8,'TS','Trieste',1),(8102,8,'UD','Udine',1),(8103,8,'VA','Varese',1),(8104,8,'VE','Venezia',1),(8105,8,'VB','Verbano-Cusio-Ossola',1),(8106,8,'VC','Vercelli',1),(8107,8,'VR','Verona',1),(8108,8,'VV','Vibo Valentia',1),(8109,8,'VI','Vicenza',1),(8110,8,'VT','Viterbo',1),(11001,11,'DR','Drenthe',1),(11002,11,'FL','Flevoland',1),(11003,11,'FR','Friesland',1),(11004,11,'GE','Gelderland',1),(11005,11,'GR','Groningen',1),(11006,11,'LI','Limburg',1),(11007,11,'NB','Noord-Brabant',1),(11008,11,'NH','Noord-Holland',1),(11009,11,'OV','Overijssel',1),(11010,11,'UT','Utrecht',1),(11011,11,'ZE','Zeeland',1),(11012,11,'ZH','Zuid-Holland',1),(15001,15,'AN','Andalusia',1),(15002,15,'AR','Aragon',1),(15003,15,'AS','Asturias',1),(15004,15,'IB','Balearic Islands',1),(15005,15,'PV','Basque Country',1),(15006,15,'CN','Canary Islands',1),(15007,15,'CB','Cantabria',1),(15008,15,'CL','Castile and Leon',1),(15009,15,'CM','Castile-La Mancha',1),(15010,15,'CT','Catalonia',1),(15011,15,'CE','Ceuta',1),(15012,15,'EX','Extremadura',1),(15013,15,'GA','Galicia',1),(15014,15,'LO','La Rioja',1),(15015,15,'M','Madrid',1),(15016,15,'ML','Melilla',1),(15017,15,'MU','Murcia',1),(15018,15,'NA','Navarra',1),(15019,15,'VC','Valencia',1),(19001,19,'AL','Alabama',1),(19002,19,'AK','Alaska',1),(19003,19,'AZ','Arizona',1),(19004,19,'AR','Arkansas',1),(19005,19,'CA','California',1),(19006,19,'CO','Colorado',1),(19007,19,'CT','Connecticut',1),(19008,19,'DC','District of Columbia',1),(19009,19,'DE','Delaware',1),(19010,19,'FL','Florida',1),(19011,19,'GA','Georgia',1),(19012,19,'HI','Hawaii',1),(19013,19,'ID','Idaho',1),(19014,19,'IL','Illinois',1),(19015,19,'IN','Indiana',1),(19016,19,'IA','Iowa',1),(19017,19,'KS','Kansas',1),(19018,19,'KY','Kentucky ',1),(19019,19,'LA','Louisiana ',1),(19020,19,'ME','Maine',1),(19021,19,'MD','Maryland',1),(19022,19,'MA','Massachusetts',1),(19023,19,'MI','Michigan',1),(19024,19,'MN','Minnesota',1),(19025,19,'MS','Mississippi',1),(19026,19,'MO','Missouri',1),(19027,19,'MT','Montana',1),(19028,19,'NE','Nebraska',1),(19029,19,'NV','Nevada',1),(19030,19,'NH','New Hampshire',1),(19031,19,'NJ','New Jersey',1),(19032,19,'NM','New Mexico',1),(19033,19,'NY','New York',1),(19034,19,'NC','North Carolina',1),(19035,19,'ND','North Dakota',1),(19036,19,'OH','Ohio',1),(19037,19,'OK','Oklahoma ',1),(19038,19,'OR','Oregon',1),(19039,19,'PA','Pennsylvania',1),(19040,19,'PR','Puerto Rico',1),(19041,19,'RI','Rhode Island',1),(19042,19,'SC','South Carolina',1),(19043,19,'SD','South Dakota',1),(19044,19,'TN','Tennessee',1),(19045,19,'TX','Texas',1),(19046,19,'UT','Utah',1),(19047,19,'VT','Vermont',1),(19048,19,'VA','Virginia',1),(19049,19,'WA','Washington',1),(19050,19,'WV','West Virginia',1),(19051,19,'WI','Wisconsin',1),(19052,19,'WY','Wyoming',1),(32001,32,'ACT','Australian Capital Territory',1),(32002,32,'NSW','New South Wales',1),(32003,32,'NT','Northern Territory',1),(32004,32,'QLD','Queensland',1),(32005,32,'SA','South Australia',1),(32006,32,'TAS','Tasmania',1),(32007,32,'VIC','Victoria',1),(32008,32,'WA','Western Australia',1),(144001,144,'MX-AGS','Aguascalientes',1),(144002,144,'MX-BCN','Baja California',1),(144003,144,'MX-BCS','Baja California Sur',1),(144004,144,'MX-CAM','Campeche',1),(144005,144,'MX-CHP','Chiapas',1),(144006,144,'MX-CHI','Chihuahua',1),(144007,144,'MX-COA','Coahuila',1),(144008,144,'MX-COL','Colima',1),(144009,144,'MX-DUR','Durango',1),(144010,144,'MX-GTO','Guanajuato',1),(144011,144,'MX-GRO','Guerrero',1),(144012,144,'MX-HGO','Hidalgo',1),(144013,144,'MX-JAL','Jalisco',1),(144014,144,'MX-MEX','Mexico',1),(144015,144,'MX-MIC','Michoacan',1),(144016,144,'MX-MOR','Morelos',1),(144017,144,'MX-NAY','Nayarit',1),(144018,144,'MX-NLE','Nuevo Leon',1),(144019,144,'MX-OAX','Oaxaca',1),(144020,144,'MX-PUE','Puebla',1),(144021,144,'MX-QRO','Queretaro',1),(144023,144,'MX-ROO','Quintana Roo',1),(144024,144,'MX-SLP','San Luis Potosí',1),(144025,144,'MX-SIN','Sinaloa',1),(144026,144,'MX-SON','Sonora',1),(144027,144,'MX-TAB','Tabasco',1),(144028,144,'MX-TAM','Tamaulipas',1),(144029,144,'MX-TLX','Tlaxcala',1),(144030,144,'MX-VER','Veracruz',1),(144031,144,'MX-YUC','Yucatan',1),(144032,144,'MX-ZAC','Zacatecas',1),(164001,164,'01','Østfold',1),(164002,164,'02','Akershus',1),(164003,164,'03','Oslo',1),(164004,164,'04','Hedmark',1),(164005,164,'05','Oppland',1),(164006,164,'06','Buskerud',1),(164007,164,'07','Vestfold',1),(164008,164,'08','Telemark',1),(164009,164,'09','Aust-Agder',1),(164010,164,'10','Vest-Agder',1),(164011,164,'11','Rogaland',1),(164012,164,'12','Hordaland',1),(164013,164,'14','Sogn og Fjordane',1),(164014,164,'15','Møre of Romsdal',1),(164015,164,'16','Sør-Trøndelag',1),(164016,164,'17','Nord-Trøndelag',1),(164017,164,'18','Nordland',1),(164018,164,'19','Troms',1),(164019,164,'20','Finnmark',1),(202001,202,'AG','Aargau',1),(202002,202,'AR','Appenzell Ausserrhoden',1),(202003,202,'AI','Appenzell Innerrhoden',1),(202004,202,'BL','Basel-Landschaft',1),(202005,202,'BS','Basel-Stadt',1),(202006,202,'BE','Bern',1),(202007,202,'FR','Fribourg',1),(202008,202,'GE','Geneva',1),(202009,202,'GL','Glarus',1),(202010,202,'GR','Graubünden',1),(202011,202,'JU','Jura',1),(202012,202,'LU','Lucerne',1),(202013,202,'NE','Neuchâtel',1),(202014,202,'NW','Nidwalden',1),(202015,202,'OW','Obwalden',1),(202016,202,'SH','Schaffhausen',1),(202017,202,'SZ','Schwyz',1),(202018,202,'SO','Solothurn',1),(202019,202,'SG','St. Gallen',1),(202020,202,'TG','Thurgau',1),(202021,202,'TI','Ticino',1),(202022,202,'UR','Uri',1),(202023,202,'VS','Valais',1),(202024,202,'VD','Vaud',1),(202025,202,'ZG','Zug',1),(202026,202,'ZH','Zürich',1);
/*!40000 ALTER TABLE `region` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `release_`
--

DROP TABLE IF EXISTS `release_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `release_` (
  `releaseId` bigint(20) NOT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `servletContextName` varchar(75) DEFAULT NULL,
  `buildNumber` int(11) DEFAULT NULL,
  `buildDate` datetime DEFAULT NULL,
  `verified` tinyint(4) DEFAULT NULL,
  `state_` int(11) DEFAULT NULL,
  `testString` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`releaseId`),
  UNIQUE KEY `IX_8BD6BCA7` (`servletContextName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `release_`
--

LOCK TABLES `release_` WRITE;
/*!40000 ALTER TABLE `release_` DISABLE KEYS */;
INSERT INTO `release_` VALUES (1,'2016-05-04 00:36:55','2016-08-17 06:59:07','portal',6205,'2016-08-17 06:59:07',1,0,'You take the blue pill, the story ends, you wake up in your bed and believe whatever you want to believe. You take the red pill, you stay in Wonderland, and I show you how deep the rabbit hole goes.'),(20441,'2016-05-04 07:41:50','2016-08-17 07:00:20','marketplace-portlet',100,NULL,1,0,''),(20449,'2016-05-04 07:41:56','2016-08-17 07:00:24','calendar-portlet',102,NULL,1,0,''),(20468,'2016-05-04 07:42:12','2016-08-17 07:00:29','kaleo-web',110,NULL,1,0,''),(20500,'2016-05-04 07:42:14','2016-08-17 07:00:37','notifications-portlet',110,NULL,1,0,''),(20515,'2016-05-04 07:42:20','2016-08-17 07:02:28','sync-web',101,NULL,1,0,'');
/*!40000 ALTER TABLE `release_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repository`
--

DROP TABLE IF EXISTS `repository`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repository` (
  `uuid_` varchar(75) DEFAULT NULL,
  `repositoryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `portletId` varchar(200) DEFAULT NULL,
  `typeSettings` longtext,
  `dlFolderId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`repositoryId`),
  UNIQUE KEY `IX_60C8634C` (`groupId`,`name`,`portletId`),
  UNIQUE KEY `IX_11641E26` (`uuid_`,`groupId`),
  KEY `IX_5253B1FA` (`groupId`),
  KEY `IX_74C17B04` (`uuid_`),
  KEY `IX_F543EA4` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repository`
--

LOCK TABLES `repository` WRITE;
/*!40000 ALTER TABLE `repository` DISABLE KEYS */;
/*!40000 ALTER TABLE `repository` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `repositoryentry`
--

DROP TABLE IF EXISTS `repositoryentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repositoryentry` (
  `uuid_` varchar(75) DEFAULT NULL,
  `repositoryEntryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `mappedId` varchar(75) DEFAULT NULL,
  `manualCheckInRequired` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`repositoryEntryId`),
  UNIQUE KEY `IX_9BDCF489` (`repositoryId`,`mappedId`),
  UNIQUE KEY `IX_354AA664` (`uuid_`,`groupId`),
  KEY `IX_B7034B27` (`repositoryId`),
  KEY `IX_B9B1506` (`uuid_`),
  KEY `IX_D3B9AF62` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repositoryentry`
--

LOCK TABLES `repositoryentry` WRITE;
/*!40000 ALTER TABLE `repositoryentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `repositoryentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `requisito`
--

DROP TABLE IF EXISTS `requisito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `requisito` (
  `requisitoId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `nivel` bigint(20) DEFAULT NULL,
  `exigible` tinyint(4) DEFAULT NULL,
  `herramienta` bigint(20) DEFAULT NULL,
  `tipoRequisito` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechacreamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`requisitoId`),
  KEY `IX_BF01054` (`descripcion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `requisito`
--

LOCK TABLES `requisito` WRITE;
/*!40000 ALTER TABLE `requisito` DISABLE KEYS */;
/*!40000 ALTER TABLE `requisito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resourceaction`
--

DROP TABLE IF EXISTS `resourceaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resourceaction` (
  `resourceActionId` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `actionId` varchar(75) DEFAULT NULL,
  `bitwiseValue` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`resourceActionId`),
  UNIQUE KEY `IX_EDB9986E` (`name`,`actionId`),
  KEY `IX_81F2DB09` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resourceaction`
--

LOCK TABLES `resourceaction` WRITE;
/*!40000 ALTER TABLE `resourceaction` DISABLE KEYS */;
INSERT INTO `resourceaction` VALUES (1,'com.liferay.portlet.softwarecatalog','ADD_FRAMEWORK_VERSION',2),(2,'com.liferay.portlet.softwarecatalog','ADD_PRODUCT_ENTRY',4),(3,'com.liferay.portlet.softwarecatalog','PERMISSIONS',8),(4,'com.liferay.portal.model.Team','ASSIGN_MEMBERS',2),(5,'com.liferay.portal.model.Team','DELETE',4),(6,'com.liferay.portal.model.Team','PERMISSIONS',8),(7,'com.liferay.portal.model.Team','UPDATE',16),(8,'com.liferay.portal.model.Team','VIEW',1),(9,'com.liferay.portal.model.PasswordPolicy','ASSIGN_MEMBERS',2),(10,'com.liferay.portal.model.PasswordPolicy','DELETE',4),(11,'com.liferay.portal.model.PasswordPolicy','PERMISSIONS',8),(12,'com.liferay.portal.model.PasswordPolicy','UPDATE',16),(13,'com.liferay.portal.model.PasswordPolicy','VIEW',1),(14,'com.liferay.portlet.blogs.model.BlogsEntry','ADD_DISCUSSION',2),(15,'com.liferay.portlet.blogs.model.BlogsEntry','DELETE',4),(16,'com.liferay.portlet.blogs.model.BlogsEntry','DELETE_DISCUSSION',8),(17,'com.liferay.portlet.blogs.model.BlogsEntry','PERMISSIONS',16),(18,'com.liferay.portlet.blogs.model.BlogsEntry','UPDATE',32),(19,'com.liferay.portlet.blogs.model.BlogsEntry','UPDATE_DISCUSSION',64),(20,'com.liferay.portlet.blogs.model.BlogsEntry','VIEW',1),(21,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','DELETE',2),(22,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','PERMISSIONS',4),(23,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','UPDATE',8),(24,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','VIEW',1),(25,'com.liferay.portlet.journal.model.JournalFeed','DELETE',2),(26,'com.liferay.portlet.journal.model.JournalFeed','PERMISSIONS',4),(27,'com.liferay.portlet.journal.model.JournalFeed','UPDATE',8),(28,'com.liferay.portlet.journal.model.JournalFeed','VIEW',1),(29,'com.liferay.portlet.wiki.model.WikiNode','ADD_ATTACHMENT',2),(30,'com.liferay.portlet.wiki.model.WikiNode','ADD_PAGE',4),(31,'com.liferay.portlet.wiki.model.WikiNode','DELETE',8),(32,'com.liferay.portlet.wiki.model.WikiNode','IMPORT',16),(33,'com.liferay.portlet.wiki.model.WikiNode','PERMISSIONS',32),(34,'com.liferay.portlet.wiki.model.WikiNode','SUBSCRIBE',64),(35,'com.liferay.portlet.wiki.model.WikiNode','UPDATE',128),(36,'com.liferay.portlet.wiki.model.WikiNode','VIEW',1),(37,'com.liferay.portlet.announcements.model.AnnouncementsEntry','DELETE',2),(38,'com.liferay.portlet.announcements.model.AnnouncementsEntry','UPDATE',4),(39,'com.liferay.portlet.announcements.model.AnnouncementsEntry','VIEW',1),(40,'com.liferay.portlet.announcements.model.AnnouncementsEntry','PERMISSIONS',8),(41,'com.liferay.portlet.bookmarks','ADD_ENTRY',2),(42,'com.liferay.portlet.bookmarks','ADD_FOLDER',4),(43,'com.liferay.portlet.bookmarks','PERMISSIONS',8),(44,'com.liferay.portlet.bookmarks','SUBSCRIBE',16),(45,'com.liferay.portlet.bookmarks','VIEW',1),(46,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','DELETE',2),(47,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','PERMISSIONS',4),(48,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','UPDATE',8),(49,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','VIEW',1),(50,'com.liferay.portlet.asset.model.AssetVocabulary','DELETE',2),(51,'com.liferay.portlet.asset.model.AssetVocabulary','PERMISSIONS',4),(52,'com.liferay.portlet.asset.model.AssetVocabulary','UPDATE',8),(53,'com.liferay.portlet.asset.model.AssetVocabulary','VIEW',1),(54,'com.liferay.portlet.documentlibrary.model.DLFolder','ACCESS',2),(55,'com.liferay.portlet.documentlibrary.model.DLFolder','ADD_DOCUMENT',4),(56,'com.liferay.portlet.documentlibrary.model.DLFolder','ADD_SHORTCUT',8),(57,'com.liferay.portlet.documentlibrary.model.DLFolder','ADD_SUBFOLDER',16),(58,'com.liferay.portlet.documentlibrary.model.DLFolder','DELETE',32),(59,'com.liferay.portlet.documentlibrary.model.DLFolder','PERMISSIONS',64),(60,'com.liferay.portlet.documentlibrary.model.DLFolder','UPDATE',128),(61,'com.liferay.portlet.documentlibrary.model.DLFolder','VIEW',1),(62,'com.liferay.portlet.expando.model.ExpandoColumn','DELETE',2),(63,'com.liferay.portlet.expando.model.ExpandoColumn','PERMISSIONS',4),(64,'com.liferay.portlet.expando.model.ExpandoColumn','UPDATE',8),(65,'com.liferay.portlet.expando.model.ExpandoColumn','VIEW',1),(66,'com.liferay.portlet.documentlibrary','ADD_DOCUMENT',2),(67,'com.liferay.portlet.documentlibrary','ADD_DOCUMENT_TYPE',4),(68,'com.liferay.portlet.documentlibrary','ADD_FOLDER',8),(69,'com.liferay.portlet.documentlibrary','ADD_REPOSITORY',16),(70,'com.liferay.portlet.documentlibrary','ADD_STRUCTURE',32),(71,'com.liferay.portlet.documentlibrary','ADD_SHORTCUT',64),(72,'com.liferay.portlet.documentlibrary','PERMISSIONS',128),(73,'com.liferay.portlet.documentlibrary','SUBSCRIBE',256),(74,'com.liferay.portlet.documentlibrary','UPDATE',512),(75,'com.liferay.portlet.documentlibrary','VIEW',1),(76,'com.liferay.portlet.calendar.model.CalEvent','ADD_DISCUSSION',2),(77,'com.liferay.portlet.calendar.model.CalEvent','DELETE',4),(78,'com.liferay.portlet.calendar.model.CalEvent','DELETE_DISCUSSION',8),(79,'com.liferay.portlet.calendar.model.CalEvent','PERMISSIONS',16),(80,'com.liferay.portlet.calendar.model.CalEvent','UPDATE',32),(81,'com.liferay.portlet.calendar.model.CalEvent','UPDATE_DISCUSSION',64),(82,'com.liferay.portlet.calendar.model.CalEvent','VIEW',1),(83,'com.liferay.portlet.shopping.model.ShoppingCategory','ADD_ITEM',2),(84,'com.liferay.portlet.shopping.model.ShoppingCategory','ADD_SUBCATEGORY',4),(85,'com.liferay.portlet.shopping.model.ShoppingCategory','DELETE',8),(86,'com.liferay.portlet.shopping.model.ShoppingCategory','PERMISSIONS',16),(87,'com.liferay.portlet.shopping.model.ShoppingCategory','UPDATE',32),(88,'com.liferay.portlet.shopping.model.ShoppingCategory','VIEW',1),(89,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','DELETE',2),(90,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','PERMISSIONS',4),(91,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','UPDATE',8),(92,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','VIEW',1),(93,'com.liferay.portlet.journal','ADD_ARTICLE',2),(94,'com.liferay.portlet.journal','ADD_FEED',4),(95,'com.liferay.portlet.journal','ADD_FOLDER',8),(96,'com.liferay.portlet.journal','ADD_STRUCTURE',16),(97,'com.liferay.portlet.journal','ADD_TEMPLATE',32),(98,'com.liferay.portlet.journal','SUBSCRIBE',64),(99,'com.liferay.portlet.journal','VIEW',1),(100,'com.liferay.portlet.journal','PERMISSIONS',128),(101,'com.liferay.portlet.calendar','ADD_EVENT',2),(102,'com.liferay.portlet.calendar','EXPORT_ALL_EVENTS',4),(103,'com.liferay.portlet.calendar','PERMISSIONS',8),(104,'com.liferay.portal.model.LayoutPrototype','DELETE',2),(105,'com.liferay.portal.model.LayoutPrototype','PERMISSIONS',4),(106,'com.liferay.portal.model.LayoutPrototype','UPDATE',8),(107,'com.liferay.portal.model.LayoutPrototype','VIEW',1),(108,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','ADD_RECORD',2),(109,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','DELETE',4),(110,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','PERMISSIONS',8),(111,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','UPDATE',16),(112,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','VIEW',1),(113,'com.liferay.portal.model.Organization','ADD_ORGANIZATION',2),(114,'com.liferay.portal.model.Organization','ASSIGN_MEMBERS',4),(115,'com.liferay.portal.model.Organization','ASSIGN_USER_ROLES',8),(116,'com.liferay.portal.model.Organization','DELETE',16),(117,'com.liferay.portal.model.Organization','MANAGE_ANNOUNCEMENTS',32),(118,'com.liferay.portal.model.Organization','MANAGE_SUBORGANIZATIONS',64),(119,'com.liferay.portal.model.Organization','MANAGE_USERS',128),(120,'com.liferay.portal.model.Organization','PERMISSIONS',256),(121,'com.liferay.portal.model.Organization','UPDATE',512),(122,'com.liferay.portal.model.Organization','VIEW',1),(123,'com.liferay.portal.model.Organization','VIEW_MEMBERS',1024),(124,'com.liferay.portlet.softwarecatalog.model.SCLicense','DELETE',2),(125,'com.liferay.portlet.softwarecatalog.model.SCLicense','PERMISSIONS',4),(126,'com.liferay.portlet.softwarecatalog.model.SCLicense','UPDATE',8),(127,'com.liferay.portlet.softwarecatalog.model.SCLicense','VIEW',1),(128,'com.liferay.portlet.journal.model.JournalFolder','ACCESS',2),(129,'com.liferay.portlet.journal.model.JournalFolder','ADD_ARTICLE',4),(130,'com.liferay.portlet.journal.model.JournalFolder','ADD_SUBFOLDER',8),(131,'com.liferay.portlet.journal.model.JournalFolder','DELETE',16),(132,'com.liferay.portlet.journal.model.JournalFolder','PERMISSIONS',32),(133,'com.liferay.portlet.journal.model.JournalFolder','UPDATE',64),(134,'com.liferay.portlet.journal.model.JournalFolder','VIEW',1),(135,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','DELETE',2),(136,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','PERMISSIONS',4),(137,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','UPDATE',8),(138,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','VIEW',1),(139,'com.liferay.portlet.journal.model.JournalTemplate','DELETE',2),(140,'com.liferay.portlet.journal.model.JournalTemplate','PERMISSIONS',4),(141,'com.liferay.portlet.journal.model.JournalTemplate','UPDATE',8),(142,'com.liferay.portlet.journal.model.JournalTemplate','VIEW',1),(143,'com.liferay.portlet.journal.model.JournalArticle','ADD_DISCUSSION',2),(144,'com.liferay.portlet.journal.model.JournalArticle','DELETE',4),(145,'com.liferay.portlet.journal.model.JournalArticle','DELETE_DISCUSSION',8),(146,'com.liferay.portlet.journal.model.JournalArticle','EXPIRE',16),(147,'com.liferay.portlet.journal.model.JournalArticle','PERMISSIONS',32),(148,'com.liferay.portlet.journal.model.JournalArticle','UPDATE',64),(149,'com.liferay.portlet.journal.model.JournalArticle','UPDATE_DISCUSSION',128),(150,'com.liferay.portlet.journal.model.JournalArticle','VIEW',1),(151,'com.liferay.portlet.dynamicdatalists','ADD_RECORD_SET',2),(152,'com.liferay.portlet.dynamicdatalists','ADD_STRUCTURE',4),(153,'com.liferay.portlet.dynamicdatalists','ADD_TEMPLATE',8),(154,'com.liferay.portlet.dynamicdatalists','PERMISSIONS',16),(155,'com.liferay.portlet.bookmarks.model.BookmarksFolder','ACCESS',2),(156,'com.liferay.portlet.bookmarks.model.BookmarksFolder','ADD_ENTRY',4),(157,'com.liferay.portlet.bookmarks.model.BookmarksFolder','ADD_SUBFOLDER',8),(158,'com.liferay.portlet.bookmarks.model.BookmarksFolder','DELETE',16),(159,'com.liferay.portlet.bookmarks.model.BookmarksFolder','PERMISSIONS',32),(160,'com.liferay.portlet.bookmarks.model.BookmarksFolder','SUBSCRIBE',64),(161,'com.liferay.portlet.bookmarks.model.BookmarksFolder','UPDATE',128),(162,'com.liferay.portlet.bookmarks.model.BookmarksFolder','VIEW',1),(163,'com.liferay.portal.model.Group','ADD_COMMUNITY',2),(164,'com.liferay.portal.model.Group','ADD_LAYOUT',4),(165,'com.liferay.portal.model.Group','ADD_LAYOUT_BRANCH',8),(166,'com.liferay.portal.model.Group','ADD_LAYOUT_SET_BRANCH',16),(167,'com.liferay.portal.model.Group','ASSIGN_MEMBERS',32),(168,'com.liferay.portal.model.Group','ASSIGN_USER_ROLES',64),(169,'com.liferay.portal.model.Group','CONFIGURE_PORTLETS',128),(170,'com.liferay.portal.model.Group','DELETE',256),(171,'com.liferay.portal.model.Group','EXPORT_IMPORT_LAYOUTS',512),(172,'com.liferay.portal.model.Group','EXPORT_IMPORT_PORTLET_INFO',1024),(173,'com.liferay.portal.model.Group','MANAGE_ANNOUNCEMENTS',2048),(174,'com.liferay.portal.model.Group','MANAGE_ARCHIVED_SETUPS',4096),(175,'com.liferay.portal.model.Group','MANAGE_LAYOUTS',8192),(176,'com.liferay.portal.model.Group','MANAGE_STAGING',16384),(177,'com.liferay.portal.model.Group','MANAGE_SUBGROUPS',32768),(178,'com.liferay.portal.model.Group','MANAGE_TEAMS',65536),(179,'com.liferay.portal.model.Group','PERMISSIONS',131072),(180,'com.liferay.portal.model.Group','PREVIEW_IN_DEVICE',262144),(181,'com.liferay.portal.model.Group','PUBLISH_STAGING',524288),(182,'com.liferay.portal.model.Group','PUBLISH_TO_REMOTE',1048576),(183,'com.liferay.portal.model.Group','UPDATE',2097152),(184,'com.liferay.portal.model.Group','VIEW',1),(185,'com.liferay.portal.model.Group','VIEW_MEMBERS',4194304),(186,'com.liferay.portal.model.Group','VIEW_SITE_ADMINISTRATION',8388608),(187,'com.liferay.portal.model.Group','VIEW_STAGING',16777216),(188,'com.liferay.portlet.journal.model.JournalStructure','DELETE',2),(189,'com.liferay.portlet.journal.model.JournalStructure','PERMISSIONS',4),(190,'com.liferay.portlet.journal.model.JournalStructure','UPDATE',8),(191,'com.liferay.portlet.journal.model.JournalStructure','VIEW',1),(192,'com.liferay.portlet.asset.model.AssetTag','DELETE',2),(193,'com.liferay.portlet.asset.model.AssetTag','PERMISSIONS',4),(194,'com.liferay.portlet.asset.model.AssetTag','UPDATE',8),(195,'com.liferay.portlet.asset.model.AssetTag','VIEW',1),(196,'com.liferay.portal.model.Layout','ADD_DISCUSSION',2),(197,'com.liferay.portal.model.Layout','ADD_LAYOUT',4),(198,'com.liferay.portal.model.Layout','CONFIGURE_PORTLETS',8),(199,'com.liferay.portal.model.Layout','CUSTOMIZE',16),(200,'com.liferay.portal.model.Layout','DELETE',32),(201,'com.liferay.portal.model.Layout','DELETE_DISCUSSION',64),(202,'com.liferay.portal.model.Layout','PERMISSIONS',128),(203,'com.liferay.portal.model.Layout','UPDATE',256),(204,'com.liferay.portal.model.Layout','UPDATE_DISCUSSION',512),(205,'com.liferay.portal.model.Layout','VIEW',1),(206,'com.liferay.portlet.asset','ADD_TAG',2),(207,'com.liferay.portlet.asset','PERMISSIONS',4),(208,'com.liferay.portlet.asset','ADD_CATEGORY',8),(209,'com.liferay.portlet.asset','ADD_VOCABULARY',16),(210,'com.liferay.portal.model.LayoutBranch','DELETE',2),(211,'com.liferay.portal.model.LayoutBranch','PERMISSIONS',4),(212,'com.liferay.portal.model.LayoutBranch','UPDATE',8),(213,'com.liferay.portal.model.LayoutSetBranch','DELETE',2),(214,'com.liferay.portal.model.LayoutSetBranch','MERGE',4),(215,'com.liferay.portal.model.LayoutSetBranch','PERMISSIONS',8),(216,'com.liferay.portal.model.LayoutSetBranch','UPDATE',16),(217,'com.liferay.portlet.messageboards','ADD_CATEGORY',2),(218,'com.liferay.portlet.messageboards','ADD_FILE',4),(219,'com.liferay.portlet.messageboards','ADD_MESSAGE',8),(220,'com.liferay.portlet.messageboards','BAN_USER',16),(221,'com.liferay.portlet.messageboards','MOVE_THREAD',32),(222,'com.liferay.portlet.messageboards','LOCK_THREAD',64),(223,'com.liferay.portlet.messageboards','PERMISSIONS',128),(224,'com.liferay.portlet.messageboards','REPLY_TO_MESSAGE',256),(225,'com.liferay.portlet.messageboards','SUBSCRIBE',512),(226,'com.liferay.portlet.messageboards','UPDATE_THREAD_PRIORITY',1024),(227,'com.liferay.portlet.messageboards','VIEW',1),(228,'com.liferay.portlet.polls','ADD_QUESTION',2),(229,'com.liferay.portlet.polls','PERMISSIONS',4),(230,'com.liferay.portlet.shopping.model.ShoppingItem','DELETE',2),(231,'com.liferay.portlet.shopping.model.ShoppingItem','PERMISSIONS',4),(232,'com.liferay.portlet.shopping.model.ShoppingItem','UPDATE',8),(233,'com.liferay.portlet.shopping.model.ShoppingItem','VIEW',1),(234,'com.liferay.portlet.bookmarks.model.BookmarksEntry','DELETE',2),(235,'com.liferay.portlet.bookmarks.model.BookmarksEntry','PERMISSIONS',4),(236,'com.liferay.portlet.bookmarks.model.BookmarksEntry','SUBSCRIBE',8),(237,'com.liferay.portlet.bookmarks.model.BookmarksEntry','UPDATE',16),(238,'com.liferay.portlet.bookmarks.model.BookmarksEntry','VIEW',1),(239,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','ADD_DISCUSSION',2),(240,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','DELETE',4),(241,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','DELETE_DISCUSSION',8),(242,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','PERMISSIONS',16),(243,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','UPDATE',32),(244,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','UPDATE_DISCUSSION',64),(245,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','VIEW',1),(246,'com.liferay.portal.model.User','DELETE',2),(247,'com.liferay.portal.model.User','IMPERSONATE',4),(248,'com.liferay.portal.model.User','PERMISSIONS',8),(249,'com.liferay.portal.model.User','UPDATE',16),(250,'com.liferay.portal.model.User','VIEW',1),(251,'com.liferay.portal.model.LayoutSetPrototype','DELETE',2),(252,'com.liferay.portal.model.LayoutSetPrototype','PERMISSIONS',4),(253,'com.liferay.portal.model.LayoutSetPrototype','UPDATE',8),(254,'com.liferay.portal.model.LayoutSetPrototype','VIEW',1),(255,'com.liferay.portlet.shopping','ADD_CATEGORY',2),(256,'com.liferay.portlet.shopping','ADD_ITEM',4),(257,'com.liferay.portlet.shopping','MANAGE_COUPONS',8),(258,'com.liferay.portlet.shopping','MANAGE_ORDERS',16),(259,'com.liferay.portlet.shopping','PERMISSIONS',32),(260,'com.liferay.portlet.shopping','VIEW',1),(261,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion','DELETE',2),(262,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion','PERMISSIONS',4),(263,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion','UPDATE',8),(264,'com.liferay.portlet.wiki','ADD_NODE',2),(265,'com.liferay.portlet.wiki','PERMISSIONS',4),(266,'com.liferay.portlet.polls.model.PollsQuestion','ADD_VOTE',2),(267,'com.liferay.portlet.polls.model.PollsQuestion','DELETE',4),(268,'com.liferay.portlet.polls.model.PollsQuestion','PERMISSIONS',8),(269,'com.liferay.portlet.polls.model.PollsQuestion','UPDATE',16),(270,'com.liferay.portlet.polls.model.PollsQuestion','VIEW',1),(271,'com.liferay.portlet.shopping.model.ShoppingOrder','DELETE',2),(272,'com.liferay.portlet.shopping.model.ShoppingOrder','PERMISSIONS',4),(273,'com.liferay.portlet.shopping.model.ShoppingOrder','UPDATE',8),(274,'com.liferay.portlet.shopping.model.ShoppingOrder','VIEW',1),(275,'com.liferay.portal.model.UserGroup','ASSIGN_MEMBERS',2),(276,'com.liferay.portal.model.UserGroup','DELETE',4),(277,'com.liferay.portal.model.UserGroup','MANAGE_ANNOUNCEMENTS',8),(278,'com.liferay.portal.model.UserGroup','PERMISSIONS',16),(279,'com.liferay.portal.model.UserGroup','UPDATE',32),(280,'com.liferay.portal.model.UserGroup','VIEW',1),(281,'com.liferay.portal.model.UserGroup','VIEW_MEMBERS',64),(282,'com.liferay.portal.model.Role','ASSIGN_MEMBERS',2),(283,'com.liferay.portal.model.Role','DEFINE_PERMISSIONS',4),(284,'com.liferay.portal.model.Role','DELETE',8),(285,'com.liferay.portal.model.Role','MANAGE_ANNOUNCEMENTS',16),(286,'com.liferay.portal.model.Role','PERMISSIONS',32),(287,'com.liferay.portal.model.Role','UPDATE',64),(288,'com.liferay.portal.model.Role','VIEW',1),(289,'com.liferay.portlet.messageboards.model.MBCategory','ADD_FILE',2),(290,'com.liferay.portlet.messageboards.model.MBCategory','ADD_MESSAGE',4),(291,'com.liferay.portlet.messageboards.model.MBCategory','ADD_SUBCATEGORY',8),(292,'com.liferay.portlet.messageboards.model.MBCategory','DELETE',16),(293,'com.liferay.portlet.messageboards.model.MBCategory','LOCK_THREAD',32),(294,'com.liferay.portlet.messageboards.model.MBCategory','MOVE_THREAD',64),(295,'com.liferay.portlet.messageboards.model.MBCategory','PERMISSIONS',128),(296,'com.liferay.portlet.messageboards.model.MBCategory','REPLY_TO_MESSAGE',256),(297,'com.liferay.portlet.messageboards.model.MBCategory','SUBSCRIBE',512),(298,'com.liferay.portlet.messageboards.model.MBCategory','UPDATE',1024),(299,'com.liferay.portlet.messageboards.model.MBCategory','UPDATE_THREAD_PRIORITY',2048),(300,'com.liferay.portlet.messageboards.model.MBCategory','VIEW',1),(301,'com.liferay.portlet.mobiledevicerules','ADD_RULE_GROUP',2),(302,'com.liferay.portlet.mobiledevicerules','ADD_RULE_GROUP_INSTANCE',4),(303,'com.liferay.portlet.mobiledevicerules','CONFIGURATION',8),(304,'com.liferay.portlet.mobiledevicerules','VIEW',1),(305,'com.liferay.portlet.mobiledevicerules','PERMISSIONS',16),(306,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','DELETE',2),(307,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','PERMISSIONS',4),(308,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','UPDATE',8),(309,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','VIEW',1),(310,'com.liferay.portlet.wiki.model.WikiPage','ADD_DISCUSSION',2),(311,'com.liferay.portlet.wiki.model.WikiPage','DELETE',4),(312,'com.liferay.portlet.wiki.model.WikiPage','DELETE_DISCUSSION',8),(313,'com.liferay.portlet.wiki.model.WikiPage','PERMISSIONS',16),(314,'com.liferay.portlet.wiki.model.WikiPage','SUBSCRIBE',32),(315,'com.liferay.portlet.wiki.model.WikiPage','UPDATE',64),(316,'com.liferay.portlet.wiki.model.WikiPage','UPDATE_DISCUSSION',128),(317,'com.liferay.portlet.wiki.model.WikiPage','VIEW',1),(318,'com.liferay.portlet.asset.model.AssetCategory','ADD_CATEGORY',2),(319,'com.liferay.portlet.asset.model.AssetCategory','DELETE',4),(320,'com.liferay.portlet.asset.model.AssetCategory','PERMISSIONS',8),(321,'com.liferay.portlet.asset.model.AssetCategory','UPDATE',16),(322,'com.liferay.portlet.asset.model.AssetCategory','VIEW',1),(323,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','DELETE',2),(324,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','PERMISSIONS',4),(325,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','UPDATE',8),(326,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','VIEW',1),(327,'com.liferay.portlet.messageboards.model.MBMessage','DELETE',2),(328,'com.liferay.portlet.messageboards.model.MBMessage','PERMISSIONS',4),(329,'com.liferay.portlet.messageboards.model.MBMessage','SUBSCRIBE',8),(330,'com.liferay.portlet.messageboards.model.MBMessage','UPDATE',16),(331,'com.liferay.portlet.messageboards.model.MBMessage','VIEW',1),(332,'com.liferay.portlet.messageboards.model.MBThread','SUBSCRIBE',2),(333,'com.liferay.portlet.messageboards.model.MBThread','VIEW',1),(334,'com.liferay.portlet.messageboards.model.MBThread','PERMISSIONS',4),(335,'com.liferay.portlet.blogs','ADD_ENTRY',2),(336,'com.liferay.portlet.blogs','PERMISSIONS',4),(337,'com.liferay.portlet.blogs','SUBSCRIBE',8),(338,'com.liferay.portlet.documentlibrary.model.DLFileEntry','ADD_DISCUSSION',2),(339,'com.liferay.portlet.documentlibrary.model.DLFileEntry','DELETE',4),(340,'com.liferay.portlet.documentlibrary.model.DLFileEntry','DELETE_DISCUSSION',8),(341,'com.liferay.portlet.documentlibrary.model.DLFileEntry','OVERRIDE_CHECKOUT',16),(342,'com.liferay.portlet.documentlibrary.model.DLFileEntry','PERMISSIONS',32),(343,'com.liferay.portlet.documentlibrary.model.DLFileEntry','UPDATE',64),(344,'com.liferay.portlet.documentlibrary.model.DLFileEntry','UPDATE_DISCUSSION',128),(345,'com.liferay.portlet.documentlibrary.model.DLFileEntry','VIEW',1),(346,'134','ACCESS_IN_CONTROL_PANEL',2),(347,'134','CONFIGURATION',4),(348,'134','VIEW',1),(349,'134','PERMISSIONS',8),(350,'134','PREFERENCES',16),(351,'59','ADD_TO_PAGE',2),(352,'59','CONFIGURATION',4),(353,'59','PERMISSIONS',8),(354,'59','PREFERENCES',16),(355,'59','VIEW',1),(356,'139','ACCESS_IN_CONTROL_PANEL',2),(357,'139','ADD_EXPANDO',4),(358,'139','CONFIGURATION',8),(359,'139','VIEW',1),(360,'139','PERMISSIONS',16),(361,'139','PREFERENCES',32),(362,'19','ADD_TO_PAGE',2),(363,'19','CONFIGURATION',4),(364,'19','VIEW',1),(365,'19','PERMISSIONS',8),(366,'19','PREFERENCES',16),(367,'110','ADD_TO_PAGE',2),(368,'110','CONFIGURATION',4),(369,'110','PERMISSIONS',8),(370,'110','PREFERENCES',16),(371,'110','VIEW',1),(372,'36','ADD_PORTLET_DISPLAY_TEMPLATE',2),(373,'36','ADD_TO_PAGE',4),(374,'36','CONFIGURATION',8),(375,'36','VIEW',1),(376,'36','PERMISSIONS',16),(377,'36','PREFERENCES',32),(378,'178','CONFIGURATION',2),(379,'178','VIEW',1),(380,'178','ADD_TO_PAGE',4),(381,'178','PERMISSIONS',8),(382,'178','PREFERENCES',16),(383,'15','ACCESS_IN_CONTROL_PANEL',2),(384,'15','ADD_TO_PAGE',4),(385,'15','CONFIGURATION',8),(386,'15','VIEW',1),(387,'15','PERMISSIONS',16),(388,'15','PREFERENCES',32),(389,'33','ADD_PORTLET_DISPLAY_TEMPLATE',2),(390,'33','ADD_TO_PAGE',4),(391,'33','CONFIGURATION',8),(392,'33','VIEW',1),(393,'33','PERMISSIONS',16),(394,'33','PREFERENCES',32),(395,'34','ADD_TO_PAGE',2),(396,'34','CONFIGURATION',4),(397,'34','VIEW',1),(398,'34','PERMISSIONS',8),(399,'34','PREFERENCES',16),(400,'156','ADD_TO_PAGE',2),(401,'156','CONFIGURATION',4),(402,'156','PERMISSIONS',8),(403,'156','PREFERENCES',16),(404,'156','VIEW',1),(405,'154','ACCESS_IN_CONTROL_PANEL',2),(406,'154','CONFIGURATION',4),(407,'154','VIEW',1),(408,'154','PERMISSIONS',8),(409,'154','PREFERENCES',16),(410,'20','ACCESS_IN_CONTROL_PANEL',2),(411,'20','ADD_PORTLET_DISPLAY_TEMPLATE',4),(412,'20','ADD_TO_PAGE',8),(413,'20','CONFIGURATION',16),(414,'20','VIEW',1),(415,'20','PERMISSIONS',32),(416,'20','PREFERENCES',64),(417,'174','ADD_TO_PAGE',2),(418,'174','CONFIGURATION',4),(419,'174','PERMISSIONS',8),(420,'174','PREFERENCES',16),(421,'174','VIEW',1),(422,'83','ADD_ENTRY',2),(423,'83','ADD_TO_PAGE',4),(424,'83','CONFIGURATION',8),(425,'83','VIEW',1),(426,'83','PERMISSIONS',16),(427,'83','PREFERENCES',32),(428,'99','ACCESS_IN_CONTROL_PANEL',2),(429,'99','CONFIGURATION',4),(430,'99','VIEW',1),(431,'99','PERMISSIONS',8),(432,'99','PREFERENCES',16),(433,'84','ADD_ENTRY',2),(434,'84','ADD_TO_PAGE',4),(435,'84','CONFIGURATION',8),(436,'84','VIEW',1),(437,'84','PERMISSIONS',16),(438,'84','PREFERENCES',32),(439,'98','ACCESS_IN_CONTROL_PANEL',2),(440,'98','ADD_TO_PAGE',4),(441,'98','CONFIGURATION',8),(442,'98','VIEW',1),(443,'98','PERMISSIONS',16),(444,'98','PREFERENCES',32),(445,'125','ACCESS_IN_CONTROL_PANEL',2),(446,'125','CONFIGURATION',4),(447,'125','EXPORT_USER',8),(448,'125','VIEW',1),(449,'125','PERMISSIONS',16),(450,'125','PREFERENCES',32),(451,'127','ADD_TO_PAGE',2),(452,'127','CONFIGURATION',4),(453,'127','PERMISSIONS',8),(454,'127','PREFERENCES',16),(455,'127','VIEW',1),(456,'128','ACCESS_IN_CONTROL_PANEL',2),(457,'128','CONFIGURATION',4),(458,'128','VIEW',1),(459,'128','PERMISSIONS',8),(460,'128','PREFERENCES',16),(461,'146','ACCESS_IN_CONTROL_PANEL',2),(462,'146','CONFIGURATION',4),(463,'146','VIEW',1),(464,'146','PERMISSIONS',8),(465,'146','PREFERENCES',16),(466,'147','ACCESS_IN_CONTROL_PANEL',2),(467,'147','CONFIGURATION',4),(468,'147','VIEW',1),(469,'147','PERMISSIONS',8),(470,'147','PREFERENCES',16),(471,'149','ACCESS_IN_CONTROL_PANEL',2),(472,'149','CONFIGURATION',4),(473,'149','VIEW',1),(474,'149','PERMISSIONS',8),(475,'149','PREFERENCES',16),(476,'169','ADD_TO_PAGE',2),(477,'169','CONFIGURATION',4),(478,'169','PERMISSIONS',8),(479,'169','PREFERENCES',16),(480,'169','VIEW',1),(481,'25','ACCESS_IN_CONTROL_PANEL',2),(482,'25','CONFIGURATION',4),(483,'25','VIEW',1),(484,'25','PERMISSIONS',8),(485,'25','PREFERENCES',16),(486,'129','ACCESS_IN_CONTROL_PANEL',2),(487,'129','CONFIGURATION',4),(488,'129','VIEW',1),(489,'129','PERMISSIONS',8),(490,'129','PREFERENCES',16),(491,'166','ACCESS_IN_CONTROL_PANEL',2),(492,'166','ADD_TO_PAGE',4),(493,'166','CONFIGURATION',8),(494,'166','VIEW',1),(495,'166','PERMISSIONS',16),(496,'166','PREFERENCES',32),(497,'165','ADD_TO_PAGE',2),(498,'165','CONFIGURATION',4),(499,'165','PERMISSIONS',8),(500,'165','PREFERENCES',16),(501,'165','VIEW',1),(502,'28','ACCESS_IN_CONTROL_PANEL',2),(503,'28','ADD_TO_PAGE',4),(504,'28','CONFIGURATION',8),(505,'28','VIEW',1),(506,'28','PERMISSIONS',16),(507,'28','PREFERENCES',32),(508,'167','ACCESS_IN_CONTROL_PANEL',2),(509,'167','ADD_TO_PAGE',4),(510,'167','CONFIGURATION',8),(511,'167','VIEW',1),(512,'167','PERMISSIONS',16),(513,'167','PREFERENCES',32),(514,'161','ACCESS_IN_CONTROL_PANEL',2),(515,'161','CONFIGURATION',4),(516,'161','VIEW',1),(517,'161','PERMISSIONS',8),(518,'161','PREFERENCES',16),(519,'162','ACCESS_IN_CONTROL_PANEL',2),(520,'162','CONFIGURATION',4),(521,'162','VIEW',1),(522,'162','PERMISSIONS',8),(523,'162','PREFERENCES',16),(524,'31','ADD_TO_PAGE',2),(525,'31','CONFIGURATION',4),(526,'31','PERMISSIONS',8),(527,'31','PREFERENCES',16),(528,'31','VIEW',1),(529,'8','ACCESS_IN_CONTROL_PANEL',2),(530,'8','ADD_TO_PAGE',4),(531,'8','CONFIGURATION',8),(532,'8','VIEW',1),(533,'8','PERMISSIONS',16),(534,'8','PREFERENCES',32),(535,'183','VIEW',1),(536,'183','ADD_TO_PAGE',2),(537,'183','CONFIGURATION',4),(538,'183','PERMISSIONS',8),(539,'183','PREFERENCES',16),(540,'183','ACCESS_IN_CONTROL_PANEL',32),(541,'66','VIEW',1),(542,'66','ADD_TO_PAGE',2),(543,'66','CONFIGURATION',4),(544,'66','PERMISSIONS',8),(545,'66','PREFERENCES',16),(546,'66','ACCESS_IN_CONTROL_PANEL',32),(547,'156','ACCESS_IN_CONTROL_PANEL',32),(548,'180','VIEW',1),(549,'180','ADD_TO_PAGE',2),(550,'180','CONFIGURATION',4),(551,'180','PERMISSIONS',8),(552,'180','PREFERENCES',16),(553,'180','ACCESS_IN_CONTROL_PANEL',32),(554,'152','ACCESS_IN_CONTROL_PANEL',2),(555,'152','CONFIGURATION',4),(556,'152','VIEW',1),(557,'152','PERMISSIONS',8),(558,'152','PREFERENCES',16),(559,'27','VIEW',1),(560,'27','ADD_TO_PAGE',2),(561,'27','CONFIGURATION',4),(562,'27','PERMISSIONS',8),(563,'27','PREFERENCES',16),(564,'27','ACCESS_IN_CONTROL_PANEL',32),(565,'88','VIEW',1),(566,'88','ADD_TO_PAGE',2),(567,'88','CONFIGURATION',4),(568,'88','PERMISSIONS',8),(569,'88','PREFERENCES',16),(570,'88','ACCESS_IN_CONTROL_PANEL',32),(571,'130','ACCESS_IN_CONTROL_PANEL',2),(572,'130','CONFIGURATION',4),(573,'130','VIEW',1),(574,'130','PERMISSIONS',8),(575,'130','PREFERENCES',16),(576,'122','ADD_PORTLET_DISPLAY_TEMPLATE',2),(577,'122','CONFIGURATION',4),(578,'122','VIEW',1),(579,'122','ADD_TO_PAGE',8),(580,'122','PERMISSIONS',16),(581,'122','PREFERENCES',32),(582,'122','ACCESS_IN_CONTROL_PANEL',64),(583,'36','ACCESS_IN_CONTROL_PANEL',64),(584,'26','VIEW',1),(585,'26','ADD_TO_PAGE',2),(586,'26','CONFIGURATION',4),(587,'26','PERMISSIONS',8),(588,'26','PREFERENCES',16),(589,'26','ACCESS_IN_CONTROL_PANEL',32),(590,'190','VIEW',1),(591,'190','ADD_TO_PAGE',2),(592,'190','CONFIGURATION',4),(593,'190','PERMISSIONS',8),(594,'190','PREFERENCES',16),(595,'190','ACCESS_IN_CONTROL_PANEL',32),(596,'175','VIEW',1),(597,'175','ADD_TO_PAGE',2),(598,'175','CONFIGURATION',4),(599,'175','PERMISSIONS',8),(600,'175','PREFERENCES',16),(601,'175','ACCESS_IN_CONTROL_PANEL',32),(602,'64','VIEW',1),(603,'64','ADD_TO_PAGE',2),(604,'64','CONFIGURATION',4),(605,'64','PERMISSIONS',8),(606,'64','PREFERENCES',16),(607,'64','ACCESS_IN_CONTROL_PANEL',32),(608,'153','ACCESS_IN_CONTROL_PANEL',2),(609,'153','ADD_TO_PAGE',4),(610,'153','CONFIGURATION',8),(611,'153','VIEW',1),(612,'153','PERMISSIONS',16),(613,'153','PREFERENCES',32),(614,'182','VIEW',1),(615,'182','ADD_TO_PAGE',2),(616,'182','CONFIGURATION',4),(617,'182','PERMISSIONS',8),(618,'182','PREFERENCES',16),(619,'182','ACCESS_IN_CONTROL_PANEL',32),(620,'179','ACCESS_IN_CONTROL_PANEL',2),(621,'179','CONFIGURATION',4),(622,'179','VIEW',1),(623,'179','PERMISSIONS',8),(624,'179','PREFERENCES',16),(625,'173','VIEW',1),(626,'173','ADD_TO_PAGE',2),(627,'173','CONFIGURATION',4),(628,'173','PERMISSIONS',8),(629,'173','PREFERENCES',16),(630,'173','ACCESS_IN_CONTROL_PANEL',32),(631,'100','VIEW',1),(632,'100','ADD_TO_PAGE',2),(633,'100','CONFIGURATION',4),(634,'100','PERMISSIONS',8),(635,'100','PREFERENCES',16),(636,'100','ACCESS_IN_CONTROL_PANEL',32),(637,'157','ACCESS_IN_CONTROL_PANEL',2),(638,'157','CONFIGURATION',4),(639,'157','VIEW',1),(640,'157','PERMISSIONS',8),(641,'157','PREFERENCES',16),(642,'19','ACCESS_IN_CONTROL_PANEL',32),(643,'160','VIEW',1),(644,'160','ADD_TO_PAGE',2),(645,'160','CONFIGURATION',4),(646,'160','PERMISSIONS',8),(647,'160','PREFERENCES',16),(648,'160','ACCESS_IN_CONTROL_PANEL',32),(649,'181','VIEW',1),(650,'181','ADD_TO_PAGE',2),(651,'181','CONFIGURATION',4),(652,'181','PERMISSIONS',8),(653,'181','PREFERENCES',16),(654,'181','ACCESS_IN_CONTROL_PANEL',32),(655,'86','VIEW',1),(656,'86','ADD_TO_PAGE',2),(657,'86','CONFIGURATION',4),(658,'86','PERMISSIONS',8),(659,'86','PREFERENCES',16),(660,'86','ACCESS_IN_CONTROL_PANEL',32),(661,'148','VIEW',1),(662,'148','ADD_TO_PAGE',2),(663,'148','CONFIGURATION',4),(664,'148','PERMISSIONS',8),(665,'148','PREFERENCES',16),(666,'148','ACCESS_IN_CONTROL_PANEL',32),(667,'11','ADD_TO_PAGE',2),(668,'11','CONFIGURATION',4),(669,'11','VIEW',1),(670,'11','PERMISSIONS',8),(671,'11','PREFERENCES',16),(672,'11','ACCESS_IN_CONTROL_PANEL',32),(673,'29','ADD_TO_PAGE',2),(674,'29','CONFIGURATION',4),(675,'29','VIEW',1),(676,'29','PERMISSIONS',8),(677,'29','PREFERENCES',16),(678,'29','ACCESS_IN_CONTROL_PANEL',32),(679,'174','ACCESS_IN_CONTROL_PANEL',32),(680,'158','ACCESS_IN_CONTROL_PANEL',2),(681,'158','ADD_TO_PAGE',4),(682,'158','CONFIGURATION',8),(683,'158','VIEW',1),(684,'158','PERMISSIONS',16),(685,'158','PREFERENCES',32),(686,'178','ACCESS_IN_CONTROL_PANEL',32),(687,'124','VIEW',1),(688,'124','ADD_TO_PAGE',2),(689,'124','CONFIGURATION',4),(690,'124','PERMISSIONS',8),(691,'124','PREFERENCES',16),(692,'124','ACCESS_IN_CONTROL_PANEL',32),(693,'58','ADD_TO_PAGE',2),(694,'58','CONFIGURATION',4),(695,'58','VIEW',1),(696,'58','PERMISSIONS',8),(697,'58','PREFERENCES',16),(698,'58','ACCESS_IN_CONTROL_PANEL',32),(699,'97','VIEW',1),(700,'97','ADD_TO_PAGE',2),(701,'97','CONFIGURATION',4),(702,'97','PERMISSIONS',8),(703,'97','PREFERENCES',16),(704,'97','ACCESS_IN_CONTROL_PANEL',32),(705,'71','ADD_TO_PAGE',2),(706,'71','CONFIGURATION',4),(707,'71','VIEW',1),(708,'71','PERMISSIONS',8),(709,'71','PREFERENCES',16),(710,'71','ACCESS_IN_CONTROL_PANEL',32),(711,'39','VIEW',1),(712,'39','ADD_TO_PAGE',2),(713,'39','CONFIGURATION',4),(714,'39','PERMISSIONS',8),(715,'39','PREFERENCES',16),(716,'39','ACCESS_IN_CONTROL_PANEL',32),(717,'185','VIEW',1),(718,'185','ADD_TO_PAGE',2),(719,'185','CONFIGURATION',4),(720,'185','PERMISSIONS',8),(721,'185','PREFERENCES',16),(722,'185','ACCESS_IN_CONTROL_PANEL',32),(723,'170','VIEW',1),(724,'170','ADD_TO_PAGE',2),(725,'170','CONFIGURATION',4),(726,'170','PERMISSIONS',8),(727,'170','PREFERENCES',16),(728,'170','ACCESS_IN_CONTROL_PANEL',32),(729,'85','ADD_TO_PAGE',2),(730,'85','CONFIGURATION',4),(731,'85','VIEW',1),(732,'85','PERMISSIONS',8),(733,'85','PREFERENCES',16),(734,'85','ADD_PORTLET_DISPLAY_TEMPLATE',32),(735,'85','ACCESS_IN_CONTROL_PANEL',64),(736,'118','VIEW',1),(737,'118','ADD_TO_PAGE',2),(738,'118','CONFIGURATION',4),(739,'118','PERMISSIONS',8),(740,'118','PREFERENCES',16),(741,'118','ACCESS_IN_CONTROL_PANEL',32),(742,'107','VIEW',1),(743,'107','ADD_TO_PAGE',2),(744,'107','CONFIGURATION',4),(745,'107','PERMISSIONS',8),(746,'107','PREFERENCES',16),(747,'107','ACCESS_IN_CONTROL_PANEL',32),(748,'30','VIEW',1),(749,'30','ADD_TO_PAGE',2),(750,'30','CONFIGURATION',4),(751,'30','PERMISSIONS',8),(752,'30','PREFERENCES',16),(753,'30','ACCESS_IN_CONTROL_PANEL',32),(754,'184','ADD_TO_PAGE',2),(755,'184','CONFIGURATION',4),(756,'184','VIEW',1),(757,'184','PERMISSIONS',8),(758,'184','PREFERENCES',16),(759,'184','ACCESS_IN_CONTROL_PANEL',32),(760,'48','VIEW',1),(761,'48','ADD_TO_PAGE',2),(762,'48','CONFIGURATION',4),(763,'48','PERMISSIONS',8),(764,'48','PREFERENCES',16),(765,'48','ACCESS_IN_CONTROL_PANEL',32),(766,'62','VIEW',1),(767,'62','ADD_TO_PAGE',2),(768,'62','CONFIGURATION',4),(769,'62','PERMISSIONS',8),(770,'62','PREFERENCES',16),(771,'62','ACCESS_IN_CONTROL_PANEL',32),(772,'176','VIEW',1),(773,'176','ADD_TO_PAGE',2),(774,'176','CONFIGURATION',4),(775,'176','PERMISSIONS',8),(776,'176','PREFERENCES',16),(777,'176','ACCESS_IN_CONTROL_PANEL',32),(778,'172','VIEW',1),(779,'172','ADD_TO_PAGE',2),(780,'172','CONFIGURATION',4),(781,'172','PERMISSIONS',8),(782,'172','PREFERENCES',16),(783,'172','ACCESS_IN_CONTROL_PANEL',32),(784,'187','ADD_TO_PAGE',2),(785,'187','CONFIGURATION',4),(786,'187','VIEW',1),(787,'187','PERMISSIONS',8),(788,'187','PREFERENCES',16),(789,'187','ACCESS_IN_CONTROL_PANEL',32),(790,'108','VIEW',1),(791,'108','ADD_TO_PAGE',2),(792,'108','CONFIGURATION',4),(793,'108','PERMISSIONS',8),(794,'108','PREFERENCES',16),(795,'108','ACCESS_IN_CONTROL_PANEL',32),(796,'84','ACCESS_IN_CONTROL_PANEL',64),(797,'101','ADD_PORTLET_DISPLAY_TEMPLATE',2),(798,'101','ADD_TO_PAGE',4),(799,'101','CONFIGURATION',8),(800,'101','SUBSCRIBE',16),(801,'101','VIEW',1),(802,'101','PERMISSIONS',32),(803,'101','PREFERENCES',64),(804,'101','ACCESS_IN_CONTROL_PANEL',128),(805,'121','VIEW',1),(806,'121','ADD_TO_PAGE',2),(807,'121','CONFIGURATION',4),(808,'121','PERMISSIONS',8),(809,'121','PREFERENCES',16),(810,'121','ACCESS_IN_CONTROL_PANEL',32),(811,'49','VIEW',1),(812,'49','ADD_TO_PAGE',2),(813,'49','CONFIGURATION',4),(814,'49','PERMISSIONS',8),(815,'49','PREFERENCES',16),(816,'49','ACCESS_IN_CONTROL_PANEL',32),(817,'143','VIEW',1),(818,'143','ADD_TO_PAGE',2),(819,'143','CONFIGURATION',4),(820,'143','PERMISSIONS',8),(821,'143','PREFERENCES',16),(822,'143','ACCESS_IN_CONTROL_PANEL',32),(823,'77','VIEW',1),(824,'77','ADD_TO_PAGE',2),(825,'77','CONFIGURATION',4),(826,'77','PERMISSIONS',8),(827,'77','PREFERENCES',16),(828,'77','ACCESS_IN_CONTROL_PANEL',32),(829,'115','VIEW',1),(830,'115','ADD_TO_PAGE',2),(831,'115','CONFIGURATION',4),(832,'115','PERMISSIONS',8),(833,'115','PREFERENCES',16),(834,'115','ACCESS_IN_CONTROL_PANEL',32),(835,'56','ADD_TO_PAGE',2),(836,'56','CONFIGURATION',4),(837,'56','VIEW',1),(838,'56','PERMISSIONS',8),(839,'56','PREFERENCES',16),(840,'56','ACCESS_IN_CONTROL_PANEL',32),(841,'142','VIEW',1),(842,'142','ADD_TO_PAGE',2),(843,'142','CONFIGURATION',4),(844,'142','PERMISSIONS',8),(845,'142','PREFERENCES',16),(846,'142','ACCESS_IN_CONTROL_PANEL',32),(847,'16','PREFERENCES',2),(848,'16','GUEST_PREFERENCES',4),(849,'16','VIEW',1),(850,'16','ADD_TO_PAGE',8),(851,'16','CONFIGURATION',16),(852,'16','PERMISSIONS',32),(853,'16','ACCESS_IN_CONTROL_PANEL',64),(854,'3','VIEW',1),(855,'3','ADD_TO_PAGE',2),(856,'3','CONFIGURATION',4),(857,'3','PERMISSIONS',8),(858,'3','PREFERENCES',16),(859,'3','ACCESS_IN_CONTROL_PANEL',32),(860,'23','VIEW',1),(861,'23','ADD_TO_PAGE',2),(862,'23','CONFIGURATION',4),(863,'23','PERMISSIONS',8),(864,'23','PREFERENCES',16),(865,'23','ACCESS_IN_CONTROL_PANEL',32),(866,'145','VIEW',1),(867,'145','ADD_TO_PAGE',2),(868,'145','CONFIGURATION',4),(869,'145','PERMISSIONS',8),(870,'145','PREFERENCES',16),(871,'145','ACCESS_IN_CONTROL_PANEL',32),(872,'83','ACCESS_IN_CONTROL_PANEL',64),(873,'194','VIEW',1),(874,'194','ADD_TO_PAGE',2),(875,'194','CONFIGURATION',4),(876,'194','PERMISSIONS',8),(877,'194','PREFERENCES',16),(878,'194','ACCESS_IN_CONTROL_PANEL',32),(879,'186','ADD_TO_PAGE',2),(880,'186','CONFIGURATION',4),(881,'186','VIEW',1),(882,'186','PERMISSIONS',8),(883,'186','PREFERENCES',16),(884,'186','ACCESS_IN_CONTROL_PANEL',32),(885,'164','VIEW',1),(886,'164','ADD_TO_PAGE',2),(887,'164','CONFIGURATION',4),(888,'164','PERMISSIONS',8),(889,'164','PREFERENCES',16),(890,'164','ACCESS_IN_CONTROL_PANEL',32),(891,'70','VIEW',1),(892,'70','ADD_TO_PAGE',2),(893,'70','CONFIGURATION',4),(894,'70','PERMISSIONS',8),(895,'70','PREFERENCES',16),(896,'70','ACCESS_IN_CONTROL_PANEL',32),(897,'141','ADD_PORTLET_DISPLAY_TEMPLATE',2),(898,'141','CONFIGURATION',4),(899,'141','VIEW',1),(900,'141','ADD_TO_PAGE',8),(901,'141','PERMISSIONS',16),(902,'141','PREFERENCES',32),(903,'141','ACCESS_IN_CONTROL_PANEL',64),(904,'9','VIEW',1),(905,'9','ADD_TO_PAGE',2),(906,'9','CONFIGURATION',4),(907,'9','PERMISSIONS',8),(908,'9','PREFERENCES',16),(909,'9','ACCESS_IN_CONTROL_PANEL',32),(910,'137','ACCESS_IN_CONTROL_PANEL',2),(911,'137','CONFIGURATION',4),(912,'137','VIEW',1),(913,'137','PERMISSIONS',8),(914,'137','PREFERENCES',16),(915,'133','VIEW',1),(916,'133','ADD_TO_PAGE',2),(917,'133','CONFIGURATION',4),(918,'133','PERMISSIONS',8),(919,'133','PREFERENCES',16),(920,'133','ACCESS_IN_CONTROL_PANEL',32),(921,'116','VIEW',1),(922,'116','ADD_TO_PAGE',2),(923,'116','CONFIGURATION',4),(924,'116','PERMISSIONS',8),(925,'116','PREFERENCES',16),(926,'116','ACCESS_IN_CONTROL_PANEL',32),(927,'47','VIEW',1),(928,'47','ADD_TO_PAGE',2),(929,'47','CONFIGURATION',4),(930,'47','PERMISSIONS',8),(931,'47','PREFERENCES',16),(932,'47','ACCESS_IN_CONTROL_PANEL',32),(933,'82','VIEW',1),(934,'82','ADD_TO_PAGE',2),(935,'82','CONFIGURATION',4),(936,'82','PERMISSIONS',8),(937,'82','PREFERENCES',16),(938,'82','ACCESS_IN_CONTROL_PANEL',32),(939,'103','VIEW',1),(940,'103','ADD_TO_PAGE',2),(941,'103','CONFIGURATION',4),(942,'103','PERMISSIONS',8),(943,'103','PREFERENCES',16),(944,'103','ACCESS_IN_CONTROL_PANEL',32),(945,'151','ACCESS_IN_CONTROL_PANEL',2),(946,'151','CONFIGURATION',4),(947,'151','VIEW',1),(948,'151','PERMISSIONS',8),(949,'151','PREFERENCES',16),(950,'140','ACCESS_IN_CONTROL_PANEL',2),(951,'140','CONFIGURATION',4),(952,'140','VIEW',1),(953,'140','PERMISSIONS',8),(954,'140','PREFERENCES',16),(955,'54','VIEW',1),(956,'54','ADD_TO_PAGE',2),(957,'54','CONFIGURATION',4),(958,'54','PERMISSIONS',8),(959,'54','PREFERENCES',16),(960,'54','ACCESS_IN_CONTROL_PANEL',32),(961,'169','ACCESS_IN_CONTROL_PANEL',32),(962,'132','ACCESS_IN_CONTROL_PANEL',2),(963,'132','CONFIGURATION',4),(964,'132','VIEW',1),(965,'132','PERMISSIONS',8),(966,'132','PREFERENCES',16),(967,'34','ACCESS_IN_CONTROL_PANEL',32),(968,'61','VIEW',1),(969,'61','ADD_TO_PAGE',2),(970,'61','CONFIGURATION',4),(971,'61','PERMISSIONS',8),(972,'61','PREFERENCES',16),(973,'61','ACCESS_IN_CONTROL_PANEL',32),(974,'73','ADD_TO_PAGE',2),(975,'73','CONFIGURATION',4),(976,'73','VIEW',1),(977,'73','PERMISSIONS',8),(978,'73','PREFERENCES',16),(979,'73','ACCESS_IN_CONTROL_PANEL',32),(980,'193','VIEW',1),(981,'193','ADD_TO_PAGE',2),(982,'193','CONFIGURATION',4),(983,'193','PERMISSIONS',8),(984,'193','PREFERENCES',16),(985,'193','ACCESS_IN_CONTROL_PANEL',32),(986,'127','ACCESS_IN_CONTROL_PANEL',32),(987,'50','VIEW',1),(988,'50','ADD_TO_PAGE',2),(989,'50','CONFIGURATION',4),(990,'50','PERMISSIONS',8),(991,'50','PREFERENCES',16),(992,'50','ACCESS_IN_CONTROL_PANEL',32),(993,'31','ACCESS_IN_CONTROL_PANEL',32),(994,'165','ACCESS_IN_CONTROL_PANEL',32),(995,'192','VIEW',1),(996,'192','ADD_TO_PAGE',2),(997,'192','CONFIGURATION',4),(998,'192','PERMISSIONS',8),(999,'192','PREFERENCES',16),(1000,'192','ACCESS_IN_CONTROL_PANEL',32),(1001,'90','ADD_COMMUNITY',2),(1002,'90','ADD_GENERAL_ANNOUNCEMENTS',4),(1003,'90','ADD_LAYOUT_PROTOTYPE',8),(1004,'90','ADD_LAYOUT_SET_PROTOTYPE',16),(1005,'90','ADD_LICENSE',32),(1006,'90','ADD_ORGANIZATION',64),(1007,'90','ADD_PASSWORD_POLICY',128),(1008,'90','ADD_ROLE',256),(1009,'90','ADD_USER',512),(1010,'90','ADD_USER_GROUP',1024),(1011,'90','CONFIGURATION',2048),(1012,'90','EXPORT_USER',4096),(1013,'90','IMPERSONATE',8192),(1014,'90','UNLINK_LAYOUT_SET_PROTOTYPE',16384),(1015,'90','VIEW_CONTROL_PANEL',32768),(1016,'90','ADD_TO_PAGE',65536),(1017,'90','PERMISSIONS',131072),(1018,'90','PREFERENCES',262144),(1019,'90','VIEW',1),(1020,'90','ACCESS_IN_CONTROL_PANEL',524288),(1021,'150','ACCESS_IN_CONTROL_PANEL',2),(1022,'150','CONFIGURATION',4),(1023,'150','VIEW',1),(1024,'150','PERMISSIONS',8),(1025,'150','PREFERENCES',16),(1026,'113','VIEW',1),(1027,'113','ADD_TO_PAGE',2),(1028,'113','CONFIGURATION',4),(1029,'113','PERMISSIONS',8),(1030,'113','PREFERENCES',16),(1031,'113','ACCESS_IN_CONTROL_PANEL',32),(1032,'33','ACCESS_IN_CONTROL_PANEL',64),(1033,'2','ACCESS_IN_CONTROL_PANEL',2),(1034,'2','CONFIGURATION',4),(1035,'2','VIEW',1),(1036,'2','PERMISSIONS',8),(1037,'2','PREFERENCES',16),(1038,'191','VIEW',1),(1039,'191','ADD_TO_PAGE',2),(1040,'191','CONFIGURATION',4),(1041,'191','PERMISSIONS',8),(1042,'191','PREFERENCES',16),(1043,'191','ACCESS_IN_CONTROL_PANEL',32),(1044,'119','VIEW',1),(1045,'119','ADD_TO_PAGE',2),(1046,'119','CONFIGURATION',4),(1047,'119','PERMISSIONS',8),(1048,'119','PREFERENCES',16),(1049,'119','ACCESS_IN_CONTROL_PANEL',32),(1050,'114','VIEW',1),(1051,'114','ADD_TO_PAGE',2),(1052,'114','CONFIGURATION',4),(1053,'114','PERMISSIONS',8),(1054,'114','PREFERENCES',16),(1055,'114','ACCESS_IN_CONTROL_PANEL',32),(1056,'67','VIEW',1),(1057,'67','ADD_TO_PAGE',2),(1058,'67','CONFIGURATION',4),(1059,'67','PERMISSIONS',8),(1060,'67','PREFERENCES',16),(1061,'67','ACCESS_IN_CONTROL_PANEL',32),(1062,'110','ACCESS_IN_CONTROL_PANEL',32),(1063,'135','ACCESS_IN_CONTROL_PANEL',2),(1064,'135','CONFIGURATION',4),(1065,'135','VIEW',1),(1066,'135','PERMISSIONS',8),(1067,'135','PREFERENCES',16),(1068,'59','ACCESS_IN_CONTROL_PANEL',32),(1069,'188','ADD_TO_PAGE',2),(1070,'188','CONFIGURATION',4),(1071,'188','VIEW',1),(1072,'188','PERMISSIONS',8),(1073,'188','PREFERENCES',16),(1074,'188','ACCESS_IN_CONTROL_PANEL',32),(1075,'131','ACCESS_IN_CONTROL_PANEL',2),(1076,'131','CONFIGURATION',4),(1077,'131','VIEW',1),(1078,'131','PERMISSIONS',8),(1079,'131','PREFERENCES',16),(1080,'102','VIEW',1),(1081,'102','ADD_TO_PAGE',2),(1082,'102','CONFIGURATION',4),(1083,'102','PERMISSIONS',8),(1084,'102','PREFERENCES',16),(1085,'102','ACCESS_IN_CONTROL_PANEL',32),(1086,'1_WAR_marketplaceportlet','VIEW',1),(1087,'1_WAR_marketplaceportlet','ADD_TO_PAGE',2),(1088,'1_WAR_marketplaceportlet','CONFIGURATION',4),(1089,'1_WAR_marketplaceportlet','PERMISSIONS',8),(1090,'1_WAR_marketplaceportlet','PREFERENCES',16),(1091,'1_WAR_marketplaceportlet','ACCESS_IN_CONTROL_PANEL',32),(1092,'2_WAR_marketplaceportlet','VIEW',1),(1093,'2_WAR_marketplaceportlet','ADD_TO_PAGE',2),(1094,'2_WAR_marketplaceportlet','CONFIGURATION',4),(1095,'2_WAR_marketplaceportlet','PERMISSIONS',8),(1096,'2_WAR_marketplaceportlet','PREFERENCES',16),(1097,'2_WAR_marketplaceportlet','ACCESS_IN_CONTROL_PANEL',32),(1098,'3_WAR_marketplaceportlet','VIEW',1),(1099,'3_WAR_marketplaceportlet','ADD_TO_PAGE',2),(1100,'3_WAR_marketplaceportlet','CONFIGURATION',4),(1101,'3_WAR_marketplaceportlet','PERMISSIONS',8),(1102,'3_WAR_marketplaceportlet','PREFERENCES',16),(1103,'3_WAR_marketplaceportlet','ACCESS_IN_CONTROL_PANEL',32),(1104,'1_WAR_calendarportlet','ACCESS_IN_CONTROL_PANEL',2),(1105,'1_WAR_calendarportlet','ADD_TO_PAGE',4),(1106,'1_WAR_calendarportlet','CONFIGURATION',8),(1107,'1_WAR_calendarportlet','VIEW',1),(1108,'1_WAR_calendarportlet','PERMISSIONS',16),(1109,'1_WAR_calendarportlet','PREFERENCES',32),(1110,'com.liferay.calendar.model.CalendarResource','ADD_CALENDAR',2),(1111,'com.liferay.calendar.model.CalendarResource','DELETE',4),(1112,'com.liferay.calendar.model.CalendarResource','UPDATE',8),(1113,'com.liferay.calendar.model.CalendarResource','VIEW',1),(1114,'com.liferay.calendar.model.CalendarResource','PERMISSIONS',16),(1115,'com.liferay.calendar.model.Calendar','DELETE',2),(1116,'com.liferay.calendar.model.Calendar','MANAGE_BOOKINGS',4),(1117,'com.liferay.calendar.model.Calendar','PERMISSIONS',8),(1118,'com.liferay.calendar.model.Calendar','UPDATE',16),(1119,'com.liferay.calendar.model.Calendar','VIEW',1),(1120,'com.liferay.calendar.model.Calendar','VIEW_BOOKING_DETAILS',32),(1121,'com.liferay.calendar','ADD_RESOURCE',2),(1122,'com.liferay.calendar','PERMISSIONS',4),(1123,'com.liferay.calendar.model.CalendarBooking','ADD_DISCUSSION',2),(1124,'com.liferay.calendar.model.CalendarBooking','DELETE_DISCUSSION',4),(1125,'com.liferay.calendar.model.CalendarBooking','PERMISSIONS',8),(1126,'com.liferay.calendar.model.CalendarBooking','UPDATE_DISCUSSION',16),(1127,'2_WAR_notificationsportlet','VIEW',1),(1128,'2_WAR_notificationsportlet','ADD_TO_PAGE',2),(1129,'2_WAR_notificationsportlet','CONFIGURATION',4),(1130,'2_WAR_notificationsportlet','PERMISSIONS',8),(1131,'2_WAR_notificationsportlet','PREFERENCES',16),(1132,'2_WAR_notificationsportlet','ACCESS_IN_CONTROL_PANEL',32),(1133,'1_WAR_notificationsportlet','VIEW',1),(1134,'1_WAR_notificationsportlet','ADD_TO_PAGE',2),(1135,'1_WAR_notificationsportlet','CONFIGURATION',4),(1136,'1_WAR_notificationsportlet','PERMISSIONS',8),(1137,'1_WAR_notificationsportlet','PREFERENCES',16),(1138,'1_WAR_notificationsportlet','ACCESS_IN_CONTROL_PANEL',32),(1139,'4_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',2),(1140,'4_WAR_opensocialportlet','CONFIGURATION',4),(1141,'4_WAR_opensocialportlet','VIEW',1),(1142,'4_WAR_opensocialportlet','PERMISSIONS',8),(1143,'4_WAR_opensocialportlet','PREFERENCES',16),(1144,'2_WAR_opensocialportlet','ADD_TO_PAGE',2),(1145,'2_WAR_opensocialportlet','CONFIGURATION',4),(1146,'2_WAR_opensocialportlet','VIEW',1),(1147,'2_WAR_opensocialportlet','PERMISSIONS',8),(1148,'2_WAR_opensocialportlet','PREFERENCES',16),(1149,'2_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',32),(1150,'1_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',2),(1151,'1_WAR_opensocialportlet','CONFIGURATION',4),(1152,'1_WAR_opensocialportlet','VIEW',1),(1153,'1_WAR_opensocialportlet','PERMISSIONS',8),(1154,'1_WAR_opensocialportlet','PREFERENCES',16),(1155,'com.liferay.opensocial.model.Gadget','DELETE',2),(1156,'com.liferay.opensocial.model.Gadget','PERMISSIONS',4),(1157,'com.liferay.opensocial.model.Gadget','UPDATE',8),(1158,'com.liferay.opensocial.model.Gadget','VIEW',1),(1159,'com.liferay.opensocial','PERMISSIONS',2),(1160,'com.liferay.opensocial','PUBLISH_GADGET',4),(1161,'3_WAR_opensocialportlet','ADD_TO_PAGE',2),(1162,'3_WAR_opensocialportlet','CONFIGURATION',4),(1163,'3_WAR_opensocialportlet','VIEW',1),(1164,'3_WAR_opensocialportlet','PERMISSIONS',8),(1165,'3_WAR_opensocialportlet','PREFERENCES',16),(1166,'3_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',32),(1167,'1_WAR_webformportlet','VIEW',1),(1168,'1_WAR_webformportlet','ADD_TO_PAGE',2),(1169,'1_WAR_webformportlet','CONFIGURATION',4),(1170,'1_WAR_webformportlet','PERMISSIONS',8),(1171,'1_WAR_webformportlet','PREFERENCES',16),(1172,'1_WAR_webformportlet','ACCESS_IN_CONTROL_PANEL',32),(1173,'SeleccionarPersonal_WAR_revportlet','VIEW',1),(1174,'SeleccionarPersonal_WAR_revportlet','ADD_TO_PAGE',2),(1175,'SeleccionarPersonal_WAR_revportlet','CONFIGURATION',4),(1176,'SeleccionarPersonal_WAR_revportlet','PERMISSIONS',8),(1177,'SeleccionarPersonal_WAR_revportlet','PREFERENCES',16),(1178,'SeleccionarPersonal_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1179,'ActualizarSolicitudReclutamiento_WAR_revportlet','VIEW',1),(1180,'ActualizarSolicitudReclutamiento_WAR_revportlet','ADD_TO_PAGE',2),(1181,'ActualizarSolicitudReclutamiento_WAR_revportlet','CONFIGURATION',4),(1182,'ActualizarSolicitudReclutamiento_WAR_revportlet','PERMISSIONS',8),(1183,'ActualizarSolicitudReclutamiento_WAR_revportlet','PREFERENCES',16),(1184,'ActualizarSolicitudReclutamiento_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1185,'EvaluarSolicitudRequerimiento_WAR_revportlet','VIEW',1),(1186,'EvaluarSolicitudRequerimiento_WAR_revportlet','ADD_TO_PAGE',2),(1187,'EvaluarSolicitudRequerimiento_WAR_revportlet','CONFIGURATION',4),(1188,'EvaluarSolicitudRequerimiento_WAR_revportlet','PERMISSIONS',8),(1189,'EvaluarSolicitudRequerimiento_WAR_revportlet','PREFERENCES',16),(1190,'EvaluarSolicitudRequerimiento_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1191,'ProgramaEntrevista_WAR_revportlet','VIEW',1),(1192,'ProgramaEntrevista_WAR_revportlet','ADD_TO_PAGE',2),(1193,'ProgramaEntrevista_WAR_revportlet','CONFIGURATION',4),(1194,'ProgramaEntrevista_WAR_revportlet','PERMISSIONS',8),(1195,'ProgramaEntrevista_WAR_revportlet','PREFERENCES',16),(1196,'ProgramaEntrevista_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1197,'ActualizarSolicitudRequerimiento_WAR_revportlet','VIEW',1),(1198,'ActualizarSolicitudRequerimiento_WAR_revportlet','ADD_TO_PAGE',2),(1199,'ActualizarSolicitudRequerimiento_WAR_revportlet','CONFIGURATION',4),(1200,'ActualizarSolicitudRequerimiento_WAR_revportlet','PERMISSIONS',8),(1201,'ActualizarSolicitudRequerimiento_WAR_revportlet','PREFERENCES',16),(1202,'ActualizarSolicitudRequerimiento_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1203,'PublicarOferta_WAR_revportlet','VIEW',1),(1204,'PublicarOferta_WAR_revportlet','ADD_TO_PAGE',2),(1205,'PublicarOferta_WAR_revportlet','CONFIGURATION',4),(1206,'PublicarOferta_WAR_revportlet','PERMISSIONS',8),(1207,'PublicarOferta_WAR_revportlet','PREFERENCES',16),(1208,'PublicarOferta_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1209,'RegistrarResultadoEntrevista_WAR_revportlet','VIEW',1),(1210,'RegistrarResultadoEntrevista_WAR_revportlet','ADD_TO_PAGE',2),(1211,'RegistrarResultadoEntrevista_WAR_revportlet','CONFIGURATION',4),(1212,'RegistrarResultadoEntrevista_WAR_revportlet','PERMISSIONS',8),(1213,'RegistrarResultadoEntrevista_WAR_revportlet','PREFERENCES',16),(1214,'RegistrarResultadoEntrevista_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1215,'EvaluarFechaIngreso_WAR_revportlet','VIEW',1),(1216,'EvaluarFechaIngreso_WAR_revportlet','ADD_TO_PAGE',2),(1217,'EvaluarFechaIngreso_WAR_revportlet','CONFIGURATION',4),(1218,'EvaluarFechaIngreso_WAR_revportlet','PERMISSIONS',8),(1219,'EvaluarFechaIngreso_WAR_revportlet','PREFERENCES',16),(1220,'EvaluarFechaIngreso_WAR_revportlet','ACCESS_IN_CONTROL_PANEL',32),(1301,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','VIEW',1),(1302,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','ADD_TO_PAGE',2),(1303,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','CONFIGURATION',4),(1304,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','PERMISSIONS',8),(1305,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','PREFERENCES',16),(1306,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet','ACCESS_IN_CONTROL_PANEL',32),(1401,'demotest_WAR_demotestportlet','VIEW',1),(1402,'demotest_WAR_demotestportlet','ADD_TO_PAGE',2),(1403,'demotest_WAR_demotestportlet','CONFIGURATION',4),(1404,'demotest_WAR_demotestportlet','PERMISSIONS',8),(1405,'demotest_WAR_demotestportlet','PREFERENCES',16),(1406,'demotest_WAR_demotestportlet','ACCESS_IN_CONTROL_PANEL',32);
/*!40000 ALTER TABLE `resourceaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resourceblock`
--

DROP TABLE IF EXISTS `resourceblock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resourceblock` (
  `resourceBlockId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `permissionsHash` varchar(75) DEFAULT NULL,
  `referenceCount` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`resourceBlockId`),
  UNIQUE KEY `IX_AEEA209C` (`companyId`,`groupId`,`name`,`permissionsHash`),
  KEY `IX_DA30B086` (`companyId`,`groupId`,`name`),
  KEY `IX_2D4CC782` (`companyId`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resourceblock`
--

LOCK TABLES `resourceblock` WRITE;
/*!40000 ALTER TABLE `resourceblock` DISABLE KEYS */;
/*!40000 ALTER TABLE `resourceblock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resourceblockpermission`
--

DROP TABLE IF EXISTS `resourceblockpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resourceblockpermission` (
  `resourceBlockPermissionId` bigint(20) NOT NULL,
  `resourceBlockId` bigint(20) DEFAULT NULL,
  `roleId` bigint(20) DEFAULT NULL,
  `actionIds` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`resourceBlockPermissionId`),
  UNIQUE KEY `IX_D63D20BB` (`resourceBlockId`,`roleId`),
  KEY `IX_4AB3756` (`resourceBlockId`),
  KEY `IX_20A2E3D9` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resourceblockpermission`
--

LOCK TABLES `resourceblockpermission` WRITE;
/*!40000 ALTER TABLE `resourceblockpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `resourceblockpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resourcepermission`
--

DROP TABLE IF EXISTS `resourcepermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resourcepermission` (
  `resourcePermissionId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `scope` int(11) DEFAULT NULL,
  `primKey` varchar(255) DEFAULT NULL,
  `roleId` bigint(20) DEFAULT NULL,
  `ownerId` bigint(20) DEFAULT NULL,
  `actionIds` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`resourcePermissionId`),
  UNIQUE KEY `IX_8D83D0CE` (`companyId`,`name`,`scope`,`primKey`,`roleId`),
  KEY `IX_60B99860` (`companyId`,`name`,`scope`),
  KEY `IX_2200AA69` (`companyId`,`name`,`scope`,`primKey`),
  KEY `IX_26284944` (`companyId`,`primKey`),
  KEY `IX_A37A0588` (`roleId`),
  KEY `IX_F4555981` (`scope`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resourcepermission`
--

LOCK TABLES `resourcepermission` WRITE;
/*!40000 ALTER TABLE `resourcepermission` DISABLE KEYS */;
INSERT INTO `resourcepermission` VALUES (1,20155,'2',1,'20155',20166,0,2),(2,20155,'140',1,'20155',20166,0,2),(3,20155,'158',1,'20155',20166,0,6),(4,20155,'153',1,'20155',20166,0,6),(5,20155,'com.liferay.portal.model.Role',4,'20162',20166,0,1),(6,20155,'com.liferay.portal.model.Role',4,'20163',20166,0,1),(7,20155,'com.liferay.portal.model.Role',4,'20164',20166,0,1),(8,20155,'com.liferay.portal.model.Role',4,'20165',20166,0,1),(9,20155,'com.liferay.portal.model.Role',4,'20166',20166,0,1),(10,20155,'com.liferay.portal.model.Role',4,'20167',20166,0,1),(11,20155,'com.liferay.portal.model.Role',4,'20168',20166,0,1),(12,20155,'com.liferay.portal.model.Role',4,'20169',20166,0,1),(13,20155,'com.liferay.portal.model.Role',4,'20170',20166,0,1),(14,20155,'com.liferay.portal.model.Role',4,'20171',20166,0,1),(15,20155,'com.liferay.portal.model.Role',4,'20172',20166,0,1),(16,20155,'com.liferay.portal.model.Layout',4,'20176',20164,20159,1023),(17,20155,'com.liferay.portal.model.Layout',4,'20176',20171,0,19),(18,20155,'com.liferay.portal.model.Layout',4,'20176',20163,0,1),(19,20155,'com.liferay.portal.model.Layout',4,'20185',20164,20159,1023),(20,20155,'com.liferay.portal.model.Layout',4,'20185',20171,0,19),(21,20155,'com.liferay.portal.model.Layout',4,'20185',20163,0,1),(22,20155,'com.liferay.portal.model.Layout',2,'20192',20166,0,1),(23,20155,'com.liferay.portlet.blogs',2,'20192',20166,0,14),(24,20155,'98',2,'20192',20165,0,2),(25,20155,'183',2,'20192',20165,0,32),(26,20155,'152',2,'20192',20165,0,2),(27,20155,'182',2,'20192',20165,0,32),(28,20155,'179',2,'20192',20165,0,2),(29,20155,'173',2,'20192',20165,0,32),(30,20155,'154',2,'20192',20165,0,2),(31,20155,'178',2,'20192',20165,0,32),(32,20155,'147',2,'20192',20165,0,2),(33,20155,'161',2,'20192',20165,0,2),(34,20155,'162',2,'20192',20165,0,2),(35,20155,'167',2,'20192',20165,0,2),(36,20155,'20',2,'20192',20165,0,2),(37,20155,'99',2,'20192',20165,0,2),(38,20155,'28',2,'20192',20165,0,2),(39,20155,'15',2,'20192',20165,0,2),(40,20155,'25',2,'20192',20165,0,2),(41,20155,'com.liferay.portal.model.Group',2,'20192',20165,0,8396800),(42,20155,'com.liferay.portlet.asset',2,'20192',20165,0,30),(43,20155,'com.liferay.portlet.blogs',2,'20192',20165,0,14),(44,20155,'com.liferay.portlet.bookmarks',2,'20192',20165,0,31),(45,20155,'com.liferay.portlet.documentlibrary',2,'20192',20165,0,1023),(46,20155,'com.liferay.portlet.journal',2,'20192',20165,0,255),(47,20155,'com.liferay.portlet.messageboards',2,'20192',20165,0,2047),(48,20155,'com.liferay.portlet.polls',2,'20192',20165,0,6),(49,20155,'com.liferay.portlet.wiki',2,'20192',20165,0,6),(50,20155,'com.liferay.portal.model.User',4,'20199',20164,20199,31),(51,20155,'98',1,'20155',20165,0,4),(52,20155,'98',1,'20155',20166,0,4),(53,20155,'183',1,'20155',20162,0,2),(54,20155,'66',1,'20155',20165,0,2),(55,20155,'66',1,'20155',20166,0,2),(56,20155,'180',1,'20155',20163,0,2),(57,20155,'180',1,'20155',20165,0,2),(58,20155,'180',1,'20155',20166,0,2),(59,20155,'27',1,'20155',20165,0,2),(60,20155,'27',1,'20155',20166,0,2),(61,20155,'122',1,'20155',20163,0,8),(62,20155,'122',1,'20155',20165,0,8),(63,20155,'122',1,'20155',20166,0,8),(64,20155,'36',1,'20155',20165,0,4),(65,20155,'36',1,'20155',20166,0,4),(66,20155,'26',1,'20155',20165,0,2),(67,20155,'26',1,'20155',20166,0,2),(68,20155,'175',1,'20155',20163,0,2),(69,20155,'175',1,'20155',20165,0,2),(70,20155,'175',1,'20155',20166,0,2),(71,20155,'153',1,'20155',20165,0,4),(72,20155,'64',1,'20155',20163,0,2),(73,20155,'64',1,'20155',20165,0,2),(74,20155,'64',1,'20155',20166,0,2),(75,20155,'182',1,'20155',20165,0,2),(76,20155,'182',1,'20155',20166,0,2),(77,20155,'173',1,'20155',20163,0,2),(78,20155,'173',1,'20155',20165,0,2),(79,20155,'173',1,'20155',20166,0,2),(80,20155,'100',1,'20155',20165,0,2),(81,20155,'100',1,'20155',20166,0,2),(82,20155,'19',1,'20155',20165,0,2),(83,20155,'19',1,'20155',20166,0,2),(84,20155,'181',1,'20155',20163,0,2),(85,20155,'181',1,'20155',20165,0,2),(86,20155,'181',1,'20155',20166,0,2),(87,20155,'148',1,'20155',20163,0,2),(88,20155,'148',1,'20155',20165,0,2),(89,20155,'148',1,'20155',20166,0,2),(90,20155,'11',1,'20155',20165,0,2),(91,20155,'11',1,'20155',20166,0,2),(92,20155,'29',1,'20155',20165,0,2),(93,20155,'29',1,'20155',20166,0,2),(94,20155,'158',1,'20155',20165,0,4),(95,20155,'178',1,'20155',20165,0,4),(96,20155,'178',1,'20155',20166,0,4),(97,20155,'58',1,'20155',20163,0,2),(98,20155,'58',1,'20155',20165,0,2),(99,20155,'58',1,'20155',20166,0,2),(100,20155,'71',1,'20155',20163,0,2),(101,20155,'71',1,'20155',20165,0,2),(102,20155,'71',1,'20155',20166,0,2),(103,20155,'97',1,'20155',20165,0,2),(104,20155,'97',1,'20155',20166,0,2),(105,20155,'39',1,'20155',20165,0,2),(106,20155,'39',1,'20155',20166,0,2),(107,20155,'85',1,'20155',20163,0,2),(108,20155,'85',1,'20155',20165,0,2),(109,20155,'85',1,'20155',20166,0,2),(110,20155,'118',1,'20155',20163,0,2),(111,20155,'118',1,'20155',20165,0,2),(112,20155,'118',1,'20155',20166,0,2),(113,20155,'107',1,'20155',20165,0,2),(114,20155,'107',1,'20155',20166,0,2),(115,20155,'30',1,'20155',20165,0,2),(116,20155,'30',1,'20155',20166,0,2),(117,20155,'184',1,'20155',20163,0,2),(118,20155,'184',1,'20155',20165,0,2),(119,20155,'184',1,'20155',20166,0,2),(120,20155,'48',1,'20155',20165,0,2),(121,20155,'48',1,'20155',20166,0,2),(122,20155,'62',1,'20155',20165,0,2),(123,20155,'62',1,'20155',20166,0,2),(124,20155,'176',1,'20155',20162,0,2),(125,20155,'108',1,'20155',20165,0,2),(126,20155,'108',1,'20155',20166,0,2),(127,20155,'187',1,'20155',20165,0,2),(128,20155,'187',1,'20155',20166,0,2),(129,20155,'84',1,'20155',20165,0,4),(130,20155,'84',1,'20155',20166,0,4),(131,20155,'101',1,'20155',20163,0,4),(132,20155,'101',1,'20155',20165,0,4),(133,20155,'101',1,'20155',20166,0,4),(134,20155,'121',1,'20155',20163,0,2),(135,20155,'121',1,'20155',20165,0,2),(136,20155,'121',1,'20155',20166,0,2),(137,20155,'143',1,'20155',20163,0,2),(138,20155,'143',1,'20155',20165,0,2),(139,20155,'143',1,'20155',20166,0,2),(140,20155,'77',1,'20155',20163,0,2),(141,20155,'77',1,'20155',20165,0,2),(142,20155,'77',1,'20155',20166,0,2),(143,20155,'167',1,'20155',20165,0,4),(144,20155,'167',1,'20155',20166,0,4),(145,20155,'115',1,'20155',20163,0,2),(146,20155,'115',1,'20155',20165,0,2),(147,20155,'115',1,'20155',20166,0,2),(148,20155,'56',1,'20155',20163,0,2),(149,20155,'56',1,'20155',20165,0,2),(150,20155,'56',1,'20155',20166,0,2),(151,20155,'16',1,'20155',20165,0,8),(152,20155,'16',1,'20155',20166,0,8),(153,20155,'3',1,'20155',20163,0,2),(154,20155,'3',1,'20155',20165,0,2),(155,20155,'3',1,'20155',20166,0,2),(156,20155,'20',1,'20155',20163,0,8),(157,20155,'20',1,'20155',20165,0,8),(158,20155,'20',1,'20155',20166,0,8),(159,20155,'23',1,'20155',20165,0,2),(160,20155,'23',1,'20155',20166,0,2),(161,20155,'83',1,'20155',20165,0,4),(162,20155,'83',1,'20155',20166,0,4),(163,20155,'186',1,'20155',20165,0,2),(164,20155,'186',1,'20155',20166,0,2),(165,20155,'194',1,'20155',20163,0,2),(166,20155,'194',1,'20155',20165,0,2),(167,20155,'194',1,'20155',20166,0,2),(168,20155,'70',1,'20155',20165,0,2),(169,20155,'70',1,'20155',20166,0,2),(170,20155,'164',1,'20155',20163,0,2),(171,20155,'164',1,'20155',20165,0,2),(172,20155,'164',1,'20155',20166,0,2),(173,20155,'141',1,'20155',20163,0,8),(174,20155,'141',1,'20155',20165,0,8),(175,20155,'141',1,'20155',20166,0,8),(176,20155,'9',1,'20155',20162,0,2),(177,20155,'28',1,'20155',20165,0,4),(178,20155,'28',1,'20155',20166,0,4),(179,20155,'15',1,'20155',20165,0,4),(180,20155,'15',1,'20155',20166,0,4),(181,20155,'47',1,'20155',20163,0,2),(182,20155,'47',1,'20155',20165,0,2),(183,20155,'47',1,'20155',20166,0,2),(184,20155,'116',1,'20155',20163,0,2),(185,20155,'116',1,'20155',20165,0,2),(186,20155,'116',1,'20155',20166,0,2),(187,20155,'82',1,'20155',20163,0,2),(188,20155,'82',1,'20155',20165,0,2),(189,20155,'82',1,'20155',20166,0,2),(190,20155,'54',1,'20155',20165,0,2),(191,20155,'54',1,'20155',20166,0,2),(192,20155,'34',1,'20155',20165,0,2),(193,20155,'34',1,'20155',20166,0,2),(194,20155,'169',1,'20155',20165,0,2),(195,20155,'169',1,'20155',20166,0,2),(196,20155,'61',1,'20155',20165,0,2),(197,20155,'61',1,'20155',20166,0,2),(198,20155,'73',1,'20155',20163,0,2),(199,20155,'73',1,'20155',20165,0,2),(200,20155,'73',1,'20155',20166,0,2),(201,20155,'50',1,'20155',20163,0,2),(202,20155,'50',1,'20155',20165,0,2),(203,20155,'50',1,'20155',20166,0,2),(204,20155,'127',1,'20155',20162,0,2),(205,20155,'193',1,'20155',20163,0,2),(206,20155,'193',1,'20155',20165,0,2),(207,20155,'193',1,'20155',20166,0,2),(208,20155,'31',1,'20155',20163,0,2),(209,20155,'31',1,'20155',20165,0,2),(210,20155,'31',1,'20155',20166,0,2),(211,20155,'166',1,'20155',20165,0,4),(212,20155,'166',1,'20155',20166,0,4),(213,20155,'33',1,'20155',20163,0,4),(214,20155,'33',1,'20155',20165,0,4),(215,20155,'33',1,'20155',20166,0,4),(216,20155,'114',1,'20155',20163,0,2),(217,20155,'114',1,'20155',20165,0,2),(218,20155,'114',1,'20155',20166,0,2),(219,20155,'67',1,'20155',20165,0,2),(220,20155,'67',1,'20155',20166,0,2),(221,20155,'110',1,'20155',20165,0,2),(222,20155,'110',1,'20155',20166,0,2),(223,20155,'59',1,'20155',20165,0,2),(224,20155,'59',1,'20155',20166,0,2),(225,20155,'188',1,'20155',20165,0,2),(226,20155,'188',1,'20155',20166,0,2),(227,20155,'102',1,'20155',20162,0,2),(228,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20303',20164,20159,15),(229,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20303',20166,0,1),(230,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20303',20163,0,1),(231,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20304',20164,20159,15),(232,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20304',20166,0,1),(233,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20304',20163,0,1),(234,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20305',20164,20159,15),(235,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20305',20166,0,1),(236,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20305',20163,0,1),(237,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20307',20164,20159,15),(238,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20307',20166,0,1),(239,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20307',20163,0,1),(240,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20306',20164,20159,15),(241,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20306',20166,0,1),(242,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20306',20163,0,1),(243,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20309',20164,20159,15),(244,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20309',20166,0,1),(245,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20309',20163,0,1),(246,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20308',20164,20159,15),(247,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20308',20166,0,1),(248,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20308',20163,0,1),(249,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20311',20164,20159,15),(250,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20311',20166,0,1),(251,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20311',20163,0,1),(252,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20310',20164,20159,15),(253,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20310',20166,0,1),(254,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20310',20163,0,1),(255,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20313',20164,20159,15),(256,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20313',20166,0,1),(257,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20313',20163,0,1),(258,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20312',20164,20159,15),(259,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20312',20166,0,1),(260,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20312',20163,0,1),(261,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20315',20164,20159,15),(262,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20315',20166,0,1),(263,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20315',20163,0,1),(264,20155,'com.liferay.portal.model.LayoutPrototype',4,'20316',20164,20159,15),(265,20155,'com.liferay.portal.model.Layout',4,'20320',20164,20159,1023),(266,20155,'com.liferay.portal.model.Layout',4,'20320',20171,0,19),(267,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'20324',20164,20159,15),(268,20155,'33',4,'20320_LAYOUT_33',20164,0,127),(269,20155,'33',4,'20320_LAYOUT_33',20171,0,1),(270,20155,'33',4,'20320_LAYOUT_33',20163,0,1),(271,20155,'com.liferay.portlet.blogs',4,'20317',20164,0,14),(272,20155,'148',4,'20320_LAYOUT_148_INSTANCE_saHROptkJ4PX',20164,0,63),(273,20155,'148',4,'20320_LAYOUT_148_INSTANCE_saHROptkJ4PX',20171,0,1),(274,20155,'148',4,'20320_LAYOUT_148_INSTANCE_saHROptkJ4PX',20163,0,1),(275,20155,'114',4,'20320_LAYOUT_114',20164,0,63),(276,20155,'114',4,'20320_LAYOUT_114',20171,0,1),(277,20155,'114',4,'20320_LAYOUT_114',20163,0,1),(278,20155,'com.liferay.portal.model.LayoutPrototype',4,'20328',20164,20159,15),(279,20155,'com.liferay.portal.model.Layout',4,'20332',20164,20159,1023),(280,20155,'com.liferay.portal.model.Layout',4,'20332',20171,0,19),(281,20155,'141',4,'20332_LAYOUT_141_INSTANCE_U9pmCmn2zB4d',20164,0,127),(282,20155,'141',4,'20332_LAYOUT_141_INSTANCE_U9pmCmn2zB4d',20171,0,1),(283,20155,'141',4,'20332_LAYOUT_141_INSTANCE_U9pmCmn2zB4d',20163,0,1),(284,20155,'122',4,'20332_LAYOUT_122_INSTANCE_Ubt5gGha0IwX',20164,0,127),(285,20155,'122',4,'20332_LAYOUT_122_INSTANCE_Ubt5gGha0IwX',20171,0,1),(286,20155,'122',4,'20332_LAYOUT_122_INSTANCE_Ubt5gGha0IwX',20163,0,1),(287,20155,'3',4,'20332_LAYOUT_3',20164,0,63),(288,20155,'3',4,'20332_LAYOUT_3',20171,0,1),(289,20155,'3',4,'20332_LAYOUT_3',20163,0,1),(290,20155,'101',4,'20332_LAYOUT_101_INSTANCE_ohXpmA9bRYxZ',20164,0,255),(291,20155,'101',4,'20332_LAYOUT_101_INSTANCE_ohXpmA9bRYxZ',20171,0,17),(292,20155,'101',4,'20332_LAYOUT_101_INSTANCE_ohXpmA9bRYxZ',20163,0,1),(293,20155,'com.liferay.portal.model.LayoutPrototype',4,'20338',20164,20159,15),(294,20155,'com.liferay.portal.model.Layout',4,'20342',20164,20159,1023),(295,20155,'com.liferay.portal.model.Layout',4,'20342',20171,0,19),(296,20155,'36',4,'20342_LAYOUT_36',20164,0,127),(297,20155,'36',4,'20342_LAYOUT_36',20171,0,1),(298,20155,'36',4,'20342_LAYOUT_36',20163,0,1),(299,20155,'com.liferay.portlet.wiki',4,'20339',20164,0,6),(300,20155,'122',4,'20342_LAYOUT_122_INSTANCE_Fx5Bm5swBFX5',20164,0,127),(301,20155,'122',4,'20342_LAYOUT_122_INSTANCE_Fx5Bm5swBFX5',20171,0,1),(302,20155,'122',4,'20342_LAYOUT_122_INSTANCE_Fx5Bm5swBFX5',20163,0,1),(303,20155,'141',4,'20342_LAYOUT_141_INSTANCE_BlhIR1PCUUy2',20164,0,127),(304,20155,'141',4,'20342_LAYOUT_141_INSTANCE_BlhIR1PCUUy2',20171,0,1),(305,20155,'141',4,'20342_LAYOUT_141_INSTANCE_BlhIR1PCUUy2',20163,0,1),(306,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'20349',20164,20159,15),(310,20155,'com.liferay.portal.model.Layout',4,'20361',20164,20159,1023),(311,20155,'com.liferay.portal.model.Layout',4,'20361',20171,0,19),(312,20155,'com.liferay.portal.model.Layout',4,'20361',20163,0,1),(313,20155,'19',4,'20361_LAYOUT_19',20164,0,63),(314,20155,'19',4,'20361_LAYOUT_19',20171,0,1),(315,20155,'19',4,'20361_LAYOUT_19',20163,0,1),(316,20155,'com.liferay.portlet.messageboards',4,'20350',20164,0,2047),(317,20155,'com.liferay.portlet.messageboards',4,'20350',20171,0,781),(318,20155,'com.liferay.portlet.messageboards',4,'20350',20163,0,1),(319,20155,'3',4,'20361_LAYOUT_3',20164,0,63),(320,20155,'3',4,'20361_LAYOUT_3',20171,0,1),(321,20155,'3',4,'20361_LAYOUT_3',20163,0,1),(322,20155,'59',4,'20361_LAYOUT_59_INSTANCE_uOb6BqSYw6NQ',20164,0,63),(323,20155,'59',4,'20361_LAYOUT_59_INSTANCE_uOb6BqSYw6NQ',20171,0,1),(324,20155,'59',4,'20361_LAYOUT_59_INSTANCE_uOb6BqSYw6NQ',20163,0,1),(325,20155,'com.liferay.portlet.polls',4,'20350',20164,0,6),(326,20155,'180',4,'20361_LAYOUT_180',20164,0,63),(327,20155,'180',4,'20361_LAYOUT_180',20171,0,1),(328,20155,'180',4,'20361_LAYOUT_180',20163,0,1),(329,20155,'101',4,'20361_LAYOUT_101_INSTANCE_Q8nqPwYAC0Ar',20164,0,255),(330,20155,'101',4,'20361_LAYOUT_101_INSTANCE_Q8nqPwYAC0Ar',20171,0,17),(331,20155,'101',4,'20361_LAYOUT_101_INSTANCE_Q8nqPwYAC0Ar',20163,0,1),(332,20155,'com.liferay.portal.model.Layout',4,'20369',20164,20159,1023),(333,20155,'com.liferay.portal.model.Layout',4,'20369',20171,0,19),(334,20155,'com.liferay.portal.model.Layout',4,'20369',20163,0,1),(335,20155,'36',4,'20369_LAYOUT_36',20164,0,127),(336,20155,'36',4,'20369_LAYOUT_36',20171,0,1),(337,20155,'36',4,'20369_LAYOUT_36',20163,0,1),(338,20155,'com.liferay.portlet.wiki',4,'20350',20164,0,6),(339,20155,'122',4,'20369_LAYOUT_122_INSTANCE_xp0vgwrkQEUJ',20164,0,127),(340,20155,'122',4,'20369_LAYOUT_122_INSTANCE_xp0vgwrkQEUJ',20171,0,1),(341,20155,'122',4,'20369_LAYOUT_122_INSTANCE_xp0vgwrkQEUJ',20163,0,1),(342,20155,'148',4,'20369_LAYOUT_148_INSTANCE_xVlD2kVzM6kU',20164,0,63),(343,20155,'148',4,'20369_LAYOUT_148_INSTANCE_xVlD2kVzM6kU',20171,0,1),(344,20155,'148',4,'20369_LAYOUT_148_INSTANCE_xVlD2kVzM6kU',20163,0,1),(345,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'20375',20164,20159,15),(349,20155,'com.liferay.portal.model.Layout',4,'20387',20164,20159,1023),(350,20155,'com.liferay.portal.model.Layout',4,'20387',20171,0,19),(351,20155,'com.liferay.portal.model.Layout',4,'20387',20163,0,1),(352,20155,'116',4,'20387_LAYOUT_116',20164,0,63),(353,20155,'116',4,'20387_LAYOUT_116',20171,0,1),(354,20155,'116',4,'20387_LAYOUT_116',20163,0,1),(355,20155,'3',4,'20387_LAYOUT_3',20164,0,63),(356,20155,'3',4,'20387_LAYOUT_3',20171,0,1),(357,20155,'3',4,'20387_LAYOUT_3',20163,0,1),(358,20155,'82',4,'20387_LAYOUT_82',20164,0,63),(359,20155,'82',4,'20387_LAYOUT_82',20171,0,1),(360,20155,'82',4,'20387_LAYOUT_82',20163,0,1),(361,20155,'101',4,'20387_LAYOUT_101_INSTANCE_AqPCCFxiPQzm',20164,0,255),(362,20155,'101',4,'20387_LAYOUT_101_INSTANCE_AqPCCFxiPQzm',20171,0,17),(363,20155,'101',4,'20387_LAYOUT_101_INSTANCE_AqPCCFxiPQzm',20163,0,1),(364,20155,'com.liferay.portal.model.Layout',4,'20396',20164,20159,1023),(365,20155,'com.liferay.portal.model.Layout',4,'20396',20171,0,19),(366,20155,'com.liferay.portal.model.Layout',4,'20396',20163,0,1),(367,20155,'20',4,'20396_LAYOUT_20',20164,0,127),(368,20155,'20',4,'20396_LAYOUT_20',20171,0,1),(369,20155,'20',4,'20396_LAYOUT_20',20163,0,1),(370,20155,'com.liferay.portlet.documentlibrary',4,'20376',20164,0,1023),(371,20155,'com.liferay.portlet.documentlibrary',4,'20376',20171,0,331),(372,20155,'com.liferay.portlet.documentlibrary',4,'20376',20163,0,1),(373,20155,'101',4,'20396_LAYOUT_101_INSTANCE_xKzmsZzdVdqI',20164,0,255),(374,20155,'101',4,'20396_LAYOUT_101_INSTANCE_xKzmsZzdVdqI',20171,0,17),(375,20155,'101',4,'20396_LAYOUT_101_INSTANCE_xKzmsZzdVdqI',20163,0,1),(376,20155,'com.liferay.portal.model.Layout',4,'20404',20164,20159,1023),(377,20155,'com.liferay.portal.model.Layout',4,'20404',20171,0,19),(378,20155,'com.liferay.portal.model.Layout',4,'20404',20163,0,1),(379,20155,'39',4,'20404_LAYOUT_39_INSTANCE_NiGqRblDnM8V',20164,0,63),(380,20155,'39',4,'20404_LAYOUT_39_INSTANCE_NiGqRblDnM8V',20171,0,1),(381,20155,'39',4,'20404_LAYOUT_39_INSTANCE_NiGqRblDnM8V',20163,0,1),(382,20155,'39',4,'20404_LAYOUT_39_INSTANCE_Qyr1XVXNJIKr',20164,0,63),(383,20155,'39',4,'20404_LAYOUT_39_INSTANCE_Qyr1XVXNJIKr',20171,0,1),(384,20155,'39',4,'20404_LAYOUT_39_INSTANCE_Qyr1XVXNJIKr',20163,0,1),(385,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20412',20164,20159,15),(386,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20413',20164,20159,15),(387,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20414',20164,20159,15),(388,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20415',20164,20159,15),(389,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20416',20164,20159,15),(390,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20417',20164,20159,15),(391,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20418',20164,20159,15),(392,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20420',20164,20159,15),(393,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20423',20164,20159,15),(394,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20425',20164,20159,15),(395,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20427',20164,20159,15),(396,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20429',20164,20159,15),(397,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20431',20164,20159,15),(398,20155,'com.liferay.portlet.expando.model.ExpandoColumn',4,'20443',20164,0,15),(399,20155,'1_WAR_calendarportlet',1,'20155',20162,0,4),(400,20155,'1_WAR_calendarportlet',1,'20155',20163,0,4),(401,20155,'1_WAR_calendarportlet',1,'20155',20165,0,4),(402,20155,'1_WAR_calendarportlet',1,'20155',20166,0,4),(403,20155,'1_WAR_notificationsportlet',1,'20155',20162,0,2),(404,20155,'1_WAR_notificationsportlet',1,'20155',20163,0,2),(405,20155,'1_WAR_notificationsportlet',1,'20155',20165,0,2),(406,20155,'1_WAR_notificationsportlet',1,'20155',20166,0,2),(407,20155,'2_WAR_opensocialportlet',1,'20155',20162,0,2),(408,20155,'2_WAR_opensocialportlet',1,'20155',20163,0,2),(409,20155,'2_WAR_opensocialportlet',1,'20155',20165,0,2),(410,20155,'2_WAR_opensocialportlet',1,'20155',20166,0,2),(411,20155,'3_WAR_opensocialportlet',1,'20155',20162,0,2),(412,20155,'3_WAR_opensocialportlet',1,'20155',20163,0,2),(413,20155,'3_WAR_opensocialportlet',1,'20155',20165,0,2),(414,20155,'3_WAR_opensocialportlet',1,'20155',20166,0,2),(415,20155,'1_WAR_webformportlet',1,'20155',20162,0,2),(416,20155,'1_WAR_webformportlet',1,'20155',20163,0,2),(417,20155,'1_WAR_webformportlet',1,'20155',20165,0,2),(418,20155,'1_WAR_webformportlet',1,'20155',20166,0,2),(423,20155,'145',4,'20185_LAYOUT_145',20164,0,63),(424,20155,'145',4,'20185_LAYOUT_145',20171,0,1),(425,20155,'145',4,'20185_LAYOUT_145',20163,0,1),(426,20155,'58',4,'20185_LAYOUT_58',20164,0,63),(427,20155,'58',4,'20185_LAYOUT_58',20171,0,1),(428,20155,'58',4,'20185_LAYOUT_58',20163,0,1),(429,20155,'47',4,'20185_LAYOUT_47',20164,0,63),(430,20155,'47',4,'20185_LAYOUT_47',20171,0,1),(431,20155,'47',4,'20185_LAYOUT_47',20163,0,1),(432,20155,'2_WAR_notificationsportlet',4,'20185_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(433,20155,'2_WAR_notificationsportlet',4,'20185_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(434,20155,'2_WAR_notificationsportlet',4,'20185_LAYOUT_2_WAR_notificationsportlet',20163,0,1),(435,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'20533',20164,20159,15),(442,20155,'com.liferay.portlet.journal',4,'20182',20164,0,255),(443,20155,'com.liferay.portlet.journal',4,'20182',20171,0,1),(444,20155,'com.liferay.portlet.journal',4,'20182',20163,0,1),(445,20155,'com.liferay.portlet.documentlibrary',4,'20182',20164,0,1023),(446,20155,'com.liferay.portlet.documentlibrary',4,'20182',20171,0,331),(447,20155,'com.liferay.portlet.documentlibrary',4,'20182',20163,0,1),(448,20155,'SeleccionarPersonal_WAR_revportlet',1,'20155',20162,0,2),(449,20155,'SeleccionarPersonal_WAR_revportlet',1,'20155',20163,0,2),(450,20155,'SeleccionarPersonal_WAR_revportlet',1,'20155',20165,0,2),(451,20155,'SeleccionarPersonal_WAR_revportlet',1,'20155',20166,0,2),(452,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet',1,'20155',20162,0,2),(453,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet',1,'20155',20163,0,2),(454,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet',1,'20155',20165,0,2),(455,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet',1,'20155',20166,0,2),(456,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet',1,'20155',20162,0,2),(457,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet',1,'20155',20163,0,2),(458,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet',1,'20155',20165,0,2),(459,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet',1,'20155',20166,0,2),(460,20155,'ProgramaEntrevista_WAR_revportlet',1,'20155',20162,0,2),(461,20155,'ProgramaEntrevista_WAR_revportlet',1,'20155',20163,0,2),(462,20155,'ProgramaEntrevista_WAR_revportlet',1,'20155',20165,0,2),(463,20155,'ProgramaEntrevista_WAR_revportlet',1,'20155',20166,0,2),(464,20155,'ActualizarSolicitudRequerimiento_WAR_revportlet',1,'20155',20162,0,2),(465,20155,'ActualizarSolicitudRequerimiento_WAR_revportlet',1,'20155',20163,0,2),(466,20155,'ActualizarSolicitudRequerimiento_WAR_revportlet',1,'20155',20165,0,2),(467,20155,'ActualizarSolicitudRequerimiento_WAR_revportlet',1,'20155',20166,0,2),(468,20155,'PublicarOferta_WAR_revportlet',1,'20155',20162,0,2),(469,20155,'PublicarOferta_WAR_revportlet',1,'20155',20163,0,2),(470,20155,'PublicarOferta_WAR_revportlet',1,'20155',20165,0,2),(471,20155,'PublicarOferta_WAR_revportlet',1,'20155',20166,0,2),(472,20155,'RegistrarResultadoEntrevista_WAR_revportlet',1,'20155',20162,0,2),(473,20155,'RegistrarResultadoEntrevista_WAR_revportlet',1,'20155',20163,0,2),(474,20155,'RegistrarResultadoEntrevista_WAR_revportlet',1,'20155',20165,0,2),(475,20155,'RegistrarResultadoEntrevista_WAR_revportlet',1,'20155',20166,0,2),(476,20155,'EvaluarFechaIngreso_WAR_revportlet',1,'20155',20162,0,2),(477,20155,'EvaluarFechaIngreso_WAR_revportlet',1,'20155',20163,0,2),(478,20155,'EvaluarFechaIngreso_WAR_revportlet',1,'20155',20165,0,2),(479,20155,'EvaluarFechaIngreso_WAR_revportlet',1,'20155',20166,0,2),(484,20155,'com.liferay.portal.model.Group',4,'20623',20164,0,33554431),(485,20155,'com.liferay.portal.model.Layout',4,'20628',20164,20199,1023),(486,20155,'com.liferay.portal.model.Layout',4,'20628',20171,0,19),(487,20155,'com.liferay.portal.model.Layout',4,'20634',20164,20199,1023),(488,20155,'com.liferay.portal.model.Layout',4,'20634',20171,0,19),(489,20155,'49',4,'20185_LAYOUT_49',20164,0,63),(490,20155,'49',4,'20185_LAYOUT_49',20171,0,1),(491,20155,'49',4,'20185_LAYOUT_49',20163,0,1),(492,20155,'145',4,'20628_LAYOUT_145',20164,0,63),(493,20155,'145',4,'20628_LAYOUT_145',20171,0,1),(494,20155,'2_WAR_notificationsportlet',4,'20628_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(495,20155,'2_WAR_notificationsportlet',4,'20628_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(496,20155,'com.liferay.portlet.journal',4,'20623',20164,0,255),(497,20155,'com.liferay.portlet.journal',4,'20623',20171,0,1),(498,20155,'com.liferay.portlet.journal',4,'20623',20163,0,1),(499,20155,'com.liferay.portlet.documentlibrary',4,'20623',20164,0,1023),(500,20155,'com.liferay.portlet.documentlibrary',4,'20623',20171,0,331),(501,20155,'com.liferay.portlet.documentlibrary',4,'20623',20163,0,1),(502,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet',4,'20628_LAYOUT_ActualizarSolicitudReclutamiento_WAR_revportlet_INSTANCE_PVbvt9tHVL1v',20164,0,63),(503,20155,'ActualizarSolicitudReclutamiento_WAR_revportlet',4,'20628_LAYOUT_ActualizarSolicitudReclutamiento_WAR_revportlet_INSTANCE_PVbvt9tHVL1v',20171,0,1),(504,20155,'145',4,'20634_LAYOUT_145',20164,0,63),(505,20155,'145',4,'20634_LAYOUT_145',20171,0,1),(506,20155,'2_WAR_notificationsportlet',4,'20634_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(507,20155,'2_WAR_notificationsportlet',4,'20634_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(510,20155,'com.liferay.portal.model.Role',4,'20650',20164,20199,127),(801,20155,'com.liferay.portal.model.User',4,'20902',20164,20199,31),(904,20155,'49',4,'20628_LAYOUT_49',20164,0,63),(905,20155,'49',4,'20628_LAYOUT_49',20171,0,1),(1201,20155,'com.liferay.portlet.asset.model.AssetTag',4,'21305',20164,20199,15),(1205,20155,'com.liferay.portlet.asset.model.AssetTag',4,'21316',20164,20199,15),(1206,20155,'com.liferay.portlet.asset.model.AssetTag',4,'21318',20164,20199,15),(1207,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'21320',20164,20159,15),(1208,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'21322',20164,20199,15),(1209,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'21322',20171,0,1),(1210,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'21323',20164,20199,31),(1211,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'21323',20171,0,3),(1212,20155,'com.liferay.portlet.expando.model.ExpandoColumn',4,'21327',20164,0,15),(1213,20155,'com.liferay.portlet.expando.model.ExpandoColumn',4,'21328',20164,0,15),(1214,20155,'com.liferay.portlet.expando.model.ExpandoColumn',4,'21331',20164,0,15),(1604,20155,'com.liferay.portal.model.User',4,'21811',20164,20199,31),(1901,20155,'com.liferay.portal.model.User',4,'22202',20164,20199,31),(1902,20155,'com.liferay.portal.model.User',4,'22212',20164,20199,31),(1903,20155,'com.liferay.portal.model.User',4,'22221',20164,20199,31),(1904,20155,'com.liferay.portal.model.User',4,'22230',20164,20199,31),(1905,20155,'com.liferay.portal.model.User',4,'22239',20164,20199,31),(1906,20155,'com.liferay.portal.model.User',4,'22248',20164,20199,31),(1907,20155,'com.liferay.portal.model.User',4,'22257',20164,20199,31),(2104,20155,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1,'20155',20162,0,2),(2105,20155,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1,'20155',20163,0,2),(2106,20155,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1,'20155',20165,0,2),(2107,20155,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1,'20155',20166,0,2),(2110,20155,'1_WAR_notificationsportlet',4,'20628_LAYOUT_1_WAR_notificationsportlet',20164,0,63),(2111,20155,'1_WAR_notificationsportlet',4,'20628_LAYOUT_1_WAR_notificationsportlet',20171,0,1),(2401,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22902',20164,20199,31),(2402,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22902',20171,0,3),(2403,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22903',20164,20199,31),(2404,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22903',20171,0,3),(2405,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22904',20164,20199,31),(2406,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22904',20171,0,3),(2407,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22905',20164,20199,31),(2408,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22905',20171,0,3),(2409,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22906',20164,20199,31),(2410,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22906',20171,0,3),(2411,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22907',20164,20199,31),(2412,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22907',20171,0,3),(2413,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22908',20164,20199,31),(2414,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'22908',20171,0,3),(4601,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet',4,'20634_LAYOUT_EvaluarSolicitudRequerimiento_WAR_revportlet_INSTANCE_Ghm29e75sRuF',20164,0,63),(4602,20155,'EvaluarSolicitudRequerimiento_WAR_revportlet',4,'20634_LAYOUT_EvaluarSolicitudRequerimiento_WAR_revportlet_INSTANCE_Ghm29e75sRuF',20171,0,1),(4901,20155,'com.liferay.portal.model.Layout',4,'25801',20164,20199,1023),(4902,20155,'com.liferay.portal.model.Layout',4,'25801',20171,0,19),(5001,20155,'145',4,'25801_LAYOUT_145',20164,0,63),(5002,20155,'145',4,'25801_LAYOUT_145',20171,0,1),(5003,20155,'2_WAR_notificationsportlet',4,'25801_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(5004,20155,'2_WAR_notificationsportlet',4,'25801_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(5005,20155,'com.liferay.portal.model.Layout',4,'25903',20164,20199,1023),(5006,20155,'com.liferay.portal.model.Layout',4,'25903',20171,0,19),(5007,20155,'com.liferay.portal.model.Layout',4,'25909',20164,20199,1023),(5008,20155,'com.liferay.portal.model.Layout',4,'25909',20171,0,19),(5009,20155,'com.liferay.portal.model.Layout',4,'25915',20164,20199,1023),(5010,20155,'com.liferay.portal.model.Layout',4,'25915',20171,0,19),(5011,20155,'com.liferay.portal.model.Layout',4,'25921',20164,20199,1023),(5012,20155,'com.liferay.portal.model.Layout',4,'25921',20171,0,19),(5104,20155,'145',4,'25909_LAYOUT_145',20164,0,63),(5105,20155,'145',4,'25909_LAYOUT_145',20171,0,1),(5106,20155,'2_WAR_notificationsportlet',4,'25909_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(5107,20155,'2_WAR_notificationsportlet',4,'25909_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(5108,20155,'PublicarOferta_WAR_revportlet',4,'25909_LAYOUT_PublicarOferta_WAR_revportlet_INSTANCE_pYbcNlTAznXM',20164,0,63),(5109,20155,'PublicarOferta_WAR_revportlet',4,'25909_LAYOUT_PublicarOferta_WAR_revportlet_INSTANCE_pYbcNlTAznXM',20171,0,1),(5110,20155,'145',4,'25903_LAYOUT_145',20164,0,63),(5111,20155,'145',4,'25903_LAYOUT_145',20171,0,1),(5112,20155,'2_WAR_notificationsportlet',4,'25903_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(5113,20155,'2_WAR_notificationsportlet',4,'25903_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(5114,20155,'ProgramaEntrevista_WAR_revportlet',4,'25903_LAYOUT_ProgramaEntrevista_WAR_revportlet_INSTANCE_hpN3fKQ24Uo5',20164,0,63),(5115,20155,'ProgramaEntrevista_WAR_revportlet',4,'25903_LAYOUT_ProgramaEntrevista_WAR_revportlet_INSTANCE_hpN3fKQ24Uo5',20171,0,1),(5116,20155,'145',4,'25915_LAYOUT_145',20164,0,63),(5117,20155,'145',4,'25915_LAYOUT_145',20171,0,1),(5118,20155,'2_WAR_notificationsportlet',4,'25915_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(5119,20155,'2_WAR_notificationsportlet',4,'25915_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(5120,20155,'RegistrarResultadoEntrevista_WAR_revportlet',4,'25915_LAYOUT_RegistrarResultadoEntrevista_WAR_revportlet_INSTANCE_GPsiPA0asYdc',20164,0,63),(5121,20155,'RegistrarResultadoEntrevista_WAR_revportlet',4,'25915_LAYOUT_RegistrarResultadoEntrevista_WAR_revportlet_INSTANCE_GPsiPA0asYdc',20171,0,1),(5122,20155,'145',4,'25921_LAYOUT_145',20164,0,63),(5123,20155,'145',4,'25921_LAYOUT_145',20171,0,1),(5124,20155,'2_WAR_notificationsportlet',4,'25921_LAYOUT_2_WAR_notificationsportlet',20164,0,63),(5125,20155,'2_WAR_notificationsportlet',4,'25921_LAYOUT_2_WAR_notificationsportlet',20171,0,1),(5126,20155,'SeleccionarPersonal_WAR_revportlet',4,'25921_LAYOUT_SeleccionarPersonal_WAR_revportlet_INSTANCE_eLyDHlApH4eb',20164,0,63),(5127,20155,'SeleccionarPersonal_WAR_revportlet',4,'25921_LAYOUT_SeleccionarPersonal_WAR_revportlet_INSTANCE_eLyDHlApH4eb',20171,0,1),(5128,20155,'EvaluarFechaIngreso_WAR_revportlet',4,'25801_LAYOUT_EvaluarFechaIngreso_WAR_revportlet_INSTANCE_albqsp7rAam4',20164,0,63),(5129,20155,'EvaluarFechaIngreso_WAR_revportlet',4,'25801_LAYOUT_EvaluarFechaIngreso_WAR_revportlet_INSTANCE_albqsp7rAam4',20171,0,1),(6201,20155,'demotest_WAR_demotestportlet',1,'20155',20162,0,2),(6202,20155,'demotest_WAR_demotestportlet',1,'20155',20163,0,2),(6203,20155,'demotest_WAR_demotestportlet',1,'20155',20165,0,2),(6204,20155,'demotest_WAR_demotestportlet',1,'20155',20166,0,2),(6205,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'27102',20164,20159,15),(6209,20155,'com.liferay.portal.model.Layout',4,'27116',20164,20159,1023),(6210,20155,'com.liferay.portal.model.Layout',4,'27116',20171,0,19),(6211,20155,'com.liferay.portal.model.Layout',4,'27116',20163,0,1),(6212,20155,'demotest_WAR_demotestportlet',4,'20185_LAYOUT_demotest_WAR_demotestportlet',20164,0,63),(6213,20155,'demotest_WAR_demotestportlet',4,'20185_LAYOUT_demotest_WAR_demotestportlet',20171,0,1),(6214,20155,'demotest_WAR_demotestportlet',4,'20185_LAYOUT_demotest_WAR_demotestportlet',20163,0,1),(6215,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'27126',20164,20199,15),(6216,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'27128',20164,20199,15),(6217,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'27132',20164,20199,255),(6218,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'27132',20171,0,3),(6219,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'27132',20163,0,3),(6220,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'27140',20164,20159,15),(6221,20155,'56',4,'20185_LAYOUT_56_INSTANCE_ic7ak16aYMsW',20164,0,63),(6222,20155,'56',4,'20185_LAYOUT_56_INSTANCE_ic7ak16aYMsW',20171,0,1),(6223,20155,'56',4,'20185_LAYOUT_56_INSTANCE_ic7ak16aYMsW',20163,0,1),(6224,20155,'86',4,'20185_LAYOUT_86',20164,0,63),(6225,20155,'86',4,'20185_LAYOUT_86',20171,0,1),(6226,20155,'86',4,'20185_LAYOUT_86',20163,0,1),(7704,20155,'com.liferay.portal.model.Role',4,'28611',20164,20199,127),(9301,20155,'com.liferay.portal.model.Layout',4,'30405',20164,20159,1023),(9302,20155,'com.liferay.portal.model.Layout',4,'30405',20171,0,19),(9303,20155,'com.liferay.portal.model.Layout',4,'30405',20163,0,1);
/*!40000 ALTER TABLE `resourcepermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resourcetypepermission`
--

DROP TABLE IF EXISTS `resourcetypepermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resourcetypepermission` (
  `resourceTypePermissionId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `roleId` bigint(20) DEFAULT NULL,
  `actionIds` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`resourceTypePermissionId`),
  UNIQUE KEY `IX_BA497163` (`companyId`,`groupId`,`name`,`roleId`),
  KEY `IX_7D81F66F` (`companyId`,`name`,`roleId`),
  KEY `IX_A82690E2` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resourcetypepermission`
--

LOCK TABLES `resourcetypepermission` WRITE;
/*!40000 ALTER TABLE `resourcetypepermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `resourcetypepermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `respuesta`
--

DROP TABLE IF EXISTS `respuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `respuesta` (
  `respuestaId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `correcta` tinyint(4) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`respuestaId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuesta`
--

LOCK TABLES `respuesta` WRITE;
/*!40000 ALTER TABLE `respuesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `respuesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_`
--

DROP TABLE IF EXISTS `role_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_` (
  `uuid_` varchar(75) DEFAULT NULL,
  `roleId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `title` longtext,
  `description` longtext,
  `type_` int(11) DEFAULT NULL,
  `subtype` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`roleId`),
  UNIQUE KEY `IX_A88E424E` (`companyId`,`classNameId`,`classPK`),
  UNIQUE KEY `IX_EBC931B8` (`companyId`,`name`),
  KEY `IX_449A10B9` (`companyId`),
  KEY `IX_F3E1C6FC` (`companyId`,`type_`),
  KEY `IX_F436EC8E` (`name`),
  KEY `IX_5EB4E2FB` (`subtype`),
  KEY `IX_F92B66E6` (`type_`),
  KEY `IX_CBE204` (`type_`,`subtype`),
  KEY `IX_26DB26C5` (`uuid_`),
  KEY `IX_B9FF6043` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_`
--

LOCK TABLES `role_` WRITE;
/*!40000 ALTER TABLE `role_` DISABLE KEYS */;
INSERT INTO `role_` VALUES ('176dfc40-5096-41ae-8933-ea00329870b7',20162,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20162,'Administrator','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Administrators are super users who can do anything.</Description></root>',1,''),('56d5bd67-6536-45b0-bb46-0be0cb2b3cf6',20163,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20163,'Guest','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Unauthenticated users always have this role.</Description></root>',1,''),('efd0c0ea-b311-4941-8523-34d6abaa600e',20164,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20164,'Owner','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">This is an implied role with respect to the objects users create.</Description></root>',1,''),('e7848d1e-8c6c-4418-9d93-a3f286a89960',20165,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20165,'Power User','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Power Users have their own personal site.</Description></root>',1,''),('236c8f9d-3368-4768-9a86-ce6071a374c8',20166,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20166,'User','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Authenticated users should be assigned this role.</Description></root>',1,''),('5a10b369-0bb4-4dac-9dee-2f6b7d437727',20167,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20167,'Organization Administrator','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Organization Administrators are super users of their organization but cannot make other users into Organization Administrators.</Description></root>',3,''),('fdd46161-d49c-4d5d-93e0-bcf74dcd5756',20168,20155,20159,'','2016-05-04 07:40:09','2016-05-04 07:40:09',20004,20168,'Organization Owner','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Organization Owners are super users of their organization and can assign organization roles to users.</Description></root>',3,''),('64a0794a-6dde-4a3f-8ea0-0b775f1c7571',20169,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20004,20169,'Organization User','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">All users who belong to an organization have this role within that organization.</Description></root>',3,''),('8c44ba6f-cfa0-4f14-a8e5-6c46711736af',20170,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20004,20170,'Site Administrator','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Site Administrators are super users of their site but cannot make other users into Site Administrators.</Description></root>',2,''),('976dfe23-09a2-4079-b1fb-b742f80c5a4d',20171,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20004,20171,'Site Member','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">All users who belong to a site have this role within that site.</Description></root>',2,''),('14497ca8-cff4-407e-b331-cbc1c4fe116f',20172,20155,20159,'','2016-05-04 07:40:10','2016-05-04 07:40:10',20004,20172,'Site Owner','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Site Owners are super users of their site and can assign site roles to users.</Description></root>',2,''),('d7bce821-063b-46ab-9b01-13e44f5fc894',20487,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20004,20487,'Organization Content Reviewer','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Autogenerated role from workflow definition</Description></root>',3,''),('c2dee14f-42de-45aa-9aa9-85f60e24dc6e',20489,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20004,20489,'Site Content Reviewer','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Autogenerated role from workflow definition</Description></root>',2,''),('43063df0-583e-4c5f-b96c-9cc7e76d08fa',20491,20155,20159,'','2016-05-04 07:42:14','2016-05-04 07:42:14',20004,20491,'Portal Content Reviewer','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Autogenerated role from workflow definition</Description></root>',1,''),('82ccd1f8-c73d-435e-893a-fcfd4c766c4f',20650,20155,20199,'Test Test','2016-05-04 07:53:46','2016-05-04 07:53:46',20004,20650,'COORDINADOR DE RRHH','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">COORDINADOR DE RRHH</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">COORDINADOR DE RRHH</Description></root>',1,''),('9ad0b1c0-4f4a-4a4a-96f1-151e0a28d370',28611,20155,20199,'Test Test','2016-06-28 06:06:05','2016-06-28 06:06:05',20004,28611,'POSTULANTE','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">POSTULANTE</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">POSTULANTE</Description></root>',1,'');
/*!40000 ALTER TABLE `role_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scframeworkversi_scproductvers`
--

DROP TABLE IF EXISTS `scframeworkversi_scproductvers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scframeworkversi_scproductvers` (
  `frameworkVersionId` bigint(20) NOT NULL,
  `productVersionId` bigint(20) NOT NULL,
  PRIMARY KEY (`frameworkVersionId`,`productVersionId`),
  KEY `IX_3BB93ECA` (`frameworkVersionId`),
  KEY `IX_E8D33FF9` (`productVersionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scframeworkversi_scproductvers`
--

LOCK TABLES `scframeworkversi_scproductvers` WRITE;
/*!40000 ALTER TABLE `scframeworkversi_scproductvers` DISABLE KEYS */;
/*!40000 ALTER TABLE `scframeworkversi_scproductvers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scframeworkversion`
--

DROP TABLE IF EXISTS `scframeworkversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scframeworkversion` (
  `frameworkVersionId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `url` longtext,
  `active_` tinyint(4) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`frameworkVersionId`),
  KEY `IX_C98C0D78` (`companyId`),
  KEY `IX_272991FA` (`groupId`),
  KEY `IX_6E1764F` (`groupId`,`active_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scframeworkversion`
--

LOCK TABLES `scframeworkversion` WRITE;
/*!40000 ALTER TABLE `scframeworkversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `scframeworkversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sclicense`
--

DROP TABLE IF EXISTS `sclicense`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sclicense` (
  `licenseId` bigint(20) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `url` longtext,
  `openSource` tinyint(4) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  `recommended` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`licenseId`),
  KEY `IX_1C841592` (`active_`),
  KEY `IX_5327BB79` (`active_`,`recommended`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sclicense`
--

LOCK TABLES `sclicense` WRITE;
/*!40000 ALTER TABLE `sclicense` DISABLE KEYS */;
/*!40000 ALTER TABLE `sclicense` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sclicenses_scproductentries`
--

DROP TABLE IF EXISTS `sclicenses_scproductentries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sclicenses_scproductentries` (
  `licenseId` bigint(20) NOT NULL,
  `productEntryId` bigint(20) NOT NULL,
  PRIMARY KEY (`licenseId`,`productEntryId`),
  KEY `IX_27006638` (`licenseId`),
  KEY `IX_D7710A66` (`productEntryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sclicenses_scproductentries`
--

LOCK TABLES `sclicenses_scproductentries` WRITE;
/*!40000 ALTER TABLE `sclicenses_scproductentries` DISABLE KEYS */;
/*!40000 ALTER TABLE `sclicenses_scproductentries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scproductentry`
--

DROP TABLE IF EXISTS `scproductentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scproductentry` (
  `productEntryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `tags` varchar(255) DEFAULT NULL,
  `shortDescription` longtext,
  `longDescription` longtext,
  `pageURL` longtext,
  `author` varchar(75) DEFAULT NULL,
  `repoGroupId` varchar(75) DEFAULT NULL,
  `repoArtifactId` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`productEntryId`),
  KEY `IX_5D25244F` (`companyId`),
  KEY `IX_72F87291` (`groupId`),
  KEY `IX_98E6A9CB` (`groupId`,`userId`),
  KEY `IX_7311E812` (`repoGroupId`,`repoArtifactId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scproductentry`
--

LOCK TABLES `scproductentry` WRITE;
/*!40000 ALTER TABLE `scproductentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `scproductentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scproductscreenshot`
--

DROP TABLE IF EXISTS `scproductscreenshot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scproductscreenshot` (
  `productScreenshotId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `productEntryId` bigint(20) DEFAULT NULL,
  `thumbnailId` bigint(20) DEFAULT NULL,
  `fullImageId` bigint(20) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  PRIMARY KEY (`productScreenshotId`),
  KEY `IX_AE8224CC` (`fullImageId`),
  KEY `IX_467956FD` (`productEntryId`),
  KEY `IX_DA913A55` (`productEntryId`,`priority`),
  KEY `IX_6C572DAC` (`thumbnailId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scproductscreenshot`
--

LOCK TABLES `scproductscreenshot` WRITE;
/*!40000 ALTER TABLE `scproductscreenshot` DISABLE KEYS */;
/*!40000 ALTER TABLE `scproductscreenshot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `scproductversion`
--

DROP TABLE IF EXISTS `scproductversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `scproductversion` (
  `productVersionId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `productEntryId` bigint(20) DEFAULT NULL,
  `version` varchar(75) DEFAULT NULL,
  `changeLog` longtext,
  `downloadPageURL` longtext,
  `directDownloadURL` varchar(2000) DEFAULT NULL,
  `repoStoreArtifact` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`productVersionId`),
  KEY `IX_7020130F` (`directDownloadURL`(767)),
  KEY `IX_8377A211` (`productEntryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scproductversion`
--

LOCK TABLES `scproductversion` WRITE;
/*!40000 ALTER TABLE `scproductversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `scproductversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicecomponent`
--

DROP TABLE IF EXISTS `servicecomponent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicecomponent` (
  `serviceComponentId` bigint(20) NOT NULL,
  `buildNamespace` varchar(75) DEFAULT NULL,
  `buildNumber` bigint(20) DEFAULT NULL,
  `buildDate` bigint(20) DEFAULT NULL,
  `data_` longtext,
  PRIMARY KEY (`serviceComponentId`),
  UNIQUE KEY `IX_4F0315B8` (`buildNamespace`,`buildNumber`),
  KEY `IX_7338606F` (`buildNamespace`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicecomponent`
--

LOCK TABLES `servicecomponent` WRITE;
/*!40000 ALTER TABLE `servicecomponent` DISABLE KEYS */;
INSERT INTO `servicecomponent` VALUES (20440,'Marketplace',4,1410828214125,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table Marketplace_App (\n	uuid_ VARCHAR(75) null,\n	appId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	remoteAppId LONG,\n	title VARCHAR(75) null,\n	description STRING null,\n	category VARCHAR(75) null,\n	iconURL STRING null,\n	version VARCHAR(75) null\n);\n\ncreate table Marketplace_Module (\n	uuid_ VARCHAR(75) null,\n	moduleId LONG not null primary key,\n	appId LONG,\n	bundleSymbolicName VARCHAR(500) null,\n	bundleVersion VARCHAR(75) null,\n	contextName VARCHAR(75) null\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_94A7EF25 on Marketplace_App (category);\ncreate index IX_865B7BD5 on Marketplace_App (companyId);\ncreate index IX_20F14D93 on Marketplace_App (remoteAppId);\ncreate index IX_3E667FE1 on Marketplace_App (uuid_);\ncreate index IX_A7807DA7 on Marketplace_App (uuid_, companyId);\n\ncreate index IX_7DC16D26 on Marketplace_Module (appId);\ncreate index IX_5848F52D on Marketplace_Module (appId, bundleSymbolicName, bundleVersion);\ncreate index IX_C6938724 on Marketplace_Module (appId, contextName);\ncreate index IX_DD03D499 on Marketplace_Module (bundleSymbolicName);\ncreate index IX_F2F1E964 on Marketplace_Module (contextName);\ncreate index IX_A7EFD80E on Marketplace_Module (uuid_);]]></indexes-sql>\n</data>'),(20448,'Calendar',4,1424703239325,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table Calendar (\n	uuid_ VARCHAR(75) null,\n	calendarId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	resourceBlockId LONG,\n	calendarResourceId LONG,\n	name STRING null,\n	description STRING null,\n	timeZoneId VARCHAR(75) null,\n	color INTEGER,\n	defaultCalendar BOOLEAN,\n	enableComments BOOLEAN,\n	enableRatings BOOLEAN\n);\n\ncreate table CalendarBooking (\n	uuid_ VARCHAR(75) null,\n	calendarBookingId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	resourceBlockId LONG,\n	calendarId LONG,\n	calendarResourceId LONG,\n	parentCalendarBookingId LONG,\n	vEventUid VARCHAR(255) null,\n	title STRING null,\n	description TEXT null,\n	location STRING null,\n	startTime LONG,\n	endTime LONG,\n	allDay BOOLEAN,\n	recurrence STRING null,\n	firstReminder LONG,\n	firstReminderType VARCHAR(75) null,\n	secondReminder LONG,\n	secondReminderType VARCHAR(75) null,\n	status INTEGER,\n	statusByUserId LONG,\n	statusByUserName VARCHAR(75) null,\n	statusDate DATE null\n);\n\ncreate table CalendarNotificationTemplate (\n	uuid_ VARCHAR(75) null,\n	calendarNotificationTemplateId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	calendarId LONG,\n	notificationType VARCHAR(75) null,\n	notificationTypeSettings VARCHAR(75) null,\n	notificationTemplateType VARCHAR(75) null,\n	subject VARCHAR(75) null,\n	body TEXT null\n);\n\ncreate table CalendarResource (\n	uuid_ VARCHAR(75) null,\n	calendarResourceId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	resourceBlockId LONG,\n	classNameId LONG,\n	classPK LONG,\n	classUuid VARCHAR(75) null,\n	code_ VARCHAR(75) null,\n	name STRING null,\n	description STRING null,\n	active_ BOOLEAN\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_B53EB0E1 on Calendar (groupId, calendarResourceId);\ncreate index IX_97FC174E on Calendar (groupId, calendarResourceId, defaultCalendar);\ncreate index IX_F0FAF226 on Calendar (resourceBlockId);\ncreate index IX_96C8590 on Calendar (uuid_);\ncreate index IX_97656498 on Calendar (uuid_, companyId);\ncreate unique index IX_3AE311A on Calendar (uuid_, groupId);\n\ncreate index IX_D300DFCE on CalendarBooking (calendarId);\ncreate unique index IX_113A264E on CalendarBooking (calendarId, parentCalendarBookingId);\ncreate index IX_470170B4 on CalendarBooking (calendarId, status);\ncreate unique index IX_8B23DA0E on CalendarBooking (calendarId, vEventUid);\ncreate index IX_B198FFC on CalendarBooking (calendarResourceId);\ncreate index IX_57EBF55B on CalendarBooking (parentCalendarBookingId);\ncreate index IX_F7B8A941 on CalendarBooking (parentCalendarBookingId, status);\ncreate index IX_22DFDB49 on CalendarBooking (resourceBlockId);\ncreate index IX_F6E8EE73 on CalendarBooking (uuid_);\ncreate index IX_A21D9FD5 on CalendarBooking (uuid_, companyId);\ncreate unique index IX_F4C61797 on CalendarBooking (uuid_, groupId);\n\ncreate index IX_A412E5B6 on CalendarNotificationTemplate (calendarId);\ncreate index IX_7727A482 on CalendarNotificationTemplate (calendarId, notificationType, notificationTemplateType);\ncreate index IX_A2D4D78B on CalendarNotificationTemplate (uuid_);\ncreate index IX_4D7D97BD on CalendarNotificationTemplate (uuid_, companyId);\ncreate unique index IX_4012E97F on CalendarNotificationTemplate (uuid_, groupId);\n\ncreate index IX_76DDD0F7 on CalendarResource (active_);\ncreate unique index IX_16A12327 on CalendarResource (classNameId, classPK);\ncreate index IX_4470A59D on CalendarResource (companyId, code_, active_);\ncreate index IX_1243D698 on CalendarResource (groupId);\ncreate index IX_40678371 on CalendarResource (groupId, active_);\ncreate index IX_55C2F8AA on CalendarResource (groupId, code_);\ncreate index IX_8BCB4D38 on CalendarResource (resourceBlockId);\ncreate index IX_150E2F22 on CalendarResource (uuid_);\ncreate index IX_56A06BC6 on CalendarResource (uuid_, companyId);\ncreate unique index IX_4ABD2BC8 on CalendarResource (uuid_, groupId);]]></indexes-sql>\n</data>'),(20467,'Kaleo',8,1425595080483,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table KaleoAction (\n	kaleoActionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoNodeName VARCHAR(200) null,\n	name VARCHAR(200) null,\n	description STRING null,\n	executionType VARCHAR(20) null,\n	script TEXT null,\n	scriptLanguage VARCHAR(75) null,\n	scriptRequiredContexts STRING null,\n	priority INTEGER\n);\n\ncreate table KaleoCondition (\n	kaleoConditionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	script TEXT null,\n	scriptLanguage VARCHAR(75) null,\n	scriptRequiredContexts STRING null\n);\n\ncreate table KaleoDefinition (\n	kaleoDefinitionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	name VARCHAR(200) null,\n	title STRING null,\n	description STRING null,\n	content TEXT null,\n	version INTEGER,\n	active_ BOOLEAN,\n	startKaleoNodeId LONG\n);\n\ncreate table KaleoInstance (\n	kaleoInstanceId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoDefinitionName VARCHAR(200) null,\n	kaleoDefinitionVersion INTEGER,\n	rootKaleoInstanceTokenId LONG,\n	className VARCHAR(200) null,\n	classPK LONG,\n	completed BOOLEAN,\n	completionDate DATE null,\n	workflowContext TEXT null\n);\n\ncreate table KaleoInstanceToken (\n	kaleoInstanceTokenId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	parentKaleoInstanceTokenId LONG,\n	currentKaleoNodeId LONG,\n	currentKaleoNodeName VARCHAR(200) null,\n	className VARCHAR(200) null,\n	classPK LONG,\n	completed BOOLEAN,\n	completionDate DATE null\n);\n\ncreate table KaleoLog (\n	kaleoLogId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskInstanceTokenId LONG,\n	kaleoNodeName VARCHAR(200) null,\n	terminalKaleoNode BOOLEAN,\n	kaleoActionId LONG,\n	kaleoActionName VARCHAR(200) null,\n	kaleoActionDescription STRING null,\n	previousKaleoNodeId LONG,\n	previousKaleoNodeName VARCHAR(200) null,\n	previousAssigneeClassName VARCHAR(200) null,\n	previousAssigneeClassPK LONG,\n	currentAssigneeClassName VARCHAR(200) null,\n	currentAssigneeClassPK LONG,\n	type_ VARCHAR(50) null,\n	comment_ TEXT null,\n	startDate DATE null,\n	endDate DATE null,\n	duration LONG,\n	workflowContext TEXT null\n);\n\ncreate table KaleoNode (\n	kaleoNodeId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	name VARCHAR(200) null,\n	metadata STRING null,\n	description STRING null,\n	type_ VARCHAR(20) null,\n	initial_ BOOLEAN,\n	terminal BOOLEAN\n);\n\ncreate table KaleoNotification (\n	kaleoNotificationId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoNodeName VARCHAR(200) null,\n	name VARCHAR(200) null,\n	description STRING null,\n	executionType VARCHAR(20) null,\n	template TEXT null,\n	templateLanguage VARCHAR(75) null,\n	notificationTypes VARCHAR(25) null\n);\n\ncreate table KaleoNotificationRecipient (\n	kaleoNotificationRecipientId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNotificationId LONG,\n	recipientClassName VARCHAR(200) null,\n	recipientClassPK LONG,\n	recipientRoleType INTEGER,\n	address VARCHAR(255) null\n);\n\ncreate table KaleoTask (\n	kaleoTaskId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	name VARCHAR(200) null,\n	description STRING null\n);\n\ncreate table KaleoTaskAssignment (\n	kaleoTaskAssignmentId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	assigneeClassName VARCHAR(200) null,\n	assigneeClassPK LONG,\n	assigneeActionId VARCHAR(75) null,\n	assigneeScript TEXT null,\n	assigneeScriptLanguage VARCHAR(75) null,\n	assigneeScriptRequiredContexts STRING null\n);\n\ncreate table KaleoTaskAssignmentInstance (\n	kaleoTaskAssignmentInstanceId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskInstanceTokenId LONG,\n	kaleoTaskId LONG,\n	kaleoTaskName VARCHAR(200) null,\n	assigneeClassName VARCHAR(200) null,\n	assigneeClassPK LONG,\n	completed BOOLEAN,\n	completionDate DATE null\n);\n\ncreate table KaleoTaskInstanceToken (\n	kaleoTaskInstanceTokenId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskId LONG,\n	kaleoTaskName VARCHAR(200) null,\n	className VARCHAR(200) null,\n	classPK LONG,\n	completionUserId LONG,\n	completed BOOLEAN,\n	completionDate DATE null,\n	dueDate DATE null,\n	workflowContext TEXT null\n);\n\ncreate table KaleoTimer (\n	kaleoTimerId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	name VARCHAR(75) null,\n	blocking BOOLEAN,\n	description STRING null,\n	duration DOUBLE,\n	scale VARCHAR(75) null,\n	recurrenceDuration DOUBLE,\n	recurrenceScale VARCHAR(75) null\n);\n\ncreate table KaleoTimerInstanceToken (\n	kaleoTimerInstanceTokenId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskInstanceTokenId LONG,\n	kaleoTimerId LONG,\n	kaleoTimerName VARCHAR(200) null,\n	blocking BOOLEAN,\n	completionUserId LONG,\n	completed BOOLEAN,\n	completionDate DATE null,\n	workflowContext TEXT null\n);\n\ncreate table KaleoTransition (\n	kaleoTransitionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	name VARCHAR(200) null,\n	description STRING null,\n	sourceKaleoNodeId LONG,\n	sourceKaleoNodeName VARCHAR(200) null,\n	targetKaleoNodeId LONG,\n	targetKaleoNodeName VARCHAR(200) null,\n	defaultTransition BOOLEAN\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_50E9112C on KaleoAction (companyId);\ncreate index IX_170EFD7A on KaleoAction (kaleoClassName, kaleoClassPK);\ncreate index IX_4B2545E8 on KaleoAction (kaleoClassName, kaleoClassPK, executionType);\ncreate index IX_F95A622 on KaleoAction (kaleoDefinitionId);\n\ncreate index IX_FEE46067 on KaleoCondition (companyId);\ncreate index IX_DC978A5D on KaleoCondition (kaleoDefinitionId);\ncreate index IX_86CBD4C on KaleoCondition (kaleoNodeId);\n\ncreate index IX_40B9112F on KaleoDefinition (companyId);\ncreate index IX_408542BA on KaleoDefinition (companyId, active_);\ncreate index IX_76C781AE on KaleoDefinition (companyId, name);\ncreate index IX_4C23F11B on KaleoDefinition (companyId, name, active_);\ncreate index IX_EC14F81A on KaleoDefinition (companyId, name, version);\n\ncreate index IX_58D85ECB on KaleoInstance (className, classPK);\ncreate index IX_5F2FCD2D on KaleoInstance (companyId);\ncreate index IX_BF5839F8 on KaleoInstance (companyId, kaleoDefinitionName, kaleoDefinitionVersion, completionDate);\ncreate index IX_C6D7A867 on KaleoInstance (companyId, userId);\ncreate index IX_4DA4D123 on KaleoInstance (kaleoDefinitionId);\ncreate index IX_ACF16238 on KaleoInstance (kaleoDefinitionId, completed);\n\ncreate index IX_153721BE on KaleoInstanceToken (companyId);\ncreate index IX_4A86923B on KaleoInstanceToken (companyId, parentKaleoInstanceTokenId);\ncreate index IX_360D34D9 on KaleoInstanceToken (companyId, parentKaleoInstanceTokenId, completionDate);\ncreate index IX_7BDB04B4 on KaleoInstanceToken (kaleoDefinitionId);\ncreate index IX_F42AAFF6 on KaleoInstanceToken (kaleoInstanceId);\n\ncreate index IX_73B5F4DE on KaleoLog (companyId);\ncreate index IX_E66A153A on KaleoLog (kaleoClassName, kaleoClassPK, kaleoInstanceTokenId, type_);\ncreate index IX_6C64B7D4 on KaleoLog (kaleoDefinitionId);\ncreate index IX_5BC6AB16 on KaleoLog (kaleoInstanceId);\ncreate index IX_470B9FF8 on KaleoLog (kaleoInstanceTokenId, type_);\ncreate index IX_B0CDCA38 on KaleoLog (kaleoTaskInstanceTokenId);\n\ncreate index IX_C4E9ACE0 on KaleoNode (companyId);\ncreate index IX_F28C443E on KaleoNode (companyId, kaleoDefinitionId);\ncreate index IX_32E94DD6 on KaleoNode (kaleoDefinitionId);\n\ncreate index IX_38829497 on KaleoNotification (companyId);\ncreate index IX_902D342F on KaleoNotification (kaleoClassName, kaleoClassPK);\ncreate index IX_F3362E93 on KaleoNotification (kaleoClassName, kaleoClassPK, executionType);\ncreate index IX_4B968E8D on KaleoNotification (kaleoDefinitionId);\n\ncreate index IX_2C8C4AF4 on KaleoNotificationRecipient (companyId);\ncreate index IX_AA6697EA on KaleoNotificationRecipient (kaleoDefinitionId);\ncreate index IX_7F4FED02 on KaleoNotificationRecipient (kaleoNotificationId);\n\ncreate index IX_E1F8B23D on KaleoTask (companyId);\ncreate index IX_3FFA633 on KaleoTask (kaleoDefinitionId);\ncreate index IX_77B3F1A2 on KaleoTask (kaleoNodeId);\n\ncreate index IX_611732B0 on KaleoTaskAssignment (companyId);\ncreate index IX_D835C576 on KaleoTaskAssignment (kaleoClassName, kaleoClassPK);\ncreate index IX_1087068E on KaleoTaskAssignment (kaleoClassName, kaleoClassPK, assigneeClassName);\ncreate index IX_575C03A6 on KaleoTaskAssignment (kaleoDefinitionId);\n\ncreate index IX_945F4EB7 on KaleoTaskAssignmentInstance (assigneeClassName);\ncreate index IX_3BD436FD on KaleoTaskAssignmentInstance (assigneeClassName, assigneeClassPK);\ncreate index IX_6E3CDA1B on KaleoTaskAssignmentInstance (companyId);\ncreate index IX_38A47B17 on KaleoTaskAssignmentInstance (groupId, assigneeClassPK);\ncreate index IX_C851011 on KaleoTaskAssignmentInstance (kaleoDefinitionId);\ncreate index IX_67A9EE93 on KaleoTaskAssignmentInstance (kaleoInstanceId);\ncreate index IX_D4C2235B on KaleoTaskAssignmentInstance (kaleoTaskInstanceTokenId);\n\ncreate index IX_A3271995 on KaleoTaskInstanceToken (className, classPK);\ncreate index IX_997FE723 on KaleoTaskInstanceToken (companyId);\ncreate index IX_608E9519 on KaleoTaskInstanceToken (kaleoDefinitionId);\ncreate index IX_2CE1159B on KaleoTaskInstanceToken (kaleoInstanceId);\ncreate index IX_B857A115 on KaleoTaskInstanceToken (kaleoInstanceId, kaleoTaskId);\n\ncreate index IX_4DE6A889 on KaleoTimer (kaleoClassName, kaleoClassPK);\ncreate index IX_1A479F32 on KaleoTimer (kaleoClassName, kaleoClassPK, blocking);\n\ncreate index IX_DB96C55B on KaleoTimerInstanceToken (kaleoInstanceId);\ncreate index IX_DB279423 on KaleoTimerInstanceToken (kaleoInstanceTokenId, completed);\ncreate index IX_9932524C on KaleoTimerInstanceToken (kaleoInstanceTokenId, completed, blocking);\ncreate index IX_13A5BA2C on KaleoTimerInstanceToken (kaleoInstanceTokenId, kaleoTimerId);\n\ncreate index IX_41D6C6D on KaleoTransition (companyId);\ncreate index IX_479F3063 on KaleoTransition (kaleoDefinitionId);\ncreate index IX_A392DFD2 on KaleoTransition (kaleoNodeId);\ncreate index IX_A38E2194 on KaleoTransition (kaleoNodeId, defaultTransition);\ncreate index IX_85268A11 on KaleoTransition (kaleoNodeId, name);]]></indexes-sql>\n</data>'),(20483,'Notification',1,1409250476826,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table Notifications_UserNotificationEvent (\n	notificationEventId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userNotificationEventId LONG,\n	timestamp LONG,\n	delivered BOOLEAN,\n	actionRequired BOOLEAN,\n	archived BOOLEAN\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_93C52776 on Notifications_UserNotificationEvent (userId, actionRequired);\ncreate index IX_36E5AE4C on Notifications_UserNotificationEvent (userId, actionRequired, archived);\ncreate index IX_73C065F0 on Notifications_UserNotificationEvent (userId, delivered, actionRequired);\ncreate unique index IX_DC9FCEDC on Notifications_UserNotificationEvent (userNotificationEventId);]]></indexes-sql>\n</data>'),(20505,'OpenSocial',4,1343264401607,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table OpenSocial_Gadget (\n	uuid_ VARCHAR(75) null,\n	gadgetId LONG not null primary key,\n	companyId LONG,\n	createDate DATE null,\n	modifiedDate DATE null,\n	name VARCHAR(75) null,\n	url STRING null,\n	portletCategoryNames STRING null\n);\n\ncreate table OpenSocial_OAuthConsumer (\n	oAuthConsumerId LONG not null primary key,\n	companyId LONG,\n	createDate DATE null,\n	modifiedDate DATE null,\n	gadgetKey VARCHAR(75) null,\n	serviceName VARCHAR(75) null,\n	consumerKey VARCHAR(75) null,\n	consumerSecret TEXT null,\n	keyType VARCHAR(75) null\n);\n\ncreate table OpenSocial_OAuthToken (\n	oAuthTokenId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	gadgetKey VARCHAR(75) null,\n	serviceName VARCHAR(75) null,\n	moduleId LONG,\n	accessToken VARCHAR(75) null,\n	tokenName VARCHAR(75) null,\n	tokenSecret VARCHAR(75) null,\n	sessionHandle VARCHAR(75) null,\n	expiration LONG\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_729869EE on OpenSocial_Gadget (companyId);\ncreate unique index IX_A6A89EB1 on OpenSocial_Gadget (companyId, url);\ncreate index IX_E1F8627A on OpenSocial_Gadget (uuid_);\ncreate index IX_3C79316E on OpenSocial_Gadget (uuid_, companyId);\n\ncreate index IX_47206618 on OpenSocial_OAuthConsumer (gadgetKey);\ncreate index IX_8E715BF8 on OpenSocial_OAuthConsumer (gadgetKey, serviceName);\n\ncreate index IX_6C8CCC3D on OpenSocial_OAuthToken (gadgetKey, serviceName);\ncreate index IX_CDD35402 on OpenSocial_OAuthToken (userId, gadgetKey, serviceName, moduleId, tokenName);]]></indexes-sql>\n</data>'),(20514,'Sync',6,1445034861916,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table SyncDLFileVersionDiff (\n	syncDLFileVersionDiffId LONG not null primary key,\n	fileEntryId LONG,\n	sourceFileVersionId LONG,\n	targetFileVersionId LONG,\n	dataFileEntryId LONG,\n	size_ LONG,\n	expirationDate DATE null\n);\n\ncreate table SyncDLObject (\n	syncDLObjectId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createTime LONG,\n	modifiedTime LONG,\n	repositoryId LONG,\n	parentFolderId LONG,\n	treePath STRING null,\n	name VARCHAR(255) null,\n	extension VARCHAR(75) null,\n	mimeType VARCHAR(75) null,\n	description STRING null,\n	changeLog VARCHAR(75) null,\n	extraSettings TEXT null,\n	version VARCHAR(75) null,\n	versionId LONG,\n	size_ LONG,\n	checksum VARCHAR(75) null,\n	event VARCHAR(75) null,\n	lastPermissionChangeDate DATE null,\n	lockExpirationDate DATE null,\n	lockUserId LONG,\n	lockUserName VARCHAR(75) null,\n	type_ VARCHAR(75) null,\n	typePK LONG,\n	typeUuid VARCHAR(75) null\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_A9B43C55 on SyncDLFileVersionDiff (expirationDate);\ncreate index IX_F832A75D on SyncDLFileVersionDiff (fileEntryId);\ncreate unique index IX_AC4C7667 on SyncDLFileVersionDiff (fileEntryId, sourceFileVersionId, targetFileVersionId);\n\ncreate index IX_980323CB on SyncDLObject (modifiedTime, repositoryId);\ncreate index IX_8D4FDC9F on SyncDLObject (modifiedTime, repositoryId, event);\ncreate index IX_A3ACE372 on SyncDLObject (modifiedTime, repositoryId, parentFolderId);\ncreate index IX_F174AD48 on SyncDLObject (repositoryId, parentFolderId);\ncreate index IX_3BE7BB8D on SyncDLObject (repositoryId, parentFolderId, type_);\ncreate index IX_57F62914 on SyncDLObject (repositoryId, type_);\ncreate unique index IX_E3F57BD6 on SyncDLObject (type_, typePK);\ncreate index IX_28CD54BB on SyncDLObject (type_, version);\ncreate index IX_1CCA3B5 on SyncDLObject (version, type_);]]></indexes-sql>\n</data>'),(24801,'rec',22,1464764060463,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad LONG,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(24901,'rec',24,1464803229172,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad LONG,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(25001,'rec',25,1464816744890,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad LONG,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(25301,'rec',26,1464980102319,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(25401,'rec',27,1464981648360,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(29201,'rec',30,1468134598892,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_31601335 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId);\ncreate index IX_26884404 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId, usuarioId);\n\ncreate index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_CFC74745 on Postulacion (solicitudRequerimientoId);\ncreate index IX_E272E5F4 on Postulacion (solicitudRequerimientoId, usuarioId);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(29501,'rec',32,1468374634468,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_31601335 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId);\ncreate index IX_26884404 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId, usuarioId);\n\ncreate index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_CFC74745 on Postulacion (solicitudRequerimientoId);\ncreate index IX_E272E5F4 on Postulacion (solicitudRequerimientoId, usuarioId);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(30301,'rec',33,1471414236725,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	descripcionPublicacion VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_31601335 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId);\ncreate index IX_26884404 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId, usuarioId);\n\ncreate index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_CFC74745 on Postulacion (solicitudRequerimientoId);\ncreate index IX_E272E5F4 on Postulacion (solicitudRequerimientoId, usuarioId);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(30501,'rec',45,1471417993554,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	descripcionPublicacion VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_31601335 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId);\ncreate index IX_26884404 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId, usuarioId);\n\ncreate index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_CFC74745 on Postulacion (solicitudRequerimientoId);\ncreate index IX_E272E5F4 on Postulacion (solicitudRequerimientoId, usuarioId);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>'),(30601,'rec',46,1471418438160,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table ActividadCronograma (\n	actividadCronogramaId LONG,\n	cronogramaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	cumplido BOOLEAN,\n	finalizado BOOLEAN,\n	tipoActividad LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table ActividadPlan (\n	actividadPlanId LONG not null primary key,\n	planAccionId LONG,\n	responsable LONG,\n	actividad VARCHAR(75) null,\n	evidencia VARCHAR(75) null,\n	objetivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Contrato (\n	contratoId LONG not null primary key,\n	usuarioId LONG,\n	motivo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	titulo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Cronograma (\n	cronogramaId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table DetalleRepuestaEvaluacion (\n	detalleRepuestaEvaluacionId LONG not null,\n	evaluacionId LONG not null,\n	usuarioId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada LONG,\n	primary key (detalleRepuestaEvaluacionId, evaluacionId, usuarioId)\n);\n\ncreate table DetalleRepuestaReclutamiento (\n	detalleRepsuestaId LONG not null,\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	descripcion VARCHAR(75) null,\n	respuestaSeleccionada INTEGER,\n	primary key (detalleRepsuestaId, evaluacionId, fasePostulacionId)\n);\n\ncreate table Estudio (\n	estudioId LONG not null primary key,\n	usuarioId LONG,\n	nombre VARCHAR(75) null,\n	nivel LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table EtiquetaRelacionada (\n	etiquetaRelacionadaId LONG not null primary key,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	etiqueta LONG,\n	tagId LONG,\n	groupId LONG,\n	companyId LONG\n);\n\ncreate table Evaluacion (\n	evaluacionId LONG not null primary key,\n	enfoque LONG,\n	puestoCategoriaEvaluacion LONG,\n	tipoEvaluacion LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table EvaluacionPregunta (\n	evaluacionId LONG not null,\n	preguntaId LONG not null,\n	nivel LONG,\n	primary key (evaluacionId, preguntaId)\n);\n\ncreate table Experiencia (\n	experienciaId LONG not null primary key,\n	usuarioId LONG,\n	descripcion VARCHAR(75) null,\n	empresa VARCHAR(75) null,\n	proyecto VARCHAR(75) null,\n	fechaInicio DATE null,\n	fechaFin DATE null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table FasePostulacion (\n	fasePostulacionId LONG not null primary key,\n	solicitudRequerimientoId LONG,\n	usuarioId LONG,\n	tipoFase LONG,\n	fechaFase DATE null,\n	descripcion VARCHAR(75) null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Funcion (\n	funcionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	etiqueta LONG,\n	exigible BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table InformeRetroalimentacion (\n	informeRetroalimentacionId LONG not null primary key,\n	planAccionId LONG,\n	usuario LONG,\n	titulo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table LogOperaciones (\n	logOperacionesId LONG not null primary key,\n	tipoActividad LONG,\n	actividad VARCHAR(75) null,\n	usuario VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Observaciones (\n	observacionId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	tabla VARCHAR(75) null,\n	registroId LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Parametro (\n	parametroId LONG not null primary key,\n	parametroIdpadre LONG,\n	codigo VARCHAR(75) null,\n	descripcion VARCHAR(75) null,\n	valor VARCHAR(75) null,\n	tipodato VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table PlanAccion (\n	planAccionId LONG not null primary key,\n	cronogramaId LONG,\n	responsable LONG,\n	fechaProgramada DATE null,\n	aprobadorColaborador BOOLEAN,\n	aprobadorLider BOOLEAN,\n	jerarquiaEvaluar LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Postulacion (\n	solicitudRequerimientoId LONG not null,\n	usuarioId LONG not null,\n	fechaPostulacion DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (solicitudRequerimientoId, usuarioId)\n);\n\ncreate table Pregunta (\n	preguntaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table PrioridadGrupoUsuarios (\n	prioridadGrupoUsuariosId LONG not null primary key,\n	solicitudEvaluacionDesempennoId LONG,\n	responsableGrupo VARCHAR(75) null,\n	grupoUsuario VARCHAR(75) null,\n	orden INTEGER,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table Puesto (\n	puestoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	categoria LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Referencia (\n	referenciaId LONG not null,\n	usuarioId LONG not null,\n	empresa VARCHAR(75) null,\n	telefono VARCHAR(75) null,\n	responsable VARCHAR(75) null,\n	motivo VARCHAR(75) null,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (referenciaId, usuarioId)\n);\n\ncreate table Requisito (\n	requisitoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	nivel LONG,\n	exigible BOOLEAN,\n	herramienta LONG,\n	tipoRequisito LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechacreamodifica DATE null\n);\n\ncreate table Respuesta (\n	respuestaId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	correcta BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudEvaluacionDesempenno (\n	solicitudEvaluacionDesempennoId LONG not null primary key,\n	descripcion VARCHAR(75) null,\n	fechaInicio DATE null,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudRequerimiento (\n	solicitudRequerimientoId LONG not null primary key,\n	areaSolicitante LONG,\n	cantidadRecursos INTEGER,\n	responsableRRHH LONG,\n	fechaLimite DATE null,\n	tiempoContrato LONG,\n	tipoNegocio LONG,\n	presupuestoMaximo LONG,\n	presupuestoMinimo LONG,\n	cliente LONG,\n	especialidad VARCHAR(75) null,\n	meta VARCHAR(75) null,\n	prioridad LONG,\n	motivo VARCHAR(75) null,\n	descripcionPublicacion VARCHAR(75) null,\n	modalidadjornada LONG,\n	modalidadcontrato LONG,\n	lugarTrabajo VARCHAR(75) null,\n	categoriaPuestoId LONG,\n	proyecto VARCHAR(75) null,\n	requieroEquipoTecnico BOOLEAN,\n	reemplazo BOOLEAN,\n	aprobacionFichaIngresoCapitalHumano BOOLEAN,\n	aprobacionFichaIngresoOperaciones BOOLEAN,\n	tiporeclutamiento LONG,\n	estado LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table SolicitudRequerimientoRequisito (\n	solicitudRequerimientoId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (solicitudRequerimientoId, tagId)\n);\n\ncreate table Usuario (\n	userId LONG not null primary key,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null\n);\n\ncreate table UsuarioEvaluacion (\n	actividadCronogramaId LONG not null,\n	usuarioId LONG not null,\n	evaluacionId LONG not null,\n	primary key (actividadCronogramaId, usuarioId, evaluacionId)\n);\n\ncreate table UsuarioRequisito (\n	userId LONG not null,\n	tagId LONG not null,\n	nivel LONG,\n	exigible BOOLEAN,\n	tipoRequisito LONG,\n	herramienta LONG,\n	cumplerequisito BOOLEAN,\n	activo BOOLEAN,\n	usuariocrea LONG,\n	fechacrea DATE null,\n	usuariomodifica LONG,\n	fechamodifica DATE null,\n	primary key (userId, tagId)\n);\n\ncreate table rec_ActividadPlanUsuario (\n	actividadPlanId LONG not null,\n	userId LONG not null,\n	primary key (actividadPlanId, userId)\n);\n\ncreate table rec_FasePostulacionEvaluacion (\n	evaluacionId LONG not null,\n	fasePostulacionId LONG not null,\n	primary key (evaluacionId, fasePostulacionId)\n);\n\ncreate table rec_PreguntaRespuesta (\n	preguntaId LONG not null,\n	respuestaId LONG not null,\n	primary key (preguntaId, respuestaId)\n);\n\ncreate table rec_SolicitudRequerimientoFuncion (\n	funcionId LONG not null,\n	solicitudRequerimientoId LONG not null,\n	primary key (funcionId, solicitudRequerimientoId)\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_31601335 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId);\ncreate index IX_26884404 on FasePostulacion (solicitudRequerimientoId, fasePostulacionId, usuarioId);\n\ncreate index IX_AC085D73 on Funcion (descripcion);\n\ncreate index IX_E0052BA5 on Parametro (parametroIdpadre);\ncreate index IX_9CDF672F on Parametro (parametroIdpadre, valor);\n\ncreate index IX_CFC74745 on Postulacion (solicitudRequerimientoId);\ncreate index IX_E272E5F4 on Postulacion (solicitudRequerimientoId, usuarioId);\n\ncreate index IX_24B38389 on Puesto (descripcion);\n\ncreate index IX_BF01054 on Requisito (descripcion);\n\ncreate index IX_96963AE1 on SolicitudRequerimiento (estado);\ncreate index IX_48953397 on SolicitudRequerimiento (solicitudRequerimientoId);\n\ncreate index IX_C1183918 on SolicitudRequerimientoRequisito (solicitudRequerimientoId);\ncreate index IX_9FB67BAD on SolicitudRequerimientoRequisito (solicitudRequerimientoId, tagId);\n\ncreate index IX_5495C78E on Usuario (userId);\n\ncreate index IX_71D8AD94 on rec_ActividadPlanUsuario (actividadPlanId);\ncreate index IX_9E887CF7 on rec_ActividadPlanUsuario (userId);\n\ncreate index IX_ABA1E4E2 on rec_FasePostulacionEvaluacion (evaluacionId);\ncreate index IX_78468627 on rec_FasePostulacionEvaluacion (fasePostulacionId);\n\ncreate index IX_9A360F46 on rec_PreguntaRespuesta (preguntaId);\ncreate index IX_26854F9E on rec_PreguntaRespuesta (respuestaId);\n\ncreate index IX_13820ED5 on rec_SolicitudRequerimientoFuncion (funcionId);\ncreate index IX_B967CB2A on rec_SolicitudRequerimientoFuncion (solicitudRequerimientoId);]]></indexes-sql>\n</data>');
/*!40000 ALTER TABLE `servicecomponent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shard`
--

DROP TABLE IF EXISTS `shard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shard` (
  `shardId` bigint(20) NOT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`shardId`),
  KEY `IX_DA5F4359` (`classNameId`,`classPK`),
  KEY `IX_941BA8C3` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shard`
--

LOCK TABLES `shard` WRITE;
/*!40000 ALTER TABLE `shard` DISABLE KEYS */;
INSERT INTO `shard` VALUES (20156,20025,20155,'default');
/*!40000 ALTER TABLE `shard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingcart`
--

DROP TABLE IF EXISTS `shoppingcart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingcart` (
  `cartId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `itemIds` longtext,
  `couponCodes` varchar(75) DEFAULT NULL,
  `altShipping` int(11) DEFAULT NULL,
  `insure` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`cartId`),
  UNIQUE KEY `IX_FC46FE16` (`groupId`,`userId`),
  KEY `IX_C28B41DC` (`groupId`),
  KEY `IX_54101CC8` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingcart`
--

LOCK TABLES `shoppingcart` WRITE;
/*!40000 ALTER TABLE `shoppingcart` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingcategory`
--

DROP TABLE IF EXISTS `shoppingcategory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingcategory` (
  `categoryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentCategoryId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`categoryId`),
  KEY `IX_5F615D3E` (`groupId`),
  KEY `IX_6A84467D` (`groupId`,`name`),
  KEY `IX_1E6464F5` (`groupId`,`parentCategoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingcategory`
--

LOCK TABLES `shoppingcategory` WRITE;
/*!40000 ALTER TABLE `shoppingcategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcategory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingcoupon`
--

DROP TABLE IF EXISTS `shoppingcoupon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingcoupon` (
  `couponId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `code_` varchar(75) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  `limitCategories` longtext,
  `limitSkus` longtext,
  `minOrder` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `discountType` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`couponId`),
  UNIQUE KEY `IX_DC60CFAE` (`code_`),
  KEY `IX_3251AF16` (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingcoupon`
--

LOCK TABLES `shoppingcoupon` WRITE;
/*!40000 ALTER TABLE `shoppingcoupon` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcoupon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingitem`
--

DROP TABLE IF EXISTS `shoppingitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingitem` (
  `itemId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `categoryId` bigint(20) DEFAULT NULL,
  `sku` varchar(75) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` longtext,
  `properties` longtext,
  `fields_` tinyint(4) DEFAULT NULL,
  `fieldsQuantities` longtext,
  `minQuantity` int(11) DEFAULT NULL,
  `maxQuantity` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `taxable` tinyint(4) DEFAULT NULL,
  `shipping` double DEFAULT NULL,
  `useShippingFormula` tinyint(4) DEFAULT NULL,
  `requiresShipping` tinyint(4) DEFAULT NULL,
  `stockQuantity` int(11) DEFAULT NULL,
  `featured_` tinyint(4) DEFAULT NULL,
  `sale_` tinyint(4) DEFAULT NULL,
  `smallImage` tinyint(4) DEFAULT NULL,
  `smallImageId` bigint(20) DEFAULT NULL,
  `smallImageURL` longtext,
  `mediumImage` tinyint(4) DEFAULT NULL,
  `mediumImageId` bigint(20) DEFAULT NULL,
  `mediumImageURL` longtext,
  `largeImage` tinyint(4) DEFAULT NULL,
  `largeImageId` bigint(20) DEFAULT NULL,
  `largeImageURL` longtext,
  PRIMARY KEY (`itemId`),
  UNIQUE KEY `IX_1C717CA6` (`companyId`,`sku`),
  KEY `IX_FEFE7D76` (`groupId`,`categoryId`),
  KEY `IX_903DC750` (`largeImageId`),
  KEY `IX_D217AB30` (`mediumImageId`),
  KEY `IX_FF203304` (`smallImageId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingitem`
--

LOCK TABLES `shoppingitem` WRITE;
/*!40000 ALTER TABLE `shoppingitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingitemfield`
--

DROP TABLE IF EXISTS `shoppingitemfield`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingitemfield` (
  `itemFieldId` bigint(20) NOT NULL,
  `itemId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `values_` longtext,
  `description` longtext,
  PRIMARY KEY (`itemFieldId`),
  KEY `IX_6D5F9B87` (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingitemfield`
--

LOCK TABLES `shoppingitemfield` WRITE;
/*!40000 ALTER TABLE `shoppingitemfield` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingitemfield` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingitemprice`
--

DROP TABLE IF EXISTS `shoppingitemprice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingitemprice` (
  `itemPriceId` bigint(20) NOT NULL,
  `itemId` bigint(20) DEFAULT NULL,
  `minQuantity` int(11) DEFAULT NULL,
  `maxQuantity` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `taxable` tinyint(4) DEFAULT NULL,
  `shipping` double DEFAULT NULL,
  `useShippingFormula` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemPriceId`),
  KEY `IX_EA6FD516` (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingitemprice`
--

LOCK TABLES `shoppingitemprice` WRITE;
/*!40000 ALTER TABLE `shoppingitemprice` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingitemprice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingorder`
--

DROP TABLE IF EXISTS `shoppingorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingorder` (
  `orderId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `number_` varchar(75) DEFAULT NULL,
  `tax` double DEFAULT NULL,
  `shipping` double DEFAULT NULL,
  `altShipping` varchar(75) DEFAULT NULL,
  `requiresShipping` tinyint(4) DEFAULT NULL,
  `insure` tinyint(4) DEFAULT NULL,
  `insurance` double DEFAULT NULL,
  `couponCodes` varchar(75) DEFAULT NULL,
  `couponDiscount` double DEFAULT NULL,
  `billingFirstName` varchar(75) DEFAULT NULL,
  `billingLastName` varchar(75) DEFAULT NULL,
  `billingEmailAddress` varchar(75) DEFAULT NULL,
  `billingCompany` varchar(75) DEFAULT NULL,
  `billingStreet` varchar(75) DEFAULT NULL,
  `billingCity` varchar(75) DEFAULT NULL,
  `billingState` varchar(75) DEFAULT NULL,
  `billingZip` varchar(75) DEFAULT NULL,
  `billingCountry` varchar(75) DEFAULT NULL,
  `billingPhone` varchar(75) DEFAULT NULL,
  `shipToBilling` tinyint(4) DEFAULT NULL,
  `shippingFirstName` varchar(75) DEFAULT NULL,
  `shippingLastName` varchar(75) DEFAULT NULL,
  `shippingEmailAddress` varchar(75) DEFAULT NULL,
  `shippingCompany` varchar(75) DEFAULT NULL,
  `shippingStreet` varchar(75) DEFAULT NULL,
  `shippingCity` varchar(75) DEFAULT NULL,
  `shippingState` varchar(75) DEFAULT NULL,
  `shippingZip` varchar(75) DEFAULT NULL,
  `shippingCountry` varchar(75) DEFAULT NULL,
  `shippingPhone` varchar(75) DEFAULT NULL,
  `ccName` varchar(75) DEFAULT NULL,
  `ccType` varchar(75) DEFAULT NULL,
  `ccNumber` varchar(75) DEFAULT NULL,
  `ccExpMonth` int(11) DEFAULT NULL,
  `ccExpYear` int(11) DEFAULT NULL,
  `ccVerNumber` varchar(75) DEFAULT NULL,
  `comments` longtext,
  `ppTxnId` varchar(75) DEFAULT NULL,
  `ppPaymentStatus` varchar(75) DEFAULT NULL,
  `ppPaymentGross` double DEFAULT NULL,
  `ppReceiverEmail` varchar(75) DEFAULT NULL,
  `ppPayerEmail` varchar(75) DEFAULT NULL,
  `sendOrderEmail` tinyint(4) DEFAULT NULL,
  `sendShippingEmail` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  UNIQUE KEY `IX_D7D6E87A` (`number_`),
  KEY `IX_1D15553E` (`groupId`),
  KEY `IX_119B5630` (`groupId`,`userId`,`ppPaymentStatus`),
  KEY `IX_F474FD89` (`ppTxnId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingorder`
--

LOCK TABLES `shoppingorder` WRITE;
/*!40000 ALTER TABLE `shoppingorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shoppingorderitem`
--

DROP TABLE IF EXISTS `shoppingorderitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shoppingorderitem` (
  `orderItemId` bigint(20) NOT NULL,
  `orderId` bigint(20) DEFAULT NULL,
  `itemId` varchar(75) DEFAULT NULL,
  `sku` varchar(75) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` longtext,
  `properties` longtext,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `shippedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`orderItemId`),
  KEY `IX_B5F82C7A` (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shoppingorderitem`
--

LOCK TABLES `shoppingorderitem` WRITE;
/*!40000 ALTER TABLE `shoppingorderitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingorderitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialactivity`
--

DROP TABLE IF EXISTS `socialactivity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialactivity` (
  `activityId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` bigint(20) DEFAULT NULL,
  `activitySetId` bigint(20) DEFAULT NULL,
  `mirrorActivityId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `parentClassNameId` bigint(20) DEFAULT NULL,
  `parentClassPK` bigint(20) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `extraData` longtext,
  `receiverUserId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`activityId`),
  UNIQUE KEY `IX_8F32DEC9` (`groupId`,`userId`,`createDate`,`classNameId`,`classPK`,`type_`,`receiverUserId`),
  KEY `IX_F542E9BC` (`activitySetId`),
  KEY `IX_82E39A0C` (`classNameId`),
  KEY `IX_A853C757` (`classNameId`,`classPK`),
  KEY `IX_D0E9029E` (`classNameId`,`classPK`,`type_`),
  KEY `IX_64B1BC66` (`companyId`),
  KEY `IX_2A2468` (`groupId`),
  KEY `IX_FB604DC7` (`groupId`,`userId`,`classNameId`,`classPK`,`type_`,`receiverUserId`),
  KEY `IX_1271F25F` (`mirrorActivityId`),
  KEY `IX_1F00C374` (`mirrorActivityId`,`classNameId`,`classPK`),
  KEY `IX_121CA3CB` (`receiverUserId`),
  KEY `IX_3504B8BC` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialactivity`
--

LOCK TABLES `socialactivity` WRITE;
/*!40000 ALTER TABLE `socialactivity` DISABLE KEYS */;
INSERT INTO `socialactivity` VALUES (1,20182,20155,20199,1466229063275,0,0,20109,27132,0,0,1,'{\"title\":\"<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\\\"es_ES\\\" default-locale=\\\"es_ES\\\"><Title language-id=\\\"es_ES\\\">Estructura de pruba<\\/Title><\\/root>\"}',0);
/*!40000 ALTER TABLE `socialactivity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialactivityachievement`
--

DROP TABLE IF EXISTS `socialactivityachievement`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialactivityachievement` (
  `activityAchievementId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `firstInGroup` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`activityAchievementId`),
  UNIQUE KEY `IX_D4390CAA` (`groupId`,`userId`,`name`),
  KEY `IX_E14B1F1` (`groupId`),
  KEY `IX_83E16F2F` (`groupId`,`firstInGroup`),
  KEY `IX_8F6408F0` (`groupId`,`name`),
  KEY `IX_C8FD892B` (`groupId`,`userId`),
  KEY `IX_AABC18E9` (`groupId`,`userId`,`firstInGroup`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialactivityachievement`
--

LOCK TABLES `socialactivityachievement` WRITE;
/*!40000 ALTER TABLE `socialactivityachievement` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivityachievement` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialactivitycounter`
--

DROP TABLE IF EXISTS `socialactivitycounter`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialactivitycounter` (
  `activityCounterId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `ownerType` int(11) DEFAULT NULL,
  `currentValue` int(11) DEFAULT NULL,
  `totalValue` int(11) DEFAULT NULL,
  `graceValue` int(11) DEFAULT NULL,
  `startPeriod` int(11) DEFAULT NULL,
  `endPeriod` int(11) DEFAULT NULL,
  `active_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`activityCounterId`),
  UNIQUE KEY `IX_1B7E3B67` (`groupId`,`classNameId`,`classPK`,`name`,`ownerType`,`endPeriod`),
  UNIQUE KEY `IX_374B35AE` (`groupId`,`classNameId`,`classPK`,`name`,`ownerType`,`startPeriod`),
  KEY `IX_A4B9A23B` (`classNameId`,`classPK`),
  KEY `IX_D6666704` (`groupId`),
  KEY `IX_926CDD04` (`groupId`,`classNameId`,`classPK`,`ownerType`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialactivitycounter`
--

LOCK TABLES `socialactivitycounter` WRITE;
/*!40000 ALTER TABLE `socialactivitycounter` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivitycounter` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialactivitylimit`
--

DROP TABLE IF EXISTS `socialactivitylimit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialactivitylimit` (
  `activityLimitId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `activityType` int(11) DEFAULT NULL,
  `activityCounterName` varchar(75) DEFAULT NULL,
  `value` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`activityLimitId`),
  UNIQUE KEY `IX_F1C1A617` (`groupId`,`userId`,`classNameId`,`classPK`,`activityType`,`activityCounterName`),
  KEY `IX_B15863FA` (`classNameId`,`classPK`),
  KEY `IX_18D4BAE5` (`groupId`),
  KEY `IX_6F9EDE9F` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialactivitylimit`
--

LOCK TABLES `socialactivitylimit` WRITE;
/*!40000 ALTER TABLE `socialactivitylimit` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivitylimit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialactivityset`
--

DROP TABLE IF EXISTS `socialactivityset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialactivityset` (
  `activitySetId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` bigint(20) DEFAULT NULL,
  `modifiedDate` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `extraData` longtext,
  `activityCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`activitySetId`),
  KEY `IX_4460FA14` (`classNameId`,`classPK`,`type_`),
  KEY `IX_9E13F2DE` (`groupId`),
  KEY `IX_9BE30DDF` (`groupId`,`userId`,`classNameId`,`type_`),
  KEY `IX_F71071BD` (`groupId`,`userId`,`type_`),
  KEY `IX_F80C4386` (`userId`),
  KEY `IX_62AC101A` (`userId`,`classNameId`,`classPK`,`type_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialactivityset`
--

LOCK TABLES `socialactivityset` WRITE;
/*!40000 ALTER TABLE `socialactivityset` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivityset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialactivitysetting`
--

DROP TABLE IF EXISTS `socialactivitysetting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialactivitysetting` (
  `activitySettingId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `activityType` int(11) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `value` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`activitySettingId`),
  KEY `IX_8BE5F230` (`groupId`),
  KEY `IX_384788CD` (`groupId`,`activityType`),
  KEY `IX_9D22151E` (`groupId`,`classNameId`),
  KEY `IX_1E9CF33B` (`groupId`,`classNameId`,`activityType`),
  KEY `IX_D984AABA` (`groupId`,`classNameId`,`activityType`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialactivitysetting`
--

LOCK TABLES `socialactivitysetting` WRITE;
/*!40000 ALTER TABLE `socialactivitysetting` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivitysetting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialrelation`
--

DROP TABLE IF EXISTS `socialrelation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialrelation` (
  `uuid_` varchar(75) DEFAULT NULL,
  `relationId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` bigint(20) DEFAULT NULL,
  `userId1` bigint(20) DEFAULT NULL,
  `userId2` bigint(20) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  PRIMARY KEY (`relationId`),
  UNIQUE KEY `IX_12A92145` (`userId1`,`userId2`,`type_`),
  KEY `IX_61171E99` (`companyId`),
  KEY `IX_95135D1C` (`companyId`,`type_`),
  KEY `IX_C31A64C6` (`type_`),
  KEY `IX_5A40CDCC` (`userId1`),
  KEY `IX_4B52BE89` (`userId1`,`type_`),
  KEY `IX_B5C9C690` (`userId1`,`userId2`),
  KEY `IX_5A40D18D` (`userId2`),
  KEY `IX_3F9C2FA8` (`userId2`,`type_`),
  KEY `IX_F0CA24A5` (`uuid_`),
  KEY `IX_5B30F663` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialrelation`
--

LOCK TABLES `socialrelation` WRITE;
/*!40000 ALTER TABLE `socialrelation` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialrelation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialrequest`
--

DROP TABLE IF EXISTS `socialrequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `socialrequest` (
  `uuid_` varchar(75) DEFAULT NULL,
  `requestId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` bigint(20) DEFAULT NULL,
  `modifiedDate` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `extraData` longtext,
  `receiverUserId` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`requestId`),
  UNIQUE KEY `IX_36A90CA7` (`userId`,`classNameId`,`classPK`,`type_`,`receiverUserId`),
  UNIQUE KEY `IX_4F973EFE` (`uuid_`,`groupId`),
  KEY `IX_D3425487` (`classNameId`,`classPK`,`type_`,`receiverUserId`,`status`),
  KEY `IX_A90FE5A0` (`companyId`),
  KEY `IX_32292ED1` (`receiverUserId`),
  KEY `IX_D9380CB7` (`receiverUserId`,`status`),
  KEY `IX_80F7A9C2` (`userId`),
  KEY `IX_CC86A444` (`userId`,`classNameId`,`classPK`,`type_`,`status`),
  KEY `IX_AB5906A8` (`userId`,`status`),
  KEY `IX_49D5872C` (`uuid_`),
  KEY `IX_8D42897C` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialrequest`
--

LOCK TABLES `socialrequest` WRITE;
/*!40000 ALTER TABLE `socialrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialrequest` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudevaluaciondesempenno`
--

DROP TABLE IF EXISTS `solicitudevaluaciondesempenno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitudevaluaciondesempenno` (
  `solicitudEvaluacionDesempennoId` bigint(20) NOT NULL,
  `descripcion` varchar(75) DEFAULT NULL,
  `fechaInicio` datetime DEFAULT NULL,
  `estado` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`solicitudEvaluacionDesempennoId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudevaluaciondesempenno`
--

LOCK TABLES `solicitudevaluaciondesempenno` WRITE;
/*!40000 ALTER TABLE `solicitudevaluaciondesempenno` DISABLE KEYS */;
/*!40000 ALTER TABLE `solicitudevaluaciondesempenno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudrequerimiento`
--

DROP TABLE IF EXISTS `solicitudrequerimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitudrequerimiento` (
  `solicitudRequerimientoId` bigint(20) NOT NULL,
  `areaSolicitante` bigint(20) DEFAULT NULL,
  `cantidadRecursos` int(11) DEFAULT NULL,
  `responsableRRHH` bigint(20) DEFAULT NULL,
  `fechaLimite` datetime DEFAULT NULL,
  `tiempoContrato` bigint(20) DEFAULT NULL,
  `tipoNegocio` bigint(20) DEFAULT NULL,
  `presupuestoMaximo` bigint(20) DEFAULT NULL,
  `presupuestoMinimo` bigint(20) DEFAULT NULL,
  `cliente` bigint(20) DEFAULT NULL,
  `especialidad` varchar(75) DEFAULT NULL,
  `meta` varchar(75) DEFAULT NULL,
  `prioridad` bigint(20) DEFAULT NULL,
  `motivo` varchar(75) DEFAULT NULL,
  `descripcionPublicacion` varchar(75) DEFAULT NULL,
  `modalidadjornada` bigint(20) DEFAULT NULL,
  `modalidadcontrato` bigint(20) DEFAULT NULL,
  `lugarTrabajo` varchar(75) DEFAULT NULL,
  `categoriaPuestoId` bigint(20) DEFAULT NULL,
  `proyecto` varchar(75) DEFAULT NULL,
  `requieroEquipoTecnico` tinyint(4) DEFAULT NULL,
  `reemplazo` tinyint(4) DEFAULT NULL,
  `aprobacionFichaIngresoCapitalHumano` tinyint(4) DEFAULT NULL,
  `aprobacionFichaIngresoOperaciones` tinyint(4) DEFAULT NULL,
  `tiporeclutamiento` bigint(20) DEFAULT NULL,
  `estado` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`solicitudRequerimientoId`),
  KEY `IX_96963AE1` (`estado`),
  KEY `IX_48953397` (`solicitudRequerimientoId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudrequerimiento`
--

LOCK TABLES `solicitudrequerimiento` WRITE;
/*!40000 ALTER TABLE `solicitudrequerimiento` DISABLE KEYS */;
INSERT INTO `solicitudrequerimiento` VALUES (1,60,5,20902,'2016-04-27 04:32:11',45,30,0,0,23,'Java','',17,'','',0,0,'',22903,'',0,0,0,0,0,68,1,20199,'2016-04-27 04:32:11',20199,NULL),(2,60,5,20902,'2016-04-27 04:37:39',45,30,0,0,23,'Java','',18,'','',0,0,'',22903,'',0,0,0,0,0,68,1,20199,'2016-04-27 04:37:39',20199,NULL),(3,61,5,20902,'2016-04-27 04:39:17',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,68,1,20199,'2016-04-27 04:39:17',20199,NULL),(4,62,5,20902,'2016-04-27 04:41:47',45,30,0,0,23,'Java','',17,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:41:47',20199,NULL),(5,63,5,20902,'2016-04-27 04:45:47',45,30,0,0,23,'Java','',18,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:45:47',20199,NULL),(6,60,5,20902,'2016-03-21 00:00:00',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,NULL),(7,61,5,20902,'2016-03-29 00:00:00',45,30,0,0,23,'Java','',17,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:15',20199,NULL),(8,61,5,20902,'2016-05-02 19:50:33',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-02 19:50:33',20199,NULL),(9,60,5,20902,'2016-03-21 00:00:00',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,67,1,20199,'2016-04-27 04:46:02',20199,NULL),(10,60,5,20902,'2016-03-21 00:00:00',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,NULL),(11,60,5,20902,'2016-03-21 00:00:00',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,NULL),(12,60,5,20902,'2016-03-21 00:00:00',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,NULL),(13,60,5,20902,'2016-05-17 00:00:00',45,30,850,850,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-04-27 04:46:02',20199,NULL),(14,60,5,20902,'2016-03-21 00:00:00',45,30,0,0,23,'Java','',19,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,NULL),(201,60,4,20902,'2016-05-26 00:00:00',46,31,1500,900,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:18:39',20199,NULL),(202,60,4,20902,'2016-05-18 00:00:00',46,31,900,850,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:22:04',20199,NULL),(203,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:12',20199,NULL),(204,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,67,1,20199,'2016-05-03 03:28:22',20199,NULL),(205,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,NULL),(206,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,NULL),(207,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,NULL),(208,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,67,1,20199,'2016-05-03 03:28:22',20199,NULL),(209,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,NULL),(210,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,NULL),(211,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,NULL),(212,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,NULL),(213,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,NULL),(214,60,5,20902,'2016-06-10 00:00:00',46,31,200,165,25,'Java','',0,'wetew','',0,0,'',22903,'',0,0,0,0,0,50,1,20199,'2016-05-03 03:28:23',20199,NULL),(215,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,NULL),(216,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,67,1,20199,'2016-05-03 03:28:24',20199,NULL),(217,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,NULL),(218,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,NULL),(219,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,NULL),(220,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,NULL),(221,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,NULL),(222,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,NULL),(223,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:28:25',20199,NULL),(224,60,5,20902,'2016-05-25 00:00:00',46,31,1234,123,25,'Java','',0,'xbfxbbf','',0,0,'',22903,'',0,0,0,0,0,50,1,20199,'2016-05-03 03:28:25',20199,NULL),(225,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,NULL),(226,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,NULL),(227,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,NULL),(228,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,NULL),(229,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:28:26',20199,NULL),(230,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:28:26',20199,NULL),(231,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:28:26',20199,NULL),(232,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:28:26',20199,NULL),(233,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:30:09',20199,NULL),(234,60,5,20902,'2016-06-17 00:00:00',46,31,2950,1850,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 03:30:12',20199,NULL),(235,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:35:51',20199,NULL),(236,60,5,20902,'2016-05-25 00:00:00',46,31,1234,123,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,49,1,20199,'2016-05-03 03:37:30',20199,NULL),(237,60,5,20902,'2016-05-25 00:00:00',46,31,950,850,25,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:11:17',20199,NULL),(238,61,4,20902,'2016-05-25 00:00:00',46,32,950,850,24,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 04:12:40',20199,NULL),(239,60,6,20902,'2016-05-25 00:00:00',46,33,950,850,28,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:17:24',20199,NULL),(240,60,6,20902,'2016-05-25 00:00:00',46,33,950,850,28,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 04:20:30',20199,NULL),(241,61,6,20902,'2016-05-25 00:00:00',45,30,950,850,28,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:22:53',20199,NULL),(242,61,5,20902,'2016-05-25 00:00:00',45,33,950,850,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 04:45:46',20199,NULL),(243,61,4,20902,'2016-05-25 00:00:00',45,32,1234,123,24,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,49,1,20199,'2016-05-03 04:50:52',20199,NULL),(244,61,6,20902,'2016-05-25 00:00:00',45,31,1500,960,24,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-03 04:53:49',20199,NULL),(245,60,5,20902,'2016-05-25 00:00:00',46,31,0,0,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,49,1,20199,'2016-05-03 05:51:59',20199,NULL),(301,61,5,20902,'2016-05-25 00:00:00',45,30,950,850,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-04 00:45:21',20199,NULL),(302,60,5,20902,'2016-05-18 00:00:00',46,31,950,850,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-04 00:50:38',20199,NULL),(303,60,7,20902,'2016-05-19 00:00:00',46,30,950,850,22,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-04 00:57:09',20199,NULL),(304,61,5,20902,'2016-06-24 00:00:00',45,31,25,13,24,'Java','',0,'fefefewf','',0,0,'',22903,'',0,0,0,0,0,50,1,20199,'2016-05-04 04:10:28',20199,NULL),(305,60,3,20902,'2016-05-17 00:00:00',45,32,7000,5000,23,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-04 04:12:28',20199,NULL),(401,60,23,20902,'2016-05-25 00:00:00',45,31,1500,900,24,'Java','',0,'','',0,0,'',22903,'',0,0,0,0,0,64,0,20199,'2016-05-04 05:27:47',20199,NULL),(402,60,3,20902,'2016-06-16 00:00:00',45,30,0,0,25,'Java','',0,'','',0,0,'',21323,'BVL',0,0,0,0,0,64,0,20199,'2016-06-03 19:35:13',20199,NULL);
/*!40000 ALTER TABLE `solicitudrequerimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitudrequerimientorequisito`
--

DROP TABLE IF EXISTS `solicitudrequerimientorequisito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitudrequerimientorequisito` (
  `solicitudRequerimientoId` bigint(20) NOT NULL,
  `tagId` bigint(20) NOT NULL,
  `nivel` bigint(20) DEFAULT NULL,
  `exigible` tinyint(4) DEFAULT NULL,
  `tipoRequisito` bigint(20) DEFAULT NULL,
  `herramienta` bigint(20) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`solicitudRequerimientoId`,`tagId`),
  KEY `IX_C1183918` (`solicitudRequerimientoId`),
  KEY `IX_9FB67BAD` (`solicitudRequerimientoId`,`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitudrequerimientorequisito`
--

LOCK TABLES `solicitudrequerimientorequisito` WRITE;
/*!40000 ALTER TABLE `solicitudrequerimientorequisito` DISABLE KEYS */;
INSERT INTO `solicitudrequerimientorequisito` VALUES (234,101,40,0,66,0,0,20199,'2016-06-01 18:04:54',20199,NULL),(234,402,40,0,66,0,0,20199,'2016-06-01 18:04:57',20199,NULL),(234,501,39,0,66,0,0,20199,'2016-06-03 02:27:44',20199,NULL),(234,21316,37,1,66,0,1,0,NULL,20199,NULL),(234,21318,39,0,66,0,1,20199,'2016-06-03 03:02:30',20199,NULL),(304,21316,38,1,66,0,1,20199,'2016-06-03 03:03:24',20199,NULL),(304,21318,39,1,67,0,1,20199,'2016-06-03 03:03:24',20199,NULL),(402,21316,38,1,66,0,1,20199,'2016-06-03 19:35:13',20199,NULL);
/*!40000 ALTER TABLE `solicitudrequerimientorequisito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscription` (
  `subscriptionId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `frequency` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`subscriptionId`),
  UNIQUE KEY `IX_2E1A92D4` (`companyId`,`userId`,`classNameId`,`classPK`),
  KEY `IX_786D171A` (`companyId`,`classNameId`,`classPK`),
  KEY `IX_54243AFD` (`userId`),
  KEY `IX_E8F34171` (`userId`,`classNameId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription`
--

LOCK TABLES `subscription` WRITE;
/*!40000 ALTER TABLE `subscription` DISABLE KEYS */;
/*!40000 ALTER TABLE `subscription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `syncdlfileversiondiff`
--

DROP TABLE IF EXISTS `syncdlfileversiondiff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `syncdlfileversiondiff` (
  `syncDLFileVersionDiffId` bigint(20) NOT NULL,
  `fileEntryId` bigint(20) DEFAULT NULL,
  `sourceFileVersionId` bigint(20) DEFAULT NULL,
  `targetFileVersionId` bigint(20) DEFAULT NULL,
  `dataFileEntryId` bigint(20) DEFAULT NULL,
  `size_` bigint(20) DEFAULT NULL,
  `expirationDate` datetime DEFAULT NULL,
  PRIMARY KEY (`syncDLFileVersionDiffId`),
  UNIQUE KEY `IX_AC4C7667` (`fileEntryId`,`sourceFileVersionId`,`targetFileVersionId`),
  KEY `IX_A9B43C55` (`expirationDate`),
  KEY `IX_F832A75D` (`fileEntryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syncdlfileversiondiff`
--

LOCK TABLES `syncdlfileversiondiff` WRITE;
/*!40000 ALTER TABLE `syncdlfileversiondiff` DISABLE KEYS */;
/*!40000 ALTER TABLE `syncdlfileversiondiff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `syncdlobject`
--

DROP TABLE IF EXISTS `syncdlobject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `syncdlobject` (
  `syncDLObjectId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createTime` bigint(20) DEFAULT NULL,
  `modifiedTime` bigint(20) DEFAULT NULL,
  `repositoryId` bigint(20) DEFAULT NULL,
  `parentFolderId` bigint(20) DEFAULT NULL,
  `treePath` longtext,
  `name` varchar(255) DEFAULT NULL,
  `extension` varchar(75) DEFAULT NULL,
  `mimeType` varchar(75) DEFAULT NULL,
  `description` longtext,
  `changeLog` varchar(75) DEFAULT NULL,
  `extraSettings` longtext,
  `version` varchar(75) DEFAULT NULL,
  `versionId` bigint(20) DEFAULT NULL,
  `size_` bigint(20) DEFAULT NULL,
  `checksum` varchar(75) DEFAULT NULL,
  `event` varchar(75) DEFAULT NULL,
  `lastPermissionChangeDate` datetime DEFAULT NULL,
  `lockExpirationDate` datetime DEFAULT NULL,
  `lockUserId` bigint(20) DEFAULT NULL,
  `lockUserName` varchar(75) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `typePK` bigint(20) DEFAULT NULL,
  `typeUuid` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`syncDLObjectId`),
  UNIQUE KEY `IX_E3F57BD6` (`type_`,`typePK`),
  KEY `IX_980323CB` (`modifiedTime`,`repositoryId`),
  KEY `IX_8D4FDC9F` (`modifiedTime`,`repositoryId`,`event`),
  KEY `IX_A3ACE372` (`modifiedTime`,`repositoryId`,`parentFolderId`),
  KEY `IX_F174AD48` (`repositoryId`,`parentFolderId`),
  KEY `IX_3BE7BB8D` (`repositoryId`,`parentFolderId`,`type_`),
  KEY `IX_57F62914` (`repositoryId`,`type_`),
  KEY `IX_28CD54BB` (`type_`,`version`),
  KEY `IX_1CCA3B5` (`version`,`type_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syncdlobject`
--

LOCK TABLES `syncdlobject` WRITE;
/*!40000 ALTER TABLE `syncdlobject` DISABLE KEYS */;
/*!40000 ALTER TABLE `syncdlobject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemevent`
--

DROP TABLE IF EXISTS `systemevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemevent` (
  `systemEventId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `classUuid` varchar(75) DEFAULT NULL,
  `referrerClassNameId` bigint(20) DEFAULT NULL,
  `parentSystemEventId` bigint(20) DEFAULT NULL,
  `systemEventSetKey` bigint(20) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `extraData` longtext,
  PRIMARY KEY (`systemEventId`),
  KEY `IX_72D73D39` (`groupId`),
  KEY `IX_7A2F0ECE` (`groupId`,`classNameId`,`classPK`),
  KEY `IX_FFCBB747` (`groupId`,`classNameId`,`classPK`,`type_`),
  KEY `IX_A19C89FF` (`groupId`,`systemEventSetKey`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemevent`
--

LOCK TABLES `systemevent` WRITE;
/*!40000 ALTER TABLE `systemevent` DISABLE KEYS */;
INSERT INTO `systemevent` VALUES (20618,20182,20155,20199,'Test Test','2016-05-04 07:48:46',20002,20605,'842b9b1e-7ebf-4c13-b556-70bd22624e15',0,0,20619,1,'{\"privateLayout\":\"true\"}'),(20621,20182,20155,20199,'Test Test','2016-05-04 07:48:50',20002,20611,'7af10bd0-37a6-427f-8e3f-d3799d72f115',0,0,20622,1,'{\"privateLayout\":\"true\"}');
/*!40000 ALTER TABLE `systemevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team` (
  `teamId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  PRIMARY KEY (`teamId`),
  UNIQUE KEY `IX_143DC786` (`groupId`,`name`),
  KEY `IX_AE6E9907` (`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket` (
  `ticketId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `key_` varchar(75) DEFAULT NULL,
  `type_` int(11) DEFAULT NULL,
  `extraInfo` longtext,
  `expirationDate` datetime DEFAULT NULL,
  PRIMARY KEY (`ticketId`),
  KEY `IX_1E8DFB2E` (`classNameId`,`classPK`,`type_`),
  KEY `IX_B2468446` (`key_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trashentry`
--

DROP TABLE IF EXISTS `trashentry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trashentry` (
  `entryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `systemEventSetKey` bigint(20) DEFAULT NULL,
  `typeSettings` longtext,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`entryId`),
  UNIQUE KEY `IX_B35F73D5` (`classNameId`,`classPK`),
  KEY `IX_2674F2A8` (`companyId`),
  KEY `IX_526A032A` (`groupId`),
  KEY `IX_FC4EEA64` (`groupId`,`classNameId`),
  KEY `IX_6CAAE2E8` (`groupId`,`createDate`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trashentry`
--

LOCK TABLES `trashentry` WRITE;
/*!40000 ALTER TABLE `trashentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `trashentry` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trashversion`
--

DROP TABLE IF EXISTS `trashversion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trashversion` (
  `versionId` bigint(20) NOT NULL,
  `entryId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `typeSettings` longtext,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`versionId`),
  UNIQUE KEY `IX_D639348C` (`entryId`,`classNameId`,`classPK`),
  KEY `IX_630A643B` (`classNameId`,`classPK`),
  KEY `IX_55D44577` (`entryId`),
  KEY `IX_72D58D37` (`entryId`,`classNameId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trashversion`
--

LOCK TABLES `trashversion` WRITE;
/*!40000 ALTER TABLE `trashversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `trashversion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_`
--

DROP TABLE IF EXISTS `user_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_` (
  `uuid_` varchar(75) DEFAULT NULL,
  `userId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `defaultUser` tinyint(4) DEFAULT NULL,
  `contactId` bigint(20) DEFAULT NULL,
  `password_` varchar(75) DEFAULT NULL,
  `passwordEncrypted` tinyint(4) DEFAULT NULL,
  `passwordReset` tinyint(4) DEFAULT NULL,
  `passwordModifiedDate` datetime DEFAULT NULL,
  `digest` varchar(255) DEFAULT NULL,
  `reminderQueryQuestion` varchar(75) DEFAULT NULL,
  `reminderQueryAnswer` varchar(75) DEFAULT NULL,
  `graceLoginCount` int(11) DEFAULT NULL,
  `screenName` varchar(75) DEFAULT NULL,
  `emailAddress` varchar(75) DEFAULT NULL,
  `facebookId` bigint(20) DEFAULT NULL,
  `ldapServerId` bigint(20) DEFAULT NULL,
  `openId` varchar(1024) DEFAULT NULL,
  `portraitId` bigint(20) DEFAULT NULL,
  `languageId` varchar(75) DEFAULT NULL,
  `timeZoneId` varchar(75) DEFAULT NULL,
  `greeting` varchar(255) DEFAULT NULL,
  `comments` longtext,
  `firstName` varchar(75) DEFAULT NULL,
  `middleName` varchar(75) DEFAULT NULL,
  `lastName` varchar(75) DEFAULT NULL,
  `jobTitle` varchar(100) DEFAULT NULL,
  `loginDate` datetime DEFAULT NULL,
  `loginIP` varchar(75) DEFAULT NULL,
  `lastLoginDate` datetime DEFAULT NULL,
  `lastLoginIP` varchar(75) DEFAULT NULL,
  `lastFailedLoginDate` datetime DEFAULT NULL,
  `failedLoginAttempts` int(11) DEFAULT NULL,
  `lockout` tinyint(4) DEFAULT NULL,
  `lockoutDate` datetime DEFAULT NULL,
  `agreedToTermsOfUse` tinyint(4) DEFAULT NULL,
  `emailAddressVerified` tinyint(4) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `IX_615E9F7A` (`companyId`,`emailAddress`),
  UNIQUE KEY `IX_C5806019` (`companyId`,`screenName`),
  UNIQUE KEY `IX_9782AD88` (`companyId`,`userId`),
  UNIQUE KEY `IX_5ADBE171` (`contactId`),
  KEY `IX_3A1E834E` (`companyId`),
  KEY `IX_740C4D0C` (`companyId`,`createDate`),
  KEY `IX_BCFDA257` (`companyId`,`createDate`,`modifiedDate`),
  KEY `IX_6EF03E4E` (`companyId`,`defaultUser`),
  KEY `IX_1D731F03` (`companyId`,`facebookId`),
  KEY `IX_EE8ABD19` (`companyId`,`modifiedDate`),
  KEY `IX_89509087` (`companyId`,`openId`(767)),
  KEY `IX_F6039434` (`companyId`,`status`),
  KEY `IX_762F63C6` (`emailAddress`),
  KEY `IX_A18034A4` (`portraitId`),
  KEY `IX_E0422BDA` (`uuid_`),
  KEY `IX_405CC0E` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_`
--

LOCK TABLES `user_` WRITE;
/*!40000 ALTER TABLE `user_` DISABLE KEYS */;
INSERT INTO `user_` VALUES ('0b527d2c-65e4-4b9c-aba9-10fc67049657',20159,20155,'2016-05-04 07:40:09','2016-05-04 07:40:09',1,20160,'password',0,0,NULL,'5533ed38b5e33c076a804bb4bca644f9,9590828507537743bc166fef8cff8748,9590828507537743bc166fef8cff8748','','',0,'20159','default@liferay.com',0,0,'',0,'es_ES','UTC','Welcome!','','','','','','2016-05-04 07:40:09','',NULL,'',NULL,0,0,NULL,1,0,0),('2d854109-b84a-40a9-bb80-9be6d3d8f183',20199,20155,'2016-05-04 07:40:11','2016-05-04 07:41:48',0,20200,'AAAAoAAB9ABBzqJ/ZEZ/P3TNoSMcEcgR0ZeEAhjJBxy2TW7D',1,0,'2016-05-04 07:42:51','e5d86c6f3672e52795891c3597f20de0,751da756639bc033b572ba2e7849b589,2ee91139ff7378a589975d15f60a0a77','what-is-your-father\'s-middle-name','1234',0,'test','test@liferay.com',0,-1,'',0,'es_ES','UTC','Bienvenido  Test Test!','','Test','','Test','','2016-08-17 02:17:36','127.0.0.1','2016-08-16 05:17:24','127.0.0.1','2016-05-04 16:11:14',0,0,NULL,1,1,0),('b4148289-0dca-4552-920a-26c77ac96e0e',20902,20155,'2016-05-04 08:14:46','2016-05-04 19:06:00',0,20903,'AAAAoAAB9ADK9PWjBbo7I3cK7BJP7N1OcJ7q8T/+G2nd8jD0',1,1,'2016-05-04 08:14:46','','','',0,'ivan.quiroz','ivan.quiroz@gmail.com',0,-1,'',0,'es_ES','UTC','Bienvenido  IVAN Usuario01 QUIROZ!','','IVAN','Usuario01','QUIROZ','coordinar de rrhh',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('05729ad5-f616-486b-9fa3-a19910289e25',21811,20155,'2016-05-07 04:11:11','2016-05-07 04:15:26',0,21812,'AAAAoAAB9ABFnbw4uOprlgI87Ci9GSCYZhbIk2nN2hJr1pHW',1,1,'2016-05-07 04:15:27','','','',0,'danieldelgado','danieldelgado@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  Danielle Delgado!','','Danielle','','Delgado','Desarrollador Java',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('bb324fe0-f605-467e-aac5-fa2f1f06f173',22202,20155,'2016-05-07 06:40:23','2016-05-07 06:40:23',0,22203,'AAAAoAAB9AC7vtzywYVadN37l50ebPsJgEXfht6zumRi6ijy',1,1,'2016-05-07 06:40:24','','','',0,'user2user2','user2@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  user2 user2!','','user2','','user2','user2',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('1499dabe-e527-462b-9cc7-49f5ba8c5c2b',22212,20155,'2016-05-07 06:42:04','2016-05-07 06:42:04',0,22213,'AAAAoAAB9ADKvx7Dl58xXAJUzfFUfjX8absjkkLWs/9clDDu',1,1,'2016-05-07 06:42:04','','','',0,'randielmelgarejo','randielmelgarejo@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  randielmelgarejo randielmelgarejo randielmelgarejo!','','randielmelgarejo','randielmelgarejo','randielmelgarejo','user2',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('7cf61d6d-856f-4766-a9a6-51bde51fa076',22221,20155,'2016-05-07 06:43:06','2016-05-07 06:43:06',0,22222,'AAAAoAAB9ADC6dw4YNVAyl+OxpgZF8tQlgieZFE6kc//Qrdg',1,1,'2016-05-07 06:43:06','','','',0,'monicalopera','monicalopera@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  monicalopera monicalopera monicalopera!','','monicalopera','monicalopera','monicalopera','monicalopera',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('4908d343-e43c-4284-b63e-7463dfdb48aa',22230,20155,'2016-05-07 06:48:14','2016-05-07 06:48:14',0,22231,'AAAAoAAB9AC+UoGs2TeYZNhIgtgbPnLvygnVzoWtpm3suwUE',1,1,'2016-05-07 06:48:14','','','',0,'jersonvasquez','jersonvasquez@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  jersonvasquez jersonvasquez jersonvasquez!','','jersonvasquez','jersonvasquez','jersonvasquez','jersonvasquez',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('9f29fe17-12a0-44b7-b0e5-a2e1f9414dda',22239,20155,'2016-05-07 06:56:39','2016-05-07 06:56:39',0,22240,'AAAAoAAB9AAAaomExWlR9f4KNSLS6iKFgHtbg5InGzSKNtDi',1,1,'2016-05-07 06:56:39','','','',0,'ejemplo1','ejemplo1@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  ejemplo1 ejemplo1 ejemplo1!','','ejemplo1','ejemplo1','ejemplo1','ejemplo1',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('ef25433a-cb2a-434e-b9f9-1761a2e8b0d5',22248,20155,'2016-05-07 06:58:08','2016-05-07 06:58:08',0,22249,'AAAAoAAB9AC+si4w9Y2GEndfMcy/zMq/w1ZFy8MgTyiP1YBH',1,1,'2016-05-07 06:58:09','','','',0,'ejemplo2','ejemplo2@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  ejemplo2 ejemplo2 ejemplo2!','','ejemplo2','ejemplo2','ejemplo2','ejemplo2',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),('3cacb53f-099d-49d9-97da-0086ce66147f',22257,20155,'2016-05-07 07:05:10','2016-05-07 07:05:10',0,22258,'AAAAoAAB9ACdU1oTvdwM62IVhMARK7C+7hcjOkVlv8R4vyOQ',1,1,'2016-05-07 07:05:11','','','',0,'ejemplo3','ejemplo3@globalhitss.com',0,-1,'',0,'es_ES','UTC','Bienvenido  ejemplo3 ejemplo3 ejemplo3!','','ejemplo3','ejemplo3','ejemplo3','ejemplo3',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0);
/*!40000 ALTER TABLE `user_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergroup`
--

DROP TABLE IF EXISTS `usergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usergroup` (
  `uuid_` varchar(75) DEFAULT NULL,
  `userGroupId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `parentUserGroupId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `addedByLDAPImport` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`userGroupId`),
  UNIQUE KEY `IX_23EAD0D` (`companyId`,`name`),
  KEY `IX_524FEFCE` (`companyId`),
  KEY `IX_69771487` (`companyId`,`parentUserGroupId`),
  KEY `IX_5F1DD85A` (`uuid_`),
  KEY `IX_72394F8E` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usergroup`
--

LOCK TABLES `usergroup` WRITE;
/*!40000 ALTER TABLE `usergroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `usergroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergroupgrouprole`
--

DROP TABLE IF EXISTS `usergroupgrouprole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usergroupgrouprole` (
  `userGroupId` bigint(20) NOT NULL,
  `groupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`userGroupId`,`groupId`,`roleId`),
  KEY `IX_CCBE4063` (`groupId`),
  KEY `IX_CAB0CCC8` (`groupId`,`roleId`),
  KEY `IX_1CDF88C` (`roleId`),
  KEY `IX_DCDED558` (`userGroupId`),
  KEY `IX_73C52252` (`userGroupId`,`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usergroupgrouprole`
--

LOCK TABLES `usergroupgrouprole` WRITE;
/*!40000 ALTER TABLE `usergroupgrouprole` DISABLE KEYS */;
/*!40000 ALTER TABLE `usergroupgrouprole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergrouprole`
--

DROP TABLE IF EXISTS `usergrouprole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usergrouprole` (
  `userId` bigint(20) NOT NULL,
  `groupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`groupId`,`roleId`),
  KEY `IX_1B988D7A` (`groupId`),
  KEY `IX_871412DF` (`groupId`,`roleId`),
  KEY `IX_887A2C95` (`roleId`),
  KEY `IX_887BE56A` (`userId`),
  KEY `IX_4D040680` (`userId`,`groupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usergrouprole`
--

LOCK TABLES `usergrouprole` WRITE;
/*!40000 ALTER TABLE `usergrouprole` DISABLE KEYS */;
INSERT INTO `usergrouprole` VALUES (20199,20623,20172);
/*!40000 ALTER TABLE `usergrouprole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergroups_teams`
--

DROP TABLE IF EXISTS `usergroups_teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usergroups_teams` (
  `teamId` bigint(20) NOT NULL,
  `userGroupId` bigint(20) NOT NULL,
  PRIMARY KEY (`teamId`,`userGroupId`),
  KEY `IX_31FB0B08` (`teamId`),
  KEY `IX_7F187E63` (`userGroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usergroups_teams`
--

LOCK TABLES `usergroups_teams` WRITE;
/*!40000 ALTER TABLE `usergroups_teams` DISABLE KEYS */;
/*!40000 ALTER TABLE `usergroups_teams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `useridmapper`
--

DROP TABLE IF EXISTS `useridmapper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `useridmapper` (
  `userIdMapperId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `description` varchar(75) DEFAULT NULL,
  `externalUserId` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`userIdMapperId`),
  UNIQUE KEY `IX_41A32E0D` (`type_`,`externalUserId`),
  UNIQUE KEY `IX_D1C44A6E` (`userId`,`type_`),
  KEY `IX_E60EA987` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `useridmapper`
--

LOCK TABLES `useridmapper` WRITE;
/*!40000 ALTER TABLE `useridmapper` DISABLE KEYS */;
/*!40000 ALTER TABLE `useridmapper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usernotificationdelivery`
--

DROP TABLE IF EXISTS `usernotificationdelivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usernotificationdelivery` (
  `userNotificationDeliveryId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `portletId` varchar(200) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `notificationType` int(11) DEFAULT NULL,
  `deliveryType` int(11) DEFAULT NULL,
  `deliver` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`userNotificationDeliveryId`),
  UNIQUE KEY `IX_8B6E3ACE` (`userId`,`portletId`,`classNameId`,`notificationType`,`deliveryType`),
  KEY `IX_C648700A` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usernotificationdelivery`
--

LOCK TABLES `usernotificationdelivery` WRITE;
/*!40000 ALTER TABLE `usernotificationdelivery` DISABLE KEYS */;
/*!40000 ALTER TABLE `usernotificationdelivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usernotificationevent`
--

DROP TABLE IF EXISTS `usernotificationevent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usernotificationevent` (
  `uuid_` varchar(75) DEFAULT NULL,
  `userNotificationEventId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  `timestamp` bigint(20) DEFAULT NULL,
  `deliverBy` bigint(20) DEFAULT NULL,
  `delivered` tinyint(4) DEFAULT NULL,
  `payload` longtext,
  `archived` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`userNotificationEventId`),
  KEY `IX_3E5D78C4` (`userId`),
  KEY `IX_3DBB361A` (`userId`,`archived`),
  KEY `IX_24F1BF0` (`userId`,`delivered`),
  KEY `IX_ECD8CFEA` (`uuid_`),
  KEY `IX_A6BAFDFE` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usernotificationevent`
--

LOCK TABLES `usernotificationevent` WRITE;
/*!40000 ALTER TABLE `usernotificationevent` DISABLE KEYS */;
INSERT INTO `usernotificationevent` VALUES ('9bc77893-e8db-4571-a5ad-854a41ccdb5f',22513,20155,20159,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909014,20159,0,'{\"notificationText\":\"rgreggre\",\"userId\":20159}',0),('f8c993dc-a827-40e1-83a0-2d3652ee005a',22515,20155,20199,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909093,20199,1,'{\"notificationText\":\"rgreggre\",\"userId\":20199}',1),('2ccfd738-265a-4f14-b26b-4736526fd8be',22517,20155,20902,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909099,20902,0,'{\"notificationText\":\"rgreggre\",\"userId\":20902}',0),('08ee829b-9f95-4bbe-9329-9c73542cdb8e',22519,20155,21811,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909104,21811,0,'{\"notificationText\":\"rgreggre\",\"userId\":21811}',0),('10dcfdb2-5982-43e7-8bab-dbac39e61891',22521,20155,22202,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909109,22202,0,'{\"notificationText\":\"rgreggre\",\"userId\":22202}',0),('7d6165e6-ff82-4a33-9fd9-9060bb83252d',22523,20155,22212,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909113,22212,0,'{\"notificationText\":\"rgreggre\",\"userId\":22212}',0),('1d9a6775-2882-44cb-b1df-d28b2983d455',22525,20155,22221,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909118,22221,0,'{\"notificationText\":\"rgreggre\",\"userId\":22221}',0),('e38b346c-990d-4290-933a-82e7475e89d4',22527,20155,22230,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909123,22230,0,'{\"notificationText\":\"rgreggre\",\"userId\":22230}',0),('6664aa26-00c4-4812-8072-6be7be4baac3',22529,20155,22239,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909132,22239,0,'{\"notificationText\":\"rgreggre\",\"userId\":22239}',0),('81150455-8ff0-491f-a447-8b20ed43047f',22531,20155,22248,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909138,22248,0,'{\"notificationText\":\"rgreggre\",\"userId\":22248}',0),('f0e3c1c4-a95e-4ce5-9240-bf6ed295bb82',22533,20155,22257,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665909143,22257,0,'{\"notificationText\":\"rgreggre\",\"userId\":22257}',0),('1f0451ed-8de8-45c1-90a2-ca43d38fe2ff',22535,20155,20159,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926892,20159,0,'{\"notificationText\":\"7887\",\"userId\":20159}',0),('5b537163-fa4b-4a58-b8f0-d18e7a0c699b',22537,20155,20199,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926899,20199,1,'{\"notificationText\":\"7887\",\"userId\":20199}',1),('991434a3-227d-4e33-97f6-500cde99d1e9',22539,20155,20902,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926905,20902,0,'{\"notificationText\":\"7887\",\"userId\":20902}',0),('145e2b62-22e1-4970-a590-dd4b14b9731e',22541,20155,21811,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926911,21811,0,'{\"notificationText\":\"7887\",\"userId\":21811}',0),('c5c29122-ee6d-4f29-b139-80ce65ca2885',22543,20155,22202,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926916,22202,0,'{\"notificationText\":\"7887\",\"userId\":22202}',0),('3c9b14e6-00e4-48c9-b70a-c1f2e274a3df',22545,20155,22212,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926925,22212,0,'{\"notificationText\":\"7887\",\"userId\":22212}',0),('ec678909-3ce6-4e8b-b221-b5e45fcc4afc',22547,20155,22221,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926932,22221,0,'{\"notificationText\":\"7887\",\"userId\":22221}',0),('568bf1ec-5ff6-4d80-b8f2-b3d507dfe579',22549,20155,22230,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926938,22230,0,'{\"notificationText\":\"7887\",\"userId\":22230}',0),('a3f2e6cd-49da-425a-a793-bad16aa4927c',22551,20155,22239,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926943,22239,0,'{\"notificationText\":\"7887\",\"userId\":22239}',0),('67dff04f-83ca-4ffb-997c-9c8e3218aa4f',22553,20155,22248,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926948,22248,0,'{\"notificationText\":\"7887\",\"userId\":22248}',0),('27b4fe1f-0c91-40d7-a191-994a9efa2edd',22555,20155,22257,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665926952,22257,0,'{\"notificationText\":\"7887\",\"userId\":22257}',0),('50100319-265d-408d-b96b-99b98f0593f0',22557,20155,20159,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931949,20159,0,'{\"notificationText\":\"8k88\",\"userId\":20159}',0),('380287dc-72a5-4874-9c6c-3f9ecb8064a2',22559,20155,20199,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931958,20199,1,'{\"notificationText\":\"8k88\",\"userId\":20199}',1),('a1f8b9c6-4851-46d2-924f-98d297123ec8',22561,20155,20902,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931964,20902,0,'{\"notificationText\":\"8k88\",\"userId\":20902}',0),('72ff183e-1557-4a79-aac5-ac96d5504f18',22563,20155,21811,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931968,21811,0,'{\"notificationText\":\"8k88\",\"userId\":21811}',0),('8d6ba7d3-e388-4c37-9513-24cca2fba7a0',22565,20155,22202,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931974,22202,0,'{\"notificationText\":\"8k88\",\"userId\":22202}',0),('1e16e126-9d95-47eb-ad66-fbefbc2666bc',22567,20155,22212,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931980,22212,0,'{\"notificationText\":\"8k88\",\"userId\":22212}',0),('bbd82e25-36ad-4b12-862a-5f5b7ebe366e',22569,20155,22221,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931985,22221,0,'{\"notificationText\":\"8k88\",\"userId\":22221}',0),('a6aa7eb1-83bf-4253-9892-57b85128d946',22571,20155,22230,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931990,22230,0,'{\"notificationText\":\"8k88\",\"userId\":22230}',0),('5fd0af42-b147-45bf-9dfb-0fbad6aa04ec',22573,20155,22239,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665931996,22239,0,'{\"notificationText\":\"8k88\",\"userId\":22239}',0),('0708394d-dd67-4a90-b285-f5b5a907558f',22575,20155,22248,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665932001,22248,0,'{\"notificationText\":\"8k88\",\"userId\":22248}',0),('809ea367-104c-41f3-a4d4-32bf8bc1d1a4',22577,20155,22257,'dockbarnotificationaction_WAR_DockBarCustomNotificationportlet',1462665932007,22257,0,'{\"notificationText\":\"8k88\",\"userId\":22257}',0),('dac1951a-49b1-4da1-bef1-715440b0f144',22701,20155,20159,'rev_WAR_revportlet',1462671686936,20159,0,'{\"notificationText\":\"test notificacion\",\"userId\":20159}',0),('223eab71-91e2-4cca-b358-6b7787ca1512',22703,20155,20199,'rev_WAR_revportlet',1462671687041,20199,1,'{\"notificationText\":\"test notificacion\",\"userId\":20199}',1),('5c32b7da-fb08-4dc8-9dc6-3bee2159c83b',22705,20155,20902,'rev_WAR_revportlet',1462671687047,20902,0,'{\"notificationText\":\"test notificacion\",\"userId\":20902}',0),('4bac8479-f287-449e-b08a-bba8c3b443bf',22707,20155,21811,'rev_WAR_revportlet',1462671687054,21811,0,'{\"notificationText\":\"test notificacion\",\"userId\":21811}',0),('76a3d3b1-2f2e-40a3-9349-496ccdea0b40',22709,20155,22202,'rev_WAR_revportlet',1462671687059,22202,0,'{\"notificationText\":\"test notificacion\",\"userId\":22202}',0),('b5fc016e-2f73-465c-8637-d7467a40cde7',22711,20155,22212,'rev_WAR_revportlet',1462671687066,22212,0,'{\"notificationText\":\"test notificacion\",\"userId\":22212}',0),('35ad1c6a-ff41-48a6-9a06-216519c9a9b1',22713,20155,22221,'rev_WAR_revportlet',1462671687073,22221,0,'{\"notificationText\":\"test notificacion\",\"userId\":22221}',0),('dd4e3e9a-3d02-4be2-98eb-ab6b4939c70c',22715,20155,22230,'rev_WAR_revportlet',1462671687078,22230,0,'{\"notificationText\":\"test notificacion\",\"userId\":22230}',0),('bdb91d57-7258-48b3-94bf-6a2aaa0456fc',22717,20155,22239,'rev_WAR_revportlet',1462671687088,22239,0,'{\"notificationText\":\"test notificacion\",\"userId\":22239}',0),('ea523550-3fe5-470f-acba-b0b6b9f58c4a',22719,20155,22248,'rev_WAR_revportlet',1462671687113,22248,0,'{\"notificationText\":\"test notificacion\",\"userId\":22248}',0),('a40ce860-bc01-4f46-a0c4-27e8a0818eb9',22721,20155,22257,'rev_WAR_revportlet',1462671687119,22257,0,'{\"notificationText\":\"test notificacion\",\"userId\":22257}',0),('c35e2554-9aea-43d6-98f9-3a34f3322071',22723,20155,20159,'rev_WAR_revportlet',1462671706707,20159,0,'{\"notificationText\":\"test notificacion\",\"userId\":20159}',0),('89c40ea0-604c-4bf6-a028-af236b081096',22725,20155,20199,'rev_WAR_revportlet',1462671706717,20199,1,'{\"notificationText\":\"test notificacion\",\"userId\":20199}',1),('950ac65c-87de-4fa2-ae1f-4a5bf6497fbd',22727,20155,20902,'rev_WAR_revportlet',1462671706722,20902,0,'{\"notificationText\":\"test notificacion\",\"userId\":20902}',0),('f645d00e-ec5b-4b51-8919-b192396417a9',22729,20155,21811,'rev_WAR_revportlet',1462671706729,21811,0,'{\"notificationText\":\"test notificacion\",\"userId\":21811}',0),('53f4f4ee-7237-45b0-aee6-328c101a9edc',22731,20155,22202,'rev_WAR_revportlet',1462671706736,22202,0,'{\"notificationText\":\"test notificacion\",\"userId\":22202}',0),('904c3a01-d68f-4b21-afc3-b4c0e17d1f31',22733,20155,22212,'rev_WAR_revportlet',1462671706760,22212,0,'{\"notificationText\":\"test notificacion\",\"userId\":22212}',0),('616a961b-7c69-470f-9ae6-56fbc064e151',22735,20155,22221,'rev_WAR_revportlet',1462671706767,22221,0,'{\"notificationText\":\"test notificacion\",\"userId\":22221}',0),('ca807735-861a-46d2-9dcb-9f7fdef3eefc',22737,20155,22230,'rev_WAR_revportlet',1462671706773,22230,0,'{\"notificationText\":\"test notificacion\",\"userId\":22230}',0),('a10d71de-ad74-4e00-92b6-70cfa570d980',22739,20155,22239,'rev_WAR_revportlet',1462671706780,22239,0,'{\"notificationText\":\"test notificacion\",\"userId\":22239}',0),('5eef4eaa-1cac-47b6-952f-03f10bf1ce4c',22741,20155,22248,'rev_WAR_revportlet',1462671706785,22248,0,'{\"notificationText\":\"test notificacion\",\"userId\":22248}',0),('6b802e56-e492-48d8-be5f-de73200dd223',22743,20155,22257,'rev_WAR_revportlet',1462671706793,22257,0,'{\"notificationText\":\"test notificacion\",\"userId\":22257}',0),('a47e9fa6-1cc1-4455-90ce-512c0ac85637',22745,20155,20159,'rev_WAR_revportlet',1462671947175,20159,0,'{\"notificationText\":\"test notificacion\",\"userId\":20159}',0),('25c38824-8f42-44f5-a81a-e716378eff37',22747,20155,20199,'rev_WAR_revportlet',1462671947181,20199,1,'{\"notificationText\":\"test notificacion\",\"userId\":20199}',1),('7e9f7469-7e03-41aa-b302-d9942cc1729e',22749,20155,20902,'rev_WAR_revportlet',1462671947186,20902,0,'{\"notificationText\":\"test notificacion\",\"userId\":20902}',0),('6b63bd6b-114e-4d5c-b8c8-aa885bbee797',22751,20155,21811,'rev_WAR_revportlet',1462671947191,21811,0,'{\"notificationText\":\"test notificacion\",\"userId\":21811}',0),('7c287617-1d49-4f25-8029-34f947ece6c4',22753,20155,22202,'rev_WAR_revportlet',1462671947197,22202,0,'{\"notificationText\":\"test notificacion\",\"userId\":22202}',0),('47c0fe7a-e795-4ad8-bbf7-f073e40ed6bd',22755,20155,22212,'rev_WAR_revportlet',1462671947202,22212,0,'{\"notificationText\":\"test notificacion\",\"userId\":22212}',0),('6d3f858b-0f62-4e2b-bd46-acdd06efe9d7',22757,20155,22221,'rev_WAR_revportlet',1462671947207,22221,0,'{\"notificationText\":\"test notificacion\",\"userId\":22221}',0),('798bf8c7-3708-40e6-aa43-34cc39e5753f',22759,20155,22230,'rev_WAR_revportlet',1462671947212,22230,0,'{\"notificationText\":\"test notificacion\",\"userId\":22230}',0),('ebf7273b-5a71-4443-b027-e7c5345c8578',22761,20155,22239,'rev_WAR_revportlet',1462671947217,22239,0,'{\"notificationText\":\"test notificacion\",\"userId\":22239}',0),('d72dffae-3992-4b92-a584-a281f45a67c8',22763,20155,22248,'rev_WAR_revportlet',1462671947226,22248,0,'{\"notificationText\":\"test notificacion\",\"userId\":22248}',0),('65c97904-e896-4fbd-a72c-c864b6501b57',22765,20155,22257,'rev_WAR_revportlet',1462671947234,22257,0,'{\"notificationText\":\"test notificacion\",\"userId\":22257}',0),('1ebebf80-4b62-41db-97bd-87b606e014cf',22811,20155,20159,'rev_WAR_revportlet',1462906166181,20159,0,'{\"notificationText\":\"test notificacion\",\"userId\":20159}',0),('953ef00e-5ca0-4d1d-8ab7-ec315fbd5327',22813,20155,20199,'rev_WAR_revportlet',1462906166264,20199,1,'{\"notificationText\":\"test notificacion\",\"userId\":20199}',1),('c425414e-8009-48de-92fc-542a2193679f',22815,20155,20902,'rev_WAR_revportlet',1462906166286,20902,0,'{\"notificationText\":\"test notificacion\",\"userId\":20902}',0),('0829bf84-f2da-4626-b7de-0e85b9ee5245',22817,20155,21811,'rev_WAR_revportlet',1462906166332,21811,0,'{\"notificationText\":\"test notificacion\",\"userId\":21811}',0),('9a105863-a4b3-4b79-a6f0-9d5f5eca851e',22819,20155,22202,'rev_WAR_revportlet',1462906166353,22202,0,'{\"notificationText\":\"test notificacion\",\"userId\":22202}',0),('346b1cbe-9c15-4a29-8c83-1338938932a7',22821,20155,22212,'rev_WAR_revportlet',1462906166361,22212,0,'{\"notificationText\":\"test notificacion\",\"userId\":22212}',0),('4681a253-b2c7-46da-82f8-1dbf9b5f7b26',22823,20155,22221,'rev_WAR_revportlet',1462906166368,22221,0,'{\"notificationText\":\"test notificacion\",\"userId\":22221}',0),('9573fc14-efda-400b-bb20-f8404db2f380',22825,20155,22230,'rev_WAR_revportlet',1462906166373,22230,0,'{\"notificationText\":\"test notificacion\",\"userId\":22230}',0),('3102e65d-457a-4b5b-ae04-a4a297318369',22827,20155,22239,'rev_WAR_revportlet',1462906166401,22239,0,'{\"notificationText\":\"test notificacion\",\"userId\":22239}',0),('54c0c5e5-4500-4a3a-85ce-e0dffd2f342f',22829,20155,22248,'rev_WAR_revportlet',1462906166421,22248,0,'{\"notificationText\":\"test notificacion\",\"userId\":22248}',0),('91d56a2c-3473-488b-a0a4-dae0bb967aac',22831,20155,22257,'rev_WAR_revportlet',1462906166455,22257,0,'{\"notificationText\":\"test notificacion\",\"userId\":22257}',0);
/*!40000 ALTER TABLE `usernotificationevent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_groups`
--

DROP TABLE IF EXISTS `users_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_groups` (
  `groupId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`userId`),
  KEY `IX_C4F9E699` (`groupId`),
  KEY `IX_F10B6C6B` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_groups`
--

LOCK TABLES `users_groups` WRITE;
/*!40000 ALTER TABLE `users_groups` DISABLE KEYS */;
INSERT INTO `users_groups` VALUES (20182,20199),(20623,20199),(20623,20902),(20623,21811),(20623,22202),(20623,22212),(20623,22221),(20623,22230),(20623,22239),(20623,22248),(20623,22257);
/*!40000 ALTER TABLE `users_groups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_orgs`
--

DROP TABLE IF EXISTS `users_orgs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_orgs` (
  `organizationId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`organizationId`,`userId`),
  KEY `IX_7EF4EC0E` (`organizationId`),
  KEY `IX_FB646CA6` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_orgs`
--

LOCK TABLES `users_orgs` WRITE;
/*!40000 ALTER TABLE `users_orgs` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_orgs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_roles` (
  `roleId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`roleId`,`userId`),
  KEY `IX_C19E5F31` (`roleId`),
  KEY `IX_C1A01806` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_roles`
--

LOCK TABLES `users_roles` WRITE;
/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` VALUES (20162,20199),(20163,20159),(20165,20199),(20165,21811),(20165,22202),(20165,22212),(20165,22221),(20165,22230),(20165,22239),(20165,22248),(20165,22257),(20166,20199),(20166,20902),(20166,21811),(20166,22202),(20166,22212),(20166,22221),(20166,22230),(20166,22239),(20166,22248),(20166,22257),(20650,20902);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_teams`
--

DROP TABLE IF EXISTS `users_teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_teams` (
  `teamId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`teamId`,`userId`),
  KEY `IX_4D06AD51` (`teamId`),
  KEY `IX_A098EFBF` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_teams`
--

LOCK TABLES `users_teams` WRITE;
/*!40000 ALTER TABLE `users_teams` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_teams` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_usergroups`
--

DROP TABLE IF EXISTS `users_usergroups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_usergroups` (
  `userId` bigint(20) NOT NULL,
  `userGroupId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`userGroupId`),
  KEY `IX_66FF2503` (`userGroupId`),
  KEY `IX_BE8102D6` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_usergroups`
--

LOCK TABLES `users_usergroups` WRITE;
/*!40000 ALTER TABLE `users_usergroups` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_usergroups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertracker`
--

DROP TABLE IF EXISTS `usertracker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usertracker` (
  `userTrackerId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `sessionId` varchar(200) DEFAULT NULL,
  `remoteAddr` varchar(75) DEFAULT NULL,
  `remoteHost` varchar(75) DEFAULT NULL,
  `userAgent` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`userTrackerId`),
  KEY `IX_29BA1CF5` (`companyId`),
  KEY `IX_46B0AE8E` (`sessionId`),
  KEY `IX_E4EFBA8D` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertracker`
--

LOCK TABLES `usertracker` WRITE;
/*!40000 ALTER TABLE `usertracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `usertracker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertrackerpath`
--

DROP TABLE IF EXISTS `usertrackerpath`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usertrackerpath` (
  `userTrackerPathId` bigint(20) NOT NULL,
  `userTrackerId` bigint(20) DEFAULT NULL,
  `path_` longtext,
  `pathDate` datetime DEFAULT NULL,
  PRIMARY KEY (`userTrackerPathId`),
  KEY `IX_14D8BCC0` (`userTrackerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertrackerpath`
--

LOCK TABLES `usertrackerpath` WRITE;
/*!40000 ALTER TABLE `usertrackerpath` DISABLE KEYS */;
/*!40000 ALTER TABLE `usertrackerpath` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `userId` bigint(20) NOT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`),
  KEY `IX_5495C78E` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (22212,1,22239,'2016-05-07 06:56:39',22239,NULL),(22230,1,22230,'2016-05-07 06:48:14',22230,NULL),(22248,1,22248,'2016-05-07 06:58:08',22248,NULL),(22257,1,22257,'2016-05-07 07:05:10',22257,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarioevaluacion`
--

DROP TABLE IF EXISTS `usuarioevaluacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarioevaluacion` (
  `actividadCronogramaId` bigint(20) NOT NULL,
  `usuarioId` bigint(20) NOT NULL,
  `evaluacionId` bigint(20) NOT NULL,
  PRIMARY KEY (`actividadCronogramaId`,`usuarioId`,`evaluacionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarioevaluacion`
--

LOCK TABLES `usuarioevaluacion` WRITE;
/*!40000 ALTER TABLE `usuarioevaluacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarioevaluacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuariorequisito`
--

DROP TABLE IF EXISTS `usuariorequisito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuariorequisito` (
  `userId` bigint(20) NOT NULL,
  `tagId` bigint(20) NOT NULL,
  `nivel` bigint(20) DEFAULT NULL,
  `exigible` tinyint(4) DEFAULT NULL,
  `tipoRequisito` bigint(20) DEFAULT NULL,
  `herramienta` bigint(20) DEFAULT NULL,
  `cumplerequisito` tinyint(4) DEFAULT NULL,
  `activo` tinyint(4) DEFAULT NULL,
  `usuariocrea` bigint(20) DEFAULT NULL,
  `fechacrea` datetime DEFAULT NULL,
  `usuariomodifica` bigint(20) DEFAULT NULL,
  `fechamodifica` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`,`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuariorequisito`
--

LOCK TABLES `usuariorequisito` WRITE;
/*!40000 ALTER TABLE `usuariorequisito` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuariorequisito` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `virtualhost`
--

DROP TABLE IF EXISTS `virtualhost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `virtualhost` (
  `virtualHostId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `layoutSetId` bigint(20) DEFAULT NULL,
  `hostname` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`virtualHostId`),
  UNIQUE KEY `IX_A083D394` (`companyId`,`layoutSetId`),
  UNIQUE KEY `IX_431A3960` (`hostname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `virtualhost`
--

LOCK TABLES `virtualhost` WRITE;
/*!40000 ALTER TABLE `virtualhost` DISABLE KEYS */;
INSERT INTO `virtualhost` VALUES (20158,20155,0,'localhost');
/*!40000 ALTER TABLE `virtualhost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `webdavprops`
--

DROP TABLE IF EXISTS `webdavprops`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `webdavprops` (
  `webDavPropsId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `props` longtext,
  PRIMARY KEY (`webDavPropsId`),
  UNIQUE KEY `IX_97DFA146` (`classNameId`,`classPK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `webdavprops`
--

LOCK TABLES `webdavprops` WRITE;
/*!40000 ALTER TABLE `webdavprops` DISABLE KEYS */;
/*!40000 ALTER TABLE `webdavprops` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `website`
--

DROP TABLE IF EXISTS `website`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `website` (
  `uuid_` varchar(75) DEFAULT NULL,
  `websiteId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `url` longtext,
  `typeId` int(11) DEFAULT NULL,
  `primary_` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`websiteId`),
  KEY `IX_96F07007` (`companyId`),
  KEY `IX_4F0F0CA7` (`companyId`,`classNameId`),
  KEY `IX_F960131C` (`companyId`,`classNameId`,`classPK`),
  KEY `IX_1AA07A6D` (`companyId`,`classNameId`,`classPK`,`primary_`),
  KEY `IX_F75690BB` (`userId`),
  KEY `IX_76F15D13` (`uuid_`),
  KEY `IX_712BCD35` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `website`
--

LOCK TABLES `website` WRITE;
/*!40000 ALTER TABLE `website` DISABLE KEYS */;
/*!40000 ALTER TABLE `website` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wikinode`
--

DROP TABLE IF EXISTS `wikinode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wikinode` (
  `uuid_` varchar(75) DEFAULT NULL,
  `nodeId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `description` longtext,
  `lastPostDate` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`nodeId`),
  UNIQUE KEY `IX_920CD8B1` (`groupId`,`name`),
  UNIQUE KEY `IX_7609B2AE` (`uuid_`,`groupId`),
  KEY `IX_5D6FE3F0` (`companyId`),
  KEY `IX_B54332D6` (`companyId`,`status`),
  KEY `IX_B480A672` (`groupId`),
  KEY `IX_23325358` (`groupId`,`status`),
  KEY `IX_6C112D7C` (`uuid_`),
  KEY `IX_E0E6D12C` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wikinode`
--

LOCK TABLES `wikinode` WRITE;
/*!40000 ALTER TABLE `wikinode` DISABLE KEYS */;
/*!40000 ALTER TABLE `wikinode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wikipage`
--

DROP TABLE IF EXISTS `wikipage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wikipage` (
  `uuid_` varchar(75) DEFAULT NULL,
  `pageId` bigint(20) NOT NULL,
  `resourcePrimKey` bigint(20) DEFAULT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `nodeId` bigint(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `version` double DEFAULT NULL,
  `minorEdit` tinyint(4) DEFAULT NULL,
  `content` longtext,
  `summary` longtext,
  `format` varchar(75) DEFAULT NULL,
  `head` tinyint(4) DEFAULT NULL,
  `parentTitle` varchar(255) DEFAULT NULL,
  `redirectTitle` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `statusByUserId` bigint(20) DEFAULT NULL,
  `statusByUserName` varchar(75) DEFAULT NULL,
  `statusDate` datetime DEFAULT NULL,
  PRIMARY KEY (`pageId`),
  UNIQUE KEY `IX_3D4AF476` (`nodeId`,`title`,`version`),
  UNIQUE KEY `IX_2CD67C81` (`resourcePrimKey`,`nodeId`,`version`),
  UNIQUE KEY `IX_899D3DFB` (`uuid_`,`groupId`),
  KEY `IX_A2001730` (`format`),
  KEY `IX_16E99B0A` (`groupId`,`nodeId`,`head`),
  KEY `IX_BA72B89A` (`groupId`,`nodeId`,`head`,`parentTitle`,`status`),
  KEY `IX_E0092FF0` (`groupId`,`nodeId`,`head`,`status`),
  KEY `IX_941E429C` (`groupId`,`nodeId`,`status`),
  KEY `IX_5FF21CE6` (`groupId`,`nodeId`,`title`,`head`),
  KEY `IX_CAA451D6` (`groupId`,`userId`,`nodeId`,`status`),
  KEY `IX_C8A9C476` (`nodeId`),
  KEY `IX_E7F635CA` (`nodeId`,`head`),
  KEY `IX_65E84AF4` (`nodeId`,`head`,`parentTitle`),
  KEY `IX_9F7655DA` (`nodeId`,`head`,`parentTitle`,`status`),
  KEY `IX_64CCB282` (`nodeId`,`head`,`redirectTitle`),
  KEY `IX_40F94F68` (`nodeId`,`head`,`redirectTitle`,`status`),
  KEY `IX_432F0AB0` (`nodeId`,`head`,`status`),
  KEY `IX_46EEF3C8` (`nodeId`,`parentTitle`),
  KEY `IX_1ECC7656` (`nodeId`,`redirectTitle`),
  KEY `IX_546F2D5C` (`nodeId`,`status`),
  KEY `IX_997EEDD2` (`nodeId`,`title`),
  KEY `IX_E745EA26` (`nodeId`,`title`,`head`),
  KEY `IX_BEA33AB8` (`nodeId`,`title`,`status`),
  KEY `IX_85E7CC76` (`resourcePrimKey`),
  KEY `IX_B771D67` (`resourcePrimKey`,`nodeId`),
  KEY `IX_E1F55FB` (`resourcePrimKey`,`nodeId`,`head`),
  KEY `IX_94D1054D` (`resourcePrimKey`,`nodeId`,`status`),
  KEY `IX_1725355C` (`resourcePrimKey`,`status`),
  KEY `IX_FBBE7C96` (`userId`,`nodeId`,`status`),
  KEY `IX_9C0E478F` (`uuid_`),
  KEY `IX_5DC4BD39` (`uuid_`,`companyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wikipage`
--

LOCK TABLES `wikipage` WRITE;
/*!40000 ALTER TABLE `wikipage` DISABLE KEYS */;
/*!40000 ALTER TABLE `wikipage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wikipageresource`
--

DROP TABLE IF EXISTS `wikipageresource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wikipageresource` (
  `uuid_` varchar(75) DEFAULT NULL,
  `resourcePrimKey` bigint(20) NOT NULL,
  `nodeId` bigint(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resourcePrimKey`),
  UNIQUE KEY `IX_21277664` (`nodeId`,`title`),
  KEY `IX_BE898221` (`uuid_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wikipageresource`
--

LOCK TABLES `wikipageresource` WRITE;
/*!40000 ALTER TABLE `wikipageresource` DISABLE KEYS */;
/*!40000 ALTER TABLE `wikipageresource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workflowdefinitionlink`
--

DROP TABLE IF EXISTS `workflowdefinitionlink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workflowdefinitionlink` (
  `workflowDefinitionLinkId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `typePK` bigint(20) DEFAULT NULL,
  `workflowDefinitionName` varchar(75) DEFAULT NULL,
  `workflowDefinitionVersion` int(11) DEFAULT NULL,
  PRIMARY KEY (`workflowDefinitionLinkId`),
  KEY `IX_A8B0D276` (`companyId`),
  KEY `IX_A4DB1F0F` (`companyId`,`workflowDefinitionName`,`workflowDefinitionVersion`),
  KEY `IX_B6EE8C9E` (`groupId`,`companyId`,`classNameId`),
  KEY `IX_1E5B9905` (`groupId`,`companyId`,`classNameId`,`classPK`),
  KEY `IX_705B40EE` (`groupId`,`companyId`,`classNameId`,`classPK`,`typePK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workflowdefinitionlink`
--

LOCK TABLES `workflowdefinitionlink` WRITE;
/*!40000 ALTER TABLE `workflowdefinitionlink` DISABLE KEYS */;
/*!40000 ALTER TABLE `workflowdefinitionlink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workflowinstancelink`
--

DROP TABLE IF EXISTS `workflowinstancelink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `workflowinstancelink` (
  `workflowInstanceLinkId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `workflowInstanceId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`workflowInstanceLinkId`),
  KEY `IX_415A7007` (`groupId`,`companyId`,`classNameId`,`classPK`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workflowinstancelink`
--

LOCK TABLES `workflowinstancelink` WRITE;
/*!40000 ALTER TABLE `workflowinstancelink` DISABLE KEYS */;
/*!40000 ALTER TABLE `workflowinstancelink` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-17  2:35:44
