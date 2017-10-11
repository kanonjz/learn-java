/*题目说明：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

  笔记：1.注意数组的传参,
       2.设置start和end进行切片，不需要保存到新的数组
       3.二叉树boolean判断，注意这里的返回值技巧
       4.递归结束的情况 
       5.int a[]={}, 空的数组a.length=0        */

public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0){
            return false;
        }
        if(sequence.length==1){
            return true;
        }
        return isBST(sequence, 0, sequence.length-1);
    }
    
    public boolean isBST(int [] sequence, int start, int end){
        if(start>=end){
            return true;
        }
        int i=start;
        while(sequence[i]<sequence[end]){
            i++;
        }
        for(int j=i;j<end;j++){
            if(sequence[j]<sequence[end]){
                return false;
            }
        }
        return isBST(sequence, start, i-1) && isBST(sequence, i, end-1);
    }
}
