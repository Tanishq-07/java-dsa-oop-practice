package cn.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr1[] = {1,4,8,10,13,17};
        int arr2[] = {2,3,5,7,9,11,12};
        System.out.println(Arrays.toString(merge2SortedArray(arr1,arr2)));
    }

    public static int[] merge2SortedArray(int[] a1, int[] a2){
        int m = a1.length;
        int n = a2.length;
        int[] a3 = new int[m+n];

        int i=0, j=0, k=0 ;

        while(i<m && j<n){
            if(a2[j] >= a1[i]){
                a3[k] = a1[i];
                i++ ;
                k++;
            }else {
                a3[k] = a2[j] ;
                j++;
                k++;
            }
        }

        while (i<m){
            a3[k] = a1[i];
            i++;
            k++;
        }

        while (j<m){
            a3[k] = a1[j];
            j++;
            k++;
        }

        return a3;
    }
}
