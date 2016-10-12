package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 10/11/2016.
 */
public class SlangFavor {
    public static void runSlangFavor(String line) {
        String[] slang = new String[] { ", yeah!", ", this is crazy, I tell ya.", ", can U believe this?", ", eh?",
                ", yo.", ", aw yea.", "? No way!", ". Awesome!" };
        String[] punctuationMark = new String[] { "!", ".", "?" };
        String[] lineArray = line.split("");
        String answer = "";
        StringBuilder build = new StringBuilder();
        boolean flag = true;
        int j = 0;
        for (int i = 0; i < line.length(); i++) {
            String chr = lineArray[i];
            if (chr.equals(punctuationMark[0]) || chr.equals(punctuationMark[1]) || chr.equals(punctuationMark[2])) {
                if (!flag) {
                    chr = slang[j];
                    j++;
                }
                flag = !flag;
            }
            j = j > slang.length - 1 ? 0 : j;
            answer = build.append(chr).toString();
        }

        System.out.println(answer);
    }
}
