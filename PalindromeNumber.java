package com.practice_java;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.print("Enter two intervals : ");
        int n1= in.nextInt();
        int n2= in.nextInt();

        for (int i = n1; i < n2; i++) {
            if (isPalindromeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPalindromeNumber(int num) {

        int revNum = revNum(num);
        return num == revNum;
    }

    private static int revNum(int num) {
        int rem;
        int revNum = 0;
        while (num > 0) {
            rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }
        return revNum;
    }
}
