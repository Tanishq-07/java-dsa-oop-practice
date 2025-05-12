import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {4,5,45,1,12};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int[] arr1 = new int[arr.length] ;
        int length = arr.length;
        int i = 0 ;
        while(i<arr.length){
            arr1[i] = arr[length-1];
            i++;
            length-- ;
        }
        return arr1;
    }
}
