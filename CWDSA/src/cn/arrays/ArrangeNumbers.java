package cn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbers {
    public static void main(String[] args) {
        int N ;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int[] arr = new int[N];
        int n = 1;
        int index = 0 ;
        for (int i = 0; i < N; i++) {
            if(isOdd(n)){
                arr[i] = n ;

                index++;
            }
        }
        for (int i = index; i <N; i++) {

        }
    }
    public static boolean isOdd(int n){
        if (n%2==0){
            return false ;
        }
        return true ;
    }
}
