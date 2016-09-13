package Warmup;

import java.util.Scanner;

/**
 * Staircase -
 * https://www.hackerrank.com/challenges/staircase?h_r=next-challenge&h_v=zen
 * 
 * @author Teddy
 */
public class Staircase
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Staircase s = new Staircase();
        s.start();
    }


    public void start()
    {
        int count = scan.nextInt();
        for (int i = 0; i < count; i++)
        {
            System.out.println(String.format("%" + (count - i) + "s",""));
        }
        for (int i = 1; i <= count; i++)
        {
            for (int q = 1; q <= count; q++)
            {
                if (i <= count - q)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
    }

}
