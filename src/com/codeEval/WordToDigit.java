package com.codeEval;

/**
 * Created by BDSM on 15.10.2016.
 */
public class WordToDigit {
    public static void runWordToDigit(String line) {
        String[] words = line.split(";");
        String number ="";
        for (String i : words) {
            switch (i) {
                case "zero":
                    number = "0";
                    break;
                case "one":
                    number = "1";
                    break;
                case "two":
                    number = "2";
                    break;
                case "three":
                    number = "3";
                    break;
                case "four":
                    number = "4";
                    break;
                case "five":
                    number = "5";
                    break;
                case "six":
                    number = "6";
                    break;
                case "seven":
                    number = "7";
                    break;
                case "eight":
                    number = "8";
                    break;
                case "nine":
                    number = "9";
                    break;
                default:
                    number = " not a number ";
                    break;
            }
            System.out.print(number);
        }
        System.out.println();
    }
}
