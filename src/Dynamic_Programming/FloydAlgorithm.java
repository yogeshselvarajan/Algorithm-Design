package Dynamic_Programming;

public class FloydAlgorithm
{
    // Program to implement the Floyd-Warshall Algorithm
    // to find the shortest path between all pairs of vertices

    // Function to find the shortest path between all pairs of vertices using Dynamic Programming
    static void floydWarshall(int[][] graph)
    {
        // Number of vertices in the graph
        int V = graph.length;

        // Iterate from all vertices to all other vertices
        for (int k = 0; k < V; k++)
        {
            // Iterate from all vertices to all other vertices
            for (int i = 0; i < V; i++)
            {
                // Iterate from all vertices to all other vertices
                for (int j = 0; j < V; j++)
                {
                    // If vertex k is on the shortest path from i to j, then update the value of graph[i][j]
                    if (graph[i][k] + graph[k][j] < graph[i][j])
                        graph[i][j] = graph[i][k] + graph[k][j];
                }
            }
        }
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
       // Create a graph with just 3 vertices
         int graph[][] = new int[][]
                 {
                 { 0, 4, 7 },
                 { 1, 0, 2},
                 { 6, Integer.MAX_VALUE,0}
                 };

        // Print the solution
        floydWarshall(graph);
        System.out.println("Following matrix shows the shortest distances between every pair of vertices");
        for (int i = 0; i < graph.length; i++)
        {
            for (int j = 0; j < graph.length; j++)
                System.out.print(graph[i][j] + " ");
            System.out.println();
        }
    }
}

