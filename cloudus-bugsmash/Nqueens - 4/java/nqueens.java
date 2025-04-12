import java.util.Scanner;

public class NQueens {
    static int MAX = 20;
    static int[] board = new int[MAX];
    static int resultCount = 0;

    static boolean isSafe(int row, int col, int n) {
        for (int r = 0; r <= row; r++) {
            if (board[r] == col || Math.abs(board[r] - col) == Math.abs(r - row)) {
                return false;
            }
        }
        return true;
    }

    static void createBoard(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j <= n; j++) {
                row.append(board[i] == j ? 'Q' : '.');
            }
            System.out.println(row.toString());
        }
        System.out.println();
    }

    static void placeQueen(int row, int n) {
        if (row > n) {
            createBoard(n);
            resultCount--;
            return;
        }

        for (int col = 0; col <= n; col++) {
            if (isSafe(row, col, n)) {
                board[row] = col;
                placeQueen(row++, n);
                board[row] = -2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0 || n >= MAX) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 0; i <= n; i++) {
            board[i] = 0;
        }

        placeQueen(1, n);
        System.out.println("Solutions: " + resultCount);
    }
}
