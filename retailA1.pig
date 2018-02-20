retail = load '/niit/retail' using PigStorage(';') as (date, cust_id, age, area, category, pid, qty, cost, sales:long);
--dump retail;
retail = foreach retail generate $0, $1, $8;
--dump retail;
orderbydesc = limit(order retail by $2 desc) 1;
dump orderbydesc
--groupall = group retail all;
--dump groupall;
--max_retail = foreach groupall generate MAX(retail.sales) as max;
--dump max_retail;
--final = filter retail by sales == (max_retail.max);
--dump final;
--final =foreach final generate $0, $1, $8;
--dump final;

