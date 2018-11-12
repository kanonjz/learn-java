# JAVA知识点:smile::icecream::tada:
### [StringBuffer](http://www.runoob.com/java/java-stringbuffer.html)
### [java实现链表](https://github.com/kanonjz/learn-java/blob/master/newcoder/Exe3.java)
### [Stack](http://www.runoob.com/java/java-stack-class.html)
### [补码、位运算符](https://github.com/kanonjz/learn-java/blob/master/newcoder/Exe11.java)
### [Iterator](http://www.runoob.com/java/collection-iterator.html)
### [Queue](http://www.runoob.com/java/data-queue.html)
<br><br><br>

# 数据结构
### [斐波那契数列](https://github.com/kanonjz/learn-java/blob/master/newcoder/Exe8.java)
#### 二叉树：
[子结构例题](https://github.com/kanonjz/learn-java/blob/master/newcoder/Exe17.java) 
[层次遍历](https://github.com/kanonjz/learn-java/blob/master/newcoder/Exe22.java)
[二叉搜索树](https://github.com/kanonjz/learn-java/blob/master/newcoder/Exe23.java)
<br><br><br>

# Linux下安装Java
1. Windows下载压缩包到本地，使用filezilla上传到远端
2. 解压缩包，将解压后的文件移动到/etc/profile
3. 查看已安装的jdk
```
rpm -qa | grep jdk
```
卸载旧版的jdk
```
rpm -e --nodeps java-1.7.0-openjdk-1.7.0.161-2.6.12.0.el6_9.x86_64
```
4. 配置新版jdk的环境变量，编辑文件/etc/profile，在文件末尾添加(注意：环境变量是从前往后扫描）
```
export JAVA_HOME=/usr/java/jdk1.8.0_131
export JRE_HOME=${JAVA_HOME}/jre
export CLASSPATH=.:${JAVA_HOME}/lib:${JRE_HOME}/lib:$CLASSPATH
export JAVA_PATH=${JAVA_HOME}/bin:${JRE_HOME}/bin
export PATH=${JAVA_PATH}:$PATH
```
5. 使用命令让配置生效
```
source /etc/profile
```
6. 验证安装是否成功
- 使用javac命令，不会出现command not found错误
- 使用java -version，出现版本为java version "1.8.0_131"
- echo $PATH，看看自己刚刚设置的的环境变量配置是否都正确
<br><br><br>

# 拓展阅读
1. [知乎：Java 到底是值传递还是引用传递？](https://www.zhihu.com/question/31203609)
2. [String使用equals方法和==分别比较的是什么？](http://blog.csdn.net/wangdong20/article/details/8566217)

3. 集合继承关系  

![集合继承关系](http://kanon-blog.oss-cn-hangzhou.aliyuncs.com/for-github/java%E9%9B%86%E5%90%88%E7%BB%A7%E6%89%BF%E5%85%B3%E7%B3%BB%E5%9B%BE.png)

4. Java基本类型

![Java基本类型](http://kanon-blog.oss-cn-hangzhou.aliyuncs.com/for-github/Java%E5%9F%BA%E6%9C%AC%E7%B1%BB%E5%9E%8B.png)

5. `BigInteger`理论上能够表示无线大的数，只要计算机内存足够大，可以用来大数运算，底层用int数组实现的
