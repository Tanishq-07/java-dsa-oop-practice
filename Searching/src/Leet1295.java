public class Leet1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,46,-21};
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];
            while(j !=0){
                int i1 = count++;
                j = j/10 ;
            }
            if(count%2 == 0) {
                ans += 1;
            }
            count = 0;
        }
        System.out.println(ans);
    }
}
