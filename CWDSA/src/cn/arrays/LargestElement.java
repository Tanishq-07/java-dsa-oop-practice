package cn.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1,412,5232,522,62,};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
