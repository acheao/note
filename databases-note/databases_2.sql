inner join, join,  from A,B内连接，三种写法等价
left outer join 左外连接
right outer join 右外连接
full outer join 全外连接
内连接和外连接的区别，是否保留未匹配元组，内连接不保留，外连接保留
create view abc as select A.ID,A.NAME from A;创建视图abc
not null约束
unique(A,b,c)