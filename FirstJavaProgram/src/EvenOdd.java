import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        float a ;
        System.out.println("Enter the number ");
        Scanner input = new Scanner(System.in) ;
        a = input.nextFloat() ;
        if(a%2 == 0) {
            System.out.println(a + " is an Even Number ");
        }

        else {
            System.out.println( a +" is a Odd Number");
        }

    }
}
