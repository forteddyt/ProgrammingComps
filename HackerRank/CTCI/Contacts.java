/*
   Tries: Contacts https://www.hackerrank.com/challenges/ctci-contacts?h_r=next-challenge&h_v=zen
 */

/*input
4
add hack
add hackerrank
find hac
find hak
*/

import java.util.*;

public class Contacts {

    public static Node head = new Node(null);

    public static class Node {
        HashMap<Character, Node> children;

        public Node(HashMap<Character, Node> children){
            this.children = children;
        }

        public String toString(){
            return children.toString();
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++) {
            String command = scan.next();
            String s = scan.next();
            call(command, s);
        }
    }

    public static void call(String command, String s){
        if(command.equals("add")) {
            add(s);
        }
        else if(command.equals("find")) {
            find(s);
        }
    }

    public static void add(String s){
        char[] chars = s.toCharArray();
        Node tracker = head;
        for(Character c : chars) {
            if(tracker.children != null && tracker.children.containsKey(c)) {
                tracker = tracker.children.get(c);
            }else if(tracker.children != null) {
                tracker.children.put(c, new Node(null));
                tracker = tracker.children.get(c);
            }else{
                tracker.children = new HashMap<Character, Node>();
                tracker.children.put(c, new Node(null));
                tracker = tracker.children.get(c);
            }
        }
        tracker.children = new HashMap<Character, Node>();
        tracker.children.put('*', new Node(null));
    }

    public static void find(String s){
        char[] chars = s.toCharArray();

        Node tracker = head;
        boolean hasPrinted = false;
        int count = 0;

        for(Character c : chars) {
            if(tracker != null){
                System.out.println("Cur location, " + c + " with children -> " + tracker.children);
            }
            if(tracker.children != null && tracker.children.containsKey(c)) {
                tracker = tracker.children.get(c);
            }
            else{
                System.out.println(0);
                hasPrinted = true;
                break;
            }
        }

        if(!hasPrinted && tracker.children != null) {
            count+=tracker.children.size();
        }

        if(!hasPrinted) {
            System.out.println(count);
        }
    }
}
