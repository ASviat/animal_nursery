drop table if exists young_animals;

create table young_animals
select animals_id,
personal_name,
commands,
date_of_birth,
CONCAT_WS('.',
    CAST(TIMESTAMPDIFF(YEAR, date_of_birth, CURDATE()) AS CHAR),
    CAST(TIMESTAMPDIFF(MONTH, date_of_birth, CURDATE()) MOD 12 AS CHAR)
) AS age
from horses_and_donkeys
having age > 1 and age < 3;
