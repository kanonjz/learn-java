## ![maven简单教程](https://spring.io/guides/gs/maven/#scratch)

### 将应用打成war包
`jar -cvf restaurant.war .`
再把war包移动到Tomcat的webapps目录下

### 标准spring工程结构
```
spring-template
    └─src
        ├─main
        │  ├─java
        │  │  └─com
        │  │      └─netease
        │  │          └─course
        │  │              ├─dao
        │  │              ├─meta
        │  │              ├─service
        │  │              │  └─impl
        │  │              ├─utils
        │  │              └─web
        │  │                  ├─controller
        │  │                  └─filter
        │  ├─resources
        │  └─webapp
        │      ├─freemarker
        │      └─WEB-INF
        └─test
            ├─java
            └─resources
```
