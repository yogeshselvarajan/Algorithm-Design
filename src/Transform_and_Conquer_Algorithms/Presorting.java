package Transform_and_Conquer_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Presorting
{
    static void presort(int[] a, int lo, int hi)
    {
        if(hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        presort(a, lo, mid);
        presort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    static void merge(int[] a, int lo, int mid, int hi)
    {
        int[] temp = new int[hi - lo + 1];
        int i = lo;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= hi)
        {
            if(a[i] < a[j])
                temp[k++] = a[i++];
            else
                temp[k++] = a[j++];
        }
        while(i <= mid)
            temp[k++] = a[i++];
        while(j <= hi)
            temp[k++] = a[j++];
        for(i = 0; i < temp.length; i++)
            a[lo + i] = temp[i];
    }

    public static void main(String[] args)
    {
        // Get array from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("The unsorted array is: " + Arrays.toString(a));

        // Sort array
        presort(a, 0, a.length - 1);
        // Print array
        System.out.println(Arrays.toString(a));
    }
}

