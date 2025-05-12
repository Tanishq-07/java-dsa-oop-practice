package cn.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,0,4,2,7,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int mIndex = i ;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<min){
                    min = arr[j];
                    mIndex = j ;
                }
            }
            swap(arr,i,mIndex);
        }
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
