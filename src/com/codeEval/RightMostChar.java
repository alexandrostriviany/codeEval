package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/5/2016.
 */
public class RightMostChar {
    public static void runRightMostChar(String line) {
        if ("".equals(line)) {
            return;
        }

        // Find character to search
        String[] myString = line.split(",");
        char toSearch = myString[1].toCharArray()[0];

        // Break string to characters
        char[] searchedString = myString[0].toCharArray();

        // Search for rightmost character
        int j = -1;

        for (int i = 0; i < searchedString.length; i++) {

            if (searchedString[i] == toSearch) {
                j = i;
            }
        }

        System.out.println(j);
    }
}
