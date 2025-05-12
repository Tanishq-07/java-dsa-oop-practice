import java.util.Scanner;

public class PracBS {
    public static void main(String[] args) {
        int target ;
        Scanner in = new Scanner(System.in) ;
        target = in.nextInt() ;
        int[] arr = {1, 3, 5, 6} ;
        int start = 0 ;
        int end = arr.length-1 ;
        int middle = start + (end - start)/2 ;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[middle]< target ){
                start += 1 ;
            } else if (arr[middle]> target) {
                end -= 1 ;
            }
            else {

            }

        }
    }
}
