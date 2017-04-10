package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/6/2016.
 */

public class Fibonacci {
    // Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    // якщо число не можливо вирахувати поверніть -1
    public static long getNumber(int position) {
        int path = position;
        int fibonacci = 0;
        int y = 1;
        int x = 0;
        int i = 0;
        if (path <= 0 ){
            fibonacci = -1;
        }
        else if (path == 1) {
            fibonacci = 1;
        } else {
            while (i < path) {
                fibonacci = x + y;
                y = x;
                x = fibonacci;
                i++;
            }
        }
        return fibonacci;
    }
}