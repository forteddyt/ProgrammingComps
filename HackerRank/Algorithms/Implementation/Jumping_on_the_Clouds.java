package Implementation;

import java.util.Scanner;

/**
 * Jumping on the Clouds =
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds
 * 
 * @author Teddy Todorov
 * @version Sep 21, 2016
 */
public class Jumping_on_the_Clouds
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Jumping_on_the_Clouds c = new Jumping_on_the_Clouds();
        c.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        int[] clouds = new int[n];

        for (int i = 0; i < n; i++)
        {
            clouds[i] = scan.nextInt();
        }

        int pos = 0;
        int jumpCount = 0;

        while (pos < clouds.length - 1)
        {
            if (pos + 2 < clouds.length && clouds[pos + 2] == 0)
            {
                pos += 2;
            }
            else if (clouds[pos + 1] == 0)
            {
                pos++;
            }
            jumpCount++;
        }

        System.out.println(jumpCount);

        // System.out.println(jumpClouds(clouds, 0));
    }

    /*
     * Failed recursive attempt :/ public int jumpClouds(int[] clouds, int
     * cloudPosition) { if (cloudPosition >= clouds.length - 1) { return 1; } if
     * (clouds[cloudPosition] == 1) { return 10000; } return
     * Math.min(jumpClouds(clouds, cloudPosition + 1), jumpClouds( clouds,
     * cloudPosition + 2)); }
     */

}
