import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        int n ;
        n = 1 ;
        Scanner in = new Scanner(System.in) ;
        int max = in.nextInt() ;
        message(n,max);
    }

    private static void message(int n, int max) {
        System.out.println(n);
        if(n+1 <=max){
            message(n+1,max);
        }
    }
}
