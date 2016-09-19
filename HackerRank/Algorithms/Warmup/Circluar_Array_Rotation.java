package Warmup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Circular Array Rotation -
 * https://www.hackerrank.com/challenges/circular-array-rotation
 * 
 * @author Teddy
 * @version Sep 16, 2016
 */
public class Circluar_Array_Rotation
{
    private Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Circluar_Array_Rotation c = new Circluar_Array_Rotation();
        c.start();
    }


    public void start()
    {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        for (int i = 0; i < n; i++)
        {
            a.add(scan.nextInt());
        }

        for (int i = 0; i < k; i++)
        {
            int temp = a.remove(a.size() - 1);
            a.add(0, temp);
        }

        for (int i = 0; i < q; i++)
        {
            System.out.println(a.get(scan.nextInt()));
        }

    }
}
