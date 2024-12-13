-- Activitats de consultes condicions de grup.
-- Emprant la BD ‘ucm’, escriu les consultes:
use ucm;
-- 1. Mostra de cada productora quantes pel·lícules ha produït d’aquelles que 
-- han produït més de 3 pel·lícules.
select productora, count(*) from pelicules
group by productora
having count(*) >= 3;

select * from pelicules;
show tables;

-- 2. De cada productora suma les seves recaudacions i mostra solament aquelles 
-- que tenen una suma de recaudacions superior a 4000000000. Ordena el resultat 
-- i canvia el nom de les columnes que ho requereixin a un nom adient.
select productora, sum(recaudacio) from pelicules
group by productora
having sum(recaudacio) > 4000000000;

-- 3. Mostra el nom de l’actor, recaudació mínima, màxima i diferència de 
-- recaudacions d’aquells actors que han participat en més d’una pel·lícula i 
-- tenen la nacionalitat d’EEUU.

SELECT 
    a.nom AS nom_actor,
    MIN(p.recaudacio) AS recaudacio_minima,
    MAX(p.recaudacio) AS recaudacio_maxima,
    MAX(p.recaudacio) - MIN(p.recaudacio) AS diferencia_recaudacio
FROM actors a
INNER JOIN actorspelicules acp ON a.codi = acp.id_actor
INNER JOIN pelicules p ON acp.id_peli = p.codi
WHERE a.nacionalitat = 'EEUU'
GROUP BY a.nom
HAVING COUNT(p.codi) > 1;

-- 4. Mostra el nom dels clients i quantes pel·lícules han vist dels clients que
--  han visualitzat menys de 5 pel·lícules. Ordena el resultat de forma 
-- descendent pel nombre de pel·lícules.

select s.nom, count(p.titol) from socis s
inner join visualitzacions v on v.dni_soci = s.dni 
inner join pelicules p on v.id_peli = p.codi
group by s.nom
having count(p.titol) < 5
order by count(p.titol) desc;

-- Activitats de consultes condicions de grup.
-- Emprant la BD ‘ucm’, escriu les consultes:

USE ucm;

-- 1. Mostra de cada productora quantes pel·lícules ha produït d’aquelles que han produït més de 3 pel·lícules.
SELECT productora, COUNT(*) AS num_pellicules
FROM pelicules
GROUP BY productora
HAVING COUNT(*) > 3;

-- 2. De cada productora suma les seves recaudacions i mostra solament aquelles que tenen una suma de recaudacions superior a 4000000000. Ordena el resultat i canvia el nom de les columnes que ho requereixin a un nom adient.
SELECT productora, SUM(recaudacio) AS suma_recaudacions
FROM pelicules
GROUP BY productora
HAVING SUM(recaudacio) > 4000000000
ORDER BY suma_recaudacions DESC;

-- 3. Mostra el nom de l’actor, recaudació mínima, màxima i diferència de recaudacions d’aquells actors que han participat en més d’una pel·lícula i tenen la nacionalitat d’EEUU.
SELECT 
    a.nom AS nom_actor,
    MIN(p.recaudacio) AS recaudacio_minima,
    MAX(p.recaudacio) AS recaudacio_maxima,
    MAX(p.recaudacio) - MIN(p.recaudacio) AS diferencia_recaudacio
FROM actors a
INNER JOIN actorspelicules acp ON a.codi = acp.id_actor
INNER JOIN pelicules p ON acp.id_peli = p.codi
WHERE a.nacionalitat = 'EEUU'
GROUP BY a.nom
HAVING COUNT(p.codi) > 1;

-- 4. Mostra el nom dels clients i quantes pel·lícules han vist dels clients que han visualitzat menys de 5 pel·lícules. Ordena el resultat de forma descendent pel nombre de pel·lícules.
SELECT s.nom, COUNT(p.titol) AS num_pellicules
FROM socis s
INNER JOIN visualitzacions v ON v.dni_soci = s.dni 
INNER JOIN pelicules p ON v.id_peli = p.codi
GROUP BY s.nom
HAVING COUNT(p.titol) < 5
ORDER BY num_pellicules DESC;

-- 5. Mostra el nom de l’actor, suma de recaudacions de les pel·lícules en que han participat i la recaudació mínima de les pel·lícules en que ha participat d’aquells que tenen una suma de recaudacions entre 2000000000 i 6000000000. Exclou del resultat a ‘Jeremy Renner’. Ordena el resultat pel nom de l’actor i canvia el nom de la columna «suma de recaudacions» a un nom adient.
SELECT 
    a.nom AS nom_actor,
    SUM(p.recaudacio) AS suma_recaudacions,
    MIN(p.recaudacio) AS recaudacio_minima
FROM actors a
INNER JOIN actorspelicules acp ON a.codi = acp.id_actor
INNER JOIN pelicules p ON acp.id_peli = p.codi
WHERE a.nom != 'Jeremy Renner'
GROUP BY a.nom
HAVING suma_recaudacions BETWEEN 2000000000 AND 6000000000
ORDER BY nom_actor;

-- 6. Mostra el nom del director i nombre de pel·lícules que ha dirigit, d’aquells que han dirigit entre 2 i 4 pel·lícules. Exclou del resultat al director de ‘Iron Man’.
SELECT 
    d.nom AS nom_director,
    COUNT(p.codi) AS num_pellicules
FROM directors d
INNER JOIN pelicules p ON d.codi = p.id_director
WHERE d.nom != (SELECT d.nom FROM directors d INNER JOIN pelicules p ON d.codi = p.id_director WHERE p.titol = 'Iron Man')
GROUP BY d.nom
HAVING COUNT(p.codi) BETWEEN 2 AND 4;

-- 7. Mostra el nom del director i suma de les recaudacions de les seves pel·lícules d’aquells que han recaudat més de 1000000000. Exclou les pel·lícules que han recaudat menys de 10000000.
SELECT 
    d.nom AS nom_director,
    SUM(p.recaudacio) AS suma_recaudacions
FROM directors d
INNER JOIN pelicules p ON d.codi = p.id_director
WHERE p.recaudacio >= 10000000
GROUP BY d.nom
HAVING suma_recaudacions > 1000000000;

-- 8. Mostra el nom del director, nombre de pel·lícules que ha dirigit, suma de recaudacions de totes les seves pel·lícules i la recaudació mitjana de les recaudacions de les seves pel·lícules. Exclou aquells directors que han dirigit menys de 2 pel·lícules i al director «Joss Whedon».
SELECT 
    d.nom AS nom_director,
    COUNT(p.codi) AS num_pellicules,
    SUM(p.recaudacio) AS suma_recaudacions,
    AVG(p.recaudacio) AS recaudacio_mitjana
FROM directors d
INNER JOIN pelicules p ON d.codi = p.id_director
WHERE d.nom != 'Joss Whedon'
GROUP BY d.nom
HAVING COUNT(p.codi) >= 2;
