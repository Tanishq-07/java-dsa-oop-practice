package cn.searching.binarySearch;

public class SrchInRotArry {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int s = findPivot(nums);
        if(s == -1){
            return binSearch(nums,target,0, nums.length-1);
        }else {
            if(nums[s]==target){
                return s ;
            }else if(target>=nums[0]){
                return binSearch(nums,target,0,s-1);
            }else {
                return binSearch(nums,target,s+1,nums.length-1);
            }
        }
    }

    public static int findPivot(int[] nums){
        int s = 0 ;
        int e = nums.length -1 ;
        while(s<=e){
            int m = s + (e-s)/2 ;
            if(m<e && nums[m]>nums[m+1]){
                return m ;
            }
            if(m>s && nums[m]<nums[m-1]){
                return m-1 ;
            }
            if(nums[s]>=nums[m]){
                e = m-1;
            }else {
                s = m+1 ;
            }
        }
        return -1 ;
    }

    public static int binSearch(int[] arr, int target, int s, int e){
        while (s<=e){
            int mid = (e-s)/2+s ;
            if(arr[mid] == target){
                return mid;
            }else if(target<arr[mid]){
                e = mid -1 ;
            }else {
                s = mid + 1;
            }
        }
        return -1 ;
    }
}
