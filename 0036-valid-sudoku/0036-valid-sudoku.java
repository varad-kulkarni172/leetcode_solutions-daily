public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] columns = new int[9];
        int[] squares = new int[9];

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(board[r][c] == '.'){
                    continue;
                }

                int val = board[r][c] - '1'; // Converting chars to int for 0-based indexing of bits

                if ((rows[r] & (1 << val)) > 0 || (columns[c] & (1 << val)) > 0 || (squares[(r / 3) * 3 + (c / 3)] & (1 << val)) > 0){
                    return false;
                }

                rows[r] |= (1 << val);
                columns[c] |= (1 << val);
                squares[(r / 3) * 3 + (c / 3)] |= (1 << val); // “take the binary number 1 and shift it left by val positions
            }
        }
        return true;
    }
}