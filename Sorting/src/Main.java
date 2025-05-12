import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2} ;
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        boolean swapped = false ;
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j] ;
                    arr[j] = temp ;
                    swapped = true ;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr ;
    }
}