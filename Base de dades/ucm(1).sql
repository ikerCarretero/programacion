drop database if exists ucm;
create database ucm;
use ucm;

create table directors (
   codi           smallint unsigned primary key,
   nom           varchar(30),
   nacionalitat     varchar(20)
);

insert into directors values (1, 'Sam Raimi', 'EEUU');
insert into directors values (2, 'Tim Story', 'EEUU');
insert into directors values (3, 'Kenneth Branagh', 'UK');
insert into directors values (4, 'Alan Taylor', 'UK');
insert into directors values (5, 'Taika Waititi', 'New Zealand');
insert into directors values (6, 'Jon Favreau', 'EEUU');
insert into directors values (7, 'Joss Whedon', 'EEUU');
insert into directors values (8, 'Jon Turteltaub', 'EEUU');
insert into directors values (9, 'Shane Black', 'EEUU');
insert into directors values (10, 'Joe Johnston', 'Australia');
insert into directors values (11, 'Anthony Russo, Joe Russo', 'EEUU');
insert into directors values (12, 'Ryan Coogler', 'EEUU');
insert into directors values (13, 'Scott Derrickson', 'EEUU');
insert into directors values (14, 'Anna Boden', 'EEUU');
insert into directors values (15, 'Louis Leterrier', 'France');
insert into directors values (16, 'James Gunn', 'EEUU');
insert into directors values (17, 'Peyton Reed', 'EEUU');
insert into directors values (18, 'Jon Watts', 'EEUU');
insert into directors values (19, 'Cate Shortland', 'Australia');
insert into directors values (20, 'Destin Cretton', 'EEUU');
insert into directors values (21, 'Chloé Zhao', 'Xina');


create table actors (
   codi           smallint unsigned primary key,
   nom           varchar(40),
   nacionalitat     varchar(20),
   data_naixement    date,
   genere             varchar(6)
);

