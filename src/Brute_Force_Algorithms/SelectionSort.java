package Brute_Force_Algorithms;

import java.util.Scanner;

public class SelectionSort
{
    static int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 2; i++)
        {
            int min = i;
            for (int j = i + 1; j < arr.length - 1; j++)
            {
                if (arr[j] < arr[min])
                    min = j;
            }

            // Swapping the elements
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args)
    {
        // Getting the input from the user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        // Calling the function
        selectionSort(arr);

        // Printing the sorted array
        System.out.println("Sorted array is");
        for (int i : arr)
            System.out.print(i + " ");
    }

}

