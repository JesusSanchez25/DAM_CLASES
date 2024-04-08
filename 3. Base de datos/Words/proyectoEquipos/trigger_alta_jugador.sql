drop trigger if exists trigger_alta_jugador;
delimiter $$
create trigger trigger_alta_jugador
before insert on jugadores
for each row
begin
declare existe int;

-- Var1: Detecta si el equipo asignado al jugador existe en "equipos" (da 0 si no y 1 si existe)
set existe = (Select count(*) from equipos where nombre = new.nom_equipo);

if existe = 0 then -- SI NO EXISTE --
-- Se crea el equipo con el jugador insertado --
insert into equipos values (new.nom_equipo,"PREDETERMINADO",0, 1, 'Alejandro Tordable Hernandez');	

else -- SI EXISTE --
-- Se inserta el jugador y se actualizan los valores de equipos y totales tabla --
update equipos set numero_jugadores = (numero_jugadores +1) where nombre = new.nom_equipo;
update totales_tabla set num_registros = (num_registros +1) where tabla = 'jugadores';

end if; 

end $$

Delimiter ;

