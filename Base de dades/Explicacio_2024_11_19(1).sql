-- Explicació de funcions de grup 19/11/2024

use empresa;

-- Llista quants empleats tenim a la BD.
select * from empleats;
select count(*) as "Número d'empleats"
from empleats;

-- Llista quants empleats cobren comisió 

select count(comisio) from empleats; -- Torna el nombre de registres que no tenen comisió nula

-- Llista la suma de sous dels empleats
select sum(sou) from empleats;

-- Llista la suma de sous + comisions dels empleats
select sum(sou)+sum(comisio) from empleats;

-- Llista el sou mínim dels empleats
select min(sou) from empleats;

-- Llista el sou màxim dels empleats
select max(sou) from empleats;

-- Llista la diferència de sous entre el màxim dels empleats i el mínim
select max(sou)-min(sou) from empleats;

-- Llista la mitjana aritmètica dels sous dels empleats
select avg(sou) from empleats;

-- Llista quants empleats tenim a la BD. La suma dels seus sous, el sou mínim, el sou màxim
-- la mitjana aritmètica dels sous i la diferència entre el sou màxim i el mínim
select count(*) as "Número empleats",
		sum(sou) as "Suma de sous",
        min(sou) as "Sou mínim",
        max(sou) as "Sou màxim",
        avg(sou) as "Mitjana de sous",
        max(sou)-min(sou) as "Diferència"
from empleats;

-- Llista la suma de sous dels empleats del departament 10
select sum(sou)
from empleats
where ndepartament=10;

-- Llista el número de departament i la suma de sous del departament. 
select ndepartament, sum(sou)
from empleats
group by ndepartament;

-- Llista el nom del departament i la suma de sous del departament
select dep.nom, sum(emp.sou)
from departaments dep inner join empleats emp 
  on dep.codi = emp.ndepartament
group by dep.nom;









