class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int left = nums1.length-1;
    int right = nums2.length-1;
    HashSet<Integer>set = new HashSet<>();
    while(left>=0&&right>=0){
        if(nums1[left]==nums2[right]){
            set.add(nums1[left]);
            left--;
            right--;

        }else if(nums1[left]<nums2[right]){
            right--;
        }else{
            left--;
        }
    }
    int ans[] =new int[set.size()];
    ArrayList<Integer>list = new ArrayList<>(set);
    for(int i =0 ; i<list.size();i++){
        ans[i]=list.get(i);
    }
    return ans ;
        

    }
}