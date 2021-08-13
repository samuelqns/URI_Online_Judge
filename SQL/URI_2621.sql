SELECT produ.name
FROM products AS produ
INNER JOIN providers AS provi ON produ.id_providers = provi.id
WHERE produ.amount BETWEEN 10 AND 20
    AND provi.name LIKE 'P%';