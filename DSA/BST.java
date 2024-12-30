package DSA;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // lest subtree
            root.left = insert(root.left, val);
        }

        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) { // Left Subtree
            return search(root.left, key);
        }

        else if (root.data == key) {
            return search(root.right, key);
        }

        // else if (root.data < key)
        else {
            return search(root.right, key);
        }

    }

    // public static Node delete(Node rrot, int val) {
    // if (root.data > val) {
    // root.left = delete(root.left, val);
    // } else if (root.data < val) {
    // root.right = delete(root.right, val);
    // }

    // else { // root.data == val
    // // case 1
    // if (root.left == null && root.right == null) {
    // return null;
    // }

    // // case 2
    // if (root.left == null) {
    // return root.left;
    // }

    // // case 3
    // Node IS = inorderSuccessor(root);
    // root.data = IS.data;
    // delete(root.right, IS.data);
    // }

    // return root;

    // }

    // public static Node inorderSuccesssor(Node root) {
    // while (root.left != null) {
    // root = root.left;
    // }

    // }

    public static void printInRange(Node root , int X , int Y) {
        if(root == null ) {
            return ;
        }
        if(root.data >= X && root.data<= Y) {
            printInRange(root.left, X, Y);
            System.out.println(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        else{
            printInRange(root.right, X, Y);
        }
    }
    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 6, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if (search(root, 3)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }

        // delete ko use kare ta if ki condition ko cmment kare ..!!

        // delete(root , 4) ;
        // inorder(root);

        printInRange(root, 6, 4);

    }
}
