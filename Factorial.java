package com.practice_java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();

    }

    private static void factorial() {
        System.out.print("Enter Number : ");
        var in = new Scanner(System.in);
        int num = in.nextInt();
        int facto = 1;
        for (int j = num; j > 0; j--) {
            if (j != 1) System.out.print(j + " * ");
            else System.out.print(j + " ");
            facto = facto * j;
        }
        System.out.print("= " + facto);
    }
}
