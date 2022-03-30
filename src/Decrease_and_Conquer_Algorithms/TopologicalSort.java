package Decrease_and_Conquer_Algorithms;

public class TopologicalSort
{
    static int[] topologicalSort(int[][] graph)
    {
        int[] indegree = new int[graph.length];
        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j < graph[i].length; j++)
                indegree[graph[i][j]]++;

        int[] result = new int[graph.length];
        int index = 0;
        for (int i = 0; i < indegree.length; i++)
            if (indegree[i] == 0)
                result[index++] = i;
        return result;
    }

    public static void main(String[] args)
    {
        int[][] graph = new int[][]
                // Create a graph with the following edges:
                {
                    {1, 2},
                    {0, 3},
                    {1, 3},
                    {2, 4},
                    {3, 4},
                    {3, 5},
                    {4, 5}
                };

        int[] result = topologicalSort(graph);

        // Print the result
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
