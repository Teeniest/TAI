--Fabricante

--Orden para ingresar los datos
--RFC char(13) not null 
--Nom char not null,
--Dir char not null, Calle, numero, colonia, codigo postal ,estado, ciudad, pais
--Tel int not null,	


insert into Fabricante values ('VEVS980402DU8', 'Sandro Velasquez Vargas', 'Rio ipanema,Capistrano, #103,Chalco, 86115, Nuevo Laredo, Tamaulipas, Mexico', 7492050849);
insert into Fabricante values ('GUGA9405040WU', 'Alexandra Guillen Garcia', 'Sanchez Taboada, #504,Centro, 42933, San Luis Potosi, San Luis Potosi, Mexico', 6355734763);
insert into Fabricante values ('GAFL040805NA0', 'Luis Garcia Flores', 'Alvaro Obregon, #4,Roma, 56562,Boca del Rio, Veracruz, Mexico', 8584976800);
insert into Fabricante values ('GAAL791207S4I', 'Luis Roberto Garcia Aspe', 'Escuadron 201, #47,Lozano, 13567,Boca del Rio, Veracruz, Mexico', 5802576537);
insert into Fabricante values ('AAMC960210M7O', 'Carlos Andrade Mendoza', 'Zamora, #41,Hidalgo, 68706,Jesus Maria, Aguascalientes, Mexico', 9547919945);
insert into Fabricante values ('TOLG0002176RE', 'Gerardo Torrado Lopez', 'Xalapa, #105,Paseo troncoso, 28803,Irapuato, Guanajuato, Mexico', 5515756742);
insert into Fabricante values ('HOBJ200304ZI7', 'Jared Hoguera Borgetti', 'San Luis, #902,Juarez, 01524, Xalapa, Veracruz, Mexico', 0892455055);
insert into Fabricante values ('ROML671101J6U', 'Luis Antonio Rodriguez Martinez', 'Panamericana, #205,Gardenias, 67510,Zamora, Michoacan, Mexico', 6958053831);
insert into Fabricante values ('HETL850904XU7', 'Luis Roberto Hernandez Torres', 'Paseo de las flores, #12,Barrial, 25802, Guadalajara, Jalisco, Mexico', 9554214252);


--Piezas (id_pza, linea, color)
insert into Piezas values(57463,'001','Azul','pzaGrande',null,0.45,0.53,1.43);
insert into Piezas values(91274,'001','Rojo','pzaChica',null,0.34,0.32,0.25);
insert into Piezas values(12545,'002','Rojo','pzaGrande',null,0.64,0.54,0.64);
insert into Piezas values(08074,'002','Verde','pzaChica',null,0.15,0.85,1.43);
insert into Piezas values(97462,'003','Negro','pzaGrande',null,0.73,0.97,0.25);
insert into Piezas values(91674,'002','Naranja','pzaGrande',null,0.78,0.84,1.75);
insert into Piezas values(47174,'005','Amarillo','upperBody','casco',0.14,0.87,1.13);
insert into Piezas values(08457,'003','Rosa','lowerBody',0.35,0.76,0.42,1.74);
insert into Piezas values(97346,'004','Blanco','upperBody','brazo',0.96,0.51,0.64);
insert into Piezas values(97126,'001','Negro','pzaGrande',null,0.54,0.12,0.86);


