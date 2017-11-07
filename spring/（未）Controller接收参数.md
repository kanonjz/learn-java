## Controller接受参数
### 1. 使用RequestParam注解获取参数
如果参数被@RequestParam注解，那么默认的情况下该参数不能为空，如果为空，则系统会抛出异常。如果希望允许它为空，那么要修改它的配置项required=false，比如下面的代码
```
@RequestParam(value="role_name", required=false) String roleName
```
