import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {5,45,12,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
    }

    static void change(int[] nums){
        nums[0] = 85 ;
        System.out.println(Arrays.toString(nums));
    }
}
