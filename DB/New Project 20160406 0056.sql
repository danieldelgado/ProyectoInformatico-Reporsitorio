-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.40-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema revhitssportal
--

CREATE DATABASE IF NOT EXISTS revhitssportal;
USE revhitssportal;

--
-- Definition of table `account_`
--

DROP TABLE IF EXISTS `account_`;
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

--
-- Dumping data for table `account_`
--

/*!40000 ALTER TABLE `account_` DISABLE KEYS */;
INSERT INTO `account_` (`accountId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`parentAccountId`,`name`,`legalName`,`legalId`,`legalType`,`sicCode`,`tickerSymbol`,`industry`,`type_`,`size_`) VALUES 
 (20157,20155,0,'','2016-03-06 15:57:47','2016-03-29 06:55:59',0,'Portal de Ofertas Laborales','','','','','','','','');
/*!40000 ALTER TABLE `account_` ENABLE KEYS */;


--
-- Definition of table `address`
--

DROP TABLE IF EXISTS `address`;
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

--
-- Dumping data for table `address`
--

/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;


--
-- Definition of table `announcementsdelivery`
--

DROP TABLE IF EXISTS `announcementsdelivery`;
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

--
-- Dumping data for table `announcementsdelivery`
--

/*!40000 ALTER TABLE `announcementsdelivery` DISABLE KEYS */;
INSERT INTO `announcementsdelivery` (`deliveryId`,`companyId`,`userId`,`type_`,`email`,`sms`,`website`) VALUES 
 (20434,20155,20199,'general',0,0,1),
 (20435,20155,20199,'news',0,0,1),
 (20436,20155,20199,'test',0,0,1),
 (23109,20155,23103,'general',0,0,0),
 (23110,20155,23103,'news',0,0,0),
 (23111,20155,23103,'test',0,0,0),
 (23118,20155,23112,'general',0,0,0),
 (23119,20155,23112,'news',0,0,0),
 (23120,20155,23112,'test',0,0,0),
 (24219,20155,24213,'general',0,0,0),
 (24220,20155,24213,'news',0,0,0),
 (24221,20155,24213,'test',0,0,0);
/*!40000 ALTER TABLE `announcementsdelivery` ENABLE KEYS */;


--
-- Definition of table `announcementsentry`
--

DROP TABLE IF EXISTS `announcementsentry`;
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

--
-- Dumping data for table `announcementsentry`
--

/*!40000 ALTER TABLE `announcementsentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcementsentry` ENABLE KEYS */;


--
-- Definition of table `announcementsflag`
--

DROP TABLE IF EXISTS `announcementsflag`;
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

--
-- Dumping data for table `announcementsflag`
--

/*!40000 ALTER TABLE `announcementsflag` DISABLE KEYS */;
/*!40000 ALTER TABLE `announcementsflag` ENABLE KEYS */;


--
-- Definition of table `assetcategory`
--

DROP TABLE IF EXISTS `assetcategory`;
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

--
-- Dumping data for table `assetcategory`
--

/*!40000 ALTER TABLE `assetcategory` DISABLE KEYS */;
INSERT INTO `assetcategory` (`uuid_`,`categoryId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`parentCategoryId`,`leftCategoryId`,`rightCategoryId`,`name`,`title`,`description`,`vocabularyId`) VALUES 
 ('543ca21d-a0d9-42d4-8420-cd34149346e7',23047,20182,20155,20199,'Test Test','2016-03-09 04:05:05','2016-03-09 04:05:05',0,2,3,'Solicitud de Reclutamiento','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Solicitud de Reclutamiento</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Solicitud de Reclutamiento</Description></root>',23045),
 ('41d1e8c7-fc85-411a-a7b7-edebd92642ae',23049,20182,20155,20199,'Test Test','2016-03-09 04:05:42','2016-03-09 04:05:42',0,4,5,'Solicitud de Evaluación de Desempeño','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Solicitud de Evaluación de Desempeño</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Solicitud de Evaluación de Desempeño</Description></root>',23045),
 ('7dc4fbb6-4c7d-4e27-a7da-e0a9e4242a67',23054,20182,20155,20199,'Test Test','2016-03-09 04:07:38','2016-03-09 04:07:38',0,6,7,'Practicante','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Practicante</Title></root>','',23053),
 ('26204714-962b-456d-8a40-7b8e953e3277',23055,20182,20155,20199,'Test Test','2016-03-09 04:07:48','2016-03-09 04:07:48',0,8,9,'Indefinido','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Indefinido</Title></root>','',23053),
 ('8eeb219c-27de-4a53-b925-e444cde2b3b0',23056,20182,20155,20199,'Test Test','2016-03-09 04:08:00','2016-03-09 04:08:00',0,10,11,'Part-Time','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Part-Time</Title></root>','',23053),
 ('6a174c64-f26e-44c2-bdb1-3d03be8e9242',23130,20201,20155,20199,'Test Test','2016-03-09 04:29:59','2016-03-09 04:29:59',0,2,3,'Solicitud de Evaluación de Desempeño','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Solicitud de Evaluación de Desempeño</Title></root>','',23129),
 ('9e5c54be-a16d-42a3-a935-3ffbea0a1a60',23131,20201,20155,20199,'Test Test','2016-03-09 04:30:08','2016-03-09 04:30:08',0,4,5,'Solicitud de Reclutamiento','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Solicitud de Reclutamiento</Title></root>','',23129),
 ('78a53f92-321e-48d7-a968-ee26d1d1057d',23133,20201,20155,20199,'Test Test','2016-03-09 04:30:44','2016-03-09 04:30:44',0,6,7,'Practicante','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Practicante</Title></root>','',23132),
 ('f1908efe-fe22-465e-9883-3801b54888df',23134,20201,20155,20199,'Test Test','2016-03-09 04:31:41','2016-03-09 04:31:41',0,8,9,'Part-Time','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Part-Time</Title></root>','',23132),
 ('734eca67-f6f6-46af-9dec-ddc7a10d4ddc',23135,20201,20155,20199,'Test Test','2016-03-09 04:31:51','2016-03-09 04:31:51',0,10,11,'Indefinido','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Indefinido</Title></root>','',23132);
/*!40000 ALTER TABLE `assetcategory` ENABLE KEYS */;


--
-- Definition of table `assetcategoryproperty`
--

DROP TABLE IF EXISTS `assetcategoryproperty`;
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

--
-- Dumping data for table `assetcategoryproperty`
--

/*!40000 ALTER TABLE `assetcategoryproperty` DISABLE KEYS */;
INSERT INTO `assetcategoryproperty` (`categoryPropertyId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`categoryId`,`key_`,`value`) VALUES 
 (23048,20155,20199,'Test Test','2016-03-09 04:05:05','2016-03-09 04:05:05',23047,'solicitud','reclutamiento'),
 (23050,20155,20199,'Test Test','2016-03-09 04:05:42','2016-03-09 04:05:42',23049,'solicitud','evaluación de desempeño');
/*!40000 ALTER TABLE `assetcategoryproperty` ENABLE KEYS */;


--
-- Definition of table `assetentries_assetcategories`
--

DROP TABLE IF EXISTS `assetentries_assetcategories`;
CREATE TABLE `assetentries_assetcategories` (
  `categoryId` bigint(20) NOT NULL,
  `entryId` bigint(20) NOT NULL,
  PRIMARY KEY (`categoryId`,`entryId`),
  KEY `IX_A188F560` (`categoryId`),
  KEY `IX_E119938A` (`entryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assetentries_assetcategories`
--

/*!40000 ALTER TABLE `assetentries_assetcategories` DISABLE KEYS */;
INSERT INTO `assetentries_assetcategories` (`categoryId`,`entryId`) VALUES 
 (23047,23067),
 (23054,23067),
 (23130,23143),
 (23131,23143),
 (23133,23143),
 (23134,23143);
/*!40000 ALTER TABLE `assetentries_assetcategories` ENABLE KEYS */;


--
-- Definition of table `assetentries_assettags`
--

DROP TABLE IF EXISTS `assetentries_assettags`;
CREATE TABLE `assetentries_assettags` (
  `entryId` bigint(20) NOT NULL,
  `tagId` bigint(20) NOT NULL,
  PRIMARY KEY (`entryId`,`tagId`),
  KEY `IX_2ED82CAD` (`entryId`),
  KEY `IX_B2A61B55` (`tagId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `assetentries_assettags`
--

/*!40000 ALTER TABLE `assetentries_assettags` DISABLE KEYS */;
INSERT INTO `assetentries_assettags` (`entryId`,`tagId`) VALUES 
 (23067,23039),
 (23067,23040),
 (23067,23042),
 (23067,23043);
/*!40000 ALTER TABLE `assetentries_assettags` ENABLE KEYS */;


--
-- Definition of table `assetentry`
--

DROP TABLE IF EXISTS `assetentry`;
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

--
-- Dumping data for table `assetentry`
--

/*!40000 ALTER TABLE `assetentry` DISABLE KEYS */;
INSERT INTO `assetentry` (`entryId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`classUuid`,`classTypeId`,`visible`,`startDate`,`endDate`,`publishDate`,`expirationDate`,`mimeType`,`title`,`description`,`summary`,`url`,`layoutUuid`,`height`,`width`,`priority`,`viewCount`) VALUES 
 (20180,20173,20155,20159,'','2016-03-06 15:57:50','2016-03-06 15:57:50',20116,20178,'a7dd1f35-e117-410e-a069-ffd2c6430d0a',0,0,NULL,NULL,NULL,NULL,'text/html','20176','','','','',0,0,0,0),
 (20189,20182,20155,20159,'','2016-03-06 15:57:51','2016-03-06 15:57:51',20116,20187,'481c0d8e-9615-49fd-a131-c66e91b72b27',0,0,NULL,NULL,NULL,NULL,'text/html','20185','','','','',0,0,0,0),
 (20204,20195,20155,20199,'Test Test','2016-03-06 15:57:51','2016-03-06 16:10:01',20005,20199,'834bc287-2461-4053-a0c5-8aaa796e0dd4',0,0,NULL,NULL,NULL,NULL,'','Test Test','','','','',0,0,0,0),
 (20325,20317,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55',20116,20322,'f84b2c97-e1b1-4027-abd7-5939a58e39ba',0,0,NULL,NULL,NULL,NULL,'text/html','20320','','','','',0,0,0,0),
 (20336,20329,20155,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:56',20116,20334,'b20c98e1-c89b-45f3-a265-b8dda72f3e7f',0,0,NULL,NULL,NULL,NULL,'text/html','20332','','','','',0,0,0,0),
 (20346,20339,20155,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:57',20116,20344,'26dc9fb5-45c2-41ac-a3cb-9657c76eeb8b',0,0,NULL,NULL,NULL,NULL,'text/html','20342','','','','',0,0,0,0),
 (20365,20350,20155,20159,'','2016-03-06 15:57:59','2016-03-06 15:57:59',20116,20363,'11b3421b-0bc6-4b88-a765-016c4424d507',0,0,NULL,NULL,NULL,NULL,'text/html','20361','','','','',0,0,0,0),
 (20373,20350,20155,20159,'','2016-03-06 15:58:02','2016-03-06 15:58:02',20116,20371,'13e4377a-97fc-4529-9412-c22a34fc939d',0,0,NULL,NULL,NULL,NULL,'text/html','20369','','','','',0,0,0,0),
 (20391,20376,20155,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:03',20116,20389,'1a1ae777-0f3b-4b7c-8b31-f97d2669b178',0,0,NULL,NULL,NULL,NULL,'text/html','20387','','','','',0,0,0,0),
 (20400,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20116,20398,'41a5a984-947a-4f7a-936e-58fc8033d29c',0,0,NULL,NULL,NULL,NULL,'text/html','20396','','','','',0,0,0,0),
 (20408,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20116,20406,'7461751d-d49b-48be-bae8-8a2853902d92',0,0,NULL,NULL,NULL,NULL,'text/html','20404','','','','',0,0,0,0),
 (22745,20182,20155,20159,'','2016-03-09 03:54:11','2016-03-09 03:54:11',20011,22743,'eceb8056-b756-4207-9d71-5b4de3bf6dd1',0,1,NULL,NULL,NULL,NULL,'image/jpeg','roverRace','','','','',0,0,0,0),
 (22748,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20116,22746,'09296b73-1dcf-48a7-8086-1f6a7bf9a421',0,0,NULL,NULL,NULL,NULL,'text/html','22743','','','','',0,0,0,0),
 (22753,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22751,'39680b15-933c-4210-85d4-f37a8d260532',0,1,NULL,NULL,NULL,NULL,'image/png','LunarSpelunkingBanner','','','','',0,0,0,0),
 (22756,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20116,22754,'8b9d5dc6-1bc3-45b9-955d-0f0490b990a0',0,0,NULL,NULL,NULL,NULL,'text/html','22751','','','','',0,0,0,0),
 (22763,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22761,'b1ef4738-26ed-4839-973e-cb01545dc388',0,1,NULL,NULL,NULL,NULL,'image/png','entertainment','','','','',0,0,0,0),
 (22766,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20116,22764,'beaa432a-717a-412c-a0b4-f0f54e5dc291',0,0,NULL,NULL,NULL,NULL,'text/html','22761','','','','',0,0,0,0),
 (22772,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22769,'00aa1f14-0e11-4787-92f3-487020afe4dc',0,1,NULL,NULL,NULL,NULL,'image/png','food','','','','',0,0,0,0),
 (22775,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20116,22773,'2e25cf14-9ce1-455f-944a-1ef2c8928885',0,0,NULL,NULL,NULL,NULL,'text/html','22769','','','','',0,0,0,0),
 (22782,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22779,'9965eb71-e74d-4e97-94ff-7854ffabc72c',0,1,NULL,NULL,NULL,NULL,'image/png','LunarSpelunking','','','','',0,0,0,0),
 (22785,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20116,22783,'756fa299-c35a-4288-b896-555bed521f84',0,0,NULL,NULL,NULL,NULL,'text/html','22779','','','','',0,0,0,0),
 (22794,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22789,'916fca0f-2af9-4ba1-811a-a18c61ee7ef8',0,1,NULL,NULL,NULL,NULL,'image/jpeg','lunar-golf-banner-2','','','','',0,0,0,0),
 (22797,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20116,22795,'c85e51c6-8341-4d56-b76f-1f9d1ace0d7d',0,0,NULL,NULL,NULL,NULL,'text/html','22789','','','','',0,0,0,0),
 (22819,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22812,'0f0633d9-04de-46ec-9ca8-b97203b92534',0,1,NULL,NULL,NULL,NULL,'image/png','earthrise','','','','',0,0,0,0),
 (22823,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20116,22820,'7449944b-b3b3-486f-957e-39a82ec676ba',0,0,NULL,NULL,NULL,NULL,'text/html','22812','','','','',0,0,0,0),
 (22836,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22830,'eace49ae-27ab-40a0-8ac9-43bac536ed42',0,1,NULL,NULL,NULL,NULL,'image/jpeg','fine-dining','','','','',0,0,0,0),
 (22839,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20116,22837,'9e970a7b-487a-4bce-acd9-1087659a54fb',0,0,NULL,NULL,NULL,NULL,'text/html','22830','','','','',0,0,0,0),
 (22845,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22843,'21c46a07-d24f-4107-a952-001cd7ce5c1c',0,1,NULL,NULL,NULL,NULL,'image/png','roverRacingFam','','','','',0,0,0,0),
 (22848,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20116,22846,'2b4cc29c-3f49-4301-aaf3-2677f9952fb9',0,0,NULL,NULL,NULL,NULL,'text/html','22843','','','','',0,0,0,0),
 (22862,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22855,'64a83da1-199b-43f6-9399-bc81bcd92fdf',0,1,NULL,NULL,NULL,NULL,'image/png','LunarGolfLink','','','','',0,0,0,0),
 (22865,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20116,22863,'64d601c5-9651-4225-9441-f05fe7198bf4',0,0,NULL,NULL,NULL,NULL,'text/html','22855','','','','',0,0,0,0),
 (22875,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22869,'d675b399-32ae-45cb-838a-9b20490f9af1',0,1,NULL,NULL,NULL,NULL,'image/png','Accomodations','','','','',0,0,0,0),
 (22878,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20116,22876,'2a35e000-0f31-41f6-a5eb-96ad6d67fb5a',0,0,NULL,NULL,NULL,NULL,'text/html','22869','','','','',0,0,0,0),
 (22888,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22881,'1d9a0d4f-a7c1-4ec4-9b13-b90ab5d849f7',0,1,NULL,NULL,NULL,NULL,'image/png','room','','','','',0,0,0,0),
 (22891,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20116,22889,'d1f60ff6-a592-45f8-aae8-7a822bfeb0a2',0,0,NULL,NULL,NULL,NULL,'text/html','22881','','','','',0,0,0,0),
 (22901,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22895,'4f2db479-2562-4e8b-b313-c721cf1646ad',0,1,NULL,NULL,NULL,NULL,'image/png','RoverRaceLink','','','','',0,0,0,0),
 (22904,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20116,22902,'e5b62c36-adf6-47f1-a86a-58db9a58ecc3',0,0,NULL,NULL,NULL,NULL,'text/html','22895','','','','',0,0,0,0),
 (22914,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22908,'d8fdea23-1376-48f4-88b6-c95c614dd290',0,1,NULL,NULL,NULL,NULL,'image/png','lunarGolfPromo','','','','',0,0,0,0),
 (22917,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20116,22915,'448734ae-7fc0-46a9-be77-d410054ceb1a',0,0,NULL,NULL,NULL,NULL,'text/html','22908','','','','',0,0,0,0),
 (22933,20812,20155,20159,'','2016-03-09 03:54:15','2016-03-09 03:54:15',20116,22931,'7a980956-4bba-434c-864a-1059c8b89015',0,0,NULL,NULL,NULL,NULL,'text/html','22929','','','','',0,0,0,0),
 (23061,20182,20155,20199,'Test Test','2016-03-09 04:08:50','2016-03-09 04:08:50',20013,23060,'19e6b2ff-e78c-4dc9-b676-b4d51413054b',0,1,NULL,NULL,NULL,NULL,'text/plain','ContenidoTest','ContenidoTest','','','',0,0,0,9),
 (23067,20182,20155,20199,'Test Test','2016-03-09 04:11:52','2016-03-09 04:11:52',20109,23065,'3e281fc0-5929-4c8a-aee3-10bb9d8aa6f4',0,1,NULL,NULL,'2016-03-09 04:09:00',NULL,'text/html','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">ContenidoTestOfertaLaboral</Title></root>','','','','',0,0,0,31),
 (23071,20182,20155,20199,'Test Test','2016-03-09 04:11:53','2016-03-09 04:11:53',20116,23069,'5edc3bc3-b449-4e12-96ff-59e1b11759fc',0,0,NULL,NULL,NULL,NULL,'text/html','23065','','','','',0,0,0,0),
 (23084,20182,20155,20199,'Test Test','2016-03-09 04:13:44','2016-03-09 04:13:44',20116,23083,'57c9d1cf-050c-4de1-8441-044bb9743705',0,1,NULL,NULL,'2016-03-09 04:13:44',NULL,'text/html','ewfewfewfef...','','','','',0,0,0,0),
 (23086,20182,20155,20199,'Test Test','2016-03-09 04:13:51','2016-03-09 04:13:51',20116,23085,'fe1eac2c-74f0-4f3e-afd8-e5b462c84a8c',0,1,NULL,NULL,'2016-03-09 04:13:51',NULL,'text/html','wefewfefef...','','','','',0,0,0,0),
 (23089,20182,20155,20199,'Test Test','2016-03-09 04:17:18','2016-03-09 04:17:18',20012,23088,'228dc0f8-af1e-4c62-819c-8bb6860f88b7',0,1,NULL,NULL,NULL,NULL,'','OpenSocial Gadgets','','','','',0,0,0,0),
 (23108,20195,20155,20199,'Test Test','2016-03-09 04:21:43','2016-03-09 04:21:43',20005,23103,'edb8e180-784e-48b7-a55c-9f62300cf03b',0,0,NULL,NULL,NULL,NULL,'','Danielle Christian Delgado','','','','',0,0,0,0),
 (23117,20195,20155,20199,'Test Test','2016-03-09 04:22:15','2016-03-09 04:22:15',20005,23112,'193a65e9-7a04-4600-8117-b094d964b04a',0,0,NULL,NULL,NULL,NULL,'','Usuario01 Usuario01 Usuario01','','','','',0,0,0,0),
 (23137,20201,20155,20199,'Test Test','2016-03-09 04:33:26','2016-03-09 04:33:26',20013,23136,'21e00ad8-aea3-409a-8139-4fbb152fb6f2',0,1,NULL,NULL,NULL,NULL,'text/plain','ContenidoTest','','','','',0,0,0,0),
 (23143,20201,20155,20199,'Test Test','2016-03-09 04:34:09','2016-03-09 04:34:09',20109,23141,'9092a393-2715-4539-9ba2-f8bb152bccbe',0,1,NULL,NULL,'2016-03-09 04:33:00',NULL,'text/html','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">ContenidoTestOfertaLaboral</Title></root>','','','','',0,0,0,0),
 (23147,20201,20155,20199,'Test Test','2016-03-09 04:34:09','2016-03-09 04:34:09',20116,23145,'4fc72550-686a-43a8-a533-6f428385828d',0,0,NULL,NULL,NULL,NULL,'text/html','23141','','','','',0,0,0,0),
 (23223,20182,20155,20199,'Test Test','2016-03-09 05:24:26','2016-03-09 05:24:26',20116,23221,'53107e3c-ac15-4950-a036-590d5a7d18a5',0,0,NULL,NULL,NULL,NULL,'text/html','23063','','','','',0,0,0,0),
 (23302,20182,20155,20199,'Test Test','2016-03-09 05:45:25','2016-03-09 05:45:25',20116,23301,'167a542b-f4bf-42ff-81e8-18b40108453e',0,1,NULL,NULL,'2016-03-09 05:45:25',NULL,'text/html','weffwe...','','','','',0,0,0,0),
 (23306,20182,20155,20199,'Test Test','2016-03-09 06:17:42','2016-03-09 06:17:42',20116,23305,'9eb9b966-005e-4982-8d03-377298417361',0,1,NULL,NULL,'2016-03-09 06:17:42',NULL,'text/html','ewfwefwfewf...','','','','',0,0,0,0),
 (23308,20182,20155,20199,'Test Test','2016-03-09 06:17:47','2016-03-09 06:17:47',20116,23307,'01a74e07-b3c1-472c-b243-227e613b4299',0,1,NULL,NULL,'2016-03-09 06:17:47',NULL,'text/html','qwdwdwdwqd wqdwqd w...','','','','',0,0,0,0),
 (23809,21212,20155,20159,'','2016-04-01 04:16:53','2016-04-01 04:16:53',20116,23807,'d36631d5-1c10-4151-9351-7ec0d35b99c2',0,0,NULL,NULL,NULL,NULL,'text/html','23805','','','','',0,0,0,0),
 (23833,23816,20155,20159,'','2016-04-01 04:17:27','2016-04-01 04:17:27',20116,23831,'f37a08a1-6de8-447d-b1ee-09abb7333401',0,0,NULL,NULL,NULL,NULL,'text/html','23829','','','','',0,0,0,0),
 (24218,20195,20155,20199,'Test Test','2016-04-01 04:34:34','2016-04-01 04:36:09',20005,24213,'60652b56-4771-4d18-8bce-0303e9eb69af',0,0,NULL,NULL,NULL,NULL,'','IVAN QUIROZ','','','','',0,0,0,0),
 (24526,20195,20155,20199,'Test Test','2016-04-02 04:33:09','2016-04-02 04:51:41',20001,24523,'',0,0,NULL,NULL,NULL,NULL,'','Intranet Hitss','Intranet Hitss','','','',0,0,0,0);
/*!40000 ALTER TABLE `assetentry` ENABLE KEYS */;


--
-- Definition of table `assetlink`
--

DROP TABLE IF EXISTS `assetlink`;
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

--
-- Dumping data for table `assetlink`
--

/*!40000 ALTER TABLE `assetlink` DISABLE KEYS */;
/*!40000 ALTER TABLE `assetlink` ENABLE KEYS */;


--
-- Definition of table `assettag`
--

DROP TABLE IF EXISTS `assettag`;
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

--
-- Dumping data for table `assettag`
--

/*!40000 ALTER TABLE `assettag` DISABLE KEYS */;
INSERT INTO `assettag` (`tagId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`assetCount`) VALUES 
 (23039,20182,20155,20199,'Test Test','2016-03-09 04:03:00','2016-03-09 04:03:00','sql',1),
 (23040,20182,20155,20199,'Test Test','2016-03-09 04:03:06','2016-03-09 04:03:06','java',1),
 (23041,20182,20155,20199,'Test Test','2016-03-09 04:03:20','2016-03-09 04:03:20','.net',0),
 (23042,20182,20155,20199,'Test Test','2016-03-09 04:03:30','2016-03-09 04:03:30','jenkins',1),
 (23043,20182,20155,20199,'Test Test','2016-03-09 04:03:36','2016-03-09 04:03:36','sonar',1);
/*!40000 ALTER TABLE `assettag` ENABLE KEYS */;


--
-- Definition of table `assettagproperty`
--

DROP TABLE IF EXISTS `assettagproperty`;
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

--
-- Dumping data for table `assettagproperty`
--

/*!40000 ALTER TABLE `assettagproperty` DISABLE KEYS */;
/*!40000 ALTER TABLE `assettagproperty` ENABLE KEYS */;


--
-- Definition of table `assettagstats`
--

DROP TABLE IF EXISTS `assettagstats`;
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

--
-- Dumping data for table `assettagstats`
--

/*!40000 ALTER TABLE `assettagstats` DISABLE KEYS */;
INSERT INTO `assettagstats` (`tagStatsId`,`tagId`,`classNameId`,`assetCount`) VALUES 
 (23073,23039,20109,1),
 (23074,23040,20109,1),
 (23075,23042,20109,1),
 (23076,23043,20109,1);
/*!40000 ALTER TABLE `assettagstats` ENABLE KEYS */;


--
-- Definition of table `assetvocabulary`
--

DROP TABLE IF EXISTS `assetvocabulary`;
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

--
-- Dumping data for table `assetvocabulary`
--

/*!40000 ALTER TABLE `assetvocabulary` DISABLE KEYS */;
INSERT INTO `assetvocabulary` (`uuid_`,`vocabularyId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`title`,`description`,`settings_`) VALUES 
 ('f7c47e82-dd77-4450-933b-e2d250ed2b83',20324,20195,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55','Topic','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Title language-id=\"en_US\">Topic</Title></root>','',''),
 ('f4d323bb-180c-4e85-b0a8-4cbc624fce2f',23045,20182,20155,20159,'','2016-03-09 04:03:45','2016-03-09 04:04:28','Solicitud','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Solicitud</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Vocabulario para solicitudes</Description></root>','multiValued=true\nselectedClassNameIds=0\n'),
 ('b2477a6d-e48c-421f-a7f5-3a156d11168d',23053,20182,20155,20199,'Test Test','2016-03-09 04:07:25','2016-03-09 04:07:25','Oferta Laboral','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Oferta Laboral</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Laboral</Description></root>','multiValued=true\nselectedClassNameIds=0\n'),
 ('ad4b06e2-01dc-4117-a103-3dbb1106d792',23129,20201,20155,20159,'','2016-03-09 04:26:27','2016-03-09 04:29:51','Solicitud','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Solicitud</Title></root>','','multiValued=true\nselectedClassNameIds=0\n'),
 ('b748e6e2-d517-49d9-9312-554b433a7d93',23132,20201,20155,20199,'Test Test','2016-03-09 04:30:30','2016-03-09 04:30:30','Oferta Laboral','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Oferta Laboral</Title></root>','','multiValued=true\nselectedClassNameIds=0\n'),
 ('a6bf06b9-ff85-4f04-92f5-9e3207a799c8',24530,20376,20155,20159,'','2016-04-02 04:33:11','2016-04-02 04:33:11','Topic','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Topic</Title></root>','',''),
 ('a6bf06b9-ff85-4f04-92f5-9e3207a799c8',24531,24523,20155,20159,'','2016-04-02 04:33:12','2016-04-02 04:33:12','Topic','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Topic</Title></root>','','');
/*!40000 ALTER TABLE `assetvocabulary` ENABLE KEYS */;


--
-- Definition of table `backgroundtask`
--

DROP TABLE IF EXISTS `backgroundtask`;
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

--
-- Dumping data for table `backgroundtask`
--

/*!40000 ALTER TABLE `backgroundtask` DISABLE KEYS */;
INSERT INTO `backgroundtask` (`backgroundTaskId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`servletContextNames`,`taskExecutorClassName`,`taskContext`,`completed`,`completionDate`,`status`,`statusMessage`) VALUES 
 (24548,24523,20155,20159,'','2016-04-02 04:33:13','2016-04-02 04:33:13','','','com.liferay.portal.lar.backgroundtask.StagingIndexingBackgroundTaskExecutor','{\"map\":{\"portletDataContext\":{\"javaClass\":\"com.liferay.portal.lar.PortletDataContextImpl\",\"serializable\":{\"startDate\":null,\"scopeGroupId\":24523,\"sourceGroupId\":0,\"assetCategoryUuidsMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"commentsMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"oldPlid\":0,\"endDate\":null,\"rootPortletId\":null,\"references\":{\"set\":{},\"javaClass\":\"java.util.HashSet\"},\"scopeType\":null,\"scopeLayoutUuid\":null,\"parameterMap\":{\"map\":{\"THEME_REFERENCE\":[\"true\"],\"PERMISSIONS\":[\"true\"],\"DELETE_PORTLET_DATA\":[\"false\"],\"UPDATE_LAST_PUBLISH_DATE\":[\"false\"],\"USER_ID_STRATEGY\":[\"CURRENT_USER_ID\"],\"DELETE_MISSING_LAYOUTS\":[\"false\"],\"PORTLET_CONFIGURATION_ALL\":[\"true\"],\"PORTLET_DATA\":[\"true\"],\"PORTLET_CONFIGURATION\":[\"true\"],\"LAYOUT_SET_SETTINGS\":[\"true\"],\"PORTLET_DATA_ALL\":[\"true\"],\"LAYOUTS_IMPORT_MODE\":[\"CREATED_FROM_PROTOTYPE\"],\"PORTLET_SETUP_ALL\":[\"true\"],\"LOGO\":[\"true\"],\"CATEGORIES\":[\"true\"],\"LAYOUT_SET_PROTOTYPE_LINK_ENABLED\":[\"true\"],\"DATA_STRATEGY\":[\"DATA_STRATEGY_MIRROR\"],\"IGNORE_LAST_PUBLISH_DATE\":[\"true\"]},\"javaClass\":\"java.util.LinkedHashMap\"},\"primaryKeys\":{\"set\":{},\"javaClass\":\"java.util.HashSet\"},\"sourceCompanyGroupId\":0,\"expandoColumnsMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"notUniquePerLayout\":{\"set\":{},\"javaClass\":\"java.util.HashSet\"},\"companyGroupId\":20195,\"dataStrategy\":\"DATA_STRATEGY_MIRROR\",\"assetLinksMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"deletionSystemEventModelTypes\":{\"set\":{},\"javaClass\":\"java.util.HashSet\"},\"assetCategoryIdsMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"groupId\":24523,\"permissionsMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"newPrimaryKeysMaps\":{\"map\":{\"com.liferay.portal.model.Layout\":{\"map\":{\"20396\":24536,\"20404\":24538,\"20387\":24534},\"javaClass\":\"java.util.HashMap\"},\"com.liferay.portal.model.LayoutFriendlyURL\":{\"map\":{\"20397\":24537,\"20388\":24535,\"20405\":24539},\"javaClass\":\"java.util.HashMap\"},\"com.liferay.portlet.wiki.model.WikiNode\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"com.liferay.portlet.asset.model.AssetCategory\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"interface com.liferay.portlet.journal.model.JournalArticle.articleId\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"},\"com.liferay.portlet.asset.model.AssetVocabulary\":{\"map\":{\"24530\":24531},\"javaClass\":\"java.util.HashMap\"}},\"javaClass\":\"java.util.HashMap\"},\"sourceUserPersonalSiteGroupId\":0,\"sourceCompanyId\":0,\"plid\":0,\"scopedPrimaryKeys\":{\"set\":{},\"javaClass\":\"java.util.HashSet\"},\"companyId\":20155,\"userPersonalSiteGroupId\":20192,\"privateLayout\":false,\"assetTagNamesMap\":{\"map\":{},\"javaClass\":\"java.util.HashMap\"}}},\"userId\":20159},\"javaClass\":\"java.util.HashMap\"}',1,'2016-04-02 04:33:13',3,'');
/*!40000 ALTER TABLE `backgroundtask` ENABLE KEYS */;


--
-- Definition of table `blogsentry`
--

DROP TABLE IF EXISTS `blogsentry`;
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

--
-- Dumping data for table `blogsentry`
--

/*!40000 ALTER TABLE `blogsentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `blogsentry` ENABLE KEYS */;


--
-- Definition of table `blogsstatsuser`
--

DROP TABLE IF EXISTS `blogsstatsuser`;
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

--
-- Dumping data for table `blogsstatsuser`
--

/*!40000 ALTER TABLE `blogsstatsuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `blogsstatsuser` ENABLE KEYS */;


--
-- Definition of table `bookmarksentry`
--

DROP TABLE IF EXISTS `bookmarksentry`;
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

--
-- Dumping data for table `bookmarksentry`
--

/*!40000 ALTER TABLE `bookmarksentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookmarksentry` ENABLE KEYS */;


--
-- Definition of table `bookmarksfolder`
--

DROP TABLE IF EXISTS `bookmarksfolder`;
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

--
-- Dumping data for table `bookmarksfolder`
--

/*!40000 ALTER TABLE `bookmarksfolder` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookmarksfolder` ENABLE KEYS */;


--
-- Definition of table `browsertracker`
--

DROP TABLE IF EXISTS `browsertracker`;
CREATE TABLE `browsertracker` (
  `browserTrackerId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `browserKey` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`browserTrackerId`),
  UNIQUE KEY `IX_E7B95510` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `browsertracker`
--

/*!40000 ALTER TABLE `browsertracker` DISABLE KEYS */;
INSERT INTO `browsertracker` (`browserTrackerId`,`userId`,`browserKey`) VALUES 
 (20525,20199,704562001894),
 (24225,24213,1194762247740);
/*!40000 ALTER TABLE `browsertracker` ENABLE KEYS */;


--
-- Definition of table `calendar`
--

DROP TABLE IF EXISTS `calendar`;
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

--
-- Dumping data for table `calendar`
--

/*!40000 ALTER TABLE `calendar` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendar` ENABLE KEYS */;


--
-- Definition of table `calendarbooking`
--

DROP TABLE IF EXISTS `calendarbooking`;
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

--
-- Dumping data for table `calendarbooking`
--

/*!40000 ALTER TABLE `calendarbooking` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendarbooking` ENABLE KEYS */;


--
-- Definition of table `calendarnotificationtemplate`
--

DROP TABLE IF EXISTS `calendarnotificationtemplate`;
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

--
-- Dumping data for table `calendarnotificationtemplate`
--

/*!40000 ALTER TABLE `calendarnotificationtemplate` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendarnotificationtemplate` ENABLE KEYS */;


--
-- Definition of table `calendarresource`
--

DROP TABLE IF EXISTS `calendarresource`;
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

--
-- Dumping data for table `calendarresource`
--

/*!40000 ALTER TABLE `calendarresource` DISABLE KEYS */;
/*!40000 ALTER TABLE `calendarresource` ENABLE KEYS */;


--
-- Definition of table `calevent`
--

DROP TABLE IF EXISTS `calevent`;
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

--
-- Dumping data for table `calevent`
--

/*!40000 ALTER TABLE `calevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `calevent` ENABLE KEYS */;


--
-- Definition of table `classname_`
--

DROP TABLE IF EXISTS `classname_`;
CREATE TABLE `classname_` (
  `classNameId` bigint(20) NOT NULL,
  `value` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`classNameId`),
  UNIQUE KEY `IX_B27A301F` (`value`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `classname_`
--

/*!40000 ALTER TABLE `classname_` DISABLE KEYS */;
INSERT INTO `classname_` (`classNameId`,`value`) VALUES 
 (20443,'com.liferay.calendar.model.Calendar'),
 (20444,'com.liferay.calendar.model.CalendarBooking'),
 (20445,'com.liferay.calendar.model.CalendarNotificationTemplate'),
 (20446,'com.liferay.calendar.model.CalendarResource'),
 (20017,'com.liferay.counter.model.Counter'),
 (20437,'com.liferay.marketplace.model.App'),
 (20438,'com.liferay.marketplace.model.Module'),
 (20481,'com.liferay.notifications.model.UserNotificationEvent'),
 (20501,'com.liferay.opensocial.model.Gadget'),
 (20502,'com.liferay.opensocial.model.OAuthConsumer'),
 (20503,'com.liferay.opensocial.model.OAuthToken'),
 (20422,'com.liferay.portal.kernel.repository.model.FileEntry'),
 (23128,'com.liferay.portal.kernel.repository.model.Folder'),
 (20018,'com.liferay.portal.kernel.workflow.WorkflowTask'),
 (20019,'com.liferay.portal.model.Account'),
 (20020,'com.liferay.portal.model.Address'),
 (20021,'com.liferay.portal.model.BackgroundTask'),
 (20022,'com.liferay.portal.model.BrowserTracker'),
 (20023,'com.liferay.portal.model.ClassName'),
 (20024,'com.liferay.portal.model.ClusterGroup'),
 (20025,'com.liferay.portal.model.Company'),
 (20026,'com.liferay.portal.model.Contact'),
 (20027,'com.liferay.portal.model.Country'),
 (20028,'com.liferay.portal.model.EmailAddress'),
 (20001,'com.liferay.portal.model.Group'),
 (20029,'com.liferay.portal.model.Image'),
 (20002,'com.liferay.portal.model.Layout'),
 (20030,'com.liferay.portal.model.LayoutBranch'),
 (20031,'com.liferay.portal.model.LayoutFriendlyURL'),
 (20032,'com.liferay.portal.model.LayoutPrototype'),
 (20033,'com.liferay.portal.model.LayoutRevision'),
 (20034,'com.liferay.portal.model.LayoutSet'),
 (20035,'com.liferay.portal.model.LayoutSetBranch'),
 (20036,'com.liferay.portal.model.LayoutSetPrototype'),
 (20037,'com.liferay.portal.model.ListType'),
 (20038,'com.liferay.portal.model.Lock'),
 (20039,'com.liferay.portal.model.MembershipRequest'),
 (20003,'com.liferay.portal.model.Organization'),
 (20040,'com.liferay.portal.model.OrgGroupRole'),
 (20041,'com.liferay.portal.model.OrgLabor'),
 (20042,'com.liferay.portal.model.PasswordPolicy'),
 (20043,'com.liferay.portal.model.PasswordPolicyRel'),
 (20044,'com.liferay.portal.model.PasswordTracker'),
 (20045,'com.liferay.portal.model.Phone'),
 (20046,'com.liferay.portal.model.PluginSetting'),
 (20047,'com.liferay.portal.model.PortalPreferences'),
 (20048,'com.liferay.portal.model.Portlet'),
 (20049,'com.liferay.portal.model.PortletItem'),
 (20050,'com.liferay.portal.model.PortletPreferences'),
 (20051,'com.liferay.portal.model.Region'),
 (20052,'com.liferay.portal.model.Release'),
 (20053,'com.liferay.portal.model.Repository'),
 (20054,'com.liferay.portal.model.RepositoryEntry'),
 (20055,'com.liferay.portal.model.ResourceAction'),
 (20056,'com.liferay.portal.model.ResourceBlock'),
 (20057,'com.liferay.portal.model.ResourceBlockPermission'),
 (20058,'com.liferay.portal.model.ResourcePermission'),
 (20059,'com.liferay.portal.model.ResourceTypePermission'),
 (20004,'com.liferay.portal.model.Role'),
 (20060,'com.liferay.portal.model.ServiceComponent'),
 (20061,'com.liferay.portal.model.Shard'),
 (20062,'com.liferay.portal.model.Subscription'),
 (20063,'com.liferay.portal.model.SystemEvent'),
 (20064,'com.liferay.portal.model.Team'),
 (20065,'com.liferay.portal.model.Ticket'),
 (20005,'com.liferay.portal.model.User'),
 (20006,'com.liferay.portal.model.UserGroup'),
 (20066,'com.liferay.portal.model.UserGroupGroupRole'),
 (20067,'com.liferay.portal.model.UserGroupRole'),
 (20068,'com.liferay.portal.model.UserIdMapper'),
 (20069,'com.liferay.portal.model.UserNotificationDelivery'),
 (20070,'com.liferay.portal.model.UserNotificationEvent'),
 (20191,'com.liferay.portal.model.UserPersonalSite'),
 (20071,'com.liferay.portal.model.UserTracker'),
 (20072,'com.liferay.portal.model.UserTrackerPath'),
 (20073,'com.liferay.portal.model.VirtualHost'),
 (20074,'com.liferay.portal.model.WebDAVProps'),
 (20075,'com.liferay.portal.model.Website'),
 (20076,'com.liferay.portal.model.WorkflowDefinitionLink'),
 (20077,'com.liferay.portal.model.WorkflowInstanceLink'),
 (20615,'com.liferay.portal.repository.liferayrepository.LiferayRepository'),
 (20450,'com.liferay.portal.workflow.kaleo.model.KaleoAction'),
 (20451,'com.liferay.portal.workflow.kaleo.model.KaleoCondition'),
 (20452,'com.liferay.portal.workflow.kaleo.model.KaleoDefinition'),
 (20453,'com.liferay.portal.workflow.kaleo.model.KaleoInstance'),
 (20454,'com.liferay.portal.workflow.kaleo.model.KaleoInstanceToken'),
 (20455,'com.liferay.portal.workflow.kaleo.model.KaleoLog'),
 (20456,'com.liferay.portal.workflow.kaleo.model.KaleoNode'),
 (20457,'com.liferay.portal.workflow.kaleo.model.KaleoNotification'),
 (20458,'com.liferay.portal.workflow.kaleo.model.KaleoNotificationRecipient'),
 (20459,'com.liferay.portal.workflow.kaleo.model.KaleoTask'),
 (20460,'com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment'),
 (20461,'com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance'),
 (20462,'com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken'),
 (20463,'com.liferay.portal.workflow.kaleo.model.KaleoTimer'),
 (20464,'com.liferay.portal.workflow.kaleo.model.KaleoTimerInstanceToken'),
 (20465,'com.liferay.portal.workflow.kaleo.model.KaleoTransition'),
 (20078,'com.liferay.portlet.announcements.model.AnnouncementsDelivery'),
 (20079,'com.liferay.portlet.announcements.model.AnnouncementsEntry'),
 (20080,'com.liferay.portlet.announcements.model.AnnouncementsFlag'),
 (20081,'com.liferay.portlet.asset.model.AssetCategory'),
 (20082,'com.liferay.portlet.asset.model.AssetCategoryProperty'),
 (20083,'com.liferay.portlet.asset.model.AssetEntry'),
 (20084,'com.liferay.portlet.asset.model.AssetLink'),
 (20085,'com.liferay.portlet.asset.model.AssetTag'),
 (20086,'com.liferay.portlet.asset.model.AssetTagProperty'),
 (20087,'com.liferay.portlet.asset.model.AssetTagStats'),
 (20088,'com.liferay.portlet.asset.model.AssetVocabulary'),
 (20007,'com.liferay.portlet.blogs.model.BlogsEntry'),
 (20089,'com.liferay.portlet.blogs.model.BlogsStatsUser'),
 (20008,'com.liferay.portlet.bookmarks.model.BookmarksEntry'),
 (20009,'com.liferay.portlet.bookmarks.model.BookmarksFolder'),
 (20010,'com.liferay.portlet.calendar.model.CalEvent'),
 (20090,'com.liferay.portlet.documentlibrary.model.DLContent'),
 (20011,'com.liferay.portlet.documentlibrary.model.DLFileEntry'),
 (20091,'com.liferay.portlet.documentlibrary.model.DLFileEntryMetadata'),
 (20092,'com.liferay.portlet.documentlibrary.model.DLFileEntryType'),
 (20093,'com.liferay.portlet.documentlibrary.model.DLFileRank'),
 (20094,'com.liferay.portlet.documentlibrary.model.DLFileShortcut'),
 (20095,'com.liferay.portlet.documentlibrary.model.DLFileVersion'),
 (20012,'com.liferay.portlet.documentlibrary.model.DLFolder'),
 (20096,'com.liferay.portlet.documentlibrary.model.DLSyncEvent'),
 (20314,'com.liferay.portlet.documentlibrary.util.RawMetadataProcessor'),
 (20097,'com.liferay.portlet.dynamicdatalists.model.DDLRecord'),
 (20098,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet'),
 (20099,'com.liferay.portlet.dynamicdatalists.model.DDLRecordVersion'),
 (20100,'com.liferay.portlet.dynamicdatamapping.model.DDMContent'),
 (20101,'com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink'),
 (20102,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure'),
 (20103,'com.liferay.portlet.dynamicdatamapping.model.DDMStructureLink'),
 (20104,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate'),
 (20105,'com.liferay.portlet.expando.model.ExpandoColumn'),
 (20106,'com.liferay.portlet.expando.model.ExpandoRow'),
 (20107,'com.liferay.portlet.expando.model.ExpandoTable'),
 (20108,'com.liferay.portlet.expando.model.ExpandoValue'),
 (20109,'com.liferay.portlet.journal.model.JournalArticle'),
 (20110,'com.liferay.portlet.journal.model.JournalArticleImage'),
 (20111,'com.liferay.portlet.journal.model.JournalArticleResource'),
 (20112,'com.liferay.portlet.journal.model.JournalContentSearch'),
 (20113,'com.liferay.portlet.journal.model.JournalFeed'),
 (20013,'com.liferay.portlet.journal.model.JournalFolder'),
 (24528,'com.liferay.portlet.layoutsadmin.lar.StagedTheme'),
 (20114,'com.liferay.portlet.messageboards.model.MBBan'),
 (20115,'com.liferay.portlet.messageboards.model.MBCategory'),
 (20116,'com.liferay.portlet.messageboards.model.MBDiscussion'),
 (20117,'com.liferay.portlet.messageboards.model.MBMailingList'),
 (20014,'com.liferay.portlet.messageboards.model.MBMessage'),
 (20118,'com.liferay.portlet.messageboards.model.MBStatsUser'),
 (20015,'com.liferay.portlet.messageboards.model.MBThread'),
 (20119,'com.liferay.portlet.messageboards.model.MBThreadFlag'),
 (20120,'com.liferay.portlet.mobiledevicerules.model.MDRAction'),
 (20121,'com.liferay.portlet.mobiledevicerules.model.MDRRule'),
 (20122,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup'),
 (20123,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance'),
 (20124,'com.liferay.portlet.polls.model.PollsChoice'),
 (20125,'com.liferay.portlet.polls.model.PollsQuestion'),
 (20126,'com.liferay.portlet.polls.model.PollsVote'),
 (20127,'com.liferay.portlet.ratings.model.RatingsEntry'),
 (20128,'com.liferay.portlet.ratings.model.RatingsStats'),
 (20129,'com.liferay.portlet.shopping.model.ShoppingCart'),
 (20130,'com.liferay.portlet.shopping.model.ShoppingCategory'),
 (20131,'com.liferay.portlet.shopping.model.ShoppingCoupon'),
 (20132,'com.liferay.portlet.shopping.model.ShoppingItem'),
 (20133,'com.liferay.portlet.shopping.model.ShoppingItemField'),
 (20134,'com.liferay.portlet.shopping.model.ShoppingItemPrice'),
 (20135,'com.liferay.portlet.shopping.model.ShoppingOrder'),
 (20136,'com.liferay.portlet.shopping.model.ShoppingOrderItem'),
 (20137,'com.liferay.portlet.social.model.SocialActivity'),
 (20138,'com.liferay.portlet.social.model.SocialActivityAchievement'),
 (20139,'com.liferay.portlet.social.model.SocialActivityCounter'),
 (20140,'com.liferay.portlet.social.model.SocialActivityLimit'),
 (20141,'com.liferay.portlet.social.model.SocialActivitySet'),
 (20142,'com.liferay.portlet.social.model.SocialActivitySetting'),
 (20143,'com.liferay.portlet.social.model.SocialRelation'),
 (20144,'com.liferay.portlet.social.model.SocialRequest'),
 (20145,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion'),
 (20146,'com.liferay.portlet.softwarecatalog.model.SCLicense'),
 (20147,'com.liferay.portlet.softwarecatalog.model.SCProductEntry'),
 (20148,'com.liferay.portlet.softwarecatalog.model.SCProductScreenshot'),
 (20149,'com.liferay.portlet.softwarecatalog.model.SCProductVersion'),
 (20150,'com.liferay.portlet.trash.model.TrashEntry'),
 (20151,'com.liferay.portlet.trash.model.TrashVersion'),
 (20152,'com.liferay.portlet.wiki.model.WikiNode'),
 (20016,'com.liferay.portlet.wiki.model.WikiPage'),
 (20153,'com.liferay.portlet.wiki.model.WikiPageResource'),
 (20511,'com.liferay.sync.model.SyncDLFileVersionDiff'),
 (20512,'com.liferay.sync.model.SyncDLObject'),
 (23811,'com.rec.hitss.layer.model.Foo');
/*!40000 ALTER TABLE `classname_` ENABLE KEYS */;


--
-- Definition of table `clustergroup`
--

DROP TABLE IF EXISTS `clustergroup`;
CREATE TABLE `clustergroup` (
  `clusterGroupId` bigint(20) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `clusterNodeIds` varchar(75) DEFAULT NULL,
  `wholeCluster` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`clusterGroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `clustergroup`
--

/*!40000 ALTER TABLE `clustergroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `clustergroup` ENABLE KEYS */;


--
-- Definition of table `company`
--

DROP TABLE IF EXISTS `company`;
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

--
-- Dumping data for table `company`
--

/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` (`companyId`,`accountId`,`webId`,`key_`,`mx`,`homeURL`,`logoId`,`system`,`maxUsers`,`active_`) VALUES 
 (20155,20157,'liferay.com','rO0ABXNyAB9qYXZheC5jcnlwdG8uc3BlYy5TZWNyZXRLZXlTcGVjW0cLZuIwYU0CAAJMAAlhbGdvcml0aG10ABJMamF2YS9sYW5nL1N0cmluZztbAANrZXl0AAJbQnhwdAADQUVTdXIAAltCrPMX+AYIVOACAAB4cAAAABB/izVbcT4OVFUZKh/Tjw3+','liferay.com','',0,0,0,1);
/*!40000 ALTER TABLE `company` ENABLE KEYS */;


--
-- Definition of table `contact_`
--

DROP TABLE IF EXISTS `contact_`;
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

--
-- Dumping data for table `contact_`
--

/*!40000 ALTER TABLE `contact_` DISABLE KEYS */;
INSERT INTO `contact_` (`contactId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`accountId`,`parentContactId`,`emailAddress`,`firstName`,`middleName`,`lastName`,`prefixId`,`suffixId`,`male`,`birthday`,`smsSn`,`aimSn`,`facebookSn`,`icqSn`,`jabberSn`,`msnSn`,`mySpaceSn`,`skypeSn`,`twitterSn`,`ymSn`,`employeeStatusId`,`employeeNumber`,`jobTitle`,`jobClass`,`hoursOfOperation`) VALUES 
 (20160,20155,20159,'','2016-03-06 15:57:47','2016-03-06 15:57:47',20005,20159,20157,0,'default@liferay.com','','','',0,0,1,'2016-03-06 15:57:47','','','','','','','','','','','','','','',''),
 (20200,20155,20199,'','2016-03-06 15:57:51','2016-03-06 16:10:01',20005,20199,20157,0,'test@liferay.com','Test','','Test',0,0,1,'1970-01-01 00:00:00','','','','','','','','','','','','','','',''),
 (23104,20155,20199,'Test Test','2016-03-09 04:21:43','2016-03-09 04:21:43',20005,23103,20157,0,'danieldelgado20g@gmail.com','Danielle','Christian','Delgado',11015,11025,1,'1990-10-12 00:00:00','','','','','','','','','','','','','Desarrollador Java Liferay','',''),
 (23113,20155,20199,'Test Test','2016-03-09 04:22:15','2016-03-09 04:22:15',20005,23112,20157,0,'usuario01@gmail.com','Usuario01','Usuario01','Usuario01',11015,11025,1,'1970-01-01 00:00:00','','','','','','','','','','','','','Usuario01Usuario01Usuario01','',''),
 (24214,20155,20199,'Test Test','2016-04-01 04:34:34','2016-04-01 04:36:09',20005,24213,20157,0,'ivan.quiroz@gmail.com','IVAN','','QUIROZ',11014,11022,1,'1970-01-01 00:00:00','','','','','','','','','','','','','coordinar de rrhh','','');
/*!40000 ALTER TABLE `contact_` ENABLE KEYS */;


--
-- Definition of table `counter`
--

DROP TABLE IF EXISTS `counter`;
CREATE TABLE `counter` (
  `name` varchar(75) NOT NULL,
  `currentId` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `counter`
--

/*!40000 ALTER TABLE `counter` DISABLE KEYS */;
INSERT INTO `counter` (`name`,`currentId`) VALUES 
 ('com.liferay.counter.model.Counter',24600),
 ('com.liferay.portal.model.Layout#20173#true',1),
 ('com.liferay.portal.model.Layout#20182#false',4),
 ('com.liferay.portal.model.Layout#20317#true',1),
 ('com.liferay.portal.model.Layout#20329#true',1),
 ('com.liferay.portal.model.Layout#20339#true',1),
 ('com.liferay.portal.model.Layout#20350#true',2),
 ('com.liferay.portal.model.Layout#20376#true',3),
 ('com.liferay.portal.model.Layout#20812#true',1),
 ('com.liferay.portal.model.Layout#21212#true',1),
 ('com.liferay.portal.model.Layout#23816#true',1),
 ('com.liferay.portal.model.Layout#24523#true',3),
 ('com.liferay.portal.model.ResourceAction',1700),
 ('com.liferay.portal.model.ResourcePermission',2400),
 ('com.liferay.portlet.documentlibrary.model.DLFileEntry',600),
 ('com.liferay.portlet.social.model.SocialActivity',100),
 ('com.rec.hitss.layer.model.Foo',200);
/*!40000 ALTER TABLE `counter` ENABLE KEYS */;


--
-- Definition of table `country`
--

DROP TABLE IF EXISTS `country`;
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

--
-- Dumping data for table `country`
--

/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` (`countryId`,`name`,`a2`,`a3`,`number_`,`idd_`,`zipRequired`,`active_`) VALUES 
 (1,'canada','CA','CAN','124','001',1,1),
 (2,'china','CN','CHN','156','086',1,1),
 (3,'france','FR','FRA','250','033',1,1),
 (4,'germany','DE','DEU','276','049',1,1),
 (5,'hong-kong','HK','HKG','344','852',1,1),
 (6,'hungary','HU','HUN','348','036',1,1),
 (7,'israel','IL','ISR','376','972',1,1),
 (8,'italy','IT','ITA','380','039',1,1),
 (9,'japan','JP','JPN','392','081',0,1),
 (10,'south-korea','KR','KOR','410','082',1,1),
 (11,'netherlands','NL','NLD','528','031',1,1),
 (12,'portugal','PT','PRT','620','351',1,1),
 (13,'russia','RU','RUS','643','007',1,1),
 (14,'singapore','SG','SGP','702','065',1,1),
 (15,'spain','ES','ESP','724','034',1,1),
 (16,'turkey','TR','TUR','792','090',1,1),
 (17,'vietnam','VN','VNM','704','084',1,1),
 (18,'united-kingdom','GB','GBR','826','044',1,1),
 (19,'united-states','US','USA','840','001',1,1),
 (20,'afghanistan','AF','AFG','4','093',1,1),
 (21,'albania','AL','ALB','8','355',1,1),
 (22,'algeria','DZ','DZA','12','213',1,1),
 (23,'american-samoa','AS','ASM','16','684',1,1),
 (24,'andorra','AD','AND','20','376',1,1),
 (25,'angola','AO','AGO','24','244',0,1),
 (26,'anguilla','AI','AIA','660','264',1,1),
 (27,'antarctica','AQ','ATA','10','672',1,1),
 (28,'antigua-barbuda','AG','ATG','28','268',0,1),
 (29,'argentina','AR','ARG','32','054',1,1),
 (30,'armenia','AM','ARM','51','374',1,1),
 (31,'aruba','AW','ABW','533','297',0,1),
 (32,'australia','AU','AUS','36','061',1,1),
 (33,'austria','AT','AUT','40','043',1,1),
 (34,'azerbaijan','AZ','AZE','31','994',1,1),
 (35,'bahamas','BS','BHS','44','242',0,1),
 (36,'bahrain','BH','BHR','48','973',1,1),
 (37,'bangladesh','BD','BGD','50','880',1,1),
 (38,'barbados','BB','BRB','52','246',1,1),
 (39,'belarus','BY','BLR','112','375',1,1),
 (40,'belgium','BE','BEL','56','032',1,1),
 (41,'belize','BZ','BLZ','84','501',0,1),
 (42,'benin','BJ','BEN','204','229',0,1),
 (43,'bermuda','BM','BMU','60','441',1,1),
 (44,'bhutan','BT','BTN','64','975',1,1),
 (45,'bolivia','BO','BOL','68','591',1,1),
 (46,'bosnia-herzegovina','BA','BIH','70','387',1,1),
 (47,'botswana','BW','BWA','72','267',0,1),
 (48,'brazil','BR','BRA','76','055',1,1),
 (49,'british-virgin-islands','VG','VGB','92','284',1,1),
 (50,'brunei','BN','BRN','96','673',1,1),
 (51,'bulgaria','BG','BGR','100','359',1,1),
 (52,'burkina-faso','BF','BFA','854','226',0,1),
 (53,'burma-myanmar','MM','MMR','104','095',1,1),
 (54,'burundi','BI','BDI','108','257',0,1),
 (55,'cambodia','KH','KHM','116','855',1,1),
 (56,'cameroon','CM','CMR','120','237',1,1),
 (57,'cape-verde-island','CV','CPV','132','238',1,1),
 (58,'cayman-islands','KY','CYM','136','345',1,1),
 (59,'central-african-republic','CF','CAF','140','236',0,1),
 (60,'chad','TD','TCD','148','235',1,1),
 (61,'chile','CL','CHL','152','056',1,1),
 (62,'christmas-island','CX','CXR','162','061',1,1),
 (63,'cocos-islands','CC','CCK','166','061',1,1),
 (64,'colombia','CO','COL','170','057',1,1),
 (65,'comoros','KM','COM','174','269',0,1),
 (66,'republic-of-congo','CD','COD','180','242',0,1),
 (67,'democratic-republic-of-congo','CG','COG','178','243',0,1),
 (68,'cook-islands','CK','COK','184','682',0,1),
 (69,'costa-rica','CR','CRI','188','506',1,1),
 (70,'croatia','HR','HRV','191','385',1,1),
 (71,'cuba','CU','CUB','192','053',1,1),
 (72,'cyprus','CY','CYP','196','357',1,1),
 (73,'czech-republic','CZ','CZE','203','420',1,1),
 (74,'denmark','DK','DNK','208','045',1,1),
 (75,'djibouti','DJ','DJI','262','253',0,1),
 (76,'dominica','DM','DMA','212','767',0,1),
 (77,'dominican-republic','DO','DOM','214','809',1,1),
 (78,'ecuador','EC','ECU','218','593',1,1),
 (79,'egypt','EG','EGY','818','020',1,1),
 (80,'el-salvador','SV','SLV','222','503',1,1),
 (81,'equatorial-guinea','GQ','GNQ','226','240',0,1),
 (82,'eritrea','ER','ERI','232','291',0,1),
 (83,'estonia','EE','EST','233','372',1,1),
 (84,'ethiopia','ET','ETH','231','251',1,1),
 (85,'faeroe-islands','FO','FRO','234','298',1,1),
 (86,'falkland-islands','FK','FLK','238','500',1,1),
 (87,'fiji-islands','FJ','FJI','242','679',0,1),
 (88,'finland','FI','FIN','246','358',1,1),
 (89,'french-guiana','GF','GUF','254','594',1,1),
 (90,'french-polynesia','PF','PYF','258','689',1,1),
 (91,'gabon','GA','GAB','266','241',1,1),
 (92,'gambia','GM','GMB','270','220',0,1),
 (93,'georgia','GE','GEO','268','995',1,1),
 (94,'ghana','GH','GHA','288','233',0,1),
 (95,'gibraltar','GI','GIB','292','350',1,1),
 (96,'greece','GR','GRC','300','030',1,1),
 (97,'greenland','GL','GRL','304','299',1,1),
 (98,'grenada','GD','GRD','308','473',0,1),
 (99,'guadeloupe','GP','GLP','312','590',1,1),
 (100,'guam','GU','GUM','316','671',1,1),
 (101,'guatemala','GT','GTM','320','502',1,1),
 (102,'guinea','GN','GIN','324','224',0,1),
 (103,'guinea-bissau','GW','GNB','624','245',1,1),
 (104,'guyana','GY','GUY','328','592',0,1),
 (105,'haiti','HT','HTI','332','509',1,1),
 (106,'honduras','HN','HND','340','504',1,1),
 (107,'iceland','IS','ISL','352','354',1,1),
 (108,'india','IN','IND','356','091',1,1),
 (109,'indonesia','ID','IDN','360','062',1,1),
 (110,'iran','IR','IRN','364','098',1,1),
 (111,'iraq','IQ','IRQ','368','964',1,1),
 (112,'ireland','IE','IRL','372','353',0,1),
 (113,'ivory-coast','CI','CIV','384','225',1,1),
 (114,'jamaica','JM','JAM','388','876',1,1),
 (115,'jordan','JO','JOR','400','962',1,1),
 (116,'kazakhstan','KZ','KAZ','398','007',1,1),
 (117,'kenya','KE','KEN','404','254',1,1),
 (118,'kiribati','KI','KIR','408','686',0,1),
 (119,'kuwait','KW','KWT','414','965',1,1),
 (120,'north-korea','KP','PRK','408','850',0,1),
 (121,'kyrgyzstan','KG','KGZ','471','996',1,1),
 (122,'laos','LA','LAO','418','856',1,1),
 (123,'latvia','LV','LVA','428','371',1,1),
 (124,'lebanon','LB','LBN','422','961',1,1),
 (125,'lesotho','LS','LSO','426','266',1,1),
 (126,'liberia','LR','LBR','430','231',1,1),
 (127,'libya','LY','LBY','434','218',1,1),
 (128,'liechtenstein','LI','LIE','438','423',1,1),
 (129,'lithuania','LT','LTU','440','370',1,1),
 (130,'luxembourg','LU','LUX','442','352',1,1),
 (131,'macau','MO','MAC','446','853',0,1),
 (132,'macedonia','MK','MKD','807','389',1,1),
 (133,'madagascar','MG','MDG','450','261',1,1),
 (134,'malawi','MW','MWI','454','265',0,1),
 (135,'malaysia','MY','MYS','458','060',1,1),
 (136,'maldives','MV','MDV','462','960',1,1),
 (137,'mali','ML','MLI','466','223',0,1),
 (138,'malta','MT','MLT','470','356',1,1),
 (139,'marshall-islands','MH','MHL','584','692',1,1),
 (140,'martinique','MQ','MTQ','474','596',1,1),
 (141,'mauritania','MR','MRT','478','222',0,1),
 (142,'mauritius','MU','MUS','480','230',0,1),
 (143,'mayotte-island','YT','MYT','175','269',1,1),
 (144,'mexico','MX','MEX','484','052',1,1),
 (145,'micronesia','FM','FSM','583','691',1,1),
 (146,'moldova','MD','MDA','498','373',1,1),
 (147,'monaco','MC','MCO','492','377',1,1),
 (148,'mongolia','MN','MNG','496','976',1,1),
 (149,'montenegro','ME','MNE','499','382',1,1),
 (150,'montserrat','MS','MSR','500','664',0,1),
 (151,'morocco','MA','MAR','504','212',1,1),
 (152,'mozambique','MZ','MOZ','508','258',1,1),
 (153,'namibia','NA','NAM','516','264',1,1),
 (154,'nauru','NR','NRU','520','674',0,1),
 (155,'nepal','NP','NPL','524','977',1,1),
 (156,'netherlands-antilles','AN','ANT','530','599',1,1),
 (157,'new-caledonia','NC','NCL','540','687',1,1),
 (158,'new-zealand','NZ','NZL','554','064',1,1),
 (159,'nicaragua','NI','NIC','558','505',1,1),
 (160,'niger','NE','NER','562','227',1,1),
 (161,'nigeria','NG','NGA','566','234',1,1),
 (162,'niue','NU','NIU','570','683',0,1),
 (163,'norfolk-island','NF','NFK','574','672',1,1),
 (164,'norway','NO','NOR','578','047',1,1),
 (165,'oman','OM','OMN','512','968',1,1),
 (166,'pakistan','PK','PAK','586','092',1,1),
 (167,'palau','PW','PLW','585','680',1,1),
 (168,'palestine','PS','PSE','275','970',1,1),
 (169,'panama','PA','PAN','591','507',1,1),
 (170,'papua-new-guinea','PG','PNG','598','675',1,1),
 (171,'paraguay','PY','PRY','600','595',1,1),
 (172,'peru','PE','PER','604','051',1,1),
 (173,'philippines','PH','PHL','608','063',1,1),
 (174,'poland','PL','POL','616','048',1,1),
 (175,'puerto-rico','PR','PRI','630','787',1,1),
 (176,'qatar','QA','QAT','634','974',0,1),
 (177,'reunion-island','RE','REU','638','262',1,1),
 (178,'romania','RO','ROU','642','040',1,1),
 (179,'rwanda','RW','RWA','646','250',0,1),
 (180,'st-helena','SH','SHN','654','290',1,1),
 (181,'st-kitts','KN','KNA','659','869',0,1),
 (182,'st-lucia','LC','LCA','662','758',0,1),
 (183,'st-pierre-miquelon','PM','SPM','666','508',1,1),
 (184,'st-vincent','VC','VCT','670','784',1,1),
 (185,'san-marino','SM','SMR','674','378',1,1),
 (186,'sao-tome-principe','ST','STP','678','239',0,1),
 (187,'saudi-arabia','SA','SAU','682','966',1,1),
 (188,'senegal','SN','SEN','686','221',1,1),
 (189,'serbia','RS','SRB','688','381',1,1),
 (190,'seychelles','SC','SYC','690','248',0,1),
 (191,'sierra-leone','SL','SLE','694','249',0,1),
 (192,'slovakia','SK','SVK','703','421',1,1),
 (193,'slovenia','SI','SVN','705','386',1,1),
 (194,'solomon-islands','SB','SLB','90','677',0,1),
 (195,'somalia','SO','SOM','706','252',0,1),
 (196,'south-africa','ZA','ZAF','710','027',1,1),
 (197,'sri-lanka','LK','LKA','144','094',1,1),
 (198,'sudan','SD','SDN','736','095',1,1),
 (199,'suriname','SR','SUR','740','597',0,1),
 (200,'swaziland','SZ','SWZ','748','268',1,1),
 (201,'sweden','SE','SWE','752','046',1,1),
 (202,'switzerland','CH','CHE','756','041',1,1),
 (203,'syria','SY','SYR','760','963',0,1),
 (204,'taiwan','TW','TWN','158','886',1,1),
 (205,'tajikistan','TJ','TJK','762','992',1,1),
 (206,'tanzania','TZ','TZA','834','255',0,1),
 (207,'thailand','TH','THA','764','066',1,1),
 (208,'togo','TG','TGO','768','228',1,1),
 (209,'tonga','TO','TON','776','676',0,1),
 (210,'trinidad-tobago','TT','TTO','780','868',0,1),
 (211,'tunisia','TN','TUN','788','216',1,1),
 (212,'turkmenistan','TM','TKM','795','993',1,1),
 (213,'turks-caicos','TC','TCA','796','649',1,1),
 (214,'tuvalu','TV','TUV','798','688',0,1),
 (215,'uganda','UG','UGA','800','256',0,1),
 (216,'ukraine','UA','UKR','804','380',1,1),
 (217,'united-arab-emirates','AE','ARE','784','971',0,1),
 (218,'uruguay','UY','URY','858','598',1,1),
 (219,'uzbekistan','UZ','UZB','860','998',1,1),
 (220,'vanuatu','VU','VUT','548','678',0,1),
 (221,'vatican-city','VA','VAT','336','039',1,1),
 (222,'venezuela','VE','VEN','862','058',1,1),
 (223,'wallis-futuna','WF','WLF','876','681',1,1),
 (224,'western-samoa','WS','WSM','882','685',1,1),
 (225,'yemen','YE','YEM','887','967',0,1),
 (226,'zambia','ZM','ZMB','894','260',1,1),
 (227,'zimbabwe','ZW','ZWE','716','263',0,1),
 (228,'aland-islands','AX','ALA','248','359',1,1),
 (229,'bonaire-st-eustatius-saba','BQ','BES','535','599',1,1),
 (230,'bouvet-island','BV','BVT','74','047',1,1),
 (231,'british-indian-ocean-territory','IO','IOT','86','246',1,1),
 (232,'curacao','CW','CUW','531','599',1,1),
 (233,'french-southern-territories','TF','ATF','260','033',0,1),
 (234,'guernsey','GG','GGY','831','044',1,1),
 (235,'heard-island-mcdonald-islands','HM','HMD','334','061',1,1),
 (236,'isle-of-man','IM','IMN','833','044',1,1),
 (237,'jersey','JE','JEY','832','044',1,1),
 (238,'northern-mariana-islands','MP','MNP','580','670',1,1),
 (239,'pitcairn','PN','PCN','612','649',1,1),
 (240,'south-georgia-south-sandwich-islands','GS','SGS','239','044',1,1),
 (241,'south-sudan','SS','SSD','728','211',1,1),
 (242,'sint-maarten','SX','SXM','534','721',1,1),
 (243,'st-barthelemy','BL','BLM','652','590',1,1),
 (244,'st-martin','MF','MAF','663','590',1,1),
 (245,'tokelau','TK','TKL','772','690',0,1),
 (246,'timor-leste','TL','TLS','626','670',1,1),
 (247,'united-states-minor-outlying-islands','UM','UMI','581','699',1,1),
 (248,'united-states-virgin-islands','VI','VIR','850','340',1,1),
 (249,'western-sahara','EH','ESH','732','212',1,1);
/*!40000 ALTER TABLE `country` ENABLE KEYS */;


--
-- Definition of table `cyrususer`
--

DROP TABLE IF EXISTS `cyrususer`;
CREATE TABLE `cyrususer` (
  `userId` varchar(75) NOT NULL,
  `password_` varchar(75) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cyrususer`
--

/*!40000 ALTER TABLE `cyrususer` DISABLE KEYS */;
/*!40000 ALTER TABLE `cyrususer` ENABLE KEYS */;


--
-- Definition of table `cyrusvirtual`
--

DROP TABLE IF EXISTS `cyrusvirtual`;
CREATE TABLE `cyrusvirtual` (
  `emailAddress` varchar(75) NOT NULL,
  `userId` varchar(75) NOT NULL,
  PRIMARY KEY (`emailAddress`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cyrusvirtual`
--

/*!40000 ALTER TABLE `cyrusvirtual` DISABLE KEYS */;
/*!40000 ALTER TABLE `cyrusvirtual` ENABLE KEYS */;


--
-- Definition of table `ddlrecord`
--

DROP TABLE IF EXISTS `ddlrecord`;
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

--
-- Dumping data for table `ddlrecord`
--

/*!40000 ALTER TABLE `ddlrecord` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddlrecord` ENABLE KEYS */;


--
-- Definition of table `ddlrecordset`
--

DROP TABLE IF EXISTS `ddlrecordset`;
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

--
-- Dumping data for table `ddlrecordset`
--

/*!40000 ALTER TABLE `ddlrecordset` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddlrecordset` ENABLE KEYS */;


--
-- Definition of table `ddlrecordversion`
--

DROP TABLE IF EXISTS `ddlrecordversion`;
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

--
-- Dumping data for table `ddlrecordversion`
--

/*!40000 ALTER TABLE `ddlrecordversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `ddlrecordversion` ENABLE KEYS */;


--
-- Definition of table `ddmcontent`
--

DROP TABLE IF EXISTS `ddmcontent`;
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

--
-- Dumping data for table `ddmcontent`
--

/*!40000 ALTER TABLE `ddmcontent` DISABLE KEYS */;
INSERT INTO `ddmcontent` (`uuid_`,`contentId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`description`,`xml`) VALUES 
 ('79f4fb1d-c0a3-41b7-bc28-594a9e94f20a',22791,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/jpeg]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('dba56caf-c9af-498a-8b0b-5e2b09c73d4b',22800,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('99f4ba2e-df7c-4fb4-94ca-e9ac1daa5fc8',22805,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[481]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[445]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('96a6946e-fa88-49d3-b29f-47869a2ba231',22810,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[481]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[445]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('35077235-88e5-406b-9168-e5e6bce4266b',22816,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[481]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[445]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('51debb22-845a-4429-8970-8252c483316d',22824,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/jpeg]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('a962b09c-2728-4dfd-8edc-b995b9de29a7',22833,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('045ca378-a759-4ce2-8d16-ed1fbf4b8c4e',22852,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_RESOLUTION_UNIT\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[Inch]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/jpeg]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_RESOLUTION_VERTICAL\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[72.0]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_ORIENTATION\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[1]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_RESOLUTION_HORIZONTAL\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[72.0]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('60de9665-16ae-4dac-b92e-0993d4feb341',22859,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('17620a2b-0f72-4ca0-82e0-ded79beab7bf',22872,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[481]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[445]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('b2bfc489-406b-47e1-a114-be8a52aec428',22885,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('82daa435-b8c3-4635-bedd-f750efd1670f',22898,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[481]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[445]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('462591e0-ac1a-4967-a098-5f766740dc03',22911,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[481]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[445]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>'),
 ('6ecc216a-22e7-438b-bb24-cf13cad1c54c',22922,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14','com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink','','<?xml version=\"1.0\"?>\n\n<root>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_WIDTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[963]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"HttpHeaders_CONTENT_TYPE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[image/png]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_IMAGE_LENGTH\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[370]]></dynamic-content>\n	</dynamic-element>\n	<dynamic-element default-language-id=\"en_US\" name=\"TIFF_BITS_PER_SAMPLE\">\n		<dynamic-content language-id=\"es_ES\"><![CDATA[8 8 8 8]]></dynamic-content>\n	</dynamic-element>\n</root>');
/*!40000 ALTER TABLE `ddmcontent` ENABLE KEYS */;


--
-- Definition of table `ddmstoragelink`
--

DROP TABLE IF EXISTS `ddmstoragelink`;
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

--
-- Dumping data for table `ddmstoragelink`
--

/*!40000 ALTER TABLE `ddmstoragelink` DISABLE KEYS */;
INSERT INTO `ddmstoragelink` (`uuid_`,`storageLinkId`,`classNameId`,`classPK`,`structureId`) VALUES 
 ('d92879a1-c891-4682-baf0-8bb263f226d5',22792,20100,22791,20315),
 ('c5c2fc77-2158-4d2a-b00f-058398ac4e88',22801,20100,22800,20315),
 ('37306f79-9cd3-410c-92d3-62546d501093',22806,20100,22805,20315),
 ('6ed9294d-c5ee-4803-842d-01e431620ae4',22811,20100,22810,20315),
 ('17e06683-5185-4407-b353-0991f5096a49',22817,20100,22816,20315),
 ('de1efa48-2554-48c9-95a5-4930e48c6e8c',22825,20100,22824,20315),
 ('2aef3e54-cf67-4e83-b0b2-ba35d9926ca2',22834,20100,22833,20315),
 ('1dc469be-63e9-4a88-a776-75608de51f95',22853,20100,22852,20315),
 ('5d65b96e-0907-4843-85a1-a15d546ed30d',22860,20100,22859,20315),
 ('c7eda65a-cb3c-476e-adb5-d01bd5877fc8',22873,20100,22872,20315),
 ('50a448b6-3da6-48df-b7ce-76eb091aefd2',22886,20100,22885,20315),
 ('b3be954e-977c-4c1e-b234-a95834654c23',22899,20100,22898,20315),
 ('7f478474-759a-406f-896d-9539c81a4b21',22912,20100,22911,20315),
 ('0caedaf2-9594-4f77-bc21-689f145988f2',22923,20100,22922,20315);
/*!40000 ALTER TABLE `ddmstoragelink` ENABLE KEYS */;


--
-- Definition of table `ddmstructure`
--

DROP TABLE IF EXISTS `ddmstructure`;
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

--
-- Dumping data for table `ddmstructure`
--

/*!40000 ALTER TABLE `ddmstructure` DISABLE KEYS */;
INSERT INTO `ddmstructure` (`uuid_`,`structureId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`parentStructureId`,`classNameId`,`structureKey`,`name`,`description`,`xsd`,`storageType`,`type_`) VALUES 
 ('fa2d3234-e03e-4f42-9847-1f1fad609c73',20303,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'LEARNING MODULE METADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Learning Module Metadata</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Learning Module Metadata</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select2235\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"home_edition\" type=\"option\" value=\"HE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Home Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"business_edition\" type=\"option\" value=\"BE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Business Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"enterprise_edition\" type=\"option\" value=\"EE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Enterprise Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Product]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select3212\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"1_0\" type=\"option\" value=\"1\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[1.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"2_0\" type=\"option\" value=\"2\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[2.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"3_0\" type=\"option\" value=\"3\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[3.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Version]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select4115\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"administration\" type=\"option\" value=\"admin\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Administration]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"installation\" type=\"option\" value=\"install\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Installation]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"configuration\" type=\"option\" value=\"config\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Configuration]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Topics]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select5069\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"beginner\" type=\"option\" value=\"beginner\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Beginner]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"intermediate\" type=\"option\" value=\"intermediate\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Intermediate]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"advanced\" type=\"option\" value=\"advanced\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Advanced]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Level]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('63aa448a-5da1-4e3b-b31d-f258e6a0a771',20304,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'MARKETING CAMPAIGN THEME METADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Marketing Campaign Theme Metadata</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Marketing Campaign Theme Metadata</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select2305\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"strong_company\" type=\"option\" value=\"strong\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Strong Company]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"new_product_launch\" type=\"option\" value=\"product\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[New Product Launch]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"company_philosophy\" type=\"option\" value=\"philosophy\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Company Philosophy]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Select]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select3229\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"your_trusted_advisor\" type=\"option\" value=\"advisor\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Your Trusted Advisor]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"10_years_of_customer_solutions\" type=\"option\" value=\"solutions\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[10 Years of Customer Solutions]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"making_a_difference\" type=\"option\" value=\"difference\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Making a Difference]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Campaign Theme]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select4282\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"awareness\" type=\"option\" value=\"awareness\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Awareness]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"lead_generation\" type=\"option\" value=\"leads\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Lead Generation]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"customer_service\" type=\"option\" value=\"service\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Customer Service]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Business Goal]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('833c70aa-e403-42f2-81ef-592b823cff1b',20305,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'MEETING METADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Meeting Metadata</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Metadata for meeting</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" indexType=\"keyword\" name=\"ddm-date3054\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2217\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Meeting Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text4569\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Time]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text5638\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Location]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"text\" name=\"textarea6584\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"text\" name=\"textarea7502\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Participants]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('da394b93-88f5-4dec-bec0-2b906fd5382e',20307,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'AUTO_18977E2E-345B-4116-90A3-E5AB8FE54405','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Contract</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Contract</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" indexType=\"keyword\" name=\"ddm-date18949\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Effective Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" indexType=\"keyword\" name=\"ddm-date20127\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Expiration Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select10264\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"nda\" type=\"option\" value=\"NDA\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[NDA]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"msa\" type=\"option\" value=\"MSA\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[MSA]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"license_agreement\" type=\"option\" value=\"License\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[License Agreement]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Contract Type]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select4893\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"draft\" type=\"option\" value=\"Draft\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Draft]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"in_review\" type=\"option\" value=\"Review\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[In Review]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"suspended\" type=\"option\" value=\"Suspended\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Suspended]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"signed\" type=\"option\" value=\"Signed\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Signed]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Status]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text14822\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Legal Reviewer]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text17700\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Signing Authority]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2087\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Deal Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),
 ('ed81af55-4cfd-4530-ac78-44ca43acee82',20309,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'AUTO_A9A565B6-F9D0-41C5-BA9D-D0C7FAA5F2C1','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Marketing Banner</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Marketing Banner</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"radio5547\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"radio\">\n		<dynamic-element name=\"yes\" type=\"option\" value=\"yes\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Yes]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"no\" type=\"option\" value=\"no\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[No]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Needs Legal Review]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2033\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Banner Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"text\" name=\"textarea2873\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),
 ('9cde94dc-7077-40d4-a996-1ffba01e69f0',20311,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'AUTO_5D213E15-05AC-4B00-9E2C-143629B870DB','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Online Training</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Online Training</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2082\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Lesson Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text2979\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Author]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),
 ('f59a2523-5d33-4a28-b443-53eff3d1ca61',20313,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20091,'AUTO_63220BE8-4E9C-4BC0-9B0D-6B36B8CD588E','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Sales Presentation</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Sales Presentation</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"en_US\" default-locale=\"en_US\">\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select2890\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"home_edition\" type=\"option\" value=\"HE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Home Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"business_edition\" type=\"option\" value=\"BE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Business Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"enterprise_edition\" type=\"option\" value=\"EE\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Enterprise Edition]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Product]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"false\" name=\"select3864\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"1_0\" type=\"option\" value=\"1\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[1.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"2_0\" type=\"option\" value=\"2\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[2.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"3_0\" type=\"option\" value=\"3\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[3.0]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Version]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select4831\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"website\" type=\"option\" value=\"website\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Website]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"collaboration\" type=\"option\" value=\"collaboration\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Collaboration]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"intranet\" type=\"option\" value=\"intranet\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[Intranet]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Areas of Interest]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" multiple=\"true\" name=\"select5929\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"acme\" type=\"option\" value=\"acme\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[ACME]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"sevencogs\" type=\"option\" value=\"sevencogs\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[SevenCogs]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"freeplus\" type=\"option\" value=\"freeplus\">\n			<meta-data locale=\"en_US\">\n				<entry name=\"label\"><![CDATA[FreePlus]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Competitors]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" indexType=\"keyword\" name=\"text1993\" readOnly=\"false\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"en_US\">\n			<entry name=\"label\"><![CDATA[Prospect Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',1),
 ('41fa2340-614c-4a25-b473-15a0e3afc3d5',20315,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54',0,20314,'TIKARAWMETADATA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">TIKARAWMETADATA</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">TIKARAWMETADATA</Description></root>','<root available-locales=\"es_ES\" default-locale=\"es_ES\"><dynamic-element dataType=\"string\" name=\"ClimateForcast_PROGRAM_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.PROGRAM_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_COMMAND_LINE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.COMMAND_LINE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_HISTORY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.HISTORY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_TABLE_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.TABLE_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_INSTITUTION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.INSTITUTION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_SOURCE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.SOURCE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_CONTACT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.CONTACT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_PROJECT_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.PROJECT_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_CONVENTIONS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.CONVENTIONS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_REFERENCES\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.REFERENCES]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_ACKNOWLEDGEMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.ACKNOWLEDGEMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_REALIZATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.REALIZATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_EXPERIMENT_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.EXPERIMENT_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_COMMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.COMMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"ClimateForcast_MODEL_NAME_ENGLISH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.ClimateForcast.MODEL_NAME_ENGLISH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"CreativeCommons_LICENSE_URL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.CreativeCommons.LICENSE_URL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"CreativeCommons_LICENSE_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.CreativeCommons.LICENSE_LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"CreativeCommons_WORK_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.CreativeCommons.WORK_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_NAMESPACE_URI_DC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.NAMESPACE_URI_DC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_NAMESPACE_URI_DC_TERMS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.NAMESPACE_URI_DC_TERMS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_PREFIX_DC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.PREFIX_DC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_PREFIX_DC_TERMS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.PREFIX_DC_TERMS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_FORMAT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.FORMAT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_IDENTIFIER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.IDENTIFIER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_MODIFIED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.MODIFIED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_CONTRIBUTOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.CONTRIBUTOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_COVERAGE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.COVERAGE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_CREATOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.CREATOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_CREATED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.CREATED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_DESCRIPTION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.DESCRIPTION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_LANGUAGE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.LANGUAGE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_PUBLISHER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.PUBLISHER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_RELATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.RELATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_RIGHTS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.RIGHTS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_SOURCE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.SOURCE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_SUBJECT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.SUBJECT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_TITLE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.TITLE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"DublinCore_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.DublinCore.TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Geographic_LATITUDE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Geographic.LATITUDE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Geographic_LONGITUDE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Geographic.LONGITUDE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Geographic_ALTITUDE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Geographic.ALTITUDE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_ENCODING\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_ENCODING]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_LANGUAGE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_LANGUAGE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_LENGTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_LENGTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_DISPOSITION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_DISPOSITION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_MD5\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_MD5]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_CONTENT_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.CONTENT_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_LAST_MODIFIED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.LAST_MODIFIED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"HttpHeaders_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.HttpHeaders.LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_RECIPIENT_ADDRESS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_RECIPIENT_ADDRESS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_FROM\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_FROM]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_TO\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_TO]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_CC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_CC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"Message_MESSAGE_BCC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.Message.MESSAGE_BCC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_KEYWORDS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.KEYWORDS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_COMMENTS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.COMMENTS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LAST_AUTHOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LAST_AUTHOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_AUTHOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.AUTHOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_APPLICATION_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.APPLICATION_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_REVISION_NUMBER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.REVISION_NUMBER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_TEMPLATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.TEMPLATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_TOTAL_TIME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.TOTAL_TIME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_PRESENTATION_FORMAT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.PRESENTATION_FORMAT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_NOTES\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.NOTES]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_MANAGER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.MANAGER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_APPLICATION_VERSION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.APPLICATION_VERSION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_VERSION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.VERSION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CONTENT_STATUS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CONTENT_STATUS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CATEGORY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CATEGORY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_COMPANY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.COMPANY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_SECURITY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.SECURITY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_SLIDE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.SLIDE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_PAGE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.PAGE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_PARAGRAPH_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.PARAGRAPH_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LINE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LINE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_WORD_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.WORD_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CHARACTER_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CHARACTER_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CHARACTER_COUNT_WITH_SPACES\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CHARACTER_COUNT_WITH_SPACES]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_TABLE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.TABLE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_IMAGE_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.IMAGE_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_OBJECT_COUNT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.OBJECT_COUNT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_EDIT_TIME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.EDIT_TIME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_CREATION_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.CREATION_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LAST_SAVED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LAST_SAVED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_LAST_PRINTED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.LAST_PRINTED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"MSOffice_USER_DEFINED_METADATA_NAME_PREFIX\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.MSOffice.USER_DEFINED_METADATA_NAME_PREFIX]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_BITS_PER_SAMPLE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.BITS_PER_SAMPLE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_IMAGE_LENGTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.IMAGE_LENGTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_IMAGE_WIDTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.IMAGE_WIDTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_SAMPLES_PER_PIXEL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.SAMPLES_PER_PIXEL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_FLASH_FIRED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.FLASH_FIRED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_EXPOSURE_TIME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.EXPOSURE_TIME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_F_NUMBER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.F_NUMBER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_FOCAL_LENGTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.FOCAL_LENGTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_ISO_SPEED_RATINGS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.ISO_SPEED_RATINGS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_EQUIPMENT_MAKE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.EQUIPMENT_MAKE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_EQUIPMENT_MODEL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.EQUIPMENT_MODEL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_SOFTWARE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.SOFTWARE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_ORIENTATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.ORIENTATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_RESOLUTION_HORIZONTAL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.RESOLUTION_HORIZONTAL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_RESOLUTION_VERTICAL\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.RESOLUTION_VERTICAL]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_RESOLUTION_UNIT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.RESOLUTION_UNIT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TIFF_ORIGINAL_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TIFF.ORIGINAL_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMetadataKeys_RESOURCE_NAME_KEY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMetadataKeys.RESOURCE_NAME_KEY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMetadataKeys_PROTECTED\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMetadataKeys.PROTECTED]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMetadataKeys_EMBEDDED_RELATIONSHIP_ID\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMetadataKeys.EMBEDDED_RELATIONSHIP_ID]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMimeKeys_TIKA_MIME_FILE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMimeKeys.TIKA_MIME_FILE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"TikaMimeKeys_MIME_TYPE_MAGIC\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.TikaMimeKeys.MIME_TYPE_MAGIC]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_DURATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.DURATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ABS_PEAK_AUDIO_FILE_PATH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ABS_PEAK_AUDIO_FILE_PATH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ALBUM\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ALBUM]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ALT_TAPE_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ALT_TAPE_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ARTIST\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ARTIST]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_MOD_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_MOD_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_SAMPLE_RATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_SAMPLE_RATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_SAMPLE_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_SAMPLE_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_CHANNEL_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_CHANNEL_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_AUDIO_COMPRESSOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.AUDIO_COMPRESSOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_COMPOSER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.COMPOSER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_COPYRIGHT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.COPYRIGHT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_ENGINEER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.ENGINEER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_FILE_DATA_RATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.FILE_DATA_RATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_GENRE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.GENRE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_INSTRUMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.INSTRUMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_KEY\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.KEY]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_LOG_COMMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.LOG_COMMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_LOOP\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.LOOP]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_NUMBER_OF_BEATS\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.NUMBER_OF_BEATS]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_METADATA_MOD_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.METADATA_MOD_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_PULL_DOWN\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.PULL_DOWN]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_RELATIVE_PEAK_AUDIO_FILE_PATH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.RELATIVE_PEAK_AUDIO_FILE_PATH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_RELEASE_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.RELEASE_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SCALE_TYPE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SCALE_TYPE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SCENE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SCENE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SHOT_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SHOT_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SHOT_LOCATION\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SHOT_LOCATION]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SHOT_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SHOT_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_SPEAKER_PLACEMENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.SPEAKER_PLACEMENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_STRETCH_MODE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.STRETCH_MODE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TAPE_NAME\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TAPE_NAME]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TEMPO\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TEMPO]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TIME_SIGNATURE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TIME_SIGNATURE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_TRACK_NUMBER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.TRACK_NUMBER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_ALPHA_MODE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_ALPHA_MODE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_ALPHA_UNITY_IS_TRANSPARENT\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_ALPHA_UNITY_IS_TRANSPARENT]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_COLOR_SPACE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_COLOR_SPACE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_COMPRESSOR\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_COMPRESSOR]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_FIELD_ORDER\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_FIELD_ORDER]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_FRAME_RATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_FRAME_RATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_MOD_DATE\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_MOD_DATE]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_PIXEL_DEPTH\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_PIXEL_DEPTH]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element><dynamic-element dataType=\"string\" name=\"XMPDM_VIDEO_PIXEL_ASPECT_RATIO\" required=\"false\" showLabel=\"true\" type=\"text\"><meta-data locale=\"es_ES\"><entry name=\"label\"><![CDATA[metadata.XMPDM.VIDEO_PIXEL_ASPECT_RATIO]]></entry><entry name=\"predefinedValue\"><![CDATA[]]></entry></meta-data></dynamic-element></root>','xml',0),
 ('761eb2e4-4fe5-4d4b-9940-8efae302f978',23001,20182,20155,20159,'','2016-03-09 03:56:31','2016-03-09 03:56:31',0,20098,'CONTACTS','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Contacts</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Contacts</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"string\" name=\"company\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Company]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"email\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Email]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"firstName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[First Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"imService\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"aol\" type=\"option\" value=\"aol\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[AOL]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"yahoo\" type=\"option\" value=\"yahoo\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Yahoo]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"gtalk\" type=\"option\" value=\"gtalk\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[GTalk]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Instant Messenger Service]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"gtalk\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"imUserName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Instant Messenger]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"jobTitle\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Job Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"lastName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Last Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"notes\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Notes]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"phoneMobile\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Phone (Mobile)]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"phoneOffice\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Phone (Office)]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0);
INSERT INTO `ddmstructure` (`uuid_`,`structureId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`parentStructureId`,`classNameId`,`structureKey`,`name`,`description`,`xsd`,`storageType`,`type_`) VALUES 
 ('d3221c61-d45f-451f-8bee-68bc6a02c9b1',23002,20182,20155,20159,'','2016-03-09 03:56:32','2016-03-09 03:56:32',0,20098,'EVENTS','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Events</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Events</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"double\" fieldNamespace=\"ddm\" name=\"cost\" required=\"false\" showLabel=\"true\" type=\"ddm-number\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Cost]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"eventDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"eventName\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Event Name]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"eventTime\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Time]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"location\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Location]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('b7475596-6ce2-4caa-a04e-a45b3679dc2c',23003,20182,20155,20159,'','2016-03-09 03:56:32','2016-03-09 03:56:32',0,20098,'INVENTORY','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Inventory</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Inventory</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"item\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Item]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"location\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Location]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"purchaseDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Purchase Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"style\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"double\" fieldNamespace=\"ddm\" name=\"purchasePrice\" required=\"false\" showLabel=\"true\" type=\"ddm-number\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Purchase Price]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"double\" fieldNamespace=\"ddm\" name=\"quantity\" required=\"false\" showLabel=\"true\" type=\"ddm-number\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Quantity]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('7916f92c-4021-4f76-8381-89abe58bb2d9',23004,20182,20155,20159,'','2016-03-09 03:56:32','2016-03-09 03:56:32',0,20098,'ISSUES TRACKING','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Issues Tracking</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Issue Tracking</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"string\" name=\"assignedTo\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Assigned To]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"comments\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Comments]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"dueDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Due Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"issueId\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Issue ID]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"severity\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"critical\" type=\"option\" value=\"critical\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Critical]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"major\" type=\"option\" value=\"major\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Major]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"minor\" type=\"option\" value=\"minor\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Minor]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"trivial\" type=\"option\" value=\"trivial\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Trivial]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Severity]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"minor\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"status\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"open\" type=\"option\" value=\"open\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Open]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"pending\" type=\"option\" value=\"pending\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Pending]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"completed\" type=\"option\" value=\"completed\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Completed]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Status]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"open\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"title\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('c8321d71-7f91-4671-9121-3c6f0185980c',23005,20182,20155,20159,'','2016-03-09 03:56:32','2016-03-09 03:56:32',0,20098,'MEETING MINUTES','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Meeting Minutes</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Meeting Minutes</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"author\" required=\"false\" showLabel=\"true\" type=\"text\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Author]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"duration\" required=\"false\" showLabel=\"true\" type=\"text\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Meeting Duration]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"meetingDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Meeting Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"minutes\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Minutes]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"title\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0),
 ('21193668-9a1d-4cc4-b10d-a6f65d03ef9b',23006,20182,20155,20159,'','2016-03-09 03:56:32','2016-03-09 03:56:32',0,20098,'TO DO','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">To Do</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">To Do</Description></root>','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<dynamic-element dataType=\"string\" name=\"assignedTo\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Assigned To]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"document-library\" fieldNamespace=\"ddm\" name=\"attachment\" required=\"false\" showLabel=\"true\" type=\"ddm-documentlibrary\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Attachment]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n			<entry name=\"tip\"><![CDATA[Upload documents no larger than 3,000k.]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"comments\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Comments]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"description\" required=\"false\" showLabel=\"true\" type=\"textarea\" width=\"100\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Description]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"endDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[End Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"integer\" fieldNamespace=\"ddm\" name=\"percentComplete\" required=\"false\" showLabel=\"true\" type=\"ddm-integer\" width=\"25\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[% Complete]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[0]]></entry>\n			<entry name=\"tip\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"severity\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"critical\" type=\"option\" value=\"critical\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Critical]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"major\" type=\"option\" value=\"major\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Major]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"minor\" type=\"option\" value=\"minor\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Minor]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"trivial\" type=\"option\" value=\"trivial\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Trivial]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Severity]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"minor\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"date\" fieldNamespace=\"ddm\" name=\"startDate\" required=\"false\" showLabel=\"true\" type=\"ddm-date\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Start Date]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" multiple=\"false\" name=\"status\" required=\"false\" showLabel=\"true\" type=\"select\">\n		<dynamic-element name=\"open\" type=\"option\" value=\"open\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Open]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"pending\" type=\"option\" value=\"pending\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Pending]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<dynamic-element name=\"completed\" type=\"option\" value=\"completed\">\n			<meta-data locale=\"es_ES\">\n				<entry name=\"label\"><![CDATA[Completed]]></entry>\n			</meta-data>\n		</dynamic-element>\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Status]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[[\"open\"]]]></entry>\n		</meta-data>\n	</dynamic-element>\n	<dynamic-element dataType=\"string\" name=\"title\" required=\"false\" showLabel=\"true\" type=\"text\" width=\"50\">\n		<meta-data locale=\"es_ES\">\n			<entry name=\"label\"><![CDATA[Title]]></entry>\n			<entry name=\"predefinedValue\"><![CDATA[]]></entry>\n		</meta-data>\n	</dynamic-element>\n</root>','xml',0);
/*!40000 ALTER TABLE `ddmstructure` ENABLE KEYS */;


--
-- Definition of table `ddmstructurelink`
--

DROP TABLE IF EXISTS `ddmstructurelink`;
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

--
-- Dumping data for table `ddmstructurelink`
--

/*!40000 ALTER TABLE `ddmstructurelink` DISABLE KEYS */;
INSERT INTO `ddmstructurelink` (`structureLinkId`,`classNameId`,`classPK`,`structureId`) VALUES 
 (22793,20091,22781,20315),
 (22802,20091,22799,20315),
 (22807,20091,22804,20315),
 (22813,20091,22808,20315),
 (22818,20091,22815,20315),
 (22826,20091,22822,20315),
 (22835,20091,22832,20315),
 (22854,20091,22851,20315),
 (22861,20091,22858,20315),
 (22874,20091,22871,20315),
 (22887,20091,22884,20315),
 (22900,20091,22897,20315),
 (22913,20091,22910,20315),
 (22924,20091,22921,20315);
/*!40000 ALTER TABLE `ddmstructurelink` ENABLE KEYS */;


--
-- Definition of table `ddmtemplate`
--

DROP TABLE IF EXISTS `ddmtemplate`;
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

--
-- Dumping data for table `ddmtemplate`
--

/*!40000 ALTER TABLE `ddmtemplate` DISABLE KEYS */;
INSERT INTO `ddmtemplate` (`uuid_`,`templateId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`templateKey`,`name`,`description`,`type_`,`mode_`,`language`,`script`,`cacheable`,`smallImage`,`smallImageId`,`smallImageURL`) VALUES 
 ('35915564-604b-4abe-9d34-580fd36c183c',20418,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20016,0,'WIKI-SOCIAL-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Social</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays social bookmarks and ratings for wiki pages and their child pages.</Description></root>','display','','ftl','<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n\n<#assign wikiPageClassName = \"com.liferay.portlet.wiki.model.WikiPage\" />\n\n<#assign assetRenderer = assetEntry.getAssetRenderer() />\n\n<div class=\"taglib-header\">\n	<h1 class=\"header-title\">${entry.getTitle()}</h1>\n</div>\n\n<div style=\"float: right;\">\n	<@getEditIcon />\n\n	<@getPageDetailsIcon />\n\n	<@getPrintIcon />\n</div>\n\n<div class=\"wiki-body\">\n	<div class=\"wiki-info\">\n		<span class=\"stats\">${assetEntry.getViewCount()} <@liferay.language key=\"views\" /></span> |\n\n		<span class=\"date\"><@liferay.language key=\"last-modified\" /> ${dateUtil.getDate(entry.getModifiedDate(), \"dd MMM yyyy - HH:mm:ss\", locale)}</span>\n\n		<span class=\"author\"><@liferay.language key=\"by\" /> ${htmlUtil.escape(portalUtil.getUserName(entry.getUserId(), entry.getUserName()))}</span>\n	</div>\n\n	<div class=\"wiki-content\">\n		<@liferay_ui[\"social-bookmarks\"]\n			displayStyle=\"normal\"\n			target=\"_blank\"\n			title=entry.getTitle()\n			url=viewURL\n		/>\n\n		${formattedContent}\n	</div>\n\n	<div class=\"page-actions\">\n		<div class=\"article-actions\">\n			<@getAddChildPageIcon />\n\n			<@getAttatchmentsIcon />\n		</div>\n	</div>\n\n	 <br />\n\n	<@getRatings cssClass=\"page-ratings\" entry=entry />\n\n	<@getRelatedAssets />\n</div>\n\n<div class=\"page-categorization\">\n	<div class=\"page-categories\">\n		<#assign viewCategorizedPagesURL = renderResponse.createRenderURL() />\n\n		${viewCategorizedPagesURL.setParameter(\"struts_action\", \"/wiki/view_categorized_pages\")}\n		${viewCategorizedPagesURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n\n		<@liferay_ui[\"asset-categories-summary\"]\n			className=wikiPageClassName\n			classPK=entry.getResourcePrimKey()\n			portletURL=viewCategorizedPagesURL\n		/>\n	</div>\n\n	<div class=\"page-tags\">\n		<#assign viewTaggedPagesURL = renderResponse.createRenderURL() />\n\n		${viewTaggedPagesURL.setParameter(\"struts_action\", \"/wiki/view_tagged_pages\")}\n		${viewTaggedPagesURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n\n		<@liferay_ui[\"asset-tags-summary\"]\n			className=wikiPageClassName\n			classPK=entry.getResourcePrimKey()\n			portletURL=viewTaggedPagesURL\n		/>\n	</div>\n</div>\n\n<#assign childPages = entry.getChildPages() />\n\n<#if (childPages?has_content)>\n	<div class=\"child-pages\">\n		<h2><@liferay.language key=\"children-pages\" /></h2>\n\n		<table class=\"taglib-search-iterator\">\n			<tr class=\"portlet-section-header results-header\">\n				<th>\n					<@liferay.language key=\"page\" />\n				</th>\n				<th>\n					<@liferay.language key=\"last-modified\" />\n				</th>\n				<th>\n					<@liferay.language key=\"ratings\" />\n				</th>\n			</tr>\n\n			<#list childPages as childPage>\n				<tr class=\"results-row\">\n					<#assign viewPageURL = renderResponse.createRenderURL() />\n\n					${viewPageURL.setParameter(\"struts_action\", \"/wiki/view\")}\n\n					<#assign childNode = childPage.getNode() />\n\n					${viewPageURL.setParameter(\"nodeName\", childNode.getName())}\n					${viewPageURL.setParameter(\"title\", childPage.getTitle())}\n\n					<td>\n						<a href=\"${viewPageURL}\">${childPage.getTitle()}</a>\n					</td>\n					<td>\n						<a href=\"${viewPageURL}\">${dateUtil.getDate(childPage.getModifiedDate(),\"dd MMM yyyy - HH:mm:ss\", locale)} <@liferay.language key=\"by\" /> ${htmlUtil.escape(portalUtil.getUserName(childPage.getUserId(), childPage.getUserName()))}</a>\n					</td>\n					<td>\n						<@getRatings cssClass=\"child-ratings\" entry=childPage />\n					</td>\n				</tr>\n			</#list>\n		</table>\n	</div>\n</#if>\n\n<@getDiscussion />\n\n<#macro getAddChildPageIcon>\n	<#if assetRenderer.hasEditPermission(themeDisplay.getPermissionChecker())>\n		<#assign addPageURL = renderResponse.createRenderURL() />\n\n		${addPageURL.setParameter(\"struts_action\", \"/wiki/edit_page\")}\n		${addPageURL.setParameter(\"redirect\", currentURL)}\n		${addPageURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n		${addPageURL.setParameter(\"title\", \"\")}\n		${addPageURL.setParameter(\"editTitle\", \"1\")}\n		${addPageURL.setParameter(\"parentTitle\", entry.getTitle())}\n\n		<@liferay_ui[\"icon\"]\n			image=\"add_article\"\n			label=true\n			message=\"add-child-page\"\n			url=addPageURL?string\n		/>\n	</#if>\n</#macro>\n\n<#macro getAttatchmentsIcon>\n	<#assign viewPageAttachmentsURL = renderResponse.createRenderURL() />\n\n	${viewPageAttachmentsURL.setParameter(\"struts_action\", \"/wiki/view_page_attachments\") }\n\n	<@liferay_ui[\"icon\"]\n		image=\"clip\"\n		label=true\n		message=\'${entry.getAttachmentsFileEntriesCount() + languageUtil.get(locale, \"attachments\")}\'\n		url=viewPageAttachmentsURL?string\n	/>\n</#macro>\n\n<#macro getDiscussion>\n	<#if validator.isNotNull(assetRenderer.getDiscussionPath()) && (enableComments == \"true\")>\n		<br />\n\n		<#assign discussionURL = renderResponse.createActionURL() />\n\n		${discussionURL.setParameter(\"struts_action\", \"/wiki/\" + assetRenderer.getDiscussionPath())}\n\n		<@liferay_ui[\"discussion\"]\n			className=wikiPageClassName\n			classPK=entry.getResourcePrimKey()\n			formAction=discussionURL?string\n			formName=\"fm2\"\n			ratingsEnabled=enableCommentRatings == \"true\"\n			redirect=currentURL\n			subject=assetRenderer.getTitle(locale)\n			userId=assetRenderer.getUserId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getEditIcon>\n	<#if assetRenderer.hasEditPermission(themeDisplay.getPermissionChecker())>\n		<#assign editPageURL = renderResponse.createRenderURL() />\n\n		${editPageURL.setParameter(\"struts_action\", \"/wiki/edit_page\")}\n		${editPageURL.setParameter(\"redirect\", currentURL)}\n		${editPageURL.setParameter(\"nodeId\", entry.getNodeId()?string)}\n		${editPageURL.setParameter(\"title\", entry.getTitle())}\n\n		<@liferay_ui[\"icon\"]\n			image=\"edit\"\n			message=entry.getTitle()\n			url=editPageURL?string\n		/>\n	</#if>\n</#macro>\n\n<#macro getPageDetailsIcon>\n	<#assign viewPageDetailsURL = renderResponse.createRenderURL() />\n\n	${viewPageDetailsURL.setParameter(\"struts_action\", \"/wiki/view_page_details\")}\n	${viewPageDetailsURL.setParameter(\"redirect\", currentURL)}\n\n	<@liferay_ui[\"icon\"]\n		image=\"history\"\n		message=\"details\"\n		url=viewPageDetailsURL?string\n	/>\n</#macro>\n\n<#macro getPrintIcon>\n	<#assign printURL = renderResponse.createRenderURL() />\n\n	${printURL.setParameter(\"viewMode\", \"print\")}\n	${printURL.setWindowState(\"pop_up\")}\n\n	<#assign title = languageUtil.format(locale, \"print-x-x\", [\"hide-accessible\", htmlUtil.escape(assetRenderer.getTitle(locale))]) />\n	<#assign taglibPrintURL = \"javascript:Liferay.Util.openWindow({dialog: {width: 960}, id:\'\" + renderResponse.getNamespace() + \"printAsset\', title: \'\" + title + \"\', uri: \'\" + htmlUtil.escapeURL(printURL.toString()) + \"\'});\" />\n\n	<@liferay_ui[\"icon\"]\n		image=\"print\"\n		message=\"print\"\n		url=taglibPrintURL\n	/>\n</#macro>\n\n<#macro getRatings\n	cssClass\n	entry\n>\n	<#if enablePageRatings == \"true\">\n		<div class=\"${cssClass}\">\n			<@liferay_ui[\"ratings\"]\n				className=wikiPageClassName\n				classPK=entry.getResourcePrimKey()\n			/>\n		</div>\n	</#if>\n</#macro>\n\n<#macro getRelatedAssets>\n	<#if assetEntry?? && (enableRelatedAssets == \"true\")>\n		<@liferay_ui[\"asset-links\"]\n			assetEntryId=assetEntry.getEntryId()\n		/>\n	</#if>\n</#macro>',0,0,20419,''),
 ('fb99a453-d167-4a85-af63-896ee47347c5',20420,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20081,0,'ASSET-CATEGORIES-NAVIGATION-MULTI-COLUMN-LAYOUT-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Multi Column Layout</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays a column for each vocabulary. Each column includes the name of a vocabulary with the vocabulary\'s top level categories listed underneath.</Description></root>','display','','ftl','<#assign aui = taglibLiferayHash[\"/WEB-INF/tld/aui.tld\"] />\n\n<#if entries?has_content>\n	<@aui.layout>\n		<#list entries as entry>\n			<@aui.column columnWidth=25>\n				<div class=\"results-header\">\n					<h3>\n						${entry.getName()}\n					</h3>\n				</div>\n\n				<#assign categories = entry.getCategories()>\n\n				<@displayCategories categories=categories />\n			</@aui.column>\n		</#list>\n	</@aui.layout>\n</#if>\n\n<#macro displayCategories\n	categories\n>\n	<#if categories?has_content>\n		<ul class=\"categories\">\n			<#list categories as category>\n				<li>\n					<#assign categoryURL = renderResponse.createRenderURL()>\n\n					${categoryURL.setParameter(\"resetCur\", \"true\")}\n					${categoryURL.setParameter(\"categoryId\", category.getCategoryId()?string)}\n\n					<a href=\"${categoryURL}\">${category.getName()}</a>\n\n					<#if serviceLocator??>\n						<#assign assetCategoryService = serviceLocator.findService(\"com.liferay.portlet.asset.service.AssetCategoryService\")>\n\n						<#assign childCategories = assetCategoryService.getChildCategories(category.getCategoryId())>\n\n						<@displayCategories categories=childCategories />\n					</#if>\n				</li>\n			</#list>\n		</ul>\n	</#if>\n</#macro>',0,0,20421,''),
 ('7e39bcbc-d5fc-458c-9a30-c22c46e1c8e6',20423,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20422,0,'DOCUMENTLIBRARY-CAROUSEL-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Carousel</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays images in a carousel.</Description></root>','display','','ftl','<#assign aui = taglibLiferayHash[\"/WEB-INF/tld/aui.tld\"] />\n<#assign liferay_portlet = taglibLiferayHash[\"/WEB-INF/tld/liferay-portlet.tld\"] />\n\n<#if entries?has_content>\n	<style>\n		#<@liferay_portlet.namespace />carousel .carousel-item {\n			background-color: #000;\n			height: 250px;\n			overflow: hidden;\n			text-align: center;\n			width: 700px;\n		}\n\n		#<@liferay_portlet.namespace />carousel .carousel-item img {\n			max-height: 250px;\n			max-width: 700px;\n		}\n	</style>\n\n	<div id=\"<@liferay_portlet.namespace />carousel\">\n		<#assign imageMimeTypes = propsUtil.getArray(\"dl.file.entry.preview.image.mime.types\") />\n\n		<#list entries as entry>\n			<#if imageMimeTypes?seq_contains(entry.getMimeType()) >\n				<div class=\"carousel-item\">\n					<img src=\"${dlUtil.getPreviewURL(entry, entry.getFileVersion(), themeDisplay, \"\")}\" />\n				</div>\n			</#if>\n		</#list>\n	</div>\n\n	<@aui.script use=\"aui-carousel\">\n		new A.Carousel(\n			{\n				contentBox: \'#<@liferay_portlet.namespace />carousel\',\n				height: 250,\n				intervalTime: 2,\n				width: 700\n			}\n		).render();\n	</@aui.script>\n</#if>',0,0,20424,''),
 ('2a418c01-39a1-48b6-8120-558c5674dde6',20425,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20083,0,'ASSET-PUBLISHER-RICH-SUMMARY-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Rich Summary</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays abstracts, icons, related assets, and print/edit actions for assets. Optionally include asset bookmarks and ratings.</Description></root>','display','','ftl','<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n\n<#list entries as entry>\n	<#assign entry = entry />\n\n	<#assign assetRenderer = entry.getAssetRenderer() />\n\n	<#assign entryTitle = htmlUtil.escape(assetRenderer.getTitle(locale)) />\n\n	<#assign viewURL = assetPublisherHelper.getAssetViewURL(renderRequest, renderResponse, entry) />\n\n	<#if assetLinkBehavior != \"showFullContent\">\n		<#assign viewURL = assetPublisherHelperImpl.getAssetViewURL(renderRequest, renderResponse, entry, true) />\n	</#if>\n\n	<div class=\"asset-abstract\">\n		<div class=\"lfr-meta-actions asset-actions\">\n			<@getPrintIcon />\n\n			<@getFlagsIcon />\n\n			<@getEditIcon />\n		</div>\n\n		<h3 class=\"asset-title\">\n			<a href=\"${viewURL}\"><img alt=\"\" src=\"${assetRenderer.getIconPath(renderRequest)}\" />${entryTitle}</a>\n		</h3>\n\n		<@getMetadataField fieldName=\"tags\" />\n\n		<@getMetadataField fieldName=\"create-date\" />\n\n		<@getMetadataField fieldName=\"view-count\" />\n\n		<div class=\"asset-content\">\n			<@getSocialBookmarks />\n\n			<div class=\"asset-summary\">\n				<@getMetadataField fieldName=\"author\" />\n\n				${htmlUtil.escape(assetRenderer.getSummary(locale))}\n\n				<a href=\"${viewURL}\"><@liferay.language key=\"read-more\" /><span class=\"hide-accessible\"><@liferay.language key=\"about\" />${entryTitle}</span> &raquo;</a>\n			</div>\n\n			<@getRatings />\n\n			<@getRelatedAssets />\n\n			<@getDiscussion />\n		</div>\n	</div>\n\n</#list>\n\n<#macro getDiscussion>\n	<#if validator.isNotNull(assetRenderer.getDiscussionPath()) && (enableComments == \"true\")>\n		<br />\n\n		<#assign discussionURL = renderResponse.createActionURL() />\n\n		${discussionURL.setParameter(\"struts_action\", \"/asset_publisher/\" + assetRenderer.getDiscussionPath())}\n\n		<@liferay_ui[\"discussion\"]\n			className=entry.getClassName()\n			classPK=entry.getClassPK()\n			formAction=discussionURL?string\n			formName=\"fm\" + entry.getClassPK()\n			ratingsEnabled=enableCommentRatings == \"true\"\n			redirect=portalUtil.getCurrentURL(request)\n			userId=assetRenderer.getUserId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getEditIcon>\n	<#if assetRenderer.hasEditPermission(themeDisplay.getPermissionChecker())>\n		<#assign redirectURL = renderResponse.createRenderURL() />\n\n		${redirectURL.setParameter(\"struts_action\", \"/asset_publisher/add_asset_redirect\")}\n		${redirectURL.setWindowState(\"pop_up\")}\n\n		<#assign editPortletURL = assetRenderer.getURLEdit(renderRequest, renderResponse, windowStateFactory.getWindowState(\"pop_up\"), redirectURL)!\"\" />\n\n		<#if validator.isNotNull(editPortletURL)>\n			<#assign title = languageUtil.format(locale, \"edit-x\", entryTitle) />\n\n			<@liferay_ui[\"icon\"]\n				image=\"edit\"\n				message=title\n				url=\"javascript:Liferay.Util.openWindow({dialog: {width: 960}, id:\'\" + renderResponse.getNamespace() + \"editAsset\', title: \'\" + title + \"\', uri:\'\" + htmlUtil.escapeURL(editPortletURL.toString()) + \"\'});\"\n			/>\n		</#if>\n	</#if>\n</#macro>\n\n<#macro getFlagsIcon>\n	<#if enableFlags == \"true\">\n		<@liferay_ui[\"flags\"]\n			className=entry.getClassName()\n			classPK=entry.getClassPK()\n			contentTitle=entry.getTitle(locale)\n			label=false\n			reportedUserId=entry.getUserId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getMetadataField\n	fieldName\n>\n	<#if stringUtil.split(metadataFields)?seq_contains(fieldName)>\n		<span class=\"metadata-entry metadata-\"${fieldName}\">\n			<#assign dateFormat = \"dd MMM yyyy - HH:mm:ss\" />\n\n			<#if fieldName == \"author\">\n				<@liferay.language key=\"by\" /> ${portalUtil.getUserName(assetRenderer.getUserId(), assetRenderer.getUserName())}\n			<#elseif fieldName == \"categories\">\n				<@liferay_ui[\"asset-categories-summary\"]\n					className=entry.getClassName()\n					classPK=entry.getClassPK()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			<#elseif fieldName == \"create-date\">\n				${dateUtil.getDate(entry.getCreateDate(), dateFormat, locale)}\n			<#elseif fieldName == \"expiration-date\">\n				${dateUtil.getDate(entry.getExpirationDate(), dateFormat, locale)}\n			<#elseif fieldName == \"modified-date\">\n				${dateUtil.getDate(entry.getModifiedDate(), dateFormat, locale)}\n			<#elseif fieldName == \"priority\">\n				${entry.getPriority()}\n			<#elseif fieldName == \"publish-date\">\n				${dateUtil.getDate(entry.getPublishDate(), dateFormat, locale)}\n			<#elseif fieldName == \"tags\">\n				<@liferay_ui[\"asset-tags-summary\"]\n					className=entry.getClassName()\n					classPK=entry.getClassPK()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			<#elseif fieldName == \"view-count\">\n				<@liferay_ui[\"icon\"]\n					image=\"history\"\n				/>\n\n				${entry.getViewCount()} <@liferay.language key=\"views\" />\n			</#if>\n		</span>\n	</#if>\n</#macro>\n\n<#macro getPrintIcon>\n	<#if enablePrint == \"true\" >\n		<#assign printURL = renderResponse.createRenderURL() />\n\n		${printURL.setParameter(\"struts_action\", \"/asset_publisher/view_content\")}\n		${printURL.setParameter(\"assetEntryId\", entry.getEntryId()?string)}\n		${printURL.setParameter(\"viewMode\", \"print\")}\n		${printURL.setParameter(\"type\", entry.getAssetRendererFactory().getType())}\n\n		<#if (validator.isNotNull(assetRenderer.getUrlTitle()))>\n			<#if (assetRenderer.getGroupId() != themeDisplay.getScopeGroupId())>\n				${printURL.setParameter(\"groupId\", assetRenderer.getGroupId()?string)}\n			</#if>\n\n			${printURL.setParameter(\"urlTitle\", assetRenderer.getUrlTitle())}\n		</#if>\n\n		${printURL.setWindowState(\"pop_up\")}\n\n		<@liferay_ui[\"icon\"]\n			image=\"print\"\n			message=\"print\"\n			url=\"javascript:Liferay.Util.openWindow({id:\'\" + renderResponse.getNamespace() + \"printAsset\', title: \'\" + languageUtil.format(locale, \"print-x-x\", [\"hide-accessible\", entryTitle]) + \"\', uri: \'\" + htmlUtil.escapeURL(printURL.toString()) + \"\'});\"\n		/>\n	</#if>\n</#macro>\n\n<#macro getRatings>\n	<#if (enableRatings == \"true\")>\n		<div class=\"asset-ratings\">\n			<@liferay_ui[\"ratings\"]\n				className=entry.getClassName()\n				classPK=entry.getClassPK()\n			/>\n		</div>\n	</#if>\n</#macro>\n\n<#macro getRelatedAssets>\n	<#if enableRelatedAssets == \"true\">\n		<@liferay_ui[\"asset-links\"]\n			assetEntryId=entry.getEntryId()\n		/>\n	</#if>\n</#macro>\n\n<#macro getSocialBookmarks>\n	<#if enableSocialBookmarks == \"true\">\n		<@liferay_ui[\"social-bookmarks\"]\n			displayStyle=\"${socialBookmarksDisplayStyle}\"\n			target=\"_blank\"\n			title=entry.getTitle(locale)\n			url=viewURL\n		/>\n	</#if>\n</#macro>',0,0,20426,''),
 ('2a917e97-a265-4269-9809-7b57a6d46a9a',20427,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20034,0,'SITE-MAP-MULTI-COLUMN-LAYOUT-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Multi Column Layout</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays a column for each top level page. Each column includes the name of a top level page with the page\'s immediate children listed underneath.</Description></root>','display','','ftl','<#assign aui = taglibLiferayHash[\"/WEB-INF/tld/aui.tld\"] />\n\n<#if entries?has_content>\n	<@aui.layout>\n		<#list entries as entry>\n		    <@aui.column columnWidth=25>\n				<div class=\"results-header\">\n					<h3>\n						<#assign layoutURL = portalUtil.getLayoutURL(entry, themeDisplay)>\n\n						<a href=\"${layoutURL}\">${entry.getName(locale)}</a>\n					</h3>\n				</div>\n\n				<#assign pages = entry.getChildren()>\n\n				<@displayPages pages = pages />\n		    </@aui.column>\n		</#list>\n	</@aui.layout>\n</#if>\n\n<#macro displayPages\n	pages\n>\n	<#if pages?has_content>\n		<ul class=\"child-pages\">\n			<#list pages as page>\n				<li>\n					<#assign pageLayoutURL = portalUtil.getLayoutURL(page, themeDisplay)>\n\n					<a href=\"${pageLayoutURL}\">${page.getName(locale)}</a>\n\n					<#assign childPages = page.getChildren()>\n\n					<@displayPages pages = childPages />\n				</li>\n			</#list>\n		</ul>\n	</#if>\n</#macro>',0,0,20428,''),
 ('6d79de4e-30f4-4c2e-b6ee-cdc4bb31e54d',20429,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20085,0,'ASSET-TAGS-NAVIGATION-COLOR-BY-POPULARITY-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Color by Popularity</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays asset tags colored by popularity: red (high), yellow (medium), and green (low).</Description></root>','display','','ftl','<#if entries?has_content>\n	<ul class=\"tag-items tag-list\">\n		<#assign scopeGroupId = getterUtil.getLong(scopeGroupId, themeDisplay.getScopeGroupId()) />\n		<#assign classNameId = getterUtil.getLong(classNameId, 0) />\n\n		<#assign maxCount = 1 />\n		<#assign minCount = 1 />\n\n		<#list entries as entry>\n			<#assign maxCount = liferay.max(maxCount, entry.getAssetCount()) />\n			<#assign minCount = liferay.min(minCount, entry.getAssetCount()) />\n		</#list>\n\n		<#assign multiplier = 1 />\n\n		<#if maxCount != minCount>\n			<#assign multiplier = 3 / (maxCount - minCount) />\n		</#if>\n\n		<#list entries as entry>\n			<li class=\"taglib-asset-tags-summary\">\n				<#assign popularity = (maxCount - (maxCount - (entry.getAssetCount() - minCount))) * multiplier />\n\n				<#if popularity < 1>\n					<#assign color = \"green\" />\n				<#elseif (popularity >= 1) && (popularity < 2)>\n					<#assign color = \"orange\" />\n				<#else>\n					<#assign color = \"red\" />\n				</#if>\n\n				<#assign tagURL = renderResponse.createRenderURL() />\n\n				${tagURL.setParameter(\"resetCur\", \"true\")}\n				${tagURL.setParameter(\"tag\", entry.getName())}\n\n				<a class =\"tag\" style=\"color: ${color};\" href=\"${tagURL}\">\n					${entry.getName()}\n\n					<#if (showAssetCount == \"true\")>\n						<span class=\"tag-asset-count\">(${count})</span>\n					</#if>\n				</a>\n			</li>\n		</#list>\n	</ul>\n\n	<br style=\"clear: both;\" />\n</#if>',0,0,20430,''),
 ('97b22cef-1da4-4fdf-b6e6-8be9fb1ed52d',20431,20195,20155,20159,'','2016-03-06 15:58:05','2016-03-06 15:58:05',20007,0,'BLOGS-BASIC-FTL','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Basic</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Displays titles, authors, and abstracts compactly for blog entries.</Description></root>','display','','ftl','<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n\n<#list entries as entry>\n	<div class=\"entry\">\n		<#assign viewURL = renderResponse.createRenderURL() />\n\n		${viewURL.setParameter(\"struts_action\", \"/blogs/view_entry\")}\n		${viewURL.setParameter(\"redirect\", currentURL)}\n		${viewURL.setParameter(\"urlTitle\", entry.getUrlTitle())}\n\n		<div class=\"entry-content\">\n			<div class=\"entry-title\">\n				<h2><a href=\"${viewURL}\">${htmlUtil.escape(entry.getTitle())}</a></h2>\n			</div>\n		</div>\n\n		<div class=\"entry-body\">\n			<div class=\"entry-author\">\n				<@liferay.language key=\"written-by\" /> ${htmlUtil.escape(portalUtil.getUserName(entry.getUserId(), entry.getUserName()))}\n			</div>\n\n			<#assign summary = entry.getDescription() />\n\n			<#if (validator.isNull(summary))>\n				<#assign summary = entry.getContent() />\n			</#if>\n\n			${stringUtil.shorten(htmlUtil.stripHtml(summary), 100)}\n\n			<a href=\"${viewURL}\"><@liferay.language key=\"read-more\" /> <span class=\"hide-accessible\"><@liferay.language key=\"about\"/>${htmlUtil.escape(entry.getTitle())}</span> &raquo;</a>\n		</div>\n\n		<div class=\"entry-footer\">\n			<span class=\"entry-date\">\n				${dateUtil.getDate(entry.getCreateDate(), \"dd MMM yyyy - HH:mm:ss\", locale)}\n			</span>\n\n			<#assign blogsEntryClassName = \"com.liferay.portlet.blogs.model.BlogsEntry\" />\n\n			<#if (enableFlags == \"true\")>\n				<@liferay_ui[\"flags\"]\n					className=blogsEntryClassName\n					classPK=entry.getEntryId()\n					contentTitle=entry.getTitle()\n					reportedUserId=entry.getUserId()\n				/>\n			</#if>\n\n			<span class=\"entry-categories\">\n				<@liferay_ui[\"asset-categories-summary\"]\n					className=blogsEntryClassName\n					classPK=entry.getEntryId()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			</span>\n\n			<span class=\"entry-tags\">\n				<@liferay_ui[\"asset-tags-summary\"]\n					className=blogsEntryClassName\n					classPK=entry.getEntryId()\n					portletURL=renderResponse.createRenderURL()\n				/>\n			</span>\n		</div>\n	</div>\n\n	<div class=\"separator\"><!-- --></div>\n</#list>',0,0,20432,'');
/*!40000 ALTER TABLE `ddmtemplate` ENABLE KEYS */;


--
-- Definition of table `dlcontent`
--

DROP TABLE IF EXISTS `dlcontent`;
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

--
-- Dumping data for table `dlcontent`
--

/*!40000 ALTER TABLE `dlcontent` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlcontent` ENABLE KEYS */;


--
-- Definition of table `dlfileentry`
--

DROP TABLE IF EXISTS `dlfileentry`;
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

--
-- Dumping data for table `dlfileentry`
--

/*!40000 ALTER TABLE `dlfileentry` DISABLE KEYS */;
INSERT INTO `dlfileentry` (`uuid_`,`fileEntryId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`repositoryId`,`folderId`,`treePath`,`name`,`extension`,`mimeType`,`title`,`description`,`extraSettings`,`fileEntryTypeId`,`version`,`size_`,`readCount`,`smallImageId`,`largeImageId`,`custom1ImageId`,`custom2ImageId`,`manualCheckInRequired`) VALUES 
 ('eceb8056-b756-4207-9d71-5b4de3bf6dd1',22743,20182,20155,20159,'','2016-03-09 03:54:11','2016-03-09 03:54:11',0,0,20182,0,'/0/','501','jpg','image/jpeg','roverRace','','',0,'1.0',65161,0,0,0,0,0,0),
 ('39680b15-933c-4210-85d4-f37a8d260532',22751,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',0,0,20182,0,'/0/','502','png','image/png','LunarSpelunkingBanner','','',0,'1.0',547089,0,0,0,0,0,0),
 ('b1ef4738-26ed-4839-973e-cb01545dc388',22761,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',0,0,20182,0,'/0/','503','png','image/png','entertainment','','',0,'1.0',398844,0,0,0,0,0,0),
 ('00aa1f14-0e11-4787-92f3-487020afe4dc',22769,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',0,0,20182,0,'/0/','504','png','image/png','food','','',0,'1.0',344900,0,0,0,0,0,0),
 ('9965eb71-e74d-4e97-94ff-7854ffabc72c',22779,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',0,0,20182,0,'/0/','505','png','image/png','LunarSpelunking','','',0,'1.0',360654,0,0,0,0,0,0),
 ('916fca0f-2af9-4ba1-811a-a18c61ee7ef8',22789,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',0,0,20182,0,'/0/','506','jpg','image/jpeg','lunar-golf-banner-2','','',0,'1.0',48278,0,0,0,0,0,0),
 ('0f0633d9-04de-46ec-9ca8-b97203b92534',22812,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',0,0,20182,0,'/0/','507','png','image/png','earthrise','','',0,'1.0',256005,0,0,0,0,0,0),
 ('eace49ae-27ab-40a0-8ac9-43bac536ed42',22830,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',0,0,20182,0,'/0/','508','jpg','image/jpeg','fine-dining','','',0,'1.0',78264,0,0,0,0,0,0),
 ('21c46a07-d24f-4107-a952-001cd7ce5c1c',22843,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',0,0,20182,0,'/0/','509','png','image/png','roverRacingFam','','',0,'1.0',560704,0,0,0,0,0,0),
 ('64a83da1-199b-43f6-9399-bc81bcd92fdf',22855,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',0,0,20182,0,'/0/','510','png','image/png','LunarGolfLink','','',0,'1.0',161266,0,0,0,0,0,0),
 ('d675b399-32ae-45cb-838a-9b20490f9af1',22869,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',0,0,20182,0,'/0/','511','png','image/png','Accomodations','','',0,'1.0',711879,0,0,0,0,0,0),
 ('1d9a0d4f-a7c1-4ec4-9b13-b90ab5d849f7',22881,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',0,0,20182,0,'/0/','512','png','image/png','room','','',0,'1.0',351446,0,0,0,0,0,0),
 ('4f2db479-2562-4e8b-b313-c721cf1646ad',22895,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',0,0,20182,0,'/0/','513','png','image/png','RoverRaceLink','','',0,'1.0',186411,0,0,0,0,0,0),
 ('d8fdea23-1376-48f4-88b6-c95c614dd290',22908,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',0,0,20182,0,'/0/','514','png','image/png','lunarGolfPromo','','',0,'1.0',791995,0,0,0,0,0,0);
/*!40000 ALTER TABLE `dlfileentry` ENABLE KEYS */;


--
-- Definition of table `dlfileentrymetadata`
--

DROP TABLE IF EXISTS `dlfileentrymetadata`;
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

--
-- Dumping data for table `dlfileentrymetadata`
--

/*!40000 ALTER TABLE `dlfileentrymetadata` DISABLE KEYS */;
INSERT INTO `dlfileentrymetadata` (`uuid_`,`fileEntryMetadataId`,`DDMStorageId`,`DDMStructureId`,`fileEntryTypeId`,`fileEntryId`,`fileVersionId`) VALUES 
 ('fc5c545d-9f0c-4391-8cbe-6d6a604b1c0b',22781,22791,20315,0,22743,22744),
 ('7184e510-5599-48ad-a1b4-794dd0b2d124',22799,22800,20315,0,22751,22752),
 ('62f98a68-b9e2-49b9-9947-68582cb53140',22804,22805,20315,0,22761,22762),
 ('90768d06-77c5-403f-9ab7-651661035264',22808,22810,20315,0,22769,22771),
 ('d5d874cc-82ad-4e17-ab62-4f3221105eaa',22815,22816,20315,0,22779,22780),
 ('052a075b-5e06-4449-a816-d7dfa18ee224',22822,22824,20315,0,22789,22790),
 ('4cb73408-a0e4-43d8-bec4-5e0be022d64e',22832,22833,20315,0,22812,22814),
 ('38b40d58-be77-4df0-88e9-b86dc308562b',22851,22852,20315,0,22830,22831),
 ('4b387d02-86b0-4e28-96af-1a83bf811301',22858,22859,20315,0,22843,22844),
 ('29542dbc-7b41-4efa-b84c-3a53dc5ae2ce',22871,22872,20315,0,22855,22856),
 ('94e06b6f-aa9a-4a15-9693-effe21ab6a5e',22884,22885,20315,0,22869,22870),
 ('37830f69-7a26-4c80-a07b-295f05f11d70',22897,22898,20315,0,22881,22882),
 ('a2cac5c3-4d9f-44fb-8216-2daddf1bdfaf',22910,22911,20315,0,22895,22896),
 ('0b87b319-9852-40da-bbfc-38d753df14c3',22921,22922,20315,0,22908,22909);
/*!40000 ALTER TABLE `dlfileentrymetadata` ENABLE KEYS */;


--
-- Definition of table `dlfileentrytype`
--

DROP TABLE IF EXISTS `dlfileentrytype`;
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

--
-- Dumping data for table `dlfileentrytype`
--

/*!40000 ALTER TABLE `dlfileentrytype` DISABLE KEYS */;
INSERT INTO `dlfileentrytype` (`uuid_`,`fileEntryTypeId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`fileEntryTypeKey`,`name`,`description`) VALUES 
 ('eeed69db-4d79-4b74-bf74-41bbd72ab778',0,0,0,0,'','2016-03-06 15:57:07','2016-03-06 15:57:07','BASIC-DOCUMENT','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">basic-document</Name></root>',''),
 ('18977e2e-345b-4116-90a3-e5ab8fe54405',20306,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54','CONTRACT','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Contract</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Contract</Description></root>'),
 ('a9a565b6-f9d0-41c5-ba9d-d0c7faa5f2c1',20308,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54','MARKETING BANNER','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Marketing Banner</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Marketing Banner</Description></root>'),
 ('5d213e15-05ac-4b00-9e2c-143629b870db',20310,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54','ONLINE TRAINING','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Online Training</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Online Training</Description></root>'),
 ('63220be8-4e9c-4bc0-9b0d-6b36b8cd588e',20312,20195,20155,20159,'','2016-03-06 15:57:54','2016-03-06 15:57:54','SALES PRESENTATION','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Sales Presentation</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Sales Presentation</Description></root>');
/*!40000 ALTER TABLE `dlfileentrytype` ENABLE KEYS */;


--
-- Definition of table `dlfileentrytypes_ddmstructures`
--

DROP TABLE IF EXISTS `dlfileentrytypes_ddmstructures`;
CREATE TABLE `dlfileentrytypes_ddmstructures` (
  `structureId` bigint(20) NOT NULL,
  `fileEntryTypeId` bigint(20) NOT NULL,
  PRIMARY KEY (`structureId`,`fileEntryTypeId`),
  KEY `IX_8373EC7C` (`fileEntryTypeId`),
  KEY `IX_F147CF3F` (`structureId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dlfileentrytypes_ddmstructures`
--

/*!40000 ALTER TABLE `dlfileentrytypes_ddmstructures` DISABLE KEYS */;
INSERT INTO `dlfileentrytypes_ddmstructures` (`structureId`,`fileEntryTypeId`) VALUES 
 (20307,20306),
 (20304,20308),
 (20309,20308),
 (20303,20310),
 (20311,20310),
 (20305,20312),
 (20313,20312);
/*!40000 ALTER TABLE `dlfileentrytypes_ddmstructures` ENABLE KEYS */;


--
-- Definition of table `dlfileentrytypes_dlfolders`
--

DROP TABLE IF EXISTS `dlfileentrytypes_dlfolders`;
CREATE TABLE `dlfileentrytypes_dlfolders` (
  `fileEntryTypeId` bigint(20) NOT NULL,
  `folderId` bigint(20) NOT NULL,
  PRIMARY KEY (`fileEntryTypeId`,`folderId`),
  KEY `IX_5BB6AD6C` (`fileEntryTypeId`),
  KEY `IX_6E00A2EC` (`folderId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dlfileentrytypes_dlfolders`
--

/*!40000 ALTER TABLE `dlfileentrytypes_dlfolders` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileentrytypes_dlfolders` ENABLE KEYS */;


--
-- Definition of table `dlfilerank`
--

DROP TABLE IF EXISTS `dlfilerank`;
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

--
-- Dumping data for table `dlfilerank`
--

/*!40000 ALTER TABLE `dlfilerank` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfilerank` ENABLE KEYS */;


--
-- Definition of table `dlfileshortcut`
--

DROP TABLE IF EXISTS `dlfileshortcut`;
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

--
-- Dumping data for table `dlfileshortcut`
--

/*!40000 ALTER TABLE `dlfileshortcut` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlfileshortcut` ENABLE KEYS */;


--
-- Definition of table `dlfileversion`
--

DROP TABLE IF EXISTS `dlfileversion`;
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

--
-- Dumping data for table `dlfileversion`
--

/*!40000 ALTER TABLE `dlfileversion` DISABLE KEYS */;
INSERT INTO `dlfileversion` (`uuid_`,`fileVersionId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`repositoryId`,`folderId`,`fileEntryId`,`treePath`,`extension`,`mimeType`,`title`,`description`,`changeLog`,`extraSettings`,`fileEntryTypeId`,`version`,`size_`,`checksum`,`status`,`statusByUserId`,`statusByUserName`,`statusDate`) VALUES 
 ('b2d5fe68-f55c-4336-b8a8-aec28f165794',22744,20182,20155,20159,'','2016-03-09 03:54:11','2016-03-09 03:54:11',20182,0,22743,'/0/','jpg','image/jpeg','roverRace','','','',0,'1.0',65161,'',0,20159,'','2016-03-09 03:54:12'),
 ('d7457764-f012-4c51-a98e-dcee6967078b',22752,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20182,0,22751,'/0/','png','image/png','LunarSpelunkingBanner','','','',0,'1.0',547089,'',0,20159,'','2016-03-09 03:54:12'),
 ('356103ef-b1b2-4e85-aec6-d2e41009a45e',22762,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20182,0,22761,'/0/','png','image/png','entertainment','','','',0,'1.0',398844,'',0,20159,'','2016-03-09 03:54:12'),
 ('d9e8320f-590d-4c95-a307-f14985fb2a4e',22771,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20182,0,22769,'/0/','png','image/png','food','','','',0,'1.0',344900,'',0,20159,'','2016-03-09 03:54:12'),
 ('c657c344-6134-4f6b-b59b-614f1be9f995',22780,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20182,0,22779,'/0/','png','image/png','LunarSpelunking','','','',0,'1.0',360654,'',0,20159,'','2016-03-09 03:54:13'),
 ('9ae87354-0341-47a8-bd8a-7ea19e65590f',22790,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20182,0,22789,'/0/','jpg','image/jpeg','lunar-golf-banner-2','','','',0,'1.0',48278,'',0,20159,'','2016-03-09 03:54:13'),
 ('f2e5077b-63a0-4482-98ed-f624e3042467',22814,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20182,0,22812,'/0/','png','image/png','earthrise','','','',0,'1.0',256005,'',0,20159,'','2016-03-09 03:54:13'),
 ('4265f206-fc64-4259-bcc4-3facf1a4e619',22831,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20182,0,22830,'/0/','jpg','image/jpeg','fine-dining','','','',0,'1.0',78264,'',0,20159,'','2016-03-09 03:54:13'),
 ('cd2cd0a5-af98-4e04-9be2-b31ad7d76a3f',22844,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20182,0,22843,'/0/','png','image/png','roverRacingFam','','','',0,'1.0',560704,'',0,20159,'','2016-03-09 03:54:13'),
 ('9cbf28e3-43b4-4741-a12c-6948c4ef143c',22856,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20182,0,22855,'/0/','png','image/png','LunarGolfLink','','','',0,'1.0',161266,'',0,20159,'','2016-03-09 03:54:14'),
 ('ccf6dbdd-360e-46ef-8912-dd2b66c68359',22870,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20182,0,22869,'/0/','png','image/png','Accomodations','','','',0,'1.0',711879,'',0,20159,'','2016-03-09 03:54:14'),
 ('ac127e0d-d34b-40cb-96a3-97420bd6d239',22882,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20182,0,22881,'/0/','png','image/png','room','','','',0,'1.0',351446,'',0,20159,'','2016-03-09 03:54:14'),
 ('b0e84b57-8136-4eb2-b1ea-398bf37fb353',22896,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20182,0,22895,'/0/','png','image/png','RoverRaceLink','','','',0,'1.0',186411,'',0,20159,'','2016-03-09 03:54:14'),
 ('c5cf176d-8ff5-451d-8b65-0c0f2f627767',22909,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20182,0,22908,'/0/','png','image/png','lunarGolfPromo','','','',0,'1.0',791995,'',0,20159,'','2016-03-09 03:54:14');
/*!40000 ALTER TABLE `dlfileversion` ENABLE KEYS */;


--
-- Definition of table `dlfolder`
--

DROP TABLE IF EXISTS `dlfolder`;
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

--
-- Dumping data for table `dlfolder`
--

/*!40000 ALTER TABLE `dlfolder` DISABLE KEYS */;
INSERT INTO `dlfolder` (`uuid_`,`folderId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`repositoryId`,`mountPoint`,`parentFolderId`,`treePath`,`name`,`description`,`lastPostDate`,`defaultFileEntryTypeId`,`hidden_`,`overrideFileEntryTypes`,`status`,`statusByUserId`,`statusByUserName`,`statusDate`) VALUES 
 ('228dc0f8-af1e-4c62-819c-8bb6860f88b7',23088,20182,20155,20199,'Test Test','2016-03-09 04:17:18','2016-03-09 04:17:18',20182,0,0,'/23088/','OpenSocial Gadgets','','2016-03-09 04:17:18',0,0,0,0,0,'',NULL);
/*!40000 ALTER TABLE `dlfolder` ENABLE KEYS */;


--
-- Definition of table `dlsyncevent`
--

DROP TABLE IF EXISTS `dlsyncevent`;
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

--
-- Dumping data for table `dlsyncevent`
--

/*!40000 ALTER TABLE `dlsyncevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `dlsyncevent` ENABLE KEYS */;


--
-- Definition of table `emailaddress`
--

DROP TABLE IF EXISTS `emailaddress`;
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

--
-- Dumping data for table `emailaddress`
--

/*!40000 ALTER TABLE `emailaddress` DISABLE KEYS */;
/*!40000 ALTER TABLE `emailaddress` ENABLE KEYS */;


--
-- Definition of table `expandocolumn`
--

DROP TABLE IF EXISTS `expandocolumn`;
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

--
-- Dumping data for table `expandocolumn`
--

/*!40000 ALTER TABLE `expandocolumn` DISABLE KEYS */;
INSERT INTO `expandocolumn` (`columnId`,`companyId`,`tableId`,`name`,`type_`,`defaultData`,`typeSettings`) VALUES 
 (20442,20155,20441,'clientId',15,'',''),
 (23878,20155,23877,'DNI',7,'',''),
 (24402,23880,24401,'clientId',15,'','');
/*!40000 ALTER TABLE `expandocolumn` ENABLE KEYS */;


--
-- Definition of table `expandorow`
--

DROP TABLE IF EXISTS `expandorow`;
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

--
-- Dumping data for table `expandorow`
--

/*!40000 ALTER TABLE `expandorow` DISABLE KEYS */;
INSERT INTO `expandorow` (`rowId_`,`companyId`,`modifiedDate`,`tableId`,`classPK`) VALUES 
 (24222,20155,'2016-04-01 04:36:09',23877,24213);
/*!40000 ALTER TABLE `expandorow` ENABLE KEYS */;


--
-- Definition of table `expandotable`
--

DROP TABLE IF EXISTS `expandotable`;
CREATE TABLE `expandotable` (
  `tableId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`tableId`),
  UNIQUE KEY `IX_37562284` (`companyId`,`classNameId`,`name`),
  KEY `IX_B5AE8A85` (`companyId`,`classNameId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expandotable`
--

/*!40000 ALTER TABLE `expandotable` DISABLE KEYS */;
INSERT INTO `expandotable` (`tableId`,`companyId`,`classNameId`,`name`) VALUES 
 (24532,20155,20002,'CUSTOM_FIELDS'),
 (20509,20155,20002,'OPEN_SOCIAL_DATA_'),
 (23877,20155,20005,'CUSTOM_FIELDS'),
 (20441,20155,20005,'MP'),
 (20510,20155,20005,'OPEN_SOCIAL_DATA_'),
 (24533,20155,20031,'CUSTOM_FIELDS'),
 (23046,20155,20088,'CUSTOM_FIELDS'),
 (24403,23880,20002,'OPEN_SOCIAL_DATA_'),
 (24401,23880,20005,'MP'),
 (24404,23880,20005,'OPEN_SOCIAL_DATA_');
/*!40000 ALTER TABLE `expandotable` ENABLE KEYS */;


--
-- Definition of table `expandovalue`
--

DROP TABLE IF EXISTS `expandovalue`;
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

--
-- Dumping data for table `expandovalue`
--

/*!40000 ALTER TABLE `expandovalue` DISABLE KEYS */;
INSERT INTO `expandovalue` (`valueId`,`companyId`,`tableId`,`columnId`,`rowId_`,`classNameId`,`classPK`,`data_`) VALUES 
 (24223,20155,23877,23878,24222,20005,24213,'0.0');
/*!40000 ALTER TABLE `expandovalue` ENABLE KEYS */;


--
-- Definition of table `group_`
--

DROP TABLE IF EXISTS `group_`;
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

--
-- Dumping data for table `group_`
--

/*!40000 ALTER TABLE `group_` DISABLE KEYS */;
INSERT INTO `group_` (`uuid_`,`groupId`,`companyId`,`creatorUserId`,`classNameId`,`classPK`,`parentGroupId`,`liveGroupId`,`treePath`,`name`,`description`,`type_`,`typeSettings`,`manualMembership`,`membershipRestriction`,`friendlyURL`,`site`,`remoteStagingGroupCount`,`active_`) VALUES 
 ('5d65bbde-29e1-488a-9e52-462831379aa4',20173,20155,20159,20001,20173,0,0,'/20173/','Control Panel','',3,'',1,0,'/control_panel',0,0,1),
 ('1c16f8b4-7172-4505-8619-27d2f96370a1',20182,20155,20159,20001,20182,0,0,'/20182/','Guest','',1,'mergeGuestPublicPages=false\n',1,0,'/guest',1,0,1),
 ('b4229362-8313-439a-a3f3-a3d98951a4d4',20192,20155,20159,20191,20159,0,0,'/20192/','User Personal Site','',3,'',1,0,'/personal_site',0,0,1),
 ('6bf4f1a1-0a83-45df-b7bf-33002ea795a6',20195,20155,20159,20025,20155,0,0,'/20195/','20155','',0,'',1,0,'/global',1,0,1),
 ('74062199-8461-45a6-8077-b835f4c19f4d',20201,20155,20199,20005,20199,0,0,'/20201/','20199','',0,'',1,0,'/test',0,0,1),
 ('a1eb127a-50d9-490f-a145-3c198de672b0',20317,20155,20159,20032,20316,0,0,'/20317/','20316','',0,'',1,0,'/template-20316',0,0,1),
 ('b68f423b-14cb-40c4-bffd-689131c59f53',20329,20155,20159,20032,20328,0,0,'/20329/','20328','',0,'',1,0,'/template-20328',0,0,1),
 ('1a0a2b7e-260f-4a47-aec2-9fe5a18c2326',20339,20155,20159,20032,20338,0,0,'/20339/','20338','',0,'',1,0,'/template-20338',0,0,1),
 ('f144d9c0-f93c-45f3-b578-3901298ab84e',20350,20155,20159,20036,20349,0,0,'/20350/','20349','',0,'',1,0,'/template-20349',0,0,1),
 ('43b94848-9b51-4c0a-9ad9-56406cf56b41',20376,20155,20159,20036,20375,0,0,'/20376/','20375','',0,'',1,0,'/template-20375',0,0,1),
 ('3da1f720-609d-4db6-8fe1-56e0e23e99ce',20812,20155,20159,20036,20811,0,0,'/20812/','20811','',0,'',1,0,'/template-20811',0,0,1),
 ('c79fcbaf-29ee-4f20-b6df-9bcc1be704ea',21212,20155,20159,20036,21211,0,0,'/21212/','21211','',0,'',1,0,'/template-21211',0,0,1),
 ('395ed244-94d1-46c7-b8cb-5918ef53ebc3',23105,20155,23103,20005,23103,0,0,'/23105/','23103','',0,'',1,0,'/danielle',0,0,1),
 ('4aa63290-7d44-4d8e-b2fa-99a0583721ac',23114,20155,23112,20005,23112,0,0,'/23114/','23112','',0,'',1,0,'/usuario01',0,0,1),
 ('f127f8f5-5a54-4eeb-897a-33a4e1af358a',23816,20155,20159,20036,23815,0,0,'/23816/','23815','',0,'',1,0,'/template-23815',0,0,1),
 ('b03d4a34-7fdc-4dcd-aa44-bf7b54f26e9b',23837,20155,20199,20006,23836,0,0,'/23837/','23836','',0,'',1,0,'/23836',0,0,1),
 ('f0a6b905-d90b-41a3-bd8f-262f66eae7bb',23841,20155,20199,20006,23840,0,0,'/23841/','23840','',0,'',1,0,'/23840',0,0,1),
 ('7c87e231-cbc2-4b41-a2db-fe6369884047',23845,20155,20199,20006,23844,0,0,'/23845/','23844','',0,'',1,0,'/23844',0,0,1),
 ('08f9a3f9-b31d-4cec-aa53-fff71ddc296d',23849,20155,20199,20006,23848,0,0,'/23849/','23848','',0,'',1,0,'/23848',0,0,1),
 ('4621da77-3e6f-4118-8ea1-ed644b6a432d',23853,20155,20199,20006,23852,0,0,'/23853/','23852','',0,'',1,0,'/23852',0,0,1),
 ('735ed07c-35dc-41ab-ad5b-54ff52a39416',23857,20155,20199,20006,23856,0,0,'/23857/','23856','',0,'',1,0,'/23856',0,0,1),
 ('a3f73567-63d5-41bc-b753-2dad9d72d92d',23861,20155,20199,20006,23860,0,0,'/23861/','23860','',0,'',1,0,'/23860',0,0,1),
 ('c10dd623-6942-41f1-a4a5-70364923f19e',23865,20155,20199,20006,23864,0,0,'/23865/','23864','',0,'',1,0,'/23864',0,0,1),
 ('7afa7159-17e7-4697-a656-2afe2cb09dd9',23869,20155,20199,20006,23868,0,0,'/23869/','23868','',0,'',1,0,'/23868',0,0,1),
 ('09ecaeb1-4d72-41b9-bc57-36fe407edcde',23873,20155,20199,20006,23872,0,0,'/23873/','23872','',0,'',1,0,'/23872',0,0,1),
 ('c7154f13-cb22-44d6-b406-817612c1d1a4',24215,20155,24213,20005,24213,0,0,'/24215/','24213','',0,'',1,0,'/ivan.quiroz',0,0,1),
 ('3570c3f4-5e5c-4df0-a21f-a7402ee7fe53',24523,20155,20199,20001,24523,0,0,'/24523/','Intranet Hitss','Intranet Hitss',2,'breadcrumbShowParentGroups=true\ncontentSharingWithChildrenEnabled=-1\ndirectoryIndexingEnabled=false\nlocales=ca_ES,zh_CN,en_US,fi_FI,fr_FR,de_DE,iw_IL,hu_HU,ja_JP,pt_BR,es_ES\nmergeGuestPublicPages=false\ntrashEnabled=true\n',1,0,'/intranethitss',1,0,1);
/*!40000 ALTER TABLE `group_` ENABLE KEYS */;


--
-- Definition of table `groups_orgs`
--

DROP TABLE IF EXISTS `groups_orgs`;
CREATE TABLE `groups_orgs` (
  `groupId` bigint(20) NOT NULL,
  `organizationId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`organizationId`),
  KEY `IX_75267DCA` (`groupId`),
  KEY `IX_6BBB7682` (`organizationId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `groups_orgs`
--

/*!40000 ALTER TABLE `groups_orgs` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_orgs` ENABLE KEYS */;


--
-- Definition of table `groups_roles`
--

DROP TABLE IF EXISTS `groups_roles`;
CREATE TABLE `groups_roles` (
  `groupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`roleId`),
  KEY `IX_84471FD2` (`groupId`),
  KEY `IX_3103EF3D` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `groups_roles`
--

/*!40000 ALTER TABLE `groups_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_roles` ENABLE KEYS */;


--
-- Definition of table `groups_usergroups`
--

DROP TABLE IF EXISTS `groups_usergroups`;
CREATE TABLE `groups_usergroups` (
  `groupId` bigint(20) NOT NULL,
  `userGroupId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`userGroupId`),
  KEY `IX_31FB749A` (`groupId`),
  KEY `IX_3B69160F` (`userGroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `groups_usergroups`
--

/*!40000 ALTER TABLE `groups_usergroups` DISABLE KEYS */;
/*!40000 ALTER TABLE `groups_usergroups` ENABLE KEYS */;


--
-- Definition of table `image`
--

DROP TABLE IF EXISTS `image`;
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

--
-- Dumping data for table `image`
--

/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;


--
-- Definition of table `journalarticle`
--

DROP TABLE IF EXISTS `journalarticle`;
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

--
-- Dumping data for table `journalarticle`
--

/*!40000 ALTER TABLE `journalarticle` DISABLE KEYS */;
INSERT INTO `journalarticle` (`uuid_`,`id_`,`resourcePrimKey`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`folderId`,`classNameId`,`classPK`,`treePath`,`articleId`,`version`,`title`,`urlTitle`,`description`,`content`,`type_`,`structureId`,`templateId`,`layoutUuid`,`displayDate`,`expirationDate`,`reviewDate`,`indexable`,`smallImage`,`smallImageId`,`smallImageURL`,`status`,`statusByUserId`,`statusByUserName`,`statusDate`) VALUES 
 ('7964b1b6-4d67-4a37-a17c-63a61beec559',23064,23065,20182,20155,20199,'Test Test','2016-03-09 04:11:52','2016-03-09 04:11:52',23060,0,0,'/23060/','23063',1,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">ContenidoTestOfertaLaboral</Title></root>','contenidotestofertalaboral','','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<static-content language-id=\"es_ES\"><![CDATA[<span style=\"font-weight: bold; color: rgb(106, 106, 106); font-family: arial, sans-serif; font-size: small; line-height: 20.2222px;\">Lorem</span><span style=\"color: rgb(84, 84, 84); font-family: arial, sans-serif; font-size: small; line-height: 20.2222px;\">&nbsp;ipsum es el texto que se usa habitualmente en diseño gráfico en demostraciones de tipografías o de borradores de diseño para probar el diseño visual&nbsp;...</span>]]></static-content>\n</root>','general','','','','2016-03-09 04:09:00',NULL,NULL,1,0,23066,'',0,20199,'Test Test','2016-03-09 04:11:53'),
 ('ffbd3f43-3966-4e8f-a022-3f1a3cbbd5bb',23140,23141,20201,20155,20199,'Test Test','2016-03-09 04:34:09','2016-03-09 04:34:09',23136,0,0,'/23136/','23139',1,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">ContenidoTestOfertaLaboral</Title></root>','contenidotestofertalaboral','','<?xml version=\"1.0\"?>\n\n<root available-locales=\"es_ES\" default-locale=\"es_ES\">\n	<static-content language-id=\"es_ES\"><![CDATA[<span style=\"color: rgb(0, 0, 0); font-family: Arial, Helvetica, sans; font-size: 11px; line-height: 14px; text-align: justify;\">Al contrario del pensamiento popular, el texto de Lorem Ipsum no es simplemente texto aleatorio. Tiene sus raices en una pieza cl´sica de la literatura del Latin, que data del año 45 antes de Cristo, haciendo que este adquiera mas de 2000 años de antiguedad. Richard McClintock, un profesor de Latin de la Universidad de Hampden-Sydney en Virginia, encontró una de las palabras más oscuras de la lengua del latín, \"consecteur\", en un pasaje de Lorem Ipsum, y al seguir leyendo distintos textos del latín, descubrió la fuente indudable. Lorem Ipsum viene de las secciones 1.10.32 y 1.10.33 de \"de Finnibus Bonorum et Malorum\" (Los Extremos del Bien y El Mal) por Cicero, escrito en el año 45 antes de Cristo. Este libro es un tratado de teoría de éticas, muy popular durante el Renacimiento. La primera linea del Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", viene de una linea en la sección 1.10.32</span>]]></static-content>\n</root>','general','','','','2016-03-09 04:33:00',NULL,NULL,1,0,23142,'',0,20199,'Test Test','2016-03-09 04:34:09');
/*!40000 ALTER TABLE `journalarticle` ENABLE KEYS */;


--
-- Definition of table `journalarticleimage`
--

DROP TABLE IF EXISTS `journalarticleimage`;
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

--
-- Dumping data for table `journalarticleimage`
--

/*!40000 ALTER TABLE `journalarticleimage` DISABLE KEYS */;
/*!40000 ALTER TABLE `journalarticleimage` ENABLE KEYS */;


--
-- Definition of table `journalarticleresource`
--

DROP TABLE IF EXISTS `journalarticleresource`;
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

--
-- Dumping data for table `journalarticleresource`
--

/*!40000 ALTER TABLE `journalarticleresource` DISABLE KEYS */;
INSERT INTO `journalarticleresource` (`uuid_`,`resourcePrimKey`,`groupId`,`articleId`) VALUES 
 ('3e281fc0-5929-4c8a-aee3-10bb9d8aa6f4',23065,20182,'23063'),
 ('9092a393-2715-4539-9ba2-f8bb152bccbe',23141,20201,'23139');
/*!40000 ALTER TABLE `journalarticleresource` ENABLE KEYS */;


--
-- Definition of table `journalcontentsearch`
--

DROP TABLE IF EXISTS `journalcontentsearch`;
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

--
-- Dumping data for table `journalcontentsearch`
--

/*!40000 ALTER TABLE `journalcontentsearch` DISABLE KEYS */;
/*!40000 ALTER TABLE `journalcontentsearch` ENABLE KEYS */;


--
-- Definition of table `journalfeed`
--

DROP TABLE IF EXISTS `journalfeed`;
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

--
-- Dumping data for table `journalfeed`
--

/*!40000 ALTER TABLE `journalfeed` DISABLE KEYS */;
/*!40000 ALTER TABLE `journalfeed` ENABLE KEYS */;


--
-- Definition of table `journalfolder`
--

DROP TABLE IF EXISTS `journalfolder`;
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

--
-- Dumping data for table `journalfolder`
--

/*!40000 ALTER TABLE `journalfolder` DISABLE KEYS */;
INSERT INTO `journalfolder` (`uuid_`,`folderId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`parentFolderId`,`treePath`,`name`,`description`,`status`,`statusByUserId`,`statusByUserName`,`statusDate`) VALUES 
 ('19e6b2ff-e78c-4dc9-b676-b4d51413054b',23060,20182,20155,20199,'Test Test','2016-03-09 04:08:50','2016-03-09 04:08:50',0,'/23060/','ContenidoTest','ContenidoTest',0,0,'',NULL),
 ('21e00ad8-aea3-409a-8139-4fbb152fb6f2',23136,20201,20155,20199,'Test Test','2016-03-09 04:33:26','2016-03-09 04:33:26',0,'/23136/','ContenidoTest','',0,0,'',NULL);
/*!40000 ALTER TABLE `journalfolder` ENABLE KEYS */;


--
-- Definition of table `kaleoaction`
--

DROP TABLE IF EXISTS `kaleoaction`;
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

--
-- Dumping data for table `kaleoaction`
--

/*!40000 ALTER TABLE `kaleoaction` DISABLE KEYS */;
INSERT INTO `kaleoaction` (`kaleoActionId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoClassName`,`kaleoClassPK`,`kaleoDefinitionId`,`kaleoNodeName`,`name`,`description`,`executionType`,`script`,`scriptLanguage`,`scriptRequiredContexts`,`priority`) VALUES 
 (20470,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26','com.liferay.portal.workflow.kaleo.model.KaleoNode',20469,20468,'update','reject','','onAssignment','\n					\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"denied\"), workflowContext);\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"pending\"), workflowContext);\n					\n				','javascript','',0),
 (20475,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26','com.liferay.portal.workflow.kaleo.model.KaleoNode',20474,20468,'approved','approve','','onEntry','\n					\n						import com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil;\n						import com.liferay.portal.kernel.workflow.WorkflowConstants;\n\n						WorkflowStatusManagerUtil.updateStatus(WorkflowConstants.toStatus(\"approved\"), workflowContext);\n					\n				','groovy','',0);
/*!40000 ALTER TABLE `kaleoaction` ENABLE KEYS */;


--
-- Definition of table `kaleocondition`
--

DROP TABLE IF EXISTS `kaleocondition`;
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

--
-- Dumping data for table `kaleocondition`
--

/*!40000 ALTER TABLE `kaleocondition` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleocondition` ENABLE KEYS */;


--
-- Definition of table `kaleodefinition`
--

DROP TABLE IF EXISTS `kaleodefinition`;
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

--
-- Dumping data for table `kaleodefinition`
--

/*!40000 ALTER TABLE `kaleodefinition` DISABLE KEYS */;
INSERT INTO `kaleodefinition` (`kaleoDefinitionId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`title`,`description`,`content`,`version`,`active_`,`startKaleoNodeId`) VALUES 
 (20468,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:28','Single Approver','Single Approver','A single approver can approve a workflow content.','<?xml version=\"1.0\"?>\n\n<workflow-definition xmlns=\"urn:liferay.com:liferay-workflow_6.2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:liferay.com:liferay-workflow_6.2.0 http://www.liferay.com/dtd/liferay-workflow-definition_6_2_0.xsd\">\n	<name>Single Approver</name>\n	<description>A single approver can approve a workflow content.</description>\n	<version>1</version>\n	<state>\n		<name>created</name>\n		<metadata> <![CDATA[{\"xy\":[36,51]}]]> </metadata>\n		<initial>true</initial>\n		<transitions>\n			<transition>\n				<name>review</name>\n				<target>review</target>\n			</transition>\n		</transitions>\n	</state>\n	<task>\n		<name>update</name>\n		<metadata> <![CDATA[{\"transitions\":{\"resubmit\":{\"bendpoints\":[[303,140]]}},\"xy\":[328,199]}]]> </metadata>\n		<actions>\n			<action>\n				<name>reject</name>\n				<script> <![CDATA[\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"denied\"), workflowContext);\n						Packages.com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil.updateStatus(Packages.com.liferay.portal.kernel.workflow.WorkflowConstants.toStatus(\"pending\"), workflowContext);\n					]]> </script>\n				<script-language>javascript</script-language>\n				<execution-type>onAssignment</execution-type>\n			</action>\n			<notification>\n				<name>Creator Modification Notification</name>\n				<template>Your submission was rejected by ${userName}, please modify and resubmit.</template>\n				<template-language>freemarker</template-language>\n				<notification-type>email</notification-type>\n				<notification-type>user-notification</notification-type>\n				<execution-type>onAssignment</execution-type>\n			</notification>\n		</actions>\n		<assignments>\n			<user/>\n		</assignments>\n		<transitions>\n			<transition>\n				<name>resubmit</name>\n				<target>review</target>\n			</transition>\n		</transitions>\n	</task>\n	<task>\n		<name>review</name>\n		<metadata> <![CDATA[{\"xy\":[168,36]}]]> </metadata>\n		<actions>\n			<notification>\n				<name>Review Notification</name>\n				<template>${userName} sent you a ${entryType} for review in the workflow.</template>\n				<template-language>freemarker</template-language>\n				<notification-type>email</notification-type>\n				<notification-type>user-notification</notification-type>\n				<execution-type>onAssignment</execution-type>\n			</notification>\n			<notification>\n				<name>Review Completion Notification</name>\n				<template>Your submission has been reviewed and the reviewer has applied the following ${taskComments}.</template>\n				<template-language>freemarker</template-language>\n				<notification-type>email</notification-type>\n				<recipients>\n					<user/>\n				</recipients>\n				<execution-type>onExit</execution-type>\n			</notification>\n		</actions>\n		<assignments>\n			<roles>\n				<role>\n					<role-type>organization</role-type>\n					<name>Organization Administrator</name>\n				</role>\n				<role>\n					<role-type>organization</role-type>\n					<name>Organization Content Reviewer</name>\n				</role>\n				<role>\n					<role-type>organization</role-type>\n					<name>Organization Owner</name>\n				</role>\n				<role>\n					<role-type>regular</role-type>\n					<name>Administrator</name>\n				</role>\n				<role>\n					<role-type>regular</role-type>\n					<name>Portal Content Reviewer</name>\n				</role>\n				<role>\n					<role-type>site</role-type>\n					<name>Site Administrator</name>\n				</role>\n				<role>\n					<role-type>site</role-type>\n					<name>Site Content Reviewer</name>\n				</role>\n				<role>\n					<role-type>site</role-type>\n					<name>Site Owner</name>\n				</role>\n			</roles>\n		</assignments>\n		<transitions>\n			<transition>\n				<name>approve</name>\n				<target>approved</target>\n			</transition>\n			<transition>\n				<name>reject</name>\n				<target>update</target>\n				<default>false</default>\n			</transition>\n		</transitions>\n	</task>\n	<state>\n		<name>approved</name>\n		<metadata> <![CDATA[\n				{\"xy\":[380,51]}\n			]]> </metadata>\n		<actions>\n			<action>\n				<name>approve</name>\n				<script> <![CDATA[\n						import com.liferay.portal.kernel.workflow.WorkflowStatusManagerUtil;\n						import com.liferay.portal.kernel.workflow.WorkflowConstants;\n\n						WorkflowStatusManagerUtil.updateStatus(WorkflowConstants.toStatus(\"approved\"), workflowContext);\n					]]> </script>\n				<script-language>groovy</script-language>\n				<execution-type>onEntry</execution-type>\n			</action>\n		</actions>\n	</state>\n</workflow-definition>',1,1,20476);
/*!40000 ALTER TABLE `kaleodefinition` ENABLE KEYS */;


--
-- Definition of table `kaleoinstance`
--

DROP TABLE IF EXISTS `kaleoinstance`;
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

--
-- Dumping data for table `kaleoinstance`
--

/*!40000 ALTER TABLE `kaleoinstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleoinstance` ENABLE KEYS */;


--
-- Definition of table `kaleoinstancetoken`
--

DROP TABLE IF EXISTS `kaleoinstancetoken`;
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

--
-- Dumping data for table `kaleoinstancetoken`
--

/*!40000 ALTER TABLE `kaleoinstancetoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleoinstancetoken` ENABLE KEYS */;


--
-- Definition of table `kaleolog`
--

DROP TABLE IF EXISTS `kaleolog`;
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

--
-- Dumping data for table `kaleolog`
--

/*!40000 ALTER TABLE `kaleolog` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleolog` ENABLE KEYS */;


--
-- Definition of table `kaleonode`
--

DROP TABLE IF EXISTS `kaleonode`;
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

--
-- Dumping data for table `kaleonode`
--

/*!40000 ALTER TABLE `kaleonode` DISABLE KEYS */;
INSERT INTO `kaleonode` (`kaleoNodeId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoDefinitionId`,`name`,`metadata`,`description`,`type_`,`initial_`,`terminal`) VALUES 
 (20469,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,'update','\n			{\"transitions\":{\"resubmit\":{\"bendpoints\":[[303,140]]}},\"xy\":[328,199]}\n		','','TASK',0,0),
 (20474,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,'approved','\n			\n				{\"xy\":[380,51]}\n			\n		','','STATE',0,1),
 (20476,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,'created','\n			{\"xy\":[36,51]}\n		','','STATE',1,0),
 (20477,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,'review','\n			{\"xy\":[168,36]}\n		','','TASK',0,0);
/*!40000 ALTER TABLE `kaleonode` ENABLE KEYS */;


--
-- Definition of table `kaleonotification`
--

DROP TABLE IF EXISTS `kaleonotification`;
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

--
-- Dumping data for table `kaleonotification`
--

/*!40000 ALTER TABLE `kaleonotification` DISABLE KEYS */;
INSERT INTO `kaleonotification` (`kaleoNotificationId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoClassName`,`kaleoClassPK`,`kaleoDefinitionId`,`kaleoNodeName`,`name`,`description`,`executionType`,`template`,`templateLanguage`,`notificationTypes`) VALUES 
 (20471,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26','com.liferay.portal.workflow.kaleo.model.KaleoNode',20469,20468,'update','Creator Modification Notification','','onAssignment','Your submission was rejected by ${userName}, please modify and resubmit.','freemarker','email,user-notification'),
 (20478,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26','com.liferay.portal.workflow.kaleo.model.KaleoNode',20477,20468,'review','Review Notification','','onAssignment','${userName} sent you a ${entryType} for review in the workflow.','freemarker','email,user-notification'),
 (20479,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26','com.liferay.portal.workflow.kaleo.model.KaleoNode',20477,20468,'review','Review Completion Notification','','onExit','\n					Your submission has been reviewed and the reviewer has applied the following ${taskComments}.','freemarker','email');
/*!40000 ALTER TABLE `kaleonotification` ENABLE KEYS */;


--
-- Definition of table `kaleonotificationrecipient`
--

DROP TABLE IF EXISTS `kaleonotificationrecipient`;
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

--
-- Dumping data for table `kaleonotificationrecipient`
--

/*!40000 ALTER TABLE `kaleonotificationrecipient` DISABLE KEYS */;
INSERT INTO `kaleonotificationrecipient` (`kaleoNotificationRecipientId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoDefinitionId`,`kaleoNotificationId`,`recipientClassName`,`recipientClassPK`,`recipientRoleType`,`address`) VALUES 
 (20480,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,20479,'com.liferay.portal.model.User',0,0,'');
/*!40000 ALTER TABLE `kaleonotificationrecipient` ENABLE KEYS */;


--
-- Definition of table `kaleotask`
--

DROP TABLE IF EXISTS `kaleotask`;
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

--
-- Dumping data for table `kaleotask`
--

/*!40000 ALTER TABLE `kaleotask` DISABLE KEYS */;
INSERT INTO `kaleotask` (`kaleoTaskId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoDefinitionId`,`kaleoNodeId`,`name`,`description`) VALUES 
 (20472,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,20469,'update',''),
 (20483,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26',20468,20477,'review','');
/*!40000 ALTER TABLE `kaleotask` ENABLE KEYS */;


--
-- Definition of table `kaleotaskassignment`
--

DROP TABLE IF EXISTS `kaleotaskassignment`;
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

--
-- Dumping data for table `kaleotaskassignment`
--

/*!40000 ALTER TABLE `kaleotaskassignment` DISABLE KEYS */;
INSERT INTO `kaleotaskassignment` (`kaleoTaskAssignmentId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoClassName`,`kaleoClassPK`,`kaleoDefinitionId`,`kaleoNodeId`,`assigneeClassName`,`assigneeClassPK`,`assigneeActionId`,`assigneeScript`,`assigneeScriptLanguage`,`assigneeScriptRequiredContexts`) VALUES 
 (20473,0,20155,20159,'','2016-03-06 16:10:26','2016-03-06 16:10:26','com.liferay.portal.workflow.kaleo.model.KaleoTask',20472,20468,0,'com.liferay.portal.model.User',0,'','','',''),
 (20484,0,20155,20159,'','2016-03-06 16:10:27','2016-03-06 16:10:27','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20162,'','','',''),
 (20485,0,20155,20159,'','2016-03-06 16:10:27','2016-03-06 16:10:27','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20486,'','','',''),
 (20487,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20488,'','','',''),
 (20489,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20490,'','','',''),
 (20491,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20172,'','','',''),
 (20492,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20170,'','','',''),
 (20493,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20167,'','','',''),
 (20494,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28','com.liferay.portal.workflow.kaleo.model.KaleoTask',20483,20468,0,'com.liferay.portal.model.Role',20168,'','','','');
/*!40000 ALTER TABLE `kaleotaskassignment` ENABLE KEYS */;


--
-- Definition of table `kaleotaskassignmentinstance`
--

DROP TABLE IF EXISTS `kaleotaskassignmentinstance`;
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

--
-- Dumping data for table `kaleotaskassignmentinstance`
--

/*!40000 ALTER TABLE `kaleotaskassignmentinstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotaskassignmentinstance` ENABLE KEYS */;


--
-- Definition of table `kaleotaskinstancetoken`
--

DROP TABLE IF EXISTS `kaleotaskinstancetoken`;
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

--
-- Dumping data for table `kaleotaskinstancetoken`
--

/*!40000 ALTER TABLE `kaleotaskinstancetoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotaskinstancetoken` ENABLE KEYS */;


--
-- Definition of table `kaleotimer`
--

DROP TABLE IF EXISTS `kaleotimer`;
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

--
-- Dumping data for table `kaleotimer`
--

/*!40000 ALTER TABLE `kaleotimer` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotimer` ENABLE KEYS */;


--
-- Definition of table `kaleotimerinstancetoken`
--

DROP TABLE IF EXISTS `kaleotimerinstancetoken`;
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

--
-- Dumping data for table `kaleotimerinstancetoken`
--

/*!40000 ALTER TABLE `kaleotimerinstancetoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `kaleotimerinstancetoken` ENABLE KEYS */;


--
-- Definition of table `kaleotransition`
--

DROP TABLE IF EXISTS `kaleotransition`;
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

--
-- Dumping data for table `kaleotransition`
--

/*!40000 ALTER TABLE `kaleotransition` DISABLE KEYS */;
INSERT INTO `kaleotransition` (`kaleoTransitionId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`kaleoDefinitionId`,`kaleoNodeId`,`name`,`description`,`sourceKaleoNodeId`,`sourceKaleoNodeName`,`targetKaleoNodeId`,`targetKaleoNodeName`,`defaultTransition`) VALUES 
 (20495,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20468,20469,'resubmit','',20469,'update',20477,'review',1),
 (20496,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20468,20476,'review','',20476,'created',20477,'review',1),
 (20497,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20468,20477,'approve','',20477,'review',20474,'approved',1),
 (20498,0,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20468,20477,'reject','',20477,'review',20469,'update',0);
/*!40000 ALTER TABLE `kaleotransition` ENABLE KEYS */;


--
-- Definition of table `layout`
--

DROP TABLE IF EXISTS `layout`;
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

--
-- Dumping data for table `layout`
--

/*!40000 ALTER TABLE `layout` DISABLE KEYS */;
INSERT INTO `layout` (`uuid_`,`plid`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`privateLayout`,`layoutId`,`parentLayoutId`,`name`,`title`,`description`,`keywords`,`robots`,`type_`,`typeSettings`,`hidden_`,`friendlyURL`,`iconImage`,`iconImageId`,`themeId`,`colorSchemeId`,`wapThemeId`,`wapColorSchemeId`,`css`,`priority`,`layoutPrototypeUuid`,`layoutPrototypeLinkEnabled`,`sourcePrototypeLayoutUuid`) VALUES 
 ('bc6e2ec7-45f8-4f1d-aaa1-42760abe6dea',20176,20173,20155,20159,'','2016-03-06 15:57:50','2016-03-06 15:57:50',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Control Panel</Name></root>','','','','','control_panel','privateLayout=true\n',0,'/manage',0,0,'','','','','',0,'',0,''),
 ('dc65cf2a-ee74-4294-8fc8-a3e5976b01ec',20185,20182,20155,20159,'','2016-03-06 15:57:51','2016-04-02 04:25:51',0,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US,es_ES,\" default-locale=\"es_ES\"><Name language-id=\"en_US\">Welcome</Name><Name language-id=\"es_ES\">Inicio</Name></root>','','','','','portlet','column-1-customizable=false\ncolumn-2=liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet,ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet,58\ncolumn-2-customizable=false\nlayout-template-id=2_columns_ii\nlayoutUpdateable=true\nsitemap-changefreq=daily\nsitemap-include=1\n',0,'/inicio',0,0,'classic','','','','',0,'',0,''),
 ('91437381-4b56-4552-8e41-e8fe78495b76',20320,20317,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Blog</Name></root>','','','','','portlet','column-1=33,\ncolumn-2=148_INSTANCE_QwYKSXpqC5Wk,114,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/layout',0,0,'','','','','',0,'',0,''),
 ('caf23bf3-ed95-4ea4-b5dc-af3742f6f550',20332,20329,20155,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:57',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Content Display Page</Name></root>','','','','','portlet','column-1=141_INSTANCE_1YsD5GuRvzAS,122_INSTANCE_JccLcnQ7QfT7,\ncolumn-2=3,101_INSTANCE_wtxRiemfrYJa,\ndefault-asset-publisher-portlet-id=101_INSTANCE_wtxRiemfrYJa\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/layout',0,0,'','','','','',0,'',0,''),
 ('3c8792c5-9d74-4536-a243-96f26ae7a39e',20342,20339,20155,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:58',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Wiki</Name></root>','','','','','portlet','column-1=36,\ncolumn-2=122_INSTANCE_95tdESXNwKDF,141_INSTANCE_Uv0J0pJCdtEH,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/layout',0,0,'','','','','',0,'',0,''),
 ('eb2a6be7-9bac-473d-8c79-c01a8364916b',20361,20350,20155,20159,'','2016-03-06 15:57:59','2016-03-06 15:58:01',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Home</Name></root>','','','','','portlet','column-1=19,\ncolumn-2=3,59_INSTANCE_9x2MX0GHbZA5,180,101_INSTANCE_2yWh9wL93hPN,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),
 ('73a96452-4450-431c-9839-706f2405e483',20369,20350,20155,20159,'','2016-03-06 15:58:02','2016-03-06 15:58:02',1,2,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Wiki</Name></root>','','','','','portlet','column-1=36,\ncolumn-2=122_INSTANCE_eShdodPAVR3l,148_INSTANCE_ed1b1IzyNMGo,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/wiki',0,0,'','','','','',1,'',0,''),
 ('ca010c44-215e-4236-b994-b9ac905f2e0e',20387,20376,20155,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:04',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Home</Name></root>','','','','','portlet','column-1=116,\ncolumn-2=3,82,101_INSTANCE_Ec28aTlGMIUU,\nlayout-template-id=2_columns_i\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),
 ('2ae223d0-1625-4f34-8dee-74166ee17d4d',20396,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',1,2,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Documents and Media</Name></root>','','','','','portlet','column-1=20,\ncolumn-2=101_INSTANCE_sA35cK7SEwJI,\nlayout-template-id=1_column\nprivateLayout=true\n',0,'/documents',0,0,'','','','','',1,'',0,''),
 ('82e6d6d9-9eed-4081-beaa-55ddf72c4d15',20404,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:05',1,3,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">News</Name></root>','','','','','portlet','column-1=39_INSTANCE_2Q9CgFFYf4CZ,\ncolumn-2=39_INSTANCE_tcHYhVp4tgLc,\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/news',0,0,'','','','','',2,'',0,''),
 ('0612a795-c042-45ff-92e6-b47a6214428e',22929,20812,20155,20159,'','2016-03-09 03:54:15','2016-03-09 03:54:15',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Welcome</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Welcome</Title></root>','','','','portlet','column-1=58,\ncolumn-2=47,\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),
 ('8d1beefa-3ac0-4e63-a4b6-61dc9b7631d7',23805,21212,20155,20159,'','2016-04-01 04:16:53','2016-04-01 04:16:54',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Welcome</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Welcome</Title></root>','','','','portlet','column-1=58,\ncolumn-2=47,\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),
 ('08b98c76-445d-43bd-9687-056505d69e6d',23829,23816,20155,20159,'','2016-04-01 04:17:27','2016-04-01 04:17:27',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Welcome</Name></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">Welcome</Title></root>','','','','portlet','column-1=58,\ncolumn-2=47,\nlayout-template-id=2_columns_ii\nprivateLayout=true\n',0,'/home',0,0,'','','','','',0,'',0,''),
 ('ca010c44-215e-4236-b994-b9ac905f2e0e',24534,24523,20155,20159,'',NULL,'2016-04-02 04:37:41',1,1,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US,es_ES,\" default-locale=\"es_ES\"><Name language-id=\"en_US\">Home</Name><Name language-id=\"es_ES\">Principal</Name></root>','','','','','portlet','column-1-customizable=false\ncolumn-2-customizable=false\nlast-merge-time=1459571593049\nlayout-template-id=2_columns_i\nlayoutUpdateable=true\nprivateLayout=true\n',0,'/inicio',0,0,'classic','','','','',0,'',0,'ca010c44-215e-4236-b994-b9ac905f2e0e'),
 ('2ae223d0-1625-4f34-8dee-74166ee17d4d',24536,24523,20155,20159,'',NULL,'2016-04-02 04:37:19',1,2,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US,es_ES,\" default-locale=\"es_ES\"><Name language-id=\"en_US\">Documents and Media</Name><Name language-id=\"es_ES\">Registrar Solicitud Reclutamiento</Name></root>','','','','','portlet','column-1-customizable=false\ncolumn-2=101_INSTANCE_sA35cK7SEwJI,\nlast-merge-time=1459571593049\nlayout-template-id=1_column\nlayoutUpdateable=true\nprivateLayout=true\n',0,'/registrar-solicitud-reclutamiento',0,0,'classic','','','','',1,'',0,'2ae223d0-1625-4f34-8dee-74166ee17d4d'),
 ('82e6d6d9-9eed-4081-beaa-55ddf72c4d15',24538,24523,20155,20159,'',NULL,'2016-04-02 04:37:31',1,3,0,'<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">News</Name></root>','','','','','portlet','last-merge-time=1459571593049\nlayout-template-id=2_columns_iii\nprivateLayout=true\n',0,'/news',0,0,'','','','','',2,'',0,'82e6d6d9-9eed-4081-beaa-55ddf72c4d15');
/*!40000 ALTER TABLE `layout` ENABLE KEYS */;


--
-- Definition of table `layoutbranch`
--

DROP TABLE IF EXISTS `layoutbranch`;
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

--
-- Dumping data for table `layoutbranch`
--

/*!40000 ALTER TABLE `layoutbranch` DISABLE KEYS */;
/*!40000 ALTER TABLE `layoutbranch` ENABLE KEYS */;


--
-- Definition of table `layoutfriendlyurl`
--

DROP TABLE IF EXISTS `layoutfriendlyurl`;
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

--
-- Dumping data for table `layoutfriendlyurl`
--

/*!40000 ALTER TABLE `layoutfriendlyurl` DISABLE KEYS */;
INSERT INTO `layoutfriendlyurl` (`uuid_`,`layoutFriendlyURLId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`plid`,`privateLayout`,`friendlyURL`,`languageId`) VALUES 
 ('2f12a686-2a80-4b97-b684-1c2713e7ac02',20177,20173,20155,20159,'','2016-03-06 15:57:50','2016-03-06 15:57:50',20176,1,'/manage','en_US'),
 ('a2ac682f-853b-49e2-99fb-c00876930813',20186,20182,20155,20159,'','2016-03-06 15:57:51','2016-03-06 15:57:51',20185,0,'/home','en_US'),
 ('ba9d8608-eef2-40e2-99ba-650104e958ca',20321,20317,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55',20320,1,'/layout','en_US'),
 ('7cb919de-e50a-454b-9940-8f9155b2fb9d',20333,20329,20155,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:56',20332,1,'/layout','en_US'),
 ('7b34c5fb-56e0-4b1a-ab79-debabb896788',20343,20339,20155,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:57',20342,1,'/layout','en_US'),
 ('6abd3332-a464-42d0-b0c1-c73f9ecb4703',20362,20350,20155,20159,'','2016-03-06 15:57:59','2016-03-06 15:57:59',20361,1,'/home','en_US'),
 ('37944910-32ba-40e7-b90a-0248ceaf870b',20370,20350,20155,20159,'','2016-03-06 15:58:02','2016-03-06 15:58:02',20369,1,'/wiki','en_US'),
 ('ce21f56d-d24e-4832-95ce-799a5d227f20',20388,20376,20155,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:03',20387,1,'/home','en_US'),
 ('092d2614-56f9-4b56-8353-036c97729214',20397,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20396,1,'/documents','en_US'),
 ('df9afd5e-bcbf-4d36-a0e3-4dfa8f32b6b3',20405,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20404,1,'/news','en_US'),
 ('bf1dafe5-ccb6-4ab0-86da-fc0d58c1fbb9',22930,20812,20155,20159,'','2016-03-09 03:54:15','2016-03-09 03:54:15',22929,1,'/home','es_ES'),
 ('4b524e76-940f-45a2-8a90-2640873e6253',23806,21212,20155,20159,'','2016-04-01 04:16:53','2016-04-01 04:16:53',23805,1,'/home','es_ES'),
 ('714d0e30-26ef-4c3b-88b9-e1c7bf132e4b',23830,23816,20155,20159,'','2016-04-01 04:17:27','2016-04-01 04:17:27',23829,1,'/home','es_ES'),
 ('78a1188b-43e8-4963-8e48-830f0ed60b04',24196,20182,20155,20159,'','2016-04-01 04:27:08','2016-04-01 04:27:08',20185,0,'/inicio','es_ES'),
 ('ce21f56d-d24e-4832-95ce-799a5d227f20',24535,24523,20155,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:03',24534,1,'/home','en_US'),
 ('092d2614-56f9-4b56-8353-036c97729214',24537,24523,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',24536,1,'/documents','en_US'),
 ('df9afd5e-bcbf-4d36-a0e3-4dfa8f32b6b3',24539,24523,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',24538,1,'/news','en_US'),
 ('8a4ef75f-c9ab-42c8-aac7-d62e0b2bdc77',24552,24523,20155,20159,'','2016-04-02 04:35:05','2016-04-02 04:35:05',24534,1,'/inicio','es_ES'),
 ('83bddc41-40c2-4672-ad7e-e11737d843f5',24553,24523,20155,20159,'','2016-04-02 04:35:32','2016-04-02 04:35:32',24536,1,'/registrar-solicitud-reclutamiento','es_ES');
/*!40000 ALTER TABLE `layoutfriendlyurl` ENABLE KEYS */;


--
-- Definition of table `layoutprototype`
--

DROP TABLE IF EXISTS `layoutprototype`;
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

--
-- Dumping data for table `layoutprototype`
--

/*!40000 ALTER TABLE `layoutprototype` DISABLE KEYS */;
INSERT INTO `layoutprototype` (`uuid_`,`layoutPrototypeId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`description`,`settings_`,`active_`) VALUES 
 ('f67db6a7-acf3-4e31-a24c-c4168fd1e1a9',20316,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Blog</Name></root>','Create, edit, and view blogs from this page. Explore topics using tags, and connect with other members that blog.','',1),
 ('2b7d1eb1-8489-4dde-8175-5d749758e2b9',20328,20155,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:56','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Content Display Page</Name></root>','Create, edit, and explore web content with this page. Search available content, explore related content with tags, and browse content categories.','',1),
 ('502d6f2d-7562-44be-8d34-57f4a4bb78bd',20338,20155,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:57','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Wiki</Name></root>','Collaborate with members through the wiki on this page. Discover related content through tags, and navigate quickly and easily with categories.','',1);
/*!40000 ALTER TABLE `layoutprototype` ENABLE KEYS */;


--
-- Definition of table `layoutrevision`
--

DROP TABLE IF EXISTS `layoutrevision`;
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

--
-- Dumping data for table `layoutrevision`
--

/*!40000 ALTER TABLE `layoutrevision` DISABLE KEYS */;
/*!40000 ALTER TABLE `layoutrevision` ENABLE KEYS */;


--
-- Definition of table `layoutset`
--

DROP TABLE IF EXISTS `layoutset`;
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

--
-- Dumping data for table `layoutset`
--

/*!40000 ALTER TABLE `layoutset` DISABLE KEYS */;
INSERT INTO `layoutset` (`layoutSetId`,`groupId`,`companyId`,`createDate`,`modifiedDate`,`privateLayout`,`logo`,`logoId`,`themeId`,`colorSchemeId`,`wapThemeId`,`wapColorSchemeId`,`css`,`pageCount`,`settings_`,`layoutSetPrototypeUuid`,`layoutSetPrototypeLinkEnabled`) VALUES 
 (20174,20173,20155,'2016-03-06 15:57:49','2016-03-06 15:57:50',1,0,0,'classic','01','mobile','01','',1,'','',0),
 (20175,20173,20155,'2016-03-06 15:57:49','2016-03-06 15:57:49',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20183,20182,20155,'2016-03-06 15:57:51','2016-03-06 15:57:51',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (20184,20182,20155,'2016-03-06 15:57:51','2016-04-02 04:25:31',0,0,0,'lateralnavtheme_WAR_lateralnavtheme','01','mobile','01','',1,'lfr-theme:regular:logo-menu-direction=right-left\nlfr-theme:regular:navigation=left\nshowSiteName=true\n','',0),
 (20193,20192,20155,'2016-03-06 15:57:51','2016-03-06 15:57:51',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (20194,20192,20155,'2016-03-06 15:57:51','2016-03-06 15:57:51',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20196,20195,20155,'2016-03-06 15:57:51','2016-03-06 15:57:51',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (20197,20195,20155,'2016-03-06 15:57:51','2016-03-06 15:57:51',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20202,20201,20155,'2016-03-06 15:57:52','2016-03-29 06:42:09',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (20203,20201,20155,'2016-03-06 15:57:52','2016-03-06 15:57:52',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20318,20317,20155,'2016-03-06 15:57:55','2016-03-06 15:57:55',1,0,0,'classic','01','mobile','01','',1,'','',0),
 (20319,20317,20155,'2016-03-06 15:57:55','2016-03-06 15:57:55',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20330,20329,20155,'2016-03-06 15:57:56','2016-03-06 15:57:56',1,0,0,'classic','01','mobile','01','',1,'','',0),
 (20331,20329,20155,'2016-03-06 15:57:56','2016-03-06 15:57:56',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20340,20339,20155,'2016-03-06 15:57:57','2016-03-06 15:57:57',1,0,0,'classic','01','mobile','01','',1,'','',0),
 (20341,20339,20155,'2016-03-06 15:57:57','2016-03-06 15:57:57',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20351,20350,20155,'2016-03-06 15:57:58','2016-03-06 15:58:02',1,0,0,'classic','01','mobile','01','',2,'','',0),
 (20352,20350,20155,'2016-03-06 15:57:58','2016-03-06 15:57:58',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20377,20376,20155,'2016-03-06 15:58:02','2016-03-06 15:58:05',1,0,0,'classic','01','mobile','01','',3,'','',0),
 (20378,20376,20155,'2016-03-06 15:58:02','2016-03-06 15:58:02',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (20813,20812,20155,'2016-03-07 05:54:13','2016-03-09 03:54:15',1,0,0,'REV_WAR_REVtheme','01','mobile','01','',1,'','',0),
 (20814,20812,20155,'2016-03-07 05:54:13','2016-03-09 03:54:15',0,0,0,'REV_WAR_REVtheme','01','mobile','01','',0,'','',0),
 (21213,21212,20155,'2016-03-08 02:36:19','2016-04-01 04:16:54',1,0,0,'Postulante_WAR_Postulantetheme','01','mobile','01','',1,'','',0),
 (21214,21212,20155,'2016-03-08 02:36:19','2016-04-01 04:16:52',0,0,0,'Postulante_WAR_Postulantetheme','01','mobile','01','',0,'','',0),
 (23106,23105,20155,'2016-03-09 04:21:43','2016-03-09 04:21:43',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23107,23105,20155,'2016-03-09 04:21:43','2016-03-09 04:21:43',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23115,23114,20155,'2016-03-09 04:22:15','2016-03-09 04:22:15',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23116,23114,20155,'2016-03-09 04:22:15','2016-03-09 04:22:15',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23817,23816,20155,'2016-04-01 04:17:27','2016-04-01 04:17:27',1,0,0,'rec_WAR_rectheme','01','mobile','01','',1,'','',0),
 (23818,23816,20155,'2016-04-01 04:17:27','2016-04-01 04:17:27',0,0,0,'rec_WAR_rectheme','01','mobile','01','',0,'','',0),
 (23838,23837,20155,'2016-04-01 04:22:03','2016-04-01 04:22:03',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23839,23837,20155,'2016-04-01 04:22:03','2016-04-01 04:22:03',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23842,23841,20155,'2016-04-01 04:22:25','2016-04-01 04:22:25',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23843,23841,20155,'2016-04-01 04:22:25','2016-04-01 04:22:25',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23846,23845,20155,'2016-04-01 04:22:36','2016-04-01 04:22:36',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23847,23845,20155,'2016-04-01 04:22:36','2016-04-01 04:22:36',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23850,23849,20155,'2016-04-01 04:22:47','2016-04-01 04:22:47',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23851,23849,20155,'2016-04-01 04:22:47','2016-04-01 04:22:47',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23854,23853,20155,'2016-04-01 04:23:07','2016-04-01 04:23:07',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23855,23853,20155,'2016-04-01 04:23:07','2016-04-01 04:23:07',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23858,23857,20155,'2016-04-01 04:23:21','2016-04-01 04:23:21',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23859,23857,20155,'2016-04-01 04:23:21','2016-04-01 04:23:21',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23862,23861,20155,'2016-04-01 04:23:35','2016-04-01 04:23:35',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23863,23861,20155,'2016-04-01 04:23:35','2016-04-01 04:23:35',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23866,23865,20155,'2016-04-01 04:23:56','2016-04-01 04:23:56',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23867,23865,20155,'2016-04-01 04:23:56','2016-04-01 04:23:56',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23870,23869,20155,'2016-04-01 04:24:12','2016-04-01 04:24:12',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23871,23869,20155,'2016-04-01 04:24:12','2016-04-01 04:24:12',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (23874,23873,20155,'2016-04-01 04:24:31','2016-04-01 04:24:31',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (23875,23873,20155,'2016-04-01 04:24:31','2016-04-01 04:24:31',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (24216,24215,20155,'2016-04-01 04:34:34','2016-04-01 04:34:34',1,0,0,'classic','01','mobile','01','',0,'','',0),
 (24217,24215,20155,'2016-04-01 04:34:34','2016-04-01 04:34:34',0,0,0,'classic','01','mobile','01','',0,'','',0),
 (24524,24523,20155,'2016-04-02 04:33:09','2016-04-02 04:36:58',1,0,0,'lateralnavtheme_WAR_lateralnavtheme','01','mobile','01','',3,'last-merge-time=1459571593049\nlfr-theme:regular:logo-menu-direction=right-left\nlfr-theme:regular:navigation=left\nshowSiteName=true\n','d7559272-3136-4a11-9923-e3d052c39ed8',1),
 (24525,24523,20155,'2016-04-02 04:33:09','2016-04-02 04:33:09',0,0,0,'classic','01','mobile','01','',0,'','',0);
/*!40000 ALTER TABLE `layoutset` ENABLE KEYS */;


--
-- Definition of table `layoutsetbranch`
--

DROP TABLE IF EXISTS `layoutsetbranch`;
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

--
-- Dumping data for table `layoutsetbranch`
--

/*!40000 ALTER TABLE `layoutsetbranch` DISABLE KEYS */;
/*!40000 ALTER TABLE `layoutsetbranch` ENABLE KEYS */;


--
-- Definition of table `layoutsetprototype`
--

DROP TABLE IF EXISTS `layoutsetprototype`;
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

--
-- Dumping data for table `layoutsetprototype`
--

/*!40000 ALTER TABLE `layoutsetprototype` DISABLE KEYS */;
INSERT INTO `layoutsetprototype` (`uuid_`,`layoutSetPrototypeId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`name`,`description`,`settings_`,`active_`) VALUES 
 ('44ec7272-869e-4748-8456-edd432214304',20349,20155,20159,'','2016-03-06 15:57:58','2016-03-29 06:55:59','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Community Site</Name></root>','Site with Forums and Wiki','layoutsUpdateable=true\n',1),
 ('d7559272-3136-4a11-9923-e3d052c39ed8',20375,20155,20159,'','2016-03-06 15:58:02','2016-03-29 06:55:59','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Name language-id=\"en_US\">Intranet Site</Name></root>','Site with Documents and News','layoutsUpdateable=true\n',1),
 ('f59b6a5e-ea78-4787-804a-30ba000cc557',20811,20155,20159,'','2016-03-07 05:54:13','2016-03-29 06:55:59','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Rev Theme</Name></root>','','layoutsUpdateable=true\n',1),
 ('b4b65d38-b860-4990-b50c-b0c4ff203d95',21211,20155,20159,'','2016-03-08 02:36:19','2016-04-01 04:16:54','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Postulante Theme</Name></root>','','layoutsUpdateable=true\n',1),
 ('3f3b3044-3f1c-4e57-875a-2c8625a7c56e',23815,20155,20159,'','2016-04-01 04:17:26','2016-04-01 04:17:27','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Name language-id=\"es_ES\">Rec Theme</Name></root>','','layoutsUpdateable=true\n',1);
/*!40000 ALTER TABLE `layoutsetprototype` ENABLE KEYS */;


--
-- Definition of table `listtype`
--

DROP TABLE IF EXISTS `listtype`;
CREATE TABLE `listtype` (
  `listTypeId` int(11) NOT NULL,
  `name` varchar(75) DEFAULT NULL,
  `type_` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`listTypeId`),
  KEY `IX_2932DD37` (`type_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `listtype`
--

/*!40000 ALTER TABLE `listtype` DISABLE KEYS */;
INSERT INTO `listtype` (`listTypeId`,`name`,`type_`) VALUES 
 (10000,'billing','com.liferay.portal.model.Account.address'),
 (10001,'other','com.liferay.portal.model.Account.address'),
 (10002,'p-o-box','com.liferay.portal.model.Account.address'),
 (10003,'shipping','com.liferay.portal.model.Account.address'),
 (10004,'email-address','com.liferay.portal.model.Account.emailAddress'),
 (10005,'email-address-2','com.liferay.portal.model.Account.emailAddress'),
 (10006,'email-address-3','com.liferay.portal.model.Account.emailAddress'),
 (10007,'fax','com.liferay.portal.model.Account.phone'),
 (10008,'local','com.liferay.portal.model.Account.phone'),
 (10009,'other','com.liferay.portal.model.Account.phone'),
 (10010,'toll-free','com.liferay.portal.model.Account.phone'),
 (10011,'tty','com.liferay.portal.model.Account.phone'),
 (10012,'intranet','com.liferay.portal.model.Account.website'),
 (10013,'public','com.liferay.portal.model.Account.website'),
 (11000,'business','com.liferay.portal.model.Contact.address'),
 (11001,'other','com.liferay.portal.model.Contact.address'),
 (11002,'personal','com.liferay.portal.model.Contact.address'),
 (11003,'email-address','com.liferay.portal.model.Contact.emailAddress'),
 (11004,'email-address-2','com.liferay.portal.model.Contact.emailAddress'),
 (11005,'email-address-3','com.liferay.portal.model.Contact.emailAddress'),
 (11006,'business','com.liferay.portal.model.Contact.phone'),
 (11007,'business-fax','com.liferay.portal.model.Contact.phone'),
 (11008,'mobile-phone','com.liferay.portal.model.Contact.phone'),
 (11009,'other','com.liferay.portal.model.Contact.phone'),
 (11010,'pager','com.liferay.portal.model.Contact.phone'),
 (11011,'personal','com.liferay.portal.model.Contact.phone'),
 (11012,'personal-fax','com.liferay.portal.model.Contact.phone'),
 (11013,'tty','com.liferay.portal.model.Contact.phone'),
 (11014,'dr','com.liferay.portal.model.Contact.prefix'),
 (11015,'mr','com.liferay.portal.model.Contact.prefix'),
 (11016,'mrs','com.liferay.portal.model.Contact.prefix'),
 (11017,'ms','com.liferay.portal.model.Contact.prefix'),
 (11020,'ii','com.liferay.portal.model.Contact.suffix'),
 (11021,'iii','com.liferay.portal.model.Contact.suffix'),
 (11022,'iv','com.liferay.portal.model.Contact.suffix'),
 (11023,'jr','com.liferay.portal.model.Contact.suffix'),
 (11024,'phd','com.liferay.portal.model.Contact.suffix'),
 (11025,'sr','com.liferay.portal.model.Contact.suffix'),
 (11026,'blog','com.liferay.portal.model.Contact.website'),
 (11027,'business','com.liferay.portal.model.Contact.website'),
 (11028,'other','com.liferay.portal.model.Contact.website'),
 (11029,'personal','com.liferay.portal.model.Contact.website'),
 (12000,'billing','com.liferay.portal.model.Organization.address'),
 (12001,'other','com.liferay.portal.model.Organization.address'),
 (12002,'p-o-box','com.liferay.portal.model.Organization.address'),
 (12003,'shipping','com.liferay.portal.model.Organization.address'),
 (12004,'email-address','com.liferay.portal.model.Organization.emailAddress'),
 (12005,'email-address-2','com.liferay.portal.model.Organization.emailAddress'),
 (12006,'email-address-3','com.liferay.portal.model.Organization.emailAddress'),
 (12007,'fax','com.liferay.portal.model.Organization.phone'),
 (12008,'local','com.liferay.portal.model.Organization.phone'),
 (12009,'other','com.liferay.portal.model.Organization.phone'),
 (12010,'toll-free','com.liferay.portal.model.Organization.phone'),
 (12011,'tty','com.liferay.portal.model.Organization.phone'),
 (12012,'administrative','com.liferay.portal.model.Organization.service'),
 (12013,'contracts','com.liferay.portal.model.Organization.service'),
 (12014,'donation','com.liferay.portal.model.Organization.service'),
 (12015,'retail','com.liferay.portal.model.Organization.service'),
 (12016,'training','com.liferay.portal.model.Organization.service'),
 (12017,'full-member','com.liferay.portal.model.Organization.status'),
 (12018,'provisional-member','com.liferay.portal.model.Organization.status'),
 (12019,'intranet','com.liferay.portal.model.Organization.website'),
 (12020,'public','com.liferay.portal.model.Organization.website');
/*!40000 ALTER TABLE `listtype` ENABLE KEYS */;


--
-- Definition of table `lock_`
--

DROP TABLE IF EXISTS `lock_`;
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

--
-- Dumping data for table `lock_`
--

/*!40000 ALTER TABLE `lock_` DISABLE KEYS */;
/*!40000 ALTER TABLE `lock_` ENABLE KEYS */;


--
-- Definition of table `marketplace_app`
--

DROP TABLE IF EXISTS `marketplace_app`;
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

--
-- Dumping data for table `marketplace_app`
--

/*!40000 ALTER TABLE `marketplace_app` DISABLE KEYS */;
/*!40000 ALTER TABLE `marketplace_app` ENABLE KEYS */;


--
-- Definition of table `marketplace_module`
--

DROP TABLE IF EXISTS `marketplace_module`;
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

--
-- Dumping data for table `marketplace_module`
--

/*!40000 ALTER TABLE `marketplace_module` DISABLE KEYS */;
/*!40000 ALTER TABLE `marketplace_module` ENABLE KEYS */;


--
-- Definition of table `mbban`
--

DROP TABLE IF EXISTS `mbban`;
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

--
-- Dumping data for table `mbban`
--

/*!40000 ALTER TABLE `mbban` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbban` ENABLE KEYS */;


--
-- Definition of table `mbcategory`
--

DROP TABLE IF EXISTS `mbcategory`;
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

--
-- Dumping data for table `mbcategory`
--

/*!40000 ALTER TABLE `mbcategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbcategory` ENABLE KEYS */;


--
-- Definition of table `mbdiscussion`
--

DROP TABLE IF EXISTS `mbdiscussion`;
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

--
-- Dumping data for table `mbdiscussion`
--

/*!40000 ALTER TABLE `mbdiscussion` DISABLE KEYS */;
INSERT INTO `mbdiscussion` (`uuid_`,`discussionId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`threadId`) VALUES 
 ('13b97900-df80-4e9d-b1ec-dcecaccef458',20181,0,0,20159,'','2016-03-06 15:57:51','2016-03-06 15:57:51',20002,20176,20179),
 ('2bcf74ed-ff3a-4be8-bdb1-e40139cd9cda',20190,0,0,20159,'','2016-03-06 15:57:51','2016-03-06 15:57:51',20002,20185,20188),
 ('1dfe1e2a-5ed0-41af-acff-ee4c04a8977a',20326,0,0,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55',20002,20320,20323),
 ('bcc27609-507d-45c6-8d30-3deab840e5f3',20337,0,0,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:56',20002,20332,20335),
 ('d66648c4-3e98-40f0-905f-f775b74a1d40',20347,0,0,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:57',20002,20342,20345),
 ('be68c13d-33e4-47f1-a403-66deb8b091d0',20366,0,0,20159,'','2016-03-06 15:57:59','2016-03-06 15:57:59',20002,20361,20364),
 ('dbac4bf7-5943-4717-82a9-32474e966f88',20374,0,0,20159,'','2016-03-06 15:58:02','2016-03-06 15:58:02',20002,20369,20372),
 ('b1660532-d67c-41e7-9828-4439426abb22',20392,0,0,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:03',20002,20387,20390),
 ('6c39f64b-8ca0-43b6-943c-3b1a0950df86',20401,0,0,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20002,20396,20399),
 ('eefd15bb-67c5-4b9f-9b50-9f52c6818e1c',20409,0,0,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20002,20404,20407),
 ('9889a458-0f6e-449f-bbdf-af746af0085d',22749,0,0,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22743,22747),
 ('6a1372c9-072d-40aa-92b1-e0245be55f25',22758,0,0,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22751,22755),
 ('8ba9a17a-ffd8-49a9-bee0-8befe59eb9dd',22767,0,0,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22761,22765),
 ('f1f72049-7ca4-4a7f-aae3-7cf71830ed37',22776,0,0,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22769,22774),
 ('14c0c8ca-7e58-4d85-8e83-a1e561cc01d7',22786,0,0,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22779,22784),
 ('bb699dca-2a14-4dea-a222-20f1bdf28a96',22798,0,0,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22789,22796),
 ('bc3063be-cd0e-4a04-9716-36c4732f1986',22827,0,0,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22812,22821),
 ('58269b05-a6ce-43ce-a28a-7ed1c788b78f',22840,0,0,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22830,22838),
 ('66041c1d-ba8f-4ad8-bb17-a283f6f57646',22849,0,0,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22843,22847),
 ('66bbe2ad-20dd-4ef9-954e-285c5f4722ff',22866,0,0,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22855,22864),
 ('dda40430-d560-43bb-bed3-bc6af83bead6',22879,0,0,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22869,22877),
 ('5e3e8c3a-1ccc-45b9-af57-8930c02262a4',22892,0,0,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22881,22890),
 ('5668cb4e-9c02-43f0-b30f-e0a6799cdb03',22905,0,0,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22895,22903),
 ('2ed33547-6caa-4362-aef9-6150bd8ffbfa',22918,0,0,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22908,22916),
 ('060f2691-1439-4e8a-bba0-5e1d5f4b8f2e',22934,0,0,20159,'','2016-03-09 03:54:15','2016-03-09 03:54:15',20002,22929,22932),
 ('b9b5ddb5-8faf-4e25-82c2-7a434d3cd3f9',23072,0,0,20199,'Test Test','2016-03-09 04:11:53','2016-03-09 04:11:53',20109,23065,23070),
 ('d15ed043-8333-42f8-8e30-9fde3b4bc638',23148,0,0,20199,'Test Test','2016-03-09 04:34:09','2016-03-09 04:34:09',20109,23141,23146),
 ('150de122-9b92-4f9b-acf1-a8e6eb2aa11e',23224,0,0,20199,'Test Test','2016-03-09 05:24:26','2016-03-09 05:24:26',20109,23063,23222),
 ('169b63ee-cb95-400d-8b6e-ccf75011aaab',23810,0,0,20159,'','2016-04-01 04:16:53','2016-04-01 04:16:53',20002,23805,23808),
 ('09961f98-317c-41bb-baac-0119d7ea500c',23834,0,0,20159,'','2016-04-01 04:17:27','2016-04-01 04:17:27',20002,23829,23832);
/*!40000 ALTER TABLE `mbdiscussion` ENABLE KEYS */;


--
-- Definition of table `mbmailinglist`
--

DROP TABLE IF EXISTS `mbmailinglist`;
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

--
-- Dumping data for table `mbmailinglist`
--

/*!40000 ALTER TABLE `mbmailinglist` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbmailinglist` ENABLE KEYS */;


--
-- Definition of table `mbmessage`
--

DROP TABLE IF EXISTS `mbmessage`;
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

--
-- Dumping data for table `mbmessage`
--

/*!40000 ALTER TABLE `mbmessage` DISABLE KEYS */;
INSERT INTO `mbmessage` (`uuid_`,`messageId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`categoryId`,`threadId`,`rootMessageId`,`parentMessageId`,`subject`,`body`,`format`,`anonymous`,`priority`,`allowPingbacks`,`answer`,`status`,`statusByUserId`,`statusByUserName`,`statusDate`) VALUES 
 ('a7dd1f35-e117-410e-a069-ffd2c6430d0a',20178,20173,20155,20159,'','2016-03-06 15:57:50','2016-03-06 15:57:50',20002,20176,-1,20179,20178,0,'20176','20176','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:57:50'),
 ('481c0d8e-9615-49fd-a131-c66e91b72b27',20187,20182,20155,20159,'','2016-03-06 15:57:51','2016-03-06 15:57:51',20002,20185,-1,20188,20187,0,'20185','20185','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:57:51'),
 ('f84b2c97-e1b1-4027-abd7-5939a58e39ba',20322,20317,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55',20002,20320,-1,20323,20322,0,'20320','20320','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:57:55'),
 ('b20c98e1-c89b-45f3-a265-b8dda72f3e7f',20334,20329,20155,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:56',20002,20332,-1,20335,20334,0,'20332','20332','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:57:56'),
 ('26dc9fb5-45c2-41ac-a3cb-9657c76eeb8b',20344,20339,20155,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:57',20002,20342,-1,20345,20344,0,'20342','20342','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:57:57'),
 ('11b3421b-0bc6-4b88-a765-016c4424d507',20363,20350,20155,20159,'','2016-03-06 15:57:59','2016-03-06 15:57:59',20002,20361,-1,20364,20363,0,'20361','20361','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:57:59'),
 ('13e4377a-97fc-4529-9412-c22a34fc939d',20371,20350,20155,20159,'','2016-03-06 15:58:02','2016-03-06 15:58:02',20002,20369,-1,20372,20371,0,'20369','20369','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:58:02'),
 ('1a1ae777-0f3b-4b7c-8b31-f97d2669b178',20389,20376,20155,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:03',20002,20387,-1,20390,20389,0,'20387','20387','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:58:03'),
 ('41a5a984-947a-4f7a-936e-58fc8033d29c',20398,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20002,20396,-1,20399,20398,0,'20396','20396','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:58:04'),
 ('7461751d-d49b-48be-bae8-8a2853902d92',20406,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',20002,20404,-1,20407,20406,0,'20404','20404','bbcode',1,0,0,0,0,20159,'','2016-03-06 15:58:04'),
 ('09296b73-1dcf-48a7-8086-1f6a7bf9a421',22746,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22743,-1,22747,22746,0,'22743','22743','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:12'),
 ('8b9d5dc6-1bc3-45b9-955d-0f0490b990a0',22754,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22751,-1,22755,22754,0,'22751','22751','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:12'),
 ('beaa432a-717a-412c-a0b4-f0f54e5dc291',22764,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22761,-1,22765,22764,0,'22761','22761','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:12'),
 ('2e25cf14-9ce1-455f-944a-1ef2c8928885',22773,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',20011,22769,-1,22774,22773,0,'22769','22769','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:12'),
 ('756fa299-c35a-4288-b896-555bed521f84',22783,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22779,-1,22784,22783,0,'22779','22779','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:13'),
 ('c85e51c6-8341-4d56-b76f-1f9d1ace0d7d',22795,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22789,-1,22796,22795,0,'22789','22789','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:13'),
 ('7449944b-b3b3-486f-957e-39a82ec676ba',22820,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22812,-1,22821,22820,0,'22812','22812','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:13'),
 ('9e970a7b-487a-4bce-acd9-1087659a54fb',22837,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22830,-1,22838,22837,0,'22830','22830','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:13'),
 ('2b4cc29c-3f49-4301-aaf3-2677f9952fb9',22846,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',20011,22843,-1,22847,22846,0,'22843','22843','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:13'),
 ('64d601c5-9651-4225-9441-f05fe7198bf4',22863,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22855,-1,22864,22863,0,'22855','22855','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:14'),
 ('2a35e000-0f31-41f6-a5eb-96ad6d67fb5a',22876,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22869,-1,22877,22876,0,'22869','22869','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:14'),
 ('d1f60ff6-a592-45f8-aae8-7a822bfeb0a2',22889,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22881,-1,22890,22889,0,'22881','22881','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:14'),
 ('e5b62c36-adf6-47f1-a86a-58db9a58ecc3',22902,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22895,-1,22903,22902,0,'22895','22895','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:14'),
 ('448734ae-7fc0-46a9-be77-d410054ceb1a',22915,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',20011,22908,-1,22916,22915,0,'22908','22908','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:14'),
 ('7a980956-4bba-434c-864a-1059c8b89015',22931,20812,20155,20159,'','2016-03-09 03:54:15','2016-03-09 03:54:15',20002,22929,-1,22932,22931,0,'22929','22929','bbcode',1,0,0,0,0,20159,'','2016-03-09 03:54:15'),
 ('5edc3bc3-b449-4e12-96ff-59e1b11759fc',23069,20182,20155,20199,'Test Test','2016-03-09 04:11:53','2016-03-09 04:11:53',20109,23065,-1,23070,23069,0,'23065','23065','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 04:11:53'),
 ('57c9d1cf-050c-4de1-8441-044bb9743705',23083,20182,20155,20199,'Test Test','2016-03-09 04:13:44','2016-03-09 04:13:44',20109,23065,-1,23070,23069,23069,'ewfewfewfef...','ewfewfewfef','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 04:13:44'),
 ('fe1eac2c-74f0-4f3e-afd8-e5b462c84a8c',23085,20182,20155,20199,'Test Test','2016-03-09 04:13:51','2016-03-09 04:13:51',20109,23065,-1,23070,23069,23083,'wefewfefef...','wefewfefef','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 04:13:51'),
 ('4fc72550-686a-43a8-a533-6f428385828d',23145,20201,20155,20199,'Test Test','2016-03-09 04:34:09','2016-03-09 04:34:09',20109,23141,-1,23146,23145,0,'23141','23141','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 04:34:09'),
 ('53107e3c-ac15-4950-a036-590d5a7d18a5',23221,20182,20155,20199,'Test Test','2016-03-09 05:24:26','2016-03-09 05:24:26',20109,23063,-1,23222,23221,0,'23063','23063','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 05:24:26'),
 ('167a542b-f4bf-42ff-81e8-18b40108453e',23301,20182,20155,20199,'Test Test','2016-03-09 05:45:25','2016-03-09 05:45:25',20109,23065,-1,23070,23069,23069,'weffwe...','weffwe','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 05:45:25'),
 ('9eb9b966-005e-4982-8d03-377298417361',23305,20182,20155,20199,'Test Test','2016-03-09 06:17:42','2016-03-09 06:17:42',20109,23065,-1,23070,23069,23069,'ewfwefwfewf...','ewfwefwfewf','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 06:17:42'),
 ('01a74e07-b3c1-472c-b243-227e613b4299',23307,20182,20155,20199,'Test Test','2016-03-09 06:17:47','2016-03-09 06:17:47',20109,23065,-1,23070,23069,23069,'qwdwdwdwqd wqdwqd w...','qwdwdwdwqd wqdwqd w','bbcode',0,0,0,0,0,20199,'Test Test','2016-03-09 06:17:47'),
 ('d36631d5-1c10-4151-9351-7ec0d35b99c2',23807,21212,20155,20159,'','2016-04-01 04:16:53','2016-04-01 04:16:53',20002,23805,-1,23808,23807,0,'23805','23805','bbcode',1,0,0,0,0,20159,'','2016-04-01 04:16:53'),
 ('f37a08a1-6de8-447d-b1ee-09abb7333401',23831,23816,20155,20159,'','2016-04-01 04:17:27','2016-04-01 04:17:27',20002,23829,-1,23832,23831,0,'23829','23829','bbcode',1,0,0,0,0,20159,'','2016-04-01 04:17:27');
/*!40000 ALTER TABLE `mbmessage` ENABLE KEYS */;


--
-- Definition of table `mbstatsuser`
--

DROP TABLE IF EXISTS `mbstatsuser`;
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

--
-- Dumping data for table `mbstatsuser`
--

/*!40000 ALTER TABLE `mbstatsuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbstatsuser` ENABLE KEYS */;


--
-- Definition of table `mbthread`
--

DROP TABLE IF EXISTS `mbthread`;
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

--
-- Dumping data for table `mbthread`
--

/*!40000 ALTER TABLE `mbthread` DISABLE KEYS */;
INSERT INTO `mbthread` (`uuid_`,`threadId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`categoryId`,`rootMessageId`,`rootMessageUserId`,`messageCount`,`viewCount`,`lastPostByUserId`,`lastPostDate`,`priority`,`question`,`status`,`statusByUserId`,`statusByUserName`,`statusDate`) VALUES 
 ('0153946b-2075-4e6c-bdc0-47f393e7a0a6',20179,20173,20155,20159,'','2016-03-06 15:57:50','2016-03-06 15:57:50',-1,20178,20159,1,0,0,'2016-03-06 15:57:50',0,0,0,20159,'','2016-03-06 15:57:50'),
 ('848df16a-0870-473e-a050-0401bb3ecd98',20188,20182,20155,20159,'','2016-03-06 15:57:51','2016-03-06 15:57:51',-1,20187,20159,1,0,0,'2016-03-06 15:57:51',0,0,0,20159,'','2016-03-06 15:57:51'),
 ('7270363e-8ecd-47dd-ae3f-558370e58b02',20323,20317,20155,20159,'','2016-03-06 15:57:55','2016-03-06 15:57:55',-1,20322,20159,1,0,0,'2016-03-06 15:57:55',0,0,0,20159,'','2016-03-06 15:57:55'),
 ('385cdb7c-b86d-4708-8c66-e5e4e2418510',20335,20329,20155,20159,'','2016-03-06 15:57:56','2016-03-06 15:57:56',-1,20334,20159,1,0,0,'2016-03-06 15:57:56',0,0,0,20159,'','2016-03-06 15:57:56'),
 ('8eaa158a-29da-4dbb-97be-3aaa35f54e52',20345,20339,20155,20159,'','2016-03-06 15:57:57','2016-03-06 15:57:57',-1,20344,20159,1,0,0,'2016-03-06 15:57:57',0,0,0,20159,'','2016-03-06 15:57:57'),
 ('004f042e-e38e-4d70-89de-ce76ec6eabf2',20364,20350,20155,20159,'','2016-03-06 15:57:59','2016-03-06 15:57:59',-1,20363,20159,1,0,0,'2016-03-06 15:57:59',0,0,0,20159,'','2016-03-06 15:57:59'),
 ('2c06018d-957d-4be5-b85d-def273fcb9ff',20372,20350,20155,20159,'','2016-03-06 15:58:02','2016-03-06 15:58:02',-1,20371,20159,1,0,0,'2016-03-06 15:58:02',0,0,0,20159,'','2016-03-06 15:58:02'),
 ('d2fcb2b2-c7a4-4993-9df7-969a29abc47a',20390,20376,20155,20159,'','2016-03-06 15:58:03','2016-03-06 15:58:03',-1,20389,20159,1,0,0,'2016-03-06 15:58:03',0,0,0,20159,'','2016-03-06 15:58:03'),
 ('a58145da-935d-4037-ada0-e082252527c9',20399,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',-1,20398,20159,1,0,0,'2016-03-06 15:58:04',0,0,0,20159,'','2016-03-06 15:58:04'),
 ('ea40c106-75f7-4797-a6bf-cbe8f01e9937',20407,20376,20155,20159,'','2016-03-06 15:58:04','2016-03-06 15:58:04',-1,20406,20159,1,0,0,'2016-03-06 15:58:04',0,0,0,20159,'','2016-03-06 15:58:04'),
 ('47fe751c-733b-403b-9c6d-f77b53ef242a',22747,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',-1,22746,20159,1,0,0,'2016-03-09 03:54:12',0,0,0,20159,'','2016-03-09 03:54:12'),
 ('baf7b73a-23c3-4aa9-a9ec-054bae30076b',22755,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',-1,22754,20159,1,0,0,'2016-03-09 03:54:12',0,0,0,20159,'','2016-03-09 03:54:12'),
 ('a64d5737-5eb4-471e-882f-d1aa8863331e',22765,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',-1,22764,20159,1,0,0,'2016-03-09 03:54:12',0,0,0,20159,'','2016-03-09 03:54:12'),
 ('031ec48d-5bc0-47a8-93a2-fa62ba47702a',22774,20182,20155,20159,'','2016-03-09 03:54:12','2016-03-09 03:54:12',-1,22773,20159,1,0,0,'2016-03-09 03:54:12',0,0,0,20159,'','2016-03-09 03:54:12'),
 ('3d1199f3-7420-4441-bb4d-fe10d04b27f6',22784,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',-1,22783,20159,1,0,0,'2016-03-09 03:54:13',0,0,0,20159,'','2016-03-09 03:54:13'),
 ('09fd523d-2828-47cf-a5c3-bf0afae45c59',22796,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',-1,22795,20159,1,0,0,'2016-03-09 03:54:13',0,0,0,20159,'','2016-03-09 03:54:13'),
 ('76c844c7-5106-41f6-8e9a-4598af204394',22821,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',-1,22820,20159,1,0,0,'2016-03-09 03:54:13',0,0,0,20159,'','2016-03-09 03:54:13'),
 ('a8e6fb94-d24d-4006-89ed-d7bdad251b13',22838,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',-1,22837,20159,1,0,0,'2016-03-09 03:54:13',0,0,0,20159,'','2016-03-09 03:54:13'),
 ('c9f3c122-d64c-4c77-9ccb-329338fa3e4d',22847,20182,20155,20159,'','2016-03-09 03:54:13','2016-03-09 03:54:13',-1,22846,20159,1,0,0,'2016-03-09 03:54:13',0,0,0,20159,'','2016-03-09 03:54:13'),
 ('0637500f-7304-49b6-9cb8-5ede69417078',22864,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',-1,22863,20159,1,0,0,'2016-03-09 03:54:14',0,0,0,20159,'','2016-03-09 03:54:14'),
 ('c0a21d51-092b-4249-a1df-86756c687d37',22877,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',-1,22876,20159,1,0,0,'2016-03-09 03:54:14',0,0,0,20159,'','2016-03-09 03:54:14'),
 ('609b3661-d3d4-46cc-9e4d-df779a58e908',22890,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',-1,22889,20159,1,0,0,'2016-03-09 03:54:14',0,0,0,20159,'','2016-03-09 03:54:14'),
 ('3131d5a7-23af-4345-9320-6b9792b0900b',22903,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',-1,22902,20159,1,0,0,'2016-03-09 03:54:14',0,0,0,20159,'','2016-03-09 03:54:14'),
 ('f075c963-0940-4afd-86ba-5b875b51cefb',22916,20182,20155,20159,'','2016-03-09 03:54:14','2016-03-09 03:54:14',-1,22915,20159,1,0,0,'2016-03-09 03:54:14',0,0,0,20159,'','2016-03-09 03:54:14'),
 ('7d7e0c00-3156-4b22-b6d6-ce9292c7f587',22932,20812,20155,20159,'','2016-03-09 03:54:15','2016-03-09 03:54:15',-1,22931,20159,1,0,0,'2016-03-09 03:54:15',0,0,0,20159,'','2016-03-09 03:54:15'),
 ('c5488fc5-cc80-409e-be2f-5bf86b39eb26',23070,20182,20155,20199,'Test Test','2016-03-09 04:11:53','2016-03-09 04:11:53',-1,23069,20199,6,0,20199,'2016-03-09 06:17:47',0,0,0,20199,'Test Test','2016-03-09 04:11:53'),
 ('2b495b66-91f8-4fa5-9bbd-a8b4304713a8',23146,20201,20155,20199,'Test Test','2016-03-09 04:34:09','2016-03-09 04:34:09',-1,23145,20199,1,0,20199,'2016-03-09 04:34:09',0,0,0,20199,'Test Test','2016-03-09 04:34:09'),
 ('e14754db-22fa-40a4-88c7-aed78150384d',23222,20182,20155,20199,'Test Test','2016-03-09 05:24:26','2016-03-09 05:24:26',-1,23221,20199,1,0,20199,'2016-03-09 05:24:26',0,0,0,20199,'Test Test','2016-03-09 05:24:26'),
 ('46dd74be-a04c-40f5-8bd7-c3d75abad4a1',23808,21212,20155,20159,'','2016-04-01 04:16:53','2016-04-01 04:16:53',-1,23807,20159,1,0,0,'2016-04-01 04:16:53',0,0,0,20159,'','2016-04-01 04:16:53'),
 ('0d2ddd0b-975b-4fee-968e-854a46bd12e6',23832,23816,20155,20159,'','2016-04-01 04:17:27','2016-04-01 04:17:27',-1,23831,20159,1,0,0,'2016-04-01 04:17:27',0,0,0,20159,'','2016-04-01 04:17:27');
/*!40000 ALTER TABLE `mbthread` ENABLE KEYS */;


--
-- Definition of table `mbthreadflag`
--

DROP TABLE IF EXISTS `mbthreadflag`;
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

--
-- Dumping data for table `mbthreadflag`
--

/*!40000 ALTER TABLE `mbthreadflag` DISABLE KEYS */;
/*!40000 ALTER TABLE `mbthreadflag` ENABLE KEYS */;


--
-- Definition of table `mdraction`
--

DROP TABLE IF EXISTS `mdraction`;
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

--
-- Dumping data for table `mdraction`
--

/*!40000 ALTER TABLE `mdraction` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdraction` ENABLE KEYS */;


--
-- Definition of table `mdrrule`
--

DROP TABLE IF EXISTS `mdrrule`;
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

--
-- Dumping data for table `mdrrule`
--

/*!40000 ALTER TABLE `mdrrule` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdrrule` ENABLE KEYS */;


--
-- Definition of table `mdrrulegroup`
--

DROP TABLE IF EXISTS `mdrrulegroup`;
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

--
-- Dumping data for table `mdrrulegroup`
--

/*!40000 ALTER TABLE `mdrrulegroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdrrulegroup` ENABLE KEYS */;


--
-- Definition of table `mdrrulegroupinstance`
--

DROP TABLE IF EXISTS `mdrrulegroupinstance`;
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

--
-- Dumping data for table `mdrrulegroupinstance`
--

/*!40000 ALTER TABLE `mdrrulegroupinstance` DISABLE KEYS */;
/*!40000 ALTER TABLE `mdrrulegroupinstance` ENABLE KEYS */;


--
-- Definition of table `membershiprequest`
--

DROP TABLE IF EXISTS `membershiprequest`;
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

--
-- Dumping data for table `membershiprequest`
--

/*!40000 ALTER TABLE `membershiprequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `membershiprequest` ENABLE KEYS */;


--
-- Definition of table `notifications_usernotificationevent`
--

DROP TABLE IF EXISTS `notifications_usernotificationevent`;
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

--
-- Dumping data for table `notifications_usernotificationevent`
--

/*!40000 ALTER TABLE `notifications_usernotificationevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `notifications_usernotificationevent` ENABLE KEYS */;


--
-- Definition of table `opensocial_gadget`
--

DROP TABLE IF EXISTS `opensocial_gadget`;
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

--
-- Dumping data for table `opensocial_gadget`
--

/*!40000 ALTER TABLE `opensocial_gadget` DISABLE KEYS */;
/*!40000 ALTER TABLE `opensocial_gadget` ENABLE KEYS */;


--
-- Definition of table `opensocial_oauthconsumer`
--

DROP TABLE IF EXISTS `opensocial_oauthconsumer`;
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

--
-- Dumping data for table `opensocial_oauthconsumer`
--

/*!40000 ALTER TABLE `opensocial_oauthconsumer` DISABLE KEYS */;
/*!40000 ALTER TABLE `opensocial_oauthconsumer` ENABLE KEYS */;


--
-- Definition of table `opensocial_oauthtoken`
--

DROP TABLE IF EXISTS `opensocial_oauthtoken`;
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

--
-- Dumping data for table `opensocial_oauthtoken`
--

/*!40000 ALTER TABLE `opensocial_oauthtoken` DISABLE KEYS */;
/*!40000 ALTER TABLE `opensocial_oauthtoken` ENABLE KEYS */;


--
-- Definition of table `organization_`
--

DROP TABLE IF EXISTS `organization_`;
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

--
-- Dumping data for table `organization_`
--

/*!40000 ALTER TABLE `organization_` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization_` ENABLE KEYS */;


--
-- Definition of table `orggrouprole`
--

DROP TABLE IF EXISTS `orggrouprole`;
CREATE TABLE `orggrouprole` (
  `organizationId` bigint(20) NOT NULL,
  `groupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`organizationId`,`groupId`,`roleId`),
  KEY `IX_4A527DD3` (`groupId`),
  KEY `IX_AB044D1C` (`roleId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orggrouprole`
--

/*!40000 ALTER TABLE `orggrouprole` DISABLE KEYS */;
/*!40000 ALTER TABLE `orggrouprole` ENABLE KEYS */;


--
-- Definition of table `orglabor`
--

DROP TABLE IF EXISTS `orglabor`;
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

--
-- Dumping data for table `orglabor`
--

/*!40000 ALTER TABLE `orglabor` DISABLE KEYS */;
/*!40000 ALTER TABLE `orglabor` ENABLE KEYS */;


--
-- Definition of table `passwordpolicy`
--

DROP TABLE IF EXISTS `passwordpolicy`;
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

--
-- Dumping data for table `passwordpolicy`
--

/*!40000 ALTER TABLE `passwordpolicy` DISABLE KEYS */;
INSERT INTO `passwordpolicy` (`uuid_`,`passwordPolicyId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`defaultPolicy`,`name`,`description`,`changeable`,`changeRequired`,`minAge`,`checkSyntax`,`allowDictionaryWords`,`minAlphanumeric`,`minLength`,`minLowerCase`,`minNumbers`,`minSymbols`,`minUpperCase`,`regex`,`history`,`historyCount`,`expireable`,`maxAge`,`warningTime`,`graceLimit`,`lockout`,`maxFailure`,`lockoutDuration`,`requireUnlock`,`resetFailureCount`,`resetTicketMaxAge`) VALUES 
 ('46fa36b4-1a96-4cd6-a228-378fb8cad779',20198,20155,20159,'','2016-03-06 15:57:51','2016-04-01 04:29:01',1,'Default Password Policy','Default Password Policy',1,0,0,0,1,0,6,0,1,0,1,'(?=.{4})(?:[a-zA-Z0-9]*)',0,6,0,1209600,86400,0,0,3,0,1,600,0);
/*!40000 ALTER TABLE `passwordpolicy` ENABLE KEYS */;


--
-- Definition of table `passwordpolicyrel`
--

DROP TABLE IF EXISTS `passwordpolicyrel`;
CREATE TABLE `passwordpolicyrel` (
  `passwordPolicyRelId` bigint(20) NOT NULL,
  `passwordPolicyId` bigint(20) DEFAULT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`passwordPolicyRelId`),
  UNIQUE KEY `IX_C3A17327` (`classNameId`,`classPK`),
  KEY `IX_CD25266E` (`passwordPolicyId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passwordpolicyrel`
--

/*!40000 ALTER TABLE `passwordpolicyrel` DISABLE KEYS */;
/*!40000 ALTER TABLE `passwordpolicyrel` ENABLE KEYS */;


--
-- Definition of table `passwordtracker`
--

DROP TABLE IF EXISTS `passwordtracker`;
CREATE TABLE `passwordtracker` (
  `passwordTrackerId` bigint(20) NOT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `password_` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`passwordTrackerId`),
  KEY `IX_326F75BD` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `passwordtracker`
--

/*!40000 ALTER TABLE `passwordtracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `passwordtracker` ENABLE KEYS */;


--
-- Definition of table `phone`
--

DROP TABLE IF EXISTS `phone`;
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

--
-- Dumping data for table `phone`
--

/*!40000 ALTER TABLE `phone` DISABLE KEYS */;
/*!40000 ALTER TABLE `phone` ENABLE KEYS */;


--
-- Definition of table `pluginsetting`
--

DROP TABLE IF EXISTS `pluginsetting`;
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

--
-- Dumping data for table `pluginsetting`
--

/*!40000 ALTER TABLE `pluginsetting` DISABLE KEYS */;
/*!40000 ALTER TABLE `pluginsetting` ENABLE KEYS */;


--
-- Definition of table `pollschoice`
--

DROP TABLE IF EXISTS `pollschoice`;
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

--
-- Dumping data for table `pollschoice`
--

/*!40000 ALTER TABLE `pollschoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `pollschoice` ENABLE KEYS */;


--
-- Definition of table `pollsquestion`
--

DROP TABLE IF EXISTS `pollsquestion`;
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

--
-- Dumping data for table `pollsquestion`
--

/*!40000 ALTER TABLE `pollsquestion` DISABLE KEYS */;
/*!40000 ALTER TABLE `pollsquestion` ENABLE KEYS */;


--
-- Definition of table `pollsvote`
--

DROP TABLE IF EXISTS `pollsvote`;
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

--
-- Dumping data for table `pollsvote`
--

/*!40000 ALTER TABLE `pollsvote` DISABLE KEYS */;
/*!40000 ALTER TABLE `pollsvote` ENABLE KEYS */;


--
-- Definition of table `portalpreferences`
--

DROP TABLE IF EXISTS `portalpreferences`;
CREATE TABLE `portalpreferences` (
  `portalPreferencesId` bigint(20) NOT NULL,
  `ownerId` bigint(20) DEFAULT NULL,
  `ownerType` int(11) DEFAULT NULL,
  `preferences` longtext,
  PRIMARY KEY (`portalPreferencesId`),
  KEY `IX_D1F795F1` (`ownerId`,`ownerType`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `portalpreferences`
--

/*!40000 ALTER TABLE `portalpreferences` DISABLE KEYS */;
INSERT INTO `portalpreferences` (`portalPreferencesId`,`ownerId`,`ownerType`,`preferences`) VALUES 
 (20154,0,1,'<portlet-preferences />'),
 (20161,20155,1,'<portlet-preferences><preference><name>linkedin.autologinenabled</name><value>false</value></preference><preference><name>company.security.strangers.verify</name><value>false</value></preference><preference><name>facebook.connect.app.secret</name><value>1234</value></preference><preference><name>linkedin.linkedincreateorganizationoption</name><value>joinExisting</value></preference><preference><name>locales</name><value>ca_ES,zh_CN,en_US,fi_FI,fr_FR,de_DE,iw_IL,hu_HU,ja_JP,pt_BR,es_ES</value></preference><preference><name>ldap.server.ids</name><value></value></preference><preference><name>admin.analytics.types</name><value>google[$NEW_LINE$]piwik</value></preference><preference><name>linkedin.isenabled</name><value>true</value></preference><preference><name>admin.email.password.reset.subject</name><value>[$PORTAL_URL$]: Reset Your Password</value></preference><preference><name>admin.email.user.added.subject</name><value>[$PORTAL_URL$]: Your New Account</value></preference><preference><name>admin.email.password.sent.body</name><value>Dear [$TO_NAME$],&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Your new password for [$PORTAL_URL$] is [$USER_PASSWORD$].&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]The request for a new password was made from [$REMOTE_ADDRESS$] / [$REMOTE_HOST$].&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Sincerely,&lt;br /&gt;[$NEW_LINE$][$FROM_NAME$]&lt;br /&gt;[$NEW_LINE$][$FROM_ADDRESS$]&lt;br /&gt;[$NEW_LINE$][$PORTAL_URL$]</value></preference><preference><name>admin.email.verification.subject</name><value>[$PORTAL_URL$]: Email Address Verification</value></preference><preference><name>admin.default.role.names</name><value>Power User[$NEW_LINE$]User</value></preference><preference><name>company.security.strangers.with.mx</name><value>true</value></preference><preference><name>company.security.auto.login</name><value>true</value></preference><preference><name>facebook.connect.app.id</name><value>test@liferay.com</value></preference><preference><name>company.security.site.logo</name><value>true</value></preference><preference><name>terms.of.use.required</name><value>false</value></preference><preference><name>admin.email.password.sent.subject</name><value>[$PORTAL_URL$]: Your New Password</value></preference><preference><name>admin.email.password.reset.body</name><value>Dear [$TO_NAME$],&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]You can reset your password for [$PORTAL_URL$] at [$PASSWORD_RESET_URL$].&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]The request for a new password was made from [$REMOTE_ADDRESS$] / [$REMOTE_HOST$].&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Sincerely,&lt;br /&gt;[$NEW_LINE$][$FROM_NAME$]&lt;br /&gt;[$NEW_LINE$][$FROM_ADDRESS$]&lt;br /&gt;[$NEW_LINE$][$PORTAL_URL$]</value></preference><preference><name>linkedin.apikey</name><value>78ijjjw4r35z4c</value></preference><preference><name>company.security.send.password</name><value>true</value></preference><preference><name>linkedin.isprofileformpopupenabled</name><value>true</value></preference><preference><name>admin.email.verification.body</name><value>Dear [$TO_NAME$],&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Please verify your email address for [$PORTAL_URL$] at [$EMAIL_VERIFICATION_URL$].&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Your verification code is [$EMAIL_VERIFICATION_CODE$] Sincerely,&lt;br /&gt;[$NEW_LINE$][$FROM_NAME$]&lt;br /&gt;[$NEW_LINE$][$FROM_ADDRESS$]&lt;br /&gt;[$NEW_LINE$][$PORTAL_URL$]</value></preference><preference><name>admin.email.user.added.no.password.body</name><value>Dear [$TO_NAME$],&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Welcome! You recently created an account at [$PORTAL_URL$].&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Sincerely,&lt;br /&gt;[$NEW_LINE$][$FROM_NAME$]&lt;br /&gt;[$NEW_LINE$][$FROM_ADDRESS$]&lt;br /&gt;[$NEW_LINE$][$PORTAL_URL$]</value></preference><preference><name>linkedin.secretkey</name><value>iaavIoveWFwoFmKy</value></preference><preference><name>admin.email.user.added.body</name><value>Dear [$TO_NAME$],&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Welcome! You recently created an account at [$PORTAL_URL$]. Your password is [$USER_PASSWORD$]. Enjoy!&lt;br /&gt;[$NEW_LINE$]&lt;br /&gt;[$NEW_LINE$]Sincerely,&lt;br /&gt;[$NEW_LINE$][$FROM_NAME$]&lt;br /&gt;[$NEW_LINE$][$FROM_ADDRESS$]&lt;br /&gt;[$NEW_LINE$][$PORTAL_URL$]</value></preference><preference><name>company.security.strangers</name><value>true</value></preference><preference><name>company.security.auth.type</name><value>emailAddress</value></preference></portlet-preferences>'),
 (20433,20159,4,'<portlet-preferences />'),
 (20522,20199,4,'<portlet-preferences><preference><name>15#articles-order-by-col</name><value>id</value></preference><preference><name>129#password-policies-order-by-col</name><value>name</value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.pages</name><value>closed</value></preference><preference><name>125#users-order-by-col</name><value>last-name</value></preference><preference><name>com.liferay.portal.util.SessionTreeJSClicks#layoutsTree</name><value></value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.configuration</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#_145_portletCategory4</name><value>open</value></preference><preference><name>128#roles-order-by-col</name><value>title</value></preference><preference><name>129#password-policies-order-by-type</name><value>asc</value></preference><preference><name>128#roles-order-by-type</name><value>asc</value></preference><preference><name>com.liferay.portal.util.SessionClicks#dockbarMessagesHidden</name><value>1</value></preference><preference><name>15#articles-order-by-type</name><value>asc</value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.content</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#_145_portletCategory11</name><value>open</value></preference><preference><name>15#display-style</name><value>descriptive</value></preference><preference><name>com.liferay.portal.util.SessionClicks#_145_portletCategory8</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#liferay_toggle_controls</name><value>visible</value></preference><preference><name>com.liferay.portal.util.SessionClicks#panel-manage-site_administration.users</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#liferay_addpanel_tab</name><value>content</value></preference><preference><name>125#users-order-by-type</name><value>asc</value></preference><preference><name>125#user-groups-order-by-col</name><value>name</value></preference><preference><name>com.liferay.portal.util.SessionClicks#p_auth</name><value>f0XCC74c</value></preference><preference><name>125#user-groups-order-by-type</name><value>asc</value></preference><preference><name>com.liferay.portal.util.SessionClicks#vocabularyExtraFieldsPanelContainer</name><value>open</value></preference><preference><name>com.liferay.portal.util.SessionClicks#assetCategoryPropertiesPanel</name><value>open</value></preference></portlet-preferences>'),
 (24224,24213,4,'<portlet-preferences><preference><name>com.liferay.portal.util.SessionClicks#liferay_toggle_controls</name><value>hidden</value></preference><preference><name>com.liferay.portal.util.SessionClicks#p_auth</name><value>0GeehSpV</value></preference></portlet-preferences>');
/*!40000 ALTER TABLE `portalpreferences` ENABLE KEYS */;


--
-- Definition of table `portlet`
--

DROP TABLE IF EXISTS `portlet`;
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

--
-- Dumping data for table `portlet`
--

/*!40000 ALTER TABLE `portlet` DISABLE KEYS */;
INSERT INTO `portlet` (`id_`,`companyId`,`portletId`,`roles`,`active_`) VALUES 
 (20205,20155,'98','',0),
 (20206,20155,'183','',1),
 (20207,20155,'66','',1),
 (20208,20155,'180','',1),
 (20209,20155,'27','',1),
 (20210,20155,'152','',1),
 (20211,20155,'134','',1),
 (20212,20155,'130','',1),
 (20213,20155,'122','',1),
 (20214,20155,'36','',1),
 (20215,20155,'26','',1),
 (20216,20155,'175','',1),
 (20217,20155,'153','',1),
 (20218,20155,'64','',1),
 (20219,20155,'129','',1),
 (20220,20155,'182','',1),
 (20221,20155,'179','',1),
 (20222,20155,'173','',0),
 (20223,20155,'100','',1),
 (20224,20155,'19','',1),
 (20225,20155,'157','',1),
 (20226,20155,'181','',1),
 (20227,20155,'128','',1),
 (20228,20155,'154','',1),
 (20229,20155,'148','',1),
 (20230,20155,'11','',1),
 (20231,20155,'29','',1),
 (20232,20155,'158','',1),
 (20233,20155,'178','',1),
 (20234,20155,'58','',1),
 (20235,20155,'71','',1),
 (20236,20155,'97','',1),
 (20237,20155,'39','',1),
 (20238,20155,'85','',1),
 (20239,20155,'118','',1),
 (20240,20155,'107','',1),
 (20241,20155,'30','',1),
 (20242,20155,'184','',1),
 (20243,20155,'147','',1),
 (20244,20155,'48','',1),
 (20245,20155,'125','',1),
 (20246,20155,'161','',1),
 (20247,20155,'146','',1),
 (20248,20155,'62','',0),
 (20249,20155,'162','',1),
 (20250,20155,'176','',1),
 (20251,20155,'108','',1),
 (20252,20155,'187','',1),
 (20253,20155,'84','',1),
 (20254,20155,'101','',1),
 (20255,20155,'121','',1),
 (20256,20155,'143','',1),
 (20257,20155,'77','',1),
 (20258,20155,'167','',1),
 (20259,20155,'115','',1),
 (20260,20155,'56','',1),
 (20261,20155,'16','',1),
 (20262,20155,'3','',1),
 (20263,20155,'20','',1),
 (20264,20155,'23','',1),
 (20265,20155,'83','',1),
 (20266,20155,'99','',1),
 (20267,20155,'186','',1),
 (20268,20155,'194','',1),
 (20269,20155,'70','',1),
 (20270,20155,'164','',1),
 (20271,20155,'141','',1),
 (20272,20155,'9','',1),
 (20273,20155,'28','',1),
 (20274,20155,'137','',1),
 (20275,20155,'15','',1),
 (20276,20155,'47','',1),
 (20277,20155,'116','',1),
 (20278,20155,'82','',1),
 (20279,20155,'151','',1),
 (20280,20155,'54','',1),
 (20281,20155,'34','',1),
 (20282,20155,'132','',1),
 (20283,20155,'169','',1),
 (20284,20155,'61','',1),
 (20285,20155,'73','',1),
 (20286,20155,'50','',1),
 (20287,20155,'127','',1),
 (20288,20155,'193','',1),
 (20289,20155,'31','',1),
 (20290,20155,'25','',1),
 (20291,20155,'166','',1),
 (20292,20155,'33','',1),
 (20293,20155,'150','',1),
 (20294,20155,'114','',1),
 (20295,20155,'149','',1),
 (20296,20155,'67','',1),
 (20297,20155,'110','',1),
 (20298,20155,'59','',1),
 (20299,20155,'135','',1),
 (20300,20155,'188','',1),
 (20301,20155,'131','',1),
 (20302,20155,'102','',1),
 (20449,20155,'1_WAR_calendarportlet','',1),
 (20500,20155,'1_WAR_notificationsportlet','',1),
 (20505,20155,'4_WAR_opensocialportlet','',1),
 (20506,20155,'2_WAR_opensocialportlet','',1),
 (20507,20155,'1_WAR_opensocialportlet','',1),
 (20508,20155,'3_WAR_opensocialportlet','',1),
 (20515,20155,'1_WAR_webformportlet','',1),
 (21231,20155,'testcomponente_WAR_testcomponenteportlet','',1),
 (22575,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','',1),
 (23093,20155,'testcomponente2_WAR_testcomponente2portlet','',1),
 (23401,20155,'testcomponente3_WAR_testcomponente3portlet','',1),
 (23813,20155,'rec_WAR_recportlet','',1),
 (23814,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','',1);
/*!40000 ALTER TABLE `portlet` ENABLE KEYS */;


--
-- Definition of table `portletitem`
--

DROP TABLE IF EXISTS `portletitem`;
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

--
-- Dumping data for table `portletitem`
--

/*!40000 ALTER TABLE `portletitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `portletitem` ENABLE KEYS */;


--
-- Definition of table `portletpreferences`
--

DROP TABLE IF EXISTS `portletpreferences`;
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

--
-- Dumping data for table `portletpreferences`
--

/*!40000 ALTER TABLE `portletpreferences` DISABLE KEYS */;
INSERT INTO `portletpreferences` (`portletPreferencesId`,`ownerId`,`ownerType`,`plid`,`portletId`,`preferences`) VALUES 
 (20327,0,3,20320,'148_INSTANCE_QwYKSXpqC5Wk','<portlet-preferences><preference><name>showAssetCount</name><value>true</value></preference><preference><name>showZeroAssetCount</name><value>false</value></preference><preference><name>classNameId</name><value>20007</value></preference><preference><name>displayStyle</name><value>cloud</value></preference><preference><name>maxAssetTags</name><value>10</value></preference></portlet-preferences>'),
 (20348,0,3,20342,'141_INSTANCE_Uv0J0pJCdtEH','<portlet-preferences><preference><name>showAssetCount</name><value>true</value></preference><preference><name>classNameId</name><value>20016</value></preference></portlet-preferences>'),
 (20367,0,3,20361,'3','<portlet-preferences><preference><name>portletSetupShowBorders</name><value>false</value></preference></portlet-preferences>'),
 (20368,0,3,20361,'101_INSTANCE_2yWh9wL93hPN','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>anyAssetType</name><value>false</value></preference><preference><name>portletSetupTitle_en_US</name><value>Upcoming Events</value></preference></portlet-preferences>'),
 (20393,0,3,20387,'3','<portlet-preferences><preference><name>portletSetupShowBorders</name><value>false</value></preference></portlet-preferences>'),
 (20394,0,3,20387,'82','<portlet-preferences><preference><name>displayStyle</name><value>3</value></preference></portlet-preferences>'),
 (20395,0,3,20387,'101_INSTANCE_Ec28aTlGMIUU','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>portletSetupTitle_en_US</name><value>Recent Content</value></preference></portlet-preferences>'),
 (20402,0,3,20396,'20','<portlet-preferences><preference><name>portletSetupShowBorders</name><value>false</value></preference></portlet-preferences>'),
 (20403,0,3,20396,'101_INSTANCE_sA35cK7SEwJI','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>anyAssetType</name><value>false</value></preference><preference><name>portletSetupTitle_en_US</name><value>Upcoming Events</value></preference></portlet-preferences>'),
 (20410,0,3,20404,'39_INSTANCE_2Q9CgFFYf4CZ','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>expandedEntriesPerFeed</name><value>3</value></preference><preference><name>urls</name><value>http://partners.userland.com/nytRss/technology.xml</value></preference><preference><name>entriesPerFeed</name><value>4</value></preference><preference><name>portletSetupTitle_en_US</name><value>Technology news</value></preference></portlet-preferences>'),
 (20411,0,3,20404,'39_INSTANCE_tcHYhVp4tgLc','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>expandedEntriesPerFeed</name><value>0</value></preference><preference><name>urls</name><value>http://www.liferay.com/en/about-us/news/-/blogs/rss</value></preference><preference><name>titles</name><value>Liferay Press Releases</value></preference><preference><name>entriesPerFeed</name><value>4</value></preference><preference><name>portletSetupTitle_en_US</name><value>Liferay news</value></preference></portlet-preferences>'),
 (20523,0,3,20185,'145','<portlet-preferences />'),
 (20524,0,3,20185,'2_WAR_notificationsportlet','<portlet-preferences />'),
 (20624,20182,2,0,'20','<portlet-preferences />'),
 (20799,0,3,20176,'160','<portlet-preferences />'),
 (20800,0,3,20176,'156','<portlet-preferences />'),
 (20801,0,3,20176,'145','<portlet-preferences />'),
 (20802,0,3,20176,'2_WAR_notificationsportlet','<portlet-preferences />'),
 (23027,0,3,20185,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','<portlet-preferences />'),
 (23038,0,3,20176,'99','<portlet-preferences />'),
 (23044,0,3,20176,'147','<portlet-preferences />'),
 (23057,0,3,20176,'86','<portlet-preferences />'),
 (23058,0,3,20176,'15','<portlet-preferences />'),
 (23059,20182,2,0,'15','<portlet-preferences />'),
 (23087,0,3,20176,'4_WAR_opensocialportlet','<portlet-preferences />'),
 (23094,0,3,20176,'191','<portlet-preferences />'),
 (23095,0,3,20176,'174','<portlet-preferences />'),
 (23098,0,3,20176,'190','<portlet-preferences />'),
 (23099,0,3,20176,'125','<portlet-preferences />'),
 (23100,0,3,20176,'130','<portlet-preferences />'),
 (23101,0,3,20176,'127','<portlet-preferences />'),
 (23102,0,3,20176,'128','<portlet-preferences />'),
 (23122,0,3,20176,'3_WAR_marketplaceportlet','<portlet-preferences />'),
 (23123,20199,4,20176,'3_WAR_marketplaceportlet','<portlet-preferences />'),
 (23124,0,3,20176,'134','<portlet-preferences />'),
 (23125,20201,2,0,'15','<portlet-preferences />'),
 (23126,0,3,20176,'20','<portlet-preferences />'),
 (23127,20201,2,0,'20','<portlet-preferences />'),
 (23513,0,3,20176,'137','<portlet-preferences />'),
 (23876,0,3,20176,'139','<portlet-preferences />'),
 (23879,0,3,20176,'135','<portlet-preferences />'),
 (24206,0,3,20176,'129','<portlet-preferences />'),
 (24212,0,3,20176,'131','<portlet-preferences />'),
 (24226,0,3,20176,'2','<portlet-preferences />'),
 (24227,20195,2,0,'15','<portlet-preferences />'),
 (24228,0,3,20176,'165','<portlet-preferences />'),
 (24229,0,3,20185,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','<portlet-preferences />'),
 (24529,0,3,20387,'116','<portlet-preferences />'),
 (24545,0,3,24536,'101_INSTANCE_sA35cK7SEwJI','<portlet-preferences><preference><name>portletSetupUseCustomTitle</name><value>true</value></preference><preference><name>displayStyleGroupId</name><value></value></preference><preference><name>anyAssetType</name><value>false</value></preference><preference><name>portletSetupTitle_en_US</name><value>Upcoming Events</value></preference></portlet-preferences>'),
 (24550,0,3,20176,'149','<portlet-preferences />'),
 (24551,0,3,20176,'146','<portlet-preferences />'),
 (24554,0,3,24534,'145','<portlet-preferences />'),
 (24555,0,3,24534,'2_WAR_notificationsportlet','<portlet-preferences />'),
 (24556,24523,2,0,'20','<portlet-preferences />'),
 (24557,0,3,24536,'145','<portlet-preferences />'),
 (24558,0,3,24536,'2_WAR_notificationsportlet','<portlet-preferences />'),
 (24559,0,3,24538,'145','<portlet-preferences />'),
 (24560,0,3,24538,'2_WAR_notificationsportlet','<portlet-preferences />');
/*!40000 ALTER TABLE `portletpreferences` ENABLE KEYS */;


--
-- Definition of table `quartz_blob_triggers`
--

DROP TABLE IF EXISTS `quartz_blob_triggers`;
CREATE TABLE `quartz_blob_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `BLOB_DATA` longblob,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_blob_triggers`
--

/*!40000 ALTER TABLE `quartz_blob_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_blob_triggers` ENABLE KEYS */;


--
-- Definition of table `quartz_calendars`
--

DROP TABLE IF EXISTS `quartz_calendars`;
CREATE TABLE `quartz_calendars` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `CALENDAR_NAME` varchar(200) NOT NULL,
  `CALENDAR` longblob NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`CALENDAR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_calendars`
--

/*!40000 ALTER TABLE `quartz_calendars` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_calendars` ENABLE KEYS */;


--
-- Definition of table `quartz_cron_triggers`
--

DROP TABLE IF EXISTS `quartz_cron_triggers`;
CREATE TABLE `quartz_cron_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `CRON_EXPRESSION` varchar(200) NOT NULL,
  `TIME_ZONE_ID` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_cron_triggers`
--

/*!40000 ALTER TABLE `quartz_cron_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_cron_triggers` ENABLE KEYS */;


--
-- Definition of table `quartz_fired_triggers`
--

DROP TABLE IF EXISTS `quartz_fired_triggers`;
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

--
-- Dumping data for table `quartz_fired_triggers`
--

/*!40000 ALTER TABLE `quartz_fired_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_fired_triggers` ENABLE KEYS */;


--
-- Definition of table `quartz_job_details`
--

DROP TABLE IF EXISTS `quartz_job_details`;
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

--
-- Dumping data for table `quartz_job_details`
--

/*!40000 ALTER TABLE `quartz_job_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_job_details` ENABLE KEYS */;


--
-- Definition of table `quartz_locks`
--

DROP TABLE IF EXISTS `quartz_locks`;
CREATE TABLE `quartz_locks` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `LOCK_NAME` varchar(40) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`LOCK_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_locks`
--

/*!40000 ALTER TABLE `quartz_locks` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_locks` ENABLE KEYS */;


--
-- Definition of table `quartz_paused_trigger_grps`
--

DROP TABLE IF EXISTS `quartz_paused_trigger_grps`;
CREATE TABLE `quartz_paused_trigger_grps` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_paused_trigger_grps`
--

/*!40000 ALTER TABLE `quartz_paused_trigger_grps` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_paused_trigger_grps` ENABLE KEYS */;


--
-- Definition of table `quartz_scheduler_state`
--

DROP TABLE IF EXISTS `quartz_scheduler_state`;
CREATE TABLE `quartz_scheduler_state` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `INSTANCE_NAME` varchar(200) NOT NULL,
  `LAST_CHECKIN_TIME` bigint(20) NOT NULL,
  `CHECKIN_INTERVAL` bigint(20) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`INSTANCE_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_scheduler_state`
--

/*!40000 ALTER TABLE `quartz_scheduler_state` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_scheduler_state` ENABLE KEYS */;


--
-- Definition of table `quartz_simple_triggers`
--

DROP TABLE IF EXISTS `quartz_simple_triggers`;
CREATE TABLE `quartz_simple_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `REPEAT_COUNT` bigint(20) NOT NULL,
  `REPEAT_INTERVAL` bigint(20) NOT NULL,
  `TIMES_TRIGGERED` bigint(20) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quartz_simple_triggers`
--

/*!40000 ALTER TABLE `quartz_simple_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_simple_triggers` ENABLE KEYS */;


--
-- Definition of table `quartz_simprop_triggers`
--

DROP TABLE IF EXISTS `quartz_simprop_triggers`;
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

--
-- Dumping data for table `quartz_simprop_triggers`
--

/*!40000 ALTER TABLE `quartz_simprop_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_simprop_triggers` ENABLE KEYS */;


--
-- Definition of table `quartz_triggers`
--

DROP TABLE IF EXISTS `quartz_triggers`;
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

--
-- Dumping data for table `quartz_triggers`
--

/*!40000 ALTER TABLE `quartz_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `quartz_triggers` ENABLE KEYS */;


--
-- Definition of table `ratingsentry`
--

DROP TABLE IF EXISTS `ratingsentry`;
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

--
-- Dumping data for table `ratingsentry`
--

/*!40000 ALTER TABLE `ratingsentry` DISABLE KEYS */;
INSERT INTO `ratingsentry` (`entryId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`score`) VALUES 
 (23080,20155,20199,'Test Test','2016-03-09 04:13:30','2016-03-09 04:13:30',20109,23065,4),
 (23149,20155,20199,'Test Test','2016-03-09 04:35:31','2016-03-09 04:35:32',20116,23083,1),
 (23153,20155,20199,'Test Test','2016-03-09 04:35:36','2016-03-09 04:35:36',20116,23085,1),
 (23303,20155,20199,'Test Test','2016-03-09 05:45:40','2016-03-09 05:45:40',20116,23301,-1),
 (23309,20155,20199,'Test Test','2016-03-09 06:17:50','2016-03-09 06:17:50',20116,23307,-1),
 (23311,20155,20199,'Test Test','2016-03-09 06:17:50','2016-03-09 06:17:50',20116,23305,1);
/*!40000 ALTER TABLE `ratingsentry` ENABLE KEYS */;


--
-- Definition of table `ratingsstats`
--

DROP TABLE IF EXISTS `ratingsstats`;
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

--
-- Dumping data for table `ratingsstats`
--

/*!40000 ALTER TABLE `ratingsstats` DISABLE KEYS */;
INSERT INTO `ratingsstats` (`statsId`,`classNameId`,`classPK`,`totalEntries`,`totalScore`,`averageScore`) VALUES 
 (23062,20013,23060,0,0,0),
 (23068,20109,23065,1,4,4),
 (23090,20012,23088,0,0,0),
 (23138,20013,23136,0,0,0),
 (23144,20109,23141,0,0,0),
 (23150,20116,23083,1,1,1),
 (23152,20116,23085,1,1,1),
 (23220,20109,23063,0,0,0),
 (23304,20116,23301,1,-1,-1),
 (23310,20116,23307,1,-1,-1),
 (23312,20116,23305,1,1,1),
 (23417,0,0,0,0,0);
/*!40000 ALTER TABLE `ratingsstats` ENABLE KEYS */;


--
-- Definition of table `rec_foo`
--

DROP TABLE IF EXISTS `rec_foo`;
CREATE TABLE `rec_foo` (
  `fooId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `userId` bigint(20) DEFAULT NULL,
  `userName` varchar(75) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `modifiedDate` datetime DEFAULT NULL,
  `field1` varchar(75) DEFAULT NULL,
  `field2` tinyint(4) DEFAULT NULL,
  `field3` int(11) DEFAULT NULL,
  `field4` datetime DEFAULT NULL,
  `field5` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`fooId`),
  KEY `IX_14DC8D69` (`field2`),
  KEY `IX_E53D5D89` (`field2`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rec_foo`
--

/*!40000 ALTER TABLE `rec_foo` DISABLE KEYS */;
INSERT INTO `rec_foo` (`fooId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`field1`,`field2`,`field3`,`field4`,`field5`) VALUES 
 (0,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (1,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (2,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (3,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (4,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (5,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (6,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (7,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (8,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (9,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (10,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (11,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (12,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (13,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (14,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (15,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (16,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (17,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (18,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (101,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (102,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (103,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (104,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (105,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (106,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (107,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (108,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (109,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (110,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (111,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (112,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (113,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (114,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (115,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (116,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (117,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (118,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (119,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (120,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (121,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (122,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (123,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (24234,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (24235,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (24236,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa'),
 (24237,0,0,0,'',NULL,NULL,'',0,0,NULL,'holaaa');
/*!40000 ALTER TABLE `rec_foo` ENABLE KEYS */;


--
-- Definition of table `region`
--

DROP TABLE IF EXISTS `region`;
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

--
-- Dumping data for table `region`
--

/*!40000 ALTER TABLE `region` DISABLE KEYS */;
INSERT INTO `region` (`regionId`,`countryId`,`regionCode`,`name`,`active_`) VALUES 
 (1001,1,'AB','Alberta',1),
 (1002,1,'BC','British Columbia',1),
 (1003,1,'MB','Manitoba',1),
 (1004,1,'NB','New Brunswick',1),
 (1005,1,'NL','Newfoundland and Labrador',1),
 (1006,1,'NT','Northwest Territories',1),
 (1007,1,'NS','Nova Scotia',1),
 (1008,1,'NU','Nunavut',1),
 (1009,1,'ON','Ontario',1),
 (1010,1,'PE','Prince Edward Island',1),
 (1011,1,'QC','Quebec',1),
 (1012,1,'SK','Saskatchewan',1),
 (1013,1,'YT','Yukon',1),
 (2001,2,'CN-34','Anhui',1),
 (2002,2,'CN-92','Aomen',1),
 (2003,2,'CN-11','Beijing',1),
 (2004,2,'CN-50','Chongqing',1),
 (2005,2,'CN-35','Fujian',1),
 (2006,2,'CN-62','Gansu',1),
 (2007,2,'CN-44','Guangdong',1),
 (2008,2,'CN-45','Guangxi',1),
 (2009,2,'CN-52','Guizhou',1),
 (2010,2,'CN-46','Hainan',1),
 (2011,2,'CN-13','Hebei',1),
 (2012,2,'CN-23','Heilongjiang',1),
 (2013,2,'CN-41','Henan',1),
 (2014,2,'CN-42','Hubei',1),
 (2015,2,'CN-43','Hunan',1),
 (2016,2,'CN-32','Jiangsu',1),
 (2017,2,'CN-36','Jiangxi',1),
 (2018,2,'CN-22','Jilin',1),
 (2019,2,'CN-21','Liaoning',1),
 (2020,2,'CN-15','Nei Mongol',1),
 (2021,2,'CN-64','Ningxia',1),
 (2022,2,'CN-63','Qinghai',1),
 (2023,2,'CN-61','Shaanxi',1),
 (2024,2,'CN-37','Shandong',1),
 (2025,2,'CN-31','Shanghai',1),
 (2026,2,'CN-14','Shanxi',1),
 (2027,2,'CN-51','Sichuan',1),
 (2028,2,'CN-71','Taiwan',1),
 (2029,2,'CN-12','Tianjin',1),
 (2030,2,'CN-91','Xianggang',1),
 (2031,2,'CN-65','Xinjiang',1),
 (2032,2,'CN-54','Xizang',1),
 (2033,2,'CN-53','Yunnan',1),
 (2034,2,'CN-33','Zhejiang',1),
 (3001,3,'A','Alsace',1),
 (3002,3,'B','Aquitaine',1),
 (3003,3,'C','Auvergne',1),
 (3004,3,'P','Basse-Normandie',1),
 (3005,3,'D','Bourgogne',1),
 (3006,3,'E','Bretagne',1),
 (3007,3,'F','Centre',1),
 (3008,3,'G','Champagne-Ardenne',1),
 (3009,3,'H','Corse',1),
 (3010,3,'GF','Guyane',1),
 (3011,3,'I','Franche Comté',1),
 (3012,3,'GP','Guadeloupe',1),
 (3013,3,'Q','Haute-Normandie',1),
 (3014,3,'J','Île-de-France',1),
 (3015,3,'K','Languedoc-Roussillon',1),
 (3016,3,'L','Limousin',1),
 (3017,3,'M','Lorraine',1),
 (3018,3,'MQ','Martinique',1),
 (3019,3,'N','Midi-Pyrénées',1),
 (3020,3,'O','Nord Pas de Calais',1),
 (3021,3,'R','Pays de la Loire',1),
 (3022,3,'S','Picardie',1),
 (3023,3,'T','Poitou-Charentes',1),
 (3024,3,'U','Provence-Alpes-Côte-d\'Azur',1),
 (3025,3,'RE','Réunion',1),
 (3026,3,'V','Rhône-Alpes',1),
 (4001,4,'BW','Baden-Württemberg',1),
 (4002,4,'BY','Bayern',1),
 (4003,4,'BE','Berlin',1),
 (4004,4,'BB','Brandenburg',1),
 (4005,4,'HB','Bremen',1),
 (4006,4,'HH','Hamburg',1),
 (4007,4,'HE','Hessen',1),
 (4008,4,'MV','Mecklenburg-Vorpommern',1),
 (4009,4,'NI','Niedersachsen',1),
 (4010,4,'NW','Nordrhein-Westfalen',1),
 (4011,4,'RP','Rheinland-Pfalz',1),
 (4012,4,'SL','Saarland',1),
 (4013,4,'SN','Sachsen',1),
 (4014,4,'ST','Sachsen-Anhalt',1),
 (4015,4,'SH','Schleswig-Holstein',1),
 (4016,4,'TH','Thüringen',1),
 (8001,8,'AG','Agrigento',1),
 (8002,8,'AL','Alessandria',1),
 (8003,8,'AN','Ancona',1),
 (8004,8,'AO','Aosta',1),
 (8005,8,'AR','Arezzo',1),
 (8006,8,'AP','Ascoli Piceno',1),
 (8007,8,'AT','Asti',1),
 (8008,8,'AV','Avellino',1),
 (8009,8,'BA','Bari',1),
 (8010,8,'BT','Barletta-Andria-Trani',1),
 (8011,8,'BL','Belluno',1),
 (8012,8,'BN','Benevento',1),
 (8013,8,'BG','Bergamo',1),
 (8014,8,'BI','Biella',1),
 (8015,8,'BO','Bologna',1),
 (8016,8,'BZ','Bolzano',1),
 (8017,8,'BS','Brescia',1),
 (8018,8,'BR','Brindisi',1),
 (8019,8,'CA','Cagliari',1),
 (8020,8,'CL','Caltanissetta',1),
 (8021,8,'CB','Campobasso',1),
 (8022,8,'CI','Carbonia-Iglesias',1),
 (8023,8,'CE','Caserta',1),
 (8024,8,'CT','Catania',1),
 (8025,8,'CZ','Catanzaro',1),
 (8026,8,'CH','Chieti',1),
 (8027,8,'CO','Como',1),
 (8028,8,'CS','Cosenza',1),
 (8029,8,'CR','Cremona',1),
 (8030,8,'KR','Crotone',1),
 (8031,8,'CN','Cuneo',1),
 (8032,8,'EN','Enna',1),
 (8033,8,'FM','Fermo',1),
 (8034,8,'FE','Ferrara',1),
 (8035,8,'FI','Firenze',1),
 (8036,8,'FG','Foggia',1),
 (8037,8,'FC','Forli-Cesena',1),
 (8038,8,'FR','Frosinone',1),
 (8039,8,'GE','Genova',1),
 (8040,8,'GO','Gorizia',1),
 (8041,8,'GR','Grosseto',1),
 (8042,8,'IM','Imperia',1),
 (8043,8,'IS','Isernia',1),
 (8044,8,'AQ','L\'Aquila',1),
 (8045,8,'SP','La Spezia',1),
 (8046,8,'LT','Latina',1),
 (8047,8,'LE','Lecce',1),
 (8048,8,'LC','Lecco',1),
 (8049,8,'LI','Livorno',1),
 (8050,8,'LO','Lodi',1),
 (8051,8,'LU','Lucca',1),
 (8052,8,'MC','Macerata',1),
 (8053,8,'MN','Mantova',1),
 (8054,8,'MS','Massa-Carrara',1),
 (8055,8,'MT','Matera',1),
 (8056,8,'MA','Medio Campidano',1),
 (8057,8,'ME','Messina',1),
 (8058,8,'MI','Milano',1),
 (8059,8,'MO','Modena',1),
 (8060,8,'MB','Monza e Brianza',1),
 (8061,8,'NA','Napoli',1),
 (8062,8,'NO','Novara',1),
 (8063,8,'NU','Nuoro',1),
 (8064,8,'OG','Ogliastra',1),
 (8065,8,'OT','Olbia-Tempio',1),
 (8066,8,'OR','Oristano',1),
 (8067,8,'PD','Padova',1),
 (8068,8,'PA','Palermo',1),
 (8069,8,'PR','Parma',1),
 (8070,8,'PV','Pavia',1),
 (8071,8,'PG','Perugia',1),
 (8072,8,'PU','Pesaro e Urbino',1),
 (8073,8,'PE','Pescara',1),
 (8074,8,'PC','Piacenza',1),
 (8075,8,'PI','Pisa',1),
 (8076,8,'PT','Pistoia',1),
 (8077,8,'PN','Pordenone',1),
 (8078,8,'PZ','Potenza',1),
 (8079,8,'PO','Prato',1),
 (8080,8,'RG','Ragusa',1),
 (8081,8,'RA','Ravenna',1),
 (8082,8,'RC','Reggio Calabria',1),
 (8083,8,'RE','Reggio Emilia',1),
 (8084,8,'RI','Rieti',1),
 (8085,8,'RN','Rimini',1),
 (8086,8,'RM','Roma',1),
 (8087,8,'RO','Rovigo',1),
 (8088,8,'SA','Salerno',1),
 (8089,8,'SS','Sassari',1),
 (8090,8,'SV','Savona',1),
 (8091,8,'SI','Siena',1),
 (8092,8,'SR','Siracusa',1),
 (8093,8,'SO','Sondrio',1),
 (8094,8,'TA','Taranto',1),
 (8095,8,'TE','Teramo',1),
 (8096,8,'TR','Terni',1),
 (8097,8,'TO','Torino',1),
 (8098,8,'TP','Trapani',1),
 (8099,8,'TN','Trento',1),
 (8100,8,'TV','Treviso',1),
 (8101,8,'TS','Trieste',1),
 (8102,8,'UD','Udine',1),
 (8103,8,'VA','Varese',1),
 (8104,8,'VE','Venezia',1),
 (8105,8,'VB','Verbano-Cusio-Ossola',1),
 (8106,8,'VC','Vercelli',1),
 (8107,8,'VR','Verona',1),
 (8108,8,'VV','Vibo Valentia',1),
 (8109,8,'VI','Vicenza',1),
 (8110,8,'VT','Viterbo',1),
 (11001,11,'DR','Drenthe',1),
 (11002,11,'FL','Flevoland',1),
 (11003,11,'FR','Friesland',1),
 (11004,11,'GE','Gelderland',1),
 (11005,11,'GR','Groningen',1),
 (11006,11,'LI','Limburg',1),
 (11007,11,'NB','Noord-Brabant',1),
 (11008,11,'NH','Noord-Holland',1),
 (11009,11,'OV','Overijssel',1),
 (11010,11,'UT','Utrecht',1),
 (11011,11,'ZE','Zeeland',1),
 (11012,11,'ZH','Zuid-Holland',1),
 (15001,15,'AN','Andalusia',1),
 (15002,15,'AR','Aragon',1),
 (15003,15,'AS','Asturias',1),
 (15004,15,'IB','Balearic Islands',1),
 (15005,15,'PV','Basque Country',1),
 (15006,15,'CN','Canary Islands',1),
 (15007,15,'CB','Cantabria',1),
 (15008,15,'CL','Castile and Leon',1),
 (15009,15,'CM','Castile-La Mancha',1),
 (15010,15,'CT','Catalonia',1),
 (15011,15,'CE','Ceuta',1),
 (15012,15,'EX','Extremadura',1),
 (15013,15,'GA','Galicia',1),
 (15014,15,'LO','La Rioja',1),
 (15015,15,'M','Madrid',1),
 (15016,15,'ML','Melilla',1),
 (15017,15,'MU','Murcia',1),
 (15018,15,'NA','Navarra',1),
 (15019,15,'VC','Valencia',1),
 (19001,19,'AL','Alabama',1),
 (19002,19,'AK','Alaska',1),
 (19003,19,'AZ','Arizona',1),
 (19004,19,'AR','Arkansas',1),
 (19005,19,'CA','California',1),
 (19006,19,'CO','Colorado',1),
 (19007,19,'CT','Connecticut',1),
 (19008,19,'DC','District of Columbia',1),
 (19009,19,'DE','Delaware',1),
 (19010,19,'FL','Florida',1),
 (19011,19,'GA','Georgia',1),
 (19012,19,'HI','Hawaii',1),
 (19013,19,'ID','Idaho',1),
 (19014,19,'IL','Illinois',1),
 (19015,19,'IN','Indiana',1),
 (19016,19,'IA','Iowa',1),
 (19017,19,'KS','Kansas',1),
 (19018,19,'KY','Kentucky ',1),
 (19019,19,'LA','Louisiana ',1),
 (19020,19,'ME','Maine',1),
 (19021,19,'MD','Maryland',1),
 (19022,19,'MA','Massachusetts',1),
 (19023,19,'MI','Michigan',1),
 (19024,19,'MN','Minnesota',1),
 (19025,19,'MS','Mississippi',1),
 (19026,19,'MO','Missouri',1),
 (19027,19,'MT','Montana',1),
 (19028,19,'NE','Nebraska',1),
 (19029,19,'NV','Nevada',1),
 (19030,19,'NH','New Hampshire',1),
 (19031,19,'NJ','New Jersey',1),
 (19032,19,'NM','New Mexico',1),
 (19033,19,'NY','New York',1),
 (19034,19,'NC','North Carolina',1),
 (19035,19,'ND','North Dakota',1),
 (19036,19,'OH','Ohio',1),
 (19037,19,'OK','Oklahoma ',1),
 (19038,19,'OR','Oregon',1),
 (19039,19,'PA','Pennsylvania',1),
 (19040,19,'PR','Puerto Rico',1),
 (19041,19,'RI','Rhode Island',1),
 (19042,19,'SC','South Carolina',1),
 (19043,19,'SD','South Dakota',1),
 (19044,19,'TN','Tennessee',1),
 (19045,19,'TX','Texas',1),
 (19046,19,'UT','Utah',1),
 (19047,19,'VT','Vermont',1),
 (19048,19,'VA','Virginia',1),
 (19049,19,'WA','Washington',1),
 (19050,19,'WV','West Virginia',1),
 (19051,19,'WI','Wisconsin',1),
 (19052,19,'WY','Wyoming',1),
 (32001,32,'ACT','Australian Capital Territory',1),
 (32002,32,'NSW','New South Wales',1),
 (32003,32,'NT','Northern Territory',1),
 (32004,32,'QLD','Queensland',1),
 (32005,32,'SA','South Australia',1),
 (32006,32,'TAS','Tasmania',1),
 (32007,32,'VIC','Victoria',1),
 (32008,32,'WA','Western Australia',1),
 (144001,144,'MX-AGS','Aguascalientes',1),
 (144002,144,'MX-BCN','Baja California',1),
 (144003,144,'MX-BCS','Baja California Sur',1),
 (144004,144,'MX-CAM','Campeche',1),
 (144005,144,'MX-CHP','Chiapas',1),
 (144006,144,'MX-CHI','Chihuahua',1),
 (144007,144,'MX-COA','Coahuila',1),
 (144008,144,'MX-COL','Colima',1),
 (144009,144,'MX-DUR','Durango',1),
 (144010,144,'MX-GTO','Guanajuato',1),
 (144011,144,'MX-GRO','Guerrero',1),
 (144012,144,'MX-HGO','Hidalgo',1),
 (144013,144,'MX-JAL','Jalisco',1),
 (144014,144,'MX-MEX','Mexico',1),
 (144015,144,'MX-MIC','Michoacan',1),
 (144016,144,'MX-MOR','Morelos',1),
 (144017,144,'MX-NAY','Nayarit',1),
 (144018,144,'MX-NLE','Nuevo Leon',1),
 (144019,144,'MX-OAX','Oaxaca',1),
 (144020,144,'MX-PUE','Puebla',1),
 (144021,144,'MX-QRO','Queretaro',1),
 (144023,144,'MX-ROO','Quintana Roo',1),
 (144024,144,'MX-SLP','San Luis Potosí',1),
 (144025,144,'MX-SIN','Sinaloa',1),
 (144026,144,'MX-SON','Sonora',1),
 (144027,144,'MX-TAB','Tabasco',1),
 (144028,144,'MX-TAM','Tamaulipas',1),
 (144029,144,'MX-TLX','Tlaxcala',1),
 (144030,144,'MX-VER','Veracruz',1),
 (144031,144,'MX-YUC','Yucatan',1),
 (144032,144,'MX-ZAC','Zacatecas',1),
 (164001,164,'01','Østfold',1),
 (164002,164,'02','Akershus',1),
 (164003,164,'03','Oslo',1),
 (164004,164,'04','Hedmark',1),
 (164005,164,'05','Oppland',1),
 (164006,164,'06','Buskerud',1),
 (164007,164,'07','Vestfold',1),
 (164008,164,'08','Telemark',1),
 (164009,164,'09','Aust-Agder',1),
 (164010,164,'10','Vest-Agder',1),
 (164011,164,'11','Rogaland',1),
 (164012,164,'12','Hordaland',1),
 (164013,164,'14','Sogn og Fjordane',1),
 (164014,164,'15','Møre of Romsdal',1),
 (164015,164,'16','Sør-Trøndelag',1),
 (164016,164,'17','Nord-Trøndelag',1),
 (164017,164,'18','Nordland',1),
 (164018,164,'19','Troms',1),
 (164019,164,'20','Finnmark',1),
 (202001,202,'AG','Aargau',1),
 (202002,202,'AR','Appenzell Ausserrhoden',1),
 (202003,202,'AI','Appenzell Innerrhoden',1),
 (202004,202,'BL','Basel-Landschaft',1),
 (202005,202,'BS','Basel-Stadt',1),
 (202006,202,'BE','Bern',1),
 (202007,202,'FR','Fribourg',1),
 (202008,202,'GE','Geneva',1),
 (202009,202,'GL','Glarus',1),
 (202010,202,'GR','Graubünden',1),
 (202011,202,'JU','Jura',1),
 (202012,202,'LU','Lucerne',1),
 (202013,202,'NE','Neuchâtel',1),
 (202014,202,'NW','Nidwalden',1),
 (202015,202,'OW','Obwalden',1),
 (202016,202,'SH','Schaffhausen',1),
 (202017,202,'SZ','Schwyz',1),
 (202018,202,'SO','Solothurn',1),
 (202019,202,'SG','St. Gallen',1),
 (202020,202,'TG','Thurgau',1),
 (202021,202,'TI','Ticino',1),
 (202022,202,'UR','Uri',1),
 (202023,202,'VS','Valais',1),
 (202024,202,'VD','Vaud',1),
 (202025,202,'ZG','Zug',1),
 (202026,202,'ZH','Zürich',1);
/*!40000 ALTER TABLE `region` ENABLE KEYS */;


--
-- Definition of table `release_`
--

DROP TABLE IF EXISTS `release_`;
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

--
-- Dumping data for table `release_`
--

/*!40000 ALTER TABLE `release_` DISABLE KEYS */;
INSERT INTO `release_` (`releaseId`,`createDate`,`modifiedDate`,`servletContextName`,`buildNumber`,`buildDate`,`verified`,`state_`,`testString`) VALUES 
 (1,'2016-03-06 07:54:43','2016-04-02 04:12:13','portal',6205,'2016-04-02 04:12:13',1,0,'You take the blue pill, the story ends, you wake up in your bed and believe whatever you want to believe. You take the red pill, you stay in Wonderland, and I show you how deep the rabbit hole goes.'),
 (20440,'2016-03-06 16:10:04','2016-04-02 04:13:26','marketplace-portlet',100,NULL,1,0,''),
 (20448,'2016-03-06 16:10:09','2016-04-02 04:13:27','calendar-portlet',102,NULL,1,0,''),
 (20467,'2016-03-06 16:10:26','2016-04-02 04:13:32','kaleo-web',110,NULL,1,0,''),
 (20499,'2016-03-06 16:10:28','2016-04-02 04:13:40','notifications-portlet',110,NULL,1,0,''),
 (20514,'2016-03-06 16:10:34','2016-04-02 04:14:51','sync-web',101,NULL,1,0,'');
/*!40000 ALTER TABLE `release_` ENABLE KEYS */;


--
-- Definition of table `repository`
--

DROP TABLE IF EXISTS `repository`;
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

--
-- Dumping data for table `repository`
--

/*!40000 ALTER TABLE `repository` DISABLE KEYS */;
/*!40000 ALTER TABLE `repository` ENABLE KEYS */;


--
-- Definition of table `repositoryentry`
--

DROP TABLE IF EXISTS `repositoryentry`;
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

--
-- Dumping data for table `repositoryentry`
--

/*!40000 ALTER TABLE `repositoryentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `repositoryentry` ENABLE KEYS */;


--
-- Definition of table `resourceaction`
--

DROP TABLE IF EXISTS `resourceaction`;
CREATE TABLE `resourceaction` (
  `resourceActionId` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `actionId` varchar(75) DEFAULT NULL,
  `bitwiseValue` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`resourceActionId`),
  UNIQUE KEY `IX_EDB9986E` (`name`,`actionId`),
  KEY `IX_81F2DB09` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `resourceaction`
--

/*!40000 ALTER TABLE `resourceaction` DISABLE KEYS */;
INSERT INTO `resourceaction` (`resourceActionId`,`name`,`actionId`,`bitwiseValue`) VALUES 
 (1,'com.liferay.portlet.softwarecatalog','ADD_FRAMEWORK_VERSION',2),
 (2,'com.liferay.portlet.softwarecatalog','ADD_PRODUCT_ENTRY',4),
 (3,'com.liferay.portlet.softwarecatalog','PERMISSIONS',8),
 (4,'com.liferay.portal.model.Team','ASSIGN_MEMBERS',2),
 (5,'com.liferay.portal.model.Team','DELETE',4),
 (6,'com.liferay.portal.model.Team','PERMISSIONS',8),
 (7,'com.liferay.portal.model.Team','UPDATE',16),
 (8,'com.liferay.portal.model.Team','VIEW',1),
 (9,'com.liferay.portal.model.PasswordPolicy','ASSIGN_MEMBERS',2),
 (10,'com.liferay.portal.model.PasswordPolicy','DELETE',4),
 (11,'com.liferay.portal.model.PasswordPolicy','PERMISSIONS',8),
 (12,'com.liferay.portal.model.PasswordPolicy','UPDATE',16),
 (13,'com.liferay.portal.model.PasswordPolicy','VIEW',1),
 (14,'com.liferay.portlet.blogs.model.BlogsEntry','ADD_DISCUSSION',2),
 (15,'com.liferay.portlet.blogs.model.BlogsEntry','DELETE',4),
 (16,'com.liferay.portlet.blogs.model.BlogsEntry','DELETE_DISCUSSION',8),
 (17,'com.liferay.portlet.blogs.model.BlogsEntry','PERMISSIONS',16),
 (18,'com.liferay.portlet.blogs.model.BlogsEntry','UPDATE',32),
 (19,'com.liferay.portlet.blogs.model.BlogsEntry','UPDATE_DISCUSSION',64),
 (20,'com.liferay.portlet.blogs.model.BlogsEntry','VIEW',1),
 (21,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','DELETE',2),
 (22,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','PERMISSIONS',4),
 (23,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','UPDATE',8),
 (24,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate','VIEW',1),
 (25,'com.liferay.portlet.journal.model.JournalFeed','DELETE',2),
 (26,'com.liferay.portlet.journal.model.JournalFeed','PERMISSIONS',4),
 (27,'com.liferay.portlet.journal.model.JournalFeed','UPDATE',8),
 (28,'com.liferay.portlet.journal.model.JournalFeed','VIEW',1),
 (29,'com.liferay.portlet.wiki.model.WikiNode','ADD_ATTACHMENT',2),
 (30,'com.liferay.portlet.wiki.model.WikiNode','ADD_PAGE',4),
 (31,'com.liferay.portlet.wiki.model.WikiNode','DELETE',8),
 (32,'com.liferay.portlet.wiki.model.WikiNode','IMPORT',16),
 (33,'com.liferay.portlet.wiki.model.WikiNode','PERMISSIONS',32),
 (34,'com.liferay.portlet.wiki.model.WikiNode','SUBSCRIBE',64),
 (35,'com.liferay.portlet.wiki.model.WikiNode','UPDATE',128),
 (36,'com.liferay.portlet.wiki.model.WikiNode','VIEW',1),
 (37,'com.liferay.portlet.announcements.model.AnnouncementsEntry','DELETE',2),
 (38,'com.liferay.portlet.announcements.model.AnnouncementsEntry','UPDATE',4),
 (39,'com.liferay.portlet.announcements.model.AnnouncementsEntry','VIEW',1),
 (40,'com.liferay.portlet.announcements.model.AnnouncementsEntry','PERMISSIONS',8),
 (41,'com.liferay.portlet.bookmarks','ADD_ENTRY',2),
 (42,'com.liferay.portlet.bookmarks','ADD_FOLDER',4),
 (43,'com.liferay.portlet.bookmarks','PERMISSIONS',8),
 (44,'com.liferay.portlet.bookmarks','SUBSCRIBE',16),
 (45,'com.liferay.portlet.bookmarks','VIEW',1),
 (46,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','DELETE',2),
 (47,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','PERMISSIONS',4),
 (48,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','UPDATE',8),
 (49,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroupInstance','VIEW',1),
 (50,'com.liferay.portlet.asset.model.AssetVocabulary','DELETE',2),
 (51,'com.liferay.portlet.asset.model.AssetVocabulary','PERMISSIONS',4),
 (52,'com.liferay.portlet.asset.model.AssetVocabulary','UPDATE',8),
 (53,'com.liferay.portlet.asset.model.AssetVocabulary','VIEW',1),
 (54,'com.liferay.portlet.documentlibrary.model.DLFolder','ACCESS',2),
 (55,'com.liferay.portlet.documentlibrary.model.DLFolder','ADD_DOCUMENT',4),
 (56,'com.liferay.portlet.documentlibrary.model.DLFolder','ADD_SHORTCUT',8),
 (57,'com.liferay.portlet.documentlibrary.model.DLFolder','ADD_SUBFOLDER',16),
 (58,'com.liferay.portlet.documentlibrary.model.DLFolder','DELETE',32),
 (59,'com.liferay.portlet.documentlibrary.model.DLFolder','PERMISSIONS',64),
 (60,'com.liferay.portlet.documentlibrary.model.DLFolder','UPDATE',128),
 (61,'com.liferay.portlet.documentlibrary.model.DLFolder','VIEW',1),
 (62,'com.liferay.portlet.expando.model.ExpandoColumn','DELETE',2),
 (63,'com.liferay.portlet.expando.model.ExpandoColumn','PERMISSIONS',4),
 (64,'com.liferay.portlet.expando.model.ExpandoColumn','UPDATE',8),
 (65,'com.liferay.portlet.expando.model.ExpandoColumn','VIEW',1),
 (66,'com.liferay.portlet.documentlibrary','ADD_DOCUMENT',2),
 (67,'com.liferay.portlet.documentlibrary','ADD_DOCUMENT_TYPE',4),
 (68,'com.liferay.portlet.documentlibrary','ADD_FOLDER',8),
 (69,'com.liferay.portlet.documentlibrary','ADD_REPOSITORY',16),
 (70,'com.liferay.portlet.documentlibrary','ADD_STRUCTURE',32),
 (71,'com.liferay.portlet.documentlibrary','ADD_SHORTCUT',64),
 (72,'com.liferay.portlet.documentlibrary','PERMISSIONS',128),
 (73,'com.liferay.portlet.documentlibrary','SUBSCRIBE',256),
 (74,'com.liferay.portlet.documentlibrary','UPDATE',512),
 (75,'com.liferay.portlet.documentlibrary','VIEW',1),
 (76,'com.liferay.portlet.calendar.model.CalEvent','ADD_DISCUSSION',2),
 (77,'com.liferay.portlet.calendar.model.CalEvent','DELETE',4),
 (78,'com.liferay.portlet.calendar.model.CalEvent','DELETE_DISCUSSION',8),
 (79,'com.liferay.portlet.calendar.model.CalEvent','PERMISSIONS',16),
 (80,'com.liferay.portlet.calendar.model.CalEvent','UPDATE',32),
 (81,'com.liferay.portlet.calendar.model.CalEvent','UPDATE_DISCUSSION',64),
 (82,'com.liferay.portlet.calendar.model.CalEvent','VIEW',1),
 (83,'com.liferay.portlet.shopping.model.ShoppingCategory','ADD_ITEM',2),
 (84,'com.liferay.portlet.shopping.model.ShoppingCategory','ADD_SUBCATEGORY',4),
 (85,'com.liferay.portlet.shopping.model.ShoppingCategory','DELETE',8),
 (86,'com.liferay.portlet.shopping.model.ShoppingCategory','PERMISSIONS',16),
 (87,'com.liferay.portlet.shopping.model.ShoppingCategory','UPDATE',32),
 (88,'com.liferay.portlet.shopping.model.ShoppingCategory','VIEW',1),
 (89,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','DELETE',2),
 (90,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','PERMISSIONS',4),
 (91,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','UPDATE',8),
 (92,'com.liferay.portlet.documentlibrary.model.DLFileShortcut','VIEW',1),
 (93,'com.liferay.portlet.journal','ADD_ARTICLE',2),
 (94,'com.liferay.portlet.journal','ADD_FEED',4),
 (95,'com.liferay.portlet.journal','ADD_FOLDER',8),
 (96,'com.liferay.portlet.journal','ADD_STRUCTURE',16),
 (97,'com.liferay.portlet.journal','ADD_TEMPLATE',32),
 (98,'com.liferay.portlet.journal','SUBSCRIBE',64),
 (99,'com.liferay.portlet.journal','VIEW',1),
 (100,'com.liferay.portlet.journal','PERMISSIONS',128),
 (101,'com.liferay.portlet.calendar','ADD_EVENT',2),
 (102,'com.liferay.portlet.calendar','EXPORT_ALL_EVENTS',4),
 (103,'com.liferay.portlet.calendar','PERMISSIONS',8),
 (104,'com.liferay.portal.model.LayoutPrototype','DELETE',2),
 (105,'com.liferay.portal.model.LayoutPrototype','PERMISSIONS',4),
 (106,'com.liferay.portal.model.LayoutPrototype','UPDATE',8),
 (107,'com.liferay.portal.model.LayoutPrototype','VIEW',1),
 (108,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','ADD_RECORD',2),
 (109,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','DELETE',4),
 (110,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','PERMISSIONS',8),
 (111,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','UPDATE',16),
 (112,'com.liferay.portlet.dynamicdatalists.model.DDLRecordSet','VIEW',1),
 (113,'com.liferay.portal.model.Organization','ADD_ORGANIZATION',2),
 (114,'com.liferay.portal.model.Organization','ASSIGN_MEMBERS',4),
 (115,'com.liferay.portal.model.Organization','ASSIGN_USER_ROLES',8),
 (116,'com.liferay.portal.model.Organization','DELETE',16),
 (117,'com.liferay.portal.model.Organization','MANAGE_ANNOUNCEMENTS',32),
 (118,'com.liferay.portal.model.Organization','MANAGE_SUBORGANIZATIONS',64),
 (119,'com.liferay.portal.model.Organization','MANAGE_USERS',128),
 (120,'com.liferay.portal.model.Organization','PERMISSIONS',256),
 (121,'com.liferay.portal.model.Organization','UPDATE',512),
 (122,'com.liferay.portal.model.Organization','VIEW',1),
 (123,'com.liferay.portal.model.Organization','VIEW_MEMBERS',1024),
 (124,'com.liferay.portlet.softwarecatalog.model.SCLicense','DELETE',2),
 (125,'com.liferay.portlet.softwarecatalog.model.SCLicense','PERMISSIONS',4),
 (126,'com.liferay.portlet.softwarecatalog.model.SCLicense','UPDATE',8),
 (127,'com.liferay.portlet.softwarecatalog.model.SCLicense','VIEW',1),
 (128,'com.liferay.portlet.journal.model.JournalFolder','ACCESS',2),
 (129,'com.liferay.portlet.journal.model.JournalFolder','ADD_ARTICLE',4),
 (130,'com.liferay.portlet.journal.model.JournalFolder','ADD_SUBFOLDER',8),
 (131,'com.liferay.portlet.journal.model.JournalFolder','DELETE',16),
 (132,'com.liferay.portlet.journal.model.JournalFolder','PERMISSIONS',32),
 (133,'com.liferay.portlet.journal.model.JournalFolder','UPDATE',64),
 (134,'com.liferay.portlet.journal.model.JournalFolder','VIEW',1),
 (135,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','DELETE',2),
 (136,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','PERMISSIONS',4),
 (137,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','UPDATE',8),
 (138,'com.liferay.portlet.documentlibrary.model.DLFileEntryType','VIEW',1),
 (139,'com.liferay.portlet.journal.model.JournalTemplate','DELETE',2),
 (140,'com.liferay.portlet.journal.model.JournalTemplate','PERMISSIONS',4),
 (141,'com.liferay.portlet.journal.model.JournalTemplate','UPDATE',8),
 (142,'com.liferay.portlet.journal.model.JournalTemplate','VIEW',1),
 (143,'com.liferay.portlet.journal.model.JournalArticle','ADD_DISCUSSION',2),
 (144,'com.liferay.portlet.journal.model.JournalArticle','DELETE',4),
 (145,'com.liferay.portlet.journal.model.JournalArticle','DELETE_DISCUSSION',8),
 (146,'com.liferay.portlet.journal.model.JournalArticle','EXPIRE',16),
 (147,'com.liferay.portlet.journal.model.JournalArticle','PERMISSIONS',32),
 (148,'com.liferay.portlet.journal.model.JournalArticle','UPDATE',64),
 (149,'com.liferay.portlet.journal.model.JournalArticle','UPDATE_DISCUSSION',128),
 (150,'com.liferay.portlet.journal.model.JournalArticle','VIEW',1),
 (151,'com.liferay.portlet.dynamicdatalists','ADD_RECORD_SET',2),
 (152,'com.liferay.portlet.dynamicdatalists','ADD_STRUCTURE',4),
 (153,'com.liferay.portlet.dynamicdatalists','ADD_TEMPLATE',8),
 (154,'com.liferay.portlet.dynamicdatalists','PERMISSIONS',16),
 (155,'com.liferay.portlet.bookmarks.model.BookmarksFolder','ACCESS',2),
 (156,'com.liferay.portlet.bookmarks.model.BookmarksFolder','ADD_ENTRY',4),
 (157,'com.liferay.portlet.bookmarks.model.BookmarksFolder','ADD_SUBFOLDER',8),
 (158,'com.liferay.portlet.bookmarks.model.BookmarksFolder','DELETE',16),
 (159,'com.liferay.portlet.bookmarks.model.BookmarksFolder','PERMISSIONS',32),
 (160,'com.liferay.portlet.bookmarks.model.BookmarksFolder','SUBSCRIBE',64),
 (161,'com.liferay.portlet.bookmarks.model.BookmarksFolder','UPDATE',128),
 (162,'com.liferay.portlet.bookmarks.model.BookmarksFolder','VIEW',1),
 (163,'com.liferay.portal.model.Group','ADD_COMMUNITY',2),
 (164,'com.liferay.portal.model.Group','ADD_LAYOUT',4),
 (165,'com.liferay.portal.model.Group','ADD_LAYOUT_BRANCH',8),
 (166,'com.liferay.portal.model.Group','ADD_LAYOUT_SET_BRANCH',16),
 (167,'com.liferay.portal.model.Group','ASSIGN_MEMBERS',32),
 (168,'com.liferay.portal.model.Group','ASSIGN_USER_ROLES',64),
 (169,'com.liferay.portal.model.Group','CONFIGURE_PORTLETS',128),
 (170,'com.liferay.portal.model.Group','DELETE',256),
 (171,'com.liferay.portal.model.Group','EXPORT_IMPORT_LAYOUTS',512),
 (172,'com.liferay.portal.model.Group','EXPORT_IMPORT_PORTLET_INFO',1024),
 (173,'com.liferay.portal.model.Group','MANAGE_ANNOUNCEMENTS',2048),
 (174,'com.liferay.portal.model.Group','MANAGE_ARCHIVED_SETUPS',4096),
 (175,'com.liferay.portal.model.Group','MANAGE_LAYOUTS',8192),
 (176,'com.liferay.portal.model.Group','MANAGE_STAGING',16384),
 (177,'com.liferay.portal.model.Group','MANAGE_SUBGROUPS',32768),
 (178,'com.liferay.portal.model.Group','MANAGE_TEAMS',65536),
 (179,'com.liferay.portal.model.Group','PERMISSIONS',131072),
 (180,'com.liferay.portal.model.Group','PREVIEW_IN_DEVICE',262144),
 (181,'com.liferay.portal.model.Group','PUBLISH_STAGING',524288),
 (182,'com.liferay.portal.model.Group','PUBLISH_TO_REMOTE',1048576),
 (183,'com.liferay.portal.model.Group','UPDATE',2097152),
 (184,'com.liferay.portal.model.Group','VIEW',1),
 (185,'com.liferay.portal.model.Group','VIEW_MEMBERS',4194304),
 (186,'com.liferay.portal.model.Group','VIEW_SITE_ADMINISTRATION',8388608),
 (187,'com.liferay.portal.model.Group','VIEW_STAGING',16777216),
 (188,'com.liferay.portlet.journal.model.JournalStructure','DELETE',2),
 (189,'com.liferay.portlet.journal.model.JournalStructure','PERMISSIONS',4),
 (190,'com.liferay.portlet.journal.model.JournalStructure','UPDATE',8),
 (191,'com.liferay.portlet.journal.model.JournalStructure','VIEW',1),
 (192,'com.liferay.portlet.asset.model.AssetTag','DELETE',2),
 (193,'com.liferay.portlet.asset.model.AssetTag','PERMISSIONS',4),
 (194,'com.liferay.portlet.asset.model.AssetTag','UPDATE',8),
 (195,'com.liferay.portlet.asset.model.AssetTag','VIEW',1),
 (196,'com.liferay.portal.model.Layout','ADD_DISCUSSION',2),
 (197,'com.liferay.portal.model.Layout','ADD_LAYOUT',4),
 (198,'com.liferay.portal.model.Layout','CONFIGURE_PORTLETS',8),
 (199,'com.liferay.portal.model.Layout','CUSTOMIZE',16),
 (200,'com.liferay.portal.model.Layout','DELETE',32),
 (201,'com.liferay.portal.model.Layout','DELETE_DISCUSSION',64),
 (202,'com.liferay.portal.model.Layout','PERMISSIONS',128),
 (203,'com.liferay.portal.model.Layout','UPDATE',256),
 (204,'com.liferay.portal.model.Layout','UPDATE_DISCUSSION',512),
 (205,'com.liferay.portal.model.Layout','VIEW',1),
 (206,'com.liferay.portlet.asset','ADD_TAG',2),
 (207,'com.liferay.portlet.asset','PERMISSIONS',4),
 (208,'com.liferay.portlet.asset','ADD_CATEGORY',8),
 (209,'com.liferay.portlet.asset','ADD_VOCABULARY',16),
 (210,'com.liferay.portal.model.LayoutBranch','DELETE',2),
 (211,'com.liferay.portal.model.LayoutBranch','PERMISSIONS',4),
 (212,'com.liferay.portal.model.LayoutBranch','UPDATE',8),
 (213,'com.liferay.portal.model.LayoutSetBranch','DELETE',2),
 (214,'com.liferay.portal.model.LayoutSetBranch','MERGE',4),
 (215,'com.liferay.portal.model.LayoutSetBranch','PERMISSIONS',8),
 (216,'com.liferay.portal.model.LayoutSetBranch','UPDATE',16),
 (217,'com.liferay.portlet.messageboards','ADD_CATEGORY',2),
 (218,'com.liferay.portlet.messageboards','ADD_FILE',4),
 (219,'com.liferay.portlet.messageboards','ADD_MESSAGE',8),
 (220,'com.liferay.portlet.messageboards','BAN_USER',16),
 (221,'com.liferay.portlet.messageboards','MOVE_THREAD',32),
 (222,'com.liferay.portlet.messageboards','LOCK_THREAD',64),
 (223,'com.liferay.portlet.messageboards','PERMISSIONS',128),
 (224,'com.liferay.portlet.messageboards','REPLY_TO_MESSAGE',256),
 (225,'com.liferay.portlet.messageboards','SUBSCRIBE',512),
 (226,'com.liferay.portlet.messageboards','UPDATE_THREAD_PRIORITY',1024),
 (227,'com.liferay.portlet.messageboards','VIEW',1),
 (228,'com.liferay.portlet.polls','ADD_QUESTION',2),
 (229,'com.liferay.portlet.polls','PERMISSIONS',4),
 (230,'com.liferay.portlet.shopping.model.ShoppingItem','DELETE',2),
 (231,'com.liferay.portlet.shopping.model.ShoppingItem','PERMISSIONS',4),
 (232,'com.liferay.portlet.shopping.model.ShoppingItem','UPDATE',8),
 (233,'com.liferay.portlet.shopping.model.ShoppingItem','VIEW',1),
 (234,'com.liferay.portlet.bookmarks.model.BookmarksEntry','DELETE',2),
 (235,'com.liferay.portlet.bookmarks.model.BookmarksEntry','PERMISSIONS',4),
 (236,'com.liferay.portlet.bookmarks.model.BookmarksEntry','SUBSCRIBE',8),
 (237,'com.liferay.portlet.bookmarks.model.BookmarksEntry','UPDATE',16),
 (238,'com.liferay.portlet.bookmarks.model.BookmarksEntry','VIEW',1),
 (239,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','ADD_DISCUSSION',2),
 (240,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','DELETE',4),
 (241,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','DELETE_DISCUSSION',8),
 (242,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','PERMISSIONS',16),
 (243,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','UPDATE',32),
 (244,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','UPDATE_DISCUSSION',64),
 (245,'com.liferay.portlet.softwarecatalog.model.SCProductEntry','VIEW',1),
 (246,'com.liferay.portal.model.User','DELETE',2),
 (247,'com.liferay.portal.model.User','IMPERSONATE',4),
 (248,'com.liferay.portal.model.User','PERMISSIONS',8),
 (249,'com.liferay.portal.model.User','UPDATE',16),
 (250,'com.liferay.portal.model.User','VIEW',1),
 (251,'com.liferay.portal.model.LayoutSetPrototype','DELETE',2),
 (252,'com.liferay.portal.model.LayoutSetPrototype','PERMISSIONS',4),
 (253,'com.liferay.portal.model.LayoutSetPrototype','UPDATE',8),
 (254,'com.liferay.portal.model.LayoutSetPrototype','VIEW',1),
 (255,'com.liferay.portlet.shopping','ADD_CATEGORY',2),
 (256,'com.liferay.portlet.shopping','ADD_ITEM',4),
 (257,'com.liferay.portlet.shopping','MANAGE_COUPONS',8),
 (258,'com.liferay.portlet.shopping','MANAGE_ORDERS',16),
 (259,'com.liferay.portlet.shopping','PERMISSIONS',32),
 (260,'com.liferay.portlet.shopping','VIEW',1),
 (261,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion','DELETE',2),
 (262,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion','PERMISSIONS',4),
 (263,'com.liferay.portlet.softwarecatalog.model.SCFrameworkVersion','UPDATE',8),
 (264,'com.liferay.portlet.wiki','ADD_NODE',2),
 (265,'com.liferay.portlet.wiki','PERMISSIONS',4),
 (266,'com.liferay.portlet.polls.model.PollsQuestion','ADD_VOTE',2),
 (267,'com.liferay.portlet.polls.model.PollsQuestion','DELETE',4),
 (268,'com.liferay.portlet.polls.model.PollsQuestion','PERMISSIONS',8),
 (269,'com.liferay.portlet.polls.model.PollsQuestion','UPDATE',16),
 (270,'com.liferay.portlet.polls.model.PollsQuestion','VIEW',1),
 (271,'com.liferay.portlet.shopping.model.ShoppingOrder','DELETE',2),
 (272,'com.liferay.portlet.shopping.model.ShoppingOrder','PERMISSIONS',4),
 (273,'com.liferay.portlet.shopping.model.ShoppingOrder','UPDATE',8),
 (274,'com.liferay.portlet.shopping.model.ShoppingOrder','VIEW',1),
 (275,'com.liferay.portal.model.UserGroup','ASSIGN_MEMBERS',2),
 (276,'com.liferay.portal.model.UserGroup','DELETE',4),
 (277,'com.liferay.portal.model.UserGroup','MANAGE_ANNOUNCEMENTS',8),
 (278,'com.liferay.portal.model.UserGroup','PERMISSIONS',16),
 (279,'com.liferay.portal.model.UserGroup','UPDATE',32),
 (280,'com.liferay.portal.model.UserGroup','VIEW',1),
 (281,'com.liferay.portal.model.UserGroup','VIEW_MEMBERS',64),
 (282,'com.liferay.portal.model.Role','ASSIGN_MEMBERS',2),
 (283,'com.liferay.portal.model.Role','DEFINE_PERMISSIONS',4),
 (284,'com.liferay.portal.model.Role','DELETE',8),
 (285,'com.liferay.portal.model.Role','MANAGE_ANNOUNCEMENTS',16),
 (286,'com.liferay.portal.model.Role','PERMISSIONS',32),
 (287,'com.liferay.portal.model.Role','UPDATE',64),
 (288,'com.liferay.portal.model.Role','VIEW',1),
 (289,'com.liferay.portlet.messageboards.model.MBCategory','ADD_FILE',2),
 (290,'com.liferay.portlet.messageboards.model.MBCategory','ADD_MESSAGE',4),
 (291,'com.liferay.portlet.messageboards.model.MBCategory','ADD_SUBCATEGORY',8),
 (292,'com.liferay.portlet.messageboards.model.MBCategory','DELETE',16),
 (293,'com.liferay.portlet.messageboards.model.MBCategory','LOCK_THREAD',32),
 (294,'com.liferay.portlet.messageboards.model.MBCategory','MOVE_THREAD',64),
 (295,'com.liferay.portlet.messageboards.model.MBCategory','PERMISSIONS',128),
 (296,'com.liferay.portlet.messageboards.model.MBCategory','REPLY_TO_MESSAGE',256),
 (297,'com.liferay.portlet.messageboards.model.MBCategory','SUBSCRIBE',512),
 (298,'com.liferay.portlet.messageboards.model.MBCategory','UPDATE',1024),
 (299,'com.liferay.portlet.messageboards.model.MBCategory','UPDATE_THREAD_PRIORITY',2048),
 (300,'com.liferay.portlet.messageboards.model.MBCategory','VIEW',1),
 (301,'com.liferay.portlet.mobiledevicerules','ADD_RULE_GROUP',2),
 (302,'com.liferay.portlet.mobiledevicerules','ADD_RULE_GROUP_INSTANCE',4),
 (303,'com.liferay.portlet.mobiledevicerules','CONFIGURATION',8),
 (304,'com.liferay.portlet.mobiledevicerules','VIEW',1),
 (305,'com.liferay.portlet.mobiledevicerules','PERMISSIONS',16),
 (306,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','DELETE',2),
 (307,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','PERMISSIONS',4),
 (308,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','UPDATE',8),
 (309,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure','VIEW',1),
 (310,'com.liferay.portlet.wiki.model.WikiPage','ADD_DISCUSSION',2),
 (311,'com.liferay.portlet.wiki.model.WikiPage','DELETE',4),
 (312,'com.liferay.portlet.wiki.model.WikiPage','DELETE_DISCUSSION',8),
 (313,'com.liferay.portlet.wiki.model.WikiPage','PERMISSIONS',16),
 (314,'com.liferay.portlet.wiki.model.WikiPage','SUBSCRIBE',32),
 (315,'com.liferay.portlet.wiki.model.WikiPage','UPDATE',64),
 (316,'com.liferay.portlet.wiki.model.WikiPage','UPDATE_DISCUSSION',128),
 (317,'com.liferay.portlet.wiki.model.WikiPage','VIEW',1),
 (318,'com.liferay.portlet.asset.model.AssetCategory','ADD_CATEGORY',2),
 (319,'com.liferay.portlet.asset.model.AssetCategory','DELETE',4),
 (320,'com.liferay.portlet.asset.model.AssetCategory','PERMISSIONS',8),
 (321,'com.liferay.portlet.asset.model.AssetCategory','UPDATE',16),
 (322,'com.liferay.portlet.asset.model.AssetCategory','VIEW',1),
 (323,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','DELETE',2),
 (324,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','PERMISSIONS',4),
 (325,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','UPDATE',8),
 (326,'com.liferay.portlet.mobiledevicerules.model.MDRRuleGroup','VIEW',1),
 (327,'com.liferay.portlet.messageboards.model.MBMessage','DELETE',2),
 (328,'com.liferay.portlet.messageboards.model.MBMessage','PERMISSIONS',4),
 (329,'com.liferay.portlet.messageboards.model.MBMessage','SUBSCRIBE',8),
 (330,'com.liferay.portlet.messageboards.model.MBMessage','UPDATE',16),
 (331,'com.liferay.portlet.messageboards.model.MBMessage','VIEW',1),
 (332,'com.liferay.portlet.messageboards.model.MBThread','SUBSCRIBE',2),
 (333,'com.liferay.portlet.messageboards.model.MBThread','VIEW',1),
 (334,'com.liferay.portlet.messageboards.model.MBThread','PERMISSIONS',4),
 (335,'com.liferay.portlet.blogs','ADD_ENTRY',2),
 (336,'com.liferay.portlet.blogs','PERMISSIONS',4),
 (337,'com.liferay.portlet.blogs','SUBSCRIBE',8),
 (338,'com.liferay.portlet.documentlibrary.model.DLFileEntry','ADD_DISCUSSION',2),
 (339,'com.liferay.portlet.documentlibrary.model.DLFileEntry','DELETE',4),
 (340,'com.liferay.portlet.documentlibrary.model.DLFileEntry','DELETE_DISCUSSION',8),
 (341,'com.liferay.portlet.documentlibrary.model.DLFileEntry','OVERRIDE_CHECKOUT',16),
 (342,'com.liferay.portlet.documentlibrary.model.DLFileEntry','PERMISSIONS',32),
 (343,'com.liferay.portlet.documentlibrary.model.DLFileEntry','UPDATE',64),
 (344,'com.liferay.portlet.documentlibrary.model.DLFileEntry','UPDATE_DISCUSSION',128),
 (345,'com.liferay.portlet.documentlibrary.model.DLFileEntry','VIEW',1),
 (346,'134','ACCESS_IN_CONTROL_PANEL',2),
 (347,'134','CONFIGURATION',4),
 (348,'134','VIEW',1),
 (349,'134','PERMISSIONS',8),
 (350,'134','PREFERENCES',16),
 (351,'59','ADD_TO_PAGE',2),
 (352,'59','CONFIGURATION',4),
 (353,'59','PERMISSIONS',8),
 (354,'59','PREFERENCES',16),
 (355,'59','VIEW',1),
 (356,'139','ACCESS_IN_CONTROL_PANEL',2),
 (357,'139','ADD_EXPANDO',4),
 (358,'139','CONFIGURATION',8),
 (359,'139','VIEW',1),
 (360,'139','PERMISSIONS',16),
 (361,'139','PREFERENCES',32),
 (362,'19','ADD_TO_PAGE',2),
 (363,'19','CONFIGURATION',4),
 (364,'19','VIEW',1),
 (365,'19','PERMISSIONS',8),
 (366,'19','PREFERENCES',16),
 (367,'110','ADD_TO_PAGE',2),
 (368,'110','CONFIGURATION',4),
 (369,'110','PERMISSIONS',8),
 (370,'110','PREFERENCES',16),
 (371,'110','VIEW',1),
 (372,'36','ADD_PORTLET_DISPLAY_TEMPLATE',2),
 (373,'36','ADD_TO_PAGE',4),
 (374,'36','CONFIGURATION',8),
 (375,'36','VIEW',1),
 (376,'36','PERMISSIONS',16),
 (377,'36','PREFERENCES',32),
 (378,'178','CONFIGURATION',2),
 (379,'178','VIEW',1),
 (380,'178','ADD_TO_PAGE',4),
 (381,'178','PERMISSIONS',8),
 (382,'178','PREFERENCES',16),
 (383,'15','ACCESS_IN_CONTROL_PANEL',2),
 (384,'15','ADD_TO_PAGE',4),
 (385,'15','CONFIGURATION',8),
 (386,'15','VIEW',1),
 (387,'15','PERMISSIONS',16),
 (388,'15','PREFERENCES',32),
 (389,'33','ADD_PORTLET_DISPLAY_TEMPLATE',2),
 (390,'33','ADD_TO_PAGE',4),
 (391,'33','CONFIGURATION',8),
 (392,'33','VIEW',1),
 (393,'33','PERMISSIONS',16),
 (394,'33','PREFERENCES',32),
 (395,'34','ADD_TO_PAGE',2),
 (396,'34','CONFIGURATION',4),
 (397,'34','VIEW',1),
 (398,'34','PERMISSIONS',8),
 (399,'34','PREFERENCES',16),
 (400,'156','ADD_TO_PAGE',2),
 (401,'156','CONFIGURATION',4),
 (402,'156','PERMISSIONS',8),
 (403,'156','PREFERENCES',16),
 (404,'156','VIEW',1),
 (405,'154','ACCESS_IN_CONTROL_PANEL',2),
 (406,'154','CONFIGURATION',4),
 (407,'154','VIEW',1),
 (408,'154','PERMISSIONS',8),
 (409,'154','PREFERENCES',16),
 (410,'20','ACCESS_IN_CONTROL_PANEL',2),
 (411,'20','ADD_PORTLET_DISPLAY_TEMPLATE',4),
 (412,'20','ADD_TO_PAGE',8),
 (413,'20','CONFIGURATION',16),
 (414,'20','VIEW',1),
 (415,'20','PERMISSIONS',32),
 (416,'20','PREFERENCES',64),
 (417,'174','ADD_TO_PAGE',2),
 (418,'174','CONFIGURATION',4),
 (419,'174','PERMISSIONS',8),
 (420,'174','PREFERENCES',16),
 (421,'174','VIEW',1),
 (422,'83','ADD_ENTRY',2),
 (423,'83','ADD_TO_PAGE',4),
 (424,'83','CONFIGURATION',8),
 (425,'83','VIEW',1),
 (426,'83','PERMISSIONS',16),
 (427,'83','PREFERENCES',32),
 (428,'99','ACCESS_IN_CONTROL_PANEL',2),
 (429,'99','CONFIGURATION',4),
 (430,'99','VIEW',1),
 (431,'99','PERMISSIONS',8),
 (432,'99','PREFERENCES',16),
 (433,'84','ADD_ENTRY',2),
 (434,'84','ADD_TO_PAGE',4),
 (435,'84','CONFIGURATION',8),
 (436,'84','VIEW',1),
 (437,'84','PERMISSIONS',16),
 (438,'84','PREFERENCES',32),
 (439,'98','ACCESS_IN_CONTROL_PANEL',2),
 (440,'98','ADD_TO_PAGE',4),
 (441,'98','CONFIGURATION',8),
 (442,'98','VIEW',1),
 (443,'98','PERMISSIONS',16),
 (444,'98','PREFERENCES',32),
 (445,'125','ACCESS_IN_CONTROL_PANEL',2),
 (446,'125','CONFIGURATION',4),
 (447,'125','EXPORT_USER',8),
 (448,'125','VIEW',1),
 (449,'125','PERMISSIONS',16),
 (450,'125','PREFERENCES',32),
 (451,'127','ADD_TO_PAGE',2),
 (452,'127','CONFIGURATION',4),
 (453,'127','PERMISSIONS',8),
 (454,'127','PREFERENCES',16),
 (455,'127','VIEW',1),
 (456,'128','ACCESS_IN_CONTROL_PANEL',2),
 (457,'128','CONFIGURATION',4),
 (458,'128','VIEW',1),
 (459,'128','PERMISSIONS',8),
 (460,'128','PREFERENCES',16),
 (461,'146','ACCESS_IN_CONTROL_PANEL',2),
 (462,'146','CONFIGURATION',4),
 (463,'146','VIEW',1),
 (464,'146','PERMISSIONS',8),
 (465,'146','PREFERENCES',16),
 (466,'147','ACCESS_IN_CONTROL_PANEL',2),
 (467,'147','CONFIGURATION',4),
 (468,'147','VIEW',1),
 (469,'147','PERMISSIONS',8),
 (470,'147','PREFERENCES',16),
 (471,'149','ACCESS_IN_CONTROL_PANEL',2),
 (472,'149','CONFIGURATION',4),
 (473,'149','VIEW',1),
 (474,'149','PERMISSIONS',8),
 (475,'149','PREFERENCES',16),
 (476,'169','ADD_TO_PAGE',2),
 (477,'169','CONFIGURATION',4),
 (478,'169','PERMISSIONS',8),
 (479,'169','PREFERENCES',16),
 (480,'169','VIEW',1),
 (481,'25','ACCESS_IN_CONTROL_PANEL',2),
 (482,'25','CONFIGURATION',4),
 (483,'25','VIEW',1),
 (484,'25','PERMISSIONS',8),
 (485,'25','PREFERENCES',16),
 (486,'129','ACCESS_IN_CONTROL_PANEL',2),
 (487,'129','CONFIGURATION',4),
 (488,'129','VIEW',1),
 (489,'129','PERMISSIONS',8),
 (490,'129','PREFERENCES',16),
 (491,'166','ACCESS_IN_CONTROL_PANEL',2),
 (492,'166','ADD_TO_PAGE',4),
 (493,'166','CONFIGURATION',8),
 (494,'166','VIEW',1),
 (495,'166','PERMISSIONS',16),
 (496,'166','PREFERENCES',32),
 (497,'165','ADD_TO_PAGE',2),
 (498,'165','CONFIGURATION',4),
 (499,'165','PERMISSIONS',8),
 (500,'165','PREFERENCES',16),
 (501,'165','VIEW',1),
 (502,'28','ACCESS_IN_CONTROL_PANEL',2),
 (503,'28','ADD_TO_PAGE',4),
 (504,'28','CONFIGURATION',8),
 (505,'28','VIEW',1),
 (506,'28','PERMISSIONS',16),
 (507,'28','PREFERENCES',32),
 (508,'167','ACCESS_IN_CONTROL_PANEL',2),
 (509,'167','ADD_TO_PAGE',4),
 (510,'167','CONFIGURATION',8),
 (511,'167','VIEW',1),
 (512,'167','PERMISSIONS',16),
 (513,'167','PREFERENCES',32),
 (514,'161','ACCESS_IN_CONTROL_PANEL',2),
 (515,'161','CONFIGURATION',4),
 (516,'161','VIEW',1),
 (517,'161','PERMISSIONS',8),
 (518,'161','PREFERENCES',16),
 (519,'162','ACCESS_IN_CONTROL_PANEL',2),
 (520,'162','CONFIGURATION',4),
 (521,'162','VIEW',1),
 (522,'162','PERMISSIONS',8),
 (523,'162','PREFERENCES',16),
 (524,'31','ADD_TO_PAGE',2),
 (525,'31','CONFIGURATION',4),
 (526,'31','PERMISSIONS',8),
 (527,'31','PREFERENCES',16),
 (528,'31','VIEW',1),
 (529,'8','ACCESS_IN_CONTROL_PANEL',2),
 (530,'8','ADD_TO_PAGE',4),
 (531,'8','CONFIGURATION',8),
 (532,'8','VIEW',1),
 (533,'8','PERMISSIONS',16),
 (534,'8','PREFERENCES',32),
 (535,'183','VIEW',1),
 (536,'183','ADD_TO_PAGE',2),
 (537,'183','CONFIGURATION',4),
 (538,'183','PERMISSIONS',8),
 (539,'183','PREFERENCES',16),
 (540,'183','ACCESS_IN_CONTROL_PANEL',32),
 (541,'66','VIEW',1),
 (542,'66','ADD_TO_PAGE',2),
 (543,'66','CONFIGURATION',4),
 (544,'66','PERMISSIONS',8),
 (545,'66','PREFERENCES',16),
 (546,'66','ACCESS_IN_CONTROL_PANEL',32),
 (547,'156','ACCESS_IN_CONTROL_PANEL',32),
 (548,'180','VIEW',1),
 (549,'180','ADD_TO_PAGE',2),
 (550,'180','CONFIGURATION',4),
 (551,'180','PERMISSIONS',8),
 (552,'180','PREFERENCES',16),
 (553,'180','ACCESS_IN_CONTROL_PANEL',32),
 (554,'152','ACCESS_IN_CONTROL_PANEL',2),
 (555,'152','CONFIGURATION',4),
 (556,'152','VIEW',1),
 (557,'152','PERMISSIONS',8),
 (558,'152','PREFERENCES',16),
 (559,'27','VIEW',1),
 (560,'27','ADD_TO_PAGE',2),
 (561,'27','CONFIGURATION',4),
 (562,'27','PERMISSIONS',8),
 (563,'27','PREFERENCES',16),
 (564,'27','ACCESS_IN_CONTROL_PANEL',32),
 (565,'88','VIEW',1),
 (566,'88','ADD_TO_PAGE',2),
 (567,'88','CONFIGURATION',4),
 (568,'88','PERMISSIONS',8),
 (569,'88','PREFERENCES',16),
 (570,'88','ACCESS_IN_CONTROL_PANEL',32),
 (571,'130','ACCESS_IN_CONTROL_PANEL',2),
 (572,'130','CONFIGURATION',4),
 (573,'130','VIEW',1),
 (574,'130','PERMISSIONS',8),
 (575,'130','PREFERENCES',16),
 (576,'122','ADD_PORTLET_DISPLAY_TEMPLATE',2),
 (577,'122','CONFIGURATION',4),
 (578,'122','VIEW',1),
 (579,'122','ADD_TO_PAGE',8),
 (580,'122','PERMISSIONS',16),
 (581,'122','PREFERENCES',32),
 (582,'122','ACCESS_IN_CONTROL_PANEL',64),
 (583,'36','ACCESS_IN_CONTROL_PANEL',64),
 (584,'26','VIEW',1),
 (585,'26','ADD_TO_PAGE',2),
 (586,'26','CONFIGURATION',4),
 (587,'26','PERMISSIONS',8),
 (588,'26','PREFERENCES',16),
 (589,'26','ACCESS_IN_CONTROL_PANEL',32),
 (590,'190','VIEW',1),
 (591,'190','ADD_TO_PAGE',2),
 (592,'190','CONFIGURATION',4),
 (593,'190','PERMISSIONS',8),
 (594,'190','PREFERENCES',16),
 (595,'190','ACCESS_IN_CONTROL_PANEL',32),
 (596,'175','VIEW',1),
 (597,'175','ADD_TO_PAGE',2),
 (598,'175','CONFIGURATION',4),
 (599,'175','PERMISSIONS',8),
 (600,'175','PREFERENCES',16),
 (601,'175','ACCESS_IN_CONTROL_PANEL',32),
 (602,'64','VIEW',1),
 (603,'64','ADD_TO_PAGE',2),
 (604,'64','CONFIGURATION',4),
 (605,'64','PERMISSIONS',8),
 (606,'64','PREFERENCES',16),
 (607,'64','ACCESS_IN_CONTROL_PANEL',32),
 (608,'153','ACCESS_IN_CONTROL_PANEL',2),
 (609,'153','ADD_TO_PAGE',4),
 (610,'153','CONFIGURATION',8),
 (611,'153','VIEW',1),
 (612,'153','PERMISSIONS',16),
 (613,'153','PREFERENCES',32),
 (614,'182','VIEW',1),
 (615,'182','ADD_TO_PAGE',2),
 (616,'182','CONFIGURATION',4),
 (617,'182','PERMISSIONS',8),
 (618,'182','PREFERENCES',16),
 (619,'182','ACCESS_IN_CONTROL_PANEL',32),
 (620,'179','ACCESS_IN_CONTROL_PANEL',2),
 (621,'179','CONFIGURATION',4),
 (622,'179','VIEW',1),
 (623,'179','PERMISSIONS',8),
 (624,'179','PREFERENCES',16),
 (625,'173','VIEW',1),
 (626,'173','ADD_TO_PAGE',2),
 (627,'173','CONFIGURATION',4),
 (628,'173','PERMISSIONS',8),
 (629,'173','PREFERENCES',16),
 (630,'173','ACCESS_IN_CONTROL_PANEL',32),
 (631,'100','VIEW',1),
 (632,'100','ADD_TO_PAGE',2),
 (633,'100','CONFIGURATION',4),
 (634,'100','PERMISSIONS',8),
 (635,'100','PREFERENCES',16),
 (636,'100','ACCESS_IN_CONTROL_PANEL',32),
 (637,'157','ACCESS_IN_CONTROL_PANEL',2),
 (638,'157','CONFIGURATION',4),
 (639,'157','VIEW',1),
 (640,'157','PERMISSIONS',8),
 (641,'157','PREFERENCES',16),
 (642,'19','ACCESS_IN_CONTROL_PANEL',32),
 (643,'160','VIEW',1),
 (644,'160','ADD_TO_PAGE',2),
 (645,'160','CONFIGURATION',4),
 (646,'160','PERMISSIONS',8),
 (647,'160','PREFERENCES',16),
 (648,'160','ACCESS_IN_CONTROL_PANEL',32),
 (649,'181','VIEW',1),
 (650,'181','ADD_TO_PAGE',2),
 (651,'181','CONFIGURATION',4),
 (652,'181','PERMISSIONS',8),
 (653,'181','PREFERENCES',16),
 (654,'181','ACCESS_IN_CONTROL_PANEL',32),
 (655,'86','VIEW',1),
 (656,'86','ADD_TO_PAGE',2),
 (657,'86','CONFIGURATION',4),
 (658,'86','PERMISSIONS',8),
 (659,'86','PREFERENCES',16),
 (660,'86','ACCESS_IN_CONTROL_PANEL',32),
 (661,'148','VIEW',1),
 (662,'148','ADD_TO_PAGE',2),
 (663,'148','CONFIGURATION',4),
 (664,'148','PERMISSIONS',8),
 (665,'148','PREFERENCES',16),
 (666,'148','ACCESS_IN_CONTROL_PANEL',32),
 (667,'11','ADD_TO_PAGE',2),
 (668,'11','CONFIGURATION',4),
 (669,'11','VIEW',1),
 (670,'11','PERMISSIONS',8),
 (671,'11','PREFERENCES',16),
 (672,'11','ACCESS_IN_CONTROL_PANEL',32),
 (673,'29','ADD_TO_PAGE',2),
 (674,'29','CONFIGURATION',4),
 (675,'29','VIEW',1),
 (676,'29','PERMISSIONS',8),
 (677,'29','PREFERENCES',16),
 (678,'29','ACCESS_IN_CONTROL_PANEL',32),
 (679,'174','ACCESS_IN_CONTROL_PANEL',32),
 (680,'158','ACCESS_IN_CONTROL_PANEL',2),
 (681,'158','ADD_TO_PAGE',4),
 (682,'158','CONFIGURATION',8),
 (683,'158','VIEW',1),
 (684,'158','PERMISSIONS',16),
 (685,'158','PREFERENCES',32),
 (686,'178','ACCESS_IN_CONTROL_PANEL',32),
 (687,'124','VIEW',1),
 (688,'124','ADD_TO_PAGE',2),
 (689,'124','CONFIGURATION',4),
 (690,'124','PERMISSIONS',8),
 (691,'124','PREFERENCES',16),
 (692,'124','ACCESS_IN_CONTROL_PANEL',32),
 (693,'58','ADD_TO_PAGE',2),
 (694,'58','CONFIGURATION',4),
 (695,'58','VIEW',1),
 (696,'58','PERMISSIONS',8),
 (697,'58','PREFERENCES',16),
 (698,'58','ACCESS_IN_CONTROL_PANEL',32),
 (699,'97','VIEW',1),
 (700,'97','ADD_TO_PAGE',2),
 (701,'97','CONFIGURATION',4),
 (702,'97','PERMISSIONS',8),
 (703,'97','PREFERENCES',16),
 (704,'97','ACCESS_IN_CONTROL_PANEL',32),
 (705,'71','ADD_TO_PAGE',2),
 (706,'71','CONFIGURATION',4),
 (707,'71','VIEW',1),
 (708,'71','PERMISSIONS',8),
 (709,'71','PREFERENCES',16),
 (710,'71','ACCESS_IN_CONTROL_PANEL',32),
 (711,'39','VIEW',1),
 (712,'39','ADD_TO_PAGE',2),
 (713,'39','CONFIGURATION',4),
 (714,'39','PERMISSIONS',8),
 (715,'39','PREFERENCES',16),
 (716,'39','ACCESS_IN_CONTROL_PANEL',32),
 (717,'185','VIEW',1),
 (718,'185','ADD_TO_PAGE',2),
 (719,'185','CONFIGURATION',4),
 (720,'185','PERMISSIONS',8),
 (721,'185','PREFERENCES',16),
 (722,'185','ACCESS_IN_CONTROL_PANEL',32),
 (723,'170','VIEW',1),
 (724,'170','ADD_TO_PAGE',2),
 (725,'170','CONFIGURATION',4),
 (726,'170','PERMISSIONS',8),
 (727,'170','PREFERENCES',16),
 (728,'170','ACCESS_IN_CONTROL_PANEL',32),
 (729,'85','ADD_TO_PAGE',2),
 (730,'85','CONFIGURATION',4),
 (731,'85','VIEW',1),
 (732,'85','PERMISSIONS',8),
 (733,'85','PREFERENCES',16),
 (734,'85','ADD_PORTLET_DISPLAY_TEMPLATE',32),
 (735,'85','ACCESS_IN_CONTROL_PANEL',64),
 (736,'118','VIEW',1),
 (737,'118','ADD_TO_PAGE',2),
 (738,'118','CONFIGURATION',4),
 (739,'118','PERMISSIONS',8),
 (740,'118','PREFERENCES',16),
 (741,'118','ACCESS_IN_CONTROL_PANEL',32),
 (742,'107','VIEW',1),
 (743,'107','ADD_TO_PAGE',2),
 (744,'107','CONFIGURATION',4),
 (745,'107','PERMISSIONS',8),
 (746,'107','PREFERENCES',16),
 (747,'107','ACCESS_IN_CONTROL_PANEL',32),
 (748,'30','VIEW',1),
 (749,'30','ADD_TO_PAGE',2),
 (750,'30','CONFIGURATION',4),
 (751,'30','PERMISSIONS',8),
 (752,'30','PREFERENCES',16),
 (753,'30','ACCESS_IN_CONTROL_PANEL',32),
 (754,'184','ADD_TO_PAGE',2),
 (755,'184','CONFIGURATION',4),
 (756,'184','VIEW',1),
 (757,'184','PERMISSIONS',8),
 (758,'184','PREFERENCES',16),
 (759,'184','ACCESS_IN_CONTROL_PANEL',32),
 (760,'48','VIEW',1),
 (761,'48','ADD_TO_PAGE',2),
 (762,'48','CONFIGURATION',4),
 (763,'48','PERMISSIONS',8),
 (764,'48','PREFERENCES',16),
 (765,'48','ACCESS_IN_CONTROL_PANEL',32),
 (766,'62','VIEW',1),
 (767,'62','ADD_TO_PAGE',2),
 (768,'62','CONFIGURATION',4),
 (769,'62','PERMISSIONS',8),
 (770,'62','PREFERENCES',16),
 (771,'62','ACCESS_IN_CONTROL_PANEL',32),
 (772,'176','VIEW',1),
 (773,'176','ADD_TO_PAGE',2),
 (774,'176','CONFIGURATION',4),
 (775,'176','PERMISSIONS',8),
 (776,'176','PREFERENCES',16),
 (777,'176','ACCESS_IN_CONTROL_PANEL',32),
 (778,'172','VIEW',1),
 (779,'172','ADD_TO_PAGE',2),
 (780,'172','CONFIGURATION',4),
 (781,'172','PERMISSIONS',8),
 (782,'172','PREFERENCES',16),
 (783,'172','ACCESS_IN_CONTROL_PANEL',32),
 (784,'187','ADD_TO_PAGE',2),
 (785,'187','CONFIGURATION',4),
 (786,'187','VIEW',1),
 (787,'187','PERMISSIONS',8),
 (788,'187','PREFERENCES',16),
 (789,'187','ACCESS_IN_CONTROL_PANEL',32),
 (790,'108','VIEW',1),
 (791,'108','ADD_TO_PAGE',2),
 (792,'108','CONFIGURATION',4),
 (793,'108','PERMISSIONS',8),
 (794,'108','PREFERENCES',16),
 (795,'108','ACCESS_IN_CONTROL_PANEL',32),
 (796,'84','ACCESS_IN_CONTROL_PANEL',64),
 (797,'101','ADD_PORTLET_DISPLAY_TEMPLATE',2),
 (798,'101','ADD_TO_PAGE',4),
 (799,'101','CONFIGURATION',8),
 (800,'101','SUBSCRIBE',16),
 (801,'101','VIEW',1),
 (802,'101','PERMISSIONS',32),
 (803,'101','PREFERENCES',64),
 (804,'101','ACCESS_IN_CONTROL_PANEL',128),
 (805,'121','VIEW',1),
 (806,'121','ADD_TO_PAGE',2),
 (807,'121','CONFIGURATION',4),
 (808,'121','PERMISSIONS',8),
 (809,'121','PREFERENCES',16),
 (810,'121','ACCESS_IN_CONTROL_PANEL',32),
 (811,'49','VIEW',1),
 (812,'49','ADD_TO_PAGE',2),
 (813,'49','CONFIGURATION',4),
 (814,'49','PERMISSIONS',8),
 (815,'49','PREFERENCES',16),
 (816,'49','ACCESS_IN_CONTROL_PANEL',32),
 (817,'143','VIEW',1),
 (818,'143','ADD_TO_PAGE',2),
 (819,'143','CONFIGURATION',4),
 (820,'143','PERMISSIONS',8),
 (821,'143','PREFERENCES',16),
 (822,'143','ACCESS_IN_CONTROL_PANEL',32),
 (823,'77','VIEW',1),
 (824,'77','ADD_TO_PAGE',2),
 (825,'77','CONFIGURATION',4),
 (826,'77','PERMISSIONS',8),
 (827,'77','PREFERENCES',16),
 (828,'77','ACCESS_IN_CONTROL_PANEL',32),
 (829,'115','VIEW',1),
 (830,'115','ADD_TO_PAGE',2),
 (831,'115','CONFIGURATION',4),
 (832,'115','PERMISSIONS',8),
 (833,'115','PREFERENCES',16),
 (834,'115','ACCESS_IN_CONTROL_PANEL',32),
 (835,'56','ADD_TO_PAGE',2),
 (836,'56','CONFIGURATION',4),
 (837,'56','VIEW',1),
 (838,'56','PERMISSIONS',8),
 (839,'56','PREFERENCES',16),
 (840,'56','ACCESS_IN_CONTROL_PANEL',32),
 (841,'142','VIEW',1),
 (842,'142','ADD_TO_PAGE',2),
 (843,'142','CONFIGURATION',4),
 (844,'142','PERMISSIONS',8),
 (845,'142','PREFERENCES',16),
 (846,'142','ACCESS_IN_CONTROL_PANEL',32),
 (847,'16','PREFERENCES',2),
 (848,'16','GUEST_PREFERENCES',4),
 (849,'16','VIEW',1),
 (850,'16','ADD_TO_PAGE',8),
 (851,'16','CONFIGURATION',16),
 (852,'16','PERMISSIONS',32),
 (853,'16','ACCESS_IN_CONTROL_PANEL',64),
 (854,'3','VIEW',1),
 (855,'3','ADD_TO_PAGE',2),
 (856,'3','CONFIGURATION',4),
 (857,'3','PERMISSIONS',8),
 (858,'3','PREFERENCES',16),
 (859,'3','ACCESS_IN_CONTROL_PANEL',32),
 (860,'23','VIEW',1),
 (861,'23','ADD_TO_PAGE',2),
 (862,'23','CONFIGURATION',4),
 (863,'23','PERMISSIONS',8),
 (864,'23','PREFERENCES',16),
 (865,'23','ACCESS_IN_CONTROL_PANEL',32),
 (866,'145','VIEW',1),
 (867,'145','ADD_TO_PAGE',2),
 (868,'145','CONFIGURATION',4),
 (869,'145','PERMISSIONS',8),
 (870,'145','PREFERENCES',16),
 (871,'145','ACCESS_IN_CONTROL_PANEL',32),
 (872,'83','ACCESS_IN_CONTROL_PANEL',64),
 (873,'194','VIEW',1),
 (874,'194','ADD_TO_PAGE',2),
 (875,'194','CONFIGURATION',4),
 (876,'194','PERMISSIONS',8),
 (877,'194','PREFERENCES',16),
 (878,'194','ACCESS_IN_CONTROL_PANEL',32),
 (879,'186','ADD_TO_PAGE',2),
 (880,'186','CONFIGURATION',4),
 (881,'186','VIEW',1),
 (882,'186','PERMISSIONS',8),
 (883,'186','PREFERENCES',16),
 (884,'186','ACCESS_IN_CONTROL_PANEL',32),
 (885,'164','VIEW',1),
 (886,'164','ADD_TO_PAGE',2),
 (887,'164','CONFIGURATION',4),
 (888,'164','PERMISSIONS',8),
 (889,'164','PREFERENCES',16),
 (890,'164','ACCESS_IN_CONTROL_PANEL',32),
 (891,'70','VIEW',1),
 (892,'70','ADD_TO_PAGE',2),
 (893,'70','CONFIGURATION',4),
 (894,'70','PERMISSIONS',8),
 (895,'70','PREFERENCES',16),
 (896,'70','ACCESS_IN_CONTROL_PANEL',32),
 (897,'141','ADD_PORTLET_DISPLAY_TEMPLATE',2),
 (898,'141','CONFIGURATION',4),
 (899,'141','VIEW',1),
 (900,'141','ADD_TO_PAGE',8),
 (901,'141','PERMISSIONS',16),
 (902,'141','PREFERENCES',32),
 (903,'141','ACCESS_IN_CONTROL_PANEL',64),
 (904,'9','VIEW',1),
 (905,'9','ADD_TO_PAGE',2),
 (906,'9','CONFIGURATION',4),
 (907,'9','PERMISSIONS',8),
 (908,'9','PREFERENCES',16),
 (909,'9','ACCESS_IN_CONTROL_PANEL',32),
 (910,'137','ACCESS_IN_CONTROL_PANEL',2),
 (911,'137','CONFIGURATION',4),
 (912,'137','VIEW',1),
 (913,'137','PERMISSIONS',8),
 (914,'137','PREFERENCES',16),
 (915,'133','VIEW',1),
 (916,'133','ADD_TO_PAGE',2),
 (917,'133','CONFIGURATION',4),
 (918,'133','PERMISSIONS',8),
 (919,'133','PREFERENCES',16),
 (920,'133','ACCESS_IN_CONTROL_PANEL',32),
 (921,'116','VIEW',1),
 (922,'116','ADD_TO_PAGE',2),
 (923,'116','CONFIGURATION',4),
 (924,'116','PERMISSIONS',8),
 (925,'116','PREFERENCES',16),
 (926,'116','ACCESS_IN_CONTROL_PANEL',32),
 (927,'47','VIEW',1),
 (928,'47','ADD_TO_PAGE',2),
 (929,'47','CONFIGURATION',4),
 (930,'47','PERMISSIONS',8),
 (931,'47','PREFERENCES',16),
 (932,'47','ACCESS_IN_CONTROL_PANEL',32),
 (933,'82','VIEW',1),
 (934,'82','ADD_TO_PAGE',2),
 (935,'82','CONFIGURATION',4),
 (936,'82','PERMISSIONS',8),
 (937,'82','PREFERENCES',16),
 (938,'82','ACCESS_IN_CONTROL_PANEL',32),
 (939,'103','VIEW',1),
 (940,'103','ADD_TO_PAGE',2),
 (941,'103','CONFIGURATION',4),
 (942,'103','PERMISSIONS',8),
 (943,'103','PREFERENCES',16),
 (944,'103','ACCESS_IN_CONTROL_PANEL',32),
 (945,'151','ACCESS_IN_CONTROL_PANEL',2),
 (946,'151','CONFIGURATION',4),
 (947,'151','VIEW',1),
 (948,'151','PERMISSIONS',8),
 (949,'151','PREFERENCES',16),
 (950,'140','ACCESS_IN_CONTROL_PANEL',2),
 (951,'140','CONFIGURATION',4),
 (952,'140','VIEW',1),
 (953,'140','PERMISSIONS',8),
 (954,'140','PREFERENCES',16),
 (955,'54','VIEW',1),
 (956,'54','ADD_TO_PAGE',2),
 (957,'54','CONFIGURATION',4),
 (958,'54','PERMISSIONS',8),
 (959,'54','PREFERENCES',16),
 (960,'54','ACCESS_IN_CONTROL_PANEL',32),
 (961,'169','ACCESS_IN_CONTROL_PANEL',32),
 (962,'132','ACCESS_IN_CONTROL_PANEL',2),
 (963,'132','CONFIGURATION',4),
 (964,'132','VIEW',1),
 (965,'132','PERMISSIONS',8),
 (966,'132','PREFERENCES',16),
 (967,'34','ACCESS_IN_CONTROL_PANEL',32),
 (968,'61','VIEW',1),
 (969,'61','ADD_TO_PAGE',2),
 (970,'61','CONFIGURATION',4),
 (971,'61','PERMISSIONS',8),
 (972,'61','PREFERENCES',16),
 (973,'61','ACCESS_IN_CONTROL_PANEL',32),
 (974,'73','ADD_TO_PAGE',2),
 (975,'73','CONFIGURATION',4),
 (976,'73','VIEW',1),
 (977,'73','PERMISSIONS',8),
 (978,'73','PREFERENCES',16),
 (979,'73','ACCESS_IN_CONTROL_PANEL',32),
 (980,'193','VIEW',1),
 (981,'193','ADD_TO_PAGE',2),
 (982,'193','CONFIGURATION',4),
 (983,'193','PERMISSIONS',8),
 (984,'193','PREFERENCES',16),
 (985,'193','ACCESS_IN_CONTROL_PANEL',32),
 (986,'127','ACCESS_IN_CONTROL_PANEL',32),
 (987,'50','VIEW',1),
 (988,'50','ADD_TO_PAGE',2),
 (989,'50','CONFIGURATION',4),
 (990,'50','PERMISSIONS',8),
 (991,'50','PREFERENCES',16),
 (992,'50','ACCESS_IN_CONTROL_PANEL',32),
 (993,'31','ACCESS_IN_CONTROL_PANEL',32),
 (994,'165','ACCESS_IN_CONTROL_PANEL',32),
 (995,'192','VIEW',1),
 (996,'192','ADD_TO_PAGE',2),
 (997,'192','CONFIGURATION',4),
 (998,'192','PERMISSIONS',8),
 (999,'192','PREFERENCES',16),
 (1000,'192','ACCESS_IN_CONTROL_PANEL',32),
 (1001,'90','ADD_COMMUNITY',2),
 (1002,'90','ADD_GENERAL_ANNOUNCEMENTS',4),
 (1003,'90','ADD_LAYOUT_PROTOTYPE',8),
 (1004,'90','ADD_LAYOUT_SET_PROTOTYPE',16),
 (1005,'90','ADD_LICENSE',32),
 (1006,'90','ADD_ORGANIZATION',64),
 (1007,'90','ADD_PASSWORD_POLICY',128),
 (1008,'90','ADD_ROLE',256),
 (1009,'90','ADD_USER',512),
 (1010,'90','ADD_USER_GROUP',1024),
 (1011,'90','CONFIGURATION',2048),
 (1012,'90','EXPORT_USER',4096),
 (1013,'90','IMPERSONATE',8192),
 (1014,'90','UNLINK_LAYOUT_SET_PROTOTYPE',16384),
 (1015,'90','VIEW_CONTROL_PANEL',32768),
 (1016,'90','ADD_TO_PAGE',65536),
 (1017,'90','PERMISSIONS',131072),
 (1018,'90','PREFERENCES',262144),
 (1019,'90','VIEW',1),
 (1020,'90','ACCESS_IN_CONTROL_PANEL',524288),
 (1021,'150','ACCESS_IN_CONTROL_PANEL',2),
 (1022,'150','CONFIGURATION',4),
 (1023,'150','VIEW',1),
 (1024,'150','PERMISSIONS',8),
 (1025,'150','PREFERENCES',16),
 (1026,'113','VIEW',1),
 (1027,'113','ADD_TO_PAGE',2),
 (1028,'113','CONFIGURATION',4),
 (1029,'113','PERMISSIONS',8),
 (1030,'113','PREFERENCES',16),
 (1031,'113','ACCESS_IN_CONTROL_PANEL',32),
 (1032,'33','ACCESS_IN_CONTROL_PANEL',64),
 (1033,'2','ACCESS_IN_CONTROL_PANEL',2),
 (1034,'2','CONFIGURATION',4),
 (1035,'2','VIEW',1),
 (1036,'2','PERMISSIONS',8),
 (1037,'2','PREFERENCES',16),
 (1038,'191','VIEW',1),
 (1039,'191','ADD_TO_PAGE',2),
 (1040,'191','CONFIGURATION',4),
 (1041,'191','PERMISSIONS',8),
 (1042,'191','PREFERENCES',16),
 (1043,'191','ACCESS_IN_CONTROL_PANEL',32),
 (1044,'119','VIEW',1),
 (1045,'119','ADD_TO_PAGE',2),
 (1046,'119','CONFIGURATION',4),
 (1047,'119','PERMISSIONS',8),
 (1048,'119','PREFERENCES',16),
 (1049,'119','ACCESS_IN_CONTROL_PANEL',32),
 (1050,'114','VIEW',1),
 (1051,'114','ADD_TO_PAGE',2),
 (1052,'114','CONFIGURATION',4),
 (1053,'114','PERMISSIONS',8),
 (1054,'114','PREFERENCES',16),
 (1055,'114','ACCESS_IN_CONTROL_PANEL',32),
 (1056,'67','VIEW',1),
 (1057,'67','ADD_TO_PAGE',2),
 (1058,'67','CONFIGURATION',4),
 (1059,'67','PERMISSIONS',8),
 (1060,'67','PREFERENCES',16),
 (1061,'67','ACCESS_IN_CONTROL_PANEL',32),
 (1062,'110','ACCESS_IN_CONTROL_PANEL',32),
 (1063,'135','ACCESS_IN_CONTROL_PANEL',2),
 (1064,'135','CONFIGURATION',4),
 (1065,'135','VIEW',1),
 (1066,'135','PERMISSIONS',8),
 (1067,'135','PREFERENCES',16),
 (1068,'59','ACCESS_IN_CONTROL_PANEL',32),
 (1069,'188','ADD_TO_PAGE',2),
 (1070,'188','CONFIGURATION',4),
 (1071,'188','VIEW',1),
 (1072,'188','PERMISSIONS',8),
 (1073,'188','PREFERENCES',16),
 (1074,'188','ACCESS_IN_CONTROL_PANEL',32),
 (1075,'131','ACCESS_IN_CONTROL_PANEL',2),
 (1076,'131','CONFIGURATION',4),
 (1077,'131','VIEW',1),
 (1078,'131','PERMISSIONS',8),
 (1079,'131','PREFERENCES',16),
 (1080,'102','VIEW',1),
 (1081,'102','ADD_TO_PAGE',2),
 (1082,'102','CONFIGURATION',4),
 (1083,'102','PERMISSIONS',8),
 (1084,'102','PREFERENCES',16),
 (1085,'102','ACCESS_IN_CONTROL_PANEL',32),
 (1086,'1_WAR_marketplaceportlet','VIEW',1),
 (1087,'1_WAR_marketplaceportlet','ADD_TO_PAGE',2),
 (1088,'1_WAR_marketplaceportlet','CONFIGURATION',4),
 (1089,'1_WAR_marketplaceportlet','PERMISSIONS',8),
 (1090,'1_WAR_marketplaceportlet','PREFERENCES',16),
 (1091,'1_WAR_marketplaceportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1092,'2_WAR_marketplaceportlet','VIEW',1),
 (1093,'2_WAR_marketplaceportlet','ADD_TO_PAGE',2),
 (1094,'2_WAR_marketplaceportlet','CONFIGURATION',4),
 (1095,'2_WAR_marketplaceportlet','PERMISSIONS',8),
 (1096,'2_WAR_marketplaceportlet','PREFERENCES',16),
 (1097,'2_WAR_marketplaceportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1098,'3_WAR_marketplaceportlet','VIEW',1),
 (1099,'3_WAR_marketplaceportlet','ADD_TO_PAGE',2),
 (1100,'3_WAR_marketplaceportlet','CONFIGURATION',4),
 (1101,'3_WAR_marketplaceportlet','PERMISSIONS',8),
 (1102,'3_WAR_marketplaceportlet','PREFERENCES',16),
 (1103,'3_WAR_marketplaceportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1104,'1_WAR_calendarportlet','ACCESS_IN_CONTROL_PANEL',2),
 (1105,'1_WAR_calendarportlet','ADD_TO_PAGE',4),
 (1106,'1_WAR_calendarportlet','CONFIGURATION',8),
 (1107,'1_WAR_calendarportlet','VIEW',1),
 (1108,'1_WAR_calendarportlet','PERMISSIONS',16),
 (1109,'1_WAR_calendarportlet','PREFERENCES',32),
 (1110,'com.liferay.calendar.model.CalendarResource','ADD_CALENDAR',2),
 (1111,'com.liferay.calendar.model.CalendarResource','DELETE',4),
 (1112,'com.liferay.calendar.model.CalendarResource','UPDATE',8),
 (1113,'com.liferay.calendar.model.CalendarResource','VIEW',1),
 (1114,'com.liferay.calendar.model.CalendarResource','PERMISSIONS',16),
 (1115,'com.liferay.calendar.model.Calendar','DELETE',2),
 (1116,'com.liferay.calendar.model.Calendar','MANAGE_BOOKINGS',4),
 (1117,'com.liferay.calendar.model.Calendar','PERMISSIONS',8),
 (1118,'com.liferay.calendar.model.Calendar','UPDATE',16),
 (1119,'com.liferay.calendar.model.Calendar','VIEW',1),
 (1120,'com.liferay.calendar.model.Calendar','VIEW_BOOKING_DETAILS',32),
 (1121,'com.liferay.calendar','ADD_RESOURCE',2),
 (1122,'com.liferay.calendar','PERMISSIONS',4),
 (1123,'com.liferay.calendar.model.CalendarBooking','ADD_DISCUSSION',2),
 (1124,'com.liferay.calendar.model.CalendarBooking','DELETE_DISCUSSION',4),
 (1125,'com.liferay.calendar.model.CalendarBooking','PERMISSIONS',8),
 (1126,'com.liferay.calendar.model.CalendarBooking','UPDATE_DISCUSSION',16),
 (1127,'2_WAR_notificationsportlet','VIEW',1),
 (1128,'2_WAR_notificationsportlet','ADD_TO_PAGE',2),
 (1129,'2_WAR_notificationsportlet','CONFIGURATION',4),
 (1130,'2_WAR_notificationsportlet','PERMISSIONS',8),
 (1131,'2_WAR_notificationsportlet','PREFERENCES',16),
 (1132,'2_WAR_notificationsportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1133,'1_WAR_notificationsportlet','VIEW',1),
 (1134,'1_WAR_notificationsportlet','ADD_TO_PAGE',2),
 (1135,'1_WAR_notificationsportlet','CONFIGURATION',4),
 (1136,'1_WAR_notificationsportlet','PERMISSIONS',8),
 (1137,'1_WAR_notificationsportlet','PREFERENCES',16),
 (1138,'1_WAR_notificationsportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1139,'4_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',2),
 (1140,'4_WAR_opensocialportlet','CONFIGURATION',4),
 (1141,'4_WAR_opensocialportlet','VIEW',1),
 (1142,'4_WAR_opensocialportlet','PERMISSIONS',8),
 (1143,'4_WAR_opensocialportlet','PREFERENCES',16),
 (1144,'2_WAR_opensocialportlet','ADD_TO_PAGE',2),
 (1145,'2_WAR_opensocialportlet','CONFIGURATION',4),
 (1146,'2_WAR_opensocialportlet','VIEW',1),
 (1147,'2_WAR_opensocialportlet','PERMISSIONS',8),
 (1148,'2_WAR_opensocialportlet','PREFERENCES',16),
 (1149,'2_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1150,'1_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',2),
 (1151,'1_WAR_opensocialportlet','CONFIGURATION',4),
 (1152,'1_WAR_opensocialportlet','VIEW',1),
 (1153,'1_WAR_opensocialportlet','PERMISSIONS',8),
 (1154,'1_WAR_opensocialportlet','PREFERENCES',16),
 (1155,'com.liferay.opensocial.model.Gadget','DELETE',2),
 (1156,'com.liferay.opensocial.model.Gadget','PERMISSIONS',4),
 (1157,'com.liferay.opensocial.model.Gadget','UPDATE',8),
 (1158,'com.liferay.opensocial.model.Gadget','VIEW',1),
 (1159,'com.liferay.opensocial','PERMISSIONS',2),
 (1160,'com.liferay.opensocial','PUBLISH_GADGET',4),
 (1161,'3_WAR_opensocialportlet','ADD_TO_PAGE',2),
 (1162,'3_WAR_opensocialportlet','CONFIGURATION',4),
 (1163,'3_WAR_opensocialportlet','VIEW',1),
 (1164,'3_WAR_opensocialportlet','PERMISSIONS',8),
 (1165,'3_WAR_opensocialportlet','PREFERENCES',16),
 (1166,'3_WAR_opensocialportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1167,'1_WAR_webformportlet','VIEW',1),
 (1168,'1_WAR_webformportlet','ADD_TO_PAGE',2),
 (1169,'1_WAR_webformportlet','CONFIGURATION',4),
 (1170,'1_WAR_webformportlet','PERMISSIONS',8),
 (1171,'1_WAR_webformportlet','PREFERENCES',16),
 (1172,'1_WAR_webformportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1201,'testcomponente_WAR_testcomponenteportlet','VIEW',1),
 (1202,'testcomponente_WAR_testcomponenteportlet','ADD_TO_PAGE',2),
 (1203,'testcomponente_WAR_testcomponenteportlet','CONFIGURATION',4),
 (1204,'testcomponente_WAR_testcomponenteportlet','PERMISSIONS',8),
 (1205,'testcomponente_WAR_testcomponenteportlet','PREFERENCES',16),
 (1206,'testcomponente_WAR_testcomponenteportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1301,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','VIEW',1),
 (1302,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','ADD_TO_PAGE',2),
 (1303,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','CONFIGURATION',4),
 (1304,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','PERMISSIONS',8),
 (1305,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','PREFERENCES',16),
 (1306,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1401,'testcomponente2_WAR_testcomponente2portlet','VIEW',1),
 (1402,'testcomponente2_WAR_testcomponente2portlet','ADD_TO_PAGE',2),
 (1403,'testcomponente2_WAR_testcomponente2portlet','CONFIGURATION',4),
 (1404,'testcomponente2_WAR_testcomponente2portlet','PERMISSIONS',8),
 (1405,'testcomponente2_WAR_testcomponente2portlet','PREFERENCES',16),
 (1406,'testcomponente2_WAR_testcomponente2portlet','ACCESS_IN_CONTROL_PANEL',32),
 (1501,'testcomponente3_WAR_testcomponente3portlet','VIEW',1),
 (1502,'testcomponente3_WAR_testcomponente3portlet','ADD_TO_PAGE',2),
 (1503,'testcomponente3_WAR_testcomponente3portlet','CONFIGURATION',4),
 (1504,'testcomponente3_WAR_testcomponente3portlet','PERMISSIONS',8),
 (1505,'testcomponente3_WAR_testcomponente3portlet','PREFERENCES',16),
 (1506,'testcomponente3_WAR_testcomponente3portlet','ACCESS_IN_CONTROL_PANEL',32),
 (1601,'rec_WAR_recportlet','VIEW',1),
 (1602,'rec_WAR_recportlet','ADD_TO_PAGE',2),
 (1603,'rec_WAR_recportlet','CONFIGURATION',4),
 (1604,'rec_WAR_recportlet','PERMISSIONS',8),
 (1605,'rec_WAR_recportlet','PREFERENCES',16),
 (1606,'rec_WAR_recportlet','ACCESS_IN_CONTROL_PANEL',32),
 (1607,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','VIEW',1),
 (1608,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','ADD_TO_PAGE',2),
 (1609,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','CONFIGURATION',4),
 (1610,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','PERMISSIONS',8),
 (1611,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','PREFERENCES',16),
 (1612,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet','ACCESS_IN_CONTROL_PANEL',32);
/*!40000 ALTER TABLE `resourceaction` ENABLE KEYS */;


--
-- Definition of table `resourceblock`
--

DROP TABLE IF EXISTS `resourceblock`;
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

--
-- Dumping data for table `resourceblock`
--

/*!40000 ALTER TABLE `resourceblock` DISABLE KEYS */;
/*!40000 ALTER TABLE `resourceblock` ENABLE KEYS */;


--
-- Definition of table `resourceblockpermission`
--

DROP TABLE IF EXISTS `resourceblockpermission`;
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

--
-- Dumping data for table `resourceblockpermission`
--

/*!40000 ALTER TABLE `resourceblockpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `resourceblockpermission` ENABLE KEYS */;


--
-- Definition of table `resourcepermission`
--

DROP TABLE IF EXISTS `resourcepermission`;
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

--
-- Dumping data for table `resourcepermission`
--

/*!40000 ALTER TABLE `resourcepermission` DISABLE KEYS */;
INSERT INTO `resourcepermission` (`resourcePermissionId`,`companyId`,`name`,`scope`,`primKey`,`roleId`,`ownerId`,`actionIds`) VALUES 
 (1,20155,'2',1,'20155',20166,0,2),
 (2,20155,'140',1,'20155',20166,0,2),
 (3,20155,'158',1,'20155',20166,0,6),
 (4,20155,'153',1,'20155',20166,0,6),
 (5,20155,'com.liferay.portal.model.Role',4,'20162',20166,0,1),
 (6,20155,'com.liferay.portal.model.Role',4,'20163',20166,0,1),
 (7,20155,'com.liferay.portal.model.Role',4,'20164',20166,0,1),
 (8,20155,'com.liferay.portal.model.Role',4,'20165',20166,0,1),
 (9,20155,'com.liferay.portal.model.Role',4,'20166',20166,0,1),
 (10,20155,'com.liferay.portal.model.Role',4,'20167',20166,0,1),
 (11,20155,'com.liferay.portal.model.Role',4,'20168',20166,0,1),
 (12,20155,'com.liferay.portal.model.Role',4,'20169',20166,0,1),
 (13,20155,'com.liferay.portal.model.Role',4,'20170',20166,0,1),
 (14,20155,'com.liferay.portal.model.Role',4,'20171',20166,0,1),
 (15,20155,'com.liferay.portal.model.Role',4,'20172',20166,0,1),
 (16,20155,'com.liferay.portal.model.Layout',4,'20176',20164,20159,1023),
 (17,20155,'com.liferay.portal.model.Layout',4,'20176',20171,0,19),
 (18,20155,'com.liferay.portal.model.Layout',4,'20176',20163,0,1),
 (19,20155,'com.liferay.portal.model.Layout',4,'20185',20164,20159,1023),
 (20,20155,'com.liferay.portal.model.Layout',4,'20185',20171,0,19),
 (21,20155,'com.liferay.portal.model.Layout',4,'20185',20163,0,1),
 (22,20155,'com.liferay.portal.model.Layout',2,'20192',20166,0,1),
 (23,20155,'com.liferay.portlet.blogs',2,'20192',20166,0,14),
 (24,20155,'98',2,'20192',20165,0,2),
 (25,20155,'183',2,'20192',20165,0,32),
 (26,20155,'152',2,'20192',20165,0,2),
 (27,20155,'182',2,'20192',20165,0,32),
 (28,20155,'179',2,'20192',20165,0,2),
 (29,20155,'173',2,'20192',20165,0,32),
 (30,20155,'154',2,'20192',20165,0,2),
 (31,20155,'178',2,'20192',20165,0,32),
 (32,20155,'147',2,'20192',20165,0,2),
 (33,20155,'161',2,'20192',20165,0,2),
 (34,20155,'162',2,'20192',20165,0,2),
 (35,20155,'167',2,'20192',20165,0,2),
 (36,20155,'20',2,'20192',20165,0,2),
 (37,20155,'99',2,'20192',20165,0,2),
 (38,20155,'28',2,'20192',20165,0,2),
 (39,20155,'15',2,'20192',20165,0,2),
 (40,20155,'25',2,'20192',20165,0,2),
 (41,20155,'com.liferay.portal.model.Group',2,'20192',20165,0,8396800),
 (42,20155,'com.liferay.portlet.asset',2,'20192',20165,0,30),
 (43,20155,'com.liferay.portlet.blogs',2,'20192',20165,0,14),
 (44,20155,'com.liferay.portlet.bookmarks',2,'20192',20165,0,31),
 (45,20155,'com.liferay.portlet.documentlibrary',2,'20192',20165,0,1023),
 (46,20155,'com.liferay.portlet.journal',2,'20192',20165,0,255),
 (47,20155,'com.liferay.portlet.messageboards',2,'20192',20165,0,2047),
 (48,20155,'com.liferay.portlet.polls',2,'20192',20165,0,6),
 (49,20155,'com.liferay.portlet.wiki',2,'20192',20165,0,6),
 (50,20155,'com.liferay.portal.model.User',4,'20199',20164,20199,31),
 (51,20155,'98',1,'20155',20165,0,4),
 (52,20155,'98',1,'20155',20166,0,4),
 (53,20155,'183',1,'20155',20162,0,2),
 (54,20155,'66',1,'20155',20165,0,2),
 (55,20155,'66',1,'20155',20166,0,2),
 (56,20155,'180',1,'20155',20163,0,2),
 (57,20155,'180',1,'20155',20165,0,2),
 (58,20155,'180',1,'20155',20166,0,2),
 (59,20155,'27',1,'20155',20165,0,2),
 (60,20155,'27',1,'20155',20166,0,2),
 (61,20155,'122',1,'20155',20163,0,8),
 (62,20155,'122',1,'20155',20165,0,8),
 (63,20155,'122',1,'20155',20166,0,8),
 (64,20155,'36',1,'20155',20165,0,4),
 (65,20155,'36',1,'20155',20166,0,4),
 (66,20155,'26',1,'20155',20165,0,2),
 (67,20155,'26',1,'20155',20166,0,2),
 (68,20155,'175',1,'20155',20163,0,2),
 (69,20155,'175',1,'20155',20165,0,2),
 (70,20155,'175',1,'20155',20166,0,2),
 (71,20155,'153',1,'20155',20165,0,4),
 (72,20155,'64',1,'20155',20163,0,2),
 (73,20155,'64',1,'20155',20165,0,2),
 (74,20155,'64',1,'20155',20166,0,2),
 (75,20155,'182',1,'20155',20165,0,2),
 (76,20155,'182',1,'20155',20166,0,2),
 (77,20155,'173',1,'20155',20163,0,2),
 (78,20155,'173',1,'20155',20165,0,2),
 (79,20155,'173',1,'20155',20166,0,2),
 (80,20155,'100',1,'20155',20165,0,2),
 (81,20155,'100',1,'20155',20166,0,2),
 (82,20155,'19',1,'20155',20165,0,2),
 (83,20155,'19',1,'20155',20166,0,2),
 (84,20155,'181',1,'20155',20163,0,2),
 (85,20155,'181',1,'20155',20165,0,2),
 (86,20155,'181',1,'20155',20166,0,2),
 (87,20155,'148',1,'20155',20163,0,2),
 (88,20155,'148',1,'20155',20165,0,2),
 (89,20155,'148',1,'20155',20166,0,2),
 (90,20155,'11',1,'20155',20165,0,2),
 (91,20155,'11',1,'20155',20166,0,2),
 (92,20155,'29',1,'20155',20165,0,2),
 (93,20155,'29',1,'20155',20166,0,2),
 (94,20155,'158',1,'20155',20165,0,4),
 (95,20155,'178',1,'20155',20165,0,4),
 (96,20155,'178',1,'20155',20166,0,4),
 (97,20155,'58',1,'20155',20163,0,2),
 (98,20155,'58',1,'20155',20165,0,2),
 (99,20155,'58',1,'20155',20166,0,2),
 (100,20155,'71',1,'20155',20163,0,2),
 (101,20155,'71',1,'20155',20165,0,2),
 (102,20155,'71',1,'20155',20166,0,2),
 (103,20155,'97',1,'20155',20165,0,2),
 (104,20155,'97',1,'20155',20166,0,2),
 (105,20155,'39',1,'20155',20165,0,2),
 (106,20155,'39',1,'20155',20166,0,2),
 (107,20155,'85',1,'20155',20163,0,2),
 (108,20155,'85',1,'20155',20165,0,2),
 (109,20155,'85',1,'20155',20166,0,2),
 (110,20155,'118',1,'20155',20163,0,2),
 (111,20155,'118',1,'20155',20165,0,2),
 (112,20155,'118',1,'20155',20166,0,2),
 (113,20155,'107',1,'20155',20165,0,2),
 (114,20155,'107',1,'20155',20166,0,2),
 (115,20155,'30',1,'20155',20165,0,2),
 (116,20155,'30',1,'20155',20166,0,2),
 (117,20155,'184',1,'20155',20163,0,2),
 (118,20155,'184',1,'20155',20165,0,2),
 (119,20155,'184',1,'20155',20166,0,2),
 (120,20155,'48',1,'20155',20165,0,2),
 (121,20155,'48',1,'20155',20166,0,2),
 (122,20155,'62',1,'20155',20165,0,2),
 (123,20155,'62',1,'20155',20166,0,2),
 (124,20155,'176',1,'20155',20162,0,2),
 (125,20155,'108',1,'20155',20165,0,2),
 (126,20155,'108',1,'20155',20166,0,2),
 (127,20155,'187',1,'20155',20165,0,2),
 (128,20155,'187',1,'20155',20166,0,2),
 (129,20155,'84',1,'20155',20165,0,4),
 (130,20155,'84',1,'20155',20166,0,4),
 (131,20155,'101',1,'20155',20163,0,4),
 (132,20155,'101',1,'20155',20165,0,4),
 (133,20155,'101',1,'20155',20166,0,4),
 (134,20155,'121',1,'20155',20163,0,2),
 (135,20155,'121',1,'20155',20165,0,2),
 (136,20155,'121',1,'20155',20166,0,2),
 (137,20155,'143',1,'20155',20163,0,2),
 (138,20155,'143',1,'20155',20165,0,2),
 (139,20155,'143',1,'20155',20166,0,2),
 (140,20155,'77',1,'20155',20163,0,2),
 (141,20155,'77',1,'20155',20165,0,2),
 (142,20155,'77',1,'20155',20166,0,2),
 (143,20155,'167',1,'20155',20165,0,4),
 (144,20155,'167',1,'20155',20166,0,4),
 (145,20155,'115',1,'20155',20163,0,2),
 (146,20155,'115',1,'20155',20165,0,2),
 (147,20155,'115',1,'20155',20166,0,2),
 (148,20155,'56',1,'20155',20163,0,2),
 (149,20155,'56',1,'20155',20165,0,2),
 (150,20155,'56',1,'20155',20166,0,2),
 (151,20155,'16',1,'20155',20165,0,8),
 (152,20155,'16',1,'20155',20166,0,8),
 (153,20155,'3',1,'20155',20163,0,2),
 (154,20155,'3',1,'20155',20165,0,2),
 (155,20155,'3',1,'20155',20166,0,2),
 (156,20155,'20',1,'20155',20163,0,8),
 (157,20155,'20',1,'20155',20165,0,8),
 (158,20155,'20',1,'20155',20166,0,8),
 (159,20155,'23',1,'20155',20165,0,2),
 (160,20155,'23',1,'20155',20166,0,2),
 (161,20155,'83',1,'20155',20165,0,4),
 (162,20155,'83',1,'20155',20166,0,4),
 (163,20155,'186',1,'20155',20165,0,2),
 (164,20155,'186',1,'20155',20166,0,2),
 (165,20155,'194',1,'20155',20163,0,2),
 (166,20155,'194',1,'20155',20165,0,2),
 (167,20155,'194',1,'20155',20166,0,2),
 (168,20155,'70',1,'20155',20165,0,2),
 (169,20155,'70',1,'20155',20166,0,2),
 (170,20155,'164',1,'20155',20163,0,2),
 (171,20155,'164',1,'20155',20165,0,2),
 (172,20155,'164',1,'20155',20166,0,2),
 (173,20155,'141',1,'20155',20163,0,8),
 (174,20155,'141',1,'20155',20165,0,8),
 (175,20155,'141',1,'20155',20166,0,8),
 (176,20155,'9',1,'20155',20162,0,2),
 (177,20155,'28',1,'20155',20165,0,4),
 (178,20155,'28',1,'20155',20166,0,4),
 (179,20155,'15',1,'20155',20165,0,4),
 (180,20155,'15',1,'20155',20166,0,4),
 (181,20155,'47',1,'20155',20163,0,2),
 (182,20155,'47',1,'20155',20165,0,2),
 (183,20155,'47',1,'20155',20166,0,2),
 (184,20155,'116',1,'20155',20163,0,2),
 (185,20155,'116',1,'20155',20165,0,2),
 (186,20155,'116',1,'20155',20166,0,2),
 (187,20155,'82',1,'20155',20163,0,2),
 (188,20155,'82',1,'20155',20165,0,2),
 (189,20155,'82',1,'20155',20166,0,2),
 (190,20155,'54',1,'20155',20165,0,2),
 (191,20155,'54',1,'20155',20166,0,2),
 (192,20155,'34',1,'20155',20165,0,2),
 (193,20155,'34',1,'20155',20166,0,2),
 (194,20155,'169',1,'20155',20165,0,2),
 (195,20155,'169',1,'20155',20166,0,2),
 (196,20155,'61',1,'20155',20165,0,2),
 (197,20155,'61',1,'20155',20166,0,2),
 (198,20155,'73',1,'20155',20163,0,2),
 (199,20155,'73',1,'20155',20165,0,2),
 (200,20155,'73',1,'20155',20166,0,2),
 (201,20155,'50',1,'20155',20163,0,2),
 (202,20155,'50',1,'20155',20165,0,2),
 (203,20155,'50',1,'20155',20166,0,2),
 (204,20155,'127',1,'20155',20162,0,2),
 (205,20155,'193',1,'20155',20163,0,2),
 (206,20155,'193',1,'20155',20165,0,2),
 (207,20155,'193',1,'20155',20166,0,2),
 (208,20155,'31',1,'20155',20163,0,2),
 (209,20155,'31',1,'20155',20165,0,2),
 (210,20155,'31',1,'20155',20166,0,2),
 (211,20155,'166',1,'20155',20165,0,4),
 (212,20155,'166',1,'20155',20166,0,4),
 (213,20155,'33',1,'20155',20163,0,4),
 (214,20155,'33',1,'20155',20165,0,4),
 (215,20155,'33',1,'20155',20166,0,4),
 (216,20155,'114',1,'20155',20163,0,2),
 (217,20155,'114',1,'20155',20165,0,2),
 (218,20155,'114',1,'20155',20166,0,2),
 (219,20155,'67',1,'20155',20165,0,2),
 (220,20155,'67',1,'20155',20166,0,2),
 (221,20155,'110',1,'20155',20165,0,2),
 (222,20155,'110',1,'20155',20166,0,2),
 (223,20155,'59',1,'20155',20165,0,2),
 (224,20155,'59',1,'20155',20166,0,2),
 (225,20155,'188',1,'20155',20165,0,2),
 (226,20155,'188',1,'20155',20166,0,2),
 (227,20155,'102',1,'20155',20162,0,2),
 (228,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20303',20164,20159,15),
 (229,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20303',20166,0,1),
 (230,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20303',20163,0,1),
 (231,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20304',20164,20159,15),
 (232,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20304',20166,0,1),
 (233,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20304',20163,0,1),
 (234,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20305',20164,20159,15),
 (235,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20305',20166,0,1),
 (236,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20305',20163,0,1),
 (237,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20307',20164,20159,15),
 (238,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20307',20166,0,1),
 (239,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20307',20163,0,1),
 (240,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20306',20164,20159,15),
 (241,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20306',20166,0,1),
 (242,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20306',20163,0,1),
 (243,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20309',20164,20159,15),
 (244,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20309',20166,0,1),
 (245,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20309',20163,0,1),
 (246,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20308',20164,20159,15),
 (247,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20308',20166,0,1),
 (248,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20308',20163,0,1),
 (249,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20311',20164,20159,15),
 (250,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20311',20166,0,1),
 (251,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20311',20163,0,1),
 (252,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20310',20164,20159,15),
 (253,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20310',20166,0,1),
 (254,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20310',20163,0,1),
 (255,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20313',20164,20159,15),
 (256,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20313',20166,0,1),
 (257,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20313',20163,0,1),
 (258,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20312',20164,20159,15),
 (259,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20312',20166,0,1),
 (260,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntryType',4,'20312',20163,0,1),
 (261,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20315',20164,20159,15),
 (262,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20315',20166,0,1),
 (263,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'20315',20163,0,1),
 (264,20155,'com.liferay.portal.model.LayoutPrototype',4,'20316',20164,20159,15),
 (265,20155,'com.liferay.portal.model.Layout',4,'20320',20164,20159,1023),
 (266,20155,'com.liferay.portal.model.Layout',4,'20320',20171,0,19),
 (267,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'20324',20164,20159,15),
 (268,20155,'33',4,'20320_LAYOUT_33',20164,0,127),
 (269,20155,'33',4,'20320_LAYOUT_33',20171,0,1),
 (270,20155,'33',4,'20320_LAYOUT_33',20163,0,1),
 (271,20155,'com.liferay.portlet.blogs',4,'20317',20164,0,14),
 (272,20155,'148',4,'20320_LAYOUT_148_INSTANCE_QwYKSXpqC5Wk',20164,0,63),
 (273,20155,'148',4,'20320_LAYOUT_148_INSTANCE_QwYKSXpqC5Wk',20171,0,1),
 (274,20155,'148',4,'20320_LAYOUT_148_INSTANCE_QwYKSXpqC5Wk',20163,0,1),
 (275,20155,'114',4,'20320_LAYOUT_114',20164,0,63),
 (276,20155,'114',4,'20320_LAYOUT_114',20171,0,1),
 (277,20155,'114',4,'20320_LAYOUT_114',20163,0,1),
 (278,20155,'com.liferay.portal.model.LayoutPrototype',4,'20328',20164,20159,15),
 (279,20155,'com.liferay.portal.model.Layout',4,'20332',20164,20159,1023),
 (280,20155,'com.liferay.portal.model.Layout',4,'20332',20171,0,19),
 (281,20155,'141',4,'20332_LAYOUT_141_INSTANCE_1YsD5GuRvzAS',20164,0,127),
 (282,20155,'141',4,'20332_LAYOUT_141_INSTANCE_1YsD5GuRvzAS',20171,0,1),
 (283,20155,'141',4,'20332_LAYOUT_141_INSTANCE_1YsD5GuRvzAS',20163,0,1),
 (284,20155,'122',4,'20332_LAYOUT_122_INSTANCE_JccLcnQ7QfT7',20164,0,127),
 (285,20155,'122',4,'20332_LAYOUT_122_INSTANCE_JccLcnQ7QfT7',20171,0,1),
 (286,20155,'122',4,'20332_LAYOUT_122_INSTANCE_JccLcnQ7QfT7',20163,0,1),
 (287,20155,'3',4,'20332_LAYOUT_3',20164,0,63),
 (288,20155,'3',4,'20332_LAYOUT_3',20171,0,1),
 (289,20155,'3',4,'20332_LAYOUT_3',20163,0,1),
 (290,20155,'101',4,'20332_LAYOUT_101_INSTANCE_wtxRiemfrYJa',20164,0,255),
 (291,20155,'101',4,'20332_LAYOUT_101_INSTANCE_wtxRiemfrYJa',20171,0,17),
 (292,20155,'101',4,'20332_LAYOUT_101_INSTANCE_wtxRiemfrYJa',20163,0,1),
 (293,20155,'com.liferay.portal.model.LayoutPrototype',4,'20338',20164,20159,15),
 (294,20155,'com.liferay.portal.model.Layout',4,'20342',20164,20159,1023),
 (295,20155,'com.liferay.portal.model.Layout',4,'20342',20171,0,19),
 (296,20155,'36',4,'20342_LAYOUT_36',20164,0,127),
 (297,20155,'36',4,'20342_LAYOUT_36',20171,0,1),
 (298,20155,'36',4,'20342_LAYOUT_36',20163,0,1),
 (299,20155,'com.liferay.portlet.wiki',4,'20339',20164,0,6),
 (300,20155,'122',4,'20342_LAYOUT_122_INSTANCE_95tdESXNwKDF',20164,0,127),
 (301,20155,'122',4,'20342_LAYOUT_122_INSTANCE_95tdESXNwKDF',20171,0,1),
 (302,20155,'122',4,'20342_LAYOUT_122_INSTANCE_95tdESXNwKDF',20163,0,1),
 (303,20155,'141',4,'20342_LAYOUT_141_INSTANCE_Uv0J0pJCdtEH',20164,0,127),
 (304,20155,'141',4,'20342_LAYOUT_141_INSTANCE_Uv0J0pJCdtEH',20171,0,1),
 (305,20155,'141',4,'20342_LAYOUT_141_INSTANCE_Uv0J0pJCdtEH',20163,0,1),
 (306,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'20349',20164,20159,15),
 (310,20155,'com.liferay.portal.model.Layout',4,'20361',20164,20159,1023),
 (311,20155,'com.liferay.portal.model.Layout',4,'20361',20171,0,19),
 (312,20155,'com.liferay.portal.model.Layout',4,'20361',20163,0,1),
 (313,20155,'19',4,'20361_LAYOUT_19',20164,0,63),
 (314,20155,'19',4,'20361_LAYOUT_19',20171,0,1),
 (315,20155,'19',4,'20361_LAYOUT_19',20163,0,1),
 (316,20155,'com.liferay.portlet.messageboards',4,'20350',20164,0,2047),
 (317,20155,'com.liferay.portlet.messageboards',4,'20350',20171,0,781),
 (318,20155,'com.liferay.portlet.messageboards',4,'20350',20163,0,1),
 (319,20155,'3',4,'20361_LAYOUT_3',20164,0,63),
 (320,20155,'3',4,'20361_LAYOUT_3',20171,0,1),
 (321,20155,'3',4,'20361_LAYOUT_3',20163,0,1),
 (322,20155,'59',4,'20361_LAYOUT_59_INSTANCE_9x2MX0GHbZA5',20164,0,63),
 (323,20155,'59',4,'20361_LAYOUT_59_INSTANCE_9x2MX0GHbZA5',20171,0,1),
 (324,20155,'59',4,'20361_LAYOUT_59_INSTANCE_9x2MX0GHbZA5',20163,0,1),
 (325,20155,'com.liferay.portlet.polls',4,'20350',20164,0,6),
 (326,20155,'180',4,'20361_LAYOUT_180',20164,0,63),
 (327,20155,'180',4,'20361_LAYOUT_180',20171,0,1),
 (328,20155,'180',4,'20361_LAYOUT_180',20163,0,1),
 (329,20155,'101',4,'20361_LAYOUT_101_INSTANCE_2yWh9wL93hPN',20164,0,255),
 (330,20155,'101',4,'20361_LAYOUT_101_INSTANCE_2yWh9wL93hPN',20171,0,17),
 (331,20155,'101',4,'20361_LAYOUT_101_INSTANCE_2yWh9wL93hPN',20163,0,1),
 (332,20155,'com.liferay.portal.model.Layout',4,'20369',20164,20159,1023),
 (333,20155,'com.liferay.portal.model.Layout',4,'20369',20171,0,19),
 (334,20155,'com.liferay.portal.model.Layout',4,'20369',20163,0,1),
 (335,20155,'36',4,'20369_LAYOUT_36',20164,0,127),
 (336,20155,'36',4,'20369_LAYOUT_36',20171,0,1),
 (337,20155,'36',4,'20369_LAYOUT_36',20163,0,1),
 (338,20155,'com.liferay.portlet.wiki',4,'20350',20164,0,6),
 (339,20155,'122',4,'20369_LAYOUT_122_INSTANCE_eShdodPAVR3l',20164,0,127),
 (340,20155,'122',4,'20369_LAYOUT_122_INSTANCE_eShdodPAVR3l',20171,0,1),
 (341,20155,'122',4,'20369_LAYOUT_122_INSTANCE_eShdodPAVR3l',20163,0,1),
 (342,20155,'148',4,'20369_LAYOUT_148_INSTANCE_ed1b1IzyNMGo',20164,0,63),
 (343,20155,'148',4,'20369_LAYOUT_148_INSTANCE_ed1b1IzyNMGo',20171,0,1),
 (344,20155,'148',4,'20369_LAYOUT_148_INSTANCE_ed1b1IzyNMGo',20163,0,1),
 (345,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'20375',20164,20159,15),
 (349,20155,'com.liferay.portal.model.Layout',4,'20387',20164,20159,1023),
 (350,20155,'com.liferay.portal.model.Layout',4,'20387',20171,0,19),
 (351,20155,'com.liferay.portal.model.Layout',4,'20387',20163,0,1),
 (352,20155,'116',4,'20387_LAYOUT_116',20164,0,63),
 (353,20155,'116',4,'20387_LAYOUT_116',20171,0,1),
 (354,20155,'116',4,'20387_LAYOUT_116',20163,0,1),
 (355,20155,'3',4,'20387_LAYOUT_3',20164,0,63),
 (356,20155,'3',4,'20387_LAYOUT_3',20171,0,1),
 (357,20155,'3',4,'20387_LAYOUT_3',20163,0,1),
 (358,20155,'82',4,'20387_LAYOUT_82',20164,0,63),
 (359,20155,'82',4,'20387_LAYOUT_82',20171,0,1),
 (360,20155,'82',4,'20387_LAYOUT_82',20163,0,1),
 (361,20155,'101',4,'20387_LAYOUT_101_INSTANCE_Ec28aTlGMIUU',20164,0,255),
 (362,20155,'101',4,'20387_LAYOUT_101_INSTANCE_Ec28aTlGMIUU',20171,0,17),
 (363,20155,'101',4,'20387_LAYOUT_101_INSTANCE_Ec28aTlGMIUU',20163,0,1),
 (364,20155,'com.liferay.portal.model.Layout',4,'20396',20164,20159,1023),
 (365,20155,'com.liferay.portal.model.Layout',4,'20396',20171,0,19),
 (366,20155,'com.liferay.portal.model.Layout',4,'20396',20163,0,1),
 (367,20155,'20',4,'20396_LAYOUT_20',20164,0,127),
 (368,20155,'20',4,'20396_LAYOUT_20',20171,0,1),
 (369,20155,'20',4,'20396_LAYOUT_20',20163,0,1),
 (370,20155,'com.liferay.portlet.documentlibrary',4,'20376',20164,0,1023),
 (371,20155,'com.liferay.portlet.documentlibrary',4,'20376',20171,0,331),
 (372,20155,'com.liferay.portlet.documentlibrary',4,'20376',20163,0,1),
 (373,20155,'101',4,'20396_LAYOUT_101_INSTANCE_sA35cK7SEwJI',20164,0,255),
 (374,20155,'101',4,'20396_LAYOUT_101_INSTANCE_sA35cK7SEwJI',20171,0,17),
 (375,20155,'101',4,'20396_LAYOUT_101_INSTANCE_sA35cK7SEwJI',20163,0,1),
 (376,20155,'com.liferay.portal.model.Layout',4,'20404',20164,20159,1023),
 (377,20155,'com.liferay.portal.model.Layout',4,'20404',20171,0,19),
 (378,20155,'com.liferay.portal.model.Layout',4,'20404',20163,0,1),
 (379,20155,'39',4,'20404_LAYOUT_39_INSTANCE_2Q9CgFFYf4CZ',20164,0,63),
 (380,20155,'39',4,'20404_LAYOUT_39_INSTANCE_2Q9CgFFYf4CZ',20171,0,1),
 (381,20155,'39',4,'20404_LAYOUT_39_INSTANCE_2Q9CgFFYf4CZ',20163,0,1),
 (382,20155,'39',4,'20404_LAYOUT_39_INSTANCE_tcHYhVp4tgLc',20164,0,63),
 (383,20155,'39',4,'20404_LAYOUT_39_INSTANCE_tcHYhVp4tgLc',20171,0,1),
 (384,20155,'39',4,'20404_LAYOUT_39_INSTANCE_tcHYhVp4tgLc',20163,0,1),
 (391,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20418',20164,20159,15),
 (392,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20420',20164,20159,15),
 (393,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20423',20164,20159,15),
 (394,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20425',20164,20159,15),
 (395,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20427',20164,20159,15),
 (396,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20429',20164,20159,15),
 (397,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMTemplate',4,'20431',20164,20159,15),
 (398,20155,'com.liferay.portlet.expando.model.ExpandoColumn',4,'20442',20164,0,15),
 (399,20155,'1_WAR_calendarportlet',1,'20155',20162,0,4),
 (400,20155,'1_WAR_calendarportlet',1,'20155',20163,0,4),
 (401,20155,'1_WAR_calendarportlet',1,'20155',20165,0,4),
 (402,20155,'1_WAR_calendarportlet',1,'20155',20166,0,4),
 (403,20155,'1_WAR_notificationsportlet',1,'20155',20162,0,2),
 (404,20155,'1_WAR_notificationsportlet',1,'20155',20163,0,2),
 (405,20155,'1_WAR_notificationsportlet',1,'20155',20165,0,2),
 (406,20155,'1_WAR_notificationsportlet',1,'20155',20166,0,2),
 (407,20155,'2_WAR_opensocialportlet',1,'20155',20162,0,2),
 (408,20155,'2_WAR_opensocialportlet',1,'20155',20163,0,2),
 (409,20155,'2_WAR_opensocialportlet',1,'20155',20165,0,2),
 (410,20155,'2_WAR_opensocialportlet',1,'20155',20166,0,2),
 (411,20155,'3_WAR_opensocialportlet',1,'20155',20162,0,2),
 (412,20155,'3_WAR_opensocialportlet',1,'20155',20163,0,2),
 (413,20155,'3_WAR_opensocialportlet',1,'20155',20165,0,2),
 (414,20155,'3_WAR_opensocialportlet',1,'20155',20166,0,2),
 (415,20155,'1_WAR_webformportlet',1,'20155',20162,0,2),
 (416,20155,'1_WAR_webformportlet',1,'20155',20163,0,2),
 (417,20155,'1_WAR_webformportlet',1,'20155',20165,0,2),
 (418,20155,'1_WAR_webformportlet',1,'20155',20166,0,2),
 (420,20155,'145',4,'20185_LAYOUT_145',20164,0,63),
 (421,20155,'145',4,'20185_LAYOUT_145',20171,0,1),
 (422,20155,'145',4,'20185_LAYOUT_145',20163,0,1),
 (423,20155,'58',4,'20185_LAYOUT_58',20164,0,63),
 (424,20155,'58',4,'20185_LAYOUT_58',20171,0,1),
 (425,20155,'58',4,'20185_LAYOUT_58',20163,0,1),
 (429,20155,'2_WAR_notificationsportlet',4,'20185_LAYOUT_2_WAR_notificationsportlet',20164,0,63),
 (430,20155,'2_WAR_notificationsportlet',4,'20185_LAYOUT_2_WAR_notificationsportlet',20171,0,1),
 (431,20155,'2_WAR_notificationsportlet',4,'20185_LAYOUT_2_WAR_notificationsportlet',20163,0,1),
 (432,20155,'49',4,'20185_LAYOUT_49',20164,0,63),
 (433,20155,'49',4,'20185_LAYOUT_49',20171,0,1),
 (434,20155,'49',4,'20185_LAYOUT_49',20163,0,1),
 (435,20155,'1_WAR_notificationsportlet',4,'20185_LAYOUT_1_WAR_notificationsportlet',20164,0,63),
 (436,20155,'1_WAR_notificationsportlet',4,'20185_LAYOUT_1_WAR_notificationsportlet',20171,0,1),
 (437,20155,'1_WAR_notificationsportlet',4,'20185_LAYOUT_1_WAR_notificationsportlet',20163,0,1),
 (552,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'20811',20164,20159,15),
 (559,20155,'com.liferay.portlet.journal',4,'20182',20164,0,255),
 (560,20155,'com.liferay.portlet.journal',4,'20182',20171,0,1),
 (561,20155,'com.liferay.portlet.journal',4,'20182',20163,0,1),
 (562,20155,'com.liferay.portlet.documentlibrary',4,'20182',20164,0,1023),
 (563,20155,'com.liferay.portlet.documentlibrary',4,'20182',20171,0,331),
 (564,20155,'com.liferay.portlet.documentlibrary',4,'20182',20163,0,1),
 (652,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'21211',20164,20159,15),
 (659,20155,'testcomponente_WAR_testcomponenteportlet',1,'20155',20162,0,2),
 (660,20155,'testcomponente_WAR_testcomponenteportlet',1,'20155',20163,0,2),
 (661,20155,'testcomponente_WAR_testcomponenteportlet',1,'20155',20165,0,2),
 (662,20155,'testcomponente_WAR_testcomponenteportlet',1,'20155',20166,0,2),
 (967,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',1,'20155',20162,0,2),
 (968,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',1,'20155',20163,0,2),
 (969,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',1,'20155',20165,0,2),
 (970,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',1,'20155',20166,0,2),
 (1010,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22743',20164,20159,255),
 (1011,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22743',20171,0,3),
 (1012,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22743',20163,0,3),
 (1013,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22751',20164,20159,255),
 (1014,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22751',20171,0,3),
 (1015,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22751',20163,0,3),
 (1016,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22761',20164,20159,255),
 (1017,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22761',20171,0,3),
 (1018,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22761',20163,0,3),
 (1019,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22769',20164,20159,255),
 (1020,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22769',20171,0,3),
 (1021,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22769',20163,0,3),
 (1022,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22779',20164,20159,255),
 (1023,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22779',20171,0,3),
 (1024,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22779',20163,0,3),
 (1025,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22789',20164,20159,255),
 (1026,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22789',20171,0,3),
 (1027,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22789',20163,0,3),
 (1028,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22812',20164,20159,255),
 (1029,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22812',20171,0,3),
 (1030,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22812',20163,0,3),
 (1031,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22830',20164,20159,255),
 (1032,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22830',20171,0,3),
 (1033,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22830',20163,0,3),
 (1034,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22843',20164,20159,255),
 (1035,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22843',20171,0,3),
 (1036,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22843',20163,0,3),
 (1037,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22855',20164,20159,255),
 (1038,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22855',20171,0,3),
 (1039,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22855',20163,0,3),
 (1040,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22869',20164,20159,255),
 (1041,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22869',20171,0,3),
 (1042,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22869',20163,0,3),
 (1043,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22881',20164,20159,255),
 (1044,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22881',20171,0,3),
 (1045,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22881',20163,0,3),
 (1046,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22895',20164,20159,255),
 (1047,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22895',20171,0,3),
 (1048,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22895',20163,0,3),
 (1049,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22908',20164,20159,255),
 (1050,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22908',20171,0,3),
 (1051,20155,'com.liferay.portlet.documentlibrary.model.DLFileEntry',4,'22908',20163,0,3),
 (1052,20155,'com.liferay.portal.model.Layout',4,'22929',20164,20159,1023),
 (1053,20155,'com.liferay.portal.model.Layout',4,'22929',20171,0,19),
 (1054,20155,'com.liferay.portal.model.Layout',4,'22929',20163,0,1),
 (1101,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'23001',20164,20159,15),
 (1102,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'23002',20164,20159,15),
 (1103,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'23003',20164,20159,15),
 (1104,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'23004',20164,20159,15),
 (1105,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'23005',20164,20159,15),
 (1106,20155,'com.liferay.portlet.dynamicdatamapping.model.DDMStructure',4,'23006',20164,20159,15),
 (1113,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',4,'20185_LAYOUT_liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',20164,0,63),
 (1114,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',4,'20185_LAYOUT_liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',20171,0,1),
 (1115,20155,'liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',4,'20185_LAYOUT_liferayauiautocompletelistwithajax_WAR_LiferayAUIAutoCompleteListWithAjaxportlet',20163,0,1),
 (1119,20155,'com.liferay.portlet.asset.model.AssetTag',4,'23039',20164,20199,15),
 (1120,20155,'com.liferay.portlet.asset.model.AssetTag',4,'23040',20164,20199,15),
 (1121,20155,'com.liferay.portlet.asset.model.AssetTag',4,'23041',20164,20199,15),
 (1122,20155,'com.liferay.portlet.asset.model.AssetTag',4,'23042',20164,20199,15),
 (1123,20155,'com.liferay.portlet.asset.model.AssetTag',4,'23043',20164,20199,15),
 (1124,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23045',20164,20159,15),
 (1125,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23047',20164,20199,31),
 (1126,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23047',20171,0,3),
 (1127,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23047',20163,0,1),
 (1128,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23049',20164,20199,31),
 (1129,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23049',20171,0,3),
 (1130,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23049',20163,0,1),
 (1137,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23053',20164,20199,15),
 (1138,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23053',20171,0,1),
 (1139,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23053',20163,0,1),
 (1140,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23054',20164,20199,31),
 (1141,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23054',20171,0,3),
 (1142,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23054',20163,0,1),
 (1143,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23055',20164,20199,31),
 (1144,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23055',20171,0,3),
 (1145,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23055',20163,0,1),
 (1146,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23056',20164,20199,31),
 (1147,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23056',20171,0,3),
 (1148,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23056',20163,0,1),
 (1149,20155,'com.liferay.portlet.journal.model.JournalFolder',4,'23060',20164,20199,127),
 (1150,20155,'com.liferay.portlet.journal.model.JournalFolder',4,'23060',20171,0,5),
 (1151,20155,'com.liferay.portlet.journal.model.JournalFolder',4,'23060',20163,0,1),
 (1152,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'23065',20164,20199,255),
 (1153,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'23065',20171,0,3),
 (1154,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'23065',20163,0,3),
 (1158,20155,'15',4,'20185_LAYOUT_15',20164,0,63),
 (1159,20155,'15',4,'20185_LAYOUT_15',20171,0,1),
 (1160,20155,'15',4,'20185_LAYOUT_15',20163,0,1),
 (1161,20155,'86',4,'20185_LAYOUT_86',20164,0,63),
 (1162,20155,'86',4,'20185_LAYOUT_86',20171,0,1),
 (1163,20155,'86',4,'20185_LAYOUT_86',20163,0,1),
 (1164,20155,'com.liferay.portlet.documentlibrary.model.DLFolder',4,'23088',20164,20199,255),
 (1165,20155,'com.liferay.portlet.documentlibrary.model.DLFolder',4,'23088',20171,0,165),
 (1166,20155,'com.liferay.portlet.documentlibrary.model.DLFolder',4,'23088',20163,0,1),
 (1167,20155,'testcomponente2_WAR_testcomponente2portlet',1,'20155',20162,0,2),
 (1168,20155,'testcomponente2_WAR_testcomponente2portlet',1,'20155',20163,0,2),
 (1169,20155,'testcomponente2_WAR_testcomponente2portlet',1,'20155',20165,0,2),
 (1170,20155,'testcomponente2_WAR_testcomponente2portlet',1,'20155',20166,0,2),
 (1182,20155,'com.liferay.portal.model.User',4,'23103',20164,20199,31),
 (1183,20155,'com.liferay.portal.model.User',4,'23112',20164,20199,31),
 (1187,20155,'com.liferay.portlet.journal',4,'20201',20164,0,255),
 (1188,20155,'com.liferay.portlet.journal',4,'20201',20166,0,1),
 (1189,20155,'com.liferay.portlet.journal',4,'20201',20163,0,1),
 (1190,20155,'com.liferay.portlet.documentlibrary',4,'20201',20164,0,1023),
 (1191,20155,'com.liferay.portlet.documentlibrary',4,'20201',20166,0,331),
 (1192,20155,'com.liferay.portlet.documentlibrary',4,'20201',20163,0,1),
 (1193,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23129',20164,20159,15),
 (1194,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23130',20164,20199,31),
 (1195,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23130',20166,0,3),
 (1196,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23131',20164,20199,31),
 (1197,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23131',20166,0,3),
 (1198,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23132',20164,20199,15),
 (1199,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'23132',20166,0,1),
 (1200,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23133',20164,20199,31),
 (1201,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23133',20166,0,3),
 (1202,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23134',20164,20199,31),
 (1203,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23134',20166,0,3),
 (1204,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23135',20164,20199,31),
 (1205,20155,'com.liferay.portlet.asset.model.AssetCategory',4,'23135',20166,0,3),
 (1206,20155,'com.liferay.portlet.journal.model.JournalFolder',4,'23136',20164,20199,127),
 (1207,20155,'com.liferay.portlet.journal.model.JournalFolder',4,'23136',20166,0,5),
 (1208,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'23141',20164,20199,255),
 (1209,20155,'com.liferay.portlet.journal.model.JournalArticle',4,'23141',20166,0,3),
 (1401,20155,'testcomponente3_WAR_testcomponente3portlet',1,'20155',20162,0,2),
 (1402,20155,'testcomponente3_WAR_testcomponente3portlet',1,'20155',20163,0,2),
 (1403,20155,'testcomponente3_WAR_testcomponente3portlet',1,'20155',20165,0,2),
 (1404,20155,'testcomponente3_WAR_testcomponente3portlet',1,'20155',20166,0,2),
 (1801,20155,'com.liferay.portal.model.Layout',4,'23805',20164,20159,1023),
 (1802,20155,'com.liferay.portal.model.Layout',4,'23805',20171,0,19),
 (1803,20155,'com.liferay.portal.model.Layout',4,'23805',20163,0,1),
 (1804,20155,'rec_WAR_recportlet',1,'20155',20162,0,2),
 (1805,20155,'rec_WAR_recportlet',1,'20155',20163,0,2),
 (1806,20155,'rec_WAR_recportlet',1,'20155',20165,0,2),
 (1807,20155,'rec_WAR_recportlet',1,'20155',20166,0,2),
 (1808,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',1,'20155',20162,0,2),
 (1809,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',1,'20155',20163,0,2),
 (1810,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',1,'20155',20165,0,2),
 (1811,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',1,'20155',20166,0,2),
 (1812,20155,'com.liferay.portal.model.LayoutSetPrototype',4,'23815',20164,20159,15),
 (1816,20155,'com.liferay.portal.model.Layout',4,'23829',20164,20159,1023),
 (1817,20155,'com.liferay.portal.model.Layout',4,'23829',20171,0,19),
 (1818,20155,'com.liferay.portal.model.Layout',4,'23829',20163,0,1),
 (1822,20155,'com.liferay.portal.model.UserGroup',4,'23836',20164,20199,127),
 (1823,20155,'com.liferay.portal.model.UserGroup',4,'23840',20164,20199,127),
 (1824,20155,'com.liferay.portal.model.UserGroup',4,'23844',20164,20199,127),
 (1825,20155,'com.liferay.portal.model.UserGroup',4,'23848',20164,20199,127),
 (1826,20155,'com.liferay.portal.model.UserGroup',4,'23852',20164,20199,127),
 (1827,20155,'com.liferay.portal.model.UserGroup',4,'23856',20164,20199,127),
 (1828,20155,'com.liferay.portal.model.UserGroup',4,'23860',20164,20199,127),
 (1829,20155,'com.liferay.portal.model.UserGroup',4,'23864',20164,20199,127),
 (1830,20155,'com.liferay.portal.model.UserGroup',4,'23868',20164,20199,127),
 (1831,20155,'com.liferay.portal.model.UserGroup',4,'23872',20164,20199,127),
 (1832,20155,'com.liferay.portlet.expando.model.ExpandoColumn',4,'23878',20164,0,15),
 (2271,20155,'com.liferay.portal.model.Role',4,'24207',20164,20199,127),
 (2272,20155,'com.liferay.portal.model.Role',4,'24208',20164,20199,127),
 (2273,20155,'com.liferay.portal.model.Role',4,'24209',20164,20199,127),
 (2274,20155,'com.liferay.portal.model.Role',4,'24210',20164,20199,127),
 (2275,20155,'com.liferay.portal.model.Role',4,'24211',20164,20199,127),
 (2276,20155,'90',1,'20155',24211,0,496389),
 (2277,20155,'127',1,'20155',24211,0,37),
 (2278,20155,'com.liferay.portal.model.UserGroup',1,'20155',24211,0,127),
 (2279,20155,'com.liferay.portal.model.User',1,'20155',24211,0,31),
 (2280,20155,'125',1,'20155',24211,0,63),
 (2281,20155,'com.liferay.portal.model.Organization',1,'20155',24211,0,2047),
 (2282,20155,'131',1,'20155',24211,0,31),
 (2283,20155,'2',1,'20155',24211,0,31),
 (2284,20155,'158',1,'20155',24211,0,59),
 (2285,20155,'191',1,'20155',24211,0,63),
 (2286,20155,'com.liferay.portal.model.Group',1,'20155',24211,0,8388608),
 (2287,20155,'com.liferay.portal.model.User',4,'24213',20164,20199,31),
 (2288,20155,'com.liferay.portlet.journal',4,'20195',20164,0,255),
 (2289,20155,'com.liferay.portlet.journal',4,'20195',20166,0,1),
 (2290,20155,'com.liferay.portlet.journal',4,'20195',20163,0,1),
 (2291,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',4,'20185_LAYOUT_ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',20164,0,63),
 (2292,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',4,'20185_LAYOUT_ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',20171,0,1),
 (2293,20155,'ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',4,'20185_LAYOUT_ActualizarSolicitudRequerimiento_WAR_ActualizarSolicitudRequerimientoportlet',20163,0,1),
 (2302,20155,'com.liferay.portal.model.Group',4,'24523',20164,0,33554431),
 (2303,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'24530',20164,20159,15),
 (2304,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'24531',20164,20159,15),
 (2305,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'24531',20171,0,0),
 (2306,20155,'com.liferay.portlet.asset.model.AssetVocabulary',4,'24531',20163,0,0),
 (2307,20155,'com.liferay.portal.model.Layout',4,'24534',20164,20159,1023),
 (2308,20155,'com.liferay.portal.model.Layout',4,'24534',20171,0,19),
 (2309,20155,'com.liferay.portal.model.Layout',4,'24534',20163,0,1),
 (2310,20155,'com.liferay.portal.model.Layout',4,'24536',20164,20159,1023),
 (2311,20155,'com.liferay.portal.model.Layout',4,'24536',20171,0,19),
 (2312,20155,'com.liferay.portal.model.Layout',4,'24536',20163,0,1),
 (2313,20155,'com.liferay.portal.model.Layout',4,'24538',20164,20159,1023),
 (2314,20155,'com.liferay.portal.model.Layout',4,'24538',20171,0,19),
 (2315,20155,'com.liferay.portal.model.Layout',4,'24538',20163,0,1),
 (2316,20155,'com.liferay.portlet.documentlibrary',4,'24523',20164,0,1023),
 (2317,20155,'com.liferay.portlet.documentlibrary',4,'24523',20163,0,1),
 (2318,20155,'com.liferay.portlet.documentlibrary',4,'24523',20171,0,331),
 (2329,20155,'101',4,'24536_LAYOUT_101_INSTANCE_sA35cK7SEwJI',20164,0,255),
 (2330,20155,'101',4,'24536_LAYOUT_101_INSTANCE_sA35cK7SEwJI',20171,0,17),
 (2335,20155,'com.liferay.portlet.journal',4,'24523',20164,0,255),
 (2336,20155,'com.liferay.portlet.journal',4,'24523',20171,0,1),
 (2337,20155,'com.liferay.portlet.journal',4,'24523',20163,0,1),
 (2338,20155,'145',4,'24534_LAYOUT_145',20164,0,63),
 (2339,20155,'145',4,'24534_LAYOUT_145',20171,0,1),
 (2340,20155,'2_WAR_notificationsportlet',4,'24534_LAYOUT_2_WAR_notificationsportlet',20164,0,63),
 (2341,20155,'2_WAR_notificationsportlet',4,'24534_LAYOUT_2_WAR_notificationsportlet',20171,0,1),
 (2342,20155,'145',4,'24536_LAYOUT_145',20164,0,63),
 (2343,20155,'145',4,'24536_LAYOUT_145',20171,0,1),
 (2344,20155,'2_WAR_notificationsportlet',4,'24536_LAYOUT_2_WAR_notificationsportlet',20164,0,63),
 (2345,20155,'2_WAR_notificationsportlet',4,'24536_LAYOUT_2_WAR_notificationsportlet',20171,0,1),
 (2346,20155,'145',4,'24538_LAYOUT_145',20164,0,63),
 (2347,20155,'145',4,'24538_LAYOUT_145',20171,0,1),
 (2348,20155,'2_WAR_notificationsportlet',4,'24538_LAYOUT_2_WAR_notificationsportlet',20164,0,63),
 (2349,20155,'2_WAR_notificationsportlet',4,'24538_LAYOUT_2_WAR_notificationsportlet',20171,0,1);
/*!40000 ALTER TABLE `resourcepermission` ENABLE KEYS */;


--
-- Definition of table `resourcetypepermission`
--

DROP TABLE IF EXISTS `resourcetypepermission`;
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

--
-- Dumping data for table `resourcetypepermission`
--

/*!40000 ALTER TABLE `resourcetypepermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `resourcetypepermission` ENABLE KEYS */;


--
-- Definition of table `role_`
--

DROP TABLE IF EXISTS `role_`;
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

--
-- Dumping data for table `role_`
--

/*!40000 ALTER TABLE `role_` DISABLE KEYS */;
INSERT INTO `role_` (`uuid_`,`roleId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`name`,`title`,`description`,`type_`,`subtype`) VALUES 
 ('df1c9863-bd02-4053-be2c-d9b949843c5f',20162,20155,20159,'','2016-03-06 15:57:48','2016-03-06 15:57:48',20004,20162,'Administrator','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Administrators are super users who can do anything.</Description></root>',1,''),
 ('5fba17f3-e55c-47d4-bfaf-42fececd2e52',20163,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20163,'Guest','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Unauthenticated users always have this role.</Description></root>',1,''),
 ('6ad98fe4-11f1-45cf-9947-e4b542ab6c3a',20164,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20164,'Owner','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">This is an implied role with respect to the objects users create.</Description></root>',1,''),
 ('f9a3c77b-dc74-4764-9548-c95b2ada07b9',20165,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20165,'Power User','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Power Users have their own personal site.</Description></root>',1,''),
 ('c9e18877-a651-420c-a95f-0ae7e2fc44be',20166,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20166,'User','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Authenticated users should be assigned this role.</Description></root>',1,''),
 ('de755110-1d6a-49e2-be1f-515f8a4254b8',20167,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20167,'Organization Administrator','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Organization Administrators are super users of their organization but cannot make other users into Organization Administrators.</Description></root>',3,''),
 ('b2978d27-ee79-4d9f-b464-0f47c185fa01',20168,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20168,'Organization Owner','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Organization Owners are super users of their organization and can assign organization roles to users.</Description></root>',3,''),
 ('eabe1860-d402-4091-9ff0-c2678ac92024',20169,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20169,'Organization User','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">All users who belong to an organization have this role within that organization.</Description></root>',3,''),
 ('538858e5-9d18-476c-ad7b-a6ae362f4482',20170,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20170,'Site Administrator','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Site Administrators are super users of their site but cannot make other users into Site Administrators.</Description></root>',2,''),
 ('2640ba0b-2f1e-41c1-bb8f-fb789a1fcaec',20171,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20171,'Site Member','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">All users who belong to a site have this role within that site.</Description></root>',2,''),
 ('7ca2f8d6-bbd7-47b7-ae04-1c610760a7e9',20172,20155,20159,'','2016-03-06 15:57:49','2016-03-06 15:57:49',20004,20172,'Site Owner','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"en_US\" default-locale=\"en_US\"><Description language-id=\"en_US\">Site Owners are super users of their site and can assign site roles to users.</Description></root>',2,''),
 ('157bb3cb-b442-42c9-b958-7cdf4ddd1d33',20486,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20004,20486,'Organization Content Reviewer','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Autogenerated role from workflow definition</Description></root>',3,''),
 ('ac45b03b-268f-4113-80ab-f5b26335d018',20488,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20004,20488,'Site Content Reviewer','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Autogenerated role from workflow definition</Description></root>',2,''),
 ('5eac659a-4797-4397-83e6-7f19de4a4aa5',20490,20155,20159,'','2016-03-06 16:10:28','2016-03-06 16:10:28',20004,20490,'Portal Content Reviewer','','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">Autogenerated role from workflow definition</Description></root>',1,''),
 ('6abd128a-959d-4892-9361-cd254101fd06',24207,20155,20199,'Test Test','2016-04-01 04:29:33','2016-04-01 04:29:33',20004,24207,'PISCOLOGO','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">PISCOLOGO</Title></root>','',1,''),
 ('abe675a8-59dc-4b78-8a0f-00cfc870b80e',24208,20155,20199,'Test Test','2016-04-01 04:29:46','2016-04-01 04:29:46',20004,24208,'GERENTEAREA','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">GERENTEAREA</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">GERENTEAREA</Description></root>',1,''),
 ('cee09db8-1b47-4b67-92c5-88091567632b',24209,20155,20199,'Test Test','2016-04-01 04:30:00','2016-04-01 04:30:00',20004,24209,'GERENTEOPERACIONES','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">GERENTEOPERACIONES</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">GERENTEOPERACIONES</Description></root>',1,''),
 ('2c545187-0ac5-41da-9293-c8afd7620d33',24210,20155,20199,'Test Test','2016-04-01 04:30:14','2016-04-01 04:30:14',20004,24210,'GERENTECAPITALHUMANO','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">GERENTECAPITALHUMANO</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">GERENTECAPITALHUMANO</Description></root>',1,''),
 ('870e13f3-d454-4f50-99fb-bbb2c88f2315',24211,20155,20199,'Test Test','2016-04-01 04:30:32','2016-04-01 04:30:32',20004,24211,'COORDINADORRRHH','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Title language-id=\"es_ES\">COORDINADORRRHH</Title></root>','<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\"es_ES\" default-locale=\"es_ES\"><Description language-id=\"es_ES\">COORDINADORRRHH</Description></root>',1,'');
/*!40000 ALTER TABLE `role_` ENABLE KEYS */;


--
-- Definition of table `scframeworkversi_scproductvers`
--

DROP TABLE IF EXISTS `scframeworkversi_scproductvers`;
CREATE TABLE `scframeworkversi_scproductvers` (
  `frameworkVersionId` bigint(20) NOT NULL,
  `productVersionId` bigint(20) NOT NULL,
  PRIMARY KEY (`frameworkVersionId`,`productVersionId`),
  KEY `IX_3BB93ECA` (`frameworkVersionId`),
  KEY `IX_E8D33FF9` (`productVersionId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scframeworkversi_scproductvers`
--

/*!40000 ALTER TABLE `scframeworkversi_scproductvers` DISABLE KEYS */;
/*!40000 ALTER TABLE `scframeworkversi_scproductvers` ENABLE KEYS */;


--
-- Definition of table `scframeworkversion`
--

DROP TABLE IF EXISTS `scframeworkversion`;
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

--
-- Dumping data for table `scframeworkversion`
--

/*!40000 ALTER TABLE `scframeworkversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `scframeworkversion` ENABLE KEYS */;


--
-- Definition of table `sclicense`
--

DROP TABLE IF EXISTS `sclicense`;
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

--
-- Dumping data for table `sclicense`
--

/*!40000 ALTER TABLE `sclicense` DISABLE KEYS */;
/*!40000 ALTER TABLE `sclicense` ENABLE KEYS */;


--
-- Definition of table `sclicenses_scproductentries`
--

DROP TABLE IF EXISTS `sclicenses_scproductentries`;
CREATE TABLE `sclicenses_scproductentries` (
  `licenseId` bigint(20) NOT NULL,
  `productEntryId` bigint(20) NOT NULL,
  PRIMARY KEY (`licenseId`,`productEntryId`),
  KEY `IX_27006638` (`licenseId`),
  KEY `IX_D7710A66` (`productEntryId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sclicenses_scproductentries`
--

/*!40000 ALTER TABLE `sclicenses_scproductentries` DISABLE KEYS */;
/*!40000 ALTER TABLE `sclicenses_scproductentries` ENABLE KEYS */;


--
-- Definition of table `scproductentry`
--

DROP TABLE IF EXISTS `scproductentry`;
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

--
-- Dumping data for table `scproductentry`
--

/*!40000 ALTER TABLE `scproductentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `scproductentry` ENABLE KEYS */;


--
-- Definition of table `scproductscreenshot`
--

DROP TABLE IF EXISTS `scproductscreenshot`;
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

--
-- Dumping data for table `scproductscreenshot`
--

/*!40000 ALTER TABLE `scproductscreenshot` DISABLE KEYS */;
/*!40000 ALTER TABLE `scproductscreenshot` ENABLE KEYS */;


--
-- Definition of table `scproductversion`
--

DROP TABLE IF EXISTS `scproductversion`;
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

--
-- Dumping data for table `scproductversion`
--

/*!40000 ALTER TABLE `scproductversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `scproductversion` ENABLE KEYS */;


--
-- Definition of table `servicecomponent`
--

DROP TABLE IF EXISTS `servicecomponent`;
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

--
-- Dumping data for table `servicecomponent`
--

/*!40000 ALTER TABLE `servicecomponent` DISABLE KEYS */;
INSERT INTO `servicecomponent` (`serviceComponentId`,`buildNamespace`,`buildNumber`,`buildDate`,`data_`) VALUES 
 (20439,'Marketplace',4,1410828214125,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table Marketplace_App (\n	uuid_ VARCHAR(75) null,\n	appId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	remoteAppId LONG,\n	title VARCHAR(75) null,\n	description STRING null,\n	category VARCHAR(75) null,\n	iconURL STRING null,\n	version VARCHAR(75) null\n);\n\ncreate table Marketplace_Module (\n	uuid_ VARCHAR(75) null,\n	moduleId LONG not null primary key,\n	appId LONG,\n	bundleSymbolicName VARCHAR(500) null,\n	bundleVersion VARCHAR(75) null,\n	contextName VARCHAR(75) null\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_94A7EF25 on Marketplace_App (category);\ncreate index IX_865B7BD5 on Marketplace_App (companyId);\ncreate index IX_20F14D93 on Marketplace_App (remoteAppId);\ncreate index IX_3E667FE1 on Marketplace_App (uuid_);\ncreate index IX_A7807DA7 on Marketplace_App (uuid_, companyId);\n\ncreate index IX_7DC16D26 on Marketplace_Module (appId);\ncreate index IX_5848F52D on Marketplace_Module (appId, bundleSymbolicName, bundleVersion);\ncreate index IX_C6938724 on Marketplace_Module (appId, contextName);\ncreate index IX_DD03D499 on Marketplace_Module (bundleSymbolicName);\ncreate index IX_F2F1E964 on Marketplace_Module (contextName);\ncreate index IX_A7EFD80E on Marketplace_Module (uuid_);]]></indexes-sql>\n</data>'),
 (20447,'Calendar',4,1424703239325,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table Calendar (\n	uuid_ VARCHAR(75) null,\n	calendarId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	resourceBlockId LONG,\n	calendarResourceId LONG,\n	name STRING null,\n	description STRING null,\n	timeZoneId VARCHAR(75) null,\n	color INTEGER,\n	defaultCalendar BOOLEAN,\n	enableComments BOOLEAN,\n	enableRatings BOOLEAN\n);\n\ncreate table CalendarBooking (\n	uuid_ VARCHAR(75) null,\n	calendarBookingId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	resourceBlockId LONG,\n	calendarId LONG,\n	calendarResourceId LONG,\n	parentCalendarBookingId LONG,\n	vEventUid VARCHAR(255) null,\n	title STRING null,\n	description TEXT null,\n	location STRING null,\n	startTime LONG,\n	endTime LONG,\n	allDay BOOLEAN,\n	recurrence STRING null,\n	firstReminder LONG,\n	firstReminderType VARCHAR(75) null,\n	secondReminder LONG,\n	secondReminderType VARCHAR(75) null,\n	status INTEGER,\n	statusByUserId LONG,\n	statusByUserName VARCHAR(75) null,\n	statusDate DATE null\n);\n\ncreate table CalendarNotificationTemplate (\n	uuid_ VARCHAR(75) null,\n	calendarNotificationTemplateId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	calendarId LONG,\n	notificationType VARCHAR(75) null,\n	notificationTypeSettings VARCHAR(75) null,\n	notificationTemplateType VARCHAR(75) null,\n	subject VARCHAR(75) null,\n	body TEXT null\n);\n\ncreate table CalendarResource (\n	uuid_ VARCHAR(75) null,\n	calendarResourceId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	resourceBlockId LONG,\n	classNameId LONG,\n	classPK LONG,\n	classUuid VARCHAR(75) null,\n	code_ VARCHAR(75) null,\n	name STRING null,\n	description STRING null,\n	active_ BOOLEAN\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_B53EB0E1 on Calendar (groupId, calendarResourceId);\ncreate index IX_97FC174E on Calendar (groupId, calendarResourceId, defaultCalendar);\ncreate index IX_F0FAF226 on Calendar (resourceBlockId);\ncreate index IX_96C8590 on Calendar (uuid_);\ncreate index IX_97656498 on Calendar (uuid_, companyId);\ncreate unique index IX_3AE311A on Calendar (uuid_, groupId);\n\ncreate index IX_D300DFCE on CalendarBooking (calendarId);\ncreate unique index IX_113A264E on CalendarBooking (calendarId, parentCalendarBookingId);\ncreate index IX_470170B4 on CalendarBooking (calendarId, status);\ncreate unique index IX_8B23DA0E on CalendarBooking (calendarId, vEventUid);\ncreate index IX_B198FFC on CalendarBooking (calendarResourceId);\ncreate index IX_57EBF55B on CalendarBooking (parentCalendarBookingId);\ncreate index IX_F7B8A941 on CalendarBooking (parentCalendarBookingId, status);\ncreate index IX_22DFDB49 on CalendarBooking (resourceBlockId);\ncreate index IX_F6E8EE73 on CalendarBooking (uuid_);\ncreate index IX_A21D9FD5 on CalendarBooking (uuid_, companyId);\ncreate unique index IX_F4C61797 on CalendarBooking (uuid_, groupId);\n\ncreate index IX_A412E5B6 on CalendarNotificationTemplate (calendarId);\ncreate index IX_7727A482 on CalendarNotificationTemplate (calendarId, notificationType, notificationTemplateType);\ncreate index IX_A2D4D78B on CalendarNotificationTemplate (uuid_);\ncreate index IX_4D7D97BD on CalendarNotificationTemplate (uuid_, companyId);\ncreate unique index IX_4012E97F on CalendarNotificationTemplate (uuid_, groupId);\n\ncreate index IX_76DDD0F7 on CalendarResource (active_);\ncreate unique index IX_16A12327 on CalendarResource (classNameId, classPK);\ncreate index IX_4470A59D on CalendarResource (companyId, code_, active_);\ncreate index IX_1243D698 on CalendarResource (groupId);\ncreate index IX_40678371 on CalendarResource (groupId, active_);\ncreate index IX_55C2F8AA on CalendarResource (groupId, code_);\ncreate index IX_8BCB4D38 on CalendarResource (resourceBlockId);\ncreate index IX_150E2F22 on CalendarResource (uuid_);\ncreate index IX_56A06BC6 on CalendarResource (uuid_, companyId);\ncreate unique index IX_4ABD2BC8 on CalendarResource (uuid_, groupId);]]></indexes-sql>\n</data>'),
 (20466,'Kaleo',8,1425595080483,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table KaleoAction (\n	kaleoActionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoNodeName VARCHAR(200) null,\n	name VARCHAR(200) null,\n	description STRING null,\n	executionType VARCHAR(20) null,\n	script TEXT null,\n	scriptLanguage VARCHAR(75) null,\n	scriptRequiredContexts STRING null,\n	priority INTEGER\n);\n\ncreate table KaleoCondition (\n	kaleoConditionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	script TEXT null,\n	scriptLanguage VARCHAR(75) null,\n	scriptRequiredContexts STRING null\n);\n\ncreate table KaleoDefinition (\n	kaleoDefinitionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	name VARCHAR(200) null,\n	title STRING null,\n	description STRING null,\n	content TEXT null,\n	version INTEGER,\n	active_ BOOLEAN,\n	startKaleoNodeId LONG\n);\n\ncreate table KaleoInstance (\n	kaleoInstanceId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoDefinitionName VARCHAR(200) null,\n	kaleoDefinitionVersion INTEGER,\n	rootKaleoInstanceTokenId LONG,\n	className VARCHAR(200) null,\n	classPK LONG,\n	completed BOOLEAN,\n	completionDate DATE null,\n	workflowContext TEXT null\n);\n\ncreate table KaleoInstanceToken (\n	kaleoInstanceTokenId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	parentKaleoInstanceTokenId LONG,\n	currentKaleoNodeId LONG,\n	currentKaleoNodeName VARCHAR(200) null,\n	className VARCHAR(200) null,\n	classPK LONG,\n	completed BOOLEAN,\n	completionDate DATE null\n);\n\ncreate table KaleoLog (\n	kaleoLogId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskInstanceTokenId LONG,\n	kaleoNodeName VARCHAR(200) null,\n	terminalKaleoNode BOOLEAN,\n	kaleoActionId LONG,\n	kaleoActionName VARCHAR(200) null,\n	kaleoActionDescription STRING null,\n	previousKaleoNodeId LONG,\n	previousKaleoNodeName VARCHAR(200) null,\n	previousAssigneeClassName VARCHAR(200) null,\n	previousAssigneeClassPK LONG,\n	currentAssigneeClassName VARCHAR(200) null,\n	currentAssigneeClassPK LONG,\n	type_ VARCHAR(50) null,\n	comment_ TEXT null,\n	startDate DATE null,\n	endDate DATE null,\n	duration LONG,\n	workflowContext TEXT null\n);\n\ncreate table KaleoNode (\n	kaleoNodeId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	name VARCHAR(200) null,\n	metadata STRING null,\n	description STRING null,\n	type_ VARCHAR(20) null,\n	initial_ BOOLEAN,\n	terminal BOOLEAN\n);\n\ncreate table KaleoNotification (\n	kaleoNotificationId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoNodeName VARCHAR(200) null,\n	name VARCHAR(200) null,\n	description STRING null,\n	executionType VARCHAR(20) null,\n	template TEXT null,\n	templateLanguage VARCHAR(75) null,\n	notificationTypes VARCHAR(25) null\n);\n\ncreate table KaleoNotificationRecipient (\n	kaleoNotificationRecipientId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNotificationId LONG,\n	recipientClassName VARCHAR(200) null,\n	recipientClassPK LONG,\n	recipientRoleType INTEGER,\n	address VARCHAR(255) null\n);\n\ncreate table KaleoTask (\n	kaleoTaskId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	name VARCHAR(200) null,\n	description STRING null\n);\n\ncreate table KaleoTaskAssignment (\n	kaleoTaskAssignmentId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	assigneeClassName VARCHAR(200) null,\n	assigneeClassPK LONG,\n	assigneeActionId VARCHAR(75) null,\n	assigneeScript TEXT null,\n	assigneeScriptLanguage VARCHAR(75) null,\n	assigneeScriptRequiredContexts STRING null\n);\n\ncreate table KaleoTaskAssignmentInstance (\n	kaleoTaskAssignmentInstanceId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskInstanceTokenId LONG,\n	kaleoTaskId LONG,\n	kaleoTaskName VARCHAR(200) null,\n	assigneeClassName VARCHAR(200) null,\n	assigneeClassPK LONG,\n	completed BOOLEAN,\n	completionDate DATE null\n);\n\ncreate table KaleoTaskInstanceToken (\n	kaleoTaskInstanceTokenId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskId LONG,\n	kaleoTaskName VARCHAR(200) null,\n	className VARCHAR(200) null,\n	classPK LONG,\n	completionUserId LONG,\n	completed BOOLEAN,\n	completionDate DATE null,\n	dueDate DATE null,\n	workflowContext TEXT null\n);\n\ncreate table KaleoTimer (\n	kaleoTimerId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	name VARCHAR(75) null,\n	blocking BOOLEAN,\n	description STRING null,\n	duration DOUBLE,\n	scale VARCHAR(75) null,\n	recurrenceDuration DOUBLE,\n	recurrenceScale VARCHAR(75) null\n);\n\ncreate table KaleoTimerInstanceToken (\n	kaleoTimerInstanceTokenId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoClassName VARCHAR(200) null,\n	kaleoClassPK LONG,\n	kaleoDefinitionId LONG,\n	kaleoInstanceId LONG,\n	kaleoInstanceTokenId LONG,\n	kaleoTaskInstanceTokenId LONG,\n	kaleoTimerId LONG,\n	kaleoTimerName VARCHAR(200) null,\n	blocking BOOLEAN,\n	completionUserId LONG,\n	completed BOOLEAN,\n	completionDate DATE null,\n	workflowContext TEXT null\n);\n\ncreate table KaleoTransition (\n	kaleoTransitionId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(200) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	kaleoDefinitionId LONG,\n	kaleoNodeId LONG,\n	name VARCHAR(200) null,\n	description STRING null,\n	sourceKaleoNodeId LONG,\n	sourceKaleoNodeName VARCHAR(200) null,\n	targetKaleoNodeId LONG,\n	targetKaleoNodeName VARCHAR(200) null,\n	defaultTransition BOOLEAN\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_50E9112C on KaleoAction (companyId);\ncreate index IX_170EFD7A on KaleoAction (kaleoClassName, kaleoClassPK);\ncreate index IX_4B2545E8 on KaleoAction (kaleoClassName, kaleoClassPK, executionType);\ncreate index IX_F95A622 on KaleoAction (kaleoDefinitionId);\n\ncreate index IX_FEE46067 on KaleoCondition (companyId);\ncreate index IX_DC978A5D on KaleoCondition (kaleoDefinitionId);\ncreate index IX_86CBD4C on KaleoCondition (kaleoNodeId);\n\ncreate index IX_40B9112F on KaleoDefinition (companyId);\ncreate index IX_408542BA on KaleoDefinition (companyId, active_);\ncreate index IX_76C781AE on KaleoDefinition (companyId, name);\ncreate index IX_4C23F11B on KaleoDefinition (companyId, name, active_);\ncreate index IX_EC14F81A on KaleoDefinition (companyId, name, version);\n\ncreate index IX_58D85ECB on KaleoInstance (className, classPK);\ncreate index IX_5F2FCD2D on KaleoInstance (companyId);\ncreate index IX_BF5839F8 on KaleoInstance (companyId, kaleoDefinitionName, kaleoDefinitionVersion, completionDate);\ncreate index IX_C6D7A867 on KaleoInstance (companyId, userId);\ncreate index IX_4DA4D123 on KaleoInstance (kaleoDefinitionId);\ncreate index IX_ACF16238 on KaleoInstance (kaleoDefinitionId, completed);\n\ncreate index IX_153721BE on KaleoInstanceToken (companyId);\ncreate index IX_4A86923B on KaleoInstanceToken (companyId, parentKaleoInstanceTokenId);\ncreate index IX_360D34D9 on KaleoInstanceToken (companyId, parentKaleoInstanceTokenId, completionDate);\ncreate index IX_7BDB04B4 on KaleoInstanceToken (kaleoDefinitionId);\ncreate index IX_F42AAFF6 on KaleoInstanceToken (kaleoInstanceId);\n\ncreate index IX_73B5F4DE on KaleoLog (companyId);\ncreate index IX_E66A153A on KaleoLog (kaleoClassName, kaleoClassPK, kaleoInstanceTokenId, type_);\ncreate index IX_6C64B7D4 on KaleoLog (kaleoDefinitionId);\ncreate index IX_5BC6AB16 on KaleoLog (kaleoInstanceId);\ncreate index IX_470B9FF8 on KaleoLog (kaleoInstanceTokenId, type_);\ncreate index IX_B0CDCA38 on KaleoLog (kaleoTaskInstanceTokenId);\n\ncreate index IX_C4E9ACE0 on KaleoNode (companyId);\ncreate index IX_F28C443E on KaleoNode (companyId, kaleoDefinitionId);\ncreate index IX_32E94DD6 on KaleoNode (kaleoDefinitionId);\n\ncreate index IX_38829497 on KaleoNotification (companyId);\ncreate index IX_902D342F on KaleoNotification (kaleoClassName, kaleoClassPK);\ncreate index IX_F3362E93 on KaleoNotification (kaleoClassName, kaleoClassPK, executionType);\ncreate index IX_4B968E8D on KaleoNotification (kaleoDefinitionId);\n\ncreate index IX_2C8C4AF4 on KaleoNotificationRecipient (companyId);\ncreate index IX_AA6697EA on KaleoNotificationRecipient (kaleoDefinitionId);\ncreate index IX_7F4FED02 on KaleoNotificationRecipient (kaleoNotificationId);\n\ncreate index IX_E1F8B23D on KaleoTask (companyId);\ncreate index IX_3FFA633 on KaleoTask (kaleoDefinitionId);\ncreate index IX_77B3F1A2 on KaleoTask (kaleoNodeId);\n\ncreate index IX_611732B0 on KaleoTaskAssignment (companyId);\ncreate index IX_D835C576 on KaleoTaskAssignment (kaleoClassName, kaleoClassPK);\ncreate index IX_1087068E on KaleoTaskAssignment (kaleoClassName, kaleoClassPK, assigneeClassName);\ncreate index IX_575C03A6 on KaleoTaskAssignment (kaleoDefinitionId);\n\ncreate index IX_945F4EB7 on KaleoTaskAssignmentInstance (assigneeClassName);\ncreate index IX_3BD436FD on KaleoTaskAssignmentInstance (assigneeClassName, assigneeClassPK);\ncreate index IX_6E3CDA1B on KaleoTaskAssignmentInstance (companyId);\ncreate index IX_38A47B17 on KaleoTaskAssignmentInstance (groupId, assigneeClassPK);\ncreate index IX_C851011 on KaleoTaskAssignmentInstance (kaleoDefinitionId);\ncreate index IX_67A9EE93 on KaleoTaskAssignmentInstance (kaleoInstanceId);\ncreate index IX_D4C2235B on KaleoTaskAssignmentInstance (kaleoTaskInstanceTokenId);\n\ncreate index IX_A3271995 on KaleoTaskInstanceToken (className, classPK);\ncreate index IX_997FE723 on KaleoTaskInstanceToken (companyId);\ncreate index IX_608E9519 on KaleoTaskInstanceToken (kaleoDefinitionId);\ncreate index IX_2CE1159B on KaleoTaskInstanceToken (kaleoInstanceId);\ncreate index IX_B857A115 on KaleoTaskInstanceToken (kaleoInstanceId, kaleoTaskId);\n\ncreate index IX_4DE6A889 on KaleoTimer (kaleoClassName, kaleoClassPK);\ncreate index IX_1A479F32 on KaleoTimer (kaleoClassName, kaleoClassPK, blocking);\n\ncreate index IX_DB96C55B on KaleoTimerInstanceToken (kaleoInstanceId);\ncreate index IX_DB279423 on KaleoTimerInstanceToken (kaleoInstanceTokenId, completed);\ncreate index IX_9932524C on KaleoTimerInstanceToken (kaleoInstanceTokenId, completed, blocking);\ncreate index IX_13A5BA2C on KaleoTimerInstanceToken (kaleoInstanceTokenId, kaleoTimerId);\n\ncreate index IX_41D6C6D on KaleoTransition (companyId);\ncreate index IX_479F3063 on KaleoTransition (kaleoDefinitionId);\ncreate index IX_A392DFD2 on KaleoTransition (kaleoNodeId);\ncreate index IX_A38E2194 on KaleoTransition (kaleoNodeId, defaultTransition);\ncreate index IX_85268A11 on KaleoTransition (kaleoNodeId, name);]]></indexes-sql>\n</data>'),
 (20482,'Notification',1,1409250476826,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table Notifications_UserNotificationEvent (\n	notificationEventId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userNotificationEventId LONG,\n	timestamp LONG,\n	delivered BOOLEAN,\n	actionRequired BOOLEAN,\n	archived BOOLEAN\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_93C52776 on Notifications_UserNotificationEvent (userId, actionRequired);\ncreate index IX_36E5AE4C on Notifications_UserNotificationEvent (userId, actionRequired, archived);\ncreate index IX_73C065F0 on Notifications_UserNotificationEvent (userId, delivered, actionRequired);\ncreate unique index IX_DC9FCEDC on Notifications_UserNotificationEvent (userNotificationEventId);]]></indexes-sql>\n</data>'),
 (20504,'OpenSocial',4,1343264401607,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table OpenSocial_Gadget (\n	uuid_ VARCHAR(75) null,\n	gadgetId LONG not null primary key,\n	companyId LONG,\n	createDate DATE null,\n	modifiedDate DATE null,\n	name VARCHAR(75) null,\n	url STRING null,\n	portletCategoryNames STRING null\n);\n\ncreate table OpenSocial_OAuthConsumer (\n	oAuthConsumerId LONG not null primary key,\n	companyId LONG,\n	createDate DATE null,\n	modifiedDate DATE null,\n	gadgetKey VARCHAR(75) null,\n	serviceName VARCHAR(75) null,\n	consumerKey VARCHAR(75) null,\n	consumerSecret TEXT null,\n	keyType VARCHAR(75) null\n);\n\ncreate table OpenSocial_OAuthToken (\n	oAuthTokenId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	gadgetKey VARCHAR(75) null,\n	serviceName VARCHAR(75) null,\n	moduleId LONG,\n	accessToken VARCHAR(75) null,\n	tokenName VARCHAR(75) null,\n	tokenSecret VARCHAR(75) null,\n	sessionHandle VARCHAR(75) null,\n	expiration LONG\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_729869EE on OpenSocial_Gadget (companyId);\ncreate unique index IX_A6A89EB1 on OpenSocial_Gadget (companyId, url);\ncreate index IX_E1F8627A on OpenSocial_Gadget (uuid_);\ncreate index IX_3C79316E on OpenSocial_Gadget (uuid_, companyId);\n\ncreate index IX_47206618 on OpenSocial_OAuthConsumer (gadgetKey);\ncreate index IX_8E715BF8 on OpenSocial_OAuthConsumer (gadgetKey, serviceName);\n\ncreate index IX_6C8CCC3D on OpenSocial_OAuthToken (gadgetKey, serviceName);\ncreate index IX_CDD35402 on OpenSocial_OAuthToken (userId, gadgetKey, serviceName, moduleId, tokenName);]]></indexes-sql>\n</data>'),
 (20513,'Sync',6,1445034861916,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table SyncDLFileVersionDiff (\n	syncDLFileVersionDiffId LONG not null primary key,\n	fileEntryId LONG,\n	sourceFileVersionId LONG,\n	targetFileVersionId LONG,\n	dataFileEntryId LONG,\n	size_ LONG,\n	expirationDate DATE null\n);\n\ncreate table SyncDLObject (\n	syncDLObjectId LONG not null primary key,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createTime LONG,\n	modifiedTime LONG,\n	repositoryId LONG,\n	parentFolderId LONG,\n	treePath STRING null,\n	name VARCHAR(255) null,\n	extension VARCHAR(75) null,\n	mimeType VARCHAR(75) null,\n	description STRING null,\n	changeLog VARCHAR(75) null,\n	extraSettings TEXT null,\n	version VARCHAR(75) null,\n	versionId LONG,\n	size_ LONG,\n	checksum VARCHAR(75) null,\n	event VARCHAR(75) null,\n	lastPermissionChangeDate DATE null,\n	lockExpirationDate DATE null,\n	lockUserId LONG,\n	lockUserName VARCHAR(75) null,\n	type_ VARCHAR(75) null,\n	typePK LONG,\n	typeUuid VARCHAR(75) null\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_A9B43C55 on SyncDLFileVersionDiff (expirationDate);\ncreate index IX_F832A75D on SyncDLFileVersionDiff (fileEntryId);\ncreate unique index IX_AC4C7667 on SyncDLFileVersionDiff (fileEntryId, sourceFileVersionId, targetFileVersionId);\n\ncreate index IX_980323CB on SyncDLObject (modifiedTime, repositoryId);\ncreate index IX_8D4FDC9F on SyncDLObject (modifiedTime, repositoryId, event);\ncreate index IX_A3ACE372 on SyncDLObject (modifiedTime, repositoryId, parentFolderId);\ncreate index IX_F174AD48 on SyncDLObject (repositoryId, parentFolderId);\ncreate index IX_3BE7BB8D on SyncDLObject (repositoryId, parentFolderId, type_);\ncreate index IX_57F62914 on SyncDLObject (repositoryId, type_);\ncreate unique index IX_E3F57BD6 on SyncDLObject (type_, typePK);\ncreate index IX_28CD54BB on SyncDLObject (type_, version);\ncreate index IX_1CCA3B5 on SyncDLObject (version, type_);]]></indexes-sql>\n</data>'),
 (23812,'rec',1,1459482160976,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table rec_Foo (\n	fooId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	field1 VARCHAR(75) null,\n	field2 BOOLEAN,\n	field3 INTEGER,\n	field4 DATE null,\n	field5 VARCHAR(75) null\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_14DC8D69 on rec_Foo (field2);]]></indexes-sql>\n</data>'),
 (24301,'rec',2,1459487032525,'<?xml version=\"1.0\"?>\n\n<data>\n	<tables-sql><![CDATA[create table rec_Foo (\n	fooId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	field1 VARCHAR(75) null,\n	field2 BOOLEAN,\n	field3 INTEGER,\n	field4 DATE null,\n	field5 VARCHAR(75) null\n);\n\ncreate table rec_foo (\n	fooId LONG not null primary key,\n	groupId LONG,\n	companyId LONG,\n	userId LONG,\n	userName VARCHAR(75) null,\n	createDate DATE null,\n	modifiedDate DATE null,\n	field1 VARCHAR(75) null,\n	field2 BOOLEAN,\n	field3 INTEGER,\n	field4 DATE null,\n	field5 VARCHAR(75) null\n);]]></tables-sql>\n	<sequences-sql><![CDATA[]]></sequences-sql>\n	<indexes-sql><![CDATA[create index IX_14DC8D69 on rec_Foo (field2);\n\ncreate index IX_E53D5D89 on rec_foo (field2);]]></indexes-sql>\n</data>');
/*!40000 ALTER TABLE `servicecomponent` ENABLE KEYS */;


--
-- Definition of table `shard`
--

DROP TABLE IF EXISTS `shard`;
CREATE TABLE `shard` (
  `shardId` bigint(20) NOT NULL,
  `classNameId` bigint(20) DEFAULT NULL,
  `classPK` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`shardId`),
  KEY `IX_DA5F4359` (`classNameId`,`classPK`),
  KEY `IX_941BA8C3` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shard`
--

/*!40000 ALTER TABLE `shard` DISABLE KEYS */;
INSERT INTO `shard` (`shardId`,`classNameId`,`classPK`,`name`) VALUES 
 (20156,20025,20155,'default');
/*!40000 ALTER TABLE `shard` ENABLE KEYS */;


--
-- Definition of table `shoppingcart`
--

DROP TABLE IF EXISTS `shoppingcart`;
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

--
-- Dumping data for table `shoppingcart`
--

/*!40000 ALTER TABLE `shoppingcart` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcart` ENABLE KEYS */;


--
-- Definition of table `shoppingcategory`
--

DROP TABLE IF EXISTS `shoppingcategory`;
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

--
-- Dumping data for table `shoppingcategory`
--

/*!40000 ALTER TABLE `shoppingcategory` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcategory` ENABLE KEYS */;


--
-- Definition of table `shoppingcoupon`
--

DROP TABLE IF EXISTS `shoppingcoupon`;
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

--
-- Dumping data for table `shoppingcoupon`
--

/*!40000 ALTER TABLE `shoppingcoupon` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingcoupon` ENABLE KEYS */;


--
-- Definition of table `shoppingitem`
--

DROP TABLE IF EXISTS `shoppingitem`;
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

--
-- Dumping data for table `shoppingitem`
--

/*!40000 ALTER TABLE `shoppingitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingitem` ENABLE KEYS */;


--
-- Definition of table `shoppingitemfield`
--

DROP TABLE IF EXISTS `shoppingitemfield`;
CREATE TABLE `shoppingitemfield` (
  `itemFieldId` bigint(20) NOT NULL,
  `itemId` bigint(20) DEFAULT NULL,
  `name` varchar(75) DEFAULT NULL,
  `values_` longtext,
  `description` longtext,
  PRIMARY KEY (`itemFieldId`),
  KEY `IX_6D5F9B87` (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shoppingitemfield`
--

/*!40000 ALTER TABLE `shoppingitemfield` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingitemfield` ENABLE KEYS */;


--
-- Definition of table `shoppingitemprice`
--

DROP TABLE IF EXISTS `shoppingitemprice`;
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

--
-- Dumping data for table `shoppingitemprice`
--

/*!40000 ALTER TABLE `shoppingitemprice` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingitemprice` ENABLE KEYS */;


--
-- Definition of table `shoppingorder`
--

DROP TABLE IF EXISTS `shoppingorder`;
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

--
-- Dumping data for table `shoppingorder`
--

/*!40000 ALTER TABLE `shoppingorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingorder` ENABLE KEYS */;


--
-- Definition of table `shoppingorderitem`
--

DROP TABLE IF EXISTS `shoppingorderitem`;
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

--
-- Dumping data for table `shoppingorderitem`
--

/*!40000 ALTER TABLE `shoppingorderitem` DISABLE KEYS */;
/*!40000 ALTER TABLE `shoppingorderitem` ENABLE KEYS */;


--
-- Definition of table `socialactivity`
--

DROP TABLE IF EXISTS `socialactivity`;
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

--
-- Dumping data for table `socialactivity`
--

/*!40000 ALTER TABLE `socialactivity` DISABLE KEYS */;
INSERT INTO `socialactivity` (`activityId`,`groupId`,`companyId`,`userId`,`createDate`,`activitySetId`,`mirrorActivityId`,`classNameId`,`classPK`,`parentClassNameId`,`parentClassPK`,`type_`,`extraData`,`receiverUserId`) VALUES 
 (1,20182,20155,20199,1457496714069,0,0,20109,23065,0,0,1,'{\"title\":\"<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\\\"es_ES\\\" default-locale=\\\"es_ES\\\"><Title language-id=\\\"es_ES\\\">ContenidoTestOfertaLaboral<\\/Title><\\/root>\"}',0),
 (2,20201,20155,20199,1457498049500,0,0,20109,23141,0,0,1,'{\"title\":\"<?xml version=\'1.0\' encoding=\'UTF-8\'?><root available-locales=\\\"es_ES\\\" default-locale=\\\"es_ES\\\"><Title language-id=\\\"es_ES\\\">ContenidoTestOfertaLaboral<\\/Title><\\/root>\"}',0);
/*!40000 ALTER TABLE `socialactivity` ENABLE KEYS */;


--
-- Definition of table `socialactivityachievement`
--

DROP TABLE IF EXISTS `socialactivityachievement`;
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

--
-- Dumping data for table `socialactivityachievement`
--

/*!40000 ALTER TABLE `socialactivityachievement` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivityachievement` ENABLE KEYS */;


--
-- Definition of table `socialactivitycounter`
--

DROP TABLE IF EXISTS `socialactivitycounter`;
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

--
-- Dumping data for table `socialactivitycounter`
--

/*!40000 ALTER TABLE `socialactivitycounter` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivitycounter` ENABLE KEYS */;


--
-- Definition of table `socialactivitylimit`
--

DROP TABLE IF EXISTS `socialactivitylimit`;
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

--
-- Dumping data for table `socialactivitylimit`
--

/*!40000 ALTER TABLE `socialactivitylimit` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivitylimit` ENABLE KEYS */;


--
-- Definition of table `socialactivityset`
--

DROP TABLE IF EXISTS `socialactivityset`;
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

--
-- Dumping data for table `socialactivityset`
--

/*!40000 ALTER TABLE `socialactivityset` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivityset` ENABLE KEYS */;


--
-- Definition of table `socialactivitysetting`
--

DROP TABLE IF EXISTS `socialactivitysetting`;
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

--
-- Dumping data for table `socialactivitysetting`
--

/*!40000 ALTER TABLE `socialactivitysetting` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialactivitysetting` ENABLE KEYS */;


--
-- Definition of table `socialrelation`
--

DROP TABLE IF EXISTS `socialrelation`;
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

--
-- Dumping data for table `socialrelation`
--

/*!40000 ALTER TABLE `socialrelation` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialrelation` ENABLE KEYS */;


--
-- Definition of table `socialrequest`
--

DROP TABLE IF EXISTS `socialrequest`;
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

--
-- Dumping data for table `socialrequest`
--

/*!40000 ALTER TABLE `socialrequest` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialrequest` ENABLE KEYS */;


--
-- Definition of table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
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

--
-- Dumping data for table `subscription`
--

/*!40000 ALTER TABLE `subscription` DISABLE KEYS */;
INSERT INTO `subscription` (`subscriptionId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`classNameId`,`classPK`,`frequency`) VALUES 
 (23082,20155,20199,'Test Test','2016-03-09 04:13:40','2016-03-09 04:13:40',20109,23065,'instant');
/*!40000 ALTER TABLE `subscription` ENABLE KEYS */;


--
-- Definition of table `syncdlfileversiondiff`
--

DROP TABLE IF EXISTS `syncdlfileversiondiff`;
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

--
-- Dumping data for table `syncdlfileversiondiff`
--

/*!40000 ALTER TABLE `syncdlfileversiondiff` DISABLE KEYS */;
/*!40000 ALTER TABLE `syncdlfileversiondiff` ENABLE KEYS */;


--
-- Definition of table `syncdlobject`
--

DROP TABLE IF EXISTS `syncdlobject`;
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

--
-- Dumping data for table `syncdlobject`
--

/*!40000 ALTER TABLE `syncdlobject` DISABLE KEYS */;
INSERT INTO `syncdlobject` (`syncDLObjectId`,`companyId`,`userId`,`userName`,`createTime`,`modifiedTime`,`repositoryId`,`parentFolderId`,`treePath`,`name`,`extension`,`mimeType`,`description`,`changeLog`,`extraSettings`,`version`,`versionId`,`size_`,`checksum`,`event`,`lastPermissionChangeDate`,`lockExpirationDate`,`lockUserId`,`lockUserName`,`type_`,`typePK`,`typeUuid`) VALUES 
 (20785,20155,0,'',1457324721488,1457404539121,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20616,'7c7acf77-bb0f-4e20-8c8c-dc18e029bfd3'),
 (20786,20155,0,'',1457324723966,1457404540110,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20717,'e7610e7c-c905-4e6c-9c55-141de212d561'),
 (20787,20155,0,'',1457324724072,1457404540275,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20726,'cf8c3cf9-400b-4f66-bf1d-4963aff3d34e'),
 (20788,20155,0,'',1457324724181,1457404540404,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20745,'5ca6fe87-a6c0-409c-b2e1-6c2accac3e4c'),
 (20789,20155,0,'',1457324724275,1457404540547,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20757,'b18e80af-2da9-4da4-ac38-be7066059589'),
 (20790,20155,0,'',1457324724390,1457404540710,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20769,'a8a3e479-facc-40d6-8284-2f2d203a6d9b'),
 (20791,20155,0,'',1457324722486,1457404540824,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20625,'fddc7fda-32d4-43b9-977c-8cee6a0acbae'),
 (20792,20155,0,'',1457324722610,1457404541038,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20633,'6fe72e5d-b2aa-4529-ab14-25b4ca892f2c'),
 (20793,20155,0,'',1457324722764,1457404541215,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20642,'8a95716d-e636-4616-afba-fc84dd70571e'),
 (20794,20155,0,'',1457324722881,1457404541337,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20651,'68d0eb34-bdf0-4d19-9b71-b2023d27e1a8'),
 (20795,20155,0,'',1457324723076,1457404541449,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20661,'08f5239e-58d9-4811-bbd8-bfd6b7cd89f3'),
 (20796,20155,0,'',1457324723542,1457404541575,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20669,'85ff526b-1a25-43e8-81d5-7c6c9000690d'),
 (20797,20155,0,'',1457324723693,1457404541717,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20677,'fc2e092d-7869-410d-bfb3-a33e36ebcc1b'),
 (20798,20155,0,'',1457324723816,1457404541840,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',20697,'abf9dfdc-ff7d-4cfc-90fb-32f831e27d9d'),
 (21197,20155,0,'',1457404542462,1457411926339,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21019,'4726a72d-d8dc-4ff5-bff2-15c287e580f2'),
 (21198,20155,0,'',1457404542800,1457411926671,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21027,'32827878-5407-4962-9bd8-c76f46ba1d6c'),
 (21199,20155,0,'',1457404543010,1457411926767,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21035,'ac239c5b-0449-4c71-be2d-34ebd374851a'),
 (21200,20155,0,'',1457404543276,1457411926858,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21047,'d04c1b51-f3f0-42d9-b3f9-b5503c970898'),
 (21201,20155,0,'',1457404543451,1457411926958,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21055,'77d624f9-7a82-4a79-b610-ccba2d1a4ab3'),
 (21202,20155,0,'',1457404543864,1457411927049,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21063,'8017dc61-d76a-4f45-874c-28e14c773a07'),
 (21203,20155,0,'',1457404544447,1457411927184,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21075,'6e7a7189-d97a-4758-a071-2751ff7794cd'),
 (21204,20155,0,'',1457404544786,1457411927281,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21103,'33072b24-4136-48d5-86e1-9e7d2f6bf681'),
 (21205,20155,0,'',1457404544960,1457411927391,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21111,'86f68295-42e0-4910-abd3-bd1ac867e005'),
 (21206,20155,0,'',1457404545108,1457411927468,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21127,'6ee262ff-c120-4629-894d-3c86f148a4b2'),
 (21207,20155,0,'',1457404545289,1457411927561,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21139,'1c4ac04d-6240-435e-828f-fed17cc52c5e'),
 (21208,20155,0,'',1457404546207,1457411927644,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21151,'ed140e3b-89de-4b50-b8b7-ffa14dc53a90'),
 (21209,20155,0,'',1457404546868,1457411927728,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21163,'f2031c15-ed10-4293-9d63-1b1eab57696b'),
 (21210,20155,0,'',1457404547758,1457411927806,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21175,'644ae231-1a8c-4a7e-a79f-47dcaf7ae8d7'),
 (21721,20155,0,'',1457411928200,1457413177872,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21543,'81d1e780-d09e-45b6-ab8a-f30979047a9c'),
 (21722,20155,0,'',1457411928361,1457413178178,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21551,'aeda4280-1cab-41d2-bb16-889e316a11c4'),
 (21723,20155,0,'',1457411928456,1457413178279,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21559,'7dd75000-5271-4340-9cdd-b13d558e4734'),
 (21724,20155,0,'',1457411928554,1457413178416,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21567,'77dd29ac-d758-48db-aacb-1f3a2896b831'),
 (21725,20155,0,'',1457411928652,1457413178531,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21576,'39efde47-1179-4e16-80d5-69cb249b7d08'),
 (21726,20155,0,'',1457411928752,1457413178633,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21587,'360e7921-fbbd-4125-acd1-d70f35be8b9b'),
 (21727,20155,0,'',1457411928836,1457413178727,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21608,'bf580549-f73d-487f-a2b6-ac738b3ef671'),
 (21728,20155,0,'',1457411928923,1457413178827,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21623,'5b6994ef-8e2d-435a-ad6c-ef9c3dedb6b8'),
 (21729,20155,0,'',1457411929045,1457413178944,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21635,'badcced6-3598-4974-a2cf-d5e7155f7a25'),
 (21730,20155,0,'',1457411929315,1457413179040,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21647,'2a96c982-8b20-4285-bc9d-8b64cccb5be7'),
 (21731,20155,0,'',1457411929386,1457413179115,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21659,'bbad229e-e090-41c6-b9e3-2e71cf8acf4c'),
 (21732,20155,0,'',1457411929458,1457413179194,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21671,'6455338c-28d3-4255-8ac5-ea430ebb835a'),
 (21733,20155,0,'',1457411929531,1457413179283,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21683,'1cfebaa6-d290-4535-8287-2ae8d16265fe'),
 (21734,20155,0,'',1457411929633,1457413179370,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21695,'f125f695-4224-43f0-bc79-8db1f9211fb7'),
 (21951,20155,0,'',1457413179836,1457492701190,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21943,'9d1d915d-99ef-40b7-a873-704b0ac990ad'),
 (21960,20155,0,'',1457413180288,1457492702009,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21952,'f6e5c6c7-40bf-4adc-b9f3-607b63c53d24'),
 (21969,20155,0,'',1457413180382,1457492702120,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21961,'6da9dfdf-1c8c-4169-b950-458c24f0e226'),
 (21979,20155,0,'',1457413180468,1457492702229,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21970,'5037a707-887c-4d16-8462-529bf181b371'),
 (21991,20155,0,'',1457413180565,1457492702336,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21980,'cbe18130-bbc8-4753-b207-da733b22efbe'),
 (22008,20155,0,'',1457413180658,1457492702478,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',21992,'8f7a1ee6-207e-466b-a7f1-c501c3d85be8'),
 (22029,20155,0,'',1457413180746,1457492702571,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22009,'37dd1700-11b1-462c-bcd0-7820d776abcf'),
 (22042,20155,0,'',1457413180849,1457492702674,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22030,'c16f1801-8d64-4d21-87d9-32770b140860'),
 (22056,20155,0,'',1457413181693,1457492702784,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22043,'92b5000f-7774-4608-af1c-d5f8276c3acc'),
 (22068,20155,0,'',1457413182000,1457492702869,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22055,'61a74011-eb4d-4337-94c6-f9d93b5224ac'),
 (22084,20155,0,'',1457413182076,1457492702947,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22069,'574b5196-25a1-4f17-8fa1-8cad7309fea6'),
 (22094,20155,0,'',1457413182151,1457492703026,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22081,'dd3800da-2efa-46f0-a310-3ae93f7fc2a3'),
 (22107,20155,0,'',1457413182234,1457492703126,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22095,'99181647-18be-4e6a-8d58-365bc52668f8'),
 (22121,20155,0,'',1457413182304,1457492703213,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22108,'4945449e-084b-4e0e-9949-7ba53890f5bc'),
 (22511,20155,0,'',1457492703727,1457495648773,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22333,'35e94b0e-4e13-42c6-a1d9-52c1684984e0'),
 (22512,20155,0,'',1457492703978,1457495649301,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22341,'116b0241-a824-439c-92bd-4dabc59a75b8'),
 (22513,20155,0,'',1457492704259,1457495649460,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22349,'78ddc745-5085-41da-8916-3a146baef52f'),
 (22514,20155,0,'',1457492704409,1457495649600,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22361,'b5514107-0790-4bf2-9b0e-54f99a72e2e2'),
 (22515,20155,0,'',1457492704605,1457495649827,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22369,'2662ff16-2e61-4aba-acc4-08629a9f6ac6'),
 (22516,20155,0,'',1457492704997,1457495650045,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22377,'e5d02740-72d0-4c21-a925-38bce71702bc'),
 (22517,20155,0,'',1457492705186,1457495650207,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22385,'4888b77b-2c53-4463-a71b-c3d9d1d72012'),
 (22518,20155,0,'',1457492705372,1457495650350,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22409,'5dc56ee1-dbab-4e81-9f6a-ab0aa9d388ec'),
 (22519,20155,0,'',1457492705576,1457495650556,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22429,'58095046-47b5-4826-8734-a88db241bc30'),
 (22520,20155,0,'',1457492705724,1457495650694,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22441,'af50b84b-a6ce-4d00-8f99-4a4fd71d6894'),
 (22521,20155,0,'',1457492706072,1457495650827,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22453,'fe990252-6128-4ce2-9c15-4ee1f6210fe4'),
 (22522,20155,0,'',1457492706183,1457495650983,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22465,'873d4ebb-78d9-4208-a26b-51235dd5af7b'),
 (22523,20155,0,'',1457492706325,1457495651164,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22477,'9abf1091-066b-4339-8d3f-0e3f1fb94bbe'),
 (22524,20155,0,'',1457492707061,1457495651360,20182,0,'','','','','','','','',0,0,'','delete',NULL,NULL,0,'','file',22489,'b0fad5c6-719f-446d-af9c-4e639e5c3813'),
 (22757,20155,20159,'',1457495652199,1457495652199,20182,0,'/0/','roverRace','jpg','image/jpeg','','','','1.0',22744,65161,'McZujaxBGiZZ7V62d+wlGCoMGHk=','add',NULL,NULL,0,'','file',22743,'eceb8056-b756-4207-9d71-5b4de3bf6dd1'),
 (22760,20155,20159,'',1457495652523,1457495652523,20182,0,'/0/','LunarSpelunkingBanner','png','image/png','','','','1.0',22752,547089,'a16TlEp+fZbWnyZryoQoV1lq+qQ=','add',NULL,NULL,0,'','file',22751,'39680b15-933c-4210-85d4-f37a8d260532'),
 (22770,20155,20159,'',1457495652723,1457495652723,20182,0,'/0/','entertainment','png','image/png','','','','1.0',22762,398844,'xr3+ykNYYjqwkaE6BDPLBul+oT8=','add',NULL,NULL,0,'','file',22761,'b1ef4738-26ed-4839-973e-cb01545dc388'),
 (22778,20155,20159,'',1457495652875,1457495652875,20182,0,'/0/','food','png','image/png','','','','1.0',22771,344900,'I0YJMguj1zFIZ9ARQNnWAUhdQV4=','add',NULL,NULL,0,'','file',22769,'00aa1f14-0e11-4787-92f3-487020afe4dc'),
 (22788,20155,20159,'',1457495653098,1457495653098,20182,0,'/0/','LunarSpelunking','png','image/png','','','','1.0',22780,360654,'24cuLsRphJB3GtA9Qd7tB2BD4G4=','add',NULL,NULL,0,'','file',22779,'9965eb71-e74d-4e97-94ff-7854ffabc72c'),
 (22809,20155,20159,'',1457495653230,1457495653230,20182,0,'/0/','lunar-golf-banner-2','jpg','image/jpeg','','','','1.0',22790,48278,'LN2rA9WgB4KCR4weKg8Qh71ELLs=','add',NULL,NULL,0,'','file',22789,'916fca0f-2af9-4ba1-811a-a18c61ee7ef8'),
 (22829,20155,20159,'',1457495653709,1457495653709,20182,0,'/0/','earthrise','png','image/png','','','','1.0',22814,256005,'7mesB1/drts2ETV/v2Tj2V67WEQ=','add',NULL,NULL,0,'','file',22812,'0f0633d9-04de-46ec-9ca8-b97203b92534'),
 (22842,20155,20159,'',1457495653855,1457495653855,20182,0,'/0/','fine-dining','jpg','image/jpeg','','','','1.0',22831,78264,'I8NPPvCN/IK064TvvlFRkJAbON8=','add',NULL,NULL,0,'','file',22830,'eace49ae-27ab-40a0-8ac9-43bac536ed42'),
 (22857,20155,20159,'',1457495654026,1457495654026,20182,0,'/0/','roverRacingFam','png','image/png','','','','1.0',22844,560704,'ykSxx+6I9qYAs19eeuOIPuxAMuk=','add',NULL,NULL,0,'','file',22843,'21c46a07-d24f-4107-a952-001cd7ce5c1c'),
 (22868,20155,20159,'',1457495654389,1457495654389,20182,0,'/0/','LunarGolfLink','png','image/png','','','','1.0',22856,161266,'cikIUO4m00L+OvxD0U6JN8vDpF4=','add',NULL,NULL,0,'','file',22855,'64a83da1-199b-43f6-9399-bc81bcd92fdf'),
 (22883,20155,20159,'',1457495654517,1457495654517,20182,0,'/0/','Accomodations','png','image/png','','','','1.0',22870,711879,'AEAofssPF/U/OW5w5dGeuVX1q8U=','add',NULL,NULL,0,'','file',22869,'d675b399-32ae-45cb-838a-9b20490f9af1'),
 (22894,20155,20159,'',1457495654661,1457495654661,20182,0,'/0/','room','png','image/png','','','','1.0',22882,351446,'dplHtFiEdzBrwZ/HGW6or7CVIHA=','add',NULL,NULL,0,'','file',22881,'1d9a0d4f-a7c1-4ec4-9b13-b90ab5d849f7'),
 (22907,20155,20159,'',1457495654785,1457495654785,20182,0,'/0/','RoverRaceLink','png','image/png','','','','1.0',22896,186411,'1Ts1QBy6TgADB2MWmmzxNpT6SYU=','add',NULL,NULL,0,'','file',22895,'4f2db479-2562-4e8b-b313-c721cf1646ad'),
 (22920,20155,20159,'',1457495654891,1457495654891,20182,0,'/0/','lunarGolfPromo','png','image/png','','','','1.0',22909,791995,'mIUCyeLqm093YF1UNfIeosWCOP0=','add',NULL,NULL,0,'','file',22908,'d8fdea23-1376-48f4-88b6-c95c614dd290'),
 (23092,20155,20199,'Test Test',1457497039022,1457497039022,20182,0,'/23088/','OpenSocial Gadgets','','','','','','',0,0,'','add',NULL,NULL,0,'','folder',23088,'228dc0f8-af1e-4c62-819c-8bb6860f88b7');
/*!40000 ALTER TABLE `syncdlobject` ENABLE KEYS */;


--
-- Definition of table `systemevent`
--

DROP TABLE IF EXISTS `systemevent`;
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

--
-- Dumping data for table `systemevent`
--

/*!40000 ALTER TABLE `systemevent` DISABLE KEYS */;
INSERT INTO `systemevent` (`systemEventId`,`groupId`,`companyId`,`userId`,`userName`,`createDate`,`classNameId`,`classPK`,`classUuid`,`referrerClassNameId`,`parentSystemEventId`,`systemEventSetKey`,`type_`,`extraData`) VALUES 
 (20603,20182,20155,0,'','2016-03-07 04:25:21',20102,20412,'67b5db1c-f34c-4421-941d-5504656374e0',20098,0,20604,1,''),
 (20605,20182,20155,0,'','2016-03-07 04:25:21',20102,20413,'bd29b3ac-2512-498c-9e69-e5d718c35018',20098,0,20606,1,''),
 (20607,20182,20155,0,'','2016-03-07 04:25:21',20102,20414,'98ffecb1-74cb-4063-8818-1a5e3a1d3613',20098,0,20608,1,''),
 (20609,20182,20155,0,'','2016-03-07 04:25:21',20102,20415,'90fe0433-3681-4170-a124-1000a65feb68',20098,0,20610,1,''),
 (20611,20182,20155,0,'','2016-03-07 04:25:21',20102,20416,'06bef643-4317-49b5-a3a3-2683e08b7952',20098,0,20612,1,''),
 (20613,20182,20155,0,'','2016-03-07 04:25:21',20102,20417,'7b8a00c4-acbd-4908-a3c0-4e18e129a90d',20098,0,20614,1,''),
 (20907,20182,20155,0,'','2016-03-08 02:35:39',20011,20616,'7c7acf77-bb0f-4e20-8c8c-dc18e029bfd3',0,0,20908,1,''),
 (20912,20182,20155,0,'','2016-03-08 02:35:40',20011,20616,'7c7acf77-bb0f-4e20-8c8c-dc18e029bfd3',0,0,20913,1,''),
 (20914,20182,20155,0,'','2016-03-08 02:35:40',20011,20717,'e7610e7c-c905-4e6c-9c55-141de212d561',0,0,20915,1,''),
 (20919,20182,20155,0,'','2016-03-08 02:35:40',20011,20717,'e7610e7c-c905-4e6c-9c55-141de212d561',0,0,20920,1,''),
 (20921,20182,20155,0,'','2016-03-08 02:35:40',20011,20726,'cf8c3cf9-400b-4f66-bf1d-4963aff3d34e',0,0,20922,1,''),
 (20926,20182,20155,0,'','2016-03-08 02:35:40',20011,20726,'cf8c3cf9-400b-4f66-bf1d-4963aff3d34e',0,0,20927,1,''),
 (20928,20182,20155,0,'','2016-03-08 02:35:40',20011,20745,'5ca6fe87-a6c0-409c-b2e1-6c2accac3e4c',0,0,20929,1,''),
 (20933,20182,20155,0,'','2016-03-08 02:35:40',20011,20745,'5ca6fe87-a6c0-409c-b2e1-6c2accac3e4c',0,0,20934,1,''),
 (20935,20182,20155,0,'','2016-03-08 02:35:40',20011,20757,'b18e80af-2da9-4da4-ac38-be7066059589',0,0,20936,1,''),
 (20940,20182,20155,0,'','2016-03-08 02:35:40',20011,20757,'b18e80af-2da9-4da4-ac38-be7066059589',0,0,20941,1,''),
 (20942,20182,20155,0,'','2016-03-08 02:35:40',20011,20769,'a8a3e479-facc-40d6-8284-2f2d203a6d9b',0,0,20943,1,''),
 (20947,20182,20155,0,'','2016-03-08 02:35:40',20011,20769,'a8a3e479-facc-40d6-8284-2f2d203a6d9b',0,0,20948,1,''),
 (20949,20182,20155,0,'','2016-03-08 02:35:40',20011,20625,'fddc7fda-32d4-43b9-977c-8cee6a0acbae',0,0,20950,1,''),
 (20954,20182,20155,0,'','2016-03-08 02:35:41',20011,20625,'fddc7fda-32d4-43b9-977c-8cee6a0acbae',0,0,20955,1,''),
 (20956,20182,20155,0,'','2016-03-08 02:35:41',20011,20633,'6fe72e5d-b2aa-4529-ab14-25b4ca892f2c',0,0,20957,1,''),
 (20961,20182,20155,0,'','2016-03-08 02:35:41',20011,20633,'6fe72e5d-b2aa-4529-ab14-25b4ca892f2c',0,0,20962,1,''),
 (20963,20182,20155,0,'','2016-03-08 02:35:41',20011,20642,'8a95716d-e636-4616-afba-fc84dd70571e',0,0,20964,1,''),
 (20968,20182,20155,0,'','2016-03-08 02:35:41',20011,20642,'8a95716d-e636-4616-afba-fc84dd70571e',0,0,20969,1,''),
 (20970,20182,20155,0,'','2016-03-08 02:35:41',20011,20651,'68d0eb34-bdf0-4d19-9b71-b2023d27e1a8',0,0,20971,1,''),
 (20975,20182,20155,0,'','2016-03-08 02:35:41',20011,20651,'68d0eb34-bdf0-4d19-9b71-b2023d27e1a8',0,0,20976,1,''),
 (20977,20182,20155,0,'','2016-03-08 02:35:41',20011,20661,'08f5239e-58d9-4811-bbd8-bfd6b7cd89f3',0,0,20978,1,''),
 (20982,20182,20155,0,'','2016-03-08 02:35:41',20011,20661,'08f5239e-58d9-4811-bbd8-bfd6b7cd89f3',0,0,20983,1,''),
 (20984,20182,20155,0,'','2016-03-08 02:35:41',20011,20669,'85ff526b-1a25-43e8-81d5-7c6c9000690d',0,0,20985,1,''),
 (20989,20182,20155,0,'','2016-03-08 02:35:41',20011,20669,'85ff526b-1a25-43e8-81d5-7c6c9000690d',0,0,20990,1,''),
 (20991,20182,20155,0,'','2016-03-08 02:35:41',20011,20677,'fc2e092d-7869-410d-bfb3-a33e36ebcc1b',0,0,20992,1,''),
 (20996,20182,20155,0,'','2016-03-08 02:35:41',20011,20677,'fc2e092d-7869-410d-bfb3-a33e36ebcc1b',0,0,20997,1,''),
 (20998,20182,20155,0,'','2016-03-08 02:35:41',20011,20697,'abf9dfdc-ff7d-4cfc-90fb-32f831e27d9d',0,0,20999,1,''),
 (21003,20182,20155,0,'','2016-03-08 02:35:41',20011,20697,'abf9dfdc-ff7d-4cfc-90fb-32f831e27d9d',0,0,21004,1,''),
 (21007,20182,20155,0,'','2016-03-08 02:35:42',20102,20901,'1389f29c-3e43-4c67-8fbb-08f3eb026d2c',20098,0,21008,1,''),
 (21009,20182,20155,0,'','2016-03-08 02:35:42',20102,20902,'a93900f9-2e60-4b63-87a2-9a2ca5215115',20098,0,21010,1,''),
 (21011,20182,20155,0,'','2016-03-08 02:35:42',20102,20903,'93fbc5d2-09f1-415c-be7c-4c102ae97c3d',20098,0,21012,1,''),
 (21013,20182,20155,0,'','2016-03-08 02:35:42',20102,20904,'cdc995a5-f321-40e2-a3cc-4ffbd4e66e36',20098,0,21014,1,''),
 (21015,20182,20155,0,'','2016-03-08 02:35:42',20102,20905,'3943da4b-9072-453d-a418-fa7dc37224e7',20098,0,21016,1,''),
 (21017,20182,20155,0,'','2016-03-08 02:35:42',20102,20906,'c6497180-2c98-477a-88c9-089fa927416c',20098,0,21018,1,''),
 (21418,20182,20155,0,'','2016-03-08 04:38:46',20011,21019,'4726a72d-d8dc-4ff5-bff2-15c287e580f2',0,0,21419,1,''),
 (21423,20182,20155,0,'','2016-03-08 04:38:46',20011,21019,'4726a72d-d8dc-4ff5-bff2-15c287e580f2',0,0,21424,1,''),
 (21426,20182,20155,0,'','2016-03-08 04:38:46',20011,21027,'32827878-5407-4962-9bd8-c76f46ba1d6c',0,0,21427,1,''),
 (21431,20182,20155,0,'','2016-03-08 04:38:46',20011,21027,'32827878-5407-4962-9bd8-c76f46ba1d6c',0,0,21432,1,''),
 (21434,20182,20155,0,'','2016-03-08 04:38:46',20011,21035,'ac239c5b-0449-4c71-be2d-34ebd374851a',0,0,21435,1,''),
 (21439,20182,20155,0,'','2016-03-08 04:38:46',20011,21035,'ac239c5b-0449-4c71-be2d-34ebd374851a',0,0,21440,1,''),
 (21442,20182,20155,0,'','2016-03-08 04:38:46',20011,21047,'d04c1b51-f3f0-42d9-b3f9-b5503c970898',0,0,21443,1,''),
 (21447,20182,20155,0,'','2016-03-08 04:38:46',20011,21047,'d04c1b51-f3f0-42d9-b3f9-b5503c970898',0,0,21448,1,''),
 (21450,20182,20155,0,'','2016-03-08 04:38:46',20011,21055,'77d624f9-7a82-4a79-b610-ccba2d1a4ab3',0,0,21451,1,''),
 (21455,20182,20155,0,'','2016-03-08 04:38:47',20011,21055,'77d624f9-7a82-4a79-b610-ccba2d1a4ab3',0,0,21456,1,''),
 (21458,20182,20155,0,'','2016-03-08 04:38:47',20011,21063,'8017dc61-d76a-4f45-874c-28e14c773a07',0,0,21459,1,''),
 (21463,20182,20155,0,'','2016-03-08 04:38:47',20011,21063,'8017dc61-d76a-4f45-874c-28e14c773a07',0,0,21464,1,''),
 (21466,20182,20155,0,'','2016-03-08 04:38:47',20011,21075,'6e7a7189-d97a-4758-a071-2751ff7794cd',0,0,21467,1,''),
 (21471,20182,20155,0,'','2016-03-08 04:38:47',20011,21075,'6e7a7189-d97a-4758-a071-2751ff7794cd',0,0,21472,1,''),
 (21474,20182,20155,0,'','2016-03-08 04:38:47',20011,21103,'33072b24-4136-48d5-86e1-9e7d2f6bf681',0,0,21475,1,''),
 (21479,20182,20155,0,'','2016-03-08 04:38:47',20011,21103,'33072b24-4136-48d5-86e1-9e7d2f6bf681',0,0,21480,1,''),
 (21482,20182,20155,0,'','2016-03-08 04:38:47',20011,21111,'86f68295-42e0-4910-abd3-bd1ac867e005',0,0,21483,1,''),
 (21487,20182,20155,0,'','2016-03-08 04:38:47',20011,21111,'86f68295-42e0-4910-abd3-bd1ac867e005',0,0,21488,1,''),
 (21490,20182,20155,0,'','2016-03-08 04:38:47',20011,21127,'6ee262ff-c120-4629-894d-3c86f148a4b2',0,0,21491,1,''),
 (21495,20182,20155,0,'','2016-03-08 04:38:47',20011,21127,'6ee262ff-c120-4629-894d-3c86f148a4b2',0,0,21496,1,''),
 (21498,20182,20155,0,'','2016-03-08 04:38:47',20011,21139,'1c4ac04d-6240-435e-828f-fed17cc52c5e',0,0,21499,1,''),
 (21503,20182,20155,0,'','2016-03-08 04:38:47',20011,21139,'1c4ac04d-6240-435e-828f-fed17cc52c5e',0,0,21504,1,''),
 (21506,20182,20155,0,'','2016-03-08 04:38:47',20011,21151,'ed140e3b-89de-4b50-b8b7-ffa14dc53a90',0,0,21507,1,''),
 (21511,20182,20155,0,'','2016-03-08 04:38:47',20011,21151,'ed140e3b-89de-4b50-b8b7-ffa14dc53a90',0,0,21512,1,''),
 (21514,20182,20155,0,'','2016-03-08 04:38:47',20011,21163,'f2031c15-ed10-4293-9d63-1b1eab57696b',0,0,21515,1,''),
 (21519,20182,20155,0,'','2016-03-08 04:38:47',20011,21163,'f2031c15-ed10-4293-9d63-1b1eab57696b',0,0,21520,1,''),
 (21522,20182,20155,0,'','2016-03-08 04:38:47',20011,21175,'644ae231-1a8c-4a7e-a79f-47dcaf7ae8d7',0,0,21523,1,''),
 (21527,20182,20155,0,'','2016-03-08 04:38:47',20011,21175,'644ae231-1a8c-4a7e-a79f-47dcaf7ae8d7',0,0,21528,1,''),
 (21531,20182,20155,0,'','2016-03-08 04:38:47',20102,21401,'0b7f90b4-5501-43b9-97ed-8589618feda4',20098,0,21532,1,''),
 (21533,20182,20155,0,'','2016-03-08 04:38:47',20102,21402,'94fc95fd-952b-4050-ac23-646e98583611',20098,0,21534,1,''),
 (21535,20182,20155,0,'','2016-03-08 04:38:47',20102,21403,'1136534d-e276-45eb-9d69-46c4362740c7',20098,0,21536,1,''),
 (21537,20182,20155,0,'','2016-03-08 04:38:48',20102,21404,'60822578-c9fe-406f-9fb4-cb8dbbd68840',20098,0,21538,1,''),
 (21539,20182,20155,0,'','2016-03-08 04:38:48',20102,21405,'cb910555-e363-4237-8985-f0b93b26f5bd',20098,0,21540,1,''),
 (21541,20182,20155,0,'','2016-03-08 04:38:48',20102,21406,'fa41c234-8cae-4990-bd31-0eb295d1b85b',20098,0,21542,1,''),
 (21818,20182,20155,0,'','2016-03-08 04:59:37',20011,21543,'81d1e780-d09e-45b6-ab8a-f30979047a9c',0,0,21819,1,''),
 (21823,20182,20155,0,'','2016-03-08 04:59:38',20011,21543,'81d1e780-d09e-45b6-ab8a-f30979047a9c',0,0,21824,1,''),
 (21826,20182,20155,0,'','2016-03-08 04:59:38',20011,21551,'aeda4280-1cab-41d2-bb16-889e316a11c4',0,0,21827,1,''),
 (21831,20182,20155,0,'','2016-03-08 04:59:38',20011,21551,'aeda4280-1cab-41d2-bb16-889e316a11c4',0,0,21832,1,''),
 (21834,20182,20155,0,'','2016-03-08 04:59:38',20011,21559,'7dd75000-5271-4340-9cdd-b13d558e4734',0,0,21835,1,''),
 (21839,20182,20155,0,'','2016-03-08 04:59:38',20011,21559,'7dd75000-5271-4340-9cdd-b13d558e4734',0,0,21840,1,''),
 (21842,20182,20155,0,'','2016-03-08 04:59:38',20011,21567,'77dd29ac-d758-48db-aacb-1f3a2896b831',0,0,21843,1,''),
 (21847,20182,20155,0,'','2016-03-08 04:59:38',20011,21567,'77dd29ac-d758-48db-aacb-1f3a2896b831',0,0,21848,1,''),
 (21850,20182,20155,0,'','2016-03-08 04:59:38',20011,21576,'39efde47-1179-4e16-80d5-69cb249b7d08',0,0,21851,1,''),
 (21855,20182,20155,0,'','2016-03-08 04:59:38',20011,21576,'39efde47-1179-4e16-80d5-69cb249b7d08',0,0,21856,1,''),
 (21858,20182,20155,0,'','2016-03-08 04:59:38',20011,21587,'360e7921-fbbd-4125-acd1-d70f35be8b9b',0,0,21859,1,''),
 (21863,20182,20155,0,'','2016-03-08 04:59:38',20011,21587,'360e7921-fbbd-4125-acd1-d70f35be8b9b',0,0,21864,1,''),
 (21866,20182,20155,0,'','2016-03-08 04:59:38',20011,21608,'bf580549-f73d-487f-a2b6-ac738b3ef671',0,0,21867,1,''),
 (21871,20182,20155,0,'','2016-03-08 04:59:38',20011,21608,'bf580549-f73d-487f-a2b6-ac738b3ef671',0,0,21872,1,''),
 (21874,20182,20155,0,'','2016-03-08 04:59:38',20011,21623,'5b6994ef-8e2d-435a-ad6c-ef9c3dedb6b8',0,0,21875,1,''),
 (21879,20182,20155,0,'','2016-03-08 04:59:38',20011,21623,'5b6994ef-8e2d-435a-ad6c-ef9c3dedb6b8',0,0,21880,1,''),
 (21882,20182,20155,0,'','2016-03-08 04:59:38',20011,21635,'badcced6-3598-4974-a2cf-d5e7155f7a25',0,0,21883,1,''),
 (21887,20182,20155,0,'','2016-03-08 04:59:39',20011,21635,'badcced6-3598-4974-a2cf-d5e7155f7a25',0,0,21888,1,''),
 (21890,20182,20155,0,'','2016-03-08 04:59:39',20011,21647,'2a96c982-8b20-4285-bc9d-8b64cccb5be7',0,0,21891,1,''),
 (21895,20182,20155,0,'','2016-03-08 04:59:39',20011,21647,'2a96c982-8b20-4285-bc9d-8b64cccb5be7',0,0,21896,1,''),
 (21898,20182,20155,0,'','2016-03-08 04:59:39',20011,21659,'bbad229e-e090-41c6-b9e3-2e71cf8acf4c',0,0,21899,1,''),
 (21903,20182,20155,0,'','2016-03-08 04:59:39',20011,21659,'bbad229e-e090-41c6-b9e3-2e71cf8acf4c',0,0,21904,1,''),
 (21906,20182,20155,0,'','2016-03-08 04:59:39',20011,21671,'6455338c-28d3-4255-8ac5-ea430ebb835a',0,0,21907,1,''),
 (21911,20182,20155,0,'','2016-03-08 04:59:39',20011,21671,'6455338c-28d3-4255-8ac5-ea430ebb835a',0,0,21912,1,''),
 (21914,20182,20155,0,'','2016-03-08 04:59:39',20011,21683,'1cfebaa6-d290-4535-8287-2ae8d16265fe',0,0,21915,1,''),
 (21919,20182,20155,0,'','2016-03-08 04:59:39',20011,21683,'1cfebaa6-d290-4535-8287-2ae8d16265fe',0,0,21920,1,''),
 (21922,20182,20155,0,'','2016-03-08 04:59:39',20011,21695,'f125f695-4224-43f0-bc79-8db1f9211fb7',0,0,21923,1,''),
 (21927,20182,20155,0,'','2016-03-08 04:59:39',20011,21695,'f125f695-4224-43f0-bc79-8db1f9211fb7',0,0,21928,1,''),
 (21931,20182,20155,0,'','2016-03-08 04:59:39',20102,21801,'fda2c94e-c3e4-4404-b20d-2ab0c486913c',20098,0,21932,1,''),
 (21933,20182,20155,0,'','2016-03-08 04:59:39',20102,21802,'c2cebb37-79f6-42ba-ba91-9a7acca125c6',20098,0,21934,1,''),
 (21935,20182,20155,0,'','2016-03-08 04:59:39',20102,21803,'77996b69-9faa-43d2-b18a-4173ec516448',20098,0,21936,1,''),
 (21937,20182,20155,0,'','2016-03-08 04:59:39',20102,21804,'5fffad9d-62e7-442a-a3b9-d72e52c31d1c',20098,0,21938,1,''),
 (21939,20182,20155,0,'','2016-03-08 04:59:39',20102,21805,'f58dc87f-7637-44e2-8977-18feb4781004',20098,0,21940,1,''),
 (21941,20182,20155,0,'','2016-03-08 04:59:39',20102,21806,'4f2b49a0-4bb9-4835-8617-2989c32e8132',20098,0,21942,1,''),
 (22208,20182,20155,0,'','2016-03-09 03:05:01',20011,21943,'9d1d915d-99ef-40b7-a873-704b0ac990ad',0,0,22209,1,''),
 (22213,20182,20155,0,'','2016-03-09 03:05:01',20011,21943,'9d1d915d-99ef-40b7-a873-704b0ac990ad',0,0,22214,1,''),
 (22216,20182,20155,0,'','2016-03-09 03:05:02',20011,21952,'f6e5c6c7-40bf-4adc-b9f3-607b63c53d24',0,0,22217,1,''),
 (22221,20182,20155,0,'','2016-03-09 03:05:02',20011,21952,'f6e5c6c7-40bf-4adc-b9f3-607b63c53d24',0,0,22222,1,''),
 (22224,20182,20155,0,'','2016-03-09 03:05:02',20011,21961,'6da9dfdf-1c8c-4169-b950-458c24f0e226',0,0,22225,1,''),
 (22229,20182,20155,0,'','2016-03-09 03:05:02',20011,21961,'6da9dfdf-1c8c-4169-b950-458c24f0e226',0,0,22230,1,''),
 (22232,20182,20155,0,'','2016-03-09 03:05:02',20011,21970,'5037a707-887c-4d16-8462-529bf181b371',0,0,22233,1,''),
 (22237,20182,20155,0,'','2016-03-09 03:05:02',20011,21970,'5037a707-887c-4d16-8462-529bf181b371',0,0,22238,1,''),
 (22240,20182,20155,0,'','2016-03-09 03:05:02',20011,21980,'cbe18130-bbc8-4753-b207-da733b22efbe',0,0,22241,1,''),
 (22245,20182,20155,0,'','2016-03-09 03:05:02',20011,21980,'cbe18130-bbc8-4753-b207-da733b22efbe',0,0,22246,1,''),
 (22248,20182,20155,0,'','2016-03-09 03:05:02',20011,21992,'8f7a1ee6-207e-466b-a7f1-c501c3d85be8',0,0,22249,1,''),
 (22253,20182,20155,0,'','2016-03-09 03:05:02',20011,21992,'8f7a1ee6-207e-466b-a7f1-c501c3d85be8',0,0,22254,1,''),
 (22256,20182,20155,0,'','2016-03-09 03:05:02',20011,22009,'37dd1700-11b1-462c-bcd0-7820d776abcf',0,0,22257,1,''),
 (22261,20182,20155,0,'','2016-03-09 03:05:02',20011,22009,'37dd1700-11b1-462c-bcd0-7820d776abcf',0,0,22262,1,''),
 (22264,20182,20155,0,'','2016-03-09 03:05:02',20011,22030,'c16f1801-8d64-4d21-87d9-32770b140860',0,0,22265,1,''),
 (22269,20182,20155,0,'','2016-03-09 03:05:02',20011,22030,'c16f1801-8d64-4d21-87d9-32770b140860',0,0,22270,1,''),
 (22272,20182,20155,0,'','2016-03-09 03:05:02',20011,22043,'92b5000f-7774-4608-af1c-d5f8276c3acc',0,0,22273,1,''),
 (22277,20182,20155,0,'','2016-03-09 03:05:02',20011,22043,'92b5000f-7774-4608-af1c-d5f8276c3acc',0,0,22278,1,''),
 (22280,20182,20155,0,'','2016-03-09 03:05:02',20011,22055,'61a74011-eb4d-4337-94c6-f9d93b5224ac',0,0,22281,1,''),
 (22285,20182,20155,0,'','2016-03-09 03:05:02',20011,22055,'61a74011-eb4d-4337-94c6-f9d93b5224ac',0,0,22286,1,''),
 (22288,20182,20155,0,'','2016-03-09 03:05:02',20011,22069,'574b5196-25a1-4f17-8fa1-8cad7309fea6',0,0,22289,1,''),
 (22293,20182,20155,0,'','2016-03-09 03:05:03',20011,22069,'574b5196-25a1-4f17-8fa1-8cad7309fea6',0,0,22294,1,''),
 (22296,20182,20155,0,'','2016-03-09 03:05:03',20011,22081,'dd3800da-2efa-46f0-a310-3ae93f7fc2a3',0,0,22297,1,''),
 (22301,20182,20155,0,'','2016-03-09 03:05:03',20011,22081,'dd3800da-2efa-46f0-a310-3ae93f7fc2a3',0,0,22302,1,''),
 (22304,20182,20155,0,'','2016-03-09 03:05:03',20011,22095,'99181647-18be-4e6a-8d58-365bc52668f8',0,0,22305,1,''),
 (22309,20182,20155,0,'','2016-03-09 03:05:03',20011,22095,'99181647-18be-4e6a-8d58-365bc52668f8',0,0,22310,1,''),
 (22312,20182,20155,0,'','2016-03-09 03:05:03',20011,22108,'4945449e-084b-4e0e-9949-7ba53890f5bc',0,0,22313,1,''),
 (22317,20182,20155,0,'','2016-03-09 03:05:03',20011,22108,'4945449e-084b-4e0e-9949-7ba53890f5bc',0,0,22318,1,''),
 (22321,20182,20155,0,'','2016-03-09 03:05:03',20102,22201,'3d85e833-076d-43a6-b4c9-d08170fb1dcb',20098,0,22322,1,''),
 (22323,20182,20155,0,'','2016-03-09 03:05:03',20102,22202,'b1a716af-4d59-476f-85f2-835fade64e81',20098,0,22324,1,''),
 (22325,20182,20155,0,'','2016-03-09 03:05:03',20102,22203,'739ed01e-3de3-4adc-a7e2-1a580a514dcb',20098,0,22326,1,''),
 (22327,20182,20155,0,'','2016-03-09 03:05:03',20102,22204,'f9b1eca1-bb14-4ca1-aecd-ec16e93c7908',20098,0,22328,1,''),
 (22329,20182,20155,0,'','2016-03-09 03:05:03',20102,22205,'e0aee0f8-cabf-4bbd-98ff-4395c8c54836',20098,0,22330,1,''),
 (22331,20182,20155,0,'','2016-03-09 03:05:03',20102,22206,'5057732d-fac4-44cc-85e7-e9e6b7591f82',20098,0,22332,1,''),
 (22618,20182,20155,0,'','2016-03-09 03:54:08',20011,22333,'35e94b0e-4e13-42c6-a1d9-52c1684984e0',0,0,22619,1,''),
 (22623,20182,20155,0,'','2016-03-09 03:54:09',20011,22333,'35e94b0e-4e13-42c6-a1d9-52c1684984e0',0,0,22624,1,''),
 (22626,20182,20155,0,'','2016-03-09 03:54:09',20011,22341,'116b0241-a824-439c-92bd-4dabc59a75b8',0,0,22627,1,''),
 (22631,20182,20155,0,'','2016-03-09 03:54:09',20011,22341,'116b0241-a824-439c-92bd-4dabc59a75b8',0,0,22632,1,''),
 (22634,20182,20155,0,'','2016-03-09 03:54:09',20011,22349,'78ddc745-5085-41da-8916-3a146baef52f',0,0,22635,1,''),
 (22639,20182,20155,0,'','2016-03-09 03:54:09',20011,22349,'78ddc745-5085-41da-8916-3a146baef52f',0,0,22640,1,''),
 (22642,20182,20155,0,'','2016-03-09 03:54:09',20011,22361,'b5514107-0790-4bf2-9b0e-54f99a72e2e2',0,0,22643,1,''),
 (22647,20182,20155,0,'','2016-03-09 03:54:09',20011,22361,'b5514107-0790-4bf2-9b0e-54f99a72e2e2',0,0,22648,1,''),
 (22650,20182,20155,0,'','2016-03-09 03:54:09',20011,22369,'2662ff16-2e61-4aba-acc4-08629a9f6ac6',0,0,22651,1,''),
 (22655,20182,20155,0,'','2016-03-09 03:54:10',20011,22369,'2662ff16-2e61-4aba-acc4-08629a9f6ac6',0,0,22656,1,''),
 (22658,20182,20155,0,'','2016-03-09 03:54:10',20011,22377,'e5d02740-72d0-4c21-a925-38bce71702bc',0,0,22659,1,''),
 (22663,20182,20155,0,'','2016-03-09 03:54:10',20011,22377,'e5d02740-72d0-4c21-a925-38bce71702bc',0,0,22664,1,''),
 (22666,20182,20155,0,'','2016-03-09 03:54:10',20011,22385,'4888b77b-2c53-4463-a71b-c3d9d1d72012',0,0,22667,1,''),
 (22671,20182,20155,0,'','2016-03-09 03:54:10',20011,22385,'4888b77b-2c53-4463-a71b-c3d9d1d72012',0,0,22672,1,''),
 (22674,20182,20155,0,'','2016-03-09 03:54:10',20011,22409,'5dc56ee1-dbab-4e81-9f6a-ab0aa9d388ec',0,0,22675,1,''),
 (22679,20182,20155,0,'','2016-03-09 03:54:10',20011,22409,'5dc56ee1-dbab-4e81-9f6a-ab0aa9d388ec',0,0,22680,1,''),
 (22682,20182,20155,0,'','2016-03-09 03:54:10',20011,22429,'58095046-47b5-4826-8734-a88db241bc30',0,0,22683,1,''),
 (22687,20182,20155,0,'','2016-03-09 03:54:10',20011,22429,'58095046-47b5-4826-8734-a88db241bc30',0,0,22688,1,''),
 (22690,20182,20155,0,'','2016-03-09 03:54:10',20011,22441,'af50b84b-a6ce-4d00-8f99-4a4fd71d6894',0,0,22691,1,''),
 (22695,20182,20155,0,'','2016-03-09 03:54:10',20011,22441,'af50b84b-a6ce-4d00-8f99-4a4fd71d6894',0,0,22696,1,''),
 (22698,20182,20155,0,'','2016-03-09 03:54:10',20011,22453,'fe990252-6128-4ce2-9c15-4ee1f6210fe4',0,0,22699,1,''),
 (22703,20182,20155,0,'','2016-03-09 03:54:10',20011,22453,'fe990252-6128-4ce2-9c15-4ee1f6210fe4',0,0,22704,1,''),
 (22706,20182,20155,0,'','2016-03-09 03:54:10',20011,22465,'873d4ebb-78d9-4208-a26b-51235dd5af7b',0,0,22707,1,''),
 (22711,20182,20155,0,'','2016-03-09 03:54:11',20011,22465,'873d4ebb-78d9-4208-a26b-51235dd5af7b',0,0,22712,1,''),
 (22714,20182,20155,0,'','2016-03-09 03:54:11',20011,22477,'9abf1091-066b-4339-8d3f-0e3f1fb94bbe',0,0,22715,1,''),
 (22719,20182,20155,0,'','2016-03-09 03:54:11',20011,22477,'9abf1091-066b-4339-8d3f-0e3f1fb94bbe',0,0,22720,1,''),
 (22722,20182,20155,0,'','2016-03-09 03:54:11',20011,22489,'b0fad5c6-719f-446d-af9c-4e639e5c3813',0,0,22723,1,''),
 (22727,20182,20155,0,'','2016-03-09 03:54:11',20011,22489,'b0fad5c6-719f-446d-af9c-4e639e5c3813',0,0,22728,1,''),
 (22731,20182,20155,0,'','2016-03-09 03:54:11',20102,22601,'900828dc-82c3-4511-8c09-f597c1eec397',20098,0,22732,1,''),
 (22733,20182,20155,0,'','2016-03-09 03:54:11',20102,22602,'a6b4c28c-1426-4e00-97b5-23b5cdb00909',20098,0,22734,1,''),
 (22735,20182,20155,0,'','2016-03-09 03:54:11',20102,22603,'60f89113-0358-4add-ac7a-a7e5cb2d5806',20098,0,22736,1,''),
 (22737,20182,20155,0,'','2016-03-09 03:54:11',20102,22604,'0e445da9-ad0d-4195-860d-a6e93d4e9722',20098,0,22738,1,''),
 (22739,20182,20155,0,'','2016-03-09 03:54:11',20102,22605,'be056c88-69fd-486f-b432-a4514a840ffa',20098,0,22740,1,''),
 (22741,20182,20155,0,'','2016-03-09 03:54:11',20102,22606,'a8eb57ce-fa83-402e-9e23-717c4492ebaa',20098,0,22742,1,''),
 (24198,20182,20155,20199,'Test Test','2016-04-01 04:27:24',20002,20803,'41df99c5-afb0-43bf-b6d4-e26713571083',0,0,24199,1,'{\"privateLayout\":\"false\"}'),
 (24201,20182,20155,20199,'Test Test','2016-04-01 04:27:29',20002,23402,'f1499205-a5de-4343-a3d4-fbf4a86bf7c8',0,0,24202,1,'{\"privateLayout\":\"false\"}'),
 (24204,20182,20155,20199,'Test Test','2016-04-01 04:27:33',20002,23408,'48dc59e2-63ab-4007-b219-f51a19a16dc3',0,0,24205,1,'{\"privateLayout\":\"false\"}'),
 (24413,23906,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24176,'f416bd94-b461-4334-b929-c6bfe2780f78',20098,0,24414,1,''),
 (24415,23906,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24177,'03e970e2-d673-4c53-b5f8-9e94d994bf18',20098,0,24416,1,''),
 (24417,23906,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24178,'959cb49c-c488-434b-ba69-3b33ca66ef63',20098,0,24418,1,''),
 (24419,23906,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24179,'ba96165b-e864-4f53-a1a0-2eec5fd063f6',20098,0,24420,1,''),
 (24421,23906,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24180,'ddd05f05-14f4-42c1-a6e0-47cf5ce75305',20098,0,24422,1,''),
 (24423,23906,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24181,'c0828353-9b0f-4983-a232-4e5f6e956e2f',20098,0,24424,1,''),
 (24427,23918,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24072,'26e20486-9e91-4374-8830-eb6dd990c5ad',20091,0,24428,1,''),
 (24429,23918,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24074,'7637cce9-7319-4aa4-bec2-16904bd4aacf',20091,0,24430,1,''),
 (24431,23918,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24076,'8644f983-4fd6-4173-93fb-f51638468b4c',20091,0,24432,1,''),
 (24433,23918,20155,20199,'Test Test','2016-04-02 04:32:20',20102,24078,'ff10b5e0-f27c-455f-a302-1955e9ba73e9',20091,0,24434,1,''),
 (24437,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24182,'ffeb17b9-ed23-4fce-827f-99fc80259d76',20016,0,24438,1,''),
 (24439,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24184,'8487a4ad-e749-41fe-b39a-8091542d8819',20081,0,24440,1,''),
 (24441,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24186,'97b857cb-9471-4b6f-bad1-d9480995547f',20422,0,24442,1,''),
 (24443,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24188,'8440d6b9-34f4-444d-a5b0-f890783b0a5b',20083,0,24444,1,''),
 (24445,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24190,'6b22ef9f-855a-4291-8c1f-1989f9fbf391',20034,0,24446,1,''),
 (24447,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24192,'4bfddd61-bbe9-47d6-80d5-45fb1f8da312',20085,0,24448,1,''),
 (24449,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20104,24194,'5ec6de94-ee0b-4847-a4aa-b3552735ce19',20007,0,24450,1,''),
 (24451,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20102,24068,'b8ebbba0-28bd-456a-8f0b-4b59093a19cd',20091,0,24452,1,''),
 (24453,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20102,24069,'94493ba8-4d04-4352-a743-40357b5d1906',20091,0,24454,1,''),
 (24455,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20102,24070,'bd6d6b51-0b3a-416a-b1cd-4ae689e19781',20091,0,24456,1,''),
 (24457,23918,20155,20199,'Test Test','2016-04-02 04:32:21',20102,24079,'f54be16e-9c2c-4995-bd37-5f61b702b7ed',20314,0,24458,1,''),
 (24460,0,23880,0,'','2016-04-02 04:32:21',20032,24080,'305aa420-5945-4c04-8e19-1900425f4f09',0,0,24461,1,''),
 (24463,0,23880,0,'','2016-04-02 04:32:22',20032,24092,'ca5da6f0-d1f3-45e7-b7af-821849ed17e0',0,0,24464,1,''),
 (24466,0,23880,0,'','2016-04-02 04:32:23',20032,24102,'f462e439-630f-4600-9d08-bcd529b2a67f',0,0,24467,1,''),
 (24469,0,23880,0,'','2016-04-02 04:32:23',20036,24113,'3e7a479f-a150-4f02-83ea-75f7ad9355c7',0,0,24470,1,''),
 (24472,0,23880,0,'','2016-04-02 04:32:23',20036,24139,'9ebf38de-3bae-4f9e-b469-781ab853f1aa',0,0,24473,1,''),
 (24475,0,23880,0,'','2016-04-02 04:32:24',20004,23886,'161611dc-5127-4fd3-aaf1-fd20b7a082bb',0,0,24476,1,''),
 (24478,0,23880,0,'','2016-04-02 04:32:24',20004,23887,'1bed4b40-7944-4fc3-8fd1-840ea667d29d',0,0,24479,1,''),
 (24481,0,23880,0,'','2016-04-02 04:32:24',20004,23888,'97432258-804d-4819-9613-6fcee619cc1f',0,0,24482,1,''),
 (24484,0,23880,0,'','2016-04-02 04:32:24',20004,23889,'ee933b5a-b192-43ef-83a5-eb2b82da3ef8',0,0,24485,1,''),
 (24487,0,23880,0,'','2016-04-02 04:32:24',20004,23890,'c0f1f65a-2834-43f5-8633-795fa608eb65',0,0,24488,1,''),
 (24490,0,23880,0,'','2016-04-02 04:32:24',20004,23891,'811a489f-4d05-452c-a1b3-a6cdd7a8af81',0,0,24491,1,''),
 (24493,0,23880,0,'','2016-04-02 04:32:24',20004,23892,'d4097532-1805-4389-ac69-61c106462900',0,0,24494,1,''),
 (24496,0,23880,0,'','2016-04-02 04:32:24',20004,23893,'1df94a85-e0e8-48c8-b590-7962f96c54e4',0,0,24497,1,''),
 (24499,0,23880,0,'','2016-04-02 04:32:24',20004,23894,'495c1985-0efd-466a-ab01-1a1b9b4e1e89',0,0,24500,1,''),
 (24502,0,23880,0,'','2016-04-02 04:32:24',20004,23895,'230849d6-f16c-46c4-9457-976755f797c1',0,0,24503,1,''),
 (24505,0,23880,0,'','2016-04-02 04:32:24',20004,23896,'b0d81d1f-5c5a-43c7-95ad-fa3801643f6c',0,0,24506,1,''),
 (24508,0,23880,0,'','2016-04-02 04:32:24',20004,24055,'3b1314ff-5df6-4121-9aca-aa4f7969a998',0,0,24509,1,''),
 (24511,0,23880,0,'','2016-04-02 04:32:24',20004,24057,'393270d1-cbab-43c8-9f0e-36645025eb56',0,0,24512,1,''),
 (24514,0,23880,0,'','2016-04-02 04:32:24',20004,24059,'b8e14cd8-2520-4fc9-89b5-49fef26ca4b1',0,0,24515,1,''),
 (24517,0,23880,0,'','2016-04-02 04:32:24',20042,23921,'d958b004-5ce6-4b1c-b2ee-33e0815a1e77',0,0,24518,1,''),
 (24521,23918,20155,20199,'Test Test','2016-04-02 04:32:25',20005,23922,'69c46a52-e3d4-4e0b-acf9-52b6684fc6b2',0,0,24522,1,'');
/*!40000 ALTER TABLE `systemevent` ENABLE KEYS */;


--
-- Definition of table `team`
--

DROP TABLE IF EXISTS `team`;
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

--
-- Dumping data for table `team`
--

/*!40000 ALTER TABLE `team` DISABLE KEYS */;
/*!40000 ALTER TABLE `team` ENABLE KEYS */;


--
-- Definition of table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
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

--
-- Dumping data for table `ticket`
--

/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;


--
-- Definition of table `trashentry`
--

DROP TABLE IF EXISTS `trashentry`;
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

--
-- Dumping data for table `trashentry`
--

/*!40000 ALTER TABLE `trashentry` DISABLE KEYS */;
/*!40000 ALTER TABLE `trashentry` ENABLE KEYS */;


--
-- Definition of table `trashversion`
--

DROP TABLE IF EXISTS `trashversion`;
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

--
-- Dumping data for table `trashversion`
--

/*!40000 ALTER TABLE `trashversion` DISABLE KEYS */;
/*!40000 ALTER TABLE `trashversion` ENABLE KEYS */;


--
-- Definition of table `user_`
--

DROP TABLE IF EXISTS `user_`;
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

--
-- Dumping data for table `user_`
--

/*!40000 ALTER TABLE `user_` DISABLE KEYS */;
INSERT INTO `user_` (`uuid_`,`userId`,`companyId`,`createDate`,`modifiedDate`,`defaultUser`,`contactId`,`password_`,`passwordEncrypted`,`passwordReset`,`passwordModifiedDate`,`digest`,`reminderQueryQuestion`,`reminderQueryAnswer`,`graceLoginCount`,`screenName`,`emailAddress`,`facebookId`,`ldapServerId`,`openId`,`portraitId`,`languageId`,`timeZoneId`,`greeting`,`comments`,`firstName`,`middleName`,`lastName`,`jobTitle`,`loginDate`,`loginIP`,`lastLoginDate`,`lastLoginIP`,`lastFailedLoginDate`,`failedLoginAttempts`,`lockout`,`lockoutDate`,`agreedToTermsOfUse`,`emailAddressVerified`,`status`) VALUES 
 ('300af075-3fe9-43a8-98e0-06240a7ecea1',20159,20155,'2016-03-06 15:57:47','2016-03-06 15:57:47',1,20160,'password',0,0,NULL,'5533ed38b5e33c076a804bb4bca644f9,9590828507537743bc166fef8cff8748,9590828507537743bc166fef8cff8748','','',0,'20159','default@liferay.com',0,0,'',0,'es_ES','UTC','Welcome!','','','','','','2016-03-06 15:57:47','',NULL,'',NULL,0,0,NULL,1,0,0),
 ('834bc287-2461-4053-a0c5-8aaa796e0dd4',20199,20155,'2016-03-06 15:57:51','2016-03-06 16:10:01',0,20200,'AAAAoAAB9ACe+B1fdu0av9VZw7OfGrErfliiTgR4cFzLw8U9',1,0,'2016-03-06 16:10:54','43e1caee0f13b4576cdc1a845c35aea3,ce348fdaff13513e20fba3e96eeee5d6,dc886cc8d20c21871a1e03e096038fa6','','',0,'test','test@liferay.com',0,-1,'',0,'es_ES','UTC','Bienvenido  Test Test!','','Test','','Test','','2016-04-02 04:29:50','127.0.0.1','2016-04-02 04:19:40','127.0.0.1','2016-03-09 04:20:19',0,0,NULL,0,1,0),
 ('edb8e180-784e-48b7-a55c-9f62300cf03b',23103,20155,'2016-03-09 04:21:43','2016-03-09 04:21:43',0,23104,'AAAAoAAB9ABcAsXlRXs5wJSwSAPkNk55CdCGE1DD1qPelJi1',1,1,'2016-03-09 04:21:43','','','',0,'danielle','danieldelgado20g@gmail.com',0,-1,'',0,'es_ES','UTC','Bienvenido  Danielle Christian Delgado!','','Danielle','Christian','Delgado','Desarrollador Java Liferay',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),
 ('193a65e9-7a04-4600-8117-b094d964b04a',23112,20155,'2016-03-09 04:22:15','2016-03-09 04:22:15',0,23113,'AAAAoAAB9AA3js54R7KjNmxOhAUWZVhn39G+zk6B9XfW5sNH',1,1,'2016-03-09 04:22:15','','','',0,'usuario01','usuario01@gmail.com',0,-1,'',0,'es_ES','UTC','Bienvenido  Usuario01 Usuario01 Usuario01!','','Usuario01','Usuario01','Usuario01','Usuario01Usuario01Usuario01',NULL,'',NULL,'',NULL,0,0,NULL,0,0,0),
 ('60652b56-4771-4d18-8bce-0303e9eb69af',24213,20155,'2016-04-01 04:34:34','2016-04-01 04:36:09',0,24214,'AAAAoAAB9ABy9XWxw/+k6QahN+JMo7cdNEIed9ikNhWvbFfC',1,0,'2016-04-01 04:36:09','eab509fc8122cf5a3d466978bbb8e02d,4eb2b9cc808f74bd99e383349c83c8fc,b9ab4a2f3d3c097274c41bc17b3b2c54','','',0,'ivan.quiroz','ivan.quiroz@gmail.com',0,-1,'',0,'es_ES','UTC','Bienvenido  IVAN QUIROZ!','','IVAN','','QUIROZ','coordinar de rrhh','2016-04-01 04:38:30','127.0.0.1','2016-04-01 04:36:25','127.0.0.1',NULL,0,0,NULL,0,0,0);
/*!40000 ALTER TABLE `user_` ENABLE KEYS */;


--
-- Definition of table `usergroup`
--

DROP TABLE IF EXISTS `usergroup`;
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

--
-- Dumping data for table `usergroup`
--

/*!40000 ALTER TABLE `usergroup` DISABLE KEYS */;
INSERT INTO `usergroup` (`uuid_`,`userGroupId`,`companyId`,`userId`,`userName`,`createDate`,`modifiedDate`,`parentUserGroupId`,`name`,`description`,`addedByLDAPImport`) VALUES 
 ('67d623cc-2189-4e93-a53a-8b6f314c96d5',23836,20155,20199,'Test Test','2016-04-01 04:22:03','2016-04-01 04:22:03',0,'CLARO_ANALISTAS','Staff de Analistas en claro',0),
 ('24bf2d8b-192d-458e-a3c4-0d47ac8ccd39',23840,20155,20199,'Test Test','2016-04-01 04:22:25','2016-04-01 04:22:25',0,'CLARO_PMO','',0),
 ('e738c606-0f5d-451b-9af7-ac8e473b2242',23844,20155,20199,'Test Test','2016-04-01 04:22:36','2016-04-01 04:22:36',0,'BBVA_ANALISTAS','',0),
 ('f6a034b3-cde2-4390-9479-b662fc9b15b2',23848,20155,20199,'Test Test','2016-04-01 04:22:47','2016-04-01 04:22:47',0,'BBVA_PROGRAMADORES','',0),
 ('6b795acf-a8f4-4df6-beec-034105e7fde6',23852,20155,20199,'Test Test','2016-04-01 04:23:07','2016-04-01 04:23:07',0,'BBVA_PAQUETIZADOS','',0),
 ('e51933b0-5752-46cf-8b80-db34fe541f11',23856,20155,20199,'Test Test','2016-04-01 04:23:21','2016-04-01 04:23:21',0,'CLARO_COLOMBIA','',0),
 ('366a3dbc-9ebb-4cdf-a4f4-89e601bb7793',23860,20155,20199,'Test Test','2016-04-01 04:23:35','2016-04-01 04:23:35',0,'TELMEX','',0),
 ('bfc0dc0c-b7ef-4335-a69c-c90ec9af469f',23864,20155,20199,'Test Test','2016-04-01 04:23:56','2016-04-01 04:23:56',0,'BVL_DESTACADOS','',0),
 ('a83c97ec-770b-41b3-85b0-190ca299a2d0',23868,20155,20199,'Test Test','2016-04-01 04:24:12','2016-04-01 04:24:12',0,'DIVEMOTOR_DESTACADOS','',0),
 ('ee29258f-2788-49aa-a1a5-697992b1406a',23872,20155,20199,'Test Test','2016-04-01 04:24:31','2016-04-01 04:24:31',0,'MAFREE_ANALISTAS_PROGRAMADORES','',0);
/*!40000 ALTER TABLE `usergroup` ENABLE KEYS */;


--
-- Definition of table `usergroupgrouprole`
--

DROP TABLE IF EXISTS `usergroupgrouprole`;
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

--
-- Dumping data for table `usergroupgrouprole`
--

/*!40000 ALTER TABLE `usergroupgrouprole` DISABLE KEYS */;
/*!40000 ALTER TABLE `usergroupgrouprole` ENABLE KEYS */;


--
-- Definition of table `usergrouprole`
--

DROP TABLE IF EXISTS `usergrouprole`;
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

--
-- Dumping data for table `usergrouprole`
--

/*!40000 ALTER TABLE `usergrouprole` DISABLE KEYS */;
INSERT INTO `usergrouprole` (`userId`,`groupId`,`roleId`) VALUES 
 (20199,24523,20172);
/*!40000 ALTER TABLE `usergrouprole` ENABLE KEYS */;


--
-- Definition of table `usergroups_teams`
--

DROP TABLE IF EXISTS `usergroups_teams`;
CREATE TABLE `usergroups_teams` (
  `teamId` bigint(20) NOT NULL,
  `userGroupId` bigint(20) NOT NULL,
  PRIMARY KEY (`teamId`,`userGroupId`),
  KEY `IX_31FB0B08` (`teamId`),
  KEY `IX_7F187E63` (`userGroupId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usergroups_teams`
--

/*!40000 ALTER TABLE `usergroups_teams` DISABLE KEYS */;
/*!40000 ALTER TABLE `usergroups_teams` ENABLE KEYS */;


--
-- Definition of table `useridmapper`
--

DROP TABLE IF EXISTS `useridmapper`;
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

--
-- Dumping data for table `useridmapper`
--

/*!40000 ALTER TABLE `useridmapper` DISABLE KEYS */;
/*!40000 ALTER TABLE `useridmapper` ENABLE KEYS */;


--
-- Definition of table `usernotificationdelivery`
--

DROP TABLE IF EXISTS `usernotificationdelivery`;
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

--
-- Dumping data for table `usernotificationdelivery`
--

/*!40000 ALTER TABLE `usernotificationdelivery` DISABLE KEYS */;
INSERT INTO `usernotificationdelivery` (`userNotificationDeliveryId`,`companyId`,`userId`,`portletId`,`classNameId`,`notificationType`,`deliveryType`,`deliver`) VALUES 
 (20526,20155,20199,'33',0,0,10002,1),
 (20527,20155,20199,'33',0,1,10002,1),
 (20528,20155,20199,'15',0,0,10002,1),
 (20529,20155,20199,'15',0,1,10002,1),
 (20530,20155,20199,'20',0,0,10002,1),
 (20531,20155,20199,'20',0,1,10002,1),
 (20532,20155,20199,'28',0,0,10002,1),
 (20533,20155,20199,'28',0,1,10002,1),
 (20534,20155,20199,'19',0,0,10002,1),
 (20535,20155,20199,'19',0,1,10002,1),
 (20536,20155,20199,'36',0,0,10002,1),
 (20537,20155,20199,'36',0,1,10002,1);
/*!40000 ALTER TABLE `usernotificationdelivery` ENABLE KEYS */;


--
-- Definition of table `usernotificationevent`
--

DROP TABLE IF EXISTS `usernotificationevent`;
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

--
-- Dumping data for table `usernotificationevent`
--

/*!40000 ALTER TABLE `usernotificationevent` DISABLE KEYS */;
/*!40000 ALTER TABLE `usernotificationevent` ENABLE KEYS */;


--
-- Definition of table `users_groups`
--

DROP TABLE IF EXISTS `users_groups`;
CREATE TABLE `users_groups` (
  `groupId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`groupId`,`userId`),
  KEY `IX_C4F9E699` (`groupId`),
  KEY `IX_F10B6C6B` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_groups`
--

/*!40000 ALTER TABLE `users_groups` DISABLE KEYS */;
INSERT INTO `users_groups` (`groupId`,`userId`) VALUES 
 (20182,20199),
 (24523,20199);
/*!40000 ALTER TABLE `users_groups` ENABLE KEYS */;


--
-- Definition of table `users_orgs`
--

DROP TABLE IF EXISTS `users_orgs`;
CREATE TABLE `users_orgs` (
  `organizationId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`organizationId`,`userId`),
  KEY `IX_7EF4EC0E` (`organizationId`),
  KEY `IX_FB646CA6` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_orgs`
--

/*!40000 ALTER TABLE `users_orgs` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_orgs` ENABLE KEYS */;


--
-- Definition of table `users_roles`
--

DROP TABLE IF EXISTS `users_roles`;
CREATE TABLE `users_roles` (
  `roleId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`roleId`,`userId`),
  KEY `IX_C19E5F31` (`roleId`),
  KEY `IX_C1A01806` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_roles`
--

/*!40000 ALTER TABLE `users_roles` DISABLE KEYS */;
INSERT INTO `users_roles` (`roleId`,`userId`) VALUES 
 (20162,20199),
 (20163,20159),
 (20165,20199),
 (20165,23103),
 (20165,23112),
 (20165,24213),
 (20166,20199),
 (20166,23103),
 (20166,23112),
 (20166,24213);
/*!40000 ALTER TABLE `users_roles` ENABLE KEYS */;


--
-- Definition of table `users_teams`
--

DROP TABLE IF EXISTS `users_teams`;
CREATE TABLE `users_teams` (
  `teamId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`teamId`,`userId`),
  KEY `IX_4D06AD51` (`teamId`),
  KEY `IX_A098EFBF` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_teams`
--

/*!40000 ALTER TABLE `users_teams` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_teams` ENABLE KEYS */;


--
-- Definition of table `users_usergroups`
--

DROP TABLE IF EXISTS `users_usergroups`;
CREATE TABLE `users_usergroups` (
  `userId` bigint(20) NOT NULL,
  `userGroupId` bigint(20) NOT NULL,
  PRIMARY KEY (`userId`,`userGroupId`),
  KEY `IX_66FF2503` (`userGroupId`),
  KEY `IX_BE8102D6` (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_usergroups`
--

/*!40000 ALTER TABLE `users_usergroups` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_usergroups` ENABLE KEYS */;


--
-- Definition of table `usertracker`
--

DROP TABLE IF EXISTS `usertracker`;
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

--
-- Dumping data for table `usertracker`
--

/*!40000 ALTER TABLE `usertracker` DISABLE KEYS */;
/*!40000 ALTER TABLE `usertracker` ENABLE KEYS */;


--
-- Definition of table `usertrackerpath`
--

DROP TABLE IF EXISTS `usertrackerpath`;
CREATE TABLE `usertrackerpath` (
  `userTrackerPathId` bigint(20) NOT NULL,
  `userTrackerId` bigint(20) DEFAULT NULL,
  `path_` longtext,
  `pathDate` datetime DEFAULT NULL,
  PRIMARY KEY (`userTrackerPathId`),
  KEY `IX_14D8BCC0` (`userTrackerId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usertrackerpath`
--

/*!40000 ALTER TABLE `usertrackerpath` DISABLE KEYS */;
/*!40000 ALTER TABLE `usertrackerpath` ENABLE KEYS */;


--
-- Definition of table `virtualhost`
--

DROP TABLE IF EXISTS `virtualhost`;
CREATE TABLE `virtualhost` (
  `virtualHostId` bigint(20) NOT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `layoutSetId` bigint(20) DEFAULT NULL,
  `hostname` varchar(75) DEFAULT NULL,
  PRIMARY KEY (`virtualHostId`),
  UNIQUE KEY `IX_A083D394` (`companyId`,`layoutSetId`),
  UNIQUE KEY `IX_431A3960` (`hostname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `virtualhost`
--

/*!40000 ALTER TABLE `virtualhost` DISABLE KEYS */;
INSERT INTO `virtualhost` (`virtualHostId`,`companyId`,`layoutSetId`,`hostname`) VALUES 
 (20158,20155,0,'localhost');
/*!40000 ALTER TABLE `virtualhost` ENABLE KEYS */;


--
-- Definition of table `webdavprops`
--

DROP TABLE IF EXISTS `webdavprops`;
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

--
-- Dumping data for table `webdavprops`
--

/*!40000 ALTER TABLE `webdavprops` DISABLE KEYS */;
/*!40000 ALTER TABLE `webdavprops` ENABLE KEYS */;


--
-- Definition of table `website`
--

DROP TABLE IF EXISTS `website`;
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

--
-- Dumping data for table `website`
--

/*!40000 ALTER TABLE `website` DISABLE KEYS */;
/*!40000 ALTER TABLE `website` ENABLE KEYS */;


--
-- Definition of table `wikinode`
--

DROP TABLE IF EXISTS `wikinode`;
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

--
-- Dumping data for table `wikinode`
--

/*!40000 ALTER TABLE `wikinode` DISABLE KEYS */;
/*!40000 ALTER TABLE `wikinode` ENABLE KEYS */;


--
-- Definition of table `wikipage`
--

DROP TABLE IF EXISTS `wikipage`;
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

--
-- Dumping data for table `wikipage`
--

/*!40000 ALTER TABLE `wikipage` DISABLE KEYS */;
/*!40000 ALTER TABLE `wikipage` ENABLE KEYS */;


--
-- Definition of table `wikipageresource`
--

DROP TABLE IF EXISTS `wikipageresource`;
CREATE TABLE `wikipageresource` (
  `uuid_` varchar(75) DEFAULT NULL,
  `resourcePrimKey` bigint(20) NOT NULL,
  `nodeId` bigint(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`resourcePrimKey`),
  UNIQUE KEY `IX_21277664` (`nodeId`,`title`),
  KEY `IX_BE898221` (`uuid_`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wikipageresource`
--

/*!40000 ALTER TABLE `wikipageresource` DISABLE KEYS */;
/*!40000 ALTER TABLE `wikipageresource` ENABLE KEYS */;


--
-- Definition of table `workflowdefinitionlink`
--

DROP TABLE IF EXISTS `workflowdefinitionlink`;
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

--
-- Dumping data for table `workflowdefinitionlink`
--

/*!40000 ALTER TABLE `workflowdefinitionlink` DISABLE KEYS */;
/*!40000 ALTER TABLE `workflowdefinitionlink` ENABLE KEYS */;


--
-- Definition of table `workflowinstancelink`
--

DROP TABLE IF EXISTS `workflowinstancelink`;
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

--
-- Dumping data for table `workflowinstancelink`
--

/*!40000 ALTER TABLE `workflowinstancelink` DISABLE KEYS */;
/*!40000 ALTER TABLE `workflowinstancelink` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
