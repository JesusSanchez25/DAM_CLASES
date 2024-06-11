CREATE DATABASE `programacionfutbol` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;


CREATE TABLE `equipos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `presupuesto` int NOT NULL DEFAULT '1000000',
  PRIMARY KEY (`id`),
  UNIQUE KEY `Nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `jugadores` (
  `_id` varchar(45) NOT NULL,
  `id_equipo` int DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `media` int NOT NULL,
  `precio` int NOT NULL,
  `posicion` varchar(45) NOT NULL,
  `estitular` tinyint DEFAULT '0',
  PRIMARY KEY (`_id`),
  KEY `id_equipo_fk_idx` (`id_equipo`),
  CONSTRAINT `id_equipo_fk` FOREIGN KEY (`id_equipo`) REFERENCES `equipos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_equipo` int DEFAULT NULL,
  `nombre` varchar(45) NOT NULL,
  `contrasenia` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`),
  KEY `id_equipo_fk_idx` (`id_equipo`),
  CONSTRAINT `id_equipo_usuarios_fk` FOREIGN KEY (`id_equipo`) REFERENCES `equipos` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistajugadoresnofichados` AS select `jugadores`.`_id` AS `_id`,`jugadores`.`id_equipo` AS `id_equipo`,`jugadores`.`name` AS `name`,`jugadores`.`media` AS `media`,`jugadores`.`precio` AS `precio`,`jugadores`.`posicion` AS `posicion`,`jugadores`.`estitular` AS `estitular` from `jugadores` where (`jugadores`.`id_equipo` is null);

