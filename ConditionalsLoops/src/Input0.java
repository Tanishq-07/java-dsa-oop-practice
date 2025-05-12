import java.util.Scanner;

public class Input0 {
    public static void main(String[] args) {
        int n ;
        int sum = 0 ;
        do {
            System.out.println("Enter an Integer");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            sum += n ;

        } while(n !=0) ;

        System.out.println(sum);


    }
}
