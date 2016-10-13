package com.codeEval;


/**
 * Created by Oleksandr_Mosin on 10/12/2016.
 */
public class FindAWriter {
   public static void runfindeAWriter(String line){
       String[] array = line.split("\\| ");
       char[] encodedName = array[0].toCharArray();
       String[] keySet = array[1].split(" ");
       String answer = "";
       int key;
       StringBuilder build = new StringBuilder();
       for (String i:keySet){
           key = Integer.parseInt(i)-1;
           answer = build.append(encodedName[key]).toString();
       }
       System.out.println(answer);
   }
}