insert into actors values(1, 'Tobey Maguire', 'EEUU', '1975-06-27', 'home');
insert into actors values(2, 'Kirsten Dunst', 'EEUU', '1982-04-30', 'dona');
insert into actors values(3, 'Willem Dafoe', 'EEUU', '1955-07-22', 'home');
insert into actors values(4, 'James Franco', 'EEUU', '1978-04-19', 'home');
insert into actors values(5, 'Alfred Molina', 'UK', '1953-05-24', 'home');
insert into actors values(6, 'Thomas Haden Church', 'EEUU', '1960-06-17', 'home');
insert into actors values(7, 'Jamie Foxx', 'EEUU', '1967-12-13', 'home');
insert into actors values(8, 'Jessica Alba', 'EEUU', '1981-04-28', 'dona');
insert into actors values(9, 'Ioan Gruffudd', 'UK', '1973-10-06', 'home');
insert into actors values(10, 'Robert Downey Jr.', 'EEUU', '1965-04-04', 'home');
insert into actors values(11, 'Gwyneth Paltrow', 'UK', '1972-09-27', 'dona');
insert into actors values(12, 'Chris Hemsworth', 'Australia', '1983-08-11', 'home');
insert into actors values(13, 'Mark Ruffalo', 'EEUU', '1967-11-22', 'home');
insert into actors values(14, 'Chris Evans', 'EEUU', '1981-06-13', 'home');
insert into actors values(15, 'Scarlett Johansson', 'EEUU', '1984-11-22', 'dona');
insert into actors values(16, 'Jeremy Renner', 'Francia', '1971-01-07', 'home');
insert into actors values(17, 'James Spader', 'UK', '1960-02-07', 'home');
insert into actors values(18, 'Michael Chiklis', 'EEUU', '1963-08-30', 'home');
insert into actors values(19, 'Hayley Atwell', 'UK', '1982-04-05', 'dona');
insert into actors values(20, 'Sebastian Stan', 'EEUU', '1982-08-13', 'home');
insert into actors values(21, 'Benedict Cumberbatch', 'UK', '1976-07-19', 'home');
insert into actors values(22, 'Chadwick Boseman', 'EEUU', '1977-11-29', 'home');
insert into actors values(23, 'Elizabeth Olsen', 'EEUU', '1989-02-16', 'dona');
insert into actors values(24, 'Bryce Dallas Howard', 'EEUU', '1981-03-02', 'dona');
insert into actors values(25, 'Topher Grace', 'EEUU', '1978-07-12', 'home');
insert into actors values(26, 'Natalie Portman', 'Israel', '1981-06-01', 'dona');
insert into actors values(27, 'Tom Hiddleston', 'UK', '1981-02-09', 'home');
insert into actors values(28, 'Anthony Hopkins', 'UK', '1937-12-31', 'home');
insert into actors values(29, 'Christopher Eccleston', 'UK', '1964-02-16', 'home');
insert into actors values(30, 'Cate Blanchett', 'Australia', '1969-05-14', 'dona');
insert into actors values(31, 'Jeff Goldblum', 'EEUU', '1952-10-02', 'home');
insert into actors values(32, 'Tessa Thompson', 'EEUU', '1983-10-03', 'dona');
insert into actors values(33, 'Chiwetel Ejiofor', 'UK', '1977-07-10', 'home');
insert into actors values(34, 'Benedict Wong', 'UK', '1970-07-10', 'home');
insert into actors values(35, 'Mads Mikkelsen', 'Denmark', '1965-11-22', 'home');
insert into actors values(36, 'Tilda Swinton', 'UK', '1960-11-05', 'dona');
insert into actors values(37, 'Rachel McAdams', 'Canada', '1978-11-17', 'dona');
insert into actors values(38, 'Brie Larson', 'EEUU', '1989-10-01', 'dona');
insert into actors values(39, 'Samuel L. Jackson', 'EEUU', '1948-12-21', 'home');
insert into actors values(40, 'Jude Law', 'UK', '1972-12-29', 'home');
insert into actors values(41, 'Annette Bening', 'EEUU', '1958-05-29', 'dona');
insert into actors values(42, 'Clark Gregg', 'EEUU', '1962-04-22', 'home');
insert into actors values(43, 'Lee Pace', 'EEUU', '1979-03-25', 'home');
insert into actors values(44, 'Edward Norton', 'EEUU', '1969-08-18', 'home');
insert into actors values(45, 'Tim Roth', 'UK', '1961-05-14', 'home');
insert into actors values(46, 'William Hurt', 'EEUU', '1950-03-22', 'home');
insert into actors values(47, 'Liv Tyler', 'EEUU', '1977-07-01', 'dona');
insert into actors values(48, 'Chris Pratt', 'EEUU', '1979-06-22', 'home');
insert into actors values(49, 'Zoe Saldana', 'EEUU', '1978-06-19', 'dona');
insert into actors values(50, 'Dave Bautista', 'EEUU', '1969-06-18', 'home');
insert into actors values(51, 'Vin Diesel', 'EEUU', '1967-07-18', 'home');
insert into actors values(52, 'Bradley Cooper', 'EEUU', '1975-01-05', 'home');
insert into actors values(53, 'Michael Rooker', 'EEUU', '1955-04-06', 'home');
insert into actors values(54, 'Karen Gillan', 'EEUU', '1987-11-28', 'dona');
insert into actors values(55, 'Pom Klementieff', 'Canada', '1986-05-03', 'dona');
insert into actors values(56, 'Kurt Russell', 'EEUU', '1951-03-17', 'home');
insert into actors values(57, 'Pom Klementieff', 'Canada', '1986-05-03', 'dona');
insert into actors values(58, 'Elizabeth Debicki', 'France', '1990-08-22', 'dona');
insert into actors values(59, 'Paul Rudd', 'EEUU', '1969-04-06', 'home');
insert into actors values(60, 'Michael Douglas', 'EEUU', '1944-09-25', 'home');
insert into actors values(61, 'Evangeline Lilly', 'Canada', '1979-08-03', 'dona');
insert into actors values(62, 'Corey Stoll', 'EEUU', '1976-03-14', 'home');
insert into actors values(63, 'Anthony Mackie', 'EEUU', '1978-09-23', 'home');
insert into actors values(64, 'Hannah John-Kamen', 'UK', '1989-09-07', 'dona');
insert into actors values(65, 'Michelle Pfeiffer', 'EEUU', '1958-04-29', 'dona');
insert into actors values(66, 'Michael Peña', 'EEUU', '1976-01-13', 'home');
insert into actors values(67, 'Julian McMahon', 'Australia', '1968-07-27', 'home');
insert into actors values(68, 'Doug Jones', 'EEUU', '1960-05-24', 'home');
insert into actors values(69, 'Terrence Howard', 'EEUU', '1969-03-11', 'home');
insert into actors values(70, 'Jeff Bridges', 'EEUU', '1949-12-04', 'home');
insert into actors values(71, 'Don Cheadle', 'EEUU', '1964-11-29', 'home');
insert into actors values(72, 'Mickey Rourke', 'EEUU', '1952-09-16', 'home');
insert into actors values(73, 'Guy Pearce', 'EEUU', '1967-10-05', 'home');
insert into actors values(74, 'Aaron Taylor-Johnson', 'UK', '1990-06-13', 'home');
insert into actors values(75, 'Paul Bettany', 'UK', '1971-05-27', 'home');
insert into actors values(76, 'Hugo Weaving', 'Nigeria', '1960-04-04', 'home');
insert into actors values(77, 'Emily VanCamp', 'Canada', '1986-05-12', 'dona');
insert into actors values(78, 'Michael B. Jordan', 'EEUU', '1987-02-09', 'home');
insert into actors values(79, 'Letitia Wright', 'Guyana', '1993-10-31', 'dona');
insert into actors values(80, 'Winston Duke', 'Trinidad and Tobago', '1986-11-09', 'home');
insert into actors values(81, 'Martin Freeman', 'UK', '1971-09-08', 'home');
insert into actors values(82, 'Tom Holland', 'UK', '1996-06-08', 'home');
insert into actors values(83, 'Michael Keaton', 'EEUU', '1951-09-05', 'home');
insert into actors values(84, 'Marisa Tomei', 'EEUU', '1964-12-04', 'dona');
insert into actors values(85, 'Jon Favreau', 'EEUU', '1966-10-19', 'home');
insert into actors values(86, 'Zendaya', 'EEUU', '1996-09-01', 'dona');
insert into actors values(87, 'Jacob Batalon', 'EEUU', '1996-10-09', 'home');
insert into actors values(88, 'Jake Gyllenhaal', 'EEUU', '1980-12-19', 'home');
insert into actors values(89, 'Josh Brolin', 'EEUU', '1969-02-12', 'home');
insert into actors values(90, 'Florence Pugh', 'UK', '1996-03-01', 'dona');
insert into actors values(91, 'David Harbour', 'EEUU', '1975-04-10', 'home');
insert into actors values(92, 'Rachel Weisz', 'UK', '1970-03-07', 'dona');
insert into actors values(93, 'Ray Winstone', 'UK', '1957-02-19', 'home');
insert into actors values(94, 'Simu Liu', 'China', '1989-04-19', 'home');
insert into actors values(95, 'Awkwafina', 'USA', '1988-06-02', 'dona');
insert into actors values(96, 'Tony Chiu-Wai Leung', 'Hong Kong', '1962-06-27', 'home');
insert into actors values(97, 'Meng''er Zhang', 'China', '1987-04-22', 'dona');
insert into actors values(98, 'Michelle Yeoh', 'Malaysia', '1962-08-06', 'dona');


