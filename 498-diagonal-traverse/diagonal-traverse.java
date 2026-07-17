class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat[0].length==0){
            return new int[0];
        }
        int m = mat.length;
        int n = mat[0].length;
        int row = 0 ; 
        int column = 0 ;
        int i = 0;
        int arr [] = new int[m*n];
        boolean up = true ;
        while(i<m*n){
            if(up){
                while(row>0 && column<n-1){
                    arr[i++] = mat[row][column];
                    row--;
                    column++;
                }
                 arr[i++] = mat[row][column];
                 if(column==n-1){
                    row++;
                 }
                    else{
                        column++;
                    }
                 

            }
            else{
                while(column>0 && row<m-1){
                    arr[i++] = mat[row][column];
                    row++;
                    column--;


                }
                  arr[i++] = mat[row][column];
                  if(row==m-1){
                    column++;

                  }else{
                    row++;
                  }


            }
            up =!up;
        }
        return arr;


        
        
    }
}