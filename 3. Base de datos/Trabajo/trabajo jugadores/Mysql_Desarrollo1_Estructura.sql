-- 1. CREAMOS LA TABLA 'equipos' --
CREATE TABLE equipos (
	nombre varchar(45) primary key,
    categoria varchar(45) not null,
    posicion_en_liga int not null,
    numero_jugadores int not null,
    ATH varchar(45) not null);

-- 1. CREAMOS LA TABLA 'jugadores' --
CREATE TABLE jugadores (
	nif varchar(9) primary key, 
	nombre varchar(20) not null, 
    apellidos varchar(45) not null, 
    edad int not null, 
    partidos_jugados int not null, 
    importe_prima float not null, 
    nom_equipo varchar(45) not null, 
    MGG varchar(45) not null,
	CONSTRAINT ca_nom_equipo FOREIGN KEY (nom_equipo) REFERENCES equipos (nombre));
    
-- 1. CREAMOS LA TABLA 'totales_tabla' --
CREATE TABLE totales_tabla (
	tabla varchar(45) primary key,
    num_registros int not null,
    JSP varchar(45) not null,
    JLP varchar(45) not null);
    
-- 2. INSERTAMOS LOS DOS REGISTROS DE LA TABLA 'totales_tabla' --
INSERT INTO totales_tabla VALUES ('jugadores', 0, 'Jesús Sánchez Pedraza', 'Jorge López Puebla'),('equipos', 0, 'Jesús Sánchez Pedraza', 'Jorge López Puebla');

-- 3. CREAMOS EL TRIGGER 'trigger_alta_jugador' --
DROP TRIGGER IF EXISTS trigger_alta_jugador;
DELIMITER $$
CREATE TRIGGER trigger_alta_jugador
BEFORE INSERT on jugadores
FOR EACH ROW
BEGIN
	DECLARE existe int;
    -- VAR EXISTE: Será 0 si el equipo asignado al jugador ya existe en la tabla 'equipos', sino, será 1 --
    SET existe = (SELECT count(*) FROM equipos WHERE nombre = new.nom_equipo);
    
    IF existe = 0 -- SI NO EXISTE EL EQUIPO, LO CREO --
    THEN
		INSERT INTO equipos VALUES (new.nom_equipo, 'PREDETERMINADO', 0, 1, 'Alejandro Tordable Hernández');
	ELSE -- SI EXISTE, SE ACTUALIZA EL NÚMERO DE JUGADORES DEL EQUIPO --
		UPDATE equipos SET numero_jugadores = (numero_jugadores + 1) WHERE nombre = new.nom_equipo;
        -- ACTUALIZAMOS TAMBIÉN EL NÚMERO DE JUGADORES EN 'totales_tabla' (Aunque podría hacerse con un trigger en 'totales_tabla') --
        UPDATE totales_tabla SET num_registros = (num_registros + 1) WHERE tabla = 'jugadores'; 
	END IF;
END$$

DELIMITER ;

-- 3. CREAMOS EL TRIGGER 'trigger_baja_jugador' --
DROP TRIGGER IF EXISTS trigger_baja_jugador;
DELIMITER $$
CREATE TRIGGER trigger_baja_jugador
AFTER DELETE ON jugadores
FOR EACH ROW
BEGIN
	-- MODIFICAMOS EL NÚMERO DE JUGADORES EN EL EQUIPO EN 'equipos' --
	UPDATE equipos SET numero_jugadores = (numero_jugadores - 1) WHERE nombre = old.nom_equipo;
	-- ACTUALIZAMOS TAMBIÉN EL NÚMERO DE JUGADORES EN 'totales_tabla' (Aunque podría hacerse con un trigger en 'totales_tabla') --
	UPDATE totales_tabla SET num_registros = (num_registros - 1) WHERE tabla = 'jugadores'; 
END$$

DELIMITER ;

-- 3. CREAMOS EL TRIGGER 'trigger_alta_equipo' --
DROP TRIGGER IF EXISTS trigger_alta_equipo;
DELIMITER $$
CREATE TRIGGER trigger_alta_equipo
AFTER INSERT ON equipos
FOR EACH ROW
BEGIN
	-- MODIFICAMOS EL NÚMERO DE EQUIPOS EN 'totales_tabla' --
	UPDATE totales_tabla SET num_registros = (num_registros + 1) WHERE tabla = 'equipos';
