package Greedy_Approach;

public class KruskalAlgo
{
    // Function to implement the Kruskal's Algorithm using Greedy Approach
    static void kruskalAlgo(int[][] graph, int n)
    {
        // Initialize the parent array
        int[] parent = new int[n];

        // Initialize the key array
        int[] key = new int[n];

        // Initialize the mstSet array
        boolean[] mstSet = new boolean[n];

        // Initialize the minKey array
        int minKey = Integer.MAX_VALUE;

        // Initialize the minKeyIndex array
        int minKeyIndex = 0;

        // Initialize the parent of the first node
        parent[0] = -1;

        // Initialize the key of the first node
        key[0] = 0;

        // Initialize the mstSet array
        for (int i = 0; i < n; i++)
            mstSet[i] = false;

        // Loop through the nodes
        for (int i = 0; i < n; i++) {
            // Find the minimum key in the key array
            minKey = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++)
                if (mstSet[j] == false && key[j] < minKey) {
                    minKey = key[j];
                    minKeyIndex = j;
                }

            // Add the minimum key to the mstSet array
            mstSet[minKeyIndex] = true;

            // Update the key array
            for (int j = 0; j < n; j++)
                if (mstSet[j] == false && graph[minKeyIndex][j] < key[j])
                    key[j] = graph[minKeyIndex][j];

            // Update the parent array
            parent[minKeyIndex] = minKeyIndex;
        }

        // Print the parent array
        System.out.println("The parent array is : ");
        for (int i = 0; i < n; i++)
            System.out.print(parent[i] + " ");
        System.out.println();
    }

    // Driver code to test above function
    public static void main(String[] args)
    {
        int[][] graph = new int[][] { { 0, 2, 0, 6, 0 },
                                      { 2, 0, 3, 8, 5 },
                                      { 0, 3, 0, 0, 7 },
                                      { 6, 8, 0, 0, 9 },
                                      { 0, 5, 7, 9, 0 } };
        int n = 5;
        kruskalAlgo(graph, n);
    }
}
