#### 第一部分 ####
##### 第一章 #####
1. **show databases;**　　显示数据库列表  
- **<font color=blue>create database</font> test;**　　创建数据库test  
- **show <font color=#0000FF>columns</font> from user;**　　
显示列名及信息  
- **select <font color=blue>distinct</font> username from user;**　　
查询并去除重复记录  
- **select username from user <font color=blue>limit</font> 2;**　　
查询并显示2行记录  
- **select username from user limit <font color=#0000ff>N</font>,K;**　　
N表示第N+1列开始(包含第N+1行)，K条记录  
**= select  username from user limit <font color=blue>K</font> <font color=red>offset</font> <font color=blue>N</font>;**  
- **select <font color=blue>user.username</font> from user;**　　全限定名  
- **select username from user <font color=blue>order by</font> columnsname;**　　
查询结果按照列columnsname排序  
- **select username from user order by username <font color=blue>desc</font>;**　　查询结果按照列columnsname倒序

##### 第二章 ######
		!= 不等于 　<>不等于　　>大于　　>=大于等于
		between A and　B　介于A和B之间(包含A和B)
1. **select * from user where id <font color=red>is</font> null;**　　is关键字  
2. **<del>select * from user where id = 20 <font color=blue>and</font> price <= 1000;**　　and操作符  
3. **<del>select * from user where price > 200 <font color=blue>or</font> count <20;**　　or操作符  
4. **select * from user where id = 100 or id = 201 and price >100;**　　<font color=blue>and优先级高于or</font>
5. **select * from user where (id = 100 or id = 201) and price >100;**　　可以使用括号解决优先级问题  
6. **select * from user where id <font color=blue>in</font> (1,2,3,4);**　　in操作符  
7. **select * from user where id <font color=blue>not</font> in (1,2,3);**　　not操作符,对查询条件取反，可以和<font color=red>between，exists</font>连用  
8. **select * from user where username <font color=blue>like</font> 'lin<font color=blue>%</font>';**　　like通配符过滤,区分大小写  
9. **select * from user where username <font color=blue>like</font> '<font color=blue>%</font>lin<font color=blue>%</font>';**　　like通配符过滤%不能匹配null  
10. **select * from user where username like '<font color=red>_</font>lin'；**　　_匹配任意字符但是只匹配一个，%可以匹配任意数量(包括0个) 