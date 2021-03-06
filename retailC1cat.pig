retail = load '/niit/retail' using PigStorage(';') as (date, cust_id, age, area, category, pid, qty, cost:long, sales:long);
profit_pid = foreach retail generate $4, $2, (sales-cost) as profit;
profit_pid = filter profit_pid by profit>0;
agrp = group profit_pid by ($0, $1);
asum = foreach agrp generate flatten($0), SUM(profit_pid.$2);
apro = filter asum by $1 == 'A ';
orderbya = limit(order apro by $2 desc) 5;
bpro = filter asum by $1 == 'B ';
orderbyb = limit(order bpro by $2 desc) 5;
cpro = filter asum by $1 == 'C ';
orderbyc = limit(order cpro by $2 desc) 5;
dpro = filter asum by $1 == 'D ';
orderbyd = limit(order dpro by $2 desc) 5;
epro = filter asum by $1 == 'E ';
orderbye = limit(order epro by $2 desc) 5;
fpro = filter asum by $1 == 'F ';
orderbyf = limit(order fpro by $2 desc) 5;
gpro = filter asum by $1 == 'G ';
orderbyg = limit(order gpro by $2 desc) 5;
hpro = filter asum by $1 == 'H ';
orderbyh = limit(order hpro by $2 desc) 5;
ipro = filter asum by $1 == 'I ';
orderbyi = limit(order ipro by $2 desc) 5;
jpro = filter asum by $1 == 'J ';
orderbyj = limit(order jpro by $2 desc) 5;
kpro = filter asum by $1 == 'K ';
orderbyk = limit(order kpro by $2 desc) 5;
final = union orderbya, orderbyb, orderbyc, orderbyd, orderbye, orderbyf, orderbyg, orderbyh, orderbyi, orderbyj, orderbyk;
dump final;
