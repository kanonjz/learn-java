# controller里的常用注解
## @RequestMapping
表示请求路径，在初始化的时候会被解析成handler，一旦有请求过来则分配到对应的controller里处理  
举例：
```
@RequestMapping(value="/standard", method=RequestMethod.POST)
```

## @PathVariable
从请求路径中获取参数
举例：请求路径为
```
@RequestMapping(value="/{id}")
```
那么可以使用
```
@PathVariable("id") int id
```
来获取路径里的`id`值

## @RequestBody
@requestBody注解常用来处理content-type不是默认的application/x-www-form-urlcoded编码的内容，比如说：application/json或者是application/xml等。一般情况下来说常用其来处理application/json类型。  
通过@requestBody可以将请求体中的JSON字符串绑定到相应的bean上，当然，也可以将其分别绑定到对应的字符串上。    
[@requestBody注解的使用](https://www.cnblogs.com/qiankun-site/p/5774300.html)
