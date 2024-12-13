
-- Activitats de consultes agrupades.
-- Emprant la BD ‘ucm’, escriu les consultes:
use ucm;
-- 1. Les funcions de grup treballen amb molts registres per produir un únic 
-- resultat (cert / fals).
	
    -- Cert

-- 2. Les funcions de grup inclouen els valors nuls en els seus càlculs. (cert /
-- fals).

	-- Fals

-- 3. La clàusula WHERE elimina registres abans de la inclusió en un càlcul de 
-- grup. (cert / fals).

	-- Cert

-- 4. Fes una consulta que calculi:
--     • El nombre de pel·lícules.
--     • La suma de les recaudacions de totes les pel·lícules.
--     • La mitjana aritmètica de les recaudacions.
--     • La recaudació mínima.
--     • La recaudació màxima.

select count(*) as "Num empleats", sum(recaudacio), avg(recaudacio), min(recaudacio), max(recaudacio)
from pelicules;

-- 5. Llista agrupant pel nom dels directors i quantes pel·lícules ha dirigit. 
-- Ordena el resultat de forma descendent pel nombre de pel·lícules dirigides.
select d.nom, count(*) from directors d
inner join pelicules p on d.codi = p.id_director
group by d.nom;

select d.nom, count(*) 
from directors d
inner join pelicules p on d.codi = p.id_director
group by d.nom
order by count(*) desc, d.nom asc;
show tables;


-- 6. Llista agrupant pel títol de les pel·lícules i quantes visualitzacions ha 
-- tingut. Ordena el resultat de forma descendent pel nombre de visualitzacions.
select *
from pelicules p;
select p.titol, count(v.visualitzacions) from pelicules p
inner join visualitzacions v on p.codi = v.id_peli
group by p.titol;

select * from visualitzacions ;

-- 7. Llista la diferència entre la recaudació màxima i la mínima de les 
-- pel·lícules de ‘Marvel Enterprises’.
select max(p.recaudacio) - min(p.recaudacio) as "Diferència Recaudació"
from pelicules p
inner join productores prod on p.id_productora = prod.codi
where prod.nom = 'Marvel Enterprises';

-- 8. Llista de cada productora quantes pel·lícules hi ha a la BD. Etiqueta les 
-- columnes i ordena el resultat de forma descendent pel nombre de pel·lícules.
	select prod.nom as "Productora", count(*) as "Nombre de Pel·lícules"
from productores prod
inner join pelicules p on prod.codi = p.id_productora
group by prod.nom
order by count(*) desc;


-- 9. Crea una consulta que mostri el nom de l’actor i quantes pel·lícules ha 
-- fet com actor principal. Etiqueta les columnes correctament i ordena el 
-- resultat pel nombre de pel·lícules.
select a.nom as "Actor Principal", count(*) as "Nombre de Pel·lícules"
from actors a
inner join pelicules p on a.codi = p.id_actor_principal
group by a.nom
order by count(*) desc;


-- 10. Llista el nom de l’actor i suma de recaudacions de totes les pel·lícules 
-- en les que ha participat. Ordena el resultat per la suma de recaudacions de 
-- forma descendent.
select a.nom as "Actor", sum(p.recaudacio) as "Suma de Recaudacions"
from actors a
inner join pelicules_actors pa on a.codi = pa.id_actor
inner join pelicules p on pa.id_peli = p.codi
group by a.nom
order by sum(p.recaudacio) desc;


-- 11. Llista el nom de l’actor i la suma de guanys (recaudació – pressupost) de
--  totes les pel·lícules en les que ha participat. Ordena el resultat per la 
-- suma de recaudacions de forma descendent.
select a.nom as "Actor", sum(p.recaudacio - p.pressupost) as "Suma de Guanys"
from actors a
inner join pelicules_actors pa on a.codi = pa.id_actor
inner join pelicules p on pa.id_peli = p.codi
group by a.nom
order by sum(p.recaudacio - p.pressupost) desc;


-- 12. Llista de cada soci el seu nom i quantes pel·lícules ha visualitzat 
-- completament (temps de visualització null).
select s.nom as "Soci", count(*) as "Pel·lícules Visualitzades Completament"
from socis s
inner join visualitzacions v on s.codi = v.id_soci
where v.temps_visualitzacio is null
group by s.nom;


-- 13. Escriu una consulta que mostri el nom del director i la recaudació màxima
-- d’alguna de les seves pel·lícules que tenen una recaudació superior a 
-- 1000000000.
select d.nom as "Director", max(p.recaudacio) as "Recaudació Màxima"
from directors d
inner join pelicules p on d.codi = p.id_director
where p.recaudacio > 1000000000
group by d.nom;


-- 14. Crea una consulta que agrupi per l’any de les pel·lícules i mostri la 
-- suma de recaudació, la recaudació mínima, la màxima i la mitjana aritmètica 
-- de les recaudacions d’aquell any. Ordena el resultat per l’any.
select year(p.data_estrena) as "Any", 
       sum(p.recaudacio) as "Suma Recaudació", 
       min(p.recaudacio) as "Recaudació Mínima", 
       max(p.recaudacio) as "Recaudació Màxima", 
       avg(p.recaudacio) as "Mitjana Recaudació"
from pelicules p
group by year(p.data_estrena)
order by year(p.data_estrena);


-- 15. Crea una consulta que visualitzi el número total de pel·lícules entre els
--  anys 2015 i 2020 (ambdos inclosos) i d’aquest total el número dels que es 
-- van estrenar els anys 2015, 2016, 2017, 2018, 2019, 2020. Utilitza les 
-- funcions sum, if i year. Etiqueta les columnes.
-- Nota: el resultat a de ser semblant a:
-- Total Pel·lícules
-- 2015
-- 2016
-- 2017
-- 2018
-- 2019
-- 2020

select 
    count(*) as "Total Pel·lícules",
    sum(if(year(p.data_estrena) = 2015, 1, 0)) as "2015",
    sum(if(year(p.data_estrena) = 2016, 1, 0)) as "2016",
    sum(if(year(p.data_estrena) = 2017, 1, 0)) as "2017",
    sum(if(year(p.data_estrena) = 2018, 1, 0)) as "2018",
    sum(if(year(p.data_estrena) = 2019, 1, 0)) as "2019",
    sum(if(year(p.data_estrena) = 2020, 1, 0)) as "2020"
from pelicules p
where year(p.data_estrena) between 2015 and 2020;

