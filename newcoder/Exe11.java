 /*题目描述：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 
   笔记：1、两个关键运算 &运算 <<移位运算
           如果移动的位数超过了该类型的最大位数，那么编译器会对移动的位数取模。如对int型移动33位，实际上只移动了33%32=1位；
           否则当左移超过31位时都为0.
         2、Integer.toBinaryString(10)可以将10转换成二进制
         3、在使用位运算符时，会自动使用二进制进行运算  */
      
public class Solution {
    public int NumberOf1(int n) {
		int flag = 1;
        int count = 0;
        while(flag != 0){
            if((n & flag) !=0){
                count++;
            }
            flag = flag<<1;
        }
        return count;
    }
}
