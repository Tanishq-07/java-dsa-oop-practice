import java.sql.Array;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        shift(nums,3) ;
        System.out.println(Arrays.toString(nums));
    }
    public static void shift(int[] nums, int k){
        int[] arr = new int[nums.length];

        for (int i = 0; i < arr.length; i++) {
            if((i+k)<=nums.length-1){
                nums[i+k] = arr[i];
            }
            else nums[((i+k) - arr.length)] = nums[i];
        }
    }

}
 /*
    One Possible Solution
    public int count = 0 ;
    public int[] shift(int[] nums, int k){
        if(count==k){
            return nums;
        }
        int temp = nums[nums.length-1] ;
        for(int i= nums.length-1; i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp ;
        count++ ;
        return shift(nums, k);
    }
     */