-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

SELECT * FROM actor;

INSERT INTO actor(first_name,last_name)
VALUES ('HAMPTON', 'AVENUE');
INSERT INTO actor(first_name,last_name)
VALUES ('LISA', 'BYWAY');


-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

SELECT * FROM film;
INSERT INTO film (title, description, release_year, language_id, length)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', '2008', '1' , '198');


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.


-- this question kind of confused me -- didnt know what 'add them' meant so I updated the description to have their names/roles
UPDATE film
SET description = 'The epic story of Euclid as a pizza delivery boy in
-- ancient Greece. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother'
WHERE film_id = 1001;


-- 4. Add Mathmagical to the category table.

INSERT INTO category VALUES ('17', 'Mathemagical');
SELECT * FROM category;


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

UPDATE film_category
SET category_id = '17' WHERE film_id = ('996' :: INTEGER);
UPDATE film_category
SET category_id = '17' WHERE film_id = ('276' :: INTEGER); 
UPDATE film_category
SET category_id = '17' WHERE film_id = ('494' :: INTEGER); 
INSERT INTO film_category
VALUES ('1001', '17');

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)


UPDATE film
SET rating = ('G')
WHERE title = 'Euclidean PI' 
or title = 'RANDOM GO' or title = 'EGG IGBY' 
or title = 'KARATE MOON 'or title = 'RANDOM GO' or title ='YOUNG LANGUAGE';



-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory (film_id, store_id)
VALUES (1001, 1 ), (1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)

DELETE FROM film WHERE title = 'Euclidean PI';

-- <** NO- did not work due to foreign key constraint-this film is being referenced multiple different places>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)

DELETE FROM category WHERE name = 'Mathemagical';

 ---**I spelled it Math(e)magical orginally so I had to do it here too


-- <** NO - did not work because this category is being referenced in another table (film_category) >

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

DELETE FROM film_category WHERE category_id = 17;

-- yes it worked because category ID was a foreign key and was only referencing the category table


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)

DELETE FROM category WHERE name = 'Mathemagical';
-- yes because it was no longer being used as a reference elsewhere


DELETE FROM film WHERE title = 'Euclidean PI';
-- NO because this film is still being referenced in the inventory table


