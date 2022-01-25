package com.company;

import java.util.ArrayList;

public class LinearProbing {
    public String[] hashtable;
    int usedCellNumber;

    LinearProbing(int size) {
        hashtable = new String[size];
        usedCellNumber = 0;
    }

    // display hash table
    public void displayHashTable() {
        if (hashtable == null) {
            System.out.println("Hash Table doesn't exist");
            return;
        } else {
            System.out.println("\n ================= Hash Table =============");
            for (int i = 0; i<hashtable.length; i++) {
                System.out.println("Index " + i + " , Key: " + hashtable[i]);
            }
        }
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

    // load factor
    public double getLoadFactor() {
        double loadFactor = usedCellNumber * 1.0/hashtable.length;  // java documentation if it is > 0.75 create new hashtable
        return loadFactor;
    }

    // Rehash
    public void rehashKeys(String word) {
        ArrayList<String> data = new ArrayList<>();
        for (String s : hashtable) {
            if (s != null) {
                data.add(s);
            }
        }
            data.add(word);
            hashtable = new String[hashtable.length * 2];
            for (String s : data) {
                insertInHashTable(s);
            }
    }

    // Insert in hash table
    public void insertInHashTable(String word) {
        double loadFactor = getLoadFactor();
        if (loadFactor >= 0.75) {
            rehashKeys(word);
        } else {
            int index = modASCII(word, hashtable.length);
            for (int i = index; i<index + hashtable.length; i++) {
                int newIndex = i % hashtable.length;
                if (hashtable[newIndex] == null) {
                    hashtable[newIndex] = word;
                    System.out.println(word + " inserted at location " + newIndex);
                    break;
                } else {
                    System.out.println(newIndex + " already occupied trying next empty cell");
                }
            }
        }
        usedCellNumber++;
    }

    // search in hash table
    public boolean searchHashTable(String word) {
        int index = modASCII(word, hashtable.length);
        for (int i = index; i < index + hashtable.length; i++) {
            int newIndex = i % hashtable.length;
            if (hashtable[newIndex] != null && hashtable[newIndex].equals(word)) {
                System.out.println(word + " found at location " + newIndex);
                return true;
            }
        }
        System.out.println(word + " not found in hash");
        return false;
    }

    // delete key in hash
    public void deleteKeyHashTable(String word) {
        int index = modASCII(word, hashtable.length);
        for (int i = index; i < index + hashtable.length; i++) {
            int newIndex = i % hashtable.length;
            if (hashtable[newIndex] != null && hashtable[newIndex].equals(word)) {
                hashtable[newIndex] = null;
                System.out.println(word + " has been deleted");
                return;
            }
        }
        System.out.println(word + " not found in  hashtable");
    }

}
