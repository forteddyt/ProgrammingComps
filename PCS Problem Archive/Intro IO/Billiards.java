import java.util.Scanner;

public class Billiards {

    private static String[][] board = null;
    boolean goingUp = true;
    boolean goingRight = true;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;

        String s = "";

        x = scan.nextLine().length();
        y++;

        boolean crap = false;
        while (scan.hasNextLine()) {
            s = scan.nextLine();
            y++;

            if (s.endsWith("-") && !crap) {
                break;
            }

            crap = !crap;
        }

        board = new String[x - 1][y - 1];

        for (int i = 0; i < y; i++) {
            for (int q = 0; q < x; q++) {
                if (i == 0 || i == y - 1) {
                    if (i != 0 && q == 0) {
                        board[i][q] = "o";
                    }
                    else {
                        board[i][q] = "-";
                    }
                }
                else {
                    if (q == 0 || q == x - 1) {
                        board[i][q] = "|";
                    }
                    else {
                        board[i][q] = " ";
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int q = 0; q < board[0].length; q++) {
                System.out.println(board[i][q]);
            }
        }
    }
}
