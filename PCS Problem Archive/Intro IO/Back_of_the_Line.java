import java.util.Arrays;
import java.util.Scanner;

public class Back_of_the_Line {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        String acorn = "Acorn";
        String[] bank = new String[n];
        String ans = "";

        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            s = s.toLowerCase();

            if (s.compareTo(reverse(s)) < 0) {
                s = reverse(s);
            }

            bank[i] = s;
        }

        Arrays.sort(bank);

        for (int i = n - 1; i >= 0; i--) {
            ans += bank[i];
        }

        if (ans.compareTo(acorn.toLowerCase()) > 0) {
            ans = ans.toUpperCase();
            String temp = "";
            if (ans.length() > 1) {
                temp = ans.substring(1);
                ans = ans.replace(temp, temp.toLowerCase());
            }
            System.out.println(ans);
        }
        else {
            System.out.println(acorn);
        }
    }


    public static String reverse(String s) {
        String ans = "";

        char[] fk = s.toCharArray();

        for (int i = fk.length - 1; i >= 0; i--) {
            ans += fk[i] + "";
        }

        return ans;
    }

}
