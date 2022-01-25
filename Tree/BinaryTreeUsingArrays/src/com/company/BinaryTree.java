package com.company;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        this.lastUsedIndex = 0;
        System.out.println("Blank tree of size " + size + " created");
    }

    //isFull
    public boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

    // insert
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " has been inserted");
        } else {
            System.out.println("The BT is full");
        }
    }

    // pre order traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        System.out.print(arr[index]+ " ");
        preOrder(index*2);
        preOrder(index*2+1);
    }

    // in order traversal
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index*2);
        System.out.print(arr[index]+ " ");
        inOrder(index*2+1);
    }

    // post order traversal
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index*2);
        postOrder(index*2+1);
        System.out.print(arr[index]+ " ");
    }

    // level order traversal
    public void levelOrder() {
        for(int i=1; i<= lastUsedIndex; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    // search
    public int search(String value) {
        for(int i=1; i<= lastUsedIndex; i++) {
            if (arr[i] == value) {
                System.out.println(value + " found at " + i );
                return i;
            }
        }
        System.out.println("The value doesn't exist");
        return -1;
    }

    // delete Node
    public void deleteNode(String value) {
        int location = search(value);
        if (location == -1)
            return;
        arr[location] = arr[lastUsedIndex];
        lastUsedIndex--;
        System.out.println("Node successfully deleted");
    }

    // delete binary tree
    public void deleteTree() {
        try {
            arr=null;
            System.out.println("The Bt successfully deleted");
        } catch (Exception e) {
            System.out.println("There was an error deleting the tree");
        }
    }

}
