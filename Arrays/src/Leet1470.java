import java.util.Arrays;

public class Leet1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7} ;
        int[] arr = new int[nums.length/2] ;
        int[] arr2 = new int[nums.length/2] ;
        int a = nums.length/2 ;
        for(int i = 0;i<a ; i++){
            arr[i]=nums[a+i];
            arr2[i]=nums[i];
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0; j<a; j++){
            nums[2*j+1] = arr[j];
            nums[2*j] = arr2[j];
        }
        System.out.println(Arrays.toString(nums));
    }
}
