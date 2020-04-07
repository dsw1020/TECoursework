-- SELECT ... FROM
-- Two dashes indicates a comment - ignore anything that follows


-- Selecting the names for all countries

select  name
  from country
;

-- Selecting the name and population of all countries
select name, population
  from country
;
select population, name  -- the order of the columns in the select is the ordee they be in the result
  from country
;
-- Selecting all columns from the city table
select *          -- * means all columns in the order defined in the table
  from country
;
-- SELECT ... FROM ... WHERE 
-- WHERE will filter the rows in the result

-- Selecting the cities in Ohio
-- district column in city has what we call a state in USA

select name 
  from city 
 where district = 'Ohio'  -- String values and characters go inside single quotes
;

-- Selecting countries that gained independence in the year 1776
SELECT name, Indepyear 
  fRom country
 where indepyear = 1776  -- numeric values are not put inside anything
;
-- Selecting countries not in Asia
select name, continent
  from country
 where continent != 'Asia'   -- != means not equals
;

select name, continent
  from country
 where not continent = 'Asia'
;

select name, continent
  from country
 where continent NOT IN('Asia')  -- only show rows where continent is not in the list
;

-- Show the names of contrties in Africa, Europe and North America
select name, continent
  from country
 where continent = 'Africa' or continent = 'Europe' or continent = 'North America'
;

select name, continent
  from country
 where continent IN ('Africa', 'Europe','North America')  -- show me rows if continent is in the
                                                          -- IN is a shorthand for a series of = or
;

-- Selecting countries that do not have an independence year
select name, indepyear
  from country
 where indepyear = null    -- show me rows with no indepyear
                           -- you cannot use the normal operators on null (= != > < <= >=)
;
-- Selecting countries that do not have an independence year
select name, indepyear
  from country
 where indepyear is null    -- show me rows with no indepyear
                            -- is null will return rows that are null
;

-- Selecting countries that do have an independence year
select name, indepyear
  from country
 where indepyear is not null    -- show me rows with no indepyear
                                -- is not null will return rows that are not null
;

-- Selecting countries that have a population greater than 5 million
select name, population
 from country
where population > 5000000
;

-- Selecting countries that have a population is between 5 million and 10 million
select name, population
 from country
where population between 5000000 and 10000000
;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
select name, population
  from city
  where district = 'Ohio'
    and population > 400000
;
-- Selecting country names on the continent North America or South America
select name, continent
  from country
 where continent in ('North America')
    or continent in ('South America')
;

select name, continent
  from country
 where continent like '%America'  -- show me rows where continent ends with 'America'
;

select name, continent
  from country
 where continent like '%A%'  -- show me rows where continent contains an 'A'
;

select name, continent
  from country
 where continent like 'A%'  -- show me rows where continent starts qith an 'A'
;


-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area  - population divided by area
--	note the use of the 'as' keyword
-- AS can assign names to derived columns or to rename existing columns

select name, population, lifeexpectancy as How_LongThey_Live, surfacearea, population / surfacearea as population_density
  from country
;

