package com.tasks7.rpn;

import java.util.ArrayList;
import java.util.List;

public class Application {

    static boolean isNumber(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private static List<Double> calculated(String dd, List<Double> steckList) throws ArithmeticException {
        if (steckList.size() > 1) {
            double a = steckList.get(steckList.size() - 2);
            double b = steckList.get(steckList.size() - 1);
            if (dd.equals("+")) {
                steckList.add(a + b);
            } else if (dd.equals("-")) {
                steckList.add(a - b);
            } else if (dd.equals("/")) {
                if (b == 0) {
                    throw new ArithmeticException();
                } else {
                    steckList.add(a / b);
                }
            } else if (dd.equals("*")) {
                steckList.add(a * b);
            } else {
                throw new RPNParserException();
            }
            steckList.remove(a);
            steckList.remove(b);
        } else {
            throw new RPNParserException();
        }
        return steckList;
    }

    public static double parse(String rpnString) {
        String[] rpnArray = rpnString.split(" ");
        List<Double> stekList = new ArrayList<>();
        for (int i = 0; i < rpnArray.length; i++) {
            String currentSymbol = rpnArray[i];
            if (isNumber(currentSymbol)) {
                stekList.add(Double.parseDouble(currentSymbol));
            } else {
                stekList = calculated(currentSymbol, stekList);
            }
        }
        if (stekList.size() > 1) {
            throw new RPNParserException();
        }
        return stekList.get(0);
    }

    public static void main(String[] args) {

    }

}
