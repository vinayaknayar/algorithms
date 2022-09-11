package com.company;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = arrayInput(size);
        System.out.println("Enter the value of target element");
        int target = sc.nextInt();

        int answer = binarySearch(arr, target);

        System.out.println("Element " + target + " is found at index " + answer);

        int recursive_answer = binarySearchRecursive(arr, target, 0, arr.length - 1);

        System.out.println("Element " + target + " is found at index " + answer + " by using recursive method");


    }

    static int[] arrayInput(int size) {
        int[] arr = new int[size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of sorted array");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        return arr;
    }


    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;  // better approach than (low+high)/2
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (target > arr[mid]) {
                return binarySearchRecursive(arr, target, mid + 1, high);
            }
            if (target < arr[mid]) {
                return binarySearchRecursive(arr, target, low, mid - 1);
            }
            return mid;
        }
        return -1;

    }
}
