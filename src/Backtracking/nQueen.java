package Backtracking;

import java.util.Scanner;

public class nQueen
{
    /**
     * Algorithm nQueen(n)
     * 1. for i = 1 to n
     * 2.   for j = 1 to n
     * 3. for k = 1 to n
     * 4.   if A[i][j] = 0
     * 5.       A[i][j] = 1
     * 6.       if isSafe(A, i, j)
     * 7.           printSolution(A)
     * 8.       end if
     * 9.       A[i][j] = 0
     * 10.   end if
     * 11. end for
     * 12. end for
     * 13. end for
     * 14. end
     */

    // Function to implement the nQueen algorithm
    static void nQueen(int n) {
        int A[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = 0;
            }
        }
        nQueenUtil(A, 0);
    }


    private static void nQueenUtil(int[][] a, int i)
    {
        int n = a.length;
        if (i == n) {
            printSolution(a);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(a, i, j)) {
                a[i][j] = 1;
                nQueenUtil(a, i + 1);
                a[i][j] = 0;
            }
        }
    }

    private static boolean isSafe(int[][] a, int i, int j)
    {
        int n = a.length;
        for (int k = 0; k < n; k++) {
            if (a[i][k] == 1 || a[k][j] == 1) {
                return false;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (a[k][l] == 1) {
                    if (Math.abs(k - i) == Math.abs(l - j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static void printSolution(int[][] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // Get the input from the user
        System.out.println("Enter the number of queens:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Number of queens
        nQueen(n);
    }

}
