package Divide_and_Conquer_Algorithms;

public class Strassens_MatrixMultiplication
{
    static void Strassen_Matrix_Multiplication(int[][] A, int[][] B, int[][] C, int n)
    {
        int[][] P = new int[n][n];
        int[][] P1 = new int[n / 2][n / 2];
        int[][] P2 = new int[n / 2][n / 2];
        int[][] P3 = new int[n / 2][n / 2];
        int[][] P4 = new int[n / 2][n / 2];
        int[][] P5 = new int[n / 2][n / 2];
        int[][] P6 = new int[n / 2][n / 2];
        int[][] P7 = new int[n / 2][n / 2];
        int[][] M1 = new int[n / 2][n / 2];
        int[][] M2 = new int[n / 2][n / 2];
        int[][] M3 = new int[n / 2][n / 2];
        int[][] M4 = new int[n / 2][n / 2];
        int[][] M5 = new int[n / 2][n / 2];
        int[][] M6 = new int[n / 2][n / 2];
        int[][] M7 = new int[n / 2][n / 2];

        if (n == 2)
        {
            P[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
            P[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
            P[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
            P[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];
            C[0][0] = P[0][0];
            C[0][1] = P[0][1];
            C[1][0] = P[1][0];
            C[1][1] = P[1][1];
        }
        else
        {
            int n2 = n / 2;
            int[][] A11 = new int[n2][n2];
            int[][] A12 = new int[n2][n2];
            int[][] A21 = new int[n2][n2];
            int[][] A22 = new int[n2][n2];
            int[][] B11 = new int[n2][n2];
            int[][] B12 = new int[n2][n2];
            int[][] B21 = new int[n2][n2];
            int[][] B22 = new int[n2][n2];
            int[][] C11 = new int[n2][n2];
            int[][] C12 = new int[n2][n2];
            int[][] C21 = new int[n2][n2];
            int[][] C22 = new int[n2][n2];
        }
}

    public static void main(String[] args)
    {
        int[][] A = { { 1, 2 }, { 3, 4 } };
        int[][] B = { { 5, 6 }, { 7, 8 } };
        int[][] C = new int[2][2];

        Strassen_Matrix_Multiplication(A, B, C, 2);

        System.out.println("A = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }

        System.out.println("B = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(B[i][j] + " ");
            System.out.println();
        }

        System.out.println("C = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}
