package com.quadraticEquation;

/**
 * Created by Oleksandr_Mosin on 10/10/2016.
 */
public class ArmstrongNumbers { 
    public static void runArmstrongNumbers(String line){
        line = line.replaceAll(" ","");
        final double length = line.length();
        String[] valueArray = line.split("");
        double originValue = Double.parseDouble(line);
        double numb;
        double sum = 0;
        String armstrongValue = "False";
        for (int i = 0; i<length; i++){
            numb = Math.pow(Double.parseDouble(valueArray[i]),length);
            sum = sum + numb;
        }
       if(originValue == sum){
           armstrongValue = "True";
       }
        System.out.println(armstrongValue);
    }
}
