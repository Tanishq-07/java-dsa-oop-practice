import java.lang.reflect.Array;
import java.util.Arrays;

// In JAVA there is only Passing by Value

public class PassingInFunction {
    public static void main(String[] args) {
        int[] arr = {10,45,18,7,99} ;
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[2] = 69 ;
    }
}
