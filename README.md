## mysql


## 项目启动顺序

 eurekaserver --> configServer --> aispringcloud-api(maven install) 
 
 -->aispringclouddome (maven install) 
 
 --> menu
 
 --> order
 
 --> user
 
 --> account 
 
 --> allclient

## 访问地址
eureka http://localhost:8761/

menu 验证 http://localhost:8020/menu/findAll/1/6

order 验证 http://localhost:8010/order/countByUid/1

user 验证 http://localhost:8040/user/count

account 验证 http://localhost:8050/account/adminlogin/admin1/123123

allclient 验证 http://localhost:8030/login.html

