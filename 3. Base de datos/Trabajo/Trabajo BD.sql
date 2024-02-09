				-- SCRIPT -- 

-- CREACIÓN DE TABLAS -- 
-- COMUNIDADES --
create table comunidades (
cod_comunidad varchar(2) primary key,
nom_comunidad varchar(45) not null,
JSP varchar(60) not null);


-- PROVINCIAS -- 
-- Establece el código como clave primaria y la clave ajena de comunidades --
create table provincias (
cod_provincia varchar(2) primary key,
nom_provincia varchar(45) not null,
cod_comunidad varchar(2) not null,
CONSTRAINT ca_cod_comunidad_01 FOREIGN KEY (cod_comunidad) REFERENCES comunidades (cod_comunidad),
JSP varchar(60) not null);

-- VENDEDORES -- 
-- Establece el código como clave primaria y la clave ajena de provincia --
create table vendedores(
id_vendedor int primary key,
nom_vendedor varchar(20) not null,
apellid_vendedor varchar(45) not null,
cod_provincia varchar(2) not null,
CONSTRAINT ca_cod_provincia_01 FOREIGN KEY (cod_provincia) REFERENCES provincias (cod_provincia),
JSP varchar(60) not null);



-- PRODUCTOS --
-- Establece el código como clave y establece el filtro de stock para que solo se pueda meter S/N --
create table productos(
cod_producto int primary key,
cat_producto varchar(45) not null,
nom_producto varchar(45) not null,
stock CHAR(1) NOT NULL CHECK (UPPER(stock) IN ('S', 'N')),
precio double not null,
JSP varchar(60) not null);

-- VENTAS --
-- Establece la clave primaria como el conjunto de id_vendedor, cod_producto y fec_operación y las claves --
-- ajenas de vendedores y productos --
create table ventas(
id_vendedor int not null,
cod_producto int not null,
fec_operacion date not null,
unidades_vendidas int not null,
CONSTRAINT ca_id_vendedor_01 FOREIGN KEY (id_vendedor) REFERENCES vendedores (id_vendedor),
CONSTRAINT ca_cod_producto_01 FOREIGN KEY (cod_producto) REFERENCES productos (cod_producto),
primary key(id_vendedor,cod_producto,fec_operacion),
JSP varchar(60) not null);




-- INSERTS --
-- COMUNIDADES --
-- (primero insertamos comunidades para que establezca los códigos de comunidades, ya que si no no nos dejaría 
-- agregar las provincias) -- 
insert into comunidades values (01,'Andalucía','JESUS SANCHEZ PEDRAZA')
,(02,'Aragón','JESUS SANCHEZ PEDRAZA')
,(03,'Asturias','JESUS SANCHEZ PEDRAZA')
,(04,'Illes Balears','JESUS SANCHEZ PEDRAZA')
,(05,'Canarias','JESUS SANCHEZ PEDRAZA')
,(06,'Cantabria','JESUS SANCHEZ PEDRAZA')
,(07,'Castilla y León','JESUS SANCHEZ PEDRAZA')
,(08,'Castilla - La Mancha','JESUS SANCHEZ PEDRAZA')
,(09,'Cataluña','JESUS SANCHEZ PEDRAZA')
,(10,'Comunitat Valenciana','JESUS SANCHEZ PEDRAZA')
,(11,'Extremadura','JESUS SANCHEZ PEDRAZA')
,(12,'Galicia','JESUS SANCHEZ PEDRAZA')
,(13,'Comunidad de Madrid','JESUS SANCHEZ PEDRAZA')
,(14,'Región de Murcia','JESUS SANCHEZ PEDRAZA')
,(15,'Comunidad Foral de Navarra','JESUS SANCHEZ PEDRAZA')
,(16,'País Vasco','JESUS SANCHEZ PEDRAZA')
,(17,'Rioja, La','JESUS SANCHEZ PEDRAZA')
,(18,'Ceuta','JESUS SANCHEZ PEDRAZA')
,(19,'Melilla','JESUS SANCHEZ PEDRAZA');

