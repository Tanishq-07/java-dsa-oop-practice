import java.util.Arrays;

public class Leet1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9 ;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = {-1,-1} ;
        for(int i = 0;i<nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++ ){
                if(nums[i]+nums[j] == target){
                    ans[0] = i ;
                    ans[1] = j ;
                }
            }
        }
        return ans ;
    }
}
