package cn.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {9,6,3,7,2,8,1,5};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp ; // Here inserting the selected element at it correct index in sorting part;
        }
    }
}