package com.practice_java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibo();
    }

    private static void fibo() {
        System.out.print("Enter Fibonacci intervals: ");
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        int first = 0;
        int second = 1;
        int count = 0;
        int ans =0;

        while(count<num){
            System.out.print(first + " ");
            ans+=first;
            int third= first + second;
            first = second;
            second = third;
            count++;
        }
        System.out.print("\nSum of all the numbers - "+ans);
    }
}
