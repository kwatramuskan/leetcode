class Solution {
    public void moveZeroes(int[] nums) {
       int x = -1 ;
       for(int i = 0 ; i<nums.length ; i++){
        if(nums[i]!=0){
            x++;
            nums[x]=nums[i];
        }
       }
       for(int j = x+1; j<nums.length ; j++){
        nums[j]=0;
       }

        
    }
}