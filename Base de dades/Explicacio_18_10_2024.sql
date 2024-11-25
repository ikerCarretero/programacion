-- Explicació 18/10/2024
-- use: seleccionar una BD
use empresa;

-- show tables: mostra totes les taules de la bd actual
show tables;

-- describe: mostra l'estructura d'una taula
describe empleats;

-- select * from [taula] mostra totes les dades de la taula
select * from empleats;

-- per llistar camps individuals els separem per coma ",". Podem renombrar la 
-- columna al llistat amb "as"
select nom, cognom, funcio as "Ofici" from empleats;


-- Podem aplicar formules als camps a llistar: concat uneix alfanumèrics
-- if permet mostrar una dada o un altre depenent d'una condició
select concat(cognom, ", ", nom) as "Nom complet" , sou, comisio, 
       sou+if(comisio is null,0,comisio) as "sou total"
from empleats
order by cognom, nom;

-- Podem ordenar dades amb order by. Ordena primer pel primer camp indicat i 
-- després pel segon. Desc ordena de forma descendent.
select concat(cognom, ", ", nom) as "Nom complet" , sou, comisio, 
       sou+if(comisio is null,0,comisio) as "sou total"
from empleats
order by sou desc;

-- distinct permet eliminar files duplicades.
select distinct funcio from empleats;

select distinct funcio, sou from empleats;

-- Limit permet limitar el nombre de resultats. 
-- limit [numero]: Limita a 'numero' resultats. 
-- Des de el primer llista 'numero' de resultats
-- limit [primer, numero]: Comença pel resultat primer + 1 i llista 'numero' de resultats
-- Per exemple: limit 10; mostra els 10 primers.
-- limit 4, 10; comença en el 5è resultat i mostra 10
select nom, cognom, sou, funcio
from empleats
order by cognom, nom
limit 4, 10;

-- Usem la BD ucm
use ucm;

-- curdate() torna la data actual. 
-- Les dates són el nombre de dies transcorreguts des de l'1/1/1900.
-- Per operar amb les dates millor treballar amb les funcions específiques
select nom, curdate()-data_naixement from actors;

-- timestampdiff torna el temps transcorregut entre una data i un altre. 
-- El primer argument representa la unitat de temps (second, minute, hour, year, month, ...)
select nom, timestampdiff(year, data_naixement, curdate()) from actors;