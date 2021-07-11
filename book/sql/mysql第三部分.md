#### 第三部分 ####
1. **select vend\_name,prod\_name,prod\_price from vendors,products where vendor.vend_id = products.vend_id;**　　表联结
2. **select * from vendors inner join products <font color=blue>on</font> vendor.vend_id = products.vend_id;**　　内联结
3. **select * from customers <font color=blue>left join</font> orders on customers.cust_id = orders.cust__id;**　　 　外连接，可写成left outer join
4. **select * from customers <font color=blue>right outer join</font> orders on orders.order_Id = customers.cust_id = customers.cust_id;**
5. **