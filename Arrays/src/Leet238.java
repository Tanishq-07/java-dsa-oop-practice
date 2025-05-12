import java.util.Arrays;

public class Leet238 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int[] answer = new int[nums.length];
        for(int i=0; i<answer.length;i++){
            answer[i] = product(nums,i) ; // Time Complexity : O(N^2)
        }
        System.out.println(Arrays.toString(answer));
    }
    public static int product(int[] nums, int index){
        int temp = nums[index] ;
        nums[index] = 1 ;
        int ans = 1 ;
        for(int i=0;i<nums.length;i++){
            ans *= nums[i] ;
        }
        nums[index] =temp ;
        return ans ;
    }
}

/*  Another Solution :
    int n = nums.length;
        int[] res = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++)
            res[i] = 1;

        for (int i = 0; i < n; i++){
            res[i] = product;
            product *= nums[i];
        }
        product = 1;
        for (int i = n - 1; i > -1; i--){
            res[i] *= product;
            product *= nums[i];
        }
        return res;
    }
}

 */