-- Last updated: 8/11/2026, 6:36:19 PM
# Write your MySQL query statement below
select
(select distinct Salary 
from Employee order by salary desc 
limit 1 offset 1) 
as SecondHighestSalary;