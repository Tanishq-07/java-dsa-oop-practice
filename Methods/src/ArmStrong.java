import java.util.Scanner;

public class ArmStrong {
    static boolean check(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem * rem * rem;
        }
        return sum == original;
    }

    static void print(){
        for(int i = 100; i<1000; i++){
            if(check(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter the number to be checked");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            boolean ans = check(n);
        System.out.println(ans);
    }
}
