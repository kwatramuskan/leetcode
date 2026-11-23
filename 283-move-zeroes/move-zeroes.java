
       // int x =-1;
        //for(int i =0; i<nums.length ; i++){
           // if(nums[i]!=0){
               // x++;
             //   nums[x] = nums[i];
         //   }
      //  }
       // for(int j =x+1;j <nums.length ; j++){
          //  nums[j]=0;

       // }
     
class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        for(int j = 0;j<nums.length ; j++){
            if(nums[j]!=0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(int k = i;k<nums.length ; k++){
            nums[k]=0;
        }
    }
}

