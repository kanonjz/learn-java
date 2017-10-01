/*题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
         并保证奇数和奇数，偶数和偶数之间的相对位置不变。
         
  笔记：分别由两个栈来存放奇数和偶数   */
  
  
  
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.Stack;

public class Solution {
	public ListNode FindKthToTail(ListNode head,int k) {
        
       	if(head==null){
            return null;
        }
        
		Stack<ListNode> s = new Stack<ListNode>();
        
        s.push(head);      
        int count=1;
	    while(head.next!=null){
	    	head=head.next;
	    	s.push(head);
            count++;
	    }
	      	
	    if(k==0||k>count){
           return null;
        } 
	    for(int i=1;i<=(k-1);i++){
	        s.pop();
	    }
	    return s.pop();
	}
}
