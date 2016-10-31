import java.util.Scanner;

/**
 * Grasshopper and the String - http://codeforces.com/contest/733/problem/A
 * 
 * @author Teddy
 * @version Oct 31, 2016
 */
public class Grasshopper_And_the_String {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Grasshopper_And_the_String g = new Grasshopper_And_the_String();
        g.start();
    }


    public void start() {
        char[] myString = scan.nextLine().toLowerCase().toCharArray();
        int max = 0;
        int cur = 1;
        for (Character c : myString) {
            if ("aeioy".contains(c + "")) {
                cur = 1;
            }
            else {
                cur++;
            }

            if (cur > max) {
                max = cur;
            }
        }

        System.out.println(max);
    }

}
