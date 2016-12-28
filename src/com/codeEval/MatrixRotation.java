package com.codeEval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Oleksandr_Mosin on 12/28/2016.
 */
public class MatrixRotation {
    public static void runMatrixRotation(final String line) {
        List<String> arr = new ArrayList();
        Collections.addAll(arr, line.split(" "));
        StringBuilder str = new StringBuilder();
        double step = Math.sqrt(arr.size());
        while (arr.size() > 0.0) {
            double i = arr.size();
            while (i > 0) {
                int n = (int) (i - step);
                str.append(arr.get(n)+" ");
                i = n;
                arr.remove(n);
            }
            step--;
        }
        System.out.println(str);
    }
}
