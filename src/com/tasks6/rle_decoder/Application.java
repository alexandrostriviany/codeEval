package com.tasks6.rle_decoder;

public class Application {
    static boolean isNumber(char value) {
        try {
            Integer.parseInt(Character.toString(value));
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    static boolean hasErrors(char[] array) {
        if (array.length <= 0 || isNumber(array[0])) {
            return true;
        } else {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == array[j + 1] || (isNumber(array[j]) && isNumber(array[j + 1]))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] array = args[0].toCharArray();
        StringBuilder answer = new StringBuilder();
        if (!hasErrors(array)) {
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) {
                    int iterator = Integer.parseInt(Character.toString(array[i]));
                    for (int j = 0; j < iterator - 1; j++) {
                        answer.append(array[i - 1]);
                    }
                } else {
                    answer.append(array[i]);
                }

            }
        }
        System.out.println(answer);
    }

}