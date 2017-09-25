public class Solution {
       int i;
       public boolean Find(int target, int [][] array) {
           if(array[0].length==0){
               return false;
           }
            for(i=0;i<array.length;i++){
                if((array[i][array[0].length-1]>=target)){
                    for(int j=0;j<array[0].length;j++){
                        if(array[i][j]==target){
                            return true;
                        }
                    }
                }
         
            }
            return false;
        }
    }
