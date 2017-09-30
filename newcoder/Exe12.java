/*题目描述：给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

  笔记：分情况讨论  */
  
  //version1.0
  public class Solution {
    public double Power(double base, int exponent) {
        double tmp=base;
        if(exponent==0){
            return 1;
        }
        else if(exponent>0){
            for(int count=1;count<exponent;count++){
                base=base*tmp;
            }
            return base;
    	}
    	else if(exponent<0){
            for(int count=1;count<(-exponent);count++){
                base=base*tmp;
            }
            return 1/base;
        }
        return -1;
  }
}


//version2.0
public class Solution {
    public double Power(double base, int exponent) {
        double tmp=base;
        if(exponent==0){
            return 1;
        }
        else {
            for(int count=1;count<Math.abs(exponent);count++){
                base=base*tmp;
            }
    	}
        return exponent>0 ? base : 1/base;
  }
}
