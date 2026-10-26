/*
Enter your query here.
*/
SELECT
round(
   sqrt(POWER( (max(LAT_N)-min(LAT_N)),2) +
   POWER( (max(long_w)-min(long_w)),2))
   
 ,4) from station;
