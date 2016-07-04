/*
SQLyog Ultimate v9.50 
MySQL - 5.6.20 : Database - poslovnipartneri
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`poslovnipartneri` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `poslovnipartneri`;

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `Ptt` int(11) NOT NULL,
  `Naziv` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Ptt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `mesto` */

insert  into `mesto`(`Ptt`,`Naziv`) values (11000,'Beograd'),(17000,'Vranje'),(18000,'Nis');

/*Table structure for table `poslovnipartner` */

DROP TABLE IF EXISTS `poslovnipartner`;

CREATE TABLE `poslovnipartner` (
  `PartnerID` int(11) NOT NULL,
  `Naziv` varchar(50) DEFAULT NULL,
  `Pib` int(11) DEFAULT NULL,
  `MaticniBroj` int(11) DEFAULT NULL,
  `DatumOsnivanja` date DEFAULT NULL,
  `ZiroRacun` varchar(50) DEFAULT NULL,
  `Ulica` varchar(50) DEFAULT NULL,
  `Broj` varchar(50) DEFAULT NULL,
  `Ptt` int(11) DEFAULT NULL,
  PRIMARY KEY (`PartnerID`),
  KEY `Ptt` (`Ptt`),
  CONSTRAINT `poslovnipartner_ibfk_1` FOREIGN KEY (`Ptt`) REFERENCES `mesto` (`Ptt`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `poslovnipartner` */

insert  into `poslovnipartner`(`PartnerID`,`Naziv`,`Pib`,`MaticniBroj`,`DatumOsnivanja`,`ZiroRacun`,`Ulica`,`Broj`,`Ptt`) values (1,'FON',1,1,'1969-01-01','1','Jove Ilica','154',11000),(2,'FPN',2,2,'2000-01-01','2','Jove Ilica','165',11000);

/*Table structure for table `proizvod` */

DROP TABLE IF EXISTS `proizvod`;

CREATE TABLE `proizvod` (
  `ProizvodID` int(11) NOT NULL,
  `Naziv` varchar(20) DEFAULT NULL,
  `Cena` double DEFAULT NULL,
  PRIMARY KEY (`ProizvodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `proizvod` */

insert  into `proizvod`(`ProizvodID`,`Naziv`,`Cena`) values (1,'Hleb',40),(2,'Mleko',82),(3,'Smoki',45),(4,'Plazma',94);

/*Table structure for table `racun` */

DROP TABLE IF EXISTS `racun`;

CREATE TABLE `racun` (
  `RacunID` int(11) NOT NULL,
  `Datum` date DEFAULT NULL,
  `UkupanIznos` double DEFAULT NULL,
  `PartnerID` int(11) DEFAULT NULL,
  PRIMARY KEY (`RacunID`),
  KEY `PartnerID` (`PartnerID`),
  CONSTRAINT `racun_ibfk_1` FOREIGN KEY (`PartnerID`) REFERENCES `poslovnipartner` (`PartnerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `racun` */

/*Table structure for table `stavkaracuna` */

DROP TABLE IF EXISTS `stavkaracuna`;

CREATE TABLE `stavkaracuna` (
  `RacunID` int(11) NOT NULL,
  `Rb` int(11) NOT NULL,
  `Kolicina` int(11) DEFAULT NULL,
  `Iznos` double DEFAULT NULL,
  `ProizvodID` int(11) DEFAULT NULL,
  PRIMARY KEY (`RacunID`,`Rb`),
  KEY `ProizvodID` (`ProizvodID`),
  CONSTRAINT `stavkaracuna_ibfk_1` FOREIGN KEY (`ProizvodID`) REFERENCES `proizvod` (`ProizvodID`),
  CONSTRAINT `stavkaracuna_ibfk_2` FOREIGN KEY (`RacunID`) REFERENCES `racun` (`RacunID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `stavkaracuna` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
