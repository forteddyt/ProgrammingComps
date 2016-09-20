package Implementation;

import java.util.Scanner;

/**
 * Divisible Sum Pairs -
 * https://www.hackerrank.com/challenges/divisible-sum-pairs
 * 
 * @author Teddy
 * @version Sep 20, 2016
 */

public class Divisible_Sum_Pairs
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Divisible_Sum_Pairs d = new Divisible_Sum_Pairs();
        d.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        int k = scan.nextInt();

        int ans = 0;

        int[] values = new int[n];
        for (int i = 0; i < n; i++)
        {
            values[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            for (int q = i + 1; q < n; q++)
            {
                if ((values[i] + values[q]) % k == 0)
                {
                    ans++;
                }
            }
        }

        System.out.println(ans);

    }

}
