import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Passwords - http://codeforces.com/contest/721/problem/B
 * 
 * @author Teddy
 * @version Oct 4, 2016
 */
public class Passwords
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Passwords p = new Passwords();
        p.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        int k = scan.nextInt();
        scan.nextLine();

        ArrayList<Attempt> passwordList = new ArrayList<Attempt>();

        for (int i = 0; i < n; i++)
        {
            passwordList.add(new Attempt(scan.nextLine()));
        }

        String myPassword = scan.nextLine();

        Collections.sort(passwordList);

        int lockOutLife = k;
        int timeShortest = 0;
        int maxCount = 0;

        for (Attempt a : passwordList)
        {
            if (a.getString().length() < myPassword.length())
            {
                lockOutLife--;
                timeShortest++;
            }
            if (a.getString().length() < myPassword.length()
                && lockOutLife == 0)
            {
                timeShortest += 5;
                lockOutLife = k;
            }
            if (a.getString().length() == myPassword.length())
            {
                maxCount++;
            }
            if (a.getString().length() > myPassword.length())
            {
                break;
            }
        }

        int timeLongest = timeShortest;
        for (int i = 0; i < maxCount; i++)
        {
            if (lockOutLife == 0)
            {
                timeLongest += 5;
                lockOutLife = k;
            }

            timeLongest++;
            lockOutLife--;
        }

        System.out.print((timeShortest + 1) + " " + timeLongest);
    }


    private class Attempt implements Comparable<Attempt>
    {
        String myString;


        public Attempt(String s)
        {
            myString = s;
        }


        public String getString()
        {
            return myString;
        }


        @Override
        public int compareTo(Attempt o)
        {
            return myString.length() - o.getString().length();
        }
    }

}
