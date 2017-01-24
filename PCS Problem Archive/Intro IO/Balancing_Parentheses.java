import java.util.Scanner;

public class Balancing_Parentheses {
    private static String b = "Balanced";
    private static String nb = "Unbalanced";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] s = scan.nextLine().toCharArray();

        int counter = 0;

        for (char c : s) {
            if (c == '(') {
                counter++;
            }
            else if (c == ')') {
                counter--;
            }

            if (counter < 0) {
                System.out.println(nb);
                return;
            }
        }

        if (counter == 0) {
            System.out.println(b);
        }
        else {
            System.out.println(nb);
        }
    }

}
