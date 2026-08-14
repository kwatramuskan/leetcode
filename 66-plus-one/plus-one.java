class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i =n-1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;

            }
            //ye wali line tabhi chalegi jab if condition fail ho jayegi matlab last digit 9 h 

            digits[i]=0;

        }
        //yha tak pouche to saare digits hi 9 h
        int [] ans = new int[n+1];
        ans[0]=1;
        return ans ;

    }
}
//ye wali line tabhi chalegi jab if condition fail ho jayegi matlab last digit 9 h (digits[i]=0)
            