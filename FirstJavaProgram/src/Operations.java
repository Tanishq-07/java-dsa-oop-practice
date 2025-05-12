import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        float a, b ;
        System.out.println("Enter Two Numbers ");
        Scanner input = new Scanner(System.in) ;
        a = input.nextFloat() ;
        b = input.nextFloat() ;
        float sum = a+b ;
        float subtraction = a-b ;
        float multiply = a*b ;
        float division = a/b ;
        System.out.println("Addition : " + sum );
        System.out.println("Subtraction : " + subtraction);
        System.out.println("Multiplication ; " + multiply);
        System.out.println("Division : " + division);

    }
}
