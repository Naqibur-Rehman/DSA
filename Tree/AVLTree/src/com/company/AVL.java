package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    AVL() {
        root = null;
    }


    // pre order traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // in order traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // post order traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //  level order traversal
    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null)
                queue.add(presentNode.left);
            if (presentNode.right != null)
                queue.add(presentNode.right);
        }
    }

    // Search
    public BinaryNode search(BinaryNode node,int value) {
        if (node == null) {
            System.out.println(value + " not found");
            return null;
        } else if (value == node.value) {
            System.out.println(value + " found in BST");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    // getHeight
    public int getHeight(BinaryNode node) {
        if (node == null)
            return 0;
        return node.height;
    }

    // rotateRight
    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // rotateLeft
    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // getBalance
    public int getBalance(BinaryNode node) {
        if (node==null){
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // insertNode method
    private BinaryNode insertNode(BinaryNode node, int value) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            newNode.height = 1;
            return newNode;
        } else if (value < node.value) {
            node.left = insertNode(node.left, value);
        } else {
            node.right = insertNode(node.right, value);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        int balance = getBalance(node);

        // LL Condition ===> rotateRight
        if (balance > 1 && value < node.left.value) {
            return rotateRight(node);
        }

        // LR condition ====> rotateLeft, rotateRight
        if (balance > 1 && value > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RR Condition ===> rotateLeft
        if (balance < -1 && value > node.right.value) {
            return rotateLeft(node);
        }

        // RL Condition ===> rotateRight, rotateLeft
        if (balance < -1 && value < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    // Minimum node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    // delete node
    public BinaryNode deleteNode(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < node.value) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.value) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left != null && node.right != null) {      // node has two children
                BinaryNode minNodeRight = minimumNode(node.right);
                node.value = minNodeRight.value;
                node.right = deleteNode(node.right, minNodeRight.value);
            } else if (node.left != null) {         // only left child
                node = node.left;
            } else if (node.right != null) {        // only right child
                node  = node.right;
            } else {                                // no child
                node = null;
            }
        }

        int balance = getBalance(node);
        // LL Condition ===> rotateRight
        if (balance > 1 && getBalance(node.left) >= 0) {
            return rotateRight(node);
        }

        // LR condition ====> rotateLeft, rotateRight
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        // RR Condition ===> rotateLeft
        if (balance < -1 && getBalance(node.right) <= 0) {
            return rotateLeft(node);
        }

        // RL Condition ===> rotateRight, rotateLeft
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    // delete AVL
    public void deleteAVL(){
        root =null;
        System.out.println("BST deleted successfully");
    }
}
