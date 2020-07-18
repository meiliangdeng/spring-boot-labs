# 一、spring boot web mvc 演示实例

1. 在数据库中创建users_test库，在库中执行子项目sb-mybatis docs文件中的users.sql脚本。

2. 进入子项目 sb-mybatis 根路径，执行mvn spring-boot:run 命令，即运行起应用。（或者在idea中run MybatisAnnotationApplication类，也能运行起应用。）应用运行起来后，运行在本地机器的9000端口上。

3. 在postman或浏览器中，发起http请求，即可保存业务数据到mysql中。
   本项目中的一些示例：

   3.1 http://localhost:9000/getUsers  该数据库获取全部用户。 GET类型HTTP请求

   3.2 <http://localhost:9000/delete/32> 删除ID为32的用户。   GET类型HTTP请求

   3.3 <http://localhost:9000/addOne?userName=dd123&passWord=123456&userSex=MAN&nickName=dd>

   往数据中插入一个userName字段是dd123,passWord字段是123456，user_sex是MAN，nick_name是dd的数据。   GET类型HTTP请求