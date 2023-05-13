--Creacion de las tablas en SQL, basadas en el diagrama de clases

create table Fabricante(
	--Declaracion de columnas
	RFC char not null,
	Nom char not null,
	Dir char not null,
	Tel int not null
	--Llaves primarias
	constraint pk_fabricante primary key (RFC)
);
