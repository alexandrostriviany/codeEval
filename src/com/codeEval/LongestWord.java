package com.codeEval;

public class LongestWord {
    public static void runLongestWord(String line){
       String[] words = line.split(" ");
        int i = 0;
        String greater = "";
        while(i<words.length){
            if(words[i].length()>greater.length()){
                greater = words[i];
            }
            i++;
        }
        System.out.println(greater);
     }
}
