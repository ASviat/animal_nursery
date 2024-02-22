drop table if exists all_tables_in_one;
create table all_tables_in_one
select 
name, 
personal_name,
commands,
date_of_birth
from camels
join pack_animals on id = animals_id

union 

select 
name, 
personal_name,
commands,
date_of_birth
from horses_and_donkeys
left join pack_animals on id = animals_id

union

select 
name, 
personal_name,
commands,
date_of_birth
from dogs
left join domestic_animals on id = animals_id

union

select 
name, 
personal_name,
commands,
date_of_birth
from cats
left join domestic_animals on id = animals_id

union

select 
name, 
personal_name,
commands,
date_of_birth
from hamsters
left join domestic_animals on id = animals_id;
