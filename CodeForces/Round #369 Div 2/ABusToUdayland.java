import java.util.Scanner;

/**
 * A Bus to Udayland - http://codeforces.com/contest/711/problem/0
 * 
 * @author forteddyt
 */
public class ABusToUdayland
{

    private Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        ABusToUdayland bus = new ABusToUdayland();
        bus.start();
    }


    public void start()
    {
        int rows = scan.nextInt();
        scan.nextLine();
        String[] seats = new String[rows * 2];
        boolean hasSat = false;

        for (int i = 0; i < seats.length - 1; i += 2)
        {
            String s = scan.nextLine();
            String r1 = s.substring(0, 2);
            String r2 = s.substring(3, 5);

            seats[i] = r1;
            seats[i + 1] = r2;

            if (!hasSat)
            {
                if (r1.contentEquals("OO"))
                {
                    seats[i] = "++";
                    hasSat = true;
                }
                else if (r2.contentEquals("OO"))
                {
                    seats[i + 1] = "++";
                    hasSat = true;
                }
            }

        }
        System.out.println(hasSat ? "Yes" : "No");

        if (hasSat)
        {
            for (int i = 0; i < seats.length - 1; i += 2)
            {
                System.out.println(seats[i] + "|" + seats[i + 1]);
            }
        }
    }

}
