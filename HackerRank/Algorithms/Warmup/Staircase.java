package Warmup;

import java.util.Scanner;

/**
 * Staircase - https://www.hackerrank.com/challenges/staircase
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
        StringBuilder stairs = new StringBuilder();
        StringBuilder spaces = new StringBuilder();

        for (int i = 0; i < count; i++)
        {
            spaces.append(" ");
        }

        stairs.append("#");

        for (int i = 1; i <= count; i++)
        {
            spaces.deleteCharAt(spaces.length() - 1);
            StringBuilder b = new StringBuilder();
            b.append(spaces);
            b.append(stairs);

            System.out.println(b);
            stairs.append("#");
        }
    }

}
