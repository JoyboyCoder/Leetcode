# Write your MySQL query statement below
select e1.name as Customers 
from Customers e1 
left join Orders e2 
on e1.id = e2.customerId
where e2.id is null
