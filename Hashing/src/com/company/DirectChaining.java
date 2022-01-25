package com.company;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    public DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }

    // hash function
    public int modASCII(String word, int M) {
        char[] ch;
        ch = word.toCharArray();
        int i, sum = 0;
        for (i=0; i<word.length(); i++) {
            sum += ch[i];
        }
        return sum % M;
    }

    // insert
    public void insert(String word) {
        int index = modASCII(word, hashTable.length);
        if (hashTable[index]==null) {
            hashTable[index] = new LinkedList<>();
            hashTable[index].add(word);
        } else {
            hashTable[index].add(word);
        }
    }

    // display hash table
    public void displayHashTable() {
        if (hashTable == null) {
            System.out.println("Hash Table doesn't exist");
            return;
        } else {
            System.out.println("\n ================= Hash Table =============");
            for (int i = 0; i<hashTable.length; i++) {
                System.out.println("Index " + i + " , Key: " + hashTable[i]);
            }
        }

    }

    // search hash table
    public boolean search(String word) {
        int index = modASCII(word, hashTable.length);
        if (hashTable[index] != null && hashTable[index].contains(word)) {
            System.out.println("\n" + "\"" + word + "\"" + " found at " + index);
            return true;
        }
        System.out.println("\n" + "\"" + word + "\"" + " not found");
        return false;
    }

    // delete
    public void delete(String word) {
        int index = modASCII(word, hashTable.length);
        if (search(word)) {
            hashTable[index].remove(word);
            System.out.println("\n" + "\"" + word + "\"" + " has been deleted from hashtable" );
        }
    }

}
