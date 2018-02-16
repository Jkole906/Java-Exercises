-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

SELECT title
FROM film
JOIN film_actor AS fa ON film.film_id = fa.film_id
JOIN actor ON actor.actor_id = fa.actor_id
WHERE actor.actor_id = '44'

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT title
FROM film
JOIN film_actor AS fa ON film.film_id = fa.film_id
JOIN actor ON actor.actor_id = fa.actor_id
WHERE actor.actor_id = '135'

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT title
FROM film
JOIN film_actor AS fa ON film.film_id = fa.film_id
JOIN actor ON actor.actor_id = fa.actor_id
WHERE actor.actor_id = '143' or actor.actor_id = '35'
--Alt WHERE statement thats still works:
-- WHERE last_name = 'DEAN'



-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT title
FROM category AS c
JOIN film_category AS fc ON c.category_id = fc.category_id
JOIN film AS f ON f.film_id = fc.film_id
WHERE c.name = 'Documentary'

-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT title
FROM category AS c
JOIN film_category AS fc ON c.category_id = fc.category_id
JOIN film AS f ON f.film_id = fc.film_id
WHERE c.name = 'Comedy'


-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT title
FROM category AS c
JOIN film_category AS fc ON c.category_id = fc.category_id
JOIN film AS f ON f.film_id = fc.film_id
WHERE c.name = 'Children' AND rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT title
FROM category AS c
JOIN film_category AS fc ON c.category_id = fc.category_id
JOIN film AS f ON f.film_id = fc.film_id
WHERE c.name = 'Family' AND rating = 'G' AND length < 120

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT title
FROM film AS f
JOIN film_actor AS fa ON fa.film_id = f.film_id
Join actor AS a ON fa.actor_id = a.actor_id
WHERE fa.actor_id = '103' AND rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT title
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE release_year = 2006 AND category.category_id = '14'


-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

SELECT title
FROM category
JOIN film_category AS fc ON category.category_id = fc.category_id
JOIN film AS f ON fc.film_id = f.film_id
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE a.actor_id = '44' AND category.category_id = '1'

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT address, city, district, country
FROM store
JOIN address ON store.address_id = address.address_id
JOIN city on address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id


-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT store.store_id, address, CONCAT(first_name,' ' ,last_name) AS Manager
FROM store
JOIN address ON store.address_id = address.address_id
JOIN city on address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id
JOIN staff ON store.manager_staff_id = staff.staff_id


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

SELECT CONCAT(customer.first_name, ' ',customer.last_name) AS customer, COUNT(*)
FROM rental
JOIN customer ON rental.customer_id = customer.customer_id
GROUP BY customer
ORDER BY COUNT DESC
LIMIT 10


-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

SELECT SUM(amount), CONCAT(first_name,' ', last_name) AS customer_name
FROM customer
JOIN rental ON rental.customer_id = customer.customer_id
JOIN payment ON rental.rental_id = payment.rental_id
GROUP BY customer.customer_id, first_name
ORDER BY SUM(amount) DESC
LIMIT 10


-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

SELECT store.store_id, address, COUNT(*), SUM(amount), AVG(amount)
FROM store
JOIN inventory ON store.store_id = inventory.store_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN payment ON rental.rental_id = payment.rental_id
JOIN address ON store.address_id = address.address_id
GROUP BY store.store_id, address

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)