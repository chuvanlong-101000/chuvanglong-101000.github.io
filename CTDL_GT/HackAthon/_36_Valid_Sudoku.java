package HackAthon;

public class _36_Valid_Sudoku {
    
    public static boolean isValidSudoku(char[][] board) {
        int N = 9;
    
        // Khai báo mảng 2 chiều
        int[][] rows = new int[N][N]; //hàng
        int[][] cols = new int[N][N];  // cột 
        int[][] boxes = new int[N][N]; // chứa hàng và cột
    
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                // vị trí hàng bao nhiêu cột bao nhiêu
                if (board[r][c] == '.') {
                    continue;
                }
                int pos = board[r][c] - '1';
    
                // vị trí hàng
                if (rows[r][pos] == 1) {
                    return false;
                }
                rows[r][pos] = 1;
    
                // vị trí cột
                if (cols[c][pos] == 1) {
                    return false;
                }
                cols[c][pos] = 1;
    
                int idx = (r / 3) * 3 + c / 3;
                if (boxes[idx][pos] == 1) {
                    return false;
                }
                boxes[idx][pos] = 1;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        char [][] board = {
            {'5','3','.','.','7','.','.','.','.'}
           ,{'6','.','.','1','9','5','.','.','.'}
           ,{'.','9','8','.','7','.','.','6','.'}
           ,{'8','.','.','.','6','.','.','.','3'}
           ,{'4','.','.','8','.','3','.','.','1'}
           ,{'7','.','.','.','2','.','.','.','6'}
           ,{'.','6','.','.','.','.','2','8','.'}
           ,{'.','.','.','4','1','9','.','.','5'}
           ,{'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
