import java.util.Arrays;

public class Leet41 {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        int j=0 ;
        while (i<nums.length){

            int correct = nums[i]-1 ;
            if( nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else i++ ;
        }
        System.out.println(Arrays.toString(nums));
        while(j< nums.length){
            if(nums[j] !=j+1){
                return j+1 ;
            }
            else j++ ;
        }
        return nums.length+1 ;
    }
    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[correct];
        nums[correct] = nums[i];
        nums[i] = temp ;
    }
}
