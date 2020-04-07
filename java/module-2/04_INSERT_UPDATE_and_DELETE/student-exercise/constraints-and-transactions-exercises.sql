-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
Begin Transaction;

insert into actor (first_name, last_name) values ('HAMPTON', 'AVENUE');
insert into actor (first_name, last_name) values ('LISA', 'BYWAY');

select * from actor where first_name = 'HAMPTON' AND last_name = 'AVENUE';
select * from actor where first_name = 'LISA' AND last_name = 'BYWAY';


rollback;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
Begin Transaction;

insert into film 
(title, description, release_year, language_id, length)
values ('Euclidean PI', 'THE EPIC STORY OF EUCLID AS A PIZZA DELIVERY BOY IN ANCIENT GREECE', 2008, (select language_id from language where name = 'ENGLISH'), 198)
;

insert into film_category
(film_id, category_id)
values ((select film_id from film where title = 'Euclidean PI')
        , (select category_id from category where name = 'Action'))
select * from film where title = 'Euclidian PI'
;

rollback;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
Begin Transaction; 

insert into film_actor (film_id, actor_id)
values (1001, 201);

insert into film_actor (film_id, actor_id)
values (1001, 202);

select * from film_actor where film_id = 1001;

rollback;
-- 4. Add Mathmagical to the category table.
Begin Transaction;

insert into category (Name)
Values ('Mathmagical');
select * from category where name like 'Math%';

rollback;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
Begin Transactio;

update film_category
set category_id = (select category_id from category where name = 'Mathmagical') -- get the id for mathmagical 
where film_id in (select film_id from film -- list of film_id for the films in WHERE
                        where title in ('Euclidian PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE')
                        )
;                       
select film_id from film -- what film should have been updated
where title in ('Euclidian PI', 'EGG IGBY', 'KARATE MOON', 'RANDOM GO', 'YOUNG LANGUAGE')                        
; 
select film_id from film_category -- which films have the mathmagical category id
where category_id = (select category_id from category where name = 'Mathmagical')
;                       
rollback;                        
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
Begin Transaction;

update film
set rating = 'G'
where film_id in
 (select film_id from film_category where film_category.category_id = 17);
 
 select * from film
 join film_category on film.film_id = film_category.film_id
 join category on film_category.category_id = category.category_id
 where category.name = 'Mathmagical';
 
 rollback;
-- 7. Add a copy of "Euclidean PI" to all the stores.
Begin Transaction;

INSERT INTO inventory (film_id, store_id) VALUES (1001, 1);
INSERT INTO inventory (film_id, store_id) VALUES (1001, 2);

select * from inventory where film_id = 1001;

Rollback;

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
Begin Transaction;

delete from film
where film_id = 1001 and title='Euclidean PI';

Rollback;

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

Begin Transaction;

delete from category
where name = 'Mathmagical';

Rollback;

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
Begin Transaction;

delete from film_category
where category_id in
 (select category.category_id from category where category.name = 'Mathmagical');

 select * from film
 join film_category on film.film_id = film_category.film_id
 join category on film_category.category_id = category.category_id
 where category.name = 'Mathmagical';

Rollback;


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>
Begin Transaction;

delete from category
where category.name = 'Mathmagical';

delete from film
where title = 'Euclidean PI';

select * from category;
select * from film where title = 'Euclidean PI';

Rollback;

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
