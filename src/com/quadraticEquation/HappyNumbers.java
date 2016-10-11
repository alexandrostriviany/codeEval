package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 10/7/2016.
 */
public class HappyNumbers {
    public static void runHappyNumbers(String line) {
        String lineString = line;
        int counter = 0;
        String happyEnd = "1";
        String notHappy = "0";
        while (!lineString.equals(happyEnd) && counter < 10) {
            char[] number = lineString.toCharArray();
            int pow;
            int sum = 0;
            for (int i = 0; i < number.length; i++) {
                int num = Integer.parseInt(String.valueOf(number[i]));
                pow = num * num;
                sum = sum + pow;
            }
            lineString = String.valueOf(sum);
            counter++;
        }
        if (lineString.equals(happyEnd)) {
            System.out.println(happyEnd);
        } else {
            System.out.println(notHappy);
        }
    }
}
