# FTBmall后台

#### 介绍
FTBmall官网后台系统

#### 软件架构
前端（主要）：HTML + CSS + JavaScript + Ajax(前后端交互)

后端：SpringBoot+ MyBatis + Druid连接池 + MySQL

部署：腾讯云CentOS 7
#### 快速启动

1.  本机创建名为springbootdemo的数据库，运行springbootdemo.sql脚本或者自行建表并执行脚本中的语句
2.  修改application.yml中的数据库账号密码为本机的账号密码
3.  运行ServerApplication启动springboot项目后，浏览器中输入http://localhost:8081/user/getUser_name?id=123456 即可显示查询数据库结果






