import java.util.Scanner;

public class BinSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48} ;
        int target ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target element");
        target = in.nextInt();
        int get = search(arr, target) ;
        System.out.println(get);
        if (get == target){
            System.out.println("Element Found");
        }
        else
            System.out.println("Not Found");
    }

    public static int search(int[] arr, int n){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int middle = start + (end-start)/2 ;
            if (arr[middle]==n){
                return n ;
            } else if (arr[middle]>n) {
                end = middle-1 ;
            }
            else {
                start = middle+1 ;
            }
        }
        return arr[start] ;
    }
}
