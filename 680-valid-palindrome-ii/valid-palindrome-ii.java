class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
               left++;
            right--;
            }else{
                return check(s,left+1, right)||check(s,left,right-1);
            }
           
            
        }
        return true;
         
        
    }
    public boolean check(String s , int left , int right){
                 if(left>=right){
                    return true ;
                }
                return  s.charAt(left)==s.charAt(right) && check (s , left+1 , right-1);
            }
}