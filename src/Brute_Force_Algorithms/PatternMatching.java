package Brute_Force_Algorithms;

import java.util.Scanner;

public class PatternMatching
{
    static void BruteForcePatternMatching(String text, String pattern)
    {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i <= n - m; i++)
        {
            int j;
            for (j = 0; j < m; j++)
            {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }

            // Pattern Found
            if (j == m)
                System.out.println("Pattern found at index " + i);

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text : ");
        String text = sc.nextLine();
        System.out.println("Enter the pattern : ");
        String pattern = sc.nextLine();

        // Calling the Function
        BruteForcePatternMatching(text, pattern);

        sc.close();
    }
}
