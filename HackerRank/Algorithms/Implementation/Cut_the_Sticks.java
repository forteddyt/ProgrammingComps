package Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Cut the Sticks - https://www.hackerrank.com/challenges/cut-the-sticks
 * 
 * @author Teddy
 * @version Sep 20, 2016
 */

public class Cut_the_Sticks
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Cut_the_Sticks s = new Cut_the_Sticks();
        s.start();
    }


    public void start()
    {
        int n = scan.nextInt();

        ArrayList<Integer> sticks = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
        {
            sticks.add(scan.nextInt());
        }

        Collections.sort(sticks);

        while (sticks.size() > 0)
        {
            System.out.println(sticks.size());
            int smallest = sticks.get(0);
            for (int i = 0; i < sticks.size(); i++)
            {
                sticks.set(i, sticks.get(i) - smallest);
            }

            while (sticks.contains(0))
            {
                sticks.remove((Integer)0);
            }

            Collections.sort(sticks);
        }
    }

}
