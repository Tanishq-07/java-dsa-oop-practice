import java.util.Scanner;

public class Prime {
    static int prime(int n){
        for(int i=2; i<n; i++){
            if(n%i != 0){
                System.out.println("Entered number is a Prime");
                break;

            }
            else {
                System.out.println("Entered Number is Non-Prime");
                break ;

            }
        }
        return 0 ;
    }

    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the number ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt() ;
        int prime = prime(n) ;
    }

}
