package com.example.basichw04;


import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int hr,min,sec = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the sec");
        int insec = scanner.nextInt();
        hr = insec/3600;
        min = (insec%3600)/60;
        sec =  (insec%3600)%60;
        System.out.printf("your time value is  %d : %d : %d :",hr,min,sec);
    }
}