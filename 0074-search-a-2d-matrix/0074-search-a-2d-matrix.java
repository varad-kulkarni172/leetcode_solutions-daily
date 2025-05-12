class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){ // iterate over the columns of the matrix at row i — which should be: matrix[i].length.
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}