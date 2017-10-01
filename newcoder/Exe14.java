/*题目描述：输入一个链表，输出该链表中倒数第k个结点。

  笔记：用堆栈来存储ListNode, count记录链表个数  */
  
  
  
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
