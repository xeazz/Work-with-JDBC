SELECT product_name
FROM netology_db.ORDERS
         JOIN netology_db.CUSTOMERS ON CUSTOMERS.id = ORDERS.customer_id
WHERE UPPER(CUSTOMERS.name) = :name;