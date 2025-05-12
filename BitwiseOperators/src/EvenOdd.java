import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if((n&1) == 1){
            System.out.println("ODD");
        }
        else System.out.println("Even");
    }
}
