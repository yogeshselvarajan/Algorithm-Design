package Divide_and_Conquer_Algorithms;

import java.util.Scanner;

public class BinarySearch
{
    static int binarySearch(int[] arr, int key)
    {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        //Getting the array
        System.out.println("Enter the size of the array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        //Getting the key
        System.out.println("Enter the key to be searched :");
        int key = sc.nextInt();

        //Calling the binary search function
        int index = binarySearch(arr, key);

        //Printing the result
        if (index == -1)
            System.out.println("Key not found");
        else
            System.out.println("Key found at index " + index);
    }
}

