
netstat -tunpl|grep 8080
查看端口8080被哪个进程占用
systemctl status mysqld.service
查看mysql状态
type cd （显示cd is a shell builtin）即内部命令
type ifconfig 显示文件路径ifconfig is hashed (/usr/sbin/ifconfig) 即外部命令
type查看命令类型
file /usr/bin/yum
查看文件类型
help cd
内部命令帮助手册
help yum
外部命令帮助手册
yum -y install net-tools.x86_64
安装net-tools.x86_64包，其中包含ifconfig命令

shell => bash => 空格符切割出第一命令，内部命令直接调用，外部命令在$PATH的目录中中查找可执行文件

