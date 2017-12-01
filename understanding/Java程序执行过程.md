### 1.新建文件`Test.java`
```
import java.util.*;

public class Test{
    public Integer add(Integer a, Integer b){
        return a+b;
    }

    public static void main(String[] args){
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        System.out.println(s.pop());

        Test test = new Test();
        System.out.println(test.add(1,2));
    }
}
```

### 2. `javac`编译器编译Java源码生成`.class`文件，`.class`文件存储的是字节码（16进制），字节码会被JVM执行  

在控制台输入
```
javac Test.java
```
<br>
生成的Test.class文件<br><br>

 ![](http://oyrpkn4bk.bkt.clouddn.com/Test.class.JPG)


### 3. 使用下面的命令执行`.class`文件
```
java Test
```

### 4. 结果
![](http://oyrpkn4bk.bkt.clouddn.com/%E6%8E%A7%E5%88%B6%E5%8F%B0%E6%89%A7%E8%A1%8C%E7%BB%93%E6%9E%9C.JPG)
