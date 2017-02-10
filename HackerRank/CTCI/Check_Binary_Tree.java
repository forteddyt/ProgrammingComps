/*
   Check if tree is a Binary Tree - https://www.hackerrank.com/challenges/ctci-is-binary-search-tree?h_r=next-challenge&h_v=zen
 */

public class Check_Binary_Tree {

boolean checkBST(Node root){
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

boolean helper(Node root, int min, int max){
        if(root == null) {
                return true;
        }

        if( root.data <= min || root.data >= max) {
                return false;
        }

        return (helper(root.left, min, root.data) && helper(root.right, root.data, max));
}
}
