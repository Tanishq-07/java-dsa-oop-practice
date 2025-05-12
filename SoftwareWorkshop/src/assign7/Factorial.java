package assign7;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num ;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.println("Factorial of "+num+" is "+fact(num));

    }

    public static int fact(int n){
        if(n==0 || n==1){
            return 1 ;
        }
        return n*fact(n-1);
    }
}

