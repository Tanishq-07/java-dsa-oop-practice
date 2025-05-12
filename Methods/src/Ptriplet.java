import java.util.Scanner;

public class Ptriplet {
    public static void main(String[] args) {
        int p,b,h ;
        System.out.println("Enter all three sides of triangle in sequence as 'P,B,H ");
        Scanner in = new Scanner(System.in) ;
        p= in.nextInt();
        b= in.nextInt();
        h= in.nextInt();

        check(p,b,h);

    }
    static void check(int p, int b, int h){
        int psq = p*p ;
        int bsq = b*b ;
        int hsq = h*h ;

        if(hsq == (bsq+psq)){
            System.out.println("Input sides are of Right-Angled Triangle");
        }
        else {
            System.out.println("Input sides are not of Right-Angled Triangle");
        }
    }
}
