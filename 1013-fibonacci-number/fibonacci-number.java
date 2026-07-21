class Solution {
    public int fib(int n) {
        if(n==0||n==1){             //base case
            return n ;

        }
        int prev = fib(n-1);         //recursive work ans sub problem
        int prevPrev = fib(n-2);    //recursive work
        return prev+prevPrev;   // self work
        
    }
}