#### oracle ####
* 远程登录  
		sqlplus username/password@//host:port/sid
* 赋予scott用户dba权限
		sqlplus /nolog
		sql>conn /as sysdba;
		sql>select username from dba_users;
		sql>grant dba to scott;   --赋予batch用户dba权限
		sql>revoke dba from scott;  --解除batch用户dba权限
* command命令
		desc tablename;  --描述一张表
* 解锁用户scott
		sqlplus /nolog
		sql>conn /as sysdba;
		sql>alter user scott account unlock;
* select语句
		select 2*3 from dual --dual表
		select sysdate from dual;
		select ename,sal*12 annual_sal from emp; --别名
		select ename,sal*12 "annual sal" from emp; --别名保持空格和小写
		select sal*12+comm from emp; --含有null表达式的字运算为空值，即comm为null会使整个结果为null
		 
