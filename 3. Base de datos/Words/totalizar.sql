-- Este trigger lo que hace es, en una tabla ya medio hecha, se quiere que al insertar un vendedor en "negocio" --
-- se controle el total de sus ventas en una clase "total_ventas" de ese mismo vendedor en la tabla de "control_ ventas" --
drop trigger if exists TR_TOTALIZAR;
delimiter $$
create trigger tr_totalizar
after insert on negocio
for each row
begin
declare var1 int;
declare var2 int;

-- Var1: Detecta si el vendedor insertado existe en "control_ventas" (da 0 si no y 1 si existe)
set var1 = (select count(*) from control_ventas_vendedores where id_ventas = new.id_ven); 

-- Var2: Como no podemos fiarnos que sea el primer registro con ese vendedor (debido a que el trigger se creó a posteriori)
-- cuenta todos los registros donde aparezca ese vendedor para asegurarse que tienes en cuenta todas su ventas
set var2 = (select count(*) from negocio where id_ventas=new.id_ven);

if var1 = 0 then -- SI NO EXISTE --
insert into control_ventas_vendedores values (new.id_ven, var2);

else  -- SI EXISTE --
-- No se pone var2 + 1 porque es una sentencia after y ya tiene en cuenta el nuevo insert --
update control_ventas_vendedores set total_ventas = var2 where id_ventas = new.id_ven;

end if;

end $$

