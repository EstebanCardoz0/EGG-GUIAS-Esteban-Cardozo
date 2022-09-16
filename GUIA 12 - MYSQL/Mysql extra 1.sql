select nombre from jugador order by nombre;
select nombre from jugador where posicion='c' and peso>200 order by nombre;
select nombre from equipo order by nombre;
select nombre from equipo where conferencia='east';
select * from equipo where ciudad like 'c%'order by nombre;
select nombre, nombre_equipo from jugador order by nombre_equipo;
select * from jugador where nombre_equipo='raptors';
select puntos_por_partido from estadistica where jugador=(select codigo from jugador where nombre='pau gasol');
select puntos_por_partido from estadistica where jugador=(select codigo from jugador where nombre='pau gasol')
and temporada='04/05';
select jugador.nombre, sum(estadistica.Puntos_por_partido) from jugador,estadistica where
jugador.codigo=estadistica.jugador group by estadistica.jugador;
select nombre_equipo, count(codigo) as 'cantidad de jugadores' from jugador group by nombre_equipo;
select jugador.nombre, sum(estadistica.Puntos_por_partido) as 'puntos en su carrera' from jugador,estadistica where
jugador.codigo=estadistica.jugador group by estadistica.jugador 
order by sum(estadistica.Puntos_por_partido) desc limit 1;
select jugador.nombre, altura, jugador.nombre_equipo, equipo.conferencia, equipo.division from jugador,equipo
where jugador.nombre_equipo=equipo.nombre and jugador.altura=(select max(altura) from jugador);
select avg(puntos) as 'promedio de puntos en division Pacífic'
from (select sum(puntos_local) as puntos
      from PARTIDO
      where equipo_local in (select nombre
                              from equipo
                              where lower(DIVISION) = 'pacific')
      union
      select sum(puntos_visitante) as puntos
      from PARTIDO
      where equipo_visitante in (select nombre
                              from equipo
                              where lower(DIVISION) = 'pacific')) t;
select temporada,equipo_local, puntos_local,puntos_visitante,equipo_visitante,  abs(puntos_local-puntos_visitante)
as 'diferencia de puntos' from partido where abs(puntos_local-puntos_visitante)= 
(select max(abs(puntos_local-puntos_visitante)) from partido);
select x.equipo, sum(x.puntos) as 'puntos totales' from
(select equipo_local as equipo, sum(puntos_local) as puntos from partido group by equipo_local
union all
select equipo_visitante as equipo, sum(puntos_visitante) as puntos 
from partido group by equipo_visitante) x
group by equipo;
select codigo, equipo_local,equipo_visitante,  equipo_local as 'ganador'
 from partido where puntos_local>puntos_visitante
 union all
select codigo, equipo_local,equipo_visitante,  equipo_visitante as 'ganador'
 from partido where puntos_local<puntos_visitante	
 union all
select codigo, equipo_local,equipo_visitante,  null as 'ganador'
 from partido where puntos_local=puntos_visitante;
 #ASI SE HACE MEJOR
 select codigo , equipo_local , equipo_visitante ,
 case when p.puntos_local > p.puntos_visitante then equipo_local
 when p.puntos_local < p.puntos_visitante then equipo_visitante
  else null end as equipo_ganador ,
 puntos_local , puntos_visitante
from partido p;
 







