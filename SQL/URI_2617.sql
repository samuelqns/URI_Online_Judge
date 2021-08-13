SELECT produ.name, provi.name
FROM providers AS provi
INNER JOIN products AS produ ON provi.id = produ.id_providers
WHERE provi.name = 'Ajax SA';