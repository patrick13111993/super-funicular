package com.example.user.wordcounter;

/**
 * Created by user on 13/12/2016.
 */
public class Counter implements Countable {

    private int wordCount;

    public Counter() {
        this.wordCount = wordCount;
    }

    public int getWordCount(String words) {
        int wordCount = 0;

        boolean word = false;
        int endOfLine = words.length() -1;

        for (int i = 0; i < words.length(); i++) {
            if (Character.isLetter(words.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(words.charAt(i)) && word) {
                wordCount++;
                word = false;
            } else if (Character.isLetter(words.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
    return wordCount;
    }
}
