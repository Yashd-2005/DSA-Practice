# Write your MySQL query statement below
select e1.name
from Employee e
JOin Employee e1
on e.managerId=e1.id
group by e.managerId
having count(*)>=5;