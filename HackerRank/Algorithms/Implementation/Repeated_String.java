package Implementation;

import java.util.Scanner;

/**
 * Repeated String - https://www.hackerrank.com/challenges/repeated-string
 * 
 * @author Teddy Todorov
 * @version Sep 21, 2016
 */
public class Repeated_String
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Repeated_String s = new Repeated_String();
        s.start();
    }


    public void start()
    {
        String s = scan.nextLine();
        long n = scan.nextLong();
        long count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a')
            {
                count++;
            }
        }

        count *= n / s.length();

        for (int i = 0; i < n % s.length(); i++)
        {
            if (s.charAt(i) == 'a')
            {
                count++;
            }
        }

        System.out.println(count);
    }

}
