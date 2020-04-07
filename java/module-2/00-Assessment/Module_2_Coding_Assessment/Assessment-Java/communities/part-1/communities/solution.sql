-- Select all the columns from communities from rows that are live
Select * FROM communities WHERE live = true;
-- Select the name and address from properties where the latitude is less than 0 and were created in the month of June 2019
Select name, address FROM properties Where latitude < 0 AND (created > '2019-06-01' AND created  < '2019-06-30');
-- Select the name, latitude, and longitude from communities ordered by the created date, oldest first
Select name, latitude, longitude FROM communities Order By created desc;
-- Select created and a count of all the properties created on each date
Select Count (created) FROM properties group by created;
-- Select a community's name and live status and the address of each property for every community created on or after Oct. 1st, 2019
Select communities.name, address, live from communities 
join properties  On communities.id = properties.id
Where properties.created >= '2019-10-01';