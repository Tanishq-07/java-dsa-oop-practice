package cn.searching.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,7,9,11,12,45};
        System.out.println(search(arr,2));
    }

    public static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = (e-s)/2+s ;
            if(arr[mid] == target){
                return mid;
            }else if(target<arr[mid]){
                e = mid -1 ;
            }else {
                s = mid + 1;
            }
        }
        return -1 ;
    }
}
