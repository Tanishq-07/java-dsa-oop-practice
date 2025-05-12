public class Prac {
    static int[] nums = {1,2,3,4} ;

    public static void main() {
        int[] arr = runningSum(nums) ;
        System.out.println(arr);
    }
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            runningSum[i] = sum(i) ;
        }
        return runningSum ;
    }

    static int sum(int a){
        int add = 0 ;
        for(int i=0; i<a;i++){
            add = add + nums[i] ;
        }
        return add ;
    }
}
