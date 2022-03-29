package com.algorithms;

import java.util.Scanner;

// Function to implement Insertion Sort Algorithm
public class InsertionSort
{
    public static void sort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int j = i;
            while (j > 0 && array[j - 1] > array[j])
            {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args)
    {
        // Getting input of the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();

        // Calling the function
        sort(array);

        // Displaying the result
        System.out.println("Sorted array:");
        for (int i : array)
            System.out.print(array[i] + " ");

    }
}
