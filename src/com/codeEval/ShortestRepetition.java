package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 11/14/2016.
 */
public class ShortestRepetition {
    public static void runShortestRepetition(String line) {
        String[] repetitionSet = line.split("");
        int i = 1;
        String firstChar = repetitionSet[0];
        while (repetitionSet.length > i) {
            int secondRepetitionNumber = i*2;
            if (firstChar.equals(repetitionSet[i])) {
                if (repetitionSet.length > secondRepetitionNumber) {
                    if (repetitionSet[i].equals(repetitionSet[secondRepetitionNumber])) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i++;
        }
        System.out.println(i);
    }
}
