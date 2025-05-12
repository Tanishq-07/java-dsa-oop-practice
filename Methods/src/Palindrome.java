import java.util.Scanner;

public class Palindrome {
    static void palcheck(int n) {
        int ans = 0 ;
        int rem ;
        int temp = n ;
        while(n>0){
             rem = n%10 ;
            ans = (ans*10) + rem ;
            n = n/10 ;
        }

        if (temp== ans) {
            System.out.println("Entered number is Palindrome" );
        }
        else {
            System.out.println("Entered number is not Palindrome");
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        palcheck(n);

    }
}
