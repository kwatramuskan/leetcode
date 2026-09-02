class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        long count = 0 ;
        int left = 0;
        int right = nums.length-1;
        int mod = 1000000007;
         // 2^i calculate karke store karenge
        long[] power = new long[nums.length];
        power[0] = 1;
          for(int i = 1; i < nums.length; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }


        while(left<= right){
            if(nums[left]+nums[right]<=target){
              count = (count + power[right-left]) % mod;
                left++;
            }else{
                right--;
            }
        }
        return (int)count;



    }
}