-- SELECT ... FROM
-- Selecting the names for all countries
SELECT name FROM country;

-- Selecting the name and population of all countries
SELECT name, population FROM country;

-- Selecting all columns from the city table
SELECT * FROM city;



-- select district from city table
SELECT DISTINCT district FROM city;

SELECT name AS city_name FROM city; -- aliasing

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio

SELECT * FROM city WHERE district = 'Ohio';

-- sql uses single quotes
--"clause" - term- means one aspect of the query - 'like from'
-- commands/queries in sql are not case sensitive - dataTypes are case sensitive - all lowercase here
-- Selecting countries that gained independence in the year 1776
SELECT * FROM country WHERE indepyear = 1776; -- this is a boolean condition
                                                -- see 'WHERE clause conditianls' chart in m01-lec01

-- Selecting countries not in Asia

SELECT * FROM country WHERE continent != 'Asia';
--or using <>

SELECT * FROM country WHERE continent <> 'Asia';

-- Selecting countries that do not have an independence year
SELECT * FROM country WHERE indepyear IS NULL 1776;
-- Selecting countries that do have an independence year
SELECT * FROM country WHERE indepyear IS NOT NULL;

-- Selecting countries that have a population greater than 5 million
SELECT * FROM COUNTRY WHERE population > 5000000;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

SELECT * FROM city WHERE district = 'Ohio' AND population > 400000;


-- Selecting country names on the continent North America or South America

SELECT * FROM country WHERE continent = 'North America' or continent = 'South America';

-- selecting using IN()

SELECT * FROM country WHERE continent IN ( 'North America' ,'South America');
-- using not in()
SELECT * FROM country WHERE continent NOT IN ( 'North America' ,'South America');
 -- between allows you to select where a columns valyes is BETWEEN value1 AND value2
 SELECT * FROM country WHERE surfacearea BETWEEN 50000 AND 150000;
 
 --LIKE allows select of columns that data based on a wildcard
 -- all countrys w name that starts w "A"
 SELECT name FROM country WHERE name LIKE 'A%';
 
 
 -- this looks for any lowercase a in the middle (not first or last) name
 SELECT name FROM country WHERE name LIKE '%a%';
 -- LIKE is case sensitive, but ILIKE is not
 SELECT name FROM country WHERE NAME ILIKE'%a'; -- this looks for any a in the name
 
-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
SELECT name, population, lifeexpectency, (population / surfacearea) AS density FROM country;


--	note the use of the 'as' keyword



