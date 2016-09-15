package Warmup;

import java.util.Scanner;

/**
 * Diagonal Difference -
 * https://www.hackerrank.com/challenges/diagonal-difference
 * 
 * @author Teddy
 */
public class Diagonal_Difference
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Diagonal_Difference d = new Diagonal_Difference();
        d.start();
    }


    public void start()
    {
        int elements = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < elements; i++)
        {
            for (int q = 0; q < elements; q++)
            {
                int num = scan.nextInt();
                if (i == q)
                {
                    sum1 += num;
                }
                if (Math.abs((elements - 1 - q)) == i)
                {
                    sum2 += num;
                }
            }
        }

        System.out.println(Math.abs(sum1 - sum2));
    }

}
