package Implementation;

import java.util.Scanner;

/**
 * Bigger is Greater - https://www.hackerrank.com/challenges/bigger-is-greater
 * 
 * @author Teddy Todorov
 * @version Sep 22, 2016
 */

public class Bigger_is_Greater
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Bigger_is_Greater b = new Bigger_is_Greater();
        b.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++)
        {
            String sOrig = scan.nextLine();
            String sPerm = sOrig;

            if (nextLexicoPerm(sPerm).equals(sOrig))
            {
                System.out.println("no answer");
                continue;
            }

            while (sPerm.compareTo(sOrig) <= 0)
            {
                sPerm = nextLexicoPerm(sPerm);
            }
            System.out.println(sPerm);
        }
    }


    /**
     * Finds the next lexicographical permutation of a String input --
     * Reference:
     * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm --
     * 
     * @param input
     *            String to find permutation of.
     * @return Next lexicographical permutation of the String
     */
    public String nextLexicoPerm(String input)
    {
        char[] chars = input.toCharArray();

        int headLoc = input.length() - 1;

        // Look for position where value <= more-left-value
        while (headLoc > 0 && chars[headLoc] <= chars[headLoc - 1])
        {
            headLoc--;
        }

        if (headLoc <= 0)
        {
            return input;
        }

        int element = input.length() - 1;
        char pivotPoint = chars[headLoc - 1];

        while (chars[element] <= pivotPoint)
        {
            element--;
        }

        // Swap the pivot and rightmost element that is greater than in pivot
        // value -Denoted element

        chars[headLoc - 1] = chars[element];
        chars[element] = pivotPoint;

        // Reverse order of suffix
        int curPos = input.length() - 1;
        while (curPos > headLoc)
        {
            char temp = chars[headLoc];
            chars[headLoc] = chars[curPos];
            chars[curPos] = temp;
            curPos--;
            headLoc++;
        }

        String s = new String(chars);

        return s;
    }

}
