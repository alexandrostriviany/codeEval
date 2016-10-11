package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 10/6/2016.
 */
public class SumOfPrimes {
    public static void runSumOfPrimes() {
        int limit = 1000;
        int counter = 0;
        int value = 2;
        boolean valueIsPrime = true;
        int sum = 0;
        while (counter < limit) {
            for (int previousValue = value - 1; previousValue > 1; previousValue--) {
                valueIsPrime = true;
                if (value % previousValue == 0) {
                    valueIsPrime = false;
                    break;
                }
            }
            if (valueIsPrime) {
                sum = value + sum;
                counter++;
            }
            value++;
        }
        System.out.println(sum);
    }
}
