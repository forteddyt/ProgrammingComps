import java.util.Scanner;

/**
 * Broken Clock - http://codeforces.com/contest/722/problem/A
 * 
 * @author Teddy
 * @version Oct 13, 2016
 */

public class Broken_Clock {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Broken_Clock b = new Broken_Clock();
        b.start();
    }


    public void start() {
        int n = scan.nextInt();

        String time = scan.next();

        String hours = time.substring(0, 2);
        String minutes = time.substring(3, 5);

        char[] c = hours.toCharArray();
        if (n == 24) {
            if (Integer.parseInt(hours) >= n) {
                c[0] = '0';

                hours = c[0] + "" + c[1];
            }
        }
        else {
            if (Integer.parseInt(hours) > n) {
                c[0] = '0';

                hours = c[0] + "" + c[1];
            }
            if (Integer.parseInt(hours) == 0) {
                c[1] = '1';

                hours = c[0] + "" + c[1];
            }
        }

        System.out.print(hours);
        System.out.print(":");

        if (Integer.parseInt(minutes) >= 60) {
            char[] s = (minutes + "").toCharArray();
            s[0] = '0';
            System.out.print(s[0] + "" + s[1]);
        }
        else {
            System.out.print(minutes);
        }
    }

}
