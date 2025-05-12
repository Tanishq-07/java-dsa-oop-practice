import java.util.Scanner;

public class StringReturn {
    public static String Greet(){
        return "Koi BKL he hoga jisne IET choose kara " ;
    }

    public static void main(String[] args) {
        int n ;
        System.out.println("Enter your Favourite Number ");
        Scanner in = new Scanner(System.in) ;
        n = in.nextInt() ;

        if(n ==7){
           String greet = Greet() ;
            System.out.println(greet);
        }
        else {
            System.out.println("Tu BKL he hai");
        }
    }
}
