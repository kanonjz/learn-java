/*题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

  笔记：本质上是斐波那契数列的应用。青蛙第一次跳有两种选择，跳1级，有f（n-1）种跳法；跳2级，有f（n-2）种跳法。合计f（n-1）+f（n-2）*/



public class Solution {
    public int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
}

