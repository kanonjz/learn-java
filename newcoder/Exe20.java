/*题目描述：定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。

  笔记：如果栈为空，栈的peek（）方法和pop（）方法就会抛异常。在求最小值时，将栈里的数弹出保存到临时栈,
        弹出的过程中同时进行数的比较，比较结束后再将临时栈的数保存到原来的栈 */


import java.util.Stack;

public class Solution {
	Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> t = new Stack<Integer>();
    
    public void push(int node) {
        s.push(node);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int min() {
        int min=s.peek();
        while(!s.empty()){
            int temp=s.pop();
            if(temp<min)
                min=temp;
            t.push(temp);
        }
        while(!t.empty()){
            s.push(t.pop());
        }     
        return min;
    }
}
