package Warmup;

import java.util.Scanner;

/**
 * Time Conversion - https://www.hackerrank.com/challenges/time-conversion
 * 
 * @author Teddy
 */
public class Time_Conversion
{
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Time_Conversion t = new Time_Conversion();
        t.start();
    }


    public void start()
    {
        char[] time = scan.nextLine().toCharArray();

        StringBuilder ans = new StringBuilder();

        String h = time[0] + "" + time[1];
        int n = Integer.parseInt(h);

        if (time[time.length - 2] == 'P')
        {
            if (n < 12)
            {
                n += 12;
            }
            ans.append(n + ":");
        }
        else if (time[time.length - 2] == 'A')
        {
            if (n == 12)
            {
                n = 0;
            }
            if (n < 10)
            {
                ans.append("0" + n + ":");
            }
            else
            {
                ans.append(time[0] + "" + time[1] + ":");
            }
        }
        ans.append(time[3] + "" + time[4] + ":");
        ans.append(time[6] + "" + time[7]);
        System.out.println(ans);
    }
}
