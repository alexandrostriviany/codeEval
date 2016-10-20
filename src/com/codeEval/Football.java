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
        List<Integer> teams = new ArrayList<>();
        for (String number: string){
            if(!teams.contains(Integer.parseInt(number))){
                teams.add(Integer.parseInt(number));
            }
        }
        Collections.sort(teams);
        for (Integer team : teams) {
            answer = team + ":";
            for (int j = 0; j<countries.length; j++) {
                String[] country = countries[j].split(" ");
                for(int x=0; x<country.length; x++){
                    if (Integer.parseInt(country[x]) == team) {
                        answer = answer + (j+1) + ",";
                    }
                }
            }
            System.out.print(answer.substring(0,answer.length()-1) + "; ");
        }
        System.out.println();
    }
}
