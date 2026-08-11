-- Last updated: 8/11/2026, 6:36:23 PM
# Write your MySQL query statement below
SELECT p.firstName,
       p.lastName,
       a.city,
       a.state
FROM Person p
LEFT JOIN Address a
ON p.personId = a.personId;