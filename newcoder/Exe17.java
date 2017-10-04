/*题目说明：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

  笔记：注意区分子树和子结构。是子树一定是子结构，是子结构一定是子树。二叉树只有两个子树
  
  
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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null){
            return false;
        }
        boolean flag=false;
        if(flag==false){
            flag=IsSubtree(root1, root2);
            if(flag==false){
                flag=IsSubtree(root1.left, root2);
                if(flag==false){
                    flag=IsSubtree(root1.right, root2);
                }
            }
        }
        return flag;
    }
     
    public boolean IsSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null && root2!=null){
            return false;
        }
        if(root2==null){
            return true;
        }
        if(root1.val==root2.val){
            return IsSubtree(root1.left, root2.left) && IsSubtree(root1.right, root2.right);
        }
        return false;
    }
}
