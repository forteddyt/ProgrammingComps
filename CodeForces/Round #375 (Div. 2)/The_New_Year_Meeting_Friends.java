import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The New Year: Meeting Friends: http://codeforces.com/contest/723/problem/A
 * 
 * @author Teddy Todorov
 * @version Oct 3, 2016
 */
public class The_New_Year_Meeting_Friends
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        The_New_Year_Meeting_Friends n = new The_New_Year_Meeting_Friends();
        n.start();
    }


    public void start()
    {
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        ArrayList<Integer> sortMe = new ArrayList<Integer>();
        sortMe.add(n1);
        sortMe.add(n2);
        sortMe.add(n3);

        Collections.sort(sortMe);

        int midPoint = sortMe.get(1);
        int minDis = 0;

        for (int i = 0; i < 3; i++)
        {
            minDis += Math.abs(sortMe.get(i) - midPoint);
        }

        System.out.println(minDis);
    }

}
