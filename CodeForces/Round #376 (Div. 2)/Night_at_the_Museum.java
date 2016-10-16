import java.util.Scanner;

/**
 * Night at the Museum - http://codeforces.com/contest/731/problem/0
 * 
 * @author Teddy
 * @version Oct 16, 2016
 */
public class Night_at_the_Museum {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Night_at_the_Museum m = new Night_at_the_Museum();
        m.start();
    }


    public void start() {
        char[] letters = scan.nextLine().toCharArray();
        char pointer = 'a';
        int ans = 0;

        for (char c : letters) {
            int temp = Math.abs(pointer - c);
            if (temp <= 13) {
                ans += temp;
            }
            else {
                ans += Math.abs(temp - 26);
            }

            pointer = c;
        }

        System.out.println(ans);
    }

}
