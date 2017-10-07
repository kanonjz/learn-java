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
链接：https://www.nowcoder.com/questionTerminal/564f4c26aa584921bc75623e48ca3011
来源：牛客网

class Solution {
public:
    void Mirror(TreeNode *p) {
    if(p){
            swap(p -> left, p -> right);
            Mirror(p -> left);
            Mirror(p -> right);
        }
    }
};
