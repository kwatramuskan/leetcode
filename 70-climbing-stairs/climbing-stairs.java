class Solution {
    public int climbStairs(int n) {
        if(n==1||n==2){
            return n ;
        }
        int current =0;
        int prev =2;
        int prevPrev = 1;
        for(int i =3; i<=n ;i++){
            current = prev +prevPrev;
            prevPrev = prev ;
            prev = current;
        }
       return current;
        
    }
}