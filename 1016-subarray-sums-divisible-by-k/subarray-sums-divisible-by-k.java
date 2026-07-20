class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
       int[] count = new int[k];
       count[0]=1;
       int sum = 0; 
       int result = 0;
       for(int i =0 ; i<n ; i++){
        sum +=nums[i];
        int rem = ((sum%k)+k)%k;
        result+=count[rem];
        count[rem]++;
       }
       return result;
        
    }
}