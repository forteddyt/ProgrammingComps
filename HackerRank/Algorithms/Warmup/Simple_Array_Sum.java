package Warmup;

import java.util.Scanner;

/**
 * Simple Array Sum - https://www.hackerrank.com/challenges/simple-array-sum
 * 
 * @author Teddy
 */

public class Simple_Array_Sum
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Simple_Array_Sum s = new Simple_Array_Sum();
        s.start();
    }


    public void start()
    {
        int total = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < total; i++)
        {
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }

}
