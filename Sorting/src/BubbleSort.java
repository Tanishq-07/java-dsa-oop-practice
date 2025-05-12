import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,2,4,6,20,15};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
    }
    static void bubble(int[] arr){
        // run the steps n-1 times
        boolean swapped ;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false ;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                    swapped = true ;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