create table pelicules (
   codi           smallint unsigned primary key,
   titol           varchar(50),
   nacionalitat     varchar(20),
   productora       varchar(25),
   anyestrena        smallint unsigned,
   id_director      smallint unsigned,
   recaudacio       bigint unsigned,
   pressupost       bigint unsigned,
   durada           time,
   constraint cs_peli_director foreign key (id_director) references directors(codi)
    on delete cascade
);

create table actorspelicules (
   id_peli          smallint unsigned,
   id_actor         smallint unsigned,
   paper            varchar(50),
   principal        boolean,
   constraint cp_actorspelicules primary key(id_peli, id_actor),
   constraint cs_peli_actorspelis foreign key (id_peli) references pelicules (codi)
     on delete cascade,
   constraint cs_actor_actorspelis foreign key (id_actor) references actors (codi)
     on delete cascade
);

insert into pelicules values(1, 'Spider-man', 'EEUU', 'Columbia Pictures', 2002, 1, 825025036, 139000000, '02:01');
insert into actorspelicules values 
(1, 1, 'Spider-Man / Peter Parker', true), 
(1, 2, 'Mary Jane Watson', true), 
(1, 3, 'Green Goblin / Norman Osborn', true), 
(1, 4, 'Harry Osborn', false);

insert into pelicules values(2, 'Spider-man 2', 'EEUU', 'Columbia Pictures', 2004, 1, 788976453, 200000000, '02:07'); 
insert into actorspelicules values 
(2, 1, 'Spider-Man / Peter Parker', true), 
(2, 2, 'Mary Jane Watson', true), 
(2, 3, 'Green Goblin / Norman Osborn', false), 
(2, 4, 'Harry Osborn', false),
(2, 5, 'Doc Ock / Dr. Otto Octavius', true);

