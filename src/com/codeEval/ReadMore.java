package com.codeEval;

import java.util.List;

/**
 * Created by Oleksandr_Mosin on 12/27/2016.
 */
public class ReadMore {
    public static void runReadMore(final String line) {
        final String READ_MORE = "... <Read More>";
        final int MAX_TRIMED_LENGTH = 40;
        if (line.length() <= 55) {
            System.out.println(line);
        } else {
            int i = MAX_TRIMED_LENGTH-1;
            while (i >= 0 && line.charAt(i) != ' ') {
                i--;
                if (i < 0){
                    i = MAX_TRIMED_LENGTH;
                    break;
                }
            }
            System.out.println(line.substring(0, i) + READ_MORE);
        }
    }
}
