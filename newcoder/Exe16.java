/*题目说明：输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。

  笔记：java并无指针的概念。当进行对象赋值操作的时候，就是让他们指向同一个对象  */



///version1.0
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head=new ListNode(0);
        //tracker和head指向了相同的对象
        ListNode tracker=head;
        while(list1!=null || list2!=null){
            if(list1==null) {
                tracker.next=list2;
                tracker=tracker.next;
                list2=list2.next;
            }
            else if(list2==null) {
                tracker.next=list1;
                tracker=tracker.next;
                list1=list1.next;
            }
            else if((list1.val<list2.val)){
                tracker.next=list1;
                tracker=tracker.next;
                list1=list1.next;
            }
            else if((list1.val>=list2.val)) {
                tracker.next=list2;
                tracker=tracker.next;
                list2=list2.next;
            }          
        }
        return head.next;
    }
}



//version2.0 优化了代码结构
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode tracker=head;
        while(list1!=null && list2!=null){
        	if((list1.val<list2.val)){
                tracker.next=list1;
                tracker=tracker.next;
                list1=list1.next;
            }
            else {
                tracker.next=list2;
                tracker=tracker.next;
                list2=list2.next;
            }           
        }
        if(list1==null) {
        	tracker.next=list2;
        }
        else if(list2==null) {
        	tracker.next=list1;
        }
        return head.next;
    }
}
