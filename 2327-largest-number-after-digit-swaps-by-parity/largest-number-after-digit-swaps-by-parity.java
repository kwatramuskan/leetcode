class Solution {
    public int largestInteger(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        List<Integer>evens = new ArrayList<>();
        List<Integer>odds = new ArrayList<>();
        for(int i=0; i<n;i++){
            int digit = s.charAt(i)-'0';
            if(digit%2 ==0){
                evens.add(digit);
            }else{
                odds.add(digit);
            }

        }
        Collections.sort(evens , Collections.reverseOrder());
        Collections.sort(odds, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        int e = 0 ;
        int o =0;
        for(int j = 0 ; j<n; j++){
            int digit = s.charAt(j) - '0';
            if(digit%2==0){
                result.append(evens.get(e++));
            }else{
               result.append(odds.get(o++));
            }
        }
        return Integer.parseInt(result.toString());
        
    }
}