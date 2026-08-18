class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Arrays.sort(nums);
       ArrayList<Integer>result = new ArrayList<>();
       int first = 0;
       int second = 1;
       while(second<=nums.length){
        while(first<nums.length && nums[first]<second){
            first++;
        }
        if(first<nums.length && nums[first]==second){
            first++;
        }else{
            result.add(second);
        }
        second++;
       }
       return result;
        
    }
}