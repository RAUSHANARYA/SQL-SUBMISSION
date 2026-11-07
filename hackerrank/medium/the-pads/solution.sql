/*
Enter your query here.
*/

SELECT
    CASE OCCUPATION
        WHEN 'Doctor' THEN CONCAT(NAME, '(D)')
        WHEN 'Professor' THEN CONCAT(NAME, '(P)')
        WHEN 'Singer' THEN CONCAT(NAME, '(S)')
        ELSE CONCAT(NAME, '(A)')
    END
FROM OCCUPATIONS
ORDER BY NAME;

SELECT
    CONCAT('There are a total of ', COUNT(*), ' ',
           LOWER(OCCUPATION), 's.')
FROM OCCUPATIONS
GROUP BY OCCUPATION
ORDER BY COUNT(*), OCCUPATION;
