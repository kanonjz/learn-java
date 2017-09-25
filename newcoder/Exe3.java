//链表倒置
//version 1.0
//这里用了很笨的方法，从前往后遍历的过程中，依次将值存在定长的数组里，然后再将数组里的值倒置存放在ArrayList里

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        int[] value=new int[100];
        int i=0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(listNode==null){
            return a;
        }
        while(listNode.next!=null){
            value[i]=listNode.val;
            i++;
            listNode=listNode.next;
        }
        value[i]=listNode.val;
        
        do{
            a.add(value[i]);
            i--;
        }while(i>=0);
            
        return a;
    }
}
