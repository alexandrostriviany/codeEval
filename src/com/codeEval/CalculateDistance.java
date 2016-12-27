package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 11/14/2016.
 */
public class CalculateDistance {
    public static void runCalculateDistance(String line){
        String[] points = line.split("\\) \\(");
        String[] pointA = points[0].replaceAll("\\(","").trim().split(", ");
        String[] pointB = points[1].replaceAll("\\)","").trim().split(", ");
        double xA = Double.parseDouble(pointA[0]);
        double xB = Double.parseDouble(pointB[0]);
        double yA = Double.parseDouble(pointA[1]);
        double yB = Double.parseDouble(pointB[1]);
        int distance = (int)(Math.sqrt(Math.pow(xB-xA,2) + Math.pow(yB-yA,2)));
        System.out.println(distance);
    }
}