insert into pelicules values(3, 'Spider-man 3', 'EEUU', 'Columbia Pictures', 2007, 1, 894983373, 258000000, '02:19'); 
insert into actorspelicules values 
(3, 1, 'Spider-Man / Peter Parker', true), 
(3, 2, 'Mary Jane Watson', true),  
(3, 4, 'New Goblin / Harry Osborn', true),
(3, 6, 'Sandman / Flint Marko', false),
(3, 25, 'Venom / Eddie Brock', false),
(3, 24, 'Gwen Stacy', false);

insert into pelicules values(4, 'Los 4 fantásticos', 'EEUU', 'Paramount', 2005, 2, 333535934, 100000000, '01:53');
insert into actorspelicules values 
(4, 8, 'Sue Storm', true),
(4, 9, 'Reed Richards', true),
(4, 14, 'Johny Storm', true),
(4, 18, 'Ben Grimm', true),
(4, 67, 'Victor Von Doom', true);


insert into pelicules values(5, 'Los 4 Fantásticos y Silver Surfer', 'EEUU', 'Paramount', 2007, 2, 301913131, 130000000, '01:32');
insert into actorspelicules values 
(5, 8, 'Sue Storm', true),
(5, 9, 'Reed Richards', true),
(5, 14, 'Johny Storm', true),
(5, 18, 'Ben Grimm', true),
(5, 68, 'The Silver Surfer', true),
(5, 67, 'Victor Von Doom', false);

insert into pelicules values(6, 'Iron Man', 'EEUU', 'Marvel Enterprises', 2008, 6, 585174222, 140000000, '01:46');
insert into actorspelicules values 
(6, 10, 'Tony Stark / Iron Man', true),
(6, 69, 'Rhodey', false),
(6, 70, 'Obadiah Stane', true),
(6, 42, 'Agent Coulson', false),
(6, 11, 'Pepper Potts', false);

insert into pelicules values(7, 'Iron Man 2', 'EEUU', 'Marvel Enterprises', 2010, 6, 623933331, 200000000, '01:44');
insert into actorspelicules values 
(7, 10, 'Tony Stark / Iron Man', true),
(7, 42, 'Agent Coulson', false),
(7, 15, 'Natalie Rushman / Natasha Romanoff', false),
(7, 71, 'Lt. Col. James ''Rhodey'' Rhodes', false),
(7, 72, 'Ivan Vanko', true),
(7, 39, 'Nick Fury', false),
(7, 11, 'Pepper Potts', false);


insert into pelicules values(12, 'Iron Man 3', 'EEUU', 'Marvel Enterprises', 2013, 9, 1215439994, 200000000, '01:46');
insert into actorspelicules values 
(12, 10, 'Tony Stark / Iron Man', true),
(12, 71, 'Lt. Col. James ''Rhodey'' Rhodes', false),
(12, 11, 'Pepper Potts', false),
(12, 73, 'Aldrich Killian', true);


insert into pelicules values(8, 'Los Vengadores', 'EEUU', 'Marvel Enterprises', 2012, 7, 1519557910, 220000000, '02:16');
insert into actorspelicules values 
(8, 10, 'Tony Stark / Iron Man', true), 
(8, 12, 'Thor', true), 
(8, 13, 'Bruce Banner / The Hulk', true), 
(8, 14, 'Steve Rogers / Captain America', true), 
(8, 15, 'Natasha Romanoff / Black Widow', true), 
(8, 16, 'Clint Barton / Hawkeye', true), 
(8, 11, 'Pepper Potts', false),
(8, 42, 'Agent Coulson', false),
(8, 39, 'Nick Fury', false),
(8, 27, 'Loki', true);

