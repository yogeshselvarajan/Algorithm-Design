package Divide_and_Conquer_Algorithms;

import java.util.Scanner;

public class QuickSort
{
    public static void sort(int[] a, int low, int high)
    {
        if(low < high)
        {
            int p = partition(a, low, high);
            sort(a, low, p-1);
            sort(a, p+1, high);
        }
    }

    private static int partition(int[] a, int low, int high)
    {
        int pivot = a[high];
        int i = low - 1;
        for(int j = low; j < high; j++)
        {
            if(a[j] <= pivot)
            {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i+1, high);
        return i+1;
    }

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args)
    {
        // Get the input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        // Sort the array
        sort(a, 0, n-1);

        // Print the sorted array
        System.out.println("The sorted array is : ");
        for(int i : a)
            System.out.print(i + " ");

    }
}
