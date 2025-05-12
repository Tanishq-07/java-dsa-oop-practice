import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in) ;
        n = in.nextInt() ;
        int Fact = 1 ;
        for(int i=n; i>=1; i--){
            Fact *= i ;
        }
        System.out.println("Factorial of "+n+" is "+ Fact);
    }
}
