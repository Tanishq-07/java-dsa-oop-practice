import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int  n ;
        System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in) ;
        n = in.nextInt() ;
        for(int i = 2; i<n; i++ ){
            if(n%i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
