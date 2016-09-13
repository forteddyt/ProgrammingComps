import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * Gene Shuffle -
 * http://codeforces.com/gym/101078/attachments/download/4597/20162017-ct-s03e01-codeforces-trainings-season-3-episode-1-en.pdf
 * 
 * @author Teddy Todorov
 */
public class GeneShuffle
{

    FastScanner scan = new FastScanner();


    public static void main(String[] args)
    {
        GeneShuffle g = new GeneShuffle();
        g.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        for (int q = 0; q < n; q++)
        {
            int m = scan.nextInt();
            int start = 1;
            int[] gen1 = new int[m];
            int[] gen2 = new int[m];
            for (int j = 0; j < m; j++)
            {
                gen1[j] = scan.nextInt();
            }
            for (int j = 0; j < m; j++)
            {
                gen2[j] = scan.nextInt();
            }

            HashSet<Integer> set = new HashSet<Integer>();
            StringBuilder s = new StringBuilder();

            for (int i = 1; i <= m; i++)
            {
                int lookingAt1 = gen1[i - 1];
                int lookingAt2 = gen2[i - 1];
                if (!set.add(lookingAt1))
                {
                    set.remove(lookingAt1);
                }
                if (!set.add(lookingAt2))
                {
                    set.remove(lookingAt2);
                }
                if (set.isEmpty())
                {
                    s.append(start + "-" + i + " ");
                    start = i + 1;
                }
            }
            System.out.println(s);
        }
    }


    public static class FastScanner
    {
        BufferedReader br;
        StringTokenizer st;


        public FastScanner(Reader in)
        {
            br = new BufferedReader(in);
        }


        public FastScanner()
        {
            this(new InputStreamReader(System.in));
        }


        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }


        int nextInt()
        {
            return Integer.parseInt(next());
        }


        long nextLong()
        {
            return Long.parseLong(next());
        }


        double nextDouble()
        {
            return Double.parseDouble(next());
        }


        // Slightly different from java.util.Scanner.nextLine(),
        // which returns any remaining characters in current line,
        // if any.
        String readNextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
