inner join, join,  from A,B内连接，三种写法等价
left outer join 左外连接
right outer join 右外连接
full outer join 全外连接
内连接和外连接的区别，是否保留未匹配元组，内连接不保留，外连接保留
create view abc as select A.ID,A.NAME from A;创建视图abc
not null约束
unique(A,b,c)
check (semester in('Fall','Winter','Spring','Summer'))
create table course
(...
	foreign key(dept_name) references department
	on delete cascade   	  -- 联级删除
	on update cascade,		  -- 联级更新
...);
deferred 关键字

date '2001-04-25'
time '09:30:00'
timestamp '2001-04-25 10:29:01.45'
current_date,current_time,current_timestamp
localtime,localtimestamp

dept_name varchar(3,0) default 0

create index studentID_index on student(ID);
ALTER TABLE `table_name` ADD INDEX index_name ( `column` ) ;

create table A like B;

create table A as 
(select * 
from B 
where a.name = "值") 
with data;