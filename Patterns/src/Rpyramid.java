import java.util.Scanner;

public class Rpyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int middle ;
        if(n%2==0){
            middle = n/2 ;
        }
        else middle = (n+1)/2 ;
        for (int i = 0; i < middle; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = middle; i < n; i++) {
            for (int b = 1; b<n-i; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
