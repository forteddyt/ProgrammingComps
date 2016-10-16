import java.util.Scanner;

/**
 * Verse Pattern - http://codeforces.com/contest/722/problem/B
 * 
 * @author Teddy
 * @version Oct 16, 2016
 */
public class Verse_Pattern {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Verse_Pattern p = new Verse_Pattern();
        p.start();
    }


    public void start() {
        int n = scan.nextInt();
        int[] pattern = new int[n];

        for (int i = 0; i < n; i++) {
            pattern[i] = scan.nextInt();
        }

        scan.nextLine();

        for (int i = 0; i < n; i++) {
            char[] line = scan.nextLine().toCharArray();
            int cur = pattern[i];
            int counter = 0;
            for (char c : line) {
                if ("aeiouy".contains(c + "")) {
                    counter++;
                }
                if (counter > cur) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
            if (counter < cur) {
                System.out.println("NO");
                System.exit(0);
            }
        }

        System.out.println("YES");

    }

}
