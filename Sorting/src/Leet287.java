import java.util.Arrays;

public class Leet287 {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
    public  static int findDuplicate(int[] nums) {
        int i = 0 ;
        while (i<nums.length){
            int correct = nums[i]-1 ;
            if(nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else i++ ;
        }
        return nums[nums.length-1] ;
    }

    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[correct];
        nums[correct] = nums[i];
        nums[i] = temp ;
    }
}
