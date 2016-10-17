import java.util.ArrayList;
import java.util.Scanner;

/**
 * Socks - http://codeforces.com/contest/731/problem/C
 * 
 * Incomplete - Graphs
 * 
 * @author Teddy
 * @version Oct 16, 2016
 */
public class Socks {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Socks s = new Socks();
        s.start();
    }


    public void start() {
        int n = scan.nextInt(); // number of socks
        int m = scan.nextInt(); // number of days
        int k = scan.nextInt(); // number of colors

        ArrayList<ArrayList<Integer>> piles =
            new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            scan.nextInt();
            piles.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int l = scan.nextInt();
            int r = scan.nextInt();

            piles.get(l - 1).add(r - 1);
            piles.get(r - 1).add(l - 1);
        }

        System.out.println(piles);
    }
}
