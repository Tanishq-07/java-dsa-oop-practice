public class Leet1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3} ;
        int i =0;
        int j =i+1;
        int good = 0 ;

        while(i< nums.length-1){
            while(j<nums.length){
                if(nums[i] == nums[j]){
                    // good.add()
                    good += 1 ;
                }
                j++ ;
            }
            i++ ;
        }
        System.out.println(good);
    }
}
