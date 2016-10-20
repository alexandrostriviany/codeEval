package com.codeEval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Oleksandr_Mosin on 10/17/2016.
 */
public class BlackCard {
    public static void runBlackCard(String line) {
        String[] array = line.split("\\| ");
        int path;
        List<String> namesList = new ArrayList<>();
        String[] names = array[0].split(" ");
        Collections.addAll(namesList,names);
        while (namesList.size() > 1) {
            path = Integer.parseInt(array[1]);
            while (path > namesList.size()) {
                path = path % namesList.size();
            }
            path = path == 0 ? 2 : path;
            namesList.remove(path - 1);
        }
        System.out.println(namesList.get(0));
    }
}

