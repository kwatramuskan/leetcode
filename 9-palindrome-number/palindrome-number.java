class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        return check(s ,0,s.length()-1);
    }
        public boolean check(String s , int left , int right){
        //base case
        if(left>=right){
            return true ;
        }
        return s.charAt(left)==s.charAt(right)&&check(s,left+1,right-1);
        }
        
        
    
}