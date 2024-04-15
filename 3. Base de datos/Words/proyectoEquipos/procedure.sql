drop procedure if exists p1;
delimiter $$
create procedure p1()
begin
	declare var_cod varchar(2);
    declare var_nom varchar(45); 
     declare wFichero varchar(2000);
    declare wfinal boolean default false;
    
	declare c1 cursor for select cod_comunidad, nom_comunidad from comunidades;
	declare continue handler for not found set wfinal = true;
    
   
	set wFichero = 'ID  nombre';
	open c1;
bucle1:loop
	/*ESTAMOS GUARDANDO TODA LA TABLA DENTRO DE UNA VARIABLE LLAMADA WFICHERO*/
	fetch c1 into var_cod, var_nom;
    if wfinal = true then
		leave bucle1;
    end if;
    SET wFichero = concat(wfichero,'\r', var_Cod, '  ', var_nom);
    select var_cod as codigo, var_nom as nombre from comunidades where cod_comunidad = var_cod;
    
end loop bucle1;

	Select wfichero into outfile 'C:\Users\Usuario DAM1\Documents\DAM\3. Base de datos\Trabajo\ejemplo.txt' from comunidades limit 1;
close c1;

end $$