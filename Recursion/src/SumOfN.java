import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(sum(n));
    }
    public static int sum( int n){
        if(n==0){
            return 0 ;
        }
        else if (n==1){
            return 1 ;
        } else if (n>0) {
            return (n+sum(n-1)) ;
        }
        return -1;
    }
}
