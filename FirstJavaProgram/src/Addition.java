import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Enter two Numbers");
        Scanner input = new Scanner(System.in) ;
        int n1 = input.nextInt() ;
        int n2 = input.nextInt() ;

        int sum = n1 + n2 ;

        System.out.println("The Sum of is " + sum ) ;
    }
}
