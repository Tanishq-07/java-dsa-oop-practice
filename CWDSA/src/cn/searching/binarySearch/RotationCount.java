package cn.searching.binarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] nums = {7,9,11,12,15};
        System.out.println(findCount(nums));
    }

    public static int findCount(int[] nums){
        int s = 0 ;
        int e = nums.length-1;
        int count = 0 ;
        if(nums[s]<nums[e]){
            return count ;
        }
        while(s<e){
            int m = s + (e-s)/2 ;
            if(m<e &&nums[m]>nums[m+1]){
                return m+1 ;
            }
            if(m>s && nums[m]<nums[m-1]){
                return m ;
            }
            if(nums[m]<=nums[s]){
                e =m-1;
            }else {
                s = m+1 ;
            }
        }
        count = s+1 ;
        return count ;
    }
}
