package cn.arrays;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3 ;
        int n = nums.length;
        int a = n-k ;
        int[] ans = new int[nums.length];
        int i = 0 ;
        while(i<nums.length){
            if(a>=n){
                a = 0 ;
            }
            ans[i] = nums[a];
            i++ ;
            a++ ;
        }
        for(int j=0; j<n; j++){
            nums[j] = ans[j];
        }
        System.out.println(Arrays.toString(nums));
    }

}
