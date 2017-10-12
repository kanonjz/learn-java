## static
用static关键字来声明静态方法或静态变量
在静态方法中，不能直接访问非静态成员(包括方法和变量)。因为，非静态的变量是依赖于对象存在的，对象必须实例化之后，它的变量才会在内存中存在

## 常见报错
```
Cannot make a static reference to the non-static field list
```
出错原因是在静态方法中直接访问非静态成员
