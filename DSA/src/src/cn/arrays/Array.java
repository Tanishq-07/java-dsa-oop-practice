package cn.arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,42,13,9,-54,17};
        System.out.println("Largest element in array is "+max(arr));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
