/*
Enter your query here.
*/ 
SELECT s.name
FROM Students s
INNER JOIN Friends f
    ON s.ID = f.ID
INNER JOIN Packages p1
    ON s.ID = p1.ID
INNER JOIN Packages p2
    ON f.Friend_ID = p2.ID
WHERE p2.salary > p1.salary
ORDER BY p2.salary ASC;
