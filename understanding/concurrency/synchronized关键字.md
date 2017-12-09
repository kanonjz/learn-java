## `synchronized`关键字
**注：java提供了两种锁机制，一种是内置的锁`synchronized`，另一种是显示的`Lock`对象**  <br><br><br>

`synchronized`的三种用法

### `synchronized`直接指定加锁对象
对给定对象加锁，进入同步代码前要获得给定对象的锁
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
		FirstThread task=new FirstThread();
		Thread thread1=new Thread(task);
		Thread thread2=new Thread(task);
		Thread thread3=new Thread(task);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
```

### `synchronized`作用于非静态方法
相当于对当前对象加锁，进入同步代码前要获得当前对象的锁
```
package 并发;

public class FirstThread implements Runnable{
	
	public synchronized void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		FirstThread task=new FirstThread();
		Thread thread1=new Thread(task);
		Thread thread2=new Thread(task);
		Thread thread3=new Thread(task);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
```

### `synchronized`作用于静态方法
相当于对当前类加锁，进入同步代码前要获得当前类的锁
```
package 并发;

public class FirstThread implements Runnable{
	public static synchronized void count() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public void run() {
		count();
	}
	
	public static void main(String[] args) {
		FirstThread task=new FirstThread();
		Thread thread1=new Thread(task);
		Thread thread2=new Thread(task);
		Thread thread3=new Thread(task);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
```

## 重点！！！
1. `synchronized`修饰非静态方法、代码块synchronized (this)和synchronized (非this对象)，加锁的是对象-------**对象锁**
2. `synchronized`修饰静态方法、代码块的synchronized (类.class)用法锁的是类--------------------------------**类锁**
