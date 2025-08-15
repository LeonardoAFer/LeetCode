package Valid_Sudoku;

import java.util.HashMap;
import java.util.Map;

//36. Valid Sudoku - Medium

public class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };


        solution.isValidSudoku(board);

    }

    public boolean isValidSudoku(char[][] board) {

        HashMap<String, Integer> integerCountMap = new HashMap<>();
        Map<Integer, HashMap<String, Integer>> boxMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            boxMap.put(i, new HashMap<>());
        }

        for (int x = 0; x < 9; x++) {
            integerCountMap.clear();

            for (int y = 0; y < 9; y++) {
                String value = String.valueOf(board[x][y]);
                if (value.equals(".")) continue;

                if (integerCountMap.containsKey(value)) {
                    return false;
                } else {
                    integerCountMap.put(value, 1);
                }
            }

            integerCountMap.clear();

            for (int y = 0; y < 9; y++) {
                String value = String.valueOf(board[y][x]);
                if (value.equals(".")) continue;

                if (integerCountMap.containsKey(value)) {
                    return false;
                } else {
                    integerCountMap.put(value, 1);
                }
            }

            for (int y = 0; y < 9; y++) {
                String value = String.valueOf(board[x][y]);
                if (value.equals(".")) continue;

                int boxIndex = (x / 3) * 3 + (y / 3);
                HashMap<String, Integer> currentBox = boxMap.get(boxIndex);

                if (currentBox.containsKey(value)) {
                    return false;
                } else {
                    currentBox.put(value, 1);
                }
            }
        }
        return true;
    }
}

//Input
//        board =
//[["8","3",".",".","7",".",".",".","."],["6",".",".","1","9","5",".",".","."],[".","9","8",".",".",".",".","6","."],["8",".",".",".","6",".",".",".","3"],["4",".",".","8",".","3",".",".","1"],["7",".",".",".","2",".",".",".","6"],[".","6",".",".",".",".","2","8","."],[".",".",".","4","1","9",".",".","5"],[".",".",".",".","8",".",".","7","9"]]
//Output
//false
//Expected
//false
