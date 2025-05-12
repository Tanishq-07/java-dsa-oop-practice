import java.util.Scanner;

public class Swap {
    static void swap(int a, int b){
        a = a-b ;
        b = a+b ; // Here 'b' points to a (b->a)
        a = b-a ; //   a-(a-b)-> b

        System.out.println("a = "+a+"\nb = "+b);
    }

    public static void main(String[] args) {
        int a,b ;
        System.out.println("Enter the two Numbers");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        swap(a,b);
    }
}
