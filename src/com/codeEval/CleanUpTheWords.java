package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 12/27/2016.
 */
public class CleanUpTheWords {
    public static void runCleanUpTheWords(String line) {
        String clearText;
        StringBuilder str = new StringBuilder();
        char[] notClearText = line.toCharArray();
        for (int i = 0; i<notClearText.length; i++){
            if (Character.isLetter(notClearText[i])) {
                str.append(notClearText[i]);
                if(i < notClearText.length-1 && !Character.isLetter(notClearText[i+1])){
                    str.append(" ");
                }
            }
        }
        clearText = str.toString().toLowerCase();
        System.out.println(clearText);
    }
}

