/*
   Left Rotation : https://www.hackerrank.com/challenges/ctci-array-left-rotation
 */

import java.util.*;

public class Left_Rotation {
public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int shift = scan.nextInt();

        String[] myArray = new String[n];

        for(int i = 0; i < n; i++) {
                myArray[i] = scan.next();
        }

        for(int i = 0; i < n; i++) {
                System.out.print(myArray[(i + shift) % n] + " " );
        }
}
}
