/*
Enter your query here.
*/

-- SELECT min(lat_n) as a 
-- from STATION 
-- union
-- SELECT min(LONG_W) as b
-- from STATION 
-- union
-- SELECT max(lat_n) as c
-- from STATION 
-- union 
-- SELECT max(LONG_W) as d
-- from STATION 

SELECT round(
    abs(max(lat_n)-min(lat_n)) +
     abs(max(LONG_W)-min(LONG_W))
,4)
from station;
