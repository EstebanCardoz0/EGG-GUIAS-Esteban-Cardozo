select nombre from producto;
select nombre, precio from producto;
select * from producto;
select nombre, round(precio) from producto;
select codigo_fabricante from producto;
select distinct codigo_fabricante from producto;
select nombre from fabricante order by nombre;
select (select nombre order by nombre), (select nombre order by precio asc) from producto;	
select nombre, precio from producto order by nombre asc, precio desc;
select * from fabricante limit 5;
select nombre, precio from producto order by precio  limit 1;
select nombre, precio from producto order by precio desc  limit 1;
select nombre from producto where precio <=120;
select * from producto where precio between 60 and 200;
select * from producto where codigo_fabricante in (1,3,5);
select * from producto where nombre like '%portatil%';
#CONSULTAS MULTITABLA
select producto.codigo, producto.nombre, fabricante.codigo, fabricante.nombre from producto, fabricante where producto.codigo_fabricante = fabricante.codigo;
select producto.nombre, precio, fabricante.nombre as 'nombre fabricante' from producto, fabricante where producto.codigo_fabricante = fabricante.codigo order by fabricante.nombre ;
select producto.nombre,precio, fabricante.nombre as 'nombre fabricante' from producto, fabricante 
where producto.codigo_fabricante = fabricante.codigo order by precio limit 1;
select * from producto, fabricante where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre='lenovo';
select * from producto, fabricante where producto.codigo_fabricante = fabricante.codigo and  fabricante.nombre='crucial' and producto.precio>200;
select * from producto, fabricante where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre in ('asus','hewlett-packard');
select producto.nombre, precio, fabricante.nombre as 'fabricante' from producto, fabricante
where producto.codigo_fabricante = fabricante.codigo and producto.precio>=180 order by producto.precio asc;
#CONSULTAS MULTITABLA LEFT RIGH JOIN
select *  from producto right join fabricante on producto.codigo_fabricante = fabricante.codigo;
select * from fabricante where not exists (select codigo_fabricante from producto 
where fabricante.codigo=producto.codigo_fabricante);
#SUBCONSULTAS WHERE
select * from fabricante f, producto p where f.nombre = 'Lenovo' and p.codigo_fabricante = f.codigo;
select * from producto where precio =(select p.precio from fabricante f, producto p 
where f.nombre = 'Lenovo' and p.codigo_fabricante = f.codigo order by p.precio desc limit 1); 
 select * from producto, fabricante where  producto.codigo_fabricante=fabricante.codigo
 and fabricante.nombre='lenovo' order by producto.precio desc limit 1;
  select * from producto, fabricante where  producto.codigo_fabricante=fabricante.codigo
and  fabricante.nombre='asus' and  precio>(select avg(precio) from producto
 where producto.codigo_fabricante=fabricante.codigo and fabricante.nombre='asus');
 #SUBCONSULTAS IN NOT IN
 select distinct fabricante.nombre from fabricante inner join producto ;
 select nombre from fabricante where codigo in (select distinct codigo_fabricante from producto);
 select nombre from fabricante where codigo not in(select distinct codigo_fabricante from producto);
 #SUBCONSULTAS HAVING
 select f.nombre from fabricante f, producto p where p.codigo_fabricante = f.codigo 
 group by p.codigo_fabricante having count(p.nombre) in (select count(p.nombre) 
 from producto p, fabricante f where f.nombre = 'Lenovo' and p.codigo_fabricante = f.codigo);