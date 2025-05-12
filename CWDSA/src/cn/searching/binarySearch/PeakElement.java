package cn.searching.binarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int start = 0 ;
        int end = nums.length-1;
        while(start<end){
            int middle = start + (end-start)/2 ;
            if(nums[middle]<nums[middle+1]){
                start = middle+1;
            }else{
                end = middle;
            }
        }
        return nums[start] ;
    }
}
