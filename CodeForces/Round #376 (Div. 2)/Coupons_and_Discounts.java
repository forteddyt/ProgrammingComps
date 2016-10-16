import java.util.Scanner;

/**
 * Coupons and Discounts - http://codeforces.com/contest/731/problem/B
 * 
 * Solved!
 * 
 * @author Teddy
 * @version Oct 16, 2016
 */
public class Coupons_and_Discounts {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Coupons_and_Discounts c = new Coupons_and_Discounts();
        c.start();
    }


    public void gen() {
        int random = (int)(Math.random() * 100 + 1);
        System.out.println(random);
        for (int i = 0; i < random; i++) {
            System.out.print((int)(Math.random() * 10000 + 1) + " ");
        }
    }


    public void start() {
        int n = scan.nextInt();
        int[] schedule = new int[n];

        for (int i = 0; i < n; i++) {
            schedule[i] = scan.nextInt();
        }

        int[] ret = schedule;
        int curDay = 0;
        while (curDay < ret.length) {
            if (ret[curDay] <= 0) {
                curDay++;
            }
            else {
                if (ret[curDay] > 1) {
                    if (ret[curDay] % 2 == 1) {
                        ret[curDay] = 1;
                    }
                    else {
                        ret[curDay] = 0;
                    }
                }
                else {
                    if (curDay + 1 >= ret.length) {
                        ret[curDay] = -1;
                    }
                    else {
                        ret[curDay] = ret[curDay] - 1;
                        ret[curDay + 1] = ret[curDay + 1] - 1;
                    }
                }
            }
        }

        for (int i : ret) {
            if (i < 0) {
                System.out.println("NO");
                System.exit(0);
            }
        }

        System.out.println("YES");
    }


    public int[] orderPizzas(int[] s, int curDay) {
        if (curDay >= s.length) {
            return s;
        }
        if (s[curDay] <= 0) {
            return orderPizzas(s, curDay + 1);
        }
        else if (s[curDay] > 1) {
            s[curDay] = s[curDay] - 2;
            return orderPizzas(s, curDay);
        }
        else {
            if (curDay + 1 >= s.length) {
                s[curDay] = -1;
            }
            else {
                s[curDay] = s[curDay] - 1;
                s[curDay + 1] = s[curDay + 1] - 1;
            }
            return orderPizzas(s, curDay);
        }
    }
}
