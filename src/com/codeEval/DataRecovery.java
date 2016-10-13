package com.codeEval;


public class DataRecovery {
    public static void runDataRecovery(String line) {
        String[] array = line.split(";");
        String[] wordArr = array[0].split(" "); // take words set
        String[] numArr = array[1].split(" "); // take number-key set

        int value; // number key from numArr
        int lostValue; // number was missed in numArr
        String answer = "";
        int j = 1;
        StringBuilder bldr = new StringBuilder();

        // look for lost number through a difference between the amounts
        int sum = 0;
        int sum1 = 0;
        for (String q:numArr) {
            sum = sum + Integer.parseInt(q);
        }
        for (int w = 1; w < wordArr.length + 1; w++) {
            sum1 = sum1 + w;
        }
        lostValue = sum1 - sum;

        // make new number's array with lost number on the end
        String newstr = array[1]+" "+ lostValue;
        numArr = newstr.split(" ");

        while (j < numArr.length + 1) {
            for (int i = 0; i < numArr.length; i++) {
                value = Integer.parseInt(numArr[i]);
                if (value == j) {
                    answer = bldr.append(wordArr[i] + " ").toString();
                    j++;
                }
            }
        }
        System.out.println(answer);
    }
}
