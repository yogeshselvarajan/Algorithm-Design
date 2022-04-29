package Dynamic_Programming;

public class MaximumFlowProblem {
    // Program to find the maximum flow in a given graph using Ford-Fulkerson algorithm
    static int fordFulkerson(int graph[][], int s, int t)
    {
        // Create a residual graph and fill the residual graph with given capacities in the original graph as residual capacities in residual graph
        int rGraph[][] = new int[graph.length][graph.length];
        for (int i = 0; i < graph.length; i++)
            for (int j = 0; j < graph.length; j++)
                rGraph[i][j] = graph[i][j];

        // Augment the flow while there is path from source to sink
        int path[][] = new int[graph.length][graph.length];
        int max_flow = 0; // There is no flow initially
        while (bfs(rGraph, s, t, path)) {
            // Find minimum residual capacity of the edges along the path filled by BFS. Or we can say find the maximum flow through the path found.
            int path_flow = Integer.MAX_VALUE;
            for (int v = t; v != s; v = path[v][0]) {
                int u = path[v][0];
                path_flow = Math.min(path_flow, rGraph[u][v]);
            }

            // update residual capacities of the edges and reverse edges along the path
            for (int v = t; v != s; v = path[v][0]) {
                int u = path[v][0];
                rGraph[u][v] -= path_flow;
                rGraph[v][u] += path_flow;
            }

            // Add path flow to overall flow
            max_flow += path_flow;
        }

        // Return the overall flow
        return max_flow;
    }

    // This function is called from fordFulkerson() to find a path from source to sink
    static boolean bfs(int graph[][], int s, int t, int path[][]) {
        // Create a visited array and mark all vertices as not visited
        boolean visited[] = new boolean[graph.length];

        // Create a queue, enqueue source vertex and mark source vertex as visited
        java.util.LinkedList<Integer> queue = new java.util.LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;

        // Standard BFS Loop
        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < graph.length; v++) {
                // If vertex v is not visited and there is an edge from u to v, then enqueue v
                if (!visited[v] && graph[u][v] > 0) {
                    queue.add(v);
                    visited[v] = true;
                    // Save u as parent of v
                    path[v][0] = u;
                }
            }
        }

        // If we reached sink in BFS starting from source, then return true, else false
        return (visited[t] == true);
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        // Create a graph given in the above diagram
        int graph[][] = new int[][]
                {
                {0, 10, 8, 0, 0, 0}, {0, 0, 2, 5, 0, 0},
                {0, 0, 0, 0, 10, 0}, {0, 0, 0, 0, 0, 7},
                {0, 0, 0, 8, 0, 10}, {0, 0, 0, 0, 0, 0}
        };

        int s = 0; // Source vertex
        int t = 5; // Sink vertex

        System.out.println("The maximum possible flow is " + fordFulkerson(graph, s, t));
    }

}
