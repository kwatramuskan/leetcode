class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroColumns = new boolean[cols];
        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                if(matrix[i][j]==0){
                    zeroRows[i]=true;
                    zeroColumns[j]=true;
                }
            }
        }
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if(zeroRows[i]||zeroColumns[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}