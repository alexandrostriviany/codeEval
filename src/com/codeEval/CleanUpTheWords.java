package com.codeEval;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Oleksandr_Mosin on 12/27/2016.
 */
public class CleanUpTheWords {
    public static void runCleanUpTheWords(String line) {
        String clearText = "";
        String[] notClearText = line.split("");
        String symbols = "1234567890-=~!@#$%^&*()_+:'';\"\\|/_?.,<>{}[]`";
        for (int i = 0; i<notClearText.length; i++){
            if (!symbols.contains(notClearText[i])) {
                clearText = clearText + (notClearText[i].toLowerCase());
                if(i < notClearText.length-1 && symbols.contains(notClearText[i+1])){
                    clearText = clearText + (" ");
                }
            }
        }
        System.out.println(clearText);
    }
}
