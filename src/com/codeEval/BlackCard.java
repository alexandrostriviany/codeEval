package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/17/2016.
 */
public class BlackCard {
    public static void runBlackCard(String line) {
        String fakeName = "NULL";
        String[] array = line.split("\\| ");
        String[] nameSet = array[0].split(" ");
        int path = Integer.parseInt(array[1]);
        for (int i = 0; i < nameSet.length-1; i++) {
            while (path > nameSet.length) {
                path = path % nameSet.length - 1;
            }
            if (path-1 < 0){
                nameSet[0] = fakeName;
            }else {
                nameSet[path - 1] = fakeName;
            }
            path++;
        }
        for (String k:nameSet) {
            if (!k.equals(fakeName)){
                System.out.println(k);
            }
        }
    }
}
