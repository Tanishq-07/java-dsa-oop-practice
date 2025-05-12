public class BinSearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 13 ;
        int start = 0 ;
        int end = nums.length-1 ;

        System.out.println(search(nums,target,start,end));
    }

    private static int search(int[] nums, int target, int start, int end) {
        int middle = start + (end - start)/2 ;
        if(start>end){
            return -1;
        }
        if(nums[middle] == target && start<=end){
            return middle ;
        }
        else if(start<=end && nums[middle]>target){
            return search(nums,target,start,middle-1);
        } else if (start<=end && nums[middle]<target) {
            return search(nums,target,middle+1,end);
        }
        return -1 ;
    }
}