insert into pelicules values(9, 'Vengadores: La era de Ultron', 'EEUU', 'Marvel Enterprises', 2015, 7, 1405413868, 250000000, '02:15');
insert into actorspelicules values 
(9, 10, 'Tony Stark / Iron Man', true), 
(9, 12, 'Thor', true), 
(9, 13, 'Bruce Banner / The Hulk', true), 
(9, 14, 'Steve Rogers / Captain America', true), 
(9, 15, 'Natasha Romanoff / Black Widow', true), 
(9, 16, 'Clint Barton / Hawkeye', true), 
(9, 23, 'Wanda Maximoff / Scarlet Witch', true),
(9, 74, 'Pietro Maximoff / Quicksilver', false),
(9, 39, 'Nick Fury', false),
(9, 75, 'Jarvis / Vision', false),
(9, 11, 'Pepper Potts', false),
(9, 19, 'Peggy Carter', false),
(9, 71, 'James Rhodes / War Machine', false),
(9, 63, 'Sam Wilson / The Falcon', false),
(9, 17, 'Ultron', true);


insert into pelicules values(16, 'Vengadores: Infinity War', 'EEUU', 'Marvel Enterprises', 2018, 11, 2047675173, 321000000, '02:25');
insert into actorspelicules values 
(16, 14, 'Steve Rogers / Captain America', true),
(16, 20, 'Bucky Barnes / Winter Soldier', true),
(16, 63, 'Sam Wilson / The Falcon', true),
(16, 15, 'Natasha Romanoff / Black Widow', true),
(16, 10, 'Tony Stark / Iron Man', true), 
(16, 23, 'Wanda Maximoff / Scarlet Witch', false),
(16, 75, 'Vision', false),
(16, 71, 'James Rhodes / War Machine', false),
(16, 22, 'T''Challa / Black Panther', false),
(16, 12, 'Thor', true),
(16, 27, 'Loki', false),
(16, 48, 'Peter Quill', true),
(16, 49, 'Gamora', true),
(16, 50, 'Drax', true),
(16, 51, 'Groot', true),
(16, 52, 'Rocket', true),
(16, 54, 'Nebula', false),
(16, 57, 'Mantis', false),
(16, 21, 'Doctor Strange', true),
(16, 82, 'Peter Parker / Spider-Man', true),
(16, 89, 'Thanos', true);

insert into pelicules values(10, 'Thor', 'EEUU', 'Marvel Enterprises', 2011, 3, 449326618, 150000000, '01:55');
insert into actorspelicules values 
(10, 12, 'Thor', true), 
(10, 27, 'Loki', true),
(10, 26, 'Jane Foster', false),
(10, 28, 'Odin', false);

insert into pelicules values(11, 'Thor: el mundo oscuro', 'EEUU', 'Marvel Enterprises', 2013, 4, 644783140, 170000000, '01:52');
insert into actorspelicules values 
(11, 12, 'Thor', true), 
(11, 27, 'Loki', false),
(11, 26, 'Jane Foster', false),
(11, 28, 'Odin', false),
(11, 29, 'Malekith', true);

insert into pelicules values(13, 'Capitán América: El primer vengador', 'EEUU', 'Marvel Enterprises', 2011, 10, 370569774, 140000000, '01:46');
insert into actorspelicules values 
(13, 14, 'Steve Rogers / Captain America', true),
(13, 19, 'Peggy Carter', false), 
(13, 20, 'Bucky Barnes', false),
(13, 76, 'Johann Schmidt / Red Skull', true);

insert into pelicules values(14, 'Capitán América: El Soldado de Invierno', 'EEUU', 'Marvel Enterprises', 2014, 11, 714766572, 170000000, '02:10');
insert into actorspelicules values 
(14, 14, 'Steve Rogers / Captain America', true),
(14, 20, 'Bucky Barnes / Winter Soldier', true),
(14, 63, 'Sam Wilson / The Falcon', true),
(14, 15, 'Natasha Romanoff / Black Widow', true),
(14, 39, 'Nick Fury', false),
(14, 77, 'Kate / Agent 13', false);


