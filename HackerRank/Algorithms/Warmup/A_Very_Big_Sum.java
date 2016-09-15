package Warmup;

import java.util.Scanner;

/**
 * 
 * A Very Big Sum - https://www.hackerrank.com/challenges/a-very-big-sum
 * 
 * @author Teddy
 *
 */
public class A_Very_Big_Sum
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        A_Very_Big_Sum s = new A_Very_Big_Sum();
        s.start();
    }


    public void start()
    {
        int elements = scan.nextInt();
        long sum = 0;
        for (int i = 0; i < elements; i++)
        {
            sum += scan.nextLong();
        }
        System.out.println(sum);
    }

}
