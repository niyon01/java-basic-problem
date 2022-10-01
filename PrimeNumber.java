package com.practice_java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Enter two intervals:");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
       while(n1<=n2){
           if(isPrimeNumber(n1)){
               System.out.println(n1+ " ");
           }
           n1++;
       }
    }

    public static boolean isPrimeNumber(int i) {
        if (i < 2){
            return false;
        }
        int count = 2;
        while (count * count <=i) {
            if (i % count == 0) return false;
            count++;
        }
        return count*count>=i;
    }
}
