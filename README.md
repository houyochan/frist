"# frist" 
#My frist demo！
一个基于SpringBoot、Mybatis、MybatisPlus、ElementUI和Vue的小demo
可以注册登录，登录进入图书展示页面可以对图书进行增删改查。
##项目配置
~~~~
修改数据库为自己本地数据库
src/main/resources/application.yml

`spring:
   datasource:
     driver-class-name: com.mysql.cj.jdbc.Driver
     url: jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC
     username: root
     password: 123456`
修改数据库 用户名密码 为自己本地的
两个sql文件ssm_user和book里面有建表语句，直接执行就好，插入内容需要自己添加
****
~~~~
#项目启动
`打开SpringBoot启动类
src/main/java/person/chy/SsmApplication.java
右键启动

登录页访问地址：http://localhost:8080/login.html`
##注意添加图书日期一定要按照这种yyyy-mm-dd hh:mm:ss 1980-02-27 17:47:08