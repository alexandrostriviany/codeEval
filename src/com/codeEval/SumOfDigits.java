package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 9/29/2016.
 */
public class SumOfDigits {
    public static void sumOfDidg(String line) {
        int value = Integer.parseInt(line);
        final int valueLength = Integer.toString(value).length();
        int counter = 0;
        int n = 1;
        int a;
        int b = 0;
        while (counter < (valueLength - 1)) {
            n = n * 10;
            counter++;
        }
        for (int i = 0; i < valueLength; i++) {
            a = Math.abs(value / n);
            value = value % n;
            b = b + a;
            n = n / 10;
        }
        System.out.println(b);

    }
}
