#### 第二部分 ####
#### 第三章 ####
1. **select * from user where username <font color=blue>regexp</font> 'lin';**　　正则表达式匹配包含lin字符的列，与like不同，like需要完全匹配才返回列，regexp只需部分匹配，并且不区分大小写  
2. **select * from user where usenamr regexp '<font color=red>.</font>i';**　　**.** 正则表达式中匹配任意1个字符  
3. **select * from user where username regexp 'lin<font color=blue>|</font>小';**　　| 逻辑或  
4. **select * from user where username regexp '100|200|300';**　　多个或并列 
5. **select * from user where username regexp <font color=blue>binary</font> 'lin';**　　binary关键词使正则表达式匹配区分大小写  
6. **select * from user where username regexp '<font color=blue>[123]</font>lin';**　　匹配几个字符之一  
= **select * from user where username regexp '<font color=blue>1lin</font>|<font color=blue>2lin</font>|<font color=blue>3lin</font>';**  
7. **select * from user where username regexp '[<font color=blue>^</font>123]';**　　^字符集的否定，即除了123均匹配  
8. **[0123456789]等同于[0-9]**　　　``\\.　表示.`` 　　　``\\\　表示\``　　　``\\_　表示_``  
9. **[a-zA-Z0-9]任意字母和数字**　　**[:print:]任意可打印字符**　　**[:graph:]与[:print:]相同，但不包括空格**　　
10. **重复元匹配``*``　+　？　{n}　{n,}　{n,m}**  
``*　　0个或多个匹配``　　　``+　　 1个或多个匹配 (等于{1，})``　　``?　　0个或1个匹配（等于{0，1}）``  
``{n}　　指定匹配的数目``　　``{n,}　　不少于指定数目的匹配``　　``{n,m}　　匹配数目的范围``
11. **定位符^　$　[[:　[[:>:]]**  
``^　　文本的开始或者集合的否定``　　``$　　文本的结尾``　　``[[:　　　词的开始``　　``[[:>:]]　　词的结尾``  
**select * from user where username regexp '<font color=red>^</font>[0-9]';**　　匹配以数字开头的字段  
 
#### 第四章 ####
1. **计算字段**
  
		1.concat() 拼接字符串 example：select concat(username,pwd) from user;
		2.rtrim() 去掉值右边的空格        ltrim() 去掉值左边的空格 
		3.as 别名，也称为导出列    now() 当前日期         upper() 转成大写   lower()  转成小写
		4.date() 函数  time（）函数
		5.avg() 返回某列的平均值   count（）返回某列的行数 
		  count(*) 返回总列数  count（username）返回某一列，除去null的行数
		6.max() 返回某列的最大值  忽略值为null的行 如果列为文本则返回最后一行 
		7.min() 返回某列的最小值  忽略值为null的行 如何列为文本则返回最前一行
		8.sum() 返回某列值之和    忽略值为null的行
		  avg() count() max() min() 可以使用distinct区分不同 如count（distinct column）
2. **select count(\*) form user where username = 'linc' <font color=blue>group by</font> id order by id;**　　
按id分组统计,group by 在where之后，order by之前
3. **select count(\*) from user group by id <font color=blue>having</font> count(\*) >= 2;**　　having过滤条件和where基本相同，但是having用于过滤分组