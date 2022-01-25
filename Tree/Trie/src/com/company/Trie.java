package com.company;

public class Trie {
    public TrieNode root;

    public Trie() {
        this.root = new TrieNode();
        System.out.println("Trie has been created");
    }

    // insert
    public void insert(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i<word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                currentNode.children.put(ch, node);
            }
            currentNode = node;
        }
        currentNode.endOfString = true;
        System.out.println(word + " inserted in Trie");
    }

    // search for a word
    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null){
            System.out.println(word + " does note exist in trie");
            return false;
            }
            currentNode = node;
        }
        if (currentNode.endOfString) {
            System.out.println(word + " exist in trie");
            return true;
        } else {
            System.out.println(word + " does not exist in trie, but is a prefix of another string");
        }
        return currentNode.endOfString;
    }

    // delete word in trie
    private  boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

        if (currentNode.children.size() > 1) {
            delete(currentNode, word, index+1);
            return false;
        }
        if (index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }
        if (currentNode.endOfString) {
            delete(currentNode, word, index+1);
            return false;
        }
        canThisNodeBeDeleted = delete(currentNode, word, index+1);
        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }

}
