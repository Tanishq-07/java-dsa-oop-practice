public class FindInDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int ans = 0;
        for (int j : arr) {
            ans ^= j;
        }
        System.out.println(ans);
    }
}
