import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Text Document Analysis - http://codeforces.com/contest/723/problem/B
 * 
 * @author Teddy Todorov
 * @version Oct 3, 2016
 */
public class Text_Document_Analysis
{

    Scanner scan = new Scanner(System.in);
    Pattern noParen = Pattern.compile("\\w*");
    Pattern paren = Pattern.compile("\\(\\w*\\)");
    Matcher m1, m2;


    public static void main(String[] args)
    {
        Text_Document_Analysis t = new Text_Document_Analysis();
        t.start();
    }


    public void start()
    {
        scan.nextLine();
        String s = scan.nextLine();

        m2 = paren.matcher(s);
        int parenCounter = 0;

        while (m2.find())
        {
            String myString = m2.group().replaceAll("\\(|\\)|", "");
            String[] bleh = myString.split("_+");
            for (int i = 0; i < bleh.length; i++)
            {
                String string = bleh[i];
                if (string.length() == 0)
                {
                    parenCounter--;
                }
            }
            parenCounter += bleh.length;
            s = s.replace(m2.group(), "_");
        }

        m1 = noParen.matcher(s);
        int longest = 0;
        ArrayList<String> myWords = new ArrayList<String>();

        while (m1.find())
        {
            for (String temp : m1.group().split("_+"))
            {
                if (longest < temp.length())
                {
                    longest = temp.length();
                }
            }
        }

        System.out.print(longest + " " + parenCounter);
    }

}
