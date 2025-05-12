import java.util.Arrays;

public class PnC {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4} ;
        int[] arr = new int[nums.length];
        for(int i = 0; i<=nums.length-1; i++){
            arr[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(arr));
    }
}


// Output = [0,1,2,4,5,3]
