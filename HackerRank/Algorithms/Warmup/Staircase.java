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
        String spaces = "";

        stairs.append("#");

        for (int i = 1; i <= count; i++)
        {
            spaces = String.format("%" + ((count != i)
                ? (Integer)(count - i)
                : "") + "s", "");
            System.out.println(spaces + stairs);
            stairs.append("#");
        }
    }

}
