/*题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

笔记：青蛙第一跳法有n种，分别是1,2,3,4.....n，那么共有跳法f(n-1)+f(n-2)+.....+f(1)+1种
     由f(n)=f(n-1)+f(n-2)+.....+f(1)+1
       f(n-1)=f(n-2)+f(n-3)+.....+f(1)+1 可得f(n)=2f(n-1) */
       
       
//version1.0
public class Solution {
    public int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        int sum=1;
        for(int i=1;i<target;i++){
            sum+=JumpFloorII(i);
        }
        return sum;
    }
}

//version2.0
public class Solution {
    public int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        return 2*JumpFloorII(target-1);
    }
}
