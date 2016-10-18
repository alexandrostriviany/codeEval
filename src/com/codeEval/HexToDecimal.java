package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/18/2016.
 */
public class HexToDecimal {
    public static void runHexToDecimal(final String line){
        String[] leftSet = line.split("");
        double hexadecimalNumber = 16;
        double converted;
        double answer = 0;
        double j = leftSet.length;
        while (j > 0) {
            for (String x : leftSet) {
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
                converted = Double.parseDouble(x)*Math.pow(hexadecimalNumber,j-1);
                answer = answer + converted;
                j--;
            }
        }
        System.out.println((int)answer);
    }
}
