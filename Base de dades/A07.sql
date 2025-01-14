-- Activitats de reforç de subconsultes.
	use meteo;
    show tables;
-- Emprant la BD ‘meteo’ que trobareu al Moodle, feu les següents consultes:
-- 1. Llista el nom de la comarca, la data, temperatura màxima i temperatura 
-- mínima d'aquelles prediccions del dia 01/08/2021 i que tenen una temperatura 
-- màxima superior a les temperatures màximes de les comarques Vallès Oriental i
--  Vallès Occidental.
select * from prediccio;

select c.nomComarca, p.data as "fecha"
from comarques c
where c.id in (select idComarca
			 from prediccio p
             where p.fecha  = "01/08/2021" );


-- 2. Llista el nom de la comarca, la data de predicció, la temperatura màxima i
--  la temperatura mínima per la data 01/01/2022 per aquelles comarques que 
-- tenen la mateixa predicció (símbol) de matí i de tarda que 'Vallès Oriental'.


-- 3. Llista el nom de la comarca, la data de predicció, la temperatura màxima i
--  la temperatura mínima per la data 01/01/2022 per aquelles comarques que 
-- tenen la mateixa predicció (símbol) de matí i de tarda que 'Vallès Oriental' 
-- i que la seva temperatura màxima és superior a la temperatura màxima  de 
-- Vallès Oriental.


-- 4. Llista la mitjana aritmètica de les temperatures màximes del mes de febrer
--  de 2022 conjuntament (en la mateixa filera) amb la mitjana aritmètica de les
--  temperatures mínimes del mateix més.


-- 5. Llista el nom de la comarca i temperatura màxima (màxima de les màximes) 
-- del mes de juliol de 2021 d'aquelles comarques que tenen una temperatura 
-- màxima (màxima de les màximes) inferior a la temperatura màxima del mes de 
-- juliol de 2021 de la comarca "L'Anoia".


-- 6. Llista el nom de la comarca i la mitjana aritmètica de les temperatures 
-- màximes del mes de juliol de 2021 d'aquelles comarques que tenen una mitjana 
-- de temperatures màximes inferior a la temperatura màxima del mes de juliol de
--  2021 de la comarca "L'Anoia".


-- 7. Llista el nom de la comarca, el número de mes i la temperatura mínima 
-- (mínima de les mínimes) d'aquell mes d'aquelles comarques que en el mateix 
-- mes hagin tingut una temperatura mínima inferior a la temperatura mínima de 
-- les comarques "L'Alt Empordà" i "El Baix Empordà".


       