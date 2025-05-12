import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter How many times You wants to print ");
        Scanner in = new Scanner(System.in) ;
        n = in.nextInt() ;
        int i = 0 ;
        while (i != n ) {
            System.out.println("Hey it's " + i + "!" );
            i++ ;
        }
    }
}
