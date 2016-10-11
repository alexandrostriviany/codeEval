package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 9/29/2016.
 */
public class FizzBuzz {
    public static void playFizzBuzz(String line) {
        String[] inputString = line.split(" ");
        int x = Integer.parseInt(inputString[0]);
        int y = Integer.parseInt(inputString[1]);
        int n = Integer.parseInt(inputString[2]);

        for (int i = 1; i <= n; i++) {
            if (i % x == 0 && i % y == 0) {
                System.out.print("FB ");
            } else if (i % x == 0) {
                System.out.print("F ");
            } else if (i % y == 0) {
                System.out.print("B ");
            } else
                System.out.print(i+" ");
        }
        System.out.print("\n");

    }
}
