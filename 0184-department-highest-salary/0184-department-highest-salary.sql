# Write your MySQL query statement below
select d.name as Department , e.name as Employee ,e.salary as Salary 
from Employee e
INNER JOIN Department d on e.departmentID = d.id
where 
(e.DepartmentId,e.Salary)
 in (
    select 
    departmentId , Max(salary) from Employee 
Group by departmentId);