# Write your MySQL query statement below

# Write your MySQL query statement below
select email 
from (select email,count(*) from person
group by email having count(*) > 1
) a