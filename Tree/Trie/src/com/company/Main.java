package com.company;

public class Main {

    public static void main(String[] args) {
	    Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");

        trie.search("API");
        trie.search("AP");
        trie.search("APIS");

        trie.delete("AP");
        trie.search("AP");

    }
}
