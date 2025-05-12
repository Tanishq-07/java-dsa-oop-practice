import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        System.out.println("Enter the number and what digit you wants to count");
        Scanner in = new Scanner(System.in) ;
        int a = in.nextInt() ;
        int b = in.nextInt() ;
        int count = 0 ;
        while (a>0) {
            int rem = a % 10 ;
            if(rem == b ){
                count ++ ;
            }
                a = a / 10 ;
        }
        System.out.println(count);

    }
}
