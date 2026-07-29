class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>evens = new ArrayList<>();
        List<Integer>odds = new ArrayList<>();
        for(int i = 0 ; i<nums.length ; i++){
            if(i%2==0){
                evens.add(nums[i]);
            }else{
                odds.add(nums[i]);
            }
            
            
        }
        Collections.sort(evens);
            Collections.sort(odds,Collections.reverseOrder());
            int [] result = new int[nums.length];
            int e = 0 ;
            int o =0;
            for(int j =0; j<nums.length ; j++){
                if(j%2==0){
                    result[j] = evens.get(e++);

                }else{
                    result[j] = odds.get(o++);
                }
            }
        return result;

        
    }
}