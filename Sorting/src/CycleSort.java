import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,6,5,4,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int i = 0 ;
        while (i<arr.length){
            int correct = arr[i]-1 ;
            if(arr[i] != arr[correct]){
                swap(arr,correct,i);
            }
            else i++ ;
        }
        return arr ;
    }

    private static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp ;
    }
}
