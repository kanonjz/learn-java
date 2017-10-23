## ssm框架初步整合
各层的编写顺序：如图所示<br>
![大致流程图](https://github.com/kanonjz/pictures/blob/master/%E7%BB%98%E5%9B%BE1.png)
#### 关于mapper映射器
mapper映射器的编写包括两部分：接口和实现接口的xml <br>
如何映射：接口里的方法名和xml里的id一致，这里面mybatis自动帮我们实现了映射 <br>
这里有两个天坑！！！：1.接口和xml的命名必须一致  2.注意xml里的namespace
