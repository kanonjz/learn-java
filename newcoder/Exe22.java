/*题目描述：二叉树的层次遍历，从上往下打印出二叉树的每个节点，同层节点从左至右打印。

  笔记：设置一个队列，队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作。
        LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。  */



import java.util.*;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {       
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
 			list.add(temp.val);
        }
        return list;
    }
}
