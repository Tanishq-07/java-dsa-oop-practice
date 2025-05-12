public class FirstSetBit {
    public static void main(String[] args) {
        int n = 32 ;
        int a = 1 ;
        int i = 0 ;
        int ans = 1 ;
        while (i<n){
            if((n&(a<<i))==(a<<i)) {
                break;
            }
            else
            {
                ans++ ;
                i++ ;
            }
        }
        System.out.println(ans);
    }
}
