package Implementation;

import java.util.Scanner;

/**
 * Angry Professor - https://www.hackerrank.com/challenges/angry-professor
 * 
 * @author Teddy
 * @version Sep 20, 2016
 */

public class Angry_Professor
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Angry_Professor msTorrero = new Angry_Professor();
        msTorrero.start();
    }


    public void start()
    {
        int t = scan.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            int minOnTime = scan.nextInt();
            int sumOnTime = 0;
            for (int q = 0; q < n; q++)
            {
                if (scan.nextInt() <= 0)
                {
                    sumOnTime++;
                }
            }
            if (sumOnTime < minOnTime)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
