import java.util.ArrayList;
import java.util.List;

public class Leet448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int i = 0 ;
        while (i<nums.length){
            int correct = nums[i]-1 ;
            if(nums[i] != nums[correct]){
                swap(nums,correct,i);
            }
            else i++ ;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                list.add(j+1) ;
            }
        }
        return list ;
    }

    public static void swap(int[] nums, int correct, int i) {
        int temp = nums[correct];
        nums[correct] = nums[i];
        nums[i] = temp ;
    }
}
