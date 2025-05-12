public class Leet268 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int i = 0;
        while (i<nums.length){
            int correct = nums[i] ;
            if( nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else i++ ;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j ;
            }
        }
        return nums.length ;
    }
    private static void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp ;
    }
}
