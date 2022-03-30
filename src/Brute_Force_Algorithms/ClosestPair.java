package Brute_Force_Algorithms;

import java.awt.*;

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
        // Points created by inheriting the class "Point" of java
        Point[] points = {
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3),
                new Point(4, 4),
                new Point(5, 5),
                new Point(6, 6),
                new Point(7, 7),
                new Point(8, 8),
                new Point(9, 9)
                };

        // Printing the closest pair of points
        System.out.println("Closest pair of points is " + closestPair(points));
    }

}

