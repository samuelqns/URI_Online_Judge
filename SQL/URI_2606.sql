SELECT prod.id, prod.name
FROM products AS prod
INNER JOIN categories AS cate ON cate.id = prod.id_categories
WHERE cate.name LIKE 'super%';