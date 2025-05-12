import java.util.Arrays;

public class Leet1480 {
    static int[] nums = {3,1,2,10,1} ;

    public static void main(String[] args) {
        int[] runningSum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            runningSum[i] = sum(i) ;
        }
        System.out.println(Arrays.toString(runningSum));
    }

    static int sum(int a){
        int add = 0 ;
        for(int i=0; i<=a;i++){
            add += nums[i] ;
        }
        return add ;
    }
}
