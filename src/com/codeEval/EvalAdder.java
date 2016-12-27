package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 11/15/2016.
 */
public class EvalAdder {
    public static void runEvalAdder (String line){
        String[] variables = line.split("\n");
        String wordToAdd = "eval";
        for (String var: variables){
            System.out.print(wordToAdd + " " + var + " ");
        }
        System.out.println();
    }
}
