class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int [n][n];
        int topRow = 0 ;
        int bottomRow = n-1 ;
        int leftColumn = 0 ;
        int rightColumn = n-1 ;
        int current = 1;
        while(current <= n*n){
            for(int j = leftColumn ; j<=rightColumn && current<=n*n ; j++){
                matrix[topRow][j]= current;
                current++;
            }topRow++;
            for(int i = topRow ; i<=bottomRow && current<=n*n ; i++){
                matrix[i][rightColumn] = current;
                current++;
            }rightColumn--;
            for(int j = rightColumn ; j>=leftColumn && current<=n*n; j--){
                matrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;
            for(int i = bottomRow ; i>=topRow && current<=n*n; i--){
                matrix[i][leftColumn] = current;
                current++;
            }
            leftColumn++;
        }
        return matrix ;
        
    }
}