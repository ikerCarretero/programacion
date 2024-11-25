-- 1. Accedeix a la BD.

use ucm;

-- 2. Llista les taules contingudes dins de la BD.

show tables;

-- 3. Descriu l’estructura de la taula ‘pelicules’.

describe pelicules;

-- 4. Mostra totes les pel·lícules.

select * from empleats;

-- 5. Mostra el títol i any de producció de totes les pel·lícules, renombrant les columnes.
SELECT titol AS "Títol", any_produccio AS "Any de Producció"
FROM pelicules;

-- 6. Mostra el títol, pressupost, recaptació i guany (recaptació – pressupost) de totes les pel·lícules,
-- renombrant les columnes i ordenant descendentment pel guany.
SELECT titol AS "Títol", pressupost AS "Pressupost", recaptacio AS "Recaptació",
       (recaudacio - pressupost) AS "Guany"
FROM pelicules
ORDER BY "Guany" DESC;

-- 7. Llista el nom de totes les productores de les pel·lícules sense duplicats, ordenat alfabèticament.
SELECT DISTINCT productora AS "Productora"
FROM pelicules
ORDER BY productora;

-- 8. Llista el títol i la durada de totes les pel·lícules ordenades descendentment per la durada;
-- en cas d'empat, ordenades pel títol.
SELECT titol AS "Títol", durada AS "Durada"
FROM pelicules
ORDER BY durada DESC, titol;

-- 9. Mostra el títol i la recaptació de les 10 primeres pel·lícules.
SELECT titol AS "Títol", recaptacio AS "Recaptació"
FROM pelicules
ORDER BY recaptacio DESC
LIMIT 10;

-- 10. Mostra el títol i recaptació de les pel·lícules de la 10 a la 15.
SELECT titol AS "Títol", recaptacio AS "Recaptació"
FROM pelicules
ORDER BY recaptacio DESC
LIMIT 9, 6;

-- 11. Llista de forma concatenada «títol de la pel·lícula es va estrenar fa xx anys»
-- on xx és l’any actual menys l’any d’estrena. Ordena de forma ascendent pels anys.
SELECT CONCAT(titol, ' es va estrenar fa ', TIMESTAMPDIFF(YEAR, any_produccio, CURDATE()), ' anys') AS "Estrena"
FROM pelicules
ORDER BY TIMESTAMPDIFF(YEAR, any_produccio, CURDATE()) ASC;

-- 12. Descriu l’estructura de la taula ‘actors’.
DESCRIBE actors;

-- 13. Llista tot el contingut de la taula actors.
SELECT * FROM actors;

-- 14. Llista totes les nacionalitats dels actors sense duplicats, ordenant el resultat.
SELECT DISTINCT nacionalitat AS "Nacionalitat"
FROM actors
ORDER BY nacionalitat;

-- 15. Consulta dels actors 7 al 14 de forma concatenada «nom de l'actor va néixer el data de naixement».
SELECT CONCAT(nom, ' va néixer el ', data_naixement) AS "Detall"
FROM actors
ORDER BY nom
LIMIT 6, 8;
