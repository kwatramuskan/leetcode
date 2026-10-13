class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int j = 0;
        for(int i =1 ; i<=n ; i++){
            if(n%i==0){
                ans[j] = nums[i-1];
                j++;
            }
        }
        int sum = 0 ;
        for(int k =0 ; k < j ; k++){
            sum+= ans[k]*ans[k];
        }
        return sum;
        
    }
}