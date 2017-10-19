import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TokenChain
{
    private static Scanner scan;


    public static void main(String[] args)
    {
        scan = new Scanner(System.in);

    }


    private class HashChain
    {
        ArrayList<HashMap<String, Integer>> votes =
            new ArrayList<HashMap<String, Integer>>();
        // Each ArrayList slot defines a sequence position which has a running
        // sum of votes on which number is the 'correct' number
        //
        // S1->E1, S1->2->E1, S1->1->2->3->E1, S1->
        // ie. [ h1, h2, h3 ]
        // h1 = {1: 1, 2: 1, }
        // h2 = {2: 1}
        // h3 = {3: 1}
        String                              start;
        String                              end;


        public HashChain()
        {

        }
    }


    private class Sequence implements Comparable<Sequence>
    {
        int                length;
        boolean            isValid;
        ArrayList<Integer> contents;


        public Sequence()
        {
            contents = new ArrayList<Integer>();
        }


        @Override
        public int compareTo(Sequence o)
        {
            if (o.isValid && !this.isValid)
            { // Validity is most important
                return -1;
            }
            else if (this.isValid && !o.isValid)
            {
                return 1;
            }
            else
            {
                return this.length - o.length;
            }
        }
    }
}
