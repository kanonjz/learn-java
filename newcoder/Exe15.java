/*题目说明：输入一个链表，反转链表。

  笔记：设置两个 “ 指针 ”， pre和next。这道题很重要！！！  */



/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/


public class Solution {
    public ListNode ReverseList(ListNode head) {
		ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
