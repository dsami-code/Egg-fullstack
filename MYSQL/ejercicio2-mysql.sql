-- A continuación, se deben realizar las siguientes consultas sobre la base de datos:
use tienda;

select * from fabricante;
-- 1. Lista el nombre de todos los productos que hay en la tabla producto.

select nombre from producto;
-- 2. Lista los nombres y los precios de todos los productos de la tabla producto. 
 select nombre, precio from producto;
-- 3. Lista todas las columnas de la tabla producto.
select * from producto;
-- 4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
select nombre, round(precio) as precio_entero from producto;
-- 5. Lista el código de los fabricantes que tienen productos en la tabla producto.
select f.codigo_fabricante, p.nombre, f.nombre from fabricante f inner join producto p  on f.codigo_fabricante = p.codigo_fabricante;  
-- 6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
select distinct f.codigo_fabricante from fabricante f inner join producto p  on f.codigo_fabricante = p.codigo_fabricante;  
select f.codigo_fabricante from fabricante f inner join producto p  on f.codigo_fabricante = p.codigo_fabricante group by f.codigo_fabricante; 
-- 7. Lista los nombres de los fabricantes ordenados de forma ascendente.
select nombre from fabricante order by nombre;
-- 8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
select * from producto order by nombre asc,precio desc;
-- select nombre from producto order by nombre;
-- 9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
select * from fabricante limit 5;
-- 10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select * from producto order by precio limit 1;
-- 11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
select * from producto order by precio desc limit 1;
-- 12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
select nombre from producto where precio<=120;
-- 13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
select * from producto where precio between 60 and 200;
-- 14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
select * from producto where codigo in (1,3,5);
-- 15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre. 
select nombre from producto where nombre like '%Portatil%';

-- Consultas Multitabla 
-- 1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
select p.codigo,p.nombre, f.codigo_fabricante,f.nombre  from fabricante f right join producto p on f.codigo_fabricante = p.codigo_fabricante;
-- 2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
-- orden alfabético.
select p.nombre, p.precio, f.nombre  from fabricante f right join producto p on f.codigo_fabricante = p.codigo_fabricante order by f.nombre;
-- 3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato. 
select p.nombre, p.precio, f.nombre  from fabricante f right join producto p on f.codigo_fabricante = p.codigo_fabricante order by p.precio limit 1;
-- 4. Devuelve una lista de todos los productos del fabricante Lenovo.
select *  from producto p left join fabricante f on f.codigo_fabricante = p.codigo_fabricante where f.nombre ="Lenovo";
-- 5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
select * from fabricante f right join producto p on  f.codigo_fabricante = p.codigo_fabricante where f.nombre="Crucial" and p.precio>200;
-- 6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.Utilizando el operador IN.
select *  from producto p left join fabricante f on f.codigo_fabricante = p.codigo_fabricante where f.nombre in ('Asus','Hewlett-Packard');
-- 7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente) 
select p.nombre, p.precio, f.nombre from fabricante f inner join producto p on f.codigo_fabricante = p.codigo_fabricante where p.precio >=180 order by p.precio desc, p.nombre asc;

-- Consultas Multitabla 
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- 1. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.
select f.codigo_fabricante, f.nombre, p.nombre, p.precio from fabricante f left join producto p on f.codigo_fabricante = p.codigo_fabricante;
-- 2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.
-- select * from fabricante f where not exists(select p.codigo_fabricante from producto p where p.codigo_fabricante=f.codigo_fabricante);
select f.codigo_fabricante, f.nombre from fabricante f right join producto p on f.codigo_fabricante <> p.codigo_fabricante;

-- Subconsultas (En la cláusula WHERE)
-- Con operadores básicos de comparación
-- 1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
-- select * from producto where nombre = (select nombre from fabricante where nombre like 'Lenovo');
select p.nombre,f.nombre from producto p, fabricante f where f.nombre="Lenovo" and f.codigo_fabricante = p.codigo_fabricante;
select * from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Lenovo");
-- 2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
select * from producto p where p.precio =(select max(p.precio) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Lenovo"));
-- 3. Lista el nombre del producto más caro del fabricante Lenovo.
select nombre from producto p where p.precio =(select max(p.precio) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Lenovo"));
-- 4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
select * from producto p where p.precio > (select avg(p.precio) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Asus")) and p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Asus");
select avg(p.precio) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Asus");

-- Subconsultas con IN y NOT IN
-- 1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
select f.nombre from fabricante f where f.codigo_fabricante in (select p.codigo_fabricante from producto p);
-- 2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
select f.nombre from fabricante f where f.codigo_fabricante not in (select p.codigo_fabricante from producto p);

-- Subconsultas (En la cláusula HAVING)
-- 1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo. 
select f.nombre from fabricante f where (select count(p.codigo_fabricante) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Lenovo"));
select count(p.codigo_fabricante) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Lenovo");
select f.nombre from fabricante f where f.codigo_fabricante in (select p.codigo_fabricante from producto p group by p.codigo_fabricante having count(p.codigo) = (select count(p.codigo_fabricante) from producto p where p.codigo_fabricante = (select f.codigo_fabricante from fabricante f where f.nombre="Lenovo")));



