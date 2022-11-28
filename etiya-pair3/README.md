# SQL QUERIES

### BETWEEN

``Select products.name from products``                                           
``Inner join product_categories on products.id=product_categories.product_id``                                    
``where stock between 100 and 1500``

![betwwen 100 and 1500](https://user-images.githubusercontent.com/97551928/204287280-14ba60d6-fd2d-4ec1-b515-42e9c3f0f24f.PNG)

### INNER JOIN,GROUP BY

``Select COUNT( ci.id),ci.name from cities ci``  

``INNER JOIN addresses a on ci.id = a.city_id``  

``INNER JOIN customers cu ON cu.id = a.customer_id`` 

`` group by a.city_id,ci.name ``    
 
 ``having count(ci.id)>1``                                         
 
 ![aynı şehirde yaşıyan müşteri sayısı](https://user-images.githubusercontent.com/97551928/204288376-311bbabb-ba53-405b-898b-e9551adcb3d9.PNG)

### UPDATE
``Update products``

``set stock=10,unit_price=15``

``where id=1``

![update](https://user-images.githubusercontent.com/97551928/204288961-45234249-6c50-410a-80aa-0ca1593f41db.PNG)

### INNER JOIN,GROUP BY
 ``Select a.city_id,ci.name,cu.customer_no``
 
 ``from cities ci INNER JOIN addresses a on ci.id = a.city_id``

``INNER JOIN customers cu ON cu.id = a.customer_id``
 
 ``group by a.city_id,ci.name,cu.customer_no``
 
 ![group by müşteriler şegirleri ve müşteri no ları](https://user-images.githubusercontent.com/97551928/204289540-f95d981c-f909-4356-a3aa-976f948ea2e5.PNG)

### OUTER JOIN
`` SELECT * from products``

`` full outer join cart_details``

`` on products.id= cart_details.product_id``

![outer join](https://user-images.githubusercontent.com/97551928/204290004-7b76ad88-d1cf-4ecc-a672-0fcb68c8d941.PNG)

### IN
`` select customers.id,customers.customer_no from customers``

``inner join Addresses on Addresses.customer_id=customers.id``

`` inner join cities on cities.id=Addresses.city_id``

`` where cities.name IN ('İstanbul','Ankara')``

![Adresleri Ankara,istanbul olan müşteriler](https://user-images.githubusercontent.com/97551928/204290569-e56fa4ef-864e-4ef7-8514-7a718ae25b95.PNG)

### INSERT INTO

``Insert into products(name,stock,unit_price)``

``Values('telefon',125,36)``

![İnsert](https://user-images.githubusercontent.com/97551928/204291028-58e55226-7c2a-418c-b119-1a14397b69ef.PNG)

### LEFT JOIN

``Select * from products``

``Left Join product_categories``

``On product_categories.product_id=products.id``

![Leftjoin](https://user-images.githubusercontent.com/97551928/204291344-642a9f7b-2c58-443f-86d5-fcb179b22674.PNG)

### RIGHT JOIN

``Select * from product_categories``

``Right Join products``

``On product_categories.product_id=products.id``

![Right join](https://user-images.githubusercontent.com/97551928/204291566-fdb1b5bb-9a52-49e1-a1db-c8326d92e131.PNG)
