package algorithms;

import java.util.Scanner;

public class MergeSort {

    // merge function -> heart of the code, merging subarrays by comparing elements of given two subarrays one by one.

    public static void merge(int[] arr, int l, int mid, int h) {
        int[] temp = new int[h - l + 1];       // temporary array
        int k = 0;                             // indexing temp array
        int i = l;                             // indexing left subarray
        int j = mid+1;                         // indexing right subarray

        while(i <= mid && j <= h){           // comparing and merging elements
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        if(i > mid){                          // if elements of lest subarray are already merged
            while(j <= h){
                temp[k++] = arr[j++];
            }
        }
        else{                                 // if elements of right subarray are already merged
            while(i <= mid){
                temp[k++] = arr[i++];
            }
        }

        for(int p=0, q = l ; p < temp.length; p++, q++){
            arr[q] = temp[p];
        }
    }

    // divide function -> recursively  dividing array to singleton subarray from the mid element and calling merge function

    public static int[] divide(int[] arr, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            divide(arr, l, mid);
            divide(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        ArrayMethods am = new ArrayMethods();
        int[] arr = am.arrayInput(size);
        int[] arrMS = divide(arr, 0, size-1);
        System.out.println("Array sorted by merge sort algorithm: ");
        am.printArray(arrMS, size);
        sc.close();
    }

}