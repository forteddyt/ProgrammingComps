package Warmup;

import java.util.Scanner;

/**
 * 
 * Compare the Triplets - https://www.hackerrank.com/challenges/compare-the-triplets
 * 
 * @author Teddy
 *
 */
public class Compare_the_Triplets
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Compare_the_Triplets c = new Compare_the_Triplets();
        c.start();
    }


    public void start()
    {
        int[] tripletA = new int[3];
        int scoreAlice = 0;
        int scoreBob = 0;
        for (int i = 0; i < 3; i++)
        {
            tripletA[i] = scan.nextInt();
        }

        for (int i = 0; i < 3; i++)
        {
            int b = scan.nextInt();
            if (b < tripletA[i])
            {
                scoreAlice++;
            }
            else if (b > tripletA[i])
            {
                scoreBob++;
            }
        }
        System.out.println(scoreAlice + " " + scoreBob);
    }
}
