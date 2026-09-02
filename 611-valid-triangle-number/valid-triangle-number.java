class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count =0 ;
        for(int right = n-1;right>=2;right--){
            int left = 0;
            int mid = right-1;
            while(left<mid){
                if(nums[left]+nums[mid]>nums[right]){
                count = count + mid - left;
                mid--;

            }else {
                left++;
            }
        }
        }
        return count ; 
            
        
    }
}
//concept ye h ki aagar a<b<c h to a+b>c check karne se hi valid triangle ban jayega 
//sabse imp line count = count + mid - left
//pehle mid-- isliye kiya bcz array sort h aur hum aur chota number add karke dekhenge aagar left++karkr bda add karte to condition true ki true hi rehti 