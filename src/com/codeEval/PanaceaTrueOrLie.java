package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/13/2016.
 */
public class PanaceaTrueOrLie {
    public static void runPanaceaTrueOrLie(String line) {
        String[] array = line.split("\\| ");
        String[] leftSet = array[0].split(" ");
        final double hexadecimalNumber = 16;
        final double binaryNumber = 2;
        double xy; // term of a hexadecimal number
        double leftSum = 0;
        // find sum of the left set
        for (String i : leftSet) {
            String[] number = i.split("");
            double j = number.length;
            for (String x : number) {
                switch (x) {
                    case "a":
                        x = "10";
                        break;
                    case "b":
                        x = "11";
                        break;
                    case "c":
                        x = "12";
                        break;
                    case "d":
                        x = "13";
                        break;
                    case "e":
                        x = "14";
                        break;
                    case "f":
                        x = "15";
                        break;
                }
                xy = Double.parseDouble(x)*Math.pow(hexadecimalNumber,j-1);
                leftSum = leftSum + xy;
                j--;
            }
        }

        // find sum of the right set
        String[] rightSet = array[1].split(" ");
        int w;
        double rn; // term of a binary number
        double rightSum = 0;
        for (String n : rightSet) {
            String[] rightNumber = n.split("");
            w = rightNumber.length;
            for (String z : rightNumber) {
                rn = Double.parseDouble(z) * Math.pow(binaryNumber, w - 1);
                rightSum = rightSum + rn;
                w--;
            }
        }
        String answer = "False";
        if((int)leftSum <= (int)rightSum){
            answer = "True";
        }
        System.out.println(answer);

    }
}
