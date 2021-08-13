SELECT produ.name, provi.name, cate.name
FROM products AS produ
INNER JOIN providers AS provi ON produ.id_providers = provi.id
INNER JOIN categories AS cate ON produ.id_categories = cate.id
WHERE provi.name = 'Sansul SA' AND cate.name = 'Imported';