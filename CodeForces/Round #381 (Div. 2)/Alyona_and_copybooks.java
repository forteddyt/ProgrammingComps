import java.util.Scanner;

public class Alyona_and_copybooks {

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        Alyona_and_copybooks a = new Alyona_and_copybooks();
        a.start();
    }


    public void start() {
        long curCount = scan.nextInt();
        long totalCost = 0;
        long[] books = new long[3];
        books[0] = scan.nextLong();
        books[1] = scan.nextLong();
        books[2] = scan.nextLong();

        curCount %= 4;

        curCount = 4 - curCount;

        if (curCount == 4) {
            System.out.println(totalCost);
            System.exit(0);
        }
        
        System.out.println(curCount);

        while (curCount != 0) {
            if (curCount % 3 == 0 && books[0] * 3 >= books[2]) {
                totalCost += books[2];
                curCount -= 3;
            }
            else if (curCount % 2 == 0 && books[0] * 2 >= books[1]) {
                totalCost += books[1];
                curCount -= 2;
            }
            else {
                totalCost += books[0];
                curCount--;
            }

        }

        System.out.println(totalCost);

    }

}
