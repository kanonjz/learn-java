# volatile关键字
> volatile：易变的，不稳定的
使用volatile修饰变量的两层含义：  
1. 保证了不同线程对同一变量操作的可见性，即一个线程对变量的值进行了修改，这个新值对其他线程时立即可见的
2. 禁止JVM对指令进行重排序

思考：1.为什么可以保证变量的可见性----------->线程每次都是从内存进行读取，且每次修改都立即写入内存，不经过CPU cache进行缓存

Java并发编程中的三大特性：原子性、可见性、有序性

## 参考资料
[Java并发编程：volatile关键字解析](http://www.importnew.com/18126.html)-----------这篇文章写的很好  
[Java Volatile Keyword](http://tutorials.jenkov.com/java-concurrency/volatile.html)
