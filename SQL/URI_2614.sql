SELECT c.name, r.rentals_date
FROM customers AS c
INNER JOIN rentals AS r ON c.id = r.id_customers
WHERE rentals_date BETWEEN '2016-09-01' AND '2016-09-30';