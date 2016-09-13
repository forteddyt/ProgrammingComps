package Warmup;

import java.util.Scanner;

/**
 * Plus Minus -
 * https://www.hackerrank.com/challenges/plus-minus?h_r=next-challenge&h_v=zen
 * 
 * @author Teddy
 */
public class Plus_Minus
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Plus_Minus p = new Plus_Minus();
        p.start();
    }


    public void start()
    {
        int t = scan.nextInt();
        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < t; i++)
        {
            int num = scan.nextInt();
            if (num < 0)
            {
                neg++;
            }
            else if (num > 0)
            {
                pos++;
            }
            else
            {
                zero++;
            }
        }
        System.out.println(1.0 * pos / t);
        System.out.println(1.0 * neg / t);
        System.out.println(1.0 * zero / t);
    }

}
