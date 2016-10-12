import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * What's on the Grille? - https://open.kattis.com/problems/grille
 * 
 * @author Teddy Todorov
 */
public class Whats_on_the_Grille {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Whats_on_the_Grille g = new Whats_on_the_Grille();
        g.start();
    }


    public void start() {
        int n = scan.nextInt();
        String[][] grille = new String[n][n];
        String[][] message = new String[n][n];
        char[] encryptedMessage = new char[n];

        int numHoles = 0;

        for (int i = 0; i < n; i++) {
            char[] s = scan.next().toCharArray();
            for (int q = 0; q < n; q++) {
                if ((s[q] + "").equals(".")) {
                    numHoles++;
                }
                grille[i][q] = s[q] + "";
            }
        }

        scan.nextLine();
        encryptedMessage = scan.nextLine().toCharArray();

        if (numHoles < n * n / 4) {
            System.out.println("invalid grille");
            System.exit(0);
        }

        int counter = 0;
        boolean isValid = true;

        for (int i = 0; i < 5; i++) {
            stop: for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    if (i < 4) {
                        if (grille[row][col].equals(".")) {
                            message[row][col] = encryptedMessage[counter] + "";
                            counter++;
                        }
                    }
                    else {
                        if (message[row][col] == null) {
                            isValid = false;
                            break stop;
                        }
                    }
                }
            }
            grille = rotateClockwise(grille);
        }

        if (!isValid) {
            System.out.print("invalid grille");
            System.exit(0);
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(message[row][col]);
            }
        }
    }


    public String[][] rotateClockwise(String[][] a) {
        String[][] ans = new String[a.length][a.length];

        for (int i = 0; i < a.length; i++) {
            for (int q = 0; q < a.length; q++) {
                ans[q][a.length - i - 1] = a[i][q];
            }
        }

        return ans;
    }


    private void printGrille(String[][] a) {
        System.out.println("--START--");
        for (int i = 0; i < a.length; i++) {
            for (int q = 0; q < a.length; q++) {
                System.out.print(a[i][q] + " ");
            }
            System.out.println("");
        }
        System.out.println("--END--");
    }

}
