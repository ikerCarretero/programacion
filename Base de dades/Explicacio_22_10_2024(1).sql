-- Explicació 22/10/2024
-- Consultes amb restricció de fileres.
use empresa;
select * from empleats;

-- Llista les dades de l'empleat amb nom = Marta i cognom  = Garre
select *
from empleats
where nom= "Marta" and cognom = "Garre";

-- Llista les dades dels empleats amb funció "Informàtic"
select * 
from empleats
where funcio="Informàtic";

-- Llista el nom i cognoms de tots els informàtics
select nom, cognom
from empleats
where funcio="Informàtic";

-- Llista el nom, cognoms i funció de tots els informàtics i dels venedors.
select nom, cognom, funcio
from empleats
where funcio = "Informàtic" or funcio = "Venedor";

select nom, cognom, funcio
from empleats
where funcio in ("Informàtic", "Venedor");

-- Llista nom, cognom i sou dels empleats amb un sou que estigui entre
-- 1500 i 3000 (ambdos inclosos)
select nom, cognom, sou 
from empleats
where sou>=1500 and sou<=3000;

select nom, cognom, sou
from empleats
where sou between 1500 and 3000;


-- Llista el nom, cognom i sou dels empleats que cobren menys de 1500
-- i dels empleats que cobren més de 3000
select nom, cognom, sou
from empleats
where sou<1500 or sou>3000;

select nom, cognom, sou 
from empleats
where sou not between 1500 and 3000;


-- Llista el nom, cognom i funcio dels empleats que no són informàtics ni venedors.
select nom, cognom, funcio
from empleats
where funcio <> "Informàtic" and funcio <> "Venedor";

select nom, cognom, funcio
from empleats
where funcio not in ("Informàtic", "Venedor");


