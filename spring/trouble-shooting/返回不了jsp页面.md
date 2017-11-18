## 返回不了jsp页面
![](http://oyrpkn4bk.bkt.clouddn.com/cannot-return-jsp.png)

### 解决
web.xml里servlet-mapping项配置错误
将
```
  <servlet-mapping>
    <servlet-name>springmvc</servlet-name>
    <url-pattern>/*</url-pattern>
  </servlet-mapping>
```
改为
```
  <servlet-mapping>
    <servlet-name>springmvc</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
```
