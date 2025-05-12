import java.util.Scanner;

public class Largest2 {
    public static void main(String[] args) {
        int n ;
        int max = 0 ;
        do {
            System.out.println("Enter the numbers");
            Scanner in = new Scanner(System.in) ;
            n = in.nextInt() ;
            if(n>max) {
                max = n ;
            }
        }while(n !=0) ;
        System.out.println("Largest number is :"+ max);
    }
}
