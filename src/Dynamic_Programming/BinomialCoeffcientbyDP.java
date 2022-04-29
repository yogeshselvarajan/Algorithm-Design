package Dynamic_Programming;

import java.util.Scanner;

public class BinomialCoeffcientbyDP
{
    // Function to implement Binomial Coefficient using Dynamic Programming
    static int binomialCoeff(int n, int k)
    {
        // Base Cases
        if (k == 0 || k == n)
            return 1;

        // Recur
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }

    // Driver program to test above function by user input
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println("The value of Binomial Coefficient C(" + n + ", " + k + ") is " + binomialCoeff(n, k));
    }
}
