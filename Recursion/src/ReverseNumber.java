public class ReverseNumber {
    public static int sum = 0;
    public static int Reverse(int n) {
        if(n==0){
            return 0;
        }
        int rem = n%10 ;
        sum = sum*10 + rem ;
        return Reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 2431;
        Reverse(n) ;
        System.out.println(sum);
    }
}