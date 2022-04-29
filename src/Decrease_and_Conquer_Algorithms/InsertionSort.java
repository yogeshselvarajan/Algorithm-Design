package Decrease_and_Conquer_Algorithms;

// Write a program that implements Insertion Sort using the following steps:
// 1. Create an empty sorted array.
// 2. Insert the first element of the given array into the sorted array.
// 3. Compare the second element of the given array with the first element of the sorted array.
// 4. If the second element of the given array is smaller than the first element of the sorted array, then swap them.
// 5. Continue this process until all the elements of the given array are inserted into the sorted array.
// 6. Print the sorted array.

import java.util.Scanner;

public class InsertionSort {
    // Function to sort the array using insertion sort algorithm
    static void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are
            // greater than key, to one position ahead
            // of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }
    public static void main(String[] args)
    {
        // Get the array from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        // Calling the insertion sort function
        insertionSort(arr);

        // Print the array
        System.out.println("The array is");
        for (int i : arr)
            System.out.print(i + " ");
    }
}