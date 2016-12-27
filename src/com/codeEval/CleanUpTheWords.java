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
        char[] notClearText = line.toCharArray();
        for (int i = 0; i<notClearText.length; i++){
            if (Character.isLetter(notClearText[i])) {
                clearText += (notClearText[i]);
                if(i < notClearText.length-1 && !Character.isLetter(notClearText[i+1])){
                    clearText += (" ");
                }
            }
        }
        System.out.println(clearText.toLowerCase());
    }
}

