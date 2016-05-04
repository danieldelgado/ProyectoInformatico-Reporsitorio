-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: 192.168.48.129    Database: rechitssportal
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
  `fechacreamodifica` datetime DEFAULT NULL,
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
INSERT INTO `parametro` VALUES (1,0,'','TipoReclutamiento','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(2,1,'','','interno','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(3,1,'','','externo','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(4,0,'','ModalidadJornada','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(5,4,'','','Tiempo Completo','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(6,4,'','','Por horas','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(7,4,'','','Part-Time','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(8,0,'','ModalidadContrato','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(9,8,'','','Locación de servicio','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(10,8,'','','Planilla','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(11,8,'','','Convenio de practicas','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(12,0,'','MotivoContrato','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(13,12,'','','Rotación','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(14,12,'','','Contrato Pre Post','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(15,12,'','','Reemplazo por Proyecto','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(16,0,'','Prioridades','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(17,16,'','','Baja','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(18,16,'','','Media','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(19,16,'','','Alta','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(20,16,'','','Intercambio de Actividades','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(21,0,'','Clientes','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(22,21,'','','BBVA','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(23,21,'','','DIVEMOTOR','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(24,21,'','','MAFFRE','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(25,21,'','','BOLSA DE VALORES DE LIMA','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(26,21,'','','CLARO','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(27,21,'','','CLARO  ECUADOR','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(28,21,'','','TELMET USA','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(29,0,'','Tipo de negocio','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(30,29,'','','BANCA','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(31,29,'','','VENTA DE AUTOS','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(32,29,'','','ASEGURADORA','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(33,29,'','','BOLSA','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(34,29,'','','TELECOMUNICACIONES','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(35,0,'','Nivel','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(36,35,'','','1','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(37,35,'','','2','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(38,35,'','','3','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(39,35,'','','4','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(40,35,'','','5','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(41,0,'','Tipo de documento','','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(42,41,'','','DNI','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(43,41,'','','CARNET DE EXTRANGERIA','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(44,0,'','Tiempo de contrato','','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(45,44,'','','1 mes','',1,20199,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(46,44,'','','6 meses','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(47,0,'','Estados','','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(48,47,'','','Registrado','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(49,47,'','','Revisado','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(50,47,'','','Observado','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(51,47,'','','Evaluación','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(52,47,'','','Entrevista','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(53,0,'','Cargo','','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(54,53,'','','Analista Programador Junior','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(55,53,'','','Analista Programador Semisenior','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(56,53,'','','Analista Programador Senior','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(57,53,'','','DBA','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(58,53,'','','Lider Tecnico servidores','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(59,0,'','Area','','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(60,59,'','','Claro Telmex','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(61,59,'','','Claro Ecuador','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(62,47,'','','Cancelado','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00'),(63,47,'','','Terminado','',1,123,'2016-04-08 00:00:00',123,'2016-04-08 00:00:00');
/*!40000 ALTER TABLE `parametro` ENABLE KEYS */;
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
  `especialidad` bigint(20) DEFAULT NULL,
  `meta` varchar(75) DEFAULT NULL,
  `prioridad` bigint(20) DEFAULT NULL,
  `motivo` varchar(75) DEFAULT NULL,
  `modalidadjornada` bigint(20) DEFAULT NULL,
  `modalidadcontrato` bigint(20) DEFAULT NULL,
  `lugarTrabajo` varchar(75) DEFAULT NULL,
  `puestoId` bigint(20) DEFAULT NULL,
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
  `fechacreamodifica` datetime DEFAULT NULL,
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
INSERT INTO `solicitudrequerimiento` VALUES (1,60,5,22203,'2016-04-27 04:32:11',45,30,0,0,23,0,'',17,'',0,0,'',2,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:32:11',20199,'2016-04-27 04:32:11'),(2,60,5,22203,'2016-04-27 04:37:39',45,30,0,0,23,0,'',18,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:37:39',20199,'2016-04-27 04:37:39'),(3,61,5,22203,'2016-04-27 04:39:17',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:39:17',20199,'2016-04-27 04:39:17'),(4,62,5,22203,'2016-04-27 04:41:47',45,30,0,0,23,0,'',17,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:41:47',20199,'2016-04-27 04:41:47'),(5,63,5,22203,'2016-04-27 04:45:47',45,30,0,0,23,0,'',18,'',0,0,'',5,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:45:47',20199,'2016-04-27 04:45:47'),(6,60,5,22203,'2016-03-21 00:00:00',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-04-27 04:46:02'),(7,61,5,22203,'2016-03-29 00:00:00',45,30,0,0,23,0,'',17,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:15',20199,'2016-04-27 04:46:15'),(8,61,5,22203,'2016-05-02 19:50:33',45,30,0,0,23,0,'',19,'',0,0,'',6,'',0,0,0,0,0,48,1,20199,'2016-05-02 19:50:33',20199,'2016-05-02 19:50:33'),(9,60,5,22203,'2016-03-21 00:00:00',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-04-27 04:46:02'),(10,60,5,22203,'2016-03-21 00:00:00',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-04-27 04:46:02'),(11,60,5,22203,'2016-03-21 00:00:00',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-04-27 04:46:02'),(12,60,5,22203,'2016-03-21 00:00:00',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-04-27 04:46:02'),(13,60,5,22203,'2016-05-17 00:00:00',45,30,850,850,23,0,'',19,'',0,0,'',5,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-05-04 04:59:36'),(14,60,5,22203,'2016-03-21 00:00:00',45,30,0,0,23,0,'',19,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-04-27 04:46:02',20199,'2016-04-27 04:46:02'),(201,60,4,22203,'2016-05-26 00:00:00',46,31,1500,900,23,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:18:39',20199,'2016-05-03 03:18:39'),(202,60,4,22203,'2016-05-18 00:00:00',46,31,900,850,23,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:22:04',20199,'2016-05-03 03:22:04'),(203,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:12',20199,'2016-05-03 03:28:12'),(204,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,'2016-05-03 03:28:22'),(205,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,'2016-05-03 03:28:22'),(206,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,'2016-05-03 03:28:22'),(207,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,'2016-05-03 03:28:22'),(208,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:22',20199,'2016-05-03 03:28:22'),(209,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(210,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(211,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(212,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(213,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(214,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(215,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:23',20199,'2016-05-03 03:28:23'),(216,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(217,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(218,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(219,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(220,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(221,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(222,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:24',20199,'2016-05-03 03:28:24'),(223,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,'2016-05-03 03:28:25'),(224,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,'2016-05-03 03:28:25'),(225,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,'2016-05-03 03:28:25'),(226,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,'2016-05-03 03:28:25'),(227,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,'2016-05-03 03:28:25'),(228,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:25',20199,'2016-05-03 03:28:25'),(229,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:26',20199,'2016-05-03 03:28:26'),(230,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:26',20199,'2016-05-03 03:28:26'),(231,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:26',20199,'2016-05-03 03:28:26'),(232,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:28:26',20199,'2016-05-03 03:28:26'),(233,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:30:09',20199,'2016-05-03 03:30:09'),(234,60,5,22203,'2016-05-19 00:00:00',46,31,2950,1850,23,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:30:12',20199,'2016-05-04 02:01:08'),(235,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:35:51',20199,'2016-05-03 03:35:51'),(236,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 03:37:30',20199,'2016-05-03 03:37:30'),(237,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,25,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:11:17',20199,'2016-05-03 04:11:17'),(238,61,4,22203,'2016-05-25 00:00:00',46,32,950,850,24,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:12:40',20199,'2016-05-03 04:12:40'),(239,60,6,22203,'2016-05-25 00:00:00',46,33,950,850,28,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:17:24',20199,'2016-05-04 02:00:45'),(240,60,6,22203,'2016-05-25 00:00:00',46,33,950,850,28,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:20:30',20199,'2016-05-04 02:00:13'),(241,61,6,22203,'2016-05-25 00:00:00',45,30,950,850,28,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:22:53',20199,'2016-05-03 04:22:53'),(242,61,5,22203,'2016-05-25 00:00:00',45,33,950,850,23,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:45:46',20199,'2016-05-04 02:00:30'),(243,61,4,22203,'2016-05-25 00:00:00',45,32,950,850,24,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:50:52',20199,'2016-05-03 04:50:52'),(244,61,6,22203,'2016-05-25 00:00:00',45,31,1500,960,24,0,'',0,'',0,0,'',4,'',0,0,0,0,0,48,1,20199,'2016-05-03 04:53:49',20199,'2016-05-03 04:53:49'),(245,60,5,22203,'2016-05-25 00:00:00',46,31,950,850,23,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-03 05:51:59',20199,'2016-05-04 05:25:02'),(301,61,5,22203,'2016-05-25 00:00:00',45,30,950,850,23,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-04 00:45:21',20199,'2016-05-04 00:45:21'),(302,60,5,22203,'2016-05-18 00:00:00',46,31,950,850,23,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-04 00:50:38',20199,'2016-05-04 02:19:32'),(303,60,7,22203,'2016-05-19 00:00:00',46,30,950,850,22,0,'',0,'',0,0,'',1,'',0,0,0,0,0,48,1,20199,'2016-05-04 00:57:09',20199,'2016-05-04 00:57:09'),(304,61,5,22203,'2016-05-26 00:00:00',45,31,6000,5850,24,0,'',0,'',0,0,'',3,'',0,0,0,0,0,48,1,20199,'2016-05-04 04:10:28',20199,'2016-05-04 05:33:38'),(305,60,3,22203,'2016-05-17 00:00:00',45,32,7000,5000,23,0,'',0,'',0,0,'',6,'',0,0,0,0,0,48,1,20199,'2016-05-04 04:12:28',20199,'2016-05-04 05:34:21'),(401,60,23,22203,'2016-05-25 00:00:00',45,31,1500,900,24,0,'',0,'',0,0,'',2,'',0,0,0,0,0,48,1,20199,'2016-05-04 05:27:47',20199,'2016-05-04 05:27:47');
/*!40000 ALTER TABLE `solicitudrequerimiento` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-04  2:20:34