insert into pelicules values(15, 'Capitán América: Civil War', 'EEUU', 'Marvel Enterprises', 2016, 11, 1153304495, 250000000, '02:10');
insert into actorspelicules values 
(15, 14, 'Steve Rogers / Captain America', true),
(15, 20, 'Bucky Barnes / Winter Soldier', true),
(15, 63, 'Sam Wilson / The Falcon', true),
(15, 15, 'Natasha Romanoff / Black Widow', true),
(15, 77, 'Kate / Agent 13', false),
(15, 10, 'Tony Stark / Iron Man', true), 
(15, 16, 'Clint Barton / Hawkeye', false), 
(15, 23, 'Wanda Maximoff / Scarlet Witch', false),
(15, 75, 'Jarvis / Vision', false),
(15, 71, 'James Rhodes / War Machine', false),
(15, 22, 'T''Challa / Black Panther', false),
(15, 81, 'Everett K. Ross', false),
(15, 46, 'Secretary of State Thaddeus Ross', false);

insert into pelicules values(18, 'Doctor Strange', 'EEUU', 'Marvel Enterprises', 2016, 13, 677796076, 165000000, '01:55');
insert into actorspelicules values 
(18, 21, 'Dr. Stephen Strange', true),
(18, 33, 'Mordo', true),
(18, 37, 'Dr. Christine Palmer', false),
(18, 34, 'Wong', false),
(18, 35, 'Kaecilius', true),
(18, 36, 'The Ancient One', true);


insert into pelicules values(17, 'Black Panther', 'EEUU', 'Marvel Enterprises', 2018, 12, 1347071259, 200000000, '02:14');
insert into actorspelicules values 
(17, 22, 'T''Challa / Black Panther', true),
(17, 78, 'Erik Killmonger', true),
(17, 79, 'Shuri', false),
(17, 80, 'M''Baku', false),
(17, 81, 'Everett K. Ross', false);


insert into pelicules values(19, 'Capitana Marvel', 'EEUU', 'Marvel Enterprises', 2019, 14, 1128462972, 160000000, '02:03');
insert into actorspelicules values 
(19, 42, 'Agent Coulson', false),
(19, 39, 'Nick Fury', false),
(19, 40, 'Yon-Rogg', true),
(19, 41, 'Supreme Intelligence / Dr. Wendy Lawson', false),
(19, 43, 'Ronan', false),
(19, 38, 'Carol Danvers / Vers / Captain Marvel', true);



insert into pelicules values(20, 'El incleible Hulk', 'EEUU', 'Marvel Enterprises', 2008, 15, 264770996, 150000000, '01:52');
insert into actorspelicules values 
(20, 44, 'Edward Norton', true),
(20, 47, 'Betty Ross', true),
(20, 45, 'Emil Blonsky', true),
(20, 46, 'General Ross', false);


insert into pelicules values(21, 'Guardianes de la galaxia', 'EEUU', 'Marvel Enterprises', 2014, 16, 773350128, 170000000, '02:01');
insert into actorspelicules values 
(21, 48, 'Peter Quill', true),
(21, 49, 'Gamora', true),
(21, 50, 'Drax', true),
(21, 51, 'Groot', true),
(21, 52, 'Rocket', true),
(21, 43, 'Ronan', true),
(21, 53, 'Yondu Udonta', false),
(21, 54, 'Nebula', false);


insert into pelicules values(22, 'Guardianes de la galaxia vol. 2', 'EEUU', 'Marvel Enterprises', 2017, 16, 863756051, 200000000, '02:16');
insert into actorspelicules values 
(22, 48, 'Peter Quill', true),
(22, 49, 'Gamora', true),
(22, 50, 'Drax', true),
(22, 51, 'Groot', true),
(22, 52, 'Rocket', true),
(22, 56, 'Ego', true),
(22, 53, 'Yondu Udonta', false),
(22, 54, 'Nebula', false),
(22, 57, 'Mantis', false),
(22, 58, 'Ayesha', false);

insert into pelicules values(23, 'Ant-man', 'EEUU', 'Marvel Enterprises', 2015, 17, 519311965, 130000000, '01:57');
insert into actorspelicules values 
(23, 59, 'Scott Lang / Ant-Man', true),
(23, 60, 'Dr. Hank Pym', true),
(23, 61, 'Hope van Dyne', false),
(23, 62, 'Darren Cross / Yellowjacket', true),
(23, 63, 'Sam Wilson / The Falcon', false),
(23, 66, 'Luis', false);


