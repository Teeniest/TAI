--Notas sobre SQL

--inherits(tabla), permite la herencia a partir de una tabla dada, ejemplo:
--create table puesto(
--	posicion text
--)inherits (tabla);
--...........................................

--CHAR. Para almacenar cadenas de caracteres de longitud fija, ejemplo: genero(M/F) MAX:255
--VARCHAR. Para almacenar cadenas de caracteres de longitud variable, ejemplo: direccion MAX:65535
--INT. Valores enteros MAX:4294967295
--DECIMAL(size,d). Valores decimales MAX: 65(size) y 30(d)