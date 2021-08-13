SELECT produ.name, provi.name
FROM products AS produ
INNER JOIN providers AS provi ON produ.id_providers = provi.id
WHERE id_categories = 6;