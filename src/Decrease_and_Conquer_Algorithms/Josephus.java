package Decrease_and_Conquer_Algorithms;

import java.util.Scanner;

public class Josephus
{
    static int josephus(int n, int k)
    {
        if (n == 1)
        {
            return 1;
        }
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the number of people in the circle : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of people to be killed : ");
        int k = sc.nextInt();

        System.out.println("Safe Position : " +josephus(n,k));
    }
}
