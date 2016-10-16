import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Socks - http://codeforces.com/contest/731/problem/C
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

        Map<Integer, Integer> socks = new TreeMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            socks.put(i, (Integer)scan.nextInt());
        }

        Integer[][] days = new Integer[m][2];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < 2; c++) {
                int val = scan.nextInt();
                days[r][c] = socks.get(val);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int q = 0; q < 2; q++) {
                System.out.print(days[i][q] + " ");
            }
            System.out.println("");
        }

        socks.put(2, 2);
        System.out.println("");

        for (int i = 0; i < m; i++) {
            for (int q = 0; q < 2; q++) {
                System.out.print(days[i][q] + " ");
            }
            System.out.println("");
        }

    }

}
