//给出二叉树的前序遍历和中序遍历（无重复元素），要求重建二叉树
//这里用到了一个方法 Arrays.copyOfRange()

import java.util.*;
 
public class Solution {
 
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
       if(pre.length == 0||in.length == 0){
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);
        for(int i = 0; i < in.length; i++){
            if(pre[0] == in[i]){
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1,in.length));
            }
        }
        return node;
    }
}
