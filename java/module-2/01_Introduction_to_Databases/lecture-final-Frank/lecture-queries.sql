--------------------------------------------------------------------------------------------------------
-- Basic SELECT Lecture Code
--------------------------------------------------------------------------------------------------------
-- -- indicates a comment - anything following on the line is ignored
--
-- SQL SELECT statement - retrieve values form the database (Read)
--
-- A SELECT statement is often referred to as a query
--
-- Basic syntax:
--
--      SELECT   - columns to include in the result (seperate mutiple column reqeusts with commas)
--      FROM     - table containing rows used in the query 
--      WHERE    - rows to include in the result
--      ORDER BY - sequence of rows in the result
--                 without an ORDER BY the sequence of the rows in the result is not predictable
--                 if the sequence of teh rows in teh result matter - code an ORDER BY
--
-- WHERE predicates:
--
--        =  <>  !=  >  >=  <  <= 
--        IN(list-of-values)      -- alterative to a series of = OR
--        NOT IN(list-of-values)  -- alterative to a series of != AND
--        BETWEEN value AND value
--        IS NULL
--        IS NOT NULL
--        LIKE    (use wildcards: % means 0 to any number of any characters
--                                _ means exactly any one character
--        ILIKE   (case insensivtive LIKE - Postgres extension)
--
-- predicates may be combined using AND and OR
--
-- use parentheses to make your multi-predicate condition clear

-- The DISTINCT clause on a SELECT removes duplicate values from the result
-- based on the all columns that follow
--
-- The DISTINCT ON(columns/expression) clause on a SELECT removes duplicate values from the result
-- based on the all columns/expression inside the parentheses that follow (Postgres extension)
------------------------------------------------------------------------------------------------------

-- Selecting the names for all countries
SELECT name 
FROM country;


-- Selecting the name and population of all countries
SELECT name, population 
FROM country;


-- Selecting all columns from the city table
SELECT * 
from city;


-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT * 
FROM city WHERE district = 'Ohio'; 


-- Selecting countries that gained independence in the year 1776
SELECT * 
FROM country WHERE indepyear = 1776


-- Selecting countries not in Asia
SELECT name, continent 
FROM country 
WHERE continent <> 'Asia';   -- != works too


-- Selecting countries that do not have an independence year
SELECT name 
FROM country 
WHERE indepyear IS NULL;

-- Selecting countries that do have an independence year
SELECT name, indepyear 
FROM country 
WHERE indepyear IS NOT NULL;


-- Selecting countries that have a population greater than 5 million
SELECT * 
FROM city 
WHERE population > 5000000;



-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
SELECT * 
FROM city 
WHERE district = 'Ohio' AND population > 400000;

-- Selecting country names on the continent North America or South America
SELECT name, continent FROM country WHERE continent = 'North America' OR continent = 'South America';
SELECT name, continent FROM country WHERE continent IN ('North America', 'South America');


-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
SELECT name, population, surfacearea, lifeexpectancy, (population / surfacearea) as density 
FROM country 
WHERE continent='Asia';



