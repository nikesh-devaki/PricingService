insert into course (id,base_price,name,description,pricing_strategy) values (1,10,'Data Analytics and Statistics','Learn the math behind data science and master the art of ...','FREE_PRICING');
insert into charge (id,charge_type,currency,location,course_id,name) values (1,'TAX_CHARGES','USD','BGL',1,'Tax');
insert into charge (id,charge_type,currency,location,course_id,name) values (2,'CURRENCY_CHARGES','USD','BGL',1,'Currency COnversion');
