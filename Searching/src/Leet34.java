import java.util.Arrays;

public class Leet34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10} ;
        int target = 5 ;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true ) ;
        ans[1] = search(nums, target, false) ;
        return ans ;
    }
    static int search(int[] nums, int target, boolean firstStartIndex){
        int ans = -1 ;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] < target) {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                //Potential answer is found
                ans = middle ;
                if(firstStartIndex){
                    end = middle-1 ;
                }
                else {
                    start = middle +1 ;
                }
            }
        }
        return ans ;
    }
}
