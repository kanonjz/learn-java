/*题目描述：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
         并保证奇数和奇数，偶数和偶数之间的相对位置不变。
         
  笔记：分别由两个栈来存放奇数和偶数   */
  
  
  
import java.util.Stack;
 
 public class Solution {
     public void reOrderArray(int [] array) {
         Stack<Integer> s1=new Stack<Integer>();
         Stack<Integer> s2=new Stack<Integer>();
         for(int i=array.length-1;i>=0;i--){
             if(array[i]%2==1){
                 s1.push(array[i]);
             }
             else
                 s2.push(array[i]);
         }
         int count=0;
         while(!s1.empty()){
             array[count]=s1.pop();
             count++;
         }
         while(!s2.empty()){
             array[count]=s2.pop();
             count++;
         }
     }
 }
