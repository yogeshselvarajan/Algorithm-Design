package Exhaustive_Search_Algorithms;

import java.util.Scanner;

public class TravellingSalesManProblem
{
    // Functions to implement Travelling Salesman Problem using Exhaustive Search Algorithm
    static int travellingSalesmanProblem(int[] city, int[] distance, int n)
    {
        // Base Case
        if (n == 1)
            return distance[0];

        // Initialize result
        int min = Integer.MAX_VALUE;

        // Try all paths from city 0 to city n - 1
        for (int i = 0; i < n; i++)
        {
            // Store the result of subproblem
            int res = 0;

            // If current city is not visited
            if (city[i] == 0)
            {
                // Mark it as visited
                city[i] = 1;

                // Recur for remaining cities
                res = travellingSalesmanProblem(city, distance, n);

                // If the recursive call returns a smaller result, update the result
                min = Math.min(min, res);

                // Remove the city from the path
                city[i] = 0;
            }
        }

        // Return the minimum distance
        return min + distance[n - 1];
    }

    // Driver program to test above function
    public static void main(String[] args)
    {
       // City and distance of the cities from city 0
       // Get the city and distance from user
         Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of cities : ");
            int n = sc.nextInt();
            System.out.println("Enter the city and distance from city 0 : ");
            int city[] = new int[n];
            int distance[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                city[i] = sc.nextInt();
                distance[i] = sc.nextInt();
            }

        // Number of cities
        int n1 = city.length;

        // Print the minimum distance between all pairs of cities
        System.out.println("Minimum distance is " + travellingSalesmanProblem(city, distance, n1));

    }

}
