SELECT * FROM personal.empleado;
select nombre,salario,comision,(salario+comision) from empleado where comision >1000;
select nombre,salario,comision,(salario+comision) from empleado where not comision;
select * from empleado where comision>salario;
select * from empleado where comision<=(salario*0.30);
select nombre from empleado where nombre not like '%ma%';
select max(salario) from empleado;
select max(nombre) from empleado;
select max(salario), min(salario),(max(salario)-min(salario)) from empleado;
select id_depto,avg(salario) from empleado group by id_depto;
select id_depto, count(nombre) from empleado group by id_depto having count(nombre)>3;
SELECT * FROM personal.empleado;
select  nombre, id_depto, cargo from empleado where cargo like 'jefe%';
select id_depto from empleado group by id_depto having count(id_depto)<0;
select * from empleado where salario >= (select avg(salario) from empleado) order by id_depto;

