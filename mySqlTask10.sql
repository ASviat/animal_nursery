delete 
from pack_animals 
where name = 'Camel';

drop table if exists horses_and_donkeys;
create table horses_and_donkeys
select * from horses
union
select * from donkeys;
