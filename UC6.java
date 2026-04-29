public class UC6 {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void main(String[] args) {
        int row = 1;
        int col = 1;
        char symbol = 'X';

        if (isValidMove(row, col)) {
            placeMove(row, col, symbol);
            printBoard();
        } else {
            System.out.println("Invalid move");
        }
    }

    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != ' ') {
            return false;
        }
        return true;
    }

    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }
}