insert into pelicules values(24, 'Ant-man y la Avispa', 'EEUU', 'Marvel Enterprises', 2018, 17, 622674139, 162000000, '01:58');
insert into actorspelicules values 
(24, 59, 'Scott Lang / Ant-Man', true),
(24, 60, 'Dr. Hank Pym', true),
(24, 61, 'Hope Van Dyne / Wasp', false),
(24, 64, 'Ava / Ghost', true),
(24, 65, 'Janet Van Dyne / Wasp', false),
(24, 66, 'Luis', false);

insert into pelicules values(25, 'Spider-man: Homecoming', 'EEUU', 'Columbia Pictures', 2017, 18, 880166924, 175000000, '02:13');
insert into actorspelicules values 
(25, 82, 'Peter Parker / Spider-Man', true),
(25, 83, 'Adrian Toomes / Vulture', true),
(25, 84, 'May Parker', false),
(25, 85, 'Happy Hogan', false),
(25, 86, 'Michelle', false),
(25, 87, 'Ned', false),
(25, 10, 'Tony Stark / Iron Man', true);


insert into pelicules values(26, 'Thor: Ragnarok', 'EEUU', 'Marvel Enterprises', 2017, 5, 853983829, 180000000, '02:10');
insert into actorspelicules values 
(26, 12, 'Thor', true), 
(26, 27, 'Loki', false),
(26, 28, 'Odin', false),
(26, 13, 'Bruce Banner / The Hulk', true), 
(26, 30, 'Hela', true),
(26, 31, 'Grandmaster', false), 
(26, 32, 'Valkyrie', false),
(26, 21, 'Dr. Stephen Strange', false);

insert into pelicules values(27, 'Vengadores: Endgame', 'EEUU', 'Marvel Enterprises', 2019, 11, 2797800564, 356000000, '03:01');
insert into actorspelicules values 
(27, 14, 'Steve Rogers / Captain America', true),
(27, 15, 'Natasha Romanoff / Black Widow', true),
(27, 10, 'Tony Stark / Iron Man', true), 
(27, 23, 'Wanda Maximoff / Scarlet Witch', false),
(27, 71, 'James Rhodes / War Machine', false),
(27, 12, 'Thor', true),
(27, 52, 'Rocket', true),
(27, 54, 'Nebula', true),
(27, 21, 'Doctor Strange', false),
(27, 82, 'Peter Parker / Spider-Man', false),
(27, 59, 'Scott Lang / Ant-Man', true),
(27, 13, 'Bruce Banner / The Hulk', true),
(27, 89, 'Thanos', true);

insert into pelicules values(28, 'Spider-man: Lejos de casa', 'EEUU', 'Columbia Pictures', 2019, 18, 1131927996, 160000000, '02:09' );
insert into actorspelicules values 
(28, 82, 'Peter Parker / Spider-Man', true),
(28, 88, 'Quentin Beck / Mysterio', true),
(28, 84, 'May Parker', false),
(28, 85, 'Happy Hogan', false),
(28, 86, 'MJ', false),
(28, 87, 'Ned', false),
(28, 39, 'Nick Fury', false);

insert into pelicules values(29, 'Viuda Negra', 'EEUU','Marvel Enterprises', 2021, 19, 379631351, 200000000, '02:14');
insert into actorspelicules values 
(29, 15, 'Natasha Romanoff / Black Widow', true),
(29, 90, 'Yelena Belova / Black Widow 2', true),
(29, 91, 'Alexei', false),
(29, 92, 'Melina', false),
(29, 93, 'Dreykov', true);

insert into pelicules values(30, 'Shang-Chi y la leyenda de los diez anillos', 'EEUU','Marvel Enterprises', 2021, 20, 423604570, 200000000, '02:12');
insert into actorspelicules values 
(30, 94, 'Shaun, Shang-Chi', true),
(30, 95, 'Katy', true),
(30, 96, 'Xu Wenwu', true),
(30, 97, 'Xialing', false),
(30, 98, 'Ying Nan', false);

select * from pelicules;
insert into pelicules values(31, 'Eternals', 'EEUU','Marvel Enterprises', 2021, 21, 402064899, 236200000, '02:36');

