package com.company;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> children;
    boolean endOfString;

    public TrieNode() {
        this.children = new HashMap<>();
        endOfString = false;
    }
}
