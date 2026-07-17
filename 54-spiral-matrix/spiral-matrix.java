class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int topRow = 0 ;
        int bottomRow = matrix.length-1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length-1;
        int totalElements = 0 ;
        int total = rows*columns;
        while(totalElements<total){
            for(int j = leftColumn ; j<=rightColumn&&totalElements<total ; j++){
                result.add(matrix[topRow][j]);
                totalElements++;
               
            }
             topRow++;
            for(int i =topRow ; i<=bottomRow &&totalElements<total; i++){
                result.add(matrix[i][rightColumn]);
                totalElements++;
                

            }
            rightColumn--;
            for(int j = rightColumn ; j>=leftColumn &&totalElements<total ; j--){
                result.add(matrix[bottomRow][j]);
                totalElements++;
               

            }
             bottomRow--;
            for(int i = bottomRow ; i>=topRow &&totalElements<total; i--){
                result.add(matrix[i][leftColumn]);
                totalElements++;
                
            }
            leftColumn++;
        }
        return result;
        
    }
}