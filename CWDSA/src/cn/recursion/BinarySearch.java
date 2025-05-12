package cn.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,4,6,8,9};
        System.out.println(binSearch(nums,0,0,nums.length-1));
    }
    // Implementing binary search through recursion.
    public static int binSearch(int[] nums,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2 ;
        if(nums[m]==target){
            return m ;
        }else if(target<nums[m]){
            return binSearch(nums,target,s,m-1);
        }else {
            return binSearch(nums,target,m+1,e);
        }
    }
}
