# volatile关键字
> volatile：易变的，不稳定的
使用volatile修饰变量的两层含义：  
1. 保证了不同线程对同一变量操作的可见性，即一个线程对变量的值进行了修改，这个新值对其他线程时立即可见的
2. 禁止JVM对指令进行重排序

思考：1.为什么可以保证变量的可见性----------->线程每次都是从内存进行读取，且每次修改都立即写入内存，不经过CPU cache进行缓存

Java并发编程中的三大特性：原子性、可见性、有序性  
volatile并不能保证原子性。  
举例1：变量i的初始值为0，线程1读取了i的值，被阻塞，此时线程2也读取了i的值，由于第一个线程还未对i进行修改，所以线程2读到的值仍然为0，线程2将i进行自增操作，并写入内存。然后线程1也进行自增操作，写入内存。按理来说最终结果应该要为2才对，实际上却为1。问题根源就出在虽然volatile能够保证每次都是到内存中读取最新的值，但是自增操作并非原子操作，而且volatile也无法保证对变量的任何操作都是原子性的。  

举例2：
```
package 剑指offer;

public class Test {
    public volatile int inc = 0;
 
    public void increase() {
        inc++;
    }
 
    public static void main(String[] args) {
        final Test test = new Test();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        test.increase();
                };
            }.start();
        }
 
        while(Thread.activeCount()>1)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}
```

## 参考资料
[Java并发编程：volatile关键字解析](http://www.importnew.com/18126.html)-----------这篇文章写的很好  
[Java Volatile Keyword](http://tutorials.jenkov.com/java-concurrency/volatile.html)