--Distribuidor (Nombre, RFC, tel, Direccion)
insert into Distribuidor values ('Piezas Roco', 'FAYF6890728CH',4687649166, 'Calo, #57,Flores del valle, 17445, Tulum, Quintana Roo, Mexico');
insert into Distribuidor values ('Jaluwaqa', 'VAPS0564242KÑ',9854377004, 'Boca paila, #57,Flores del valle, 56747, Cuatitlan Izcalli, Ciudad de Mexico, Mexico');
insert into Distribuidor values ('Componenetes Wido', 'ZAWJ9261499CT',4796029869, 'Roca partida, #101,Juarez, 10860, Villa union, Durango, Mexico');
insert into Distribuidor values ('Nobaru electronics', 'TAZF3459021FQ',8865551473, 'Hacienda dos, #57,Periferico sur, 88714, San Cristobal de las casas, Chiapas, Mexico');
insert into Distribuidor values ('Xano', 'QAXK7724552JB',2316357953, 'Sierra vieja, #57,Parroquia, 09327, Benito Juarez, Ciudad de Mexico, Mexico');
insert into Distribuidor values ('PEZA', 'GIFT1902753YN',5397816071, 'Parque 4, #57,Fraccionamiento hacienda , 27245, San Francisco, Campeche, Mexico');
insert into Distribuidor values ('Nebowi', 'XOVL1451699KQ',7089911367, 'Lindavista, #57,Carguero 3, 86954, Zapotlanejo, Jalisco, Mexico');
insert into Distribuidor values ('QUEWO', 'MUQF1675506DC',7031633413, 'Cuenca dos, #57,Volcan, 77537, Puerto Vallarta, Jalisco, Mexico');
insert into Distribuidor values ('Vake', 'FUÑR1772079VJ',6128717766, 'Via libre, #57,Conejo, 24788, Playa del Carmen, Quintana Roo, Mexico');

--Ingeniero(nombre,No_cedula,Grado de estudios maximo, Tel)
insert into Ingeniero values (73613,'Rocío Blázquez Rincón', 'SANC5752983ZW','Licenciado',2331593253);
insert into Ingeniero values (13275,'Loreto Piquer Torrijos', 'SEMQ9650011HY','Licenciado',8764342621);
insert into Ingeniero values (00283,'Consuelo Pilar Heras Pinedo', 'GEFV2747869ÑH','Doctorado',5398052314);
insert into Ingeniero values (12890,'Selena de Murcia', 'TOCT5304972FX','Doctorado',1752516538);
insert into Ingeniero values (83614,'Abilio Prado Calderón', 'YUFC9051559BÑ','Magister',9121561066);
insert into Ingeniero values (94742,'Alejo Salvador Becerra', 'GIGM6454913GW','Licenciado',2441724673);
insert into Ingeniero values (01949,'Ramón Duran Riera', 'QARJ7700029GK','Licenciado',3801484212);
insert into Ingeniero values (97163,'Iris de Oliveras', 'JAFY2986221WJ','Doctorado',9732075274);
insert into Ingeniero values (09371,'Amparo Piña Noguera', 'ZEGN8724375ZC','Magister',4878562927);
insert into Ingeniero values (81462,'Estela Palomo Saldaña', 'VAJT3728428ZZ','Licenciado',5036003785);

--Cliente(RFC, nombre, Direccion, Tel)
insert into Cliente values ('HOMB7638996ÑÑ','Lara Beltran-Solé', 'Aquiles Serdan, #203,Baltazar, 72550, Puebla, Puebla, Mexico',0507668057);
insert into Cliente values ('RIFH5742707DN','Máximo Garzón Ferreras', 'Ruta matamoros, #7803,Mariano, 22206, Tijuana, Baja California, Mexico',0677554623);
insert into Cliente values ('LIZG7911705XS','Tere Salvà', 'Poniente, #2304, San Antonio, 75480, Tecamachalco, Puebla, Mexico',3812620856);
insert into Cliente values ('QIDJ0993026RD','Rosalinda Carrasco Osorio', 'Ingenieros militares, #36, Lomas de sotelo, 55908, Toluca, Estado de Mexico, Mexico',9986250893);
insert into Cliente values ('ÑOLV3170437KG','Encarnación Iborra Torrens', 'Juan Bautista, #75, Altamirano, 40660, Pungarabato, Guerrero, Mexico',3459124965);
insert into Cliente values ('DATD3914462BV','Celestina Vázquez-Llanos', 'Vicente Camacho, #3213, Chapalita, Guadalajara, Jalisco',8755532651);
insert into Cliente values ('PAXZ8223686XX','Rodrigo Pascual Recio', 'Paseo del hospicio, #22, San Juan, 44360, Guadalajara, Jalisco, Mexico',5394662050); 	
insert into Cliente values ('MEMW6359107MY','Edelmiro Toribio Gomez Ferreras', 'Guatemala, #3863, Juarez, 22145, Nuevo Laredo, Tamaulipas, Mexico',2207364124);
insert into Cliente values ('NIZR2306894CÑ','Emiliano Puig', 'Azueta, #1712, Centro, 82000, Mazatlan, Sinaloa, Mexico',2154867627);    
insert into Cliente values ('BIDF1545464YQ','Mercedes del Pizarro', 'Alacio Perez, #1004, Centro, 91700, Veracruz, Veracruz, Mexico',8103149467);    

