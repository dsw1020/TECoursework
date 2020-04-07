--------------------------------------------------------------------------------------------------------
-- Ordering, Grouping Basic Functions Lecture Code
--------------------------------------------------------------------------------------------------------
--
-- ORDER BY -  Sequence of Rows in Result
--
--    ORDER BY          -- Ascending Sequence (low-high)
--    ORDER BY ASC      -- Ascending Sequence (low-high)
--    ORDER BY DESC     -- Descending Sequence (high-low)

-- Show Populations of all countries in acscending order
select name 
      ,population
  from country
 order by population
;
select name 
      ,population
  from country
 order by 2        -- You may specify the column number in select when you order by
;
select name 
      ,population / 2  -- derived columns have no names
  from country
 order by 2        -- You may specify the column number in select when you order by
;
select name 
      ,population / 2 as HalfPop -- derived columns have no names
  from country
 order by HalfPop      -- You may specify the as name in the order by
;
-- Show Populations of all countries in descending order
select name 
      ,population 
  from country
 order by population desc
;

-- Show  the names of countries and continents in ascending order
select continent, name
  from country
 order by continent desc, name 
;

--------------------------------------------------------------------------------------------------------
-- Limiting the number of rows in the result
--
-- LIMIT n   - Limit the number of rows in the result - always goes at thE end of the SELECT
--
--
-- Show the name and average life expectancy of the countries with the 10 highest life expectancies.
select name ,lifeexpectancy from country 
 where lifeexpectancy is not null
 order by lifeexpectancy desc
 limit 10                   -- limit the rows in the result - postgres specific option
 ;
select name ,lifeexpectancy from country 
 where lifeexpectancy is not null
 order by lifeexpectancy desc
 limit 10  offset 5          -- limit the rows in the result - postgres specific option
                             -- Offset skip the first n in the list
 ;
--------------------------------------------------------------------------------------------------------
-- Concatenating values 
--
-- the concat operator (||) may be used to concatenate character (string) values in a result
--

-- Show the name & state in the format: "city-name, state"
-- of all cities in California, Oregon, or Washington.
-- sorted by state then city
select name || ', ' || district as city_state -- contcatenate strings using ||
 from city
where district in('California', 'Oregon', 'Washington')
order by district, city
;

select name || ', ' || district as city_state -- contcatenate strings using ||
 from city
where district = 'California'
   or district = 'Oregon'
   or district = 'Washington'
order by district, city
;
--------------------------------------------------------------------------------------------------------
-- Aggregate functions - produce one row in result for each group specified
--
-- The group used by the aggregate functions is determined by the GROUP BY clause
-- if no GROUP BY clause is specified, the group is the set of rows in the result
--
--     AVG(column-expression)   - arithmentic average for group of non-NULL values in expression 
--     SUM(column-expression)   - arithmentic sum for group of a non-NULL values in expression 
--     MIN(column-expression)   - lowest value for group of non-NULL values in expression 
--     MAX(column-expression)   - highest value for group of non-NULL values in expression 
--     COUNT(*)                 - number of rows in the group
--     COUNT(column-expression) - number of rows for the group of non-NULL values in expression 
--
--
-- AVG(), SUM() may only be used with numeric data types
-- MIN(), MAX() may be used with numeric, character, date, time datatypes
--
-- COUNT() is applied to rows (not columns)
--
--
-- Show average life expectancy in the world
select lifeexpectancy    -- one row in result for each row that satisfies where clause
from country
;

select avg(lifeexpectancy)    -- one row in result for group specified - if no group - one row for the entire table
from country
;

-- show the average life expectancy for each continent

select avg(lifeexpectancy)    -- one row in result for group specified - if no group - one row for the entire table
from country
group by continent            -- specify the group for the group by
;

select continent, avg(lifeexpectancy) as avg_lifespan   -- one row in result for group specified - column in group by may be included on select
from country
group by continent  
--order by avg(lifeexpectancy)
order by avg_lifespan
--order by 2
;
-- Show the total population in Ohio
select sum(population) as Number_Of_Ohioans
  from city
 where district = 'Ohio'
