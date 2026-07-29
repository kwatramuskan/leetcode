class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid =0;
        int last = nums.length-1;
        while(mid<=last){
            switch(nums[mid]){
                case 0 :
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
                break;
                case 1:
                mid++;
                break;
                case 2 :
                int temp_2 = nums[mid];
                nums[mid] = nums[last];
                nums[last] = temp_2;
                last--;
                break;
            }
        }
        
        
    }
}