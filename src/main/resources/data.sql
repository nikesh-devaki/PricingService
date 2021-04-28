insert into course (id,base_price,name,description,pricing_strategy) values (1,1000,'Data Analytics and Statistics','Learn the math behind data science and master the art of ...','ONETIME_PAYMENT');
insert into course (id,base_price,name,description,pricing_strategy) values (2,1500,'SQL: Beginner to Advanced','Make data-driven decisions by using the most widely used ...','ONETIME_PAYMENT');
insert into course (id,base_price,name,description,pricing_strategy) values (3,0,'Python For Data Science','Learn Python programming fundamentals to analyze and visualize data...','FREE_PRICING');
insert into course (id,base_price,name,description,pricing_strategy) values (4,3000,'Excel: Beginner to Advanced','Learn to manipulate complex data and derive insights...','SUBSCRIPTION');

insert into charge (id,charge_type,currency,location,course_id,name) values (1,'TAX_CHARGES','USD','BGL',1,'Tax');
insert into charge (id,charge_type,currency,location,course_id,name) values (2,'CURRENCY_CHARGES','USD','BGL',1,'Currency Conversion');

insert into charge (id,charge_type,currency,location,course_id,name) values (3,'TAX_CHARGES','GBP','BGL',2,'Tax');
insert into charge (id,charge_type,currency,location,course_id,name) values (4,'CURRENCY_CHARGES','GBP','BGL',2,'Currency Conversion');

insert into charge (id,charge_type,currency,location,course_id,name) values (5,'TAX_CHARGES','INR','BGL',3,'Tax');
insert into charge (id,charge_type,currency,location,course_id,name) values (6,'CURRENCY_CHARGES','INR','BGL',3,'Currency Conversion');

insert into charge (id,charge_type,currency,location,course_id,name) values (7,'TAX_CHARGES','INR','BGL',4,'Tax');
