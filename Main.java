package com.company;

import java.util.Scanner;

public class Main {
    //multiply of float numbers
    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        float a = scanner.nextFloat();
        System.out.println("b: ");
        float b = scanner.nextFloat();
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
        System.out.println("Multiply Result: " +(a*b));



    }
}
