## 使用场景
### 场景一：返回列表的json数据
1. 给Controller加上注解`@ResponseBody`，表明将对象通过转换器转换成Json格式的数据

2. Controller的返回类型设置为`List<>`

3. 在Service层，由MBG自动生成的Mapper里一般包含两个select方法，如下所示：
```
List<CustomerService> selectByExample(CustomerServiceExample example);

CustomerService selectByPrimaryKey(Integer customerServiceSerial);
```
第一种使用example来设置查询条件，返回的是对象的List。  

第二种直接根据主键进行查询返回的是单个对象。  

这里我们使用第二种方法，如果不设置example的查询条件的话，则返回所有结果集。

### 场景二：对部分属性值进行修改
Controller在接受参数之前事实上并不知道前端会传过来哪些参数，只有在收到数据后，才知道哪些要修改哪些为null。  

Controller将要修改的数据传到Service层，进行update操作。  

与update相关的有四个方法，分别，`updateByExample`和`updateByExampleSelective`。这两个方法的区别是，当对象的属性为空时，第一个方法会将值更新为null，第二个方法不会更新null属性的字段。
```
int updateByExampleSelective(@Param("record") CustomerService record, @Param("example") CustomerServiceExample example);

int updateByExample(@Param("record") CustomerService record, @Param("example") CustomerServiceExample example);

int updateByPrimaryKeySelective(CustomerService record);

int updateByPrimaryKey(CustomerService record);
```

### 场景三：根据某个条件来删除
与delete相关的方法有两个：
```
int deleteByExample(CustomerServiceExample example);

int deleteByPrimaryKey(Integer customerServiceSerial);
```
`deleteByPrimaryKey`只能通过主键来删除，而使用`deleteByExample`就可以设置更多过滤条件
