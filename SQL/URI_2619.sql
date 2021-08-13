SELECT produ.name, provi.name, produ.price
FROM products AS produ
INNER JOIN providers AS provi ON produ.id_providers = provi.id
INNER JOIN categories AS cate ON produ.id_categories = cate.id
WHERE produ.price > 1000 AND cate.name = 'Super Luxury';