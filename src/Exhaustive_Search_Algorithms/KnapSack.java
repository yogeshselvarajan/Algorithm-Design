package Exhaustive_Search_Algorithms;

public class KnapSack
{
    static void knapSack(int W, int[] wt, int[] val, int n)
    {
        int i, w;
        int K[][] = new int[n+1][W+1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++)
        {
            for (w = 0; w <= W; w++)
            {
                if (i==0 || w==0)
                    K[i][w] = 0;
                else if (wt[i-1] <= w)
                    K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                else
                    K[i][w] = K[i-1][w];
            }
        }

        int res = K[n][W];
        System.out.println("Total value of items taken is " + res);
    }

    public static void main(String[] args)
    {
      // Get input from user
        System.out.println("Enter the number of items");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("Enter the capacity of the knapsack");
        int W = Integer.parseInt(System.console().readLine());

        int wt[] = new int[n];
        int val[] = new int[n];

        System.out.println("Enter the weights of items");
        for(int i=0; i<n; i++)
            wt[i] = Integer.parseInt(System.console().readLine());

        System.out.println("Enter the values of items");
        for(int i=0; i<n; i++)
            val[i] = Integer.parseInt(System.console().readLine());

        knapSack(W, wt, val, n);
    }

}

