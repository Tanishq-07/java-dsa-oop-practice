import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in) ;
        n = in.nextInt() ;
        System.out.println(fibonacci(n));
    }
    public static int fibonacci( int n){
        if(n<0){
            return -1 ;
        }
        if(n==0){
            return 0 ;
        }
        if(n==1){
            return 1 ;
        }
        if(n>0){
            return (fibonacci(n-1)+fibonacci(n-2)) ;
        }
        return 0 ;
    }
}
