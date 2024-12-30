package DSA ;

import java.util.*;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;
 
 
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 
 
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); 
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
 
    public static void preorder (Node root) {
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder (Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+ " ");
        inorder(root.right);
    }

    public static void postorder (Node root) {
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+ " ");
    }
    
    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node curr = q.remove();
            if(curr == null) {
                System.out.println();
                //queue empty
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
 
 public static int countOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);

    return leftNodes + rightNodes + 1;
 }
 
 public static int SumOfNodes(Node root){
    if(root == null){
        return 0;
    }
    int leftNodes = SumOfNodes(root.left);
    int rightNodes = SumOfNodes(root.right);

    return leftNodes + rightNodes + root.data;
 }

 public static int height(Node root){
    if(root == null){
        return 0;
    }
    int leftHeight= height(root.left);
    int rightHeight = height(root.right);

    int myheight = Math.max(leftHeight, rightHeight) + 1;

    return myheight;
 }

 public static int diameter(Node root) {
    if(root == null) {
        return 0;
    }


    int diam1 = height(root.left) + height(root.right) + 1;
    int diam2 = diameter(root.left);
    int diam3 = diameter(root.right);


    return Math.max(diam1, Math.max(diam2, diam3));
}

static class TreeInfo {
    int height;
    int diam;

    TreeInfo(int height , int diam){
        this.height =height;
        this.diam = diam;
    }
}
public static TreeInfo diameter2(Node root) {
    if(root == null) {
        return new TreeInfo(0, 0);
    }


    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.right);


    int myHeight = Math.max(left.height, right.height) + 1;


    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.height + right.height + 1;


    int myDiam = Math.max(Math.max(diam1, diam2), diam3);


    TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
    return myInfo;
}


    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
       
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
        //preorder(root);
        //inorder(root);
        //postorder(root);
       // levelOrder(root);
       //System.out.println(countOfNodes(root));
       //System.out.println(SumOfNodes(root));
       //System.out.println(height(root));
       System.out.println(diameter2(root).diam);
    }
 }
 