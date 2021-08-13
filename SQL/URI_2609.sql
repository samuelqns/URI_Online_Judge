SELECT cate.name, SUM(prod.amount)
FROM products as prod
INNER JOIN categories AS cate ON prod.id_categories = cate.id
GROUP BY cate.name;