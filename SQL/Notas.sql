--Notas sobre SQL

--inherits(tabla), permite la herencia a partir de una tabla dada, ejemplo:
--create table puesto(
--	posicion text
--)inherits (tabla);
--...........................................
--Funciones sobre tipos de datos en sql

--CHAR. Para almacenar cadenas de caracteres de longitud fija, ejemplo: genero(M/F) MAX:255
--VARCHAR. Para almacenar cadenas de caracteres de longitud variable, ejemplo: direccion MAX:65535
--INT. Valores enteros MAX:4294967295
--DECIMAL(size,d). Valores decimales MAX: 65(size) y 30(d)

--Funciones sobre tablas en sql

--CREATE. Cree un índice o tabla que aún no existe.
--ALTERModifique una tabla o columna existente.
--DROP. Eliminar una tabla, columna o restricción existente.
--ADD. Agregue una columna o una restricción a una tabla.
--COLUMN. Usar con AGREGAR, ALTER o DROP
--CONSTRAINT. Usar con AGREGAR, ALTER o DROP
--INDEX. Usar con CREAR
--TABLE. Usar con ALTER, CREATE o DROP