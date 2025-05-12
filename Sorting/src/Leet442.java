import java.util.ArrayList;

public class Leet442 {
    public static void main(String[] args) {
        int[] nums = {2,2} ;
        System.out.println(findDuplicates(nums));
    }
    public static ArrayList<Integer> findDuplicates(int[] nums) {
        int i = 0 ;
        int j = nums.length-1;
        ArrayList<Integer> list = new ArrayList<>(10);

        while (i<nums.length){
            int correct = nums[i]-1 ;
            if(nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else i++ ;
        }
        while(j>=0){
            if(nums[j] !=j+1){
                list.add(nums[j]);
                j-- ;
            }
            else j-- ;
        }
        return list ;
    }
    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[correct];
        nums[correct] = nums[i];
        nums[i] = temp ;
    }
}
