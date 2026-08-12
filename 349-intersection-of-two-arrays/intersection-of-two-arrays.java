class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    HashSet<Integer>set = new HashSet<>();
    int first = nums1.length-1;
    int second = nums2.length-1;
    while(first>=0&&second>=0){
        if(nums1[first]==nums2[second]){
            set.add(nums1[first]);
            first--;
            second--;
        }else if(nums1[first]>nums2[second]){
            first--;
        }else{
            second--;
        }
    }
    int ans[] = new int[set.size()];
    ArrayList<Integer>list = new ArrayList<>(set);
    for(int i =0; i<list.size();i++){
        ans[i] = list.get(i);

    }
    return ans;

    }
}
//hashset isliye use kiya bcz arraylist mein duplicate values store ho sakti h 
//fir nayi arraylist bnayi aur uske aandar saare hashset ki values daal di
