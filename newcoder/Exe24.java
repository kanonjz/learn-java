/*题目描述：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

  笔记：带记忆的DFS深度遍历  */
  
  
//方法一
import java.util.ArrayList;
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
    ArrayList<ArrayList<Integer>> listAll=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null){
            return listAll;
        }
        target=target-root.val;
        list.add(root.val);
        if(target==0 && root.left==null && root.right==null){
            //这一句
            listAll.add(new ArrayList<Integer>(list));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        //移除最后一个元素
        list.remove(list.size()-1);
        return listAll;
    }
}


//方法二
public class Solution {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        ArrayList<ArrayList<Integer>> paths=new ArrayList<ArrayList<Integer>>();
        if(root==null)return paths;
        find(paths,new ArrayList<Integer>(),root,target);
        return paths;
    }
    public void find(ArrayList<ArrayList<Integer>> paths,ArrayList<Integer> path,TreeNode root,int target){
        path.add(root.val);
        if(root.left==null&&root.right==null){
            if(target==root.val){
                paths.add(path);
            }
            return;
        }
        ArrayList<Integer> path2=new ArrayList<>();
        path2.addAll(path);
        if(root.left!=null)find(paths,path,root.left,target-root.val);
        if(root.right!=null)find(paths,path2,root.right,target-root.val);
    }
}
