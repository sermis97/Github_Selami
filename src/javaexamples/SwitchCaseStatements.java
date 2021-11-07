package com.cydeo.javaexamples;

public class SwitchCaseStatements {

    public static void main(String[] args) {

        String a= "FRIDAY";

        switch (a){
            case "SUNDAY":
                System.out.println("Today is  SUNDAY"  ); break;
            case "MONDAY":
                System.out.println("Today is  MONDAY"  ); break;
            case "WEDNESDAY":
                System.out.println("Today is  WEDNESDAY "  ); break;
            default:
                System.out.println("I do not know the day ");
        }
    }
}
