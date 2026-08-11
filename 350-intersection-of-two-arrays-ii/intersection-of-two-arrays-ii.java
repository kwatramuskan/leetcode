class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int first = nums1.length-1;
        int second = nums2.length-1;
        ArrayList<Integer>list = new ArrayList<>();
        while(first>=0&&second>=0){
            if(nums1[first]==nums2[second]){
                list.add(nums1[first]);
                first--;
                second--;
            }else if(nums1[first]>nums2[second]){
                first--;
            }else{
                second--;
            }
        }
        int ans[] = new int[list.size()];
        for(int i =0; i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
        
    }
}