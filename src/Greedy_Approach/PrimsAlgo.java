package Greedy_Approach;

import java.util.Scanner;

public class PrimsAlgo {
    // Function to implement Prim's Algorithm using Greedy Approach
    static void primsAlgo(int[][] graph, int n) {
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

        // Print the key array
        System.out.println("The key array is : ");
        for (int i = 0; i < n; i++)
            System.out.print(key[i] + " ");

        // Print the minimum spanning tree
        System.out.println("\nThe minimum spanning tree is : ");
        for (int i = 1; i < n; i++)
            System.out.println(parent[i] + " " + i);

        // Print the total weight of the minimum spanning tree
        System.out.println("\nThe total weight of the minimum spanning tree is : " + key[n - 1]);
    }

    // Driver code to test above functions
    public static void main(String[] args) {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = scanner.nextInt();

        // Create the graph
        int[][] graph = new int[n][n];

        // Get the edges from the user
        System.out.println("Enter the edges (u v w) : ");
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph[u][v] = w;
            graph[v][u] = w;
        }

        // Call the primsAlgo function
        primsAlgo(graph, n);
    }
}
