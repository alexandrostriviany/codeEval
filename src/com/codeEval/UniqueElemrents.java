package com.codeEval;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksandr_Mosin on 11/15/2016.
 */
public class UniqueElemrents {
    public static void runUniqueElemrents(String line) {
        String[] numbers = line.split(",");
        List<String> allUnique = new ArrayList<>();
        for (String num : numbers){
            if(!allUnique.contains(num)){
                allUnique.add(num);
            }
        }
        String answer = allUnique.toString().replaceAll("\\[","").replaceAll("]","").replaceAll(" ","");
        System.out.println(answer);
    }
}
