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
	Dir varchar(150) not null,
	Tel bigint not null,
	--Llaves primarias
	constraint pk_fabricante primary key (RFC)
);
create table Piezas(
	ID_pza serial not null, 
	Lin int not null,	  --Se considera numerico de 3 caract
	Color varchar(20) not null,  --Nombre completo del color
	--Llaves primarias
	constraint pk_piezas primary key (ID_pza)
);
create table Armadura(
	No_serie serial not null,
	--Llaves primarias
	constraint pk_armadura primary key (No_serie)
);
create table Distribuidor(
	Nom varchar(50) not null,
	RFC_distr char(13) not null,
	Tel bigint not null,
	Dir varchar(150) not null,
	--Llaves primarias
	constraint pk_distribuidor primary key (RFC_distr)
);
create table Ingeniero(
	ID_ing serial not null, 
	Nom varchar(50) not null,
	Ced char(10) not null,
	GEM varchar(20) not null,	  --Nombre completo del grado
	Tel bigint not null,
	--Llaves primarias
	constraint pk_ingeniero primary key (ID_ing)
);
create table Cliente(
	RFC char(13) not null,
	Nom varchar(50) not null,
	Dir varchar(150) not null,
	Tel bigint not null,
	--Llaves primarias
	constraint pk_cliente primary key (RFC)
);

create table Categoria (
	ID_cat serial,	
	Nom varchar(9) check(Nom in ('pzgrande','pzachica','lowerbody','upperbody')),	    --Categorias: pzgrande,pzachica,lowerbody,upperbody(Maximo 9 caracteres)
	Info varchar(5)		--lower body: Altura y upperbody: tipo(brazo, pecho,casco)
) inherits(Piezas);
create table Dimensiones (
	Ancho decimal(4,4),
	Alto decimal(4,4),
	Largo decimal(4,4)
) inherits(Piezas);
--Tablas que se desprenden de una relacion entre 2 tablas 
create table Pie_Arm (
	CTP int,
	CP int
); 
create table Arm_Ing (
	CAF int
);
create table Dis_Arm (
	ID_vta serial,
	F_Vta date,
	constraint pk_Dis_Arm primary key (ID_vta)
);

