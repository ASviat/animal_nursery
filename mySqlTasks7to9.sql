drop database if exists human_friends;
create database human_friends;
use human_friends;

drop table if exists Domestic_animals;
create table Domestic_animals
( 
id int primary key not null auto_increment, 
name varchar(40) not null 
);

insert into Domestic_animals(name) 
values 
('Dog'), 
('Cat'), 
('Hamster');

drop table if exists dogs;
create table dogs
(
animals_id int not null, 
personal_name varchar(40) not null,
commands varchar(40),
date_of_birth date not null, 
foreign key(animals_id) references domestic_animals(id) ON DELETE CASCADE
);
insert into dogs(animals_id, personal_name, commands, date_of_birth)
values
(1, 'Ursus','Ball', '2018-02-13'),
(1, 'Baks', 'Bark', '2008-03-05'),
(1, 'Felix', 'Die', '2012-06-20');

drop table if exists cats;
create table cats
(
animals_id int not null, 
personal_name varchar(40) not null,
commands varchar(40),
date_of_birth date not null, 
foreign key(animals_id) references domestic_animals(id) ON DELETE CASCADE
);
insert into cats(animals_id, personal_name, commands, date_of_birth)
values
(2, 'Cat','Ball', '2023-03-13'),
(2, 'Pizlord', 'Run', '2020-03-24'),
(2, 'Koolop', 'Jump', '2023-08-20');

drop table if exists hamsters;
create table hamsters
(
animals_id int not null, 
personal_name varchar(40) not null,
commands varchar(40),
date_of_birth date not null, 
foreign key(animals_id) references domestic_animals(id) ON DELETE CASCADE
);
insert into hamsters(animals_id, personal_name, commands, date_of_birth)
values
(3, 'Pod','Run', '2020-01-13'),
(3, 'Nooper', 'Jump', '2023-01-07'),
(3, 'Doomer', 'Jump', '2021-10-24');

drop table if exists pack_animals;
create table pack_animals(
id int primary key not null auto_increment, 
name varchar(40) not null 
);
insert into pack_animals (name) 
values 
('Camel'), 
('Horse'), 
('Donkey');


drop table if exists camels;
create table camels
(
animals_id int not null, 
personal_name varchar(40) not null,
commands varchar(40),
date_of_birth date not null, 
foreign key(animals_id) references pack_animals(id) ON DELETE CASCADE
);
insert into camels(animals_id, personal_name, commands, date_of_birth)
values
(1, 'Gogo','Jump', '2022-01-15'),
(1, 'Joput', 'Swim', '2023-05-20'),
(1, 'Kojol', 'Fly', '2020-08-13');

drop table if exists horses;
create table horses
(
animals_id int not null, 
personal_name varchar(40) not null,
commands varchar(40),
date_of_birth date not null, 
foreign key(animals_id) references pack_animals(id) ON DELETE CASCADE
);
insert into horses(animals_id, personal_name, commands, date_of_birth)
values
(2, 'Piuup','Die', '2022-11-17'),
(2, 'Shangrila', 'Forget', '2023-06-01'),
(2, 'Mojo', 'Run', '2021-07-13');

drop table if exists donkeys;
create table donkeys
(
animals_id int not null, 
personal_name varchar(40) not null,
commands varchar(40),
date_of_birth date not null, 
foreign key(animals_id) references pack_animals(id) ON DELETE CASCADE
);
insert into donkeys(animals_id, personal_name, commands, date_of_birth)
values
(3, 'Jolouag','Borrow', '2020-03-30'),
(3, 'Boojla', 'Forgive', '2023-01-01'),
(3, 'Looper', 'Jump', '2021-05-14');
