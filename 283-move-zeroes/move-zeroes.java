
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
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}

