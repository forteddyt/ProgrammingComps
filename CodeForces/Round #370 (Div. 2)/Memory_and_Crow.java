import java.util.Scanner;

/**
 * Memory and Crow - http://codeforces.com/contest/712/problem/A
 * 
 * @author Teddy Todorov
 */
public class Memory_and_Crow
{

    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Memory_and_Crow m = new Memory_and_Crow();
        m.start();
    }


    public void start()
    {
        StringBuilder sB = new StringBuilder();
        int n = scan.nextInt();
        long[] list = new long[n];
        for (int i = 0; i < n; i++)
        {
            list[i] = scan.nextLong();
        }
        for (int i = 0; i < list.length - 1; i++)
        {
            sB.append(list[i] + list[i + 1] + " ");
        }
        sB.append(list[list.length - 1]);

        System.out.println(sB);
    }
}
