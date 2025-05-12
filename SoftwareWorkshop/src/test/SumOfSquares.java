package test;

public class SumOfSquares {
    public static void main(String[] args) {
        System.out.println(sum(-5));
    }
    public static int sum(int n){
        int ans = -1 ;
        int sum = 0 ;
        for (int i = 0; i <=n; i++) {
            sum += i*i ;
            ans = sum ;
        }

        return ans ;
    }
}