--Armadura(serial, tipoarmadura, cantidad)
insert into armadura values (21438,'Iron man', 2);
insert into armadura values (28731,'Traje ikon', 1);
insert into armadura values (41255,'Traje cinetico', 4);
insert into armadura values (64562,'Cosmos carmesi', 0);
insert into armadura values (25414,'Batsuit furtivo', 0);
insert into armadura values (22314,'Iron spider', 1);
insert into armadura values (74742,'Rocket red', 2);
insert into armadura values (85856,'Hellbat', 3);
insert into armadura values (01933,'Doom', 1);
insert into armadura values (03984,'Justice Buster', 4);
    
--Relaciones

--Categoria(piezas)

insert into Arm_Ing(CAF) values(12);
insert into Arm_Ing(CAF) values(1);
insert into Arm_Ing(CAF) values(31);
insert into Arm_Ing(CAF) values(4);
insert into Arm_Ing(CAF) values(16);
insert into Arm_Ing(CAF) values(20);
insert into Arm_Ing(CAF) values(7);
insert into Arm_Ing(CAF) values(5);
insert into Arm_Ing(CAF) values(76);
insert into Arm_Ing(CAF) values(58);

insert into Pie_Arm(CTP,CP) values(17,41);
insert into Pie_Arm(CTP,CP) values(19,2);
insert into Pie_Arm(CTP,CP) values(22,7);
insert into Pie_Arm(CTP,CP) values(25,6);
insert into Pie_Arm(CTP,CP) values(4,4);
insert into Pie_Arm(CTP,CP) values(19,9);
insert into Pie_Arm(CTP,CP) values(6,3);
insert into Pie_Arm(CTP,CP) values(2,5);
insert into Pie_Arm(CTP,CP) values(12,14);
insert into Pie_Arm(CTP,CP) values(31,24);

insert into Dis_Arm (F_Vta)values('2021-07-17');
insert into Dis_Arm (F_Vta)values('2019-02-24');
insert into Dis_Arm (F_Vta)values('2022-11-23');
insert into Dis_Arm (F_Vta)values('2019-12-30');
insert into Dis_Arm (F_Vta)values('2023-07-15');
insert into Dis_Arm (F_Vta)values('2015-12-23');
insert into Dis_Arm (F_Vta)values('2017-12-29');
insert into Dis_Arm (F_Vta)values('2018-12-29');
insert into Dis_Arm (F_Vta)values('2023-01-29');
insert into Dis_Arm (F_Vta)values('2023-09-16');

insert into venta_arm(fecha_venta, importe)values('2021-12-25',1355043.54);
insert into venta_arm(fecha_venta, importe)values('2020-03-30',750000.00);
insert into venta_arm(fecha_venta, importe)values('2020-11-12',150000.00);
insert into venta_arm(fecha_venta, importe)values('2016-12-01',250000.00);
insert into venta_arm(fecha_venta, importe)values('2018-03-04',15000.00);
insert into venta_arm(fecha_venta, importe)values('2018-01-29',1355000.00);
insert into venta_arm(fecha_venta, importe)values('2023-12-24',156500.99);
insert into venta_arm(fecha_venta, importe)values('2023-11-30',876250.00);
insert into venta_arm(fecha_venta, importe)values('2022-06-12',1597000.50);


