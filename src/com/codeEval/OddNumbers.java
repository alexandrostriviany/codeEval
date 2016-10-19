package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/18/2016.
 */
public class OddNumbers {
    public static void runOddNumbers() {
        int maxNumber = 99;
        for (int number = 0; number <= maxNumber; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

    }
}
