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
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        ArrayList<ArrayList<Integer>> graph =
            new ArrayList<ArrayList<Integer>>();
        int[] colorOptions = new int[n];
        for (int i = 0; i < n; i++) {
            colorOptions[i] = scan.nextInt();
        }

    }
}
