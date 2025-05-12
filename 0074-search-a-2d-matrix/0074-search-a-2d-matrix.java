class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){ // iterate over the columns of the matrix at row i — which should be: matrix[i].length.
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // Using One Pass i.e. in a single loop treating the 2D array like 1D
        // To convert a 1D index i into matrix[row][col], we use: row = i / cols and col = i % cols
        int row = matrix.length;
        int col = matrix[0].length;

        int l = 0;
        int r = row * col - 1;

        while(l <= r){
            int mid = l + (r - l)/2; // tp avoid overflow
            int midval = matrix[mid / col][mid % col];


            if(midval == target){
                return true;
            }else if(midval < target){
                l = mid + 1;
            }
            else{
                r = mid - 1;
        }

        }


        return false;
    }
}