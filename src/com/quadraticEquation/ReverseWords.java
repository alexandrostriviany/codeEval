package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 10/4/2016.
 */
public class ReverseWords {
    public static void runReverseWords(String line) {
        String[] word = line.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.print(word[i]+ " ");
        }
        System.out.println();
    }

}
