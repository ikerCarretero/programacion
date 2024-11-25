-- Activitats de reforç. Selects amb restriccions
-- Emprant la BD municipis:
use municipis;
-- 1. Mostra totes les taules.
show tables;

-- 2. Descriu l’estructura de totes les taules.
describe ComunitatsAutonomes;
describe Poblacions;
describe Provincies;

-- 3. Llista el nom de la població, codi postal i número d’habitants de les 100 
-- primeres poblacions. Ordena el resultat pel nom de la població. Canvia el nom
--  de la població a un nom inteligible.
select nompoblacio as "Poblacio", codipostal, numhabitants from Poblacions
order by nompoblacio asc
limit 100;

-- 4. Llista el nom de la població i número d’habitants de les poblacions de la 
-- població 10 a la 19. Ordena el resultat pel número d’habitants de forma 
-- descendent.
select nompoblacio, numhabitants from Poblacions
order by numhabitants desc
limit 10 offset 9;

-- 5. Llista totes les dades de la població «La Seu d'Urgell».
select * from Poblacions
WHERE nompoblacio = 'La Seu d''Urgell';

-- 6. Llista totes les dades de les poblacions «Cubells», «Balaguer», «Cambrils»
--  i «Puçol».
select * from Poblacions
WHERE nompoblacio in ('Cubells', 'Balaguer', 'Cambrils');

-- 7. Llista el nom de la població i número d’habitants d’aquelles que tenen més
--  de 100000 habitants. Ordena el resultat de forma descendent pel número 
-- d’habitants i en cas de tenir el mateix número d’habitants de forma ascendent
--  pel nom de la població.
select nompoblacio, numhabitants from Poblacions
where numhabitants > 100000
order by numhabitants desc, nompoblacio asc;

-- 8. Llista el nom de la població número d’habitants d’aquelles que tenen entre
--  100000 i 200000 habitants (sense utilitzar between). Ordena el resultat de 
-- forma ascendent pel nom de la població. 
select nompoblacio, numhabitants from Poblacions
where numhabitants > 100000 and numhabitants < 200000
order by nompoblacio asc;

-- 9. Llista el nom de la població número d’habitants d’aquelles que tenen entre
--  100000 i 200000 habitants (utilitza between). Ordena el resultat de forma 
-- ascendent pel nom de la població. 
select nompoblacio, numhabitants from Poblacions
where numhabitants between 100000 and 200000
order by nompoblacio asc;

-- 10. Llista de forma concatenada «nom de població té numero d’habitants» de 
-- les poblacions de la provincia 33.
SELECT CONCAT(nompoblacio, ' te ', numhabitants, ' habitants') as descripcio FROM Poblacions;


-- 11. Llista el nom de població i codi postal d’aquelles poblacions que tenen 
-- un codi postal que comença per ‘08’ (utilitza like)
select nompoblacio, codipostal from Poblacions
where codipostal like '08%';

-- 12. Llista el nom de població i codi postal d’aquelles poblacions que tenen 
-- un codi postal que comença per ‘08’ o ‘01’ sense utilitzar like.
select nompoblacio, codipostal from Poblacions
WHERE (codipostal >= 08000 and codipostal <= 08999  )
or (codipostal >= 01000 and codipostal <= 01999  ) ;

-- 13. Llista el nom de la poblacio i codi postal de les poblacions que tenen 
-- els codis postals ‘08100’, ‘08120’ i ‘08150’ (utilitza in)
select nompoblacio, codipostal from Poblacions
where codipostal in ('08100' , '08120','08150');

-- 14. Llista el nom de la poblacio i codi postal de les poblacions que tenen 
-- els codis postals ‘08100’, ‘08120’ i ‘08150’ (sense utilitzar in)
select nompoblacio, codipostal from Poblacions
where codipostal = '08100' or codipostal ='08120' or codipostal ='08150';

-- 15. Llista el nom de les poblacions i codi postal de les poblacions que tenen
--  un codi postal entre 08000 i 08100 ambdos inclosos.
select nompoblacio, codipostal from Poblacions
where codipostal between 08000 and 08100;

-- 16. Llista el nom de les poblacions i número d’habitants d’aquelles 
-- poblacions que tenen més de 100000 habitants i el seu nom comença per ‘Ba’.
select nompoblacio, numhabitants from Poblacions
where numhabitants > 100000 and  nompoblacio like 'Ba%';

-- 17. Llista el nom de les poblacions, número d’habitants, superfície i 
-- densitat de població (número d’habitants / superfície) d’aquelles poblacions 
-- que tenen una densitat de població entre 10.0 i 50.0. Canvia el nom de les 
-- columnes a un nom adient i ordena el resultat per la densitat de població.
select nompoblacio, numhabitants, superficie, (numhabitants / superficie) as "densitat de població" from Poblacions
where "densitat de població" between 10.0 and 50.0
order by "densitat de població" desc;

-- 18. Llista el nom de les poblacions, número d’habitants i superfície de les 
-- poblacions amb una superfície més gran de 400 Km2 i les que tenen una 
-- superfície menor a 4km2.

SELECT nompoblacio, numhabitants, superficie FROM Poblacions
WHERE superficie > 400 OR superficie < 4;


-- 19. Llista el nom de les poblacions que pertanyen a la provincia 33 o 22 i 
-- que tenen una superfície entre 70.0 i 90.0 Km2.

SELECT nompoblacio FROM Poblacions
WHERE provincia IN (33, 22)
AND superficie BETWEEN 70.0 AND 90.0;


-- 20. Llista totes les dades de les poblacions que contenen el text ‘Bisbal’ en
--  el seu nom.

SELECT * FROM Poblacions
WHERE nompoblacio LIKE '%Bisbal%';

-- 21. Llista totes les dades de les poblacions que el seu nom acaba pel text 
-- ‘Urgell’.

SELECT * FROM Poblacions
WHERE nompoblacio LIKE '%Urgell';

-- 22. Llista totes les dades de les poblacions que estan ubicades entre les 
-- latituts 41.00 i 41.999 i les longituts 2.00 i 2.99.

SELECT * FROM Poblacions
WHERE latitud BETWEEN 41.00 AND 41.999
AND longitud BETWEEN 2.00 AND 2.99;


-- 23. Llista totes les dades de les poblacions que el seu nom comença per 
-- ‘Mont’ , el seu número d’habitants sigui superior a 15000 i la seva latitut 
-- estigui entre 41.00 i 41.99.

SELECT * FROM Poblacions
WHERE nompoblacio LIKE 'Mont%'
AND numhabitants > 15000
AND latitud BETWEEN 41.00 AND 41.99;

