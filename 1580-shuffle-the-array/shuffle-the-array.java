class Solution {
    public int[] shuffle(int[] nums, int n) {
       
       int ans [] = new int[2*n];
       for(int i=0; i<n;i++){
        int x = nums[i];
        int y = nums[i+n];
        ans[2*i] = x;
        ans[2*i+1]=y;
       }
       return ans ;
        
    }
}