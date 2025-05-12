public class SumOfDigits {
    public static void main(String[] args) {
        int n= 1324;
        System.out.println(sumdigits(n));
    }
    public static int sumdigits(int n){
        if(n<=0){
            return 0;
        }
        return (n%10)+sumdigits(n/10);
    }
}
