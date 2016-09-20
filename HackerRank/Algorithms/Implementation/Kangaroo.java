package Implementation;

import java.util.Scanner;

/**
 * Kangaroo - https://www.hackerrank.com/challenges/kangaroo
 * 
 * @author Teddy
 * @version Sep 20, 2016
 */

public class Kangaroo
{
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Kangaroo k = new Kangaroo();
        k.start();
    }


    public void start()
    {
        int x1 = scan.nextInt();
        int v1 = scan.nextInt();
        int x2 = scan.nextInt();
        int v2 = scan.nextInt();

        if (v1 > v2)
        {
            while (x1 <= x2)
            {
                if (x1 == x2)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
                else
                {
                    x1 += v1;
                    x2 += v2;
                }
            }
        }
        else if (v2 > v1)
        {
            while (x2 <= x1)
            {
                if (x2 == x1)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
                else
                {
                    x1 += v1;
                    x2 += v2;
                }
            }
        }

        System.out.println("NO");
    }

}
