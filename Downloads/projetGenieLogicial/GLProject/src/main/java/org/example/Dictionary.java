package org.example;

import java.util.HashMap;

public class Dictionary {
    private String name;
    private HashMap<String, String> dictionary;

    public Dictionary(String name) {
        this.name = name;
        this.dictionary = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }
}
