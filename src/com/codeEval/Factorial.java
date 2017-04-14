package com.codeEval;

/**
 * Created by Oleksandr_Mosin on 4/11/2017.
 */
public class Factorial {
    public static int factorial(int a){
        if (a==0) return 1;
        return a * factorial(a-1);
    }
    public static int fact(int n){
        int answer = 1;
        for (int i = 1; i<=n; i++){
            answer *= i;

        }
    return answer;}

    public static String convert(String a){
        StringBuilder answer = new StringBuilder();
        for(int i = a.length()-1; i>=0; i--){
            answer.append(a.charAt(i));
        }
        return answer.toString();
    }
}
