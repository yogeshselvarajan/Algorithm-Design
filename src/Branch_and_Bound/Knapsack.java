package Branch_and_Bound;

import java.util.Scanner;

// Display the Algorithm for Knapsack Problem using Branch and Bound



public class Knapsack
{

    // Function to implement Knapsack Problem using Branch and Bound method
    public static int knapsack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n-1] > W)
            return knapsack(W, wt, val, n-1);

        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else return Math.max( val[n-1] + knapsack(W-wt[n-1], wt, val, n-1),
                              knapsack(W, wt, val, n-1) );
    }

    // Driver program to test above function
    public static void main(String args[])
    {
        // Get input from user
        System.out.println("Enter the number of items");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the capacity of the knapsack");
        int W = sc.nextInt();

        int wt[] = new int[n];
        int val[] = new int[n];

        System.out.println("Enter the weights of items");
        for(int i=0; i<n; i++)
            wt[i] = sc.nextInt();

        System.out.println("Enter the values of items");
        for(int i=0; i<n; i++)
            val[i] = sc.nextInt();
        System.out.println("Maximum Obtainable Value is " + knapsack(W, wt, val, n));
    }
}
