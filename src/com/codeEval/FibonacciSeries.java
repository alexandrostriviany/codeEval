package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/6/2016.
 */
public class FibonacciSeries {
    public static void runFibonacciSeries(String line) {
        int path = Integer.parseInt(line);
        int fibonacci=0;
        int y = 1;
        int x = 0;
        int i = 0;
        if (path == 0) {
            fibonacci = 0;
        } else if (path == 1) {
            fibonacci = 1;
        } else {
            while (i < path) {
                fibonacci = x + y;
                y = x;
                x = fibonacci;
                i++;
            }
        }
        System.out.println(fibonacci);
    }
}
