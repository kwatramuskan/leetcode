class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Example 1 
       int first = m-1;//2 index
       int second = n-1;//2 index
       int last = m+n-1;//3 index
       while(first>=0&&second>=0){
        if(nums1[first]>nums2[second]){
            nums1[last]=nums1[first];
            first--;
        }else{
            nums1[last]=nums2[second];
            second--;
        }
        last--;
       }
       while(second>=0){//Example 3 when m = -1so above while loop fails
       nums1[last]=nums2[second];
       second--;
       last--;

       }

                               
        
    }
}