-- Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman.
UPDATE personajes set aparicion = 1938 WHERE personaje ="Superman" and id_personaje= 12; 
-- Eliminar el registro que contiene al personaje Flash.
delete from personajes where personaje="Flash"and id_personaje= 10;
-- Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla
-- superhéroe. 
select  nombre_real from personajes;
-- Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre
-- empieza con “B”. 
select nombre_real from personajes
where nombre_real like 'B%';

-- Actividad 7
-- Pongamos a prueba esta nueva cláusula: order by. Seguiremos trabajando con la tabla
-- “superhéroe”. Realiza una consulta que devuelva todos los registros ordenados por “inteligencia”. 
use superheroes;
-- select * from personajes;
select * from personajes order by inteligencia desc;

-- group by
select personaje, inteligencia from personajes group by personaje, inteligencia;
select * from personajes;
