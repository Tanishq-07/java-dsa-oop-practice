import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt() ;
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if(n==0){
            return 1 ;
        }
        else if (n>0) {
            return (n * factorial(n - 1));
        }
        return -1 ;
    }
}