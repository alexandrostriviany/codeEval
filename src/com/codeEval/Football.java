package com.codeEval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Oleksandr_Mosin on 10/19/2016.
 */
public class Football {
    public static void runFootball (String line){
        String[]string = line.replace("| ","").split(" ");
        String answer;
        String[]countries = line.split("\\| ");
        List<String> teams = new ArrayList<>();
        for (int i = 0; i<string.length; i++){
            if(!teams.contains(string[i])){
                teams.add(string[i]);
            }
        }
        Collections.sort(teams);
        for (String team : teams) {
            answer = team + ":";
            for (int j = 0; j<countries.length; j++) {
                if(countries[j].contains(team)){
                    answer = answer + (j+1) + ",";
                }
            }
           System.out.print(answer.substring(0,answer.length()-1) + "; ");
        }
        System.out.println();
    }
}
