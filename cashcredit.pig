txn = load '/home/hduser/txns1.txt' using PigStorage(',') as (txnid, date, custid, amount:double, category, product, city, state, type);
--dump txn;
txn_type = group txn by type;
--dump txn_type;
typ_sum = foreach txn_type generate group as type, ROUND_TO(SUM(txn.amount),2) as typetotal;
--dump typ_sum;
groupall = group typ_sum all;
--dump groupall;
totalsale = foreach groupall generate ROUND_TO(SUM(typ_sum.typetotal),2) as total;
--dump totalsale;
final = foreach typ_sum generate $0, $1, ROUND_TO((($1/totalsale.total)*100),2);
dump final;
