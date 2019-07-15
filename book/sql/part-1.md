### oracle ###
* 远程登录
```  
sqlplus username/password@//host:port/sid
```
* 赋予scott用户dba权限
```
sqlplus /nolog
sql>conn /as sysdba;
sql>select username from dba_users;
sql>grant dba to scott;   --赋予batch用户dba权限
sql>revoke dba from scott;  --解除batch用户dba权限
```
* command命令
```
desc tablename;  --描述一张表
```
* 解锁用户scott
```
sqlplus /nolog
sql>conn /as sysdba;
sql>alter user scott account unlock;
sql>alter user username identified by password;
```
* select语句
```
SELECT * FROM USER_TABLES; 
--查看用户有哪些表
select 2*3 from dual; --dual表
select sysdate from dual;
select ename,sal*12 annual_sal from emp; --别名
--select ename,sal*12 "annual sal" from emp;
--别名保持空格和小写,此时用双引号",而不使用单引号'
select sal*12+comm from emp;
--含有null表达式的字符运算为空值，即comm为null会使整个结果为null
select sal||ename from emp; 
--||连接符,将两个字段拼接在一起,可以拼接各种字段包括日期,值为空值时拼接后为不同于运算变成null
select sal||'hjhds' from emp; 
--拼接字符串，使用单引号',而非双引号",若字符中包含',则用两个单引号代替，如sal||'hj''hds'
```

### mysql ###
		 
