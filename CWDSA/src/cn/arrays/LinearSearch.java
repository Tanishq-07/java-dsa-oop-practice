package cn.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,412,5232,522,62,};
        int target = 34;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
