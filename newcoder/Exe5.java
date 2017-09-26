package 剑指offer;
import java.util.*;

public class Exe5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    int counter=0;
    int temp;
    
    public void push(int node) {
        if(counter==0){
            stack1.push(node);
            counter++;
        }
        else{
        	for(int i=0;i<counter;i++){
                temp=stack1.pop();
                stack2.push(temp);
            }
            stack1.push(node);
            for(int i=0;i<counter;i++){
                temp=stack2.pop();
                stack1.push(temp);
            }
            counter++;
        }
    }
    
    public int pop() {
        counter--;
    	return stack1.pop();
    }
    
    public static void main(String[] args) {
    	Exe5 exe = new Exe5();
    	exe.push(8);
    	exe.push(6);
    	exe.push(30);
    	System.out.println(exe.pop());
    	System.out.println(exe.pop());
    	System.out.print(exe.stack1);
    }
}
