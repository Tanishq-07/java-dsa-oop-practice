import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter How many terms you want to print ");
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt() ;
        int a = 0, b = 1 ;
        System.out.print(0 + " ");
        for(int i =1; i< n; i++) {
            int sum = a+b ;
            System.out.print(sum + " ");
            a = b ;
            b = sum;
        }
    }
}
