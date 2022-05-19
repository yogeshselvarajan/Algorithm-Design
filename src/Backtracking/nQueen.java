package Backtracking;

import java.util.Scanner;

class nQueen
{
    private int boardcnt = 0;

    boolean IsBoardOk (char chessboard[][], int row, int col)
    {

        // Check if there is a queen 'Q' positioned to the left of column col
        // on the same row.
        for (int c=0; c<col; c++) {
            if (chessboard[row][c] == 'Q') {
                return false;
            }
        }

        // Check if there is queen 'Q' positioned on the upper left diagonal
        for (int r=row-1, c=col-1; r >= 0 && c >= 0; r--, c--) {
            if (chessboard[r][c] == 'Q') {
                return false;
            }
        }

        // Check if there is queen 'Q' positioned on the lower left diagonal
        for (int r=row+1, c=col-1; c >= 0 && r<chessboard.length; r++, c--) {
            if (chessboard[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    void DisplayBoard (char chessboard[][])
    {

        for (int r=0; r<chessboard.length; r++) {
            for (int c=0; c<chessboard.length; c++) {
                System.out.print(chessboard[r][c]+" ");
            } System.out.println();
        }
    }

    void PlaceNQueens (char chessboard[][], int col)
    {

        // If all the columns have a queen 'Q', a solution has been found.
        if (col >= chessboard.length) {
            ++boardcnt;
            System.out.println("Board "+boardcnt);
            System.out.println("========================");
            DisplayBoard(chessboard);
            System.out.println("========================");

        } else {
            // Else try placing the queen on each row of the column and check if the chessboard remains OK.
            for (int row=0; row<chessboard.length; row++) {

                chessboard[row][col] = 'Q';

                if (IsBoardOk(chessboard, row, col) == true) {
                    //Chess board was OK, hence try placing the queen 'Q' in the next column.
                    PlaceNQueens(chessboard, col + 1);
                }
                chessboard[row][col] = '.'; // As previously placed queen was not valid, restore '.'
            }
        }
    }

    public static void main(String args[])
    {

        int N;

        Scanner obj_scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter chessboard size : ");

        N = obj_scanner.nextInt();  // Get user input

        char chessboard[][] = new char[N][N];

        for (int r=0; r<N; r++) {
            for (int c=0; c<N; c++) {
                chessboard[r][c] = '.';
            }
        }

        nQueen obj = new nQueen();

        // Start placing the queen 'Q' from the 0'th column.
        obj.PlaceNQueens(chessboard, 0);
    }
}