insert into pelicules values(32, 'Spider-Man: No Way Home', Null, Null, 2021, 18, 1921847111, 200000000, '02:28');

insert into pelicules values(33, 'Doctor Strange in the Multiverse of Madness', 'EEUU', null, 2022, 1, 955775804, 200000000, '02:07');

insert into pelicules values(34, 'Thor: Love and Thunder', 'EEUU', null, 2022, 5, 760928081, 250000000, '01:59');

create table socis (
   dni              varchar(10) primary key,
   nom           varchar(30),
   direccio        varchar(50),
   telefon         varchar(10)
);


insert into socis values ('1111', 'Maria Moreno', 'C/sin nom, 5', '111111');
insert into socis values ('2222', 'Laura López', 'Av/Catalunya, 15', '222222');
insert into socis values ('3333', 'Sandra Sampedro', 'Pça/Central, 25', '333333');
insert into socis values ('4444', 'Ariadna Moreno', 'C/sin nom, 10', '444444');
insert into socis values ('5555', 'Laura Gil', 'Av/del park, 5', '555555');
insert into socis values ('6666', 'Marc Marquez', 'C/Central, 89', '66666');
insert into socis values ('7777', 'Carlos Cazalla', 'Pça/Sense nom, 4', '77777');
insert into socis values ('8888', 'Ferran Feliu', 'Av/del park, 14', '888888');


create table visualitzacions (
	id_peli        smallint unsigned,
	dni_soci       varchar(10),
	temps          time,
	constraint cp_visualitzacions primary key(id_peli, dni_soci),
	constraint cs_visualitzacions_peli foreign key (id_peli) references pelicules(codi),
	constraint cs_visualitzacions_soci foreign key (dni_soci) references socis(dni)
);

insert into visualitzacions values (16, '1111', '00:30');
insert into visualitzacions(id_peli,dni_soci) values (13, '1111');
insert into visualitzacions(id_peli,dni_soci) values (14, '1111');
insert into visualitzacions(id_peli,dni_soci) values (10, '1111');
insert into visualitzacions(id_peli,dni_soci) values (8, '1111');
insert into visualitzacions(id_peli,dni_soci) values (11, '1111');
insert into visualitzacions values (9, '1111', '01:20');
insert into visualitzacions(id_peli,dni_soci) values (13, '2222');
insert into visualitzacions(id_peli,dni_soci) values (5, '2222');
insert into visualitzacions values (4, '2222', '00:36');
insert into visualitzacions values (10, '2222', '00:44');
insert into visualitzacions(id_peli,dni_soci) values (9, '2222');
insert into visualitzacions values (3, '2222', '01:36');
insert into visualitzacions values (8, '2222', '00:54');
insert into visualitzacions(id_peli,dni_soci) values (14, '2222');
insert into visualitzacions(id_peli,dni_soci) values (17, '2222');
insert into visualitzacions values (11, '2222', '01:16');
insert into visualitzacions(id_peli,dni_soci) values (13, '3333');
insert into visualitzacions(id_peli,dni_soci) values (12, '3333');
insert into visualitzacions(id_peli,dni_soci) values (11, '3333');
insert into visualitzacions(id_peli,dni_soci) values (16, '3333');
insert into visualitzacions values (2, '3333', '00:20');
insert into visualitzacions(id_peli,dni_soci) values (7, '3333');
insert into visualitzacions(id_peli,dni_soci) values (15, '3333');
insert into visualitzacions values (1, '3333', '00:40');
insert into visualitzacions(id_peli,dni_soci) values (6, '3333');
insert into visualitzacions values (10, '4444', '01:10');
insert into visualitzacions(id_peli,dni_soci) values (12, '4444');
insert into visualitzacions values (8, '4444', '00:12');
insert into visualitzacions values (7, '4444', '00:45');
insert into visualitzacions values (14, '4444', '01:02');
insert into visualitzacions(id_peli,dni_soci) values (5, '4444');
insert into visualitzacions(id_peli,dni_soci) values (15, '4444');
insert into visualitzacions(id_peli,dni_soci) values (16, '4444');
insert into visualitzacions(id_peli,dni_soci) values (17, '4444');
insert into visualitzacions(id_peli,dni_soci) values (8, '5555');
insert into visualitzacions values (4, '5555', '01:15');
