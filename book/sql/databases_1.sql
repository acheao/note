create table department
	(dep_name varchar(20),
	building varchar(20),
	budget numeric(12,2), -- 1234567890.12
	primary key(dep_name));
create table course
	(course_id varchar(20),
	title varchar(20),
	dep_name varchar(20),
	credits numeric(2,0),
	primary key (course_id),
	foreign key(dep_name) references department); -- foreign key(dep_name) references department(dep_name)) mysql语法

select * from A natural join B; -- 即 A inner join B where A.ID = B.ID  相当于匹配相同的属性，同时去掉重复的列

SELECT CONCAT(column,"分钟") FROM A;  -- 拼接列和字符串

desc -- 降序
asc -- 升序
between -- 介于A和B之间
where (a.id,b.id) = (c.id,d.id); -- ==> a.id = c.id and b.id = d.id
union -- 集合中并运算，并且去重
union ALL -- 集合并运算，不去重
intersect -- 集合交集运算，并且去重
intersect ALL -- 集合交集运算，不去重
except -- 集合差运算，先去重再做减
except ALL -- 集合差，不去重
unknown -- true and unknown = unknown ,false and unknown = false ,unknown and unknown = unknown
	    -- true or unknown = true, false or unknown = unknown , unknown or unknown = unknown
		-- not unknown = unknown
		-- 'null = null' == unknown
avg -- 平均值
having -- 分组后的过滤
>some -- 至少比集合中的某一元素大, 存在>=some , <some , <=some , <>some , =some 等价于in ,但是<>some不等价于not in
>ALL -- 比集合所有元素大,存在>=ALL , <ALL , <=ALL , <>ALL , =ALL   <>ALL 等价于not in , 但是=ALL不等价于in
exists -- 后面查询条件存在结果集是返回true,否则返回false
not exists -- 与exists相反
unique -- 后面查询条件是否存在重复元组,如果不存在，返回true
update A set a.c = case
				when a.c >1 then 1
				when a.c >2 then 3
				else 5
				end
				
lateral with distinct -- 关键词

