class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i = 0;//s ke liye
        int j = 0;//t ke liye
        while(j<t.length()&& i < s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        return i == s.length();
        
    }
}