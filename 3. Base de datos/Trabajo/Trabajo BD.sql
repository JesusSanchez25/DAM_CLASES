				-- SCRIPT -- 

-- COMUNIDADES --
create table comunidades (
cod_comunidad varchar(2) primary key,
cod_provincia varchar(2) not null,
JSP varchar(60) not null);


-- PROVINCIAS -- 

create table provincias (
cod_provincia varchar(2) primary key,
nom_provincia varchar(45) not null,
cod_comunidad varchar(2) not null,
CONSTRAINT ca_cod_comunidad_01 
FOREIGN KEY (cod_comunidad) 
REFERENCES comunidades (cod_comunidad),
JSP varchar(60) not null);

-- VENDEDORES -- 

create table vendedores(
cod_vendedor int primary key,
nom_vendedor varchar(20) not null,
apellid_vendedor varchar(45) not null,
cod_provincia varchar(2) not null,
CONSTRAINT ca_cod_provincia_01 FOREIGN KEY (cod_provincia) REFERENCES provincias (cod_provincia),
JSP varchar(60) not null);



-- PRODUCTOS --

create table productos(
cod_producto int primary key,
cat_producto varchar(45) not null,
nom_producto varchar(45) not null,
stock CHAR(1) NOT NULL CHECK (UPPER(stock) IN ('S', 'N')),
precio double not null,
JSP varchar(60) not null);

-- VENTAS --

create table ventas(
cod_venta int primary key,
nom_vendedor varchar(20) not null,
apellid_vendedor varchar(45) not null,
cod_provincia varchar(2) not null,
CONSTRAINT ca_cod_provincia_01 FOREIGN KEY (cod_provincia) REFERENCES provincias (cod_provincia),
CONSTRAINT ca_cod_producto_01 FOREIGN KEY (cod_producto) REFERENCES productos (cod_producto),
JSP varchar(60) not null);

-- PRODUCTOS --
