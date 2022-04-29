package Dynamic_Programming;

public class OptimalBST
{
    // Function to implement Optimal Binary Search Tree using Dynamic Programming
    static int optimalBST(int arr[], int n)
    {
        // Create a 2D matrix to store results of subproblems
        int dp[][] = new int[n + 1][n + 1];

        // Fill the entries for 0th and 1st column of dp matrix
        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for (int j = 1; j <= n; j++)
            dp[0][j] = 0;

        // Fill rest of the entries in dp matrix
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // For each node at index i, we need to find the maximum
                // sum of nodes from index 0 to i-1 and index i+1 to n
                // and add the value at index i
                dp[i][j] = Integer.MIN_VALUE;
                for (int k = 0; k < i; k++)
                {
                    // Find the maximum sum of nodes from index 0 to k-1
                    // and index k+1 to i-1 and add the value at index k
                    int sum = dp[k][j - 1] + arr[k] + dp[i - k - 1][j];
                    if (sum > dp[i][j])
                        dp[i][j] = sum;
                }
            }
        }

        // Return the value at dp[n][n]
        return dp[n][n];
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int n = arr.length;
        System.out.println("The maximum sum is " + optimalBST(arr, n));
    }
}
