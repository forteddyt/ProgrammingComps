import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.stream.events.Characters;

/**
 * Jumping Ball - http://codeforces.com/contest/725/problem/0
 * 
 * @author user
 *
 */

public class Jumping_Ball {

    private Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Jumping_Ball b = new Jumping_Ball();
        b.start();
    }


    public void start() {
        int n = scan.nextInt();
        int counter = 0;

        scan.nextLine();
        char[] c = scan.nextLine().toCharArray();

        Character lastDifferent = ' ';
        for (int i = 0; i < n; i++) {
            if (lastDifferent != c[i]) {
                lastDifferent = c[i];
            }
            else {
                counter++;
            }
        }
    }
}
