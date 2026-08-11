-- Last updated: 8/11/2026, 6:36:02 PM
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;