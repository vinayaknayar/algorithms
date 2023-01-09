package algorithms;

import java.util.Scanner;

public class ArrayMethods {
    public int[] arrayInput(int size) {
        int[] arr = new int[size];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        return arr;
    }

    public void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("");
    }
}

