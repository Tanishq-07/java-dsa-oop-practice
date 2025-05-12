import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        int a,b,c ;
        System.out.println("Enter three Numbers ");
        Scanner in = new Scanner(System.in) ;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int max = Math.max(c, Math.max(a,b)) ;
        System.out.println(max + " is the Largest Number ");
    }
}
