package Transform_and_Conquer_Algorithms;

import java.util.Scanner;

public class HeapSort {

    // Write a program that implements Heap Sort using the following steps:
    // 1. Create a max heap from the given array.
    // 2. Swap the first element of the array with the last element.
    // 3. Remove the last element from the array.
    // 4. Repeat steps 2 and 3 until the array has only one element.
    // 5. Repeat steps 1 and 4 until the array is sorted.

    // Build a heap using Bottom-Up approach
    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // main function to do heap sort
    static void heapSort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // A utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Function to print the level order traversal of Bottom Up Heap Constructed
    // from the given array
    static void printLevelOrder(int arr[]) {
        int n = arr.length;
        int i, j, k;
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                if (arr[j] == i) {
                    System.out.print(arr[j] + " ");
                    for (k = 0; k < n; k++)
                        if (arr[k] == j + 1) {
                            System.out.print(arr[k] + " ");
                            break;
                        }
                    }
            }


    // Driver program to test above functions
    public static void main(String[] args) {
       // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Print original array
        System.out.println("The original array is");
        printArray(arr);

        // Sort the array
        heapSort(arr);

        // Print the sorted array
        System.out.println("The sorted array is");
        printArray(arr);
    }
}

