import java.util.Scanner;

public class SumofN {
    static int sum(int n){
        if(n>0){
            return n + sum(n-1);
        }
        else {
            return 0 ;
        }
    }

    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the Number ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int sum = sum(n);
        if(sum == 0){
            System.out.println("Enter the valid number");
        }
        else {
            System.out.println(sum);
        }
    }
}
