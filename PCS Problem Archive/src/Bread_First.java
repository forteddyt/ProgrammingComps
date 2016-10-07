import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 * Bread First - https://pcs.spruett.me/problems/2 Woo!!! First successful graph
 * implementation completed!!!!!
 * 
 * @author Teddy Todorov
 * @version Oct 5, 2016
 */
public class Bread_First
{

    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> graphAL = new ArrayList<ArrayList<Integer>>();
    boolean[][] graphAM;


    public static void main(String[] args)
    {
        Bread_First b = new Bread_First();
        b.start();
    }


    public void start()
    {

        int numNodes = scan.nextInt(); /* Number of Nodes */
        int numEdges = scan.nextInt(); /* Number of Edges */
        int startNode = scan.nextInt(); /* Starting Node */
        int endNode = scan.nextInt(); /* Ending Node */

        buildAdjacencyList(numNodes, numEdges); /* Builds Adjacency List */

        int[] shortestPaths = shortestDistanceBFS(startNode, numNodes);

        /*
         * Best dice-roll is a 6. The "+ 5" l33t hack ensures that an remainders
         * are accounted for. ie, distance of 6 would be 1 roll ((6 + 5)/6 = 1)
         * and a distance of 7 would be 2 rolls ((7 + 5)/6 = 2)
         */
        int minRolls = (shortestPaths[endNode] + 5) / 6;
        int maxRolls = shortestPaths[endNode]; // Worst dice-roll is a 1

        System.out.println(minRolls + " " + maxRolls);
    }


    /**
     * Returns an array representation of shortest distances from an
     * index-represented Node to the given startNode.
     * 
     * @param startNode
     *            The node you start from.
     * @param numNodes
     *            The number of nodes in the graph.
     * @return The array representation of shortest paths from index N to
     *         startNode.
     */
    public int[] shortestDistanceBFS(int startNode, int numNodes)
    {
        /*
         * Tracks distance from startNode as well as if a Node has been visited
         */
        int[] distance = new int[numNodes];

        /* Tracks which Node leads to the index-represented Node */
        int[] previous = new int[numNodes];

        /* schedule tracks which nodes are to be evaluated */
        Queue<Integer> schedule = new ArrayDeque<Integer>(); // Schedule

        /* Fills both trackers with dummy values */
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(previous, -1);

        /* Sets the initial Node to 0, since there's no distance to origin */
        distance[startNode] = 0;
        /* Sets the initial Node to -1, since there's no Node before origin */
        previous[startNode] = -1;

        schedule.add(startNode);

        while (!schedule.isEmpty())
        {
            int curNode = schedule.remove();

            for (Integer neighbor : graphAL.get(curNode))
            {
                /* Determines if the current Node has been visited or not */
                if (distance[neighbor] == Integer.MAX_VALUE)
                {
                    /*
                     * Since the Edge values for each Node is 1 in this problem,
                     * we just add 1 onto current Node's the distance
                     */
                    distance[neighbor] = distance[curNode] + 1;

                    /*
                     * Since this neighbor hasn't been visited, add it to the
                     * schedule
                     */
                    schedule.add(neighbor);

                    /*
                     * The predecessor to the current neighbor is the current
                     * Node
                     */
                    previous[neighbor] = curNode;
                }
            }
        }

        return distance;
    }


    public void breadthFirstSearch(int startNode)
    {
        /* visited serves as the marker for schedule */
        boolean[] visited = new boolean[graphAL.size()];

        /*
         * schedule serves to keep track of which Node is currently being looked
         * through
         */
        Queue<Integer> schedule = new ArrayDeque<Integer>();

        /* schedule begins with the starting Node, as defined by the problem */
        schedule.add(startNode);

        /* Since schedule adds startNode to it's Queue, it has been 'visited' */
        visited[startNode] = true;

        /* Traverses through schedule until there are no more Nodes to visit */
        while (!schedule.isEmpty())
        {
            /* Store and process the topmost Node in the schedule */
            int curNode = schedule.remove();

            // Process Node

            for (int neighbor : graphAL.get(curNode))
            {
                if (!visited[neighbor])
                {
                    visited[neighbor] = true;
                    schedule.add(neighbor);
                }
            }
        }
    }


    public void buildAdjacencyMatrix(int numNodes, int numEdges)
    {
        /* Creates the necessary amount of Node representations in AM */
        graphAM = new boolean[numNodes][numNodes];

        /* Populates the AM with the appropriate Edges to those Nodes */
        for (int i = 0; i < numEdges; i++)
        {
            int nodeA = scan.nextInt();
            int nodeB = scan.nextInt();

            /*
             * Since the problem states input "0 1" means that 0->1 and 1->0
             * (Nodes are bi-directional) we must create Edges between both
             * input Nodes
             */

            /*
             * Since bare Arrays are populated with 0, 1s will represent Edges
             * and 0s will represent no connection between two Nodes
             */
            graphAM[nodeA][nodeB] = true;
            graphAM[nodeB][nodeA] = true;
        }
    }


    public void buildAdjacencyList(int numNodes, int numEdges)
    {
        /* Create the necessary amount of Node representations in the AL */
        for (int i = 0; i < numNodes; i++)
        {
            graphAL.add(new ArrayList<Integer>());
        }

        /* Populate the AL with the appropriate Edges to those Nodes */
        for (int i = 0; i < numEdges; i++)
        {
            int nodeA = scan.nextInt();
            int nodeB = scan.nextInt();

            /*
             * Since this problem states input "0 1" means that 0->1 and 1->0
             * (Nodes are bi-directional) we must create Edges between both
             * input Nodes
             */
            graphAL.get(nodeA).add(nodeB); /*
                                            * Builds an unweighed Edge from A->B
                                            */
            graphAL.get(nodeB).add(nodeA); /*
                                            * Builds an unweighed Edge from B->A
                                            */
        }

        /*
         * Adjacency List representation of graph has now been successfully
         * created.
         */

    }


    public void displayGraph()
    {
        for (int i = 0; i < graphAL.size(); i++)
        {
            System.out.print(i + ": ");
            for (int q = 0; q < graphAL.get(i).size(); q++)
            {
                if (q == graphAL.get(i).size() - 1)
                {
                    System.out.print(graphAL.get(i).get(q));
                }
                else
                {
                    System.out.print(graphAL.get(i).get(q) + ", ");
                }
            }
            System.out.println("");
        }
    }

}
