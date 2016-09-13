import java.util.Scanner;

public class D01_Data_Types
{

    public static void main(String[] args)
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextInt() + i);
        System.out.println(scan.nextDouble() + d);
        scan.nextLine();
        System.out.println(s + scan.nextLine());

        scan.close();
    }
}
