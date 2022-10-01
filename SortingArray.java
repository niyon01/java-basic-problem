package com.practice_java;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
       int [] arr =  getArray();
       printArray(arr);
       sortArray(arr);
       printArray(arr);
       reverse(arr);
       printArray(arr);
    }

    private static void sortArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    private static void printArray(int[] arr) {
        for(int element : arr) {
            System.out.print(element+ " ");
        }
        System.out.println();
    }

    private static int[] getArray() {
        System.out.println("How many items you want to put in the array?");
        var in = new Scanner(System.in);
        int length= in.nextInt();
        int[] arr = new int[length];
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
