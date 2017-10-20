import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DependencyGambit
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Dep> dependents = new HashMap<String, Dep>();

        String mainLib = scan.nextLine();
        int numLibs = scan.nextInt();

        for (int i = 0; i < numLibs; i++)
        {
            String lib = scan.next();
            int d = scan.nextInt();
            Dep curDep = null;
            if (dependents.containsKey(lib))
            {
//                System.out.println(lib + " is already in here");
                curDep = dependents.get(lib);
            }
            else
            {
                curDep = new Dep(lib);
            }

            for (int j = 0; j < d; j++)
            {
                String theirDep = scan.next();
                if (!dependents.containsKey(theirDep))
                {
                    dependents.put(theirDep, new Dep(theirDep));
                }
                curDep.addDep(dependents.get(theirDep));
            }
            dependents.put(lib, curDep);
        }

        System.out.println(dependents.get(mainLib));
// System.out.println(dependents);
    }


    private static class Dep
    {
        String     name;
        Queue<Dep> deps = new ArrayDeque<Dep>();


        public Dep(String name)
        {
            this.name = name;
        }


        private void addDep(Dep d)
        {
            deps.add(d);
        }


        private Queue<Dep> getDeps()
        {
            return deps;
        }


        @Override
        public String toString()
        {
            StringBuilder b = new StringBuilder();
            while (!deps.isEmpty())
            {
                b.append(deps.remove() + " ");
            }
            b.append(name);
            return b.toString();
        }
    }
}
