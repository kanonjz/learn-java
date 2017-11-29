## AOP

### 概述
在编写代码时需要处理业务逻辑和非业务逻辑，AOP就是用来处理一些非业务逻辑包括日志、安全等

### AOP优点
- 代码重用
- 解耦业务逻辑与非业务逻辑

### 术语
- **Aspect**：日志、安全等功能
- **Join Point**：函数执行或者属性访问
- **Advice**：在某个函数执行点上要执行的切面功能
- **Pointcut**：匹配横切目标函数的表达式

### Advice类型
1. **before**：函数执行之前
2. **After returning**：函数正常返回之后
3. **After throwing**：函数抛出异常之后
4. **After finally**：函数返回之后
5. **Around**：函数执行前后

### Spring AOP使用
- XML Schema-based AOP（比较集中）
- AspectJ annotation-based AOP（一般用这种注解的形式）
