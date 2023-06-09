--Creacion de las tablas en SQL, basadas en el diagrama de clases

--Restriccion de caracteres:
--RFC: 13, Inicial vocal y consonante apell pat, inicial apell mat, fechaNac, homoclave 3 caracteres
--Telefono: 10 
--Direccion: Calle, numero, colonia, codigo postal ,estado, ciudad, pais
--Cedula prof: 13 caracteres
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
	Cat varchar(9) not null, --Categorias: pzgrande,pzachica,lowerbody,upperbody(Maximo 9 caracteres)
	Inf_cat varchar(5),		--lower body: Altura y upperbody: tipo(brazo, pecho,casco)
	Ancho decimal(4,2) not null,
	Alto decimal(4,2) not null,
	Largo decimal(4,2) not null,
	fk_fabricante char(13),
	--Llaves primarias
	constraint pk_piezas primary key (ID_pza),
	foreign key (fk_fabricante) references Fabricante(RFC)
		on update cascade
		on delete cascade
);
create table Armadura(
	No_serie serial not null,
	tipo_arm varchar(50)not null,
	cantidad int not null,
	--Llaves primarias
	constraint pk_armadura primary key (No_serie)
);
create table Distribuidor(
	Nom varchar(50) not null,
	RFC_distr char(13) not null,
	Tel bigint not null,
	Dir varchar(150) not null,
	fk_fabricante char(13),
	fk_armadura int,
	--Llaves primarias
	constraint pk_distribuidor primary key (RFC_distr),
	foreign key (fk_fabricante) references Fabricante(RFC)
		on update cascade
		on delete cascade
);
create table Ingeniero(
	ID_ing serial not null, 
	Nom varchar(50) not null,
	Ced char(13) not null,
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

--Tablas que se desprenden de una relacion entre 2 tablas 
create table venta_arm(
	id_venta serial,
	RFC_cliente char(13),
	No_serie_arm int,
	fecha_venta date,
	importe decimal(10,2),
	constraint pk_venta_arm primary key (id_venta),
	foreign key (RFC_cliente) references Cliente(RFC)
		on update cascade
		on delete cascade,
	foreign key (No_serie_arm) references Armadura(No_serie)
		on update cascade
		on delete cascade
);
create table Pie_Arm (
	--relacion
	ID_pza int,
	No_serie_arm int,
	CTP int,
	CP int,
	constraint fk_pzaarm_pza primary key (ID_pza,No_serie_arm),
	foreign key (ID_pza) references Piezas(ID_pza)
		on update cascade
		on delete cascade,
	constraint fk_pzaarm_arm
	foreign key (No_serie_arm) references Armadura(No_serie)
		on update cascade
		on delete cascade
); 
create table Arm_Ing (
	No_serie_arm int,
	ID_ing int,
	CAF int,

	constraint fk_arming_arm primary key (No_serie_arm, ID_ing),
	foreign key (No_serie_arm) references Armadura(No_serie)
		on update cascade
		on delete cascade,
	constraint fk_arming_ing
	foreign key (ID_ing) references Ingeniero(ID_ing)
		on update cascade
		on delete cascade
);
create table Dis_Arm (
	RFC_distr char(13),
	No_serie_arm int,
	ID_vta serial,
	F_Vta date,

	constraint fk_disarm_dis primary key (RFC_distr,No_serie_arm)
	foreign key (RFC_distr) references Distribuidor(RFC_distr)
		on update cascade
		on delete cascade,
	constraint fk_disarm_arm
	foreign key (No_serie_arm) references Armadura(No_serie)
		on update cascade
		on delete cascade
);
