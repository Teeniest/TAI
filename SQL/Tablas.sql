--Creacion de las tablas en SQL, basadas en el diagrama de clases

--Restriccion de caracteres:
--RFC: 13, Inicial vocal y consonante apell pat, inicial apell mat, fechaNac, homoclave 3 caracteres
--Telefono: 10 
--Direccion: Calle, numero, colonia, codigo postal ,estado, ciudad, pais
--Cedula prof: 10, 4 dígitos que identifican al profesional y 6 correspondientes al número de emisión asignado a la cédula.
create table Fabricante(
	--Declaracion de columnas
	RFC char(13) not null, 
	Nom varchar(50) not null,
	Dir varchar(50) not null,
	Tel bigint not null,
	--Llaves primarias
	constraint pk_fabricante primary key (RFC)
);
create table Piezas(
	ID_pza char not null,
	Lin char not null,
	Color char not null,
	--Llaves primarias
	constraint pk_piezas primary key (ID_pza)
);
create table Armadura(
	No_serie char not null,
	--Llaves primarias
	constraint pk_armadura primary key (No_serie)
);
create table Distribuidor(
	RFC_distr char not null,
	Tel int not null,
	Dir char not null,
	Nom char not null,
	--Llaves primarias
	constraint pk_distribuidor primary key (RFC_distr)
);
create table Ingeniero(
	ID_ing char not null,
	Ced char not null,
	GEM char not null,
	Nom char not null,
	Tel int not null,
	--Llaves primarias
	constraint pk_ingeniero primary key (ID_ing)
);
create table Cliente(
	RFC char not null,
	Dir char not null,
	Tel int not null,
	Nom char not null,
	--Llaves primarias
	constraint pk_cliente primary key (RFC)
);

create table Categoria (
	ID_cat char,
	Nom char,
	Info char
);
create table Dimensiones (
	ID_pza char,
	Ancho decimal,
	Alto decimal,
	Largo decimal
);
--Tablas que se desprenden de una relacion entre 2 tablas 
create table Pie_Arm (
	CTP int,
	CP int,
);
create table Arm_Ing (
	CAF int,
);
create table Dis_Arm (
	ID_vta char,
	F_Vta date,
	constraint pk_Dis_Arm primary key (ID_vta)
);

