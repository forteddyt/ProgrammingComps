import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Chris and Magic Square - http://codeforces.com/contest/711/problem/B
 * 
 * @author forteddyt
 */
public class ChrisAndMagicSquare
{
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        ChrisAndMagicSquare c = new ChrisAndMagicSquare();
        c.start();
    }


    public void start()
    {
        int side = scan.nextInt();
        int zPosR = -1;
        int zPosC = -1;
        long[][] grid = new long[side][side];
        scan.nextLine();

        if (side == 1)
        {
            System.out.println("1");
            System.exit(0);
        }

        for (int i = 0; i < side; i++)
        {
            int q = 0;
            for (String s : scan.nextLine().split("\\s"))
            {
                grid[i][q] = Integer.parseInt(s);
                if (grid[i][q] == 0)
                {
                    zPosR = i;
                    zPosC = q;
                }
                q++;
            }
        }

        Set<Long> sums = new TreeSet<Long>();
        sums = getSums(grid);

        if (sums.size() != 2)
        {
            System.out.println("-1");
            System.exit(0);
        }

        Long[] sumsArray = sums.toArray(new Long[sums.size()]);
        long ans = sumsArray[1] - sumsArray[0];

        grid[zPosR][zPosC] = ans;
        Set<Long> fixedSums = new TreeSet<Long>(getSums(grid));

        if (fixedSums.size() != 1)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(ans);
        }
    }


    public Set<Long> getSums(long[][] l)
    {
        Set<Long> sums = new TreeSet<Long>();

        for (int i = 0; i < l.length; i++)
        {
            long sumsRow = 0;
            long sumsCol = 0;
            for (int q = 0; q < l.length; q++)
            {
                sumsRow += l[i][q];
                sumsCol += l[q][i];
            }
            sums.add((long)sumsRow);
            sums.add((long)sumsCol);
        }

        long sumsDiag1 = 0;
        long sumsDiag2 = 0;

        for (int i = 0; i < l.length; i++)
        {
            sumsDiag1 += l[i][i];
            sumsDiag2 += l[i][l.length - i - 1];
        }

        sums.add((long)sumsDiag1);
        sums.add((long)sumsDiag2);

        return sums;
    }
}
