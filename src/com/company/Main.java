package com.company;
/*it uses appropritate operations such as "+","-","*","/" according to user's choice. and calculates numbers.
 if user enters wrong operation, it invalidates.
 if user puts wrong inputs it provides number formatting exception with message*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1= getInput("enter first number: ");
        String s2 = getInput("enter second number: ");
        String op = getInput("choose an operation: +  - *  /");
        double result =0;

        try {

            switch (op) {
                case "+":
                    result +=addition(s1,s2);
                    break;
                case "-":
                    result +=subtration(s1,s2);
                    break;
                case "*":
                    result +=multiplication(s1,s2);
                    break;
                case "/":
                    result+= division(s1,s2);

                    break;
                default:
                    System.out.println(" this is not an  authentic operation");
                    return;

            }
            System.out.println(result);
        }catch (Exception e){
            System.out.println(" Here is number formatting exception: "+ e.getMessage());;
        }


    }
    static double addition(String s1, String s2){
        double d1= Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1+d2;
    }
    static double subtration(String s1, String s2){
        double d1= Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1-d2;
    }
    static double multiplication(String s1, String s2){
        double d1= Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1*d2;
    }
    static double division(String s1, String s2){
        double d1= Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1/d2;
    }
    static String getInput(String prompt){
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
