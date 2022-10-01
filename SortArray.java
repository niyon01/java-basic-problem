package com.practice_java;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        var in = new Scanner(System.in);
        System.out.print("Enter your array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.print("Ascending array : "); ascendingSort(array);

        System.out.print("Descending array : "); descendingSort(array);
    }

    private static void descendingSort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int j = i + 1;
            while (j < array.length) {
                if (array[i] < array[j]) {
                    swap(array, i, j);
                }
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void ascendingSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j) {
        if (i < 0 || i > arr.length) {
            return;
        } else if (j < 0 || j > arr.length) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

