package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/7/2016.
 */
public class PenultimateWord {
    public static void runPenultimateWord(String line){
        String[] inputString = line.split(" ");
        System.out.println(inputString[inputString.length-2]);
    }
}
