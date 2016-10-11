package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 10/10/2016.
 */
public class MersennePrime {
    public static void runMersennePrime(String line) {
        double doublePath = Double.parseDouble(line);
        double degree = 2;
        double mersennePrime = 0;
        String result = "";
        while (mersennePrime < doublePath) {
            boolean primeDegree = true;
            // is degree prime?
            for (double i = degree - 1; i > 1; i--) {
                if (degree % i == 0) {
                    primeDegree = false;
                    break;
                }
            }
            if (primeDegree) {
                mersennePrime = Math.pow(2, degree) - 1;
                if (mersennePrime < doublePath) {
                    result = result + (int)mersennePrime + ", ";
                }
            }
            degree++;
        }
        result = result.substring(0,result.length()-2);
        System.out.println(result);
    }
}