END$$

DELIMITER ;

-- 3. CREAMOS EL TRIGGER 'trigger_baja_equipo' --
DROP TRIGGER IF EXISTS trigger_baja_equipo;
DELIMITER $$
CREATE TRIGGER trigger_baja_equipo
AFTER DELETE ON equipos
FOR EACH ROW
BEGIN

/* TODO :
	-- EXTRA: HACEMOS QUE, SI LA LIGA HA EMPEZADO, ES DECIR, SI LA POSICIÓN NO ES 0, SE MODIFIQUEN LAS POSICIONES DEL RESTO DE EQUIPOS QUE FUERAN POR DETRÁS --
    IF (old.posicion_en_liga <> 0) 
    THEN -- SE RESTA UNA POSICIÓN A LOS EQUIPOS QUE FUERAN POR DETRÁS DEL BORRADO, ES DECIR, QUE ASCIENDEN UN PUESTO --
		UPDATE equipos SET posicion_en_liga = (posicion_en_liga - 1) WHERE posicion_en_liga > old.posicion_en_liga;
    END IF;
*/
    
    -- MODIFICAMOS EL NÚMERO DE EQUIPOS EN 'totales_tabla' --
	UPDATE totales_tabla SET num_registros = (num_registros - 1) WHERE tabla = 'equipos';
END$$
	
DELIMITER ;

-- 4. Insertamos los 6 registros en la tabla equipo --
INSERT INTO equipos VALUES ('Alcorcón', '2ª', '18', 0, 'Alejandro Tordable Hernández');
INSERT INTO equipos VALUES ('Real Madrid', '1ª', '1', 0, 'Alejandro Tordable Hernández');
INSERT INTO equipos VALUES ('Atlético de Madrid', '1ª', '4', 0, 'Alejandro Tordable Hernández');
INSERT INTO equipos VALUES ('Barcelona', '1ª', '2', 0, 'Alejandro Tordable Hernández');
INSERT INTO equipos VALUES ('Ourense', '3ª', '5', 0, 'Alejandro Tordable Hernández');
INSERT INTO equipos VALUES ('Bayern Munchen', '1ª', '3', 0, 'Alejandro Tordable Hernández');

-- 5. Insertamos los 6 registros en la tabla jugadores --
INSERT INTO jugadores VALUES ('22480212N', 'Nacho', 'Fariña', 25, 152, 50000, 'Ourense', 'Mario Galán González');
INSERT INTO jugadores VALUES ('59372815V', 'Robert', 'Lewandowski', 35, 300, 23000000, 'Barcelona', 'Mario Galán González');
INSERT INTO jugadores VALUES ('18633495F', 'Jan', 'Oblak', 31, 250, 20000000, 'Atlético de Madrid', 'Mario Galán González');
INSERT INTO jugadores VALUES ('49685325B', 'Antonio', 'Rüdiger', 31, 150, 15000000, 'Real Madrid', 'Mario Galán González');
INSERT INTO jugadores VALUES ('48625962E', 'Vinícius', 'Junior', 23, 200, 21000000, 'Real Madrid', 'Mario Galán González');
INSERT INTO jugadores VALUES ('14896214H', 'Thomas', 'Müller', 34, 250, 15000000, 'Bayern Munchen', 'Mario Galán González');

-- 6. Creamos la vista 'view_datos_equipos' --
DROP VIEW IF EXISTS view_datos_equipos;
CREATE VIEW view_datos_equipos AS
SELECT T1.apellidos, T1.nombre, T1.nif, T1.edad, T1.nom_equipo, T2.categoria, T2.posicion_en_liga
FROM jugadores T1
INNER JOIN equipos T2
ON T1.nom_equipo = T2.nombre
ORDER BY T1.apellidos, T1.nombre;

-- 7. Creamos la vista 'view_descuadre' --
DROP VIEW IF EXISTS view_descuadre;
CREATE VIEW view_descuadre AS
SELECT T1.nombre, T1.categoria, T1.posicion_en_liga, T1.numero_jugadores
FROM equipos T1
INNER JOIN jugadores T2 
ON T1.nombre = T2.nom_equipo
GROUP BY T1.nombre, T2.nom_equipo, T1.numero_jugadores
HAVING T1.numero_jugadores <> COUNT(T2.nom_equipo);
