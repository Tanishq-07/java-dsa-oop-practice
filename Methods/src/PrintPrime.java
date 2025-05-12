import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        int a, b ;
        System.out.println("Enter two numbers");
        Scanner in = new Scanner(System.in);
        a = in.nextInt() ;
        b = in.nextInt() ;
        prime(a,b);
    }

    static void prime(int a, int b) {
        for(int i=a; i<b; i++){
            for(int j = 2; j<i; j++){
                if(i%j ==0){
                    break ;
                }
                else {
                    System.out.print(i+" ");
                }
                break ;
            }
        }
    }
}