-- PROVINCIAS --
insert into provincias values (01, 'Álava',16,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (02, 'Albacete',08,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (03, 'Alicante',10,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (04, 'Almería',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (05, 'Ávila',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (06, 'Badajoz',11,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (07, 'Islas Baleares',04,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (08, 'Barcelona',09,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (09, 'Burgos',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (10, 'Cáceres',11,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (11, 'Cádiz',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (12, 'Castellón',10,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (13, 'Ciudad Real',08,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (14, 'Córdoba',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (15, 'La Coruña',12,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (16, 'Cuenca',08,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (17, 'Gerona',09,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (18, 'Granada',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (19, 'Guadalajara','08','JESUS SANCHEZ PEDRAZA');
insert into provincias values (20, 'Guipúzcoa',16,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (21, 'Huelva',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (22, 'Huesca',02,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (23, 'Jaén',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (24, 'León',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (25, 'Lleida',09,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (26, 'La Rioja',17,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (27, 'Lugo',12,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (28, 'Madrid',13,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (29, 'Málaga',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (30, 'Murcia',14,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (31, 'Navarra',15,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (32, 'Orense',12,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (33, 'Asturias',03,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (34, 'Palencia',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (35, 'Las Palmas',05,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (36, 'Pontevedra','12','JESUS SANCHEZ PEDRAZA');
insert into provincias values (37, 'Salamanca',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (38, 'Santa Cruz de Tenerife',05,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (39, 'Cantabria','06','JESUS SANCHEZ PEDRAZA');
insert into provincias values (40, 'Segovia',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (41, 'Sevilla',01,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (42, 'Soria',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (43, 'Tarragona','09','JESUS SANCHEZ PEDRAZA');
insert into provincias values (44, 'Teruel',02,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (45, 'Toledo',08,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (46, 'Valencia',10,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (47, 'Valladolid','07','JESUS SANCHEZ PEDRAZA');
insert into provincias values (48, 'Vizcaya',16,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (49, 'Zamora',07,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (50, 'Zaragoza',02,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (51, 'Ceuta',18,'JESUS SANCHEZ PEDRAZA');
insert into provincias values (52, 'Melilla',19,'JESUS SANCHEZ PEDRAZA');

-- VENDEDORES -- 
insert into vendedores values (1, 'Juan','Martín González',01,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (2, 'Pedro','Gómez Solís',28,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (3, 'Ana','García González',09,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (4, 'Mariano','Martín Romero',28,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (5, 'Susana','López Sanz',09,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (6, 'Ignacio','Castejón García',28,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (7, 'Olga','Lorenzo Silva',09,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (8, 'Carlos','Sainz Torres',01,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (9, 'Felipe','Soler Cardoso',20,'JESUS SANCHEZ PEDRAZA');
insert into vendedores values (10, 'Lurdes','Montero Gómez',37,'JESUS SANCHEZ PEDRAZA');



-- PRODUCTOS --
insert into productos values (1, 'Mesa','Mesa de caoba 3x2','S',1000,'JESUS SANCHEZ PEDRAZA');
insert into productos values (2, 'Mesa','Mesa de hierro forjado','S',300,'JESUS SANCHEZ PEDRAZA');
insert into productos values (3, 'Silla','Silla para gamer F25','S',200,'JESUS SANCHEZ PEDRAZA');
insert into productos values (4, 'Silla','Silla de despacho, lacada en blanco','S',75,'JESUS SANCHEZ PEDRAZA');
insert into productos values (5, 'Silla','Silla de madera de roble','S',80,'JESUS SANCHEZ PEDRAZA');
insert into productos values (6, 'Estantería','Estante cristal 2x2','S',265,'JESUS SANCHEZ PEDRAZA');
insert into productos values (7, 'Estantería','Estante contrachapado M12','S',70,'JESUS SANCHEZ PEDRAZA');
insert into productos values (8, 'Pisapapeles','Cubo pisapapeles de cristal','S',18,'JESUS SANCHEZ PEDRAZA');
insert into productos values (9, 'Pisapapeles','Cubo pisapapeles de madera','N',12,'JESUS SANCHEZ PEDRAZA');
insert into productos values (10, 'Cajonera','Cajonera de roble, 4 cajones','S',125,'JESUS SANCHEZ PEDRAZA');


-- VENTAS --
insert into ventas values (1, 3,'2022-01-02',6,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (1, 1,'2022-01-04',1,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (4, 4,'2022-01-01',3,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (4, 6,'2022-01-01',2,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (5, 5,'2022-01-03',8,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (2, 2,'2022-01-04',1,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (3, 5,'2022-01-05',1,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (3, 7,'2022-01-05',4,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (4, 3,'2022-01-05',2,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (6, 8,'2022-01-05',7,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (6, 1,'2022-01-06',5,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (7, 9,'2022-01-07',3,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (8, 5,'2022-01-07',2,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (9, 6,'2022-01-08',1,'JESUS SANCHEZ PEDRAZA');
insert into ventas values (10, 10,'2022-01-09',2,'JESUS SANCHEZ PEDRAZA');

