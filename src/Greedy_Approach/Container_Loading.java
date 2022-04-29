package Greedy_Approach;

import java.util.Scanner;

public class Container_Loading
{
    // Write a program to implement the loading of containers using Greedy Approach
    // The program should take the number of containers and the capacity of each container as input.
    // The program should output the number of containers that can be loaded.
    // The program should also output the number of containers that are loaded.
    // The program should also output the number of containers that are not loaded.


    // Function to implement the loading of containers using Greedy Approach
    static int loadContainers(int[] containerCapacity, int[] containerLoaded, int[] containerUnloaded)
    {
        // Sort the containerCapacity array in descending order
        int n = containerCapacity.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (containerCapacity[j] < containerCapacity[j+1])
                {
                    // swap temp and arr[i]
                    int temp = containerCapacity[j];
                    containerCapacity[j] = containerCapacity[j+1];
                    containerCapacity[j+1] = temp;
                }
            }
        }

        // Initialize the containerLoaded array
        for (int i = 0; i < n; i++)
            containerLoaded[i] = 0;

        // Initialize the containerUnloaded array
        for (int i = 0; i < n; i++)
            containerUnloaded[i] = 0;

        // Initialize the number of containers that are loaded
        int numContainersLoaded = 0;

        // Initialize the number of containers that are not loaded
        int numContainersUnloaded = 0;

        // Load the containers
        for (int i = 0; i < n; i++)
        {
            // If the container is not loaded
            if (containerLoaded[i] == 0)
            {
                // If the containerCapacity is greater than the containerLoaded array
                if (containerCapacity[i] > containerLoaded[i])
                {
                    // Load the container
                    containerLoaded[i] = containerCapacity[i];

                    // Increment the number of containers that are loaded
                    numContainersLoaded++;
                }
                else
                {
                    // Increment the number of containers that are not loaded
                    numContainersUnloaded++;
                }
            }
        }

        // Return the number of containers that are loaded
        return numContainersLoaded;
    }

    // Driver code to test above functions using user input
    public static void main(String[] args)
    {
        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of containers: ");
        int numContainers = scanner.nextInt();

        // Create an array to store the capacity of each container
        int[] containerCapacity = new int[numContainers];

        // Create an array to store the number of containers that are loaded
        int[] containerLoaded = new int[numContainers];

        // Create an array to store the number of containers that are not loaded
        int[] containerUnloaded = new int[numContainers];

        // Get the capacity of each container
        System.out.println("Enter the capacity of each container: ");
        for (int i = 0; i < numContainers; i++)
            containerCapacity[i] = scanner.nextInt();

        // Load the containers
        int numContainersLoaded = loadContainers(containerCapacity, containerLoaded, containerUnloaded);

        // Print the number of containers that are loaded
        System.out.println("The number of containers that are loaded: " + numContainersLoaded);

        // Print the number of containers that are not loaded
        System.out.println("The number of containers that are not loaded: " + (numContainers - numContainersLoaded));

        // Print the number of containers that are loaded
        System.out.println("The number of containers that are loaded: ");
        for (int i = 0; i < numContainers; i++)
            System.out.print(containerLoaded[i] + " ");
        System.out.println();

        // Print the number of containers that are not loaded
        System.out.println("The number of containers that are not loaded: ");
        for (int i = 0; i < numContainers; i++)
            System.out.print(containerUnloaded[i] + " ");
        System.out.println();
    }
}
