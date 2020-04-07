-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows) 
select film.title
from film
inner join 
film_actor
on film_actor.film_id = film.film_id
inner join 
actor
on actor.actor_id = film_actor.actor_id
where actor.last_name = 'STALLONE'
;

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
select film.title
from film
inner join 
film_actor
on film_actor.film_id = film.film_id
inner join 
actor
on actor.actor_id = film_actor.actor_id
where actor.last_name = 'REYNOLDS'
;

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
select film.title
from film
inner join 
film_actor
on film_actor.film_id = film.film_id
inner join 
actor
on actor.actor_id = film_actor.actor_id
where actor.last_name = 'DEAN'
;
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
select film.title
from film
inner join 
film_category
on film_category.film_id = film.film_id
inner join 
category
on category.category_id = film_category.category_id
where category.category_id = 6
;

-- 5. All of the ‘Comedy’ films
-- (58 rows)
select film.title
from film
inner join 
film_category
on film_category.film_id = film.film_id
inner join 
category
on category.category_id = film_category.category_id
where category.category_id = 5
;

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
select film.title
from film
inner join 
film_category
on film_category.film_id = film.film_id
inner join 
category
on category.category_id = film_category.category_id
where category.category_id = 3 and film.rating = 'G'
;

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
select film.title
from film
inner join 
film_category
on film_category.film_id = film.film_id
inner join 
category
on category.category_id = film_category.category_id
where category.category_id = 8 and film.rating = 'G' and film.length < 120
;
-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
select film.title
from film
inner join 
film_actor
on film_actor.film_id = film.film_id
inner join 
actor
on actor.actor_id = film_actor.actor_id
where actor.last_name = 'LEIGH' and film.rating = 'G'
;

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
select film.title
from film
inner join 
film_category
on film_category.film_id = film.film_id
inner join 
category
on category.category_id = film_category.category_id
where category.category_id = 14 and film.release_year = 2006
;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
select film.title, category.name, actor.first_name, actor.last_name 
from actor
join film_actor 
on actor.actor_id = film_actor.actor_id
join film 
on film_actor.film_id = film.film_id
join film_category 
on film.film_id = film_category.film_id
join category 
on film_category.category_id = category.category_id
where actor.first_name = 'NICK' AND actor.last_name = 'STALLONE' AND category.name = 'Action'
;

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
select store.store_id, address.address, city.city, country.country
from country
join city
on country.country_id = city.country_id
join address
on city.city_id = address.city_id
join store 
on address.address_id = store.address_id
;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
select store.store_id, address.address, concat(staff.first_name,' ', staff.last_name) as Store_Manager
from country 
join city on country.country_id = city.country_id
join address on city.city_id = address.city_id
join store on address.address_id = store.address_id
join staff on store.store_id = staff.store_id
;
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
select count(*) as Num_of_Rentals,  customer.customer_id, customer.first_name, customer.last_name
from customer 
join rental on customer.customer_id = rental.customer_id
group by customer.customer_id
order by Num_of_rentals desc limit 10
;


-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
select sum(amount) as money_spent,  customer.customer_id, customer.first_name, customer.last_name
from customer 
join payment on customer.customer_id = payment.customer_id
group by customer.customer_id
order by money_spent desc limit 10
;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
select store.store_id, address.address, count(rental) as total_rentals, sum(amount) as total_amount_of_sales, (sum(amount) / count(rental)) as avg_sales
from store 
join address on store.address_id = address.address_id
join inventory on store.store_id = inventory.store_id
join rental on inventory.inventory_id = rental.inventory_id
join payment on rental.rental_id = payment.rental_id
group by store.store_id, address.address
;


-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
select film.title, count(*) as num_of_rentals
from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
group by film.title
order by num_of_rentals desc limit 10
;
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
select category.name, count(*) as num_of_rentals 
from category
join film_category on category.category_id = film_category.category_id
join film on film_category.film_id = film.film_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
group by category.name
order by num_of_rentals desc limit 5
;


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
select film.title, category.name, count(*) as num_of_rentals 
from category
join film_category on category.category_id = film_category.category_id
join film on film_category.film_id = film.film_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
where category.name = 'Action'
group by film.title, category.name
order by num_of_rentals desc limit 5
;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
select actor.first_name, actor.last_name, count(*) as num_of_rentals 
from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
group by actor.first_name, actor.last_name
order by num_of_rentals desc limit 10
;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
select actor.first_name, actor.last_name, category.name, count(*) as num_of_rentals 
from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
where category.name = 'Comedy'
group by actor.first_name, actor.last_name, category.name
order by num_of_rentals desc limit 5