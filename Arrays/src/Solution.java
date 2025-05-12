import java.util.Arrays;

public class Solution {
    public static int[] nums = {1,2,3,4} ;

    static int sum(int a){
        int add = 0 ;
        for(int i=0; i<=a;i++){
            add = add + nums[i] ;
        }
        return add ;
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            runningSum[i] = sum(i) ;
        }
        return runningSum ;
    }
    public static void main(String[] args){
        int[] arr = runningSum(nums);
        System.out.println(Arrays.toString(arr));
    }
}
