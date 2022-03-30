package Brute_Force_Algorithms;

import java.util.Scanner;

public class BubbleSort
{
    // Function to sort the array using bubble sort algorithm
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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

        // Calling the bubble sort function
        bubbleSort(arr);

        // Print the array
        System.out.println("The array is");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
