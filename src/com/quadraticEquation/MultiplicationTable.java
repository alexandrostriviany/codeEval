package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 10/6/2016.
 */
public class MultiplicationTable {
    public static void runMultiplicationTable() {
        int matrixSize = 12;
        int valueLenght = 4;
        for (int i = 1; i < matrixSize + 1; i++) {
            for (int y = 1; y < matrixSize + 1; y++) {
                int value = i*y;
                String valueString = String.valueOf(value);
                while (valueString.length()<valueLenght){
                    valueString = " " + valueString ;
                }
                System.out.print(valueString);
            }
            System.out.println();
        }
    }
}
