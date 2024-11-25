-- Explicació joins 08/11/2024

use empresa;

-- Llista el nom dels departament i el nom de tots els seus empleats
select d.nom as "Departament", 
       e.nom as "Nom empleat", 
       e.cognom as "Cognoms empleat"
from departaments d inner join empleats e
  on e.ndepartament = d.codi
where d.nom = "Informàtica";

-- Llista el nom dels empleats conjuntament amb el nom del seu cap.
select concat(e.nom, " ",e.cognom) as "Empleat", 
       concat(c.nom, " ",e.cognom)  as "Cap"
from empleats e inner join empleats c 
  on e.cap = c.codi;

-- Llista el nom dels empleats conjuntament amb el nom del seu cap
-- inclosos aquells empleats que no tenen cap.
select concat(e.nom, " ",e.cognom) as "Empleat", 
       concat(c.nom, " ",e.cognom)  as "Cap"
from empleats e left join empleats c 
  on e.cap = c.codi;

