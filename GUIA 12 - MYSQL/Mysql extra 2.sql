select codigo_oficina, ciudad from oficina;
select ciudad, telefono from oficina where pais='españa';
select nombre,apellido1,apellido2, email from empleado where codigo_jefe=7;
select puesto,nombre,apellido1,apellido2, email from empleado where codigo_jefe is null;
select nombre,apellido1,apellido2, puesto from empleado where puesto !='representante ventas';
select nombre_cliente from cliente where pais='spain';
select distinct estado from pedido ;
select pago.codigo_cliente, nombre_cliente, fecha_pago from pago,cliente 
where pago.codigo_cliente=cliente.codigo_cliente and fecha_pago like '2008%';
#OTRA FORMA
select pago.codigo_cliente, nombre_cliente, fecha_pago from pago,cliente 
where pago.codigo_cliente=cliente.codigo_cliente and year(fecha_pago) = 2008;
select codigo_pedido,codigo_cliente, fecha_esperada,fecha_entrega from pedido 
where fecha_entrega>fecha_esperada;
select codigo_pedido, codigo_cliente, fecha_esperada,fecha_entrega from pedido
where datediff(fecha_esperada,fecha_entrega)>=2;
select * from pedido where estado='rechazado' and fecha_pedido like '2009%';
select * from pedido where fecha_entrega like '____-01-%' and estado='entregado';
select * from pago where year(fecha_pago)=2008 and forma_pago='paypal' order by fecha_pago;
select distinct forma_pago from pago;
select * from producto where gama='ornamentales' and cantidad_en_stock>100 order by precio_venta desc;
select * from cliente where ciudad='madrid' and  codigo_empleado_rep_ventas in (11,30);
#CONSULTAS MULTITABLA COMP INTERNA
select nombre_cliente, e.nombre as nombre_rep,e.apellido1 as apellido_rep,e.apellido2
as apellido2_rep from cliente c,empleado e where c.codigo_empleado_rep_ventas=e.codigo_empleado;
SELECT nombre_cliente, nombre as nombre_rep,apellido1 as apellido_rep from cliente c,empleado e,pago p where
c.codigo_cliente=p.codigo_cliente and c.codigo_empleado_rep_ventas=e.codigo_empleado;

SELECT nombre_cliente, nombre as nombre_rep,apellido1 as apellido_rep from cliente c,empleado e,pago p where
c.codigo_cliente=p.codigo_cliente and c.codigo_empleado_rep_ventas=e.codigo_empleado;
