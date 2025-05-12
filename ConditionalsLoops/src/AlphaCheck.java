import java.util.Scanner;

public class AlphaCheck {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet");
        char ch ;
        Scanner in = new Scanner(System.in) ;
        ch = in.next().trim().charAt(0) ;

        if(ch >='a' && ch <= 'z') {
            System.out.println("Input Alphabet is Lowercase");
        }
        else {
            System.out.println("Input Alphabet is Uppercase");
        }
    }
}
