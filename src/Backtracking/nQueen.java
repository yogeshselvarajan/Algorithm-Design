package Backtracking;

import java.util.Scanner;

class nQueen
{
    private int boardcnt = 0;

    boolean IsBoardOk (char chessboard[][], int row, int col)
    {


        for (int c=0; c<col; c++) {
            if (chessboard[row][c] == 'Q') {
                return false;
            }
        }

        for (int r=row-1, c=col-1; r >= 0 && c >= 0; r--, c--) {
            if (chessboard[r][c] == 'Q') {
                return false;
            }
        }


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


        if (col >= chessboard.length) {
            ++boardcnt;
            System.out.println("Board "+boardcnt);
            System.out.println("========================");
            DisplayBoard(chessboard);
            System.out.println("========================");

        } else {

            for (int row=0; row<chessboard.length; row++) {

                chessboard[row][col] = 'Q';

                if (IsBoardOk(chessboard, row, col) == true) {
                    PlaceNQueens(chessboard, col + 1);
                }
                chessboard[row][col] = '.';
            }
        }
    }

    public static void main(String args[])
    {

        int N;

        Scanner obj_scanner = new Scanner(System.in);
        System.out.print("Enter chessboard size : ");

        N = obj_scanner.nextInt();

        char chessboard[][] = new char[N][N];

        for (int r=0; r<N; r++) {
            for (int c=0; c<N; c++) {
                chessboard[r][c] = '.';
            }
        }

        nQueen obj = new nQueen();


        obj.PlaceNQueens(chessboard, 0);
    }
}

