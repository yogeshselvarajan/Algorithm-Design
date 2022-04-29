package Brute_Force_Algorithms;

import java.awt.*;
import java.util.Scanner;

public class ClosestPair
{
    // Function to calculate distance between two points
    static float distance(Point p1, Point p2)
    {
        return (float)Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    // Function to find the closest pair of points in an array of points
    static float closestPair(Point[] points)
    {
        // Setting Infinity Value 
        float min = Float.MAX_VALUE;
        for (int i = 0; i < points.length; i++)
        {
            for (int j = i + 1; j < points.length; j++)
            {
                float dist = distance(points[i], points[j]);
                if (dist < min)
                    min = dist;
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        // Get the points from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of points : ");
        int n = sc.nextInt();
        Point[] points = new Point[n];
        System.out.println("Enter the points : ");
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter x and y coordinates : ");
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        // Printing the closest pair of points
        System.out.println("Closest pair of points is " + closestPair(points));
    }

}

