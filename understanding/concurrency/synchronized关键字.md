## `synchronized`关键字
**注：java提供了两种锁机制，一种是内置的锁`synchronized`，另一种是显示的`Lock`对象**  <br><br><br>

`synchronized`可以用来修饰方法和代码段

### `synchronized`修饰代码段
```
package 并发;

public class FirstThread implements Runnable{
	
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
		}
	}
	
	public static void main(String[] args) {
		FirstThread thread=new FirstThread();
		Thread thread1=new Thread(thread);
		Thread thread2=new Thread(thread);
		Thread thread3=new Thread(thread);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
```

### `synchronized`修饰方法
```
package 并发;

public class FirstThread implements Runnable{
	private int money=1000;
	
	public synchronized void add(int num) {
		money+=num;
	}
	
	public synchronized int getMoney() {
		return money;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" "+getMoney());
		add(1000);
		System.out.println(Thread.currentThread().getName()+" "+getMoney());
	}
	
	public static void main(String[] args) {
		FirstThread thread=new FirstThread();
		Thread thread1=new Thread(thread);
		Thread thread2=new Thread(thread);
		thread1.start();
		thread2.start();
	}
}
```
## 重点！！！
1. synchronized修饰非静态方法、代码块synchronized (this)和synchronized (非this对象)，加锁的是对象-------**对象锁**
2. synchronized修饰静态方法、代码块的synchronized (类.class)用法锁的是类--------------------------------**类锁**
