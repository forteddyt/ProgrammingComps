import java.util.ArrayList;
import java.util.Scanner;

/**
 * One-dimensional Japanese Crossword -
 * http://codeforces.com/contest/721/problem/0
 * 
 * @author Teddy Todorov
 * @version Sep 30, 2016
 */

public class OneD_Japanese_Crossword
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        OneD_Japanese_Crossword c = new OneD_Japanese_Crossword();
        c.start();
    }


    public void start()
    {
        scan.nextLine();

        char[] input = scan.nextLine().toCharArray();
        int groupCounter = 0;
        int setCounter = 0;

        ArrayList<Integer> setCounterList = new ArrayList<Integer>();

        for (int i = 0; i < input.length; i++)
        {
            char cCur = input[i];

            if (cCur == 'B')
            {
                setCounter++;
            }
            if ((cCur == 'W' || i == input.length - 1) && setCounter != 0)
            {
                groupCounter++;
                setCounterList.add(setCounter);
                setCounter = 0;
            }
        }

        System.out.println(groupCounter);
        for (Integer i : setCounterList)
        {
            System.out.print(i + " ");
        }
    }
}
