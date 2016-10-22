import java.util.ArrayList;
import java.util.Scanner;

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

        scan.nextLine();
        String s = scan.nextLine();

        int counter = 0;

        for (int i = 0; i < n; i++) {
            int position = i;
            ArrayList<String> moves = new ArrayList<String>();
            int mOC = -1;
            while (mOC < 2 || moves.get(mOC).equals(moves.get(mOC - 1))) {
                String move = s.substring(position, position + 1);
                moves.add(move);
                mOC++;
                if (move.equals("<")) {
                    position--;
                }
                else if (move.equals(">")) {
                    position++;
                }
                if (position < 0 || position >= n) {
                    counter++;
                    break;
                }
            }
        }

        System.out.println(counter);
    }
}
