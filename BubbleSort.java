package algorithms;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        scan.close();
        int[] arr = arrayInput(size);
        int[] arrBS = bubbleSort(arr, size);
        System.out.println("Array sorted by bubble sort algorithm: ");
        printArray(arrBS, size);
        int[] arrBSR = bubbleSort(arr, size);
        System.out.println("Array sorted by bubble sort recursive algorithm: ");
        printArray(arrBSR, size);

    }

    static int[] arrayInput(int size) {
        int[] arr = new int[size];
        Scanner scan = new Scanner(System.in);
        scan.close();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }

    static int[] bubbleSort(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }

    static int[] bubbleSortRecursive(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return arr;
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        size = size - 1;

        bubbleSort(arr, size);
        return arr;
    }
}

