package Dynamic_Programming;

import java.util.Scanner;

public class KnapsackProblem
{

    // Function to implement Knapsack Problem using Dynamic Programming Approach
    static int knapsack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W)
            return knapsack(W, wt, val, n - 1);

        // return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return Math.max(val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1),
                    knapsack(W, wt, val, n - 1));
    }

    public static void main(String[] args)
    {
       // Get the inputs from user
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of items : ");
            int n = sc.nextInt();
            System.out.println("Enter the weights of the items : ");
            int wt[] = new int[n];
            for (int i = 0; i < n; i++)
                wt[i] = sc.nextInt();
            System.out.println("Enter the values of the items : ");
            int val[] = new int[n];
            for (int i = 0; i < n; i++)
                val[i] = sc.nextInt();
            System.out.println("Enter the capacity of the Knapsack : ");
            int W = sc.nextInt();

        System.out.println("If we take item " + n + " (wt = " + wt[n - 1] + ",  val = " + val[n - 1] + ")");
        System.out.println("Then the maximum value we can get = " + (val[n - 1] + knapsack(W - wt[n - 1], wt, val, n - 1)));
        System.out.println("If we don't include item " + n);
        System.out.println("Then the maximum value we can get = " + knapsack(W, wt, val, n - 1));
    }
}
