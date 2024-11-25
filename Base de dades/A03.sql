-- Activitats de consultes de més d’una taula.
-- Emprant la BD ‘ucm’, escriu les consultes:
use ucm;
show tables;
-- 1. Llista el títol i de la pel·lícula i el nom del seu director. Ordena el 
-- resultat pel títol de la pel·lícula de forma ascendent. Fes que aparegui 
-- solament els 10 primers resultats.
select pelicules.titol, directors.nom from pelicules 
inner join directors on pelicules.codi = directors.codi
order by titol asc
limit 10;



-- 2. Llista el títol de la pel·lícula, el nom de l’actor i el paper que ha 
-- interpretat. Ordena el resultat pel títol de la pel·lícula de forma 
-- descendent i pel paper que ha interpretat de forma ascendent. Fes que apareguin els resultats 10 al 20.
SELECT pelicules.titol AS Títol_Pel·lícula, actors.nom AS Nom_Actor, actorspelicules.paper AS Paper
FROM pelicules
INNER JOIN actorspelicules ON pelicules.codi = actorspelicules.id_peli
INNER JOIN actors ON actorspelicules.id_actor = actors.codi
ORDER BY Títol_Pel·lícula DESC, Paper ASC
LIMIT 10 OFFSET 9;


-- 3. Llista el títol de la pel·lícula, el nom del soci d’aquells que ja han 
-- acabat de visualitzar la pel·lícula. Ordena el resultat.
select p.titol, s.nom from pelicules p 
inner join visualitzacions visu on visu.id_peli = p.codi
inner join socis s on visu.dni_soci = s.dni
WHERE visu.temps is NULL  
ORDER BY p.titol ASC;


-- 4. Llista el títol de la pel·lícula, el nom del soci i temps de visualització
--  d’aquells que no han acabat de visualitzar la pel·lícula. Ordena el resultat.
select p.titol, s.nom, visu.temps from pelicules p 
inner join visualitzacions visu on visu.id_peli = p.codi
inner join socis s on visu.dni_soci = s.dni
WHERE visu.temps > 0
ORDER BY visu.temps asc;

-- 5. Llista el títol de la pel·lícula, el nom del seu director i la 
-- nacionalitat del director. Fes que apareguin solament aquelles pel·lícules 
-- que tenen la mateixa nacionalitat que el seu director. Ordena el resultat pel títol de la pel·lícula de forma ascendent.
select peli.titol, dir.nom, dir.nacionalitat from pelicules peli
inner join directors dir on dir.codi = peli.codi
where peli.nacionalitat = dir.nacionalitat
order by peli.titol asc;

show tables;
select * from actors;
-- 6. Llista el nom dels actors que tenen la mateixa nacionalitat que ‘Benedict 
-- Cumberbatch’. Exclou a aquest actor del resultat.
select a.nom, a.nacionalitat from actors a 
inner join actors b on a.nacionalitat = b.nacionalitat
where b.nom = 'Benedict Cumberbatch' and a.nom != 'Benedict Cumberbatch';


-- 7. Llista el nom i nacionalitat dels actors (homes) que tenen una 
-- nacionalitat diferent que ‘Benedict Cumberbatch’. Ordena el resultat i canvia
--  el nom de les columnes.
select a.nom, a.nacionalitat, a.genere from actors a
inner join actors b on a.nacionalitat != b.nacionalitat
where b.nom = 'Benedict Cumberbatch' and a.genere = 'home'
order by a.nom asc;

-- 8. Llista el títol i pressupost d’aquelles pel·lícules que tenen un 
-- pressupost menor o igual que ‘Capitán América: Civil War’ i més gran o igual 
-- que ‘Black Panther’. Exclou aquestes dues pel·lícules del resultat.
select a.titol, a.pressupost from pelicules a
inner join pelicules b on a.pressupost <= b.pressupost
inner join pelicules c on a.pressupost >= c.pressupost
where b.titol = 'Capitán América: Civil War' and c.titol = 'Black Panther'
and a.titol not in ('Capitán América: Civil War', 'Black Panther') ;
select * from actorspelicules;

-- 9. Llista el títol de la pel·lícula, el nom de l’actriu i el paper que ha 
-- interpretat d’aquelles que tenen un paper principal.
SELECT p.titol, a.nom AS actriu, ap.paper
FROM pelicules p
INNER JOIN actorspelicules ap ON p.codi = ap.id_peli
INNER JOIN actors a ON ap.id_actor = a.codi
WHERE ap.principal = TRUE AND a.genere = 'dona'
ORDER BY p.titol ASC;



-- 10. Llista el nom de l’actor que ha interpretat alguna vegada a ‘Thor’. Fes 
-- que no es repeteixin els resultats.
SELECT DISTINCT a.nom AS actor
FROM actorspelicules ap
INNER JOIN actors a ON ap.id_actor = a.codi
WHERE ap.paper = 'Thor'
ORDER BY a.nom ASC;



-- 11. Llista el nom del director i el títol de la pel·lícula que ha dirigit. 
-- Inclou també aquells directors que no han dirigit cap pel·lícula.
SELECT d.nom AS director, p.titol AS pelicula
FROM directors d
LEFT JOIN pelicules p ON d.codi = p.id_director
ORDER BY d.nom ASC, p.titol ASC;



-- 12. Llista el nom dels socis que no han visualitzat cap pel·lícula de la 
-- productora ‘Paramount’.
SELECT s.nom AS soci
FROM socis s
LEFT JOIN visualitzacions v ON s.dni = v.dni_soci
LEFT JOIN pelicules p ON v.id_peli = p.codi
WHERE p.productora != 'Paramount' OR p.productora IS NULL
GROUP BY s.dni
HAVING COUNT(CASE WHEN p.productora = 'Paramount' THEN 1 ELSE NULL END) = 0
ORDER BY s.nom ASC;