package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 12/28/2016.
 */
public class PrimePalindrome {
    public static void run(final String line){
        int value = Integer.valueOf(line);
        String str;
        while (value>0){
            str = new StringBuffer(value).reverse().toString();
            if(String.valueOf(value).equals(str)){
                break;
            }
            value--;
        }
    }
}
