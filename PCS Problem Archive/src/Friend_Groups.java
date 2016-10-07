import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * Friend Groups - https://pcs.spruett.me/problems/9 Second ever graph CS
 * problem COMPLETED!!! WOOO!
 * 
 * @author Teddy
 * @version Oct 7, 2016
 */
public class Friend_Groups
{
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args)
    {
        Friend_Groups f = new Friend_Groups();
        f.start();
    }


    public void start()
    {
        int n = scan.nextInt();
        int f = scan.nextInt();
        scan.nextLine();

        /* Is there a spicy/l33t hack for normalizing the input-ed names? */
        Map<String, ArrayList<String>> graph =
            new LinkedHashMap<String, ArrayList<String>>();
        Set<String> friendGroups = new HashSet<String>();

        /* Is there a spicy hack for this? Or is this the right way? */
        String startNode = "";

        /* Builds Nodes for graph and fills friendGroups */
        for (int i = 0; i < n; i++)
        {
            String person = scan.next();
            graph.put(person, new ArrayList<String>());
            friendGroups.add(person);

            if (startNode.equals(""))
            {
                startNode = person;
            }
        }

        /* Builds Edges for graph */
        for (int i = 0; i < f; i++)
        {
            String personA = scan.next();
            String personB = scan.next();

            /* Bi-directional associations */
            graph.get(personA).add(personB);
            graph.get(personB).add(personA);
        }

        int friendGroupsCount = 0;
        Queue<String> schedule = new ArrayDeque<String>();

        /*
         * Evaluation of groups begins at startNode, therefore add startNode to
         * schedule and remove that person from friendGroups
         */
        friendGroups.remove(startNode);
        schedule.add(startNode);

        while (!friendGroups.isEmpty() || !schedule.isEmpty())
        {
            while (!schedule.isEmpty())
            {
                for (String person : graph.get(schedule.remove()))
                {
                    if (friendGroups.contains(person))
                    {
                        schedule.add(person);
                        friendGroups.remove(person);
                    }
                }
            }

            /*
             * After traversing one group of friends, move onto the next group,
             * if possible
             */
            if (!friendGroups.isEmpty())
            {
                /* Gets whatever person happens to be next */
                String[] temp = friendGroups.toArray(new String[friendGroups
                    .size()]);
                String nextStartNode = temp[0];

                schedule.add(nextStartNode);
                friendGroups.remove(nextStartNode);
            }

            // One friend group has been traversed
            friendGroupsCount++;
        }

        System.out.println(friendGroupsCount);
    }

}
