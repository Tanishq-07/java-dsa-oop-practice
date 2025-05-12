import java.util.Arrays;

public class Leet645 {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i=0;
        int j=nums.length -1 ;
        int[] ans = new int[2];
        while (i<nums.length){
            int correct = nums[i]-1 ;
            if(nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else i++ ;
        }
        while(j>=0){
            if(nums[j] !=j+1){
                ans[0] = nums[j];
                ans[1] = j+1 ;
                j-- ;
            }
            else j-- ;
        }
        return ans ;
    }
    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[correct];
        nums[correct] = nums[i];
        nums[i] = temp ;
    }
}
