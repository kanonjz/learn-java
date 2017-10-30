#### native方法  
简单的理解就是非Java编写的方法，比如C，C++，通过调用这些方法，来与底层的操作系统进行交互
#### JNI  
Java Native Interface 即调用native方法的接口  
new出来的对象都存放在堆里，而基本类型存放在虚拟机栈的局部变量表中
  
<table>
  <tr>
    <th>JVM运行时的内存模型</th>
    <th>作用</th>
  </tr>
  <tr>
    <td>虚拟机栈</td>
    <td></td>
  </tr>
  <tr>
    <td>本地方法栈</td>
    <td></td>
  </tr>
  <tr>
    <td>堆</td>
    <td></td>
  </tr>
  <tr>
    <td>方法区</td>
    <td></td>
  </tr>
  <tr>
    <td>程序计数器</td>
    <td></td>
  </tr>
</table>
