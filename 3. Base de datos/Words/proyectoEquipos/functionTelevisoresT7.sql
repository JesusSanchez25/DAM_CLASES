DROP FUNCTION IF EXISTS fmaximo;
delimiter $$
CREATE FUNCTION fmaximo(par_marca VARCHAR(30))
RETURNS DOUBLE DETERMINISTIC
/* DETERMINISTIC: si me pasas el mismo parámetro te devuelvo el mismo resultado
   NOT DETERMINISTIC: si me pasas el mismo parámetro a lo mejor te doy resultados diferentes (Un random por ejemplo)*/

BEGIN 
	DECLARE wpreciomax double;
	SELECT MAX(precio_unidad) 
    into wpreciomax /* IMPORTANTE: este INTO es la fomra de meter un selet en una VARIABLE */
    from televisores where marca = par_marca;

	return wpreciomax;
END$$