package Implementation;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Non-Divisible Subset -
 * https://www.hackerrank.com/challenges/non-divisible-subset
 * 
 * @author Teddy Todorov
 * @version Sep 21, 2016
 */
public class NonDivisible_Subset
{

    private Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        NonDivisible_Subset s = new NonDivisible_Subset();
        s.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] vals = new int[n];

        Set<Integer> ans = new TreeSet<Integer>();

        for (int i = 0; i < n; i++)
        {
            vals[i] = scan.nextInt();
        }

        System.out.println(ans.size());
    }
}
