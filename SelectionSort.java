package com.company;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = arrayInput(size);
        int[] arrSS = selectionSort(arr, size);
        System.out.println("Array sorted by selection sort algorithm: ");
        printArray(arrSS, size);
    }

    static int[] arrayInput(int size) {
        int[] arr = new int[size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        return arr;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        System.out.println(arr[b]);
    }

    static int[] selectionSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            int maxIndex = size - i - 1;

            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, size - i - 1);

        }
        return arr;
    }

}

