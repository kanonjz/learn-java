# HashMap实现原理

## 遍历HashMap
#### 遍历HashMap的键值对
第一步：通过`entrySet()`方法获取`HashMap`键值对的Set形式  
第二部：使用`Iterator`迭代器遍历第一步得到的`Set`  
```
package 剑指offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test{

    public static void main(String[] args) {
      //create a HashMap
    	HashMap<String, Double> hm = new HashMap<String, Double>();
    	
      //put elements into the map
    	hm.put("Zara", 11.22);
    	hm.put("Mahnaz", 23.1);
    	hm.put("jack", 84.2);
    	hm.put("kanon", 55.4);
    	
      // Get a set of the entries
    	Set set = hm.entrySet();
    	
      // Get an iterator
    	Iterator it = set.iterator();
      
      //Display elements
    	while(it.hasNext()) {
    		Map.Entry me = (Map.Entry)it.next();
    		System.out.print(me.getKey()+":");
    		System.out.println(me.getValue());
    	}
    	System.out.println();
    	
      //Deposit 1000 into kanon's account
    	Double balance = hm.get("kanon");
    	hm.put("kanon", balance+1000);
    	System.out.println("kanon has "+hm.get("kanon")); 	
    }
}
```
output:
```
kanon:55.4
Zara:11.22
jack:84.2
Mahnaz:23.1

kanon has 1055.4
```

#### 遍历HashMap的键
第一步：通过`keySet()`方法获得键的`Set`形式  
第二部：使用`Iterator`迭代器遍历第一步得到的`Set`
```
package 剑指offer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test{

    public static void main(String[] args) {
    	HashMap<String, Double> hm = new HashMap<String, Double>();
    	
    	hm.put("Zara", 11.22);
    	hm.put("Mahnaz", 23.1);
    	hm.put("jack", 84.2);
    	hm.put("kanon", 55.4);
    	
    	Set set = hm.keySet();
    	
    	Iterator it = set.iterator();
    	while(it.hasNext()) {
    		String key = (String)it.next();
    		System.out.println(key);
    	}
    	System.out.println();
    	
    	Double balance = hm.get("kanon");
    	hm.put("kanon", balance+1000);
    	System.out.println("kanon has "+hm.get("kanon"));
    	
    }
}
```
output:
```
kanon
Zara
jack
Mahnaz

kanon has 1055.4
```

#### 遍历HashMap的值
第一步：通过`values()`方法获得值的`Collection`形式  
第二部：使用`Iterator`迭代器遍历第一步得到的`Collection`
```
package 剑指offer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test{

    public static void main(String[] args) {
    	HashMap<String, Double> hm = new HashMap<String, Double>();
    	
    	hm.put("Zara", 11.22);
    	hm.put("Mahnaz", 23.1);
    	hm.put("jack", 84.2);
    	hm.put("kanon", 55.4);
    	
    	Collection c = hm.values();
    	
    	Iterator it = c.iterator();
    	while(it.hasNext()) {
    		double value = (double)it.next();	
    		System.out.println(value);
    	}
    	System.out.println();
    	
    	Double balance = hm.get("kanon");
    	hm.put("kanon", balance+1000);
    	System.out.println("kanon has "+hm.get("kanon"));
    	
    }
}
```
output:
```
55.4
11.22
84.2
23.1

kanon has 1055.4
```
