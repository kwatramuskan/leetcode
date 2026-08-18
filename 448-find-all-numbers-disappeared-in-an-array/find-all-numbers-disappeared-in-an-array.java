class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>result = new ArrayList<>();
        int expected =1;
        int i=0;
        while(expected<=nums.length){
              while (i < nums.length && nums[i] < expected) {
                i++;
            }
            if(i<nums.length&&nums[i]==expected){
                i++;//mil gya 
            }else{
                result.add(expected);
            }
            expected++;
        }
        return result;

        
    }
}