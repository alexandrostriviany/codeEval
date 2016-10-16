package com.codeEval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by BDSM on 15.10.2016.
 */
public class LowestUniqueNumber {
    public static void runLovestUniqueNumber(String line) {
        String[] numbers = line.split(" ");
        List<Integer> list = new ArrayList<>();
        boolean unic = true;
        int i = 0;
        int q = 0;
        int answr = 0;
        for (i = 0; i < numbers.length; i++) {
            unic = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i].equals(numbers[j])) {
                        unic = false;
                        break;
                    } else {
                        unic = true;
                    }
                }
            }
            if (unic) {
                list.add(Integer.parseInt(numbers[i]));
            }
        }
        if (!list.isEmpty()) {
            Collections.sort(list);
            String loverUniqNumber = list.get(0).toString();
            while (q < numbers.length) {
                if (numbers[q].equals(loverUniqNumber)) {
                    answr = q + 1;
                }
                q++;
            }
        }
        System.out.println(answr);
    }
}