;
-- Show the surface area of the smallest country in the world
select name, min(surfacearea) -- if an aggregate function is used on select only other aggregate functions or columns in group by are allowed
  from country
group by name  -- required because we want the name in the results
order by 2 asc
limit 1
;
-- Show The 10 largest countries (by surface area) in the world
select name, max(surfacearea) -- if an aggregate function is used on select only other aggregate functions or columns in group by are allowed
  from country
group by name     -- required because we want the name in the results
order by 2 desc   -- order by column #2 in the select
limit 10
;
-- Show the number of countries who declared independence in 1991
select count(gnp) -- any column can be used - because it's ignored - counting rows in the table that match where clause
      --count(*)  -- count all rows
  from country
 where indepyear = 1991
;
--------------------------------------------------------------------------------------------------------
-- GROUP BY  - Specify the group to which the aggregate functions apply
--
--      GROUP BY column-expression
--
-- When using a GROUP BY the SELECT is limited ot aggreggate functions or columns in the GROUP BY
--
--

-- Show the number of countries where each language is spoken, order show them from most countries to least
select language, count(*) as language_count
  from countrylanguage
 group by language
 order by language_count desc
;

-- Show the average life expectancy of each continent ordered from highest to lowest
select continent, avg(lifeexpectancy) as lifespan
  from country
 group by continent 
 order by lifespan desc
;
-- Exclude Antarctica from consideration for average life expectancy
select continent, avg(lifeexpectancy) as lifespan
  from country
 where lifeexpectancy is not null 
 group by continent 
 order by lifespan desc
;


-- What is the sum of the population of cities in each state in the USA ordered by state name
select district, sum(population)
  from city
  where countrycode = 'USA'
 group by district
 order by district
;

-- What is the average population of cities in each state in the USA ordered by state name
select district, avg(population)
  from city
  where countrycode = 'USA'
 group by district
 order by district
;

-- What is the average population of cities in each state in the Brazil ordered by state name
select district, avg(population)
  from city
  where countrycode = (select code from country where name = 'Canada') -- Subquery - look up data from one table
 group by district                                                     --            to satisfy the where in a select
 order by district
;
--
-- find the country code for china

select code from country where name = 'China';


--------------------------------------------------------------------------------------------------------
-- SUBQUERIES - Using the result from one query (inner query) in another query (outer query)
--
-- Frequently used in a WHERE clause with an IN predicate:
--
--       WHERE column-name IN (SELECT column-name FROM some-table WHERE some-predicate)
--
--
--  Use the IN rather than = with subquery in case it returns multiple values = only handles a single value
--  IN always works - = only workes if exactly one value is returns from subquery

-- Any WHERE predicate may be used to connect the subquery in a WHERE clause, but you must
-- be sure a single value is returned from the subquery. 
--
-- Subqueries may also be used in a SELECT as a column-specification or a FROM as a table
-- (These are advanced concepts we will discuss later, if there is time)
--

-- What is the average population of cities in each state in the Brazil ordered by state name
select countrycode, district, avg(population)
  from city
  where countrycode in (select code from country where name like '%stan') -- Subquery - look up data from one table
 group by countrycode, district                                           --            to satisfy the where in a select
 order by countrycode, district
;
--
-- find the country code for china

select code from country where name = 'China';


-- Show the cities under the same given government leader


-- Show countries with the same independece year


-- Show the cities cities whose country has not yet declared independence yet


--------------------------------------------------------------------------------------------------------
--
-- Additional samples
--
-- You may alias column and table names to provide more descriptive names
--
SELECT name AS CityName 
  FROM city AS cities

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)
SELECT name
     , population 
  FROM city 
 WHERE countryCode='USA' 
 ORDER BY name ASC, population DESC
;
-- Limiting results allows rows to be returned in 'limited' clusters where LIMIT says how many, 
-- and an optional OFFSET specifies number of rows to skip
SELECT name
     , population 
  FROM city 
  LIMIT 10 OFFSET 10
;