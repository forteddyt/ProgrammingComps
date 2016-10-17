import java.util.Scanner;

/**
 * Destroying Array - http://codeforces.com/contest/722/problem/C
 * 
 * @author Teddy
 * @version Oct 16, 2016
 */
public class Destroying_Array {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Destroying_Array d = new Destroying_Array();
        d.start();
    }


    public void start() {
        int n = scan.nextInt();

        Long[] arr = new Long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        for (int i = 0; i < n; i++) {
            int kill = scan.nextInt() - 1;

            arr[kill] = null;
            long max = 0;
            long temp = 0;

            for (int q = 0; q < arr.length; q++) {
                Long l = arr[q];
                if (l != null) {
                    temp += l;
                }
                if (l == null || q == arr.length - 1) {
                    max = Math.max(max, temp);
                    temp = 0;
                }
            }

            System.out.println(max);
        }

    }

}
