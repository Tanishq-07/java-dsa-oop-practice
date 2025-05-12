import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={2,3,5,9,14,16,18} ;
        Scanner in = new Scanner(System.in) ;
        System.out.println("Enter the target element");
        int target = in.nextInt() ;
        int ceiling = get(arr, target);
        System.out.println(ceiling);
    }

    public static int get(int[] arr, int x){
        int start = 0 ;
        int end = arr.length-1 ;
        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]<x){
                start = mid+1 ;
            } else if (arr[mid]>x) {
                end = mid-1 ;
            }
            else {
                return arr[mid] ;
            }
        }
        if(end == arr.length-1){
            return -1;
        }
        else return arr[start] ;
    }
}
