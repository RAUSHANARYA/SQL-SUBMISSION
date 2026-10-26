SELECT
round(long_w , 4)from STATION 
where LAT_N = (SELECT max(lat_n) from station where lat_n<137.2345);
 
