import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int add(int a, int b){
        return (a+b) ;
    }
    public static void main(String[] args) {
        int a, b ;
        System.out.println("Enter the two Numbers");
        Scanner in = new Scanner(System.in) ;
        a = in.nextInt() ;
        b = in.nextInt() ;

        int sum = add(a,b) ;

        System.out.println("The sum of two number is "+ sum);

    }
